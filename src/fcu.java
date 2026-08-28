import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcu(fcx b) implements fcx {
   public static final MapCodec<fcu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fcx.e.fieldOf("term").forGetter(fcu::c)).apply($$0, fcu::new));

   @Override
   public fcy b() {
      return fcz.a;
   }

   public boolean a(ezo $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ezu $$0) {
      fcx.super.a($$0);
      this.b.a($$0);
   }

   public static fcx.a a(fcx.a $$0) {
      fcu $$1 = new fcu($$0.build());
      return () -> $$1;
   }

   public fcx c() {
      return this.b;
   }
}
