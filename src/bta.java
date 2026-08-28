import javax.annotation.Nullable;

public class bta {
   private final jr<btc> a;
   @Nullable
   private final buk b;
   @Nullable
   private final buk c;
   @Nullable
   private final faz d;

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

   private bta(jr<btc> $$0, @Nullable buk $$1, @Nullable buk $$2, @Nullable faz $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bta(jr<btc> $$0, @Nullable buk $$1, @Nullable buk $$2) {
      this($$0, $$1, $$2, null);
   }

   public bta(jr<btc> $$0, faz $$1) {
      this($$0, null, null, $$1);
   }

   public bta(jr<btc> $$0, @Nullable buk $$1) {
      this($$0, $$1, $$1);
   }

   public bta(jr<btc> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public buk c() {
      return this.c;
   }

   @Nullable
   public buk d() {
      return this.b;
   }

   @Nullable
   public cwo e() {
      return this.c != null ? this.c.dZ() : null;
   }

   public wp a(bvg $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bvg $$5 = $$0.eR();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wp.a($$6, $$0.p_(), $$5.p_()) : wp.a($$1, $$0.p_());
      } else {
         wp $$2 = this.b == null ? this.c.p_() : this.b.p_();
         cwo $$4 = this.b instanceof bvg $$3 ? $$3.eZ() : cwo.j;
         return !$$4.f() && $$4.b(kv.g) ? wp.a($$1 + ".item", $$0.p_(), $$2, $$4.K()) : wp.a($$1, $$0.p_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bvg && !(this.b instanceof cow);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cow $$0 && $$0.gj().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public faz i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dt() : null;
      }
   }

   @Nullable
   public faz j() {
      return this.d;
   }

   public boolean a(axf<btc> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aku<btc> $$0) {
      return this.a.a($$0);
   }

   public btc k() {
      return this.a.a();
   }

   public jr<btc> l() {
      return this.a;
   }
}
