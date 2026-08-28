import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvx(ji<dvw> e, dub f) {
   public static final Codec<dvx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvw.j.fieldOf("type").forGetter(dvx::a), dub.a.fieldOf("generator").forGetter(dvx::b)).apply($$0, $$0.stable(dvx::new))
   );
   public static final ale<dvx> b = ale.a(lq.aT, new alf("overworld"));
   public static final ale<dvx> c = ale.a(lq.aT, new alf("the_nether"));
   public static final ale<dvx> d = ale.a(lq.aT, new alf("the_end"));

   public ji<dvw> a() {
      return this.e;
   }

   public dub b() {
      return this.f;
   }
}
