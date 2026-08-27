import javax.annotation.Nullable;

public class bho {
   private final hg<bhq> a;
   @Nullable
   private final biq b;
   @Nullable
   private final biq c;
   @Nullable
   private final ehn d;

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

   private bho(hg<bhq> $$0, @Nullable biq $$1, @Nullable biq $$2, @Nullable ehn $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bho(hg<bhq> $$0, @Nullable biq $$1, @Nullable biq $$2) {
      this($$0, $$1, $$2, null);
   }

   public bho(hg<bhq> $$0, ehn $$1) {
      this($$0, null, null, $$1);
   }

   public bho(hg<bhq> $$0, @Nullable biq $$1) {
      this($$0, $$1, $$1);
   }

   public bho(hg<bhq> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public biq c() {
      return this.c;
   }

   @Nullable
   public biq d() {
      return this.b;
   }

   public tl a(bjg $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bjg $$5 = $$0.eK();
         String $$6 = $$1 + ".player";
         return $$5 != null ? tl.a($$6, $$0.N_(), $$5.N_()) : tl.a($$1, $$0.N_());
      } else {
         tl $$2 = this.b == null ? this.c.N_() : this.b.N_();
         cjf $$4 = this.b instanceof bjg $$3 ? $$3.eS() : cjf.b;
         return !$$4.b() && $$4.A() ? tl.a($$1 + ".item", $$0.N_(), $$2, $$4.J()) : tl.a($$1, $$0.N_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bjg && !(this.b instanceof cbu);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cbu $$0 && $$0.fS().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ehn h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dj() : null;
      }
   }

   @Nullable
   public ehn i() {
      return this.d;
   }

   public boolean a(aqi<bhq> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aew<bhq> $$0) {
      return this.a.a($$0);
   }

   public bhq j() {
      return this.a.a();
   }

   public hg<bhq> k() {
      return this.a;
   }
}
