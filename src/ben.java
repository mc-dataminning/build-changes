import javax.annotation.Nullable;

public class ben {
   private final he<bep> a;
   @Nullable
   private final bfj b;
   @Nullable
   private final bfj c;
   @Nullable
   private final eei d;

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

   private ben(he<bep> $$0, @Nullable bfj $$1, @Nullable bfj $$2, @Nullable eei $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public ben(he<bep> $$0, @Nullable bfj $$1, @Nullable bfj $$2) {
      this($$0, $$1, $$2, null);
   }

   public ben(he<bep> $$0, eei $$1) {
      this($$0, null, null, $$1);
   }

   public ben(he<bep> $$0, @Nullable bfj $$1) {
      this($$0, $$1, $$1);
   }

   public ben(he<bep> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bfj c() {
      return this.c;
   }

   @Nullable
   public bfj d() {
      return this.b;
   }

   public sw a(bfz $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bfz $$5 = $$0.eH();
         String $$6 = $$1 + ".player";
         return $$5 != null ? sw.a($$6, $$0.H_(), $$5.H_()) : sw.a($$1, $$0.H_());
      } else {
         sw $$2 = this.b == null ? this.c.H_() : this.b.H_();
         cfz $$4 = this.b instanceof bfz $$3 ? $$3.eO() : cfz.b;
         return !$$4.b() && $$4.A() ? sw.a($$1 + ".item", $$0.H_(), $$2, $$4.J()) : sw.a($$1, $$0.H_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bfz && !(this.b instanceof byo);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof byo $$0 && $$0.fO().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public eei h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dg() : null;
      }
   }

   @Nullable
   public eei i() {
      return this.d;
   }

   public boolean a(anl<bep> $$0) {
      return this.a.a($$0);
   }

   public boolean a(acp<bep> $$0) {
      return this.a.a($$0);
   }

   public bep j() {
      return this.a.a();
   }

   public he<bep> k() {
      return this.a;
   }
}
