import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dts extends dmf implements dtq {
   public static final MapCodec<dts> a = b(dts::new);
   public static final ebf<ebp> b = eax.bk;
   public static final eay c = eax.I;
   private static final ffk d = dmf.b(16.0, 0.0, 8.0);
   private static final ffk e = dmf.b(16.0, 8.0, 16.0);

   @Override
   public MapCodec<? extends dts> a() {
      return a;
   }

   public dts(eag.d $$0) {
      super($$0);
      this.l(this.m().b(b, ebp.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(eah $$0) {
      return $$0.c(b) != ebp.c;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return switch ((ebp)$$0.c(b)) {
         case a -> e;
         case b -> d;
         case c -> ffh.b();
      };
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      iu $$1 = $$0.a();
      eah $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, ebp.c).b(c, Boolean.valueOf(false));
      } else {
         ewo $$3 = $$0.q().b_($$1);
         eah $$4 = this.m().b(b, ebp.b).b(c, Boolean.valueOf($$3.a() == ewp.c));
         ja $$5 = $$0.k();
         return $$5 != ja.a && ($$5 == ja.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, ebp.a);
      }
   }

   @Override
   protected boolean a(eah $$0, dcw $$1) {
      czd $$2 = $$1.n();
      ebp $$3 = $$0.c(b);
      if ($$3 == ebp.c || !$$2.a(this.h())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         ja $$5 = $$1.k();
         return $$3 == ebp.b ? $$5 == ja.b || $$4 && $$5.o().d() : $$5 == ja.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(c) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(djb $$0, iu $$1, eah $$2, ewo $$3) {
      return $$2.c(b) != ebp.c ? dtq.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable bxe $$0, dig $$1, iu $$2, eah $$3, ewn $$4) {
      return $$3.c(b) != ebp.c ? dtq.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
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
