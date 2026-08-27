import javax.annotation.Nullable;

public class bqn {
   private final ix<bqp> a;
   @Nullable
   private final bru b;
   @Nullable
   private final bru c;
   @Nullable
   private final euk d;

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

   private bqn(ix<bqp> $$0, @Nullable bru $$1, @Nullable bru $$2, @Nullable euk $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bqn(ix<bqp> $$0, @Nullable bru $$1, @Nullable bru $$2) {
      this($$0, $$1, $$2, null);
   }

   public bqn(ix<bqp> $$0, euk $$1) {
      this($$0, null, null, $$1);
   }

   public bqn(ix<bqp> $$0, @Nullable bru $$1) {
      this($$0, $$1, $$1);
   }

   public bqn(ix<bqp> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bru c() {
      return this.c;
   }

   @Nullable
   public bru d() {
      return this.b;
   }

   public wx a(bso $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bso $$5 = $$0.eQ();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wx.a($$6, $$0.O_(), $$5.O_()) : wx.a($$1, $$0.O_());
      } else {
         wx $$2 = this.b == null ? this.c.O_() : this.b.O_();
         cto $$4 = this.b instanceof bso $$3 ? $$3.eX() : cto.i;
         return !$$4.e() && $$4.b(kb.f) ? wx.a($$1 + ".item", $$0.O_(), $$2, $$4.G()) : wx.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bso && !(this.b instanceof clw);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof clw $$0 && $$0.gd().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public euk h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dn() : null;
      }
   }

   @Nullable
   public euk i() {
      return this.d;
   }

   public boolean a(awl<bqp> $$0) {
      return this.a.a($$0);
   }

   public boolean a(akl<bqp> $$0) {
      return this.a.a($$0);
   }

   public bqp j() {
      return this.a.a();
   }

   public ix<bqp> k() {
      return this.a;
   }
}
