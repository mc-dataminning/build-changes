import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fdx(feo b) implements fds {
   public static final MapCodec<fdx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fep.a.fieldOf("chance").forGetter(fdx::c)).apply($$0, fdx::new));

   @Override
   public fdt b() {
      return fdu.d;
   }

   public boolean a(faj $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static fds.a a(float $$0) {
      return () -> new fdx(fel.a($$0));
   }

   public static fds.a a(feo $$0) {
      return () -> new fdx($$0);
   }

   public feo c() {
      return this.b;
   }
}
