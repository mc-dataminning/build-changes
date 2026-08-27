import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cct extends cbr {
   private static final agj<Byte> e = agm.a(cct.class, agl.a);
   protected int b;
   private cct.a bT = cct.a.a;

   protected cct(blt<? extends cct> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(e, (byte)0);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cbr.a u() {
      if (this.go()) {
         return cbr.a.c;
      } else {
         return this.gv() ? cbr.a.g : cbr.a.a;
      }
   }

   public boolean go() {
      return this.dM().B ? this.an.b(e) > 0 : this.b > 0;
   }

   public void a(cct.a $$0) {
      this.bT = $$0;
      this.an.b(e, (byte)$$0.h);
   }

   protected cct.a gp() {
      return !this.dM().B ? this.bT : cct.a.a(this.an.b(e));
   }

   @Override
   protected void Z() {
      super.Z();
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && this.go()) {
         cct.a $$0 = this.gp();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + aui.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = aui.b($$4);
         float $$6 = aui.a($$4);
         this.dM().a(jx.v, this.dr() + (double)$$5 * 0.6, this.dt() + 1.8, this.dx() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.dM().a(jx.v, this.dr() - (double)$$5 * 0.6, this.dt() + 1.8, this.dx() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }
   }

   protected int gq() {
      return this.b;
   }

   protected abstract arl ge();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cct.a> g = ata.a($$0 -> $$0.h, values(), ata.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cct.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends btb {
      public b() {
         this.a(EnumSet.of(btb.a.a, btb.a.b));
      }

      @Override
      public boolean a() {
         return cct.this.gq() > 0;
      }

      @Override
      public void c() {
         super.c();
         cct.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         cct.this.a(cct.a.a);
      }

      @Override
      public void e() {
         if (cct.this.q() != null) {
            cct.this.I().a(cct.this.q(), (float)cct.this.ab(), (float)cct.this.aa());
         }
      }
   }

   protected abstract class c extends btb {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bmf $$0 = cct.this.q();
         if ($$0 == null || !$$0.bx()) {
            return false;
         } else {
            return cct.this.go() ? false : cct.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         bmf $$0 = cct.this.q();
         return $$0 != null && $$0.bx() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cct.this.b = this.h();
         this.c = cct.this.ah + this.i();
         arl $$0 = this.l();
         if ($$0 != null) {
            cct.this.a($$0, 1.0F, 1.0F);
         }

         cct.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cct.this.a(cct.this.ge(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract arl l();

      protected abstract cct.a m();
   }
}
