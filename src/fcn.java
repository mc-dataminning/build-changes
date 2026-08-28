import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fcn(fde b) implements fci {
   public static final MapCodec<fcn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fdf.a.fieldOf("chance").forGetter(fcn::c)).apply($$0, fcn::new));

   @Override
   public fcj b() {
      return fck.d;
   }

   public boolean a(eyz $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static fci.a a(float $$0) {
      return () -> new fcn(fdb.a($$0));
   }

   public static fci.a a(fde $$0) {
      return () -> new fcn($$0);
   }

   public fde c() {
      return this.b;
   }
}
