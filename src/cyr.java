import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyr extends cva implements dca {
   public static final MapCodec<cyr> a = b(cyr::new);
   private static final dhz c = dhy.C;
   protected static final ekn b = cva.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<cyr> a() {
      return a;
   }

   protected cyr(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(c) ? ect.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = super.a($$0);
      if ($$1 != null) {
         ecs $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == ect.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      ht $$3 = $$2.c();
      dhi $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, hx.a);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$1 == hx.b && !this.a($$0, $$3, $$4)) {
         return cvc.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ect.c, ect.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
