import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fdc(fdt b) implements fcx {
   public static final MapCodec<fdc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fdu.a.fieldOf("chance").forGetter(fdc::c)).apply($$0, fdc::new));

   @Override
   public fcy b() {
      return fcz.d;
   }

   public boolean a(ezo $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static fcx.a a(float $$0) {
      return () -> new fdc(fdq.a($$0));
   }

   public static fcx.a a(fdt $$0) {
      return () -> new fdc($$0);
   }

   public fdt c() {
      return this.b;
   }
}
