import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcz(fdc b) implements fdc {
   public static final MapCodec<fcz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fdc.e.fieldOf("term").forGetter(fcz::c)).apply($$0, fcz::new));

   @Override
   public fdd b() {
      return fde.a;
   }

   public boolean a(ezt $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ezz $$0) {
      fdc.super.a($$0);
      this.b.a($$0);
   }

   public static fdc.a a(fdc.a $$0) {
      fcz $$1 = new fcz($$0.build());
      return () -> $$1;
   }

   public fdc c() {
      return this.b;
   }
}
