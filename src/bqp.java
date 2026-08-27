import javax.annotation.Nullable;

public class bqp {
   private final ix<bqr> a;
   @Nullable
   private final brw b;
   @Nullable
   private final brw c;
   @Nullable
   private final eum d;

   @Override
   public String toString() {
      return "DamageSource (" + this.j().a() + ")";
   }

   public float a() {
      return this.j().c();
   }

   public boolean b() {
      return this.b != this.c;
   }

   private bqp(ix<bqr> $$0, @Nullable brw $$1, @Nullable brw $$2, @Nullable eum $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bqp(ix<bqr> $$0, @Nullable brw $$1, @Nullable brw $$2) {
      this($$0, $$1, $$2, null);
   }

   public bqp(ix<bqr> $$0, eum $$1) {
      this($$0, null, null, $$1);
   }

   public bqp(ix<bqr> $$0, @Nullable brw $$1) {
      this($$0, $$1, $$1);
   }

   public bqp(ix<bqr> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public brw c() {
      return this.c;
   }

   @Nullable
   public brw d() {
      return this.b;
   }

   public wx a(bsq $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bsq $$5 = $$0.eQ();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wx.a($$6, $$0.O_(), $$5.O_()) : wx.a($$1, $$0.O_());
      } else {
         wx $$2 = this.b == null ? this.c.O_() : this.b.O_();
         ctq $$4 = this.b instanceof bsq $$3 ? $$3.eX() : ctq.i;
         return !$$4.e() && $$4.b(kb.f) ? wx.a($$1 + ".item", $$0.O_(), $$2, $$4.G()) : wx.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bsq && !(this.b instanceof cly);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cly $$0 && $$0.gd().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public eum h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dn() : null;
      }
   }

   @Nullable
   public eum i() {
      return this.d;
   }

   public boolean a(awm<bqr> $$0) {
      return this.a.a($$0);
   }

   public boolean a(akm<bqr> $$0) {
      return this.a.a($$0);
   }

   public bqr j() {
      return this.a.a();
   }

   public ix<bqr> k() {
      return this.a;
   }
}
