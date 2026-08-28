import javax.annotation.Nullable;

public class bvt {
   private final jg<bvv> a;
   @Nullable
   private final bxe b;
   @Nullable
   private final bxe c;
   @Nullable
   private final fgc d;

   @Override
   public String toString() {
      return "DamageSource (" + this.k().a() + ")";
   }

   public float a() {
      return this.k().c();
   }

   public boolean b() {
      return this.b == this.c;
   }

   private bvt(jg<bvv> $$0, @Nullable bxe $$1, @Nullable bxe $$2, @Nullable fgc $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bvt(jg<bvv> $$0, @Nullable bxe $$1, @Nullable bxe $$2) {
      this($$0, $$1, $$2, null);
   }

   public bvt(jg<bvv> $$0, fgc $$1) {
      this($$0, null, null, $$1);
   }

   public bvt(jg<bvv> $$0, @Nullable bxe $$1) {
      this($$0, $$1, $$1);
   }

   public bvt(jg<bvv> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bxe c() {
      return this.c;
   }

   @Nullable
   public bxe d() {
      return this.b;
   }

   @Nullable
   public dak e() {
      return this.c != null ? this.c.dZ() : null;
   }

   public xg a(byf $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         byf $$5 = $$0.eT();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xg.a($$6, $$0.P_(), $$5.P_()) : xg.a($$1, $$0.P_());
      } else {
         xg $$2 = this.b == null ? this.c.P_() : this.b.P_();
         dak $$4 = this.b instanceof byf $$3 ? $$3.fb() : dak.l;
         return !$$4.f() && $$4.c(kl.g) ? xg.a($$1 + ".item", $$0.P_(), $$2, $$4.K()) : xg.a($$1, $$0.P_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof byf && !(this.b instanceof csi);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof csi $$0 && $$0.gk().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public fgc i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dt() : null;
      }
   }

   @Nullable
   public fgc j() {
      return this.d;
   }

   public boolean a(ayc<bvv> $$0) {
      return this.a.a($$0);
   }

   public boolean a(alq<bvv> $$0) {
      return this.a.a($$0);
   }

   public bvv k() {
      return this.a.a();
   }

   public jg<bvv> l() {
      return this.a;
   }
}
