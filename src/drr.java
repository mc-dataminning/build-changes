import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drr extends dkl implements drp {
   public static final MapCodec<drr> a = b(drr::new);
   public static final dyr<dzb> b = dyk.bi;
   public static final dyl c = dyk.D;
   protected static final fcr d = dkl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final fcr e = dkl.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends drr> a() {
      return a;
   }

   public drr(dxt.d $$0) {
      super($$0);
      this.l(this.m().b(b, dzb.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxu $$0) {
      return $$0.c(b) != dzb.c;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      dzb $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return fco.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      jh $$1 = $$0.a();
      dxu $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dzb.c).b(c, Boolean.valueOf(false));
      } else {
         etw $$3 = $$0.q().b_($$1);
         dxu $$4 = this.m().b(b, dzb.b).b(c, Boolean.valueOf($$3.a() == etx.c));
         jm $$5 = $$0.k();
         return $$5 != jm.a && ($$5 == jm.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dzb.a);
      }
   }

   @Override
   protected boolean a(dxu $$0, dbf $$1) {
      cxo $$2 = $$1.n();
      dzb $$3 = $$0.c(b);
      if ($$3 == dzb.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jm $$5 = $$1.k();
         return $$3 == dzb.b ? $$5 == jm.b || $$4 && $$5.o().d() : $$5 == jm.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(c) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dhi $$0, jh $$1, dxu $$2, etw $$3) {
      return $$2.c(b) != dzb.c ? drp.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cpw $$0, dgm $$1, jh $$2, dxu $$3, etv $$4) {
      return $$3.c(b) != dzb.c ? drp.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(aya.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
