import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class diw extends djo implements dke {
   public static final MapCodec<diw> a = b(diw::new);
   public static final dvq<dvl> b = dvi.bd;

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   public diw(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jk.c).b(d, Boolean.valueOf(false)).b(b, dvl.a));
   }

   @Override
   protected int h(dus $$0) {
      return 2;
   }

   @Override
   public dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1 == jk.a && !this.b($$3, $$5, $$2) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(ddo $$0, jf $$1, dus $$2) {
      drv $$3 = $$0.c_($$1);
      return $$3 instanceof dsg ? ((dsg)$$3).b() : 0;
   }

   private int e(dej $$0, jf $$1, dus $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dfa)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dvl.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dej $$0, jf $$1, dus $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dfa)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dvl.a;
      }
   }

   @Override
   protected int b(dej $$0, jf $$1, dus $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jk $$4 = $$2.c(aF);
      jf $$5 = $$1.a($$4);
      dus $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cka $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.F(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cka a(dej $$0, jk $$1, jf $$2) {
      List<cka> $$3 = $$0.a(
         cka.class,
         new eyr((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cL() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$3.ge().e) {
         return brs.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dvl.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awg.fs, awh.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return brs.a;
      }
   }

   @Override
   protected void c(dej $$0, jf $$1, dus $$2) {
      if (!$$0.R().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         drv $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dsg ? ((dsg)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            fas $$6 = this.b($$0, $$1, $$2) ? fas.c : fas.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dej $$0, jf $$1, dus $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      drv $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dsg $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dvl.a) {
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
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dus $$0, dej $$1, jf $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      drv $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsg($$0, $$1);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(aF, b, d);
   }
}
