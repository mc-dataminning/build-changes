import javax.annotation.Nullable;

public class bpj {
   private final iv<bpl> a;
   @Nullable
   private final bql b;
   @Nullable
   private final bql c;
   @Nullable
   private final etf d;

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

   private bpj(iv<bpl> $$0, @Nullable bql $$1, @Nullable bql $$2, @Nullable etf $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bpj(iv<bpl> $$0, @Nullable bql $$1, @Nullable bql $$2) {
      this($$0, $$1, $$2, null);
   }

   public bpj(iv<bpl> $$0, etf $$1) {
      this($$0, null, null, $$1);
   }

   public bpj(iv<bpl> $$0, @Nullable bql $$1) {
      this($$0, $$1, $$1);
   }

   public bpj(iv<bpl> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bql c() {
      return this.c;
   }

   @Nullable
   public bql d() {
      return this.b;
   }

   public ws a(bre $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bre $$5 = $$0.eO();
         String $$6 = $$1 + ".player";
         return $$5 != null ? ws.a($$6, $$0.O_(), $$5.O_()) : ws.a($$1, $$0.O_());
      } else {
         ws $$2 = this.b == null ? this.c.O_() : this.b.O_();
         csd $$4 = this.b instanceof bre $$3 ? $$3.eV() : csd.i;
         return !$$4.d() && $$4.b(jz.d) ? ws.a($$1 + ".item", $$0.O_(), $$2, $$4.E()) : ws.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bre && !(this.b instanceof ckl);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof ckl $$0 && $$0.gb().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public etf h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dl() : null;
      }
   }

   @Nullable
   public etf i() {
      return this.d;
   }

   public boolean a(awd<bpl> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ake<bpl> $$0) {
      return this.a.a($$0);
   }

   public bpl j() {
      return this.a.a();
   }

   public iv<bpl> k() {
      return this.a;
   }
}
