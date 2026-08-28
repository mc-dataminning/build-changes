import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvv(ji<dvu> e, dtz f) {
   public static final Codec<dvv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvu.j.fieldOf("type").forGetter(dvv::a), dtz.a.fieldOf("generator").forGetter(dvv::b)).apply($$0, $$0.stable(dvv::new))
   );
   public static final ale<dvv> b = ale.a(lq.aT, new alf("overworld"));
   public static final ale<dvv> c = ale.a(lq.aT, new alf("the_nether"));
   public static final ale<dvv> d = ale.a(lq.aT, new alf("the_end"));

   public ji<dvu> a() {
      return this.e;
   }

   public dtz b() {
      return this.f;
   }
}
