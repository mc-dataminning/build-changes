import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czg extends cva implements dca {
   public static final MapCodec<czg> a = b(czg::new);
   public static final dhz b = dhy.j;
   public static final dhz c = dhy.C;
   protected static final ekn d = ekk.a(cva.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), cva.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ekn e = ekk.a(cva.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), cva.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<czg> a() {
      return a;
   }

   public czg(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      ecs $$1 = $$0.q().b_($$0.a());

      for (hx $$2 : $$0.f()) {
         if ($$2.o() == hx.a.b) {
            dhi $$3 = this.o().a(b, Boolean.valueOf($$2 == hx.b));
            if ($$3.a((csd)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == ect.c));
            }
         }
      }

      return null;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      hx $$3 = h($$0).g();
      return cva.a($$1, $$2.a($$3), $$3.g());
   }

   protected static hx h(dhi $$0) {
      return $$0.c(b) ? hx.a : hx.b;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(c) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
