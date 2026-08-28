import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqy extends dmm implements dtx {
   public static final MapCodec<dqy> a = b(dqy::new);
   public static final ebf b = ebe.m;
   public static final ebf c = ebe.I;
   private static final ffr d = ffo.a(dmm.b(4.0, 7.0, 9.0), dmm.b(6.0, 0.0, 7.0));
   private static final ffr e = d.a(0.0, 0.0625, 0.0).d();

   @Override
   public MapCodec<dqy> a() {
      return a;
   }

   public dqy(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());

      for (jb $$2 : $$0.f()) {
         if ($$2.o() == jb.a.b) {
            eao $$3 = this.m().b(b, Boolean.valueOf($$2 == jb.b));
            if ($$3.a((djk)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == eww.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      jb $$3 = o($$0).g();
      return dmm.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jb o(eao $$0) {
      return $$0.c(b) ? jb.a : jb.b;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(c) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
