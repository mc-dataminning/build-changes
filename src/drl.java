import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drl extends dkd implements drj {
   public static final MapCodec<drl> a = b(drl::new);
   public static final dyl<dyv> b = dye.bk;
   public static final dyf c = dye.J;
   protected static final fcl d = dkd.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final fcl e = dkd.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends drl> a() {
      return a;
   }

   public drl(dxn.d $$0) {
      super($$0);
      this.l(this.m().b(b, dyv.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxo $$0) {
      return $$0.c(b) != dyv.c;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      dyv $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return fci.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      jh $$1 = $$0.a();
      dxo $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dyv.c).b(c, Boolean.valueOf(false));
      } else {
         etq $$3 = $$0.q().b_($$1);
         dxo $$4 = this.m().b(b, dyv.b).b(c, Boolean.valueOf($$3.a() == etr.c));
         jm $$5 = $$0.k();
         return $$5 != jm.a && ($$5 == jm.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dyv.a);
      }
   }

   @Override
   protected boolean a(dxo $$0, dax $$1) {
      cxg $$2 = $$1.n();
      dyv $$3 = $$0.c(b);
      if ($$3 == dyv.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jm $$5 = $$1.k();
         return $$3 == dyv.b ? $$5 == jm.b || $$4 && $$5.o().d() : $$5 == jm.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(c) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dha $$0, jh $$1, dxo $$2, etq $$3) {
      return $$2.c(b) != dyv.c ? drj.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cpo $$0, dge $$1, jh $$2, dxo $$3, etp $$4) {
      return $$3.c(b) != dyv.c ? drj.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(axq.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
