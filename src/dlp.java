import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlp extends dnk {
   protected static final fbu c = djm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dxo d = dxn.B;

   protected dlp(dww.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlp> a();

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return c;
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      ji $$3 = $$2.e();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(dgl $$0, ji $$1, dwx $$2) {
      return $$2.a($$0, $$1, jn.b, drs.c);
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if (!this.b((dgl)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dgi)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fcw.b);
            }
         }
      }
   }

   @Override
   protected int b(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aF) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      if ($$0.a((dgl)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dtz $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jn $$7 : jn.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dgi $$0, ji $$1, dwx $$2) {
      if (!this.b((dgl)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.U().b($$1, this)) {
            fcw $$5 = fcw.c;
            if (this.b((dfn)$$0, $$1, $$2)) {
               $$5 = fcw.a;
            } else if ($$3) {
               $$5 = fcw.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean b(dgl $$0, ji $$1, dwx $$2) {
      return false;
   }

   protected boolean a(dgi $$0, ji $$1, dwx $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dgi $$0, ji $$1, dwx $$2) {
      jn $$3 = $$2.c(aF);
      ji $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dwx $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(djo.cE) ? $$6.c(dpt.f) : 0);
      }
   }

   protected int a(dha $$0, ji $$1, dwx $$2) {
      jn $$3 = $$2.c(aF);
      jn $$4 = $$3.h();
      jn $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dwx $$0) {
      return true;
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, bvg $$3, cwp $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dgi $$0, ji $$1, dwx $$2) {
      jn $$3 = $$2.c(aF);
      ji $$4 = $$1.a($$3.g());
      euh $$5 = eud.a($$0, $$3.g(), jn.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dfn $$0, ji $$1, dwx $$2) {
      return 15;
   }

   public static boolean n(dwx $$0) {
      return $$0.b() instanceof dlp;
   }

   public boolean b(dfn $$0, ji $$1, dwx $$2) {
      jn $$3 = $$2.c(aF).g();
      dwx $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aF) != $$3;
   }

   protected abstract int h(dwx var1);
}
