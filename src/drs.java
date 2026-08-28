import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drs extends dkm implements drq {
   public static final MapCodec<drs> a = b(drs::new);
   public static final dys<dzc> b = dyl.bi;
   public static final dym c = dyl.D;
   protected static final fcs d = dkm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final fcs e = dkm.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends drs> a() {
      return a;
   }

   public drs(dxu.d $$0) {
      super($$0);
      this.l(this.m().b(b, dzc.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxv $$0) {
      return $$0.c(b) != dzc.c;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      dzc $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return fcp.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      jh $$1 = $$0.a();
      dxv $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dzc.c).b(c, Boolean.valueOf(false));
      } else {
         etx $$3 = $$0.q().b_($$1);
         dxv $$4 = this.m().b(b, dzc.b).b(c, Boolean.valueOf($$3.a() == ety.c));
         jm $$5 = $$0.k();
         return $$5 != jm.a && ($$5 == jm.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dzc.a);
      }
   }

   @Override
   protected boolean a(dxv $$0, dbg $$1) {
      cxp $$2 = $$1.n();
      dzc $$3 = $$0.c(b);
      if ($$3 == dzc.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jm $$5 = $$1.k();
         return $$3 == dzc.b ? $$5 == jm.b || $$4 && $$5.o().d() : $$5 == jm.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(c) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dhj $$0, jh $$1, dxv $$2, etx $$3) {
      return $$2.c(b) != dzc.c ? drq.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cpx $$0, dgn $$1, jh $$2, dxv $$3, etw $$4) {
      return $$3.c(b) != dzc.c ? drq.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
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
