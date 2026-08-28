import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvw(ji<dvv> e, dua f) {
   public static final Codec<dvw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvv.j.fieldOf("type").forGetter(dvw::a), dua.a.fieldOf("generator").forGetter(dvw::b)).apply($$0, $$0.stable(dvw::new))
   );
   public static final ale<dvw> b = ale.a(lq.aT, new alf("overworld"));
   public static final ale<dvw> c = ale.a(lq.aT, new alf("the_nether"));
   public static final ale<dvw> d = ale.a(lq.aT, new alf("the_end"));

   public ji<dvv> a() {
      return this.e;
   }

   public dua b() {
      return this.f;
   }
}
