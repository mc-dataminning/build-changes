import javax.annotation.Nullable;

public class bnv {
   private final il<bnx> a;
   @Nullable
   private final bow b;
   @Nullable
   private final bow c;
   @Nullable
   private final epr d;

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

   private bnv(il<bnx> $$0, @Nullable bow $$1, @Nullable bow $$2, @Nullable epr $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bnv(il<bnx> $$0, @Nullable bow $$1, @Nullable bow $$2) {
      this($$0, $$1, $$2, null);
   }

   public bnv(il<bnx> $$0, epr $$1) {
      this($$0, null, null, $$1);
   }

   public bnv(il<bnx> $$0, @Nullable bow $$1) {
      this($$0, $$1, $$1);
   }

   public bnv(il<bnx> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bow c() {
      return this.c;
   }

   @Nullable
   public bow d() {
      return this.b;
   }

   public vu a(bpo $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bpo $$5 = $$0.eN();
         String $$6 = $$1 + ".player";
         return $$5 != null ? vu.a($$6, $$0.O_(), $$5.O_()) : vu.a($$1, $$0.O_());
      } else {
         vu $$2 = this.b == null ? this.c.O_() : this.b.O_();
         cqk $$4 = this.b instanceof bpo $$3 ? $$3.eU() : cqk.h;
         return !$$4.b() && $$4.B() ? vu.a($$1 + ".item", $$0.O_(), $$2, $$4.K()) : vu.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bpo && !(this.b instanceof cis);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cis $$0 && $$0.ga().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public epr h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dk() : null;
      }
   }

   @Nullable
   public epr i() {
      return this.d;
   }

   public boolean a(avd<bnx> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ajg<bnx> $$0) {
      return this.a.a($$0);
   }

   public bnx j() {
      return this.a.a();
   }

   public il<bnx> k() {
      return this.a;
   }
}
