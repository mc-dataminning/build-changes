import javax.annotation.Nullable;

public class btc {
   private final jr<bte> a;
   @Nullable
   private final bum b;
   @Nullable
   private final bum c;
   @Nullable
   private final fbb d;

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

   private btc(jr<bte> $$0, @Nullable bum $$1, @Nullable bum $$2, @Nullable fbb $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public btc(jr<bte> $$0, @Nullable bum $$1, @Nullable bum $$2) {
      this($$0, $$1, $$2, null);
   }

   public btc(jr<bte> $$0, fbb $$1) {
      this($$0, null, null, $$1);
   }

   public btc(jr<bte> $$0, @Nullable bum $$1) {
      this($$0, $$1, $$1);
   }

   public btc(jr<bte> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bum c() {
      return this.c;
   }

   @Nullable
   public bum d() {
      return this.b;
   }

   @Nullable
   public cwq e() {
      return this.c != null ? this.c.dZ() : null;
   }

   public wp a(bvi $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bvi $$5 = $$0.eR();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wp.a($$6, $$0.p_(), $$5.p_()) : wp.a($$1, $$0.p_());
      } else {
         wp $$2 = this.b == null ? this.c.p_() : this.b.p_();
         cwq $$4 = this.b instanceof bvi $$3 ? $$3.eZ() : cwq.j;
         return !$$4.f() && $$4.b(kv.g) ? wp.a($$1 + ".item", $$0.p_(), $$2, $$4.K()) : wp.a($$1, $$0.p_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bvi && !(this.b instanceof coy);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof coy $$0 && $$0.gj().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public fbb i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dt() : null;
      }
   }

   @Nullable
   public fbb j() {
      return this.d;
   }

   public boolean a(axf<bte> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aku<bte> $$0) {
      return this.a.a($$0);
   }

   public bte k() {
      return this.a.a();
   }

   public jr<bte> l() {
      return this.a;
   }
}
