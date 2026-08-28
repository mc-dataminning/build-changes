import javax.annotation.Nullable;

public class bsz {
   private final jr<btb> a;
   @Nullable
   private final buj b;
   @Nullable
   private final buj c;
   @Nullable
   private final fay d;

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

   private bsz(jr<btb> $$0, @Nullable buj $$1, @Nullable buj $$2, @Nullable fay $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bsz(jr<btb> $$0, @Nullable buj $$1, @Nullable buj $$2) {
      this($$0, $$1, $$2, null);
   }

   public bsz(jr<btb> $$0, fay $$1) {
      this($$0, null, null, $$1);
   }

   public bsz(jr<btb> $$0, @Nullable buj $$1) {
      this($$0, $$1, $$1);
   }

   public bsz(jr<btb> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public buj c() {
      return this.c;
   }

   @Nullable
   public buj d() {
      return this.b;
   }

   @Nullable
   public cwn e() {
      return this.c != null ? this.c.ea() : null;
   }

   public wo a(bvf $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bvf $$5 = $$0.eR();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wo.a($$6, $$0.p_(), $$5.p_()) : wo.a($$1, $$0.p_());
      } else {
         wo $$2 = this.b == null ? this.c.p_() : this.b.p_();
         cwn $$4 = this.b instanceof bvf $$3 ? $$3.eZ() : cwn.j;
         return !$$4.f() && $$4.b(kv.g) ? wo.a($$1 + ".item", $$0.p_(), $$2, $$4.K()) : wo.a($$1, $$0.p_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bvf && !(this.b instanceof cov);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cov $$0 && $$0.gj().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public fay i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.du() : null;
      }
   }

   @Nullable
   public fay j() {
      return this.d;
   }

   public boolean a(axe<btb> $$0) {
      return this.a.a($$0);
   }

   public boolean a(akt<btb> $$0) {
      return this.a.a($$0);
   }

   public btb k() {
      return this.a.a();
   }

   public jr<btb> l() {
      return this.a;
   }
}
