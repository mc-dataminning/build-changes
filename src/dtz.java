import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtz extends dmm implements dtx {
   public static final MapCodec<dtz> a = b(dtz::new);
   public static final ebm<ebw> b = ebe.bk;
   public static final ebf c = ebe.I;
   private static final ffr d = dmm.b(16.0, 0.0, 8.0);
   private static final ffr e = dmm.b(16.0, 8.0, 16.0);

   @Override
   public MapCodec<? extends dtz> a() {
      return a;
   }

   public dtz(ean.d $$0) {
      super($$0);
      this.l(this.m().b(b, ebw.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(eao $$0) {
      return $$0.c(b) != ebw.c;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return switch ((ebw)$$0.c(b)) {
         case a -> e;
         case b -> d;
         case c -> ffo.b();
      };
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      iv $$1 = $$0.a();
      eao $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, ebw.c).b(c, Boolean.valueOf(false));
      } else {
         ewv $$3 = $$0.q().b_($$1);
         eao $$4 = this.m().b(b, ebw.b).b(c, Boolean.valueOf($$3.a() == eww.c));
         jb $$5 = $$0.k();
         return $$5 != jb.a && ($$5 == jb.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, ebw.a);
      }
   }

   @Override
   protected boolean a(eao $$0, ddd $$1) {
      czk $$2 = $$1.n();
      ebw $$3 = $$0.c(b);
      if ($$3 == ebw.c || !$$2.a(this.h())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jb $$5 = $$1.k();
         return $$3 == ebw.b ? $$5 == jb.b || $$4 && $$5.o().d() : $$5 == jb.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(c) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dji $$0, iv $$1, eao $$2, ewv $$3) {
      return $$2.c(b) != ebw.c ? dtx.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable bxj $$0, din $$1, iv $$2, eao $$3, ewu $$4) {
      return $$3.c(b) != ebw.c ? dtx.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(axh.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
