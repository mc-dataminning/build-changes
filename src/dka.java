import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dka extends dks implements dli {
   public static final MapCodec<dka> a = b(dka::new);
   public static final dws<dwo> b = dwl.bd;

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   public dka(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(d, Boolean.valueOf(false)).b(b, dwo.a));
   }

   @Override
   protected int h(dvv $$0) {
      return 2;
   }

   @Override
   public dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4 == jm.a && !this.b($$1, $$5, $$6) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(der $$0, jh $$1, dvv $$2) {
      dsy $$3 = $$0.c_($$1);
      return $$3 instanceof dtj ? ((dtj)$$3).b() : 0;
   }

   private int e(dfm $$0, jh $$1, dvv $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dge)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dwo.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dfm $$0, jh $$1, dvv $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dge)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dwo.a;
      }
   }

   @Override
   protected int b(dfm $$0, jh $$1, dvv $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jm $$4 = $$2.c(aF);
      jh $$5 = $$1.a($$4);
      dvv $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         ckv $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.C(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private ckv a(dfm $$0, jm $$1, jh $$2) {
      List<ckv> $$3 = $$0.a(
         ckv.class,
         new ezt((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cO() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$3.gh().e) {
         return bsk.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dwo.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awn.fs, awo.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bsk.a;
      }
   }

   @Override
   protected void c(dfm $$0, jh $$1, dvv $$2) {
      if (!$$0.S().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dsy $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dtj ? ((dtj)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            fbu $$6 = this.b($$0, $$1, $$2) ? fbu.c : fbu.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dfm $$0, jh $$1, dvv $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dsy $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dtj $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dwo.a) {
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
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dvv $$0, dfm $$1, jh $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dsy $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dtj($$0, $$1);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(aF, b, d);
   }
}
