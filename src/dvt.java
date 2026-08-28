import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvt(ji<dvs> e, dtx f) {
   public static final Codec<dvt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvs.j.fieldOf("type").forGetter(dvt::a), dtx.a.fieldOf("generator").forGetter(dvt::b)).apply($$0, $$0.stable(dvt::new))
   );
   public static final ald<dvt> b = ald.a(lq.aT, new ale("overworld"));
   public static final ald<dvt> c = ald.a(lq.aT, new ale("the_nether"));
   public static final ald<dvt> d = ald.a(lq.aT, new ale("the_end"));

   public ji<dvs> a() {
      return this.e;
   }

   public dtx b() {
      return this.f;
   }
}
