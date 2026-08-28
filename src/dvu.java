import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvu(ji<dvt> e, dty f) {
   public static final Codec<dvu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvt.j.fieldOf("type").forGetter(dvu::a), dty.a.fieldOf("generator").forGetter(dvu::b)).apply($$0, $$0.stable(dvu::new))
   );
   public static final ald<dvu> b = ald.a(lq.aT, new ale("overworld"));
   public static final ald<dvu> c = ald.a(lq.aT, new ale("the_nether"));
   public static final ald<dvu> d = ald.a(lq.aT, new ale("the_end"));

   public ji<dvt> a() {
      return this.e;
   }

   public dty b() {
      return this.f;
   }
}
