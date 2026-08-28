import javax.annotation.Nullable;

public class bsy {
   private final jq<bta> a;
   @Nullable
   private final bui b;
   @Nullable
   private final bui c;
   @Nullable
   private final ezr d;

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

   private bsy(jq<bta> $$0, @Nullable bui $$1, @Nullable bui $$2, @Nullable ezr $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bsy(jq<bta> $$0, @Nullable bui $$1, @Nullable bui $$2) {
      this($$0, $$1, $$2, null);
   }

   public bsy(jq<bta> $$0, ezr $$1) {
      this($$0, null, null, $$1);
   }

   public bsy(jq<bta> $$0, @Nullable bui $$1) {
      this($$0, $$1, $$1);
   }

   public bsy(jq<bta> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bui c() {
      return this.c;
   }

   @Nullable
   public bui d() {
      return this.b;
   }

   @Nullable
   public cwf e() {
      return this.c != null ? this.c.ec() : null;
   }

   public xl a(bve $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bve $$5 = $$0.eV();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xl.a($$6, $$0.S_(), $$5.S_()) : xl.a($$1, $$0.S_());
      } else {
         xl $$2 = this.b == null ? this.c.S_() : this.b.S_();
         cwf $$4 = this.b instanceof bve $$3 ? $$3.fc() : cwf.k;
         return !$$4.f() && $$4.b(ku.g) ? xl.a($$1 + ".item", $$0.S_(), $$2, $$4.J()) : xl.a($$1, $$0.S_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bve && !(this.b instanceof cor);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cor $$0 && $$0.gm().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ezr i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dw() : null;
      }
   }

   @Nullable
   public ezr j() {
      return this.d;
   }

   public boolean a(axt<bta> $$0) {
      return this.a.a($$0);
   }

   public boolean a(alk<bta> $$0) {
      return this.a.a($$0);
   }

   public bta k() {
      return this.a.a();
   }

   public jq<bta> l() {
      return this.a;
   }
}
