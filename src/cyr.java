import com.mojang.serialization.MapCodec;

public abstract class cyr extends dak {
   protected static final eml c = cwp.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final djx d = djw.w;

   protected cyr(djf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cyr> a();

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return c;
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      hx $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(ctr $$0, hx $$1, djg $$2) {
      return $$2.a($$0, $$1, ic.b, dep.c);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!this.c((ctr)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((cto)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), enn.b);
            }
         }
      }
   }

   @Override
   public int b(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(djg $$0, csu $$1, hx $$2, ic $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      if ($$0.a((ctr)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dgu $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ic $$7 : ic.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cto $$0, hx $$1, djg $$2) {
      if (!this.c((ctr)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.N().b($$1, this)) {
            enn $$5 = enn.c;
            if (this.b((csu)$$0, $$1, $$2)) {
               $$5 = enn.a;
            } else if ($$3) {
               $$5 = enn.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(ctr $$0, hx $$1, djg $$2) {
      return false;
   }

   protected boolean a(cto $$0, hx $$1, djg $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cto $$0, hx $$1, djg $$2) {
      ic $$3 = $$2.c(aE);
      hx $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         djg $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(cwr.cw) ? $$6.c(dcq.f) : 0);
      }
   }

   protected int a(cue $$0, hx $$1, djg $$2) {
      ic $$3 = $$2.c(aE);
      ic $$4 = $$3.h();
      ic $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(djg $$0) {
      return true;
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cto $$0, hx $$1, djg $$2) {
      ic $$3 = $$2.c(aE);
      hx $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(csu $$0, hx $$1, djg $$2) {
      return 15;
   }

   public static boolean h(djg $$0) {
      return $$0.b() instanceof cyr;
   }

   public boolean b(csu $$0, hx $$1, djg $$2) {
      ic $$3 = $$2.c(aE).g();
      djg $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(djg var1);
}
