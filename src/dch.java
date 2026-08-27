import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dch extends cvf implements dcf {
   public static final MapCodec<dch> a = b(dch::new);
   public static final dil<div> b = did.bh;
   public static final die c = did.C;
   protected static final eks d = cvf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final eks e = cvf.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dch> a() {
      return a;
   }

   public dch(dhm.d $$0) {
      super($$0);
      this.k(this.o().a(b, div.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dhn $$0) {
      return $$0.c(b) != div.c;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      div $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ekp.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      hx $$1 = $$0.a();
      dhn $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, div.c).a(c, Boolean.valueOf(false));
      } else {
         ecx $$3 = $$0.q().b_($$1);
         dhn $$4 = this.o().a(b, div.b).a(c, Boolean.valueOf($$3.a() == ecy.c));
         ib $$5 = $$0.k();
         return $$5 != ib.a && ($$5 == ib.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, div.a);
      }
   }

   @Override
   public boolean a(dhn $$0, cnw $$1) {
      clo $$2 = $$1.n();
      div $$3 = $$0.c(b);
      if ($$3 == div.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ib $$5 = $$1.k();
         return $$3 == div.b ? $$5 == ib.b || $$4 && $$5.o().d() : $$5 == ib.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(c) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(csg $$0, hx $$1, dhn $$2, ecx $$3) {
      return $$2.c(b) != div.c ? dcf.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cdz $$0, crl $$1, hx $$2, dhn $$3, ecw $$4) {
      return $$3.c(b) != div.c ? dcf.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(arp.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
