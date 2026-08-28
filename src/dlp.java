import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dlp extends dmi implements dmy {
   public static final MapCodec<dlp> a = b(dlp::new);
   public static final dyk<dyg> b = dyd.be;

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   public dlp(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(d, Boolean.valueOf(false)).b(b, dyg.a));
   }

   @Override
   protected int h(dxn $$0) {
      return 2;
   }

   @Override
   public dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4 == jm.a && !this.b($$1, $$5, $$6) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(dgf $$0, jh $$1, dxn $$2) {
      dup $$3 = $$0.c_($$1);
      return $$3 instanceof dva ? ((dva)$$3).b() : 0;
   }

   private int e(dha $$0, jh $$1, dxn $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dhs)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dyg.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dha $$0, jh $$1, dxn $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dhs)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dyg.a;
      }
   }

   @Override
   protected int b(dha $$0, jh $$1, dxn $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jm $$4 = $$2.c(aF);
      jh $$5 = $$1.a($$4);
      dxn $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         clp $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.D(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private clp a(dha $$0, jm $$1, jh $$2) {
      List<clp> $$3 = $$0.a(
         clp.class,
         new fbn((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cO() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$3.gh().e) {
         return bte.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dyg.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, axf.fs, axg.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bte.a;
      }
   }

   @Override
   protected void c(dha $$0, jh $$1, dxn $$2) {
      if (!$$0.T().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dup $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dva ? ((dva)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            fdo $$6 = this.b($$0, $$1, $$2) ? fdo.c : fdo.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dha $$0, jh $$1, dxn $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dup $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dva $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dyg.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(d);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dxn $$0, dha $$1, jh $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dup $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dva($$0, $$1);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(aF, b, d);
   }
}
