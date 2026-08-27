import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ego extends efx {
   public static final Codec<ego> a = RecordCodecBuilder.create($$0 -> a($$0).and(jy.j.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, ego::new));
   private final ib<cmy> b;

   private ego(List<ehk> $$0, ib<cmy> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public efz b() {
      return ega.z;
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      cna.a($$0, this.b.a());
      return $$0;
   }

   public static efx.a<?> a(cmy $$0) {
      return a($$1 -> new ego($$1, $$0.c()));
   }
}
