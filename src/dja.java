import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dja extends dby implements diy {
   public static final MapCodec<dja> a = b(dja::new);
   public static final dpx<dqh> b = dpp.bh;
   public static final dpq c = dpp.C;
   protected static final est d = dby.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final est e = dby.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dja> a() {
      return a;
   }

   public dja(doy.d $$0) {
      super($$0);
      this.k(this.n().a(b, dqh.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(doz $$0) {
      return $$0.c(b) != dqh.c;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      dqh $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return esq.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      ib $$1 = $$0.a();
      doz $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dqh.c).a(c, Boolean.valueOf(false));
      } else {
         eks $$3 = $$0.q().b_($$1);
         doz $$4 = this.n().a(b, dqh.b).a(c, Boolean.valueOf($$3.a() == ekt.c));
         ih $$5 = $$0.k();
         return $$5 != ih.a && ($$5 == ih.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dqh.a);
      }
   }

   @Override
   protected boolean a(doz $$0, cuo $$1) {
      crj $$2 = $$1.n();
      dqh $$3 = $$0.c(b);
      if ($$3 == dqh.c || !$$2.a(this.p())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ih $$5 = $$1.k();
         return $$3 == dqh.b ? $$5 == ih.b || $$4 && $$5.o().d() : $$5 == ih.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(c) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cyy $$0, ib $$1, doz $$2, eks $$3) {
      return $$2.c(b) != dqh.c ? diy.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cjt $$0, cyd $$1, ib $$2, doz $$3, ekr $$4) {
      return $$3.c(b) != dqh.c ? diy.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(avh.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
