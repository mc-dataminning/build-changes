import com.mojang.serialization.MapCodec;

public class ejy extends ekn {
   public static final MapCodec<ejy> a = bqu.b(0, 256).fieldOf("count").xmap(ejy::new, $$0 -> $$0.c);
   private final bqu c;

   private ejy(bqu $$0) {
      this.c = $$0;
   }

   public static ejy a(bqu $$0) {
      return new ejy($$0);
   }

   public static ejy a(int $$0) {
      return a(bqr.a($$0));
   }

   @Override
   protected int a(azl $$0, je $$1) {
      return this.c.a($$0);
   }

   @Override
   public ekk<?> b() {
      return ekk.f;
   }
}
