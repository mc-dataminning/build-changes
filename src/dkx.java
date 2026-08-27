import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dkx(ig<dkw> e, djk f) {
   public static final Codec<dkx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkw.j.fieldOf("type").forGetter(dkx::a), djk.a.fieldOf("generator").forGetter(dkx::b)).apply($$0, $$0.stable(dkx::new))
   );
   public static final agl<dkx> b = agl.a(kd.aK, new agm("overworld"));
   public static final agl<dkx> c = agl.a(kd.aK, new agm("the_nether"));
   public static final agl<dkx> d = agl.a(kd.aK, new agm("the_end"));

   public ig<dkw> a() {
      return this.e;
   }

   public djk b() {
      return this.f;
   }
}
