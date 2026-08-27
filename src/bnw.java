import javax.annotation.Nullable;

public class bnw {
   private final il<bny> a;
   @Nullable
   private final box b;
   @Nullable
   private final box c;
   @Nullable
   private final ept d;

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

   private bnw(il<bny> $$0, @Nullable box $$1, @Nullable box $$2, @Nullable ept $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bnw(il<bny> $$0, @Nullable box $$1, @Nullable box $$2) {
      this($$0, $$1, $$2, null);
   }

   public bnw(il<bny> $$0, ept $$1) {
      this($$0, null, null, $$1);
   }

   public bnw(il<bny> $$0, @Nullable box $$1) {
      this($$0, $$1, $$1);
   }

   public bnw(il<bny> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public box c() {
      return this.c;
   }

   @Nullable
   public box d() {
      return this.b;
   }

   public vu a(bpp $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bpp $$5 = $$0.eN();
         String $$6 = $$1 + ".player";
         return $$5 != null ? vu.a($$6, $$0.O_(), $$5.O_()) : vu.a($$1, $$0.O_());
      } else {
         vu $$2 = this.b == null ? this.c.O_() : this.b.O_();
         cqm $$4 = this.b instanceof bpp $$3 ? $$3.eU() : cqm.h;
         return !$$4.b() && $$4.B() ? vu.a($$1 + ".item", $$0.O_(), $$2, $$4.K()) : vu.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bpp && !(this.b instanceof ciu);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof ciu $$0 && $$0.ga().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ept h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dk() : null;
      }
   }

   @Nullable
   public ept i() {
      return this.d;
   }

   public boolean a(avd<bny> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ajg<bny> $$0) {
      return this.a.a($$0);
   }

   public bny j() {
      return this.a.a();
   }

   public il<bny> k() {
      return this.a;
   }
}
