import javax.annotation.Nullable;

public class bra {
   private final jj<brc> a;
   @Nullable
   private final bsh b;
   @Nullable
   private final bsh c;
   @Nullable
   private final ewh d;

   @Override
   public String toString() {
      return "DamageSource (" + this.j().a() + ")";
   }

   public float a() {
      return this.j().c();
   }

   public boolean b() {
      return this.b == this.c;
   }

   private bra(jj<brc> $$0, @Nullable bsh $$1, @Nullable bsh $$2, @Nullable ewh $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bra(jj<brc> $$0, @Nullable bsh $$1, @Nullable bsh $$2) {
      this($$0, $$1, $$2, null);
   }

   public bra(jj<brc> $$0, ewh $$1) {
      this($$0, null, null, $$1);
   }

   public bra(jj<brc> $$0, @Nullable bsh $$1) {
      this($$0, $$1, $$1);
   }

   public bra(jj<brc> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bsh c() {
      return this.c;
   }

   @Nullable
   public bsh d() {
      return this.b;
   }

   public wu a(btc $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         btc $$5 = $$0.eO();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wu.a($$6, $$0.O_(), $$5.O_()) : wu.a($$1, $$0.O_());
      } else {
         wu $$2 = this.b == null ? this.c.O_() : this.b.O_();
         cud $$4 = this.b instanceof btc $$3 ? $$3.eV() : cud.l;
         return !$$4.e() && $$4.b(kn.g) ? wu.a($$1 + ".item", $$0.O_(), $$2, $$4.F()) : wu.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof btc && !(this.b instanceof cml);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cml $$0 && $$0.gb().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ewh h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dp() : null;
      }
   }

   @Nullable
   public ewh i() {
      return this.d;
   }

   public boolean a(awm<brc> $$0) {
      return this.a.a($$0);
   }

   public boolean a(akj<brc> $$0) {
      return this.a.a($$0);
   }

   public brc j() {
      return this.a.a();
   }

   public jj<brc> k() {
      return this.a;
   }
}
