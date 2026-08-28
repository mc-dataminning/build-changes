import javax.annotation.Nullable;

public class ded extends def {
   private final iw b;
   protected boolean a = true;

   public ded(csi $$0, bvb $$1, dak $$2, ffy $$3) {
      this($$0.dV(), $$0, $$1, $$2, $$3);
   }

   public ded(def $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected ded(dkj $$0, @Nullable csi $$1, bvb $$2, dak $$3, ffy $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.b().a($$4.c());
      this.a = $$0.a_($$4.b()).a(this);
   }

   public static ded a(ded $$0, iw $$1, jc $$2) {
      return new ded(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new ffy(
            new fgc((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public iw a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public jc d() {
      return jc.a(this.o())[0];
   }

   public jc e() {
      return jc.a(this.o(), jc.a.b);
   }

   public jc[] f() {
      jc[] $$0 = jc.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         jc $$1 = this.k();
         int $$2 = 0;

         while ($$2 < $$0.length && $$0[$$2] != $$1.g()) {
            $$2++;
         }

         if ($$2 > 0) {
            System.arraycopy($$0, 0, $$0, 1, $$2);
            $$0[0] = $$1.g();
         }

         return $$0;
      }
   }
}
