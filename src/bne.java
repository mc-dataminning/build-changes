import javax.annotation.Nullable;

public class bne {
   private final il<bng> a;
   @Nullable
   private final bof b;
   @Nullable
   private final bof c;
   @Nullable
   private final eov d;

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

   private bne(il<bng> $$0, @Nullable bof $$1, @Nullable bof $$2, @Nullable eov $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bne(il<bng> $$0, @Nullable bof $$1, @Nullable bof $$2) {
      this($$0, $$1, $$2, null);
   }

   public bne(il<bng> $$0, eov $$1) {
      this($$0, null, null, $$1);
   }

   public bne(il<bng> $$0, @Nullable bof $$1) {
      this($$0, $$1, $$1);
   }

   public bne(il<bng> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bof c() {
      return this.c;
   }

   @Nullable
   public bof d() {
      return this.b;
   }

   public vs a(box $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         box $$5 = $$0.eK();
         String $$6 = $$1 + ".player";
         return $$5 != null ? vs.a($$6, $$0.Q_(), $$5.Q_()) : vs.a($$1, $$0.Q_());
      } else {
         vs $$2 = this.b == null ? this.c.Q_() : this.b.Q_();
         cpq $$4 = this.b instanceof box $$3 ? $$3.eR() : cpq.h;
         return !$$4.b() && $$4.B() ? vs.a($$1 + ".item", $$0.Q_(), $$2, $$4.K()) : vs.a($$1, $$0.Q_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof box && !(this.b instanceof cia);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cia $$0 && $$0.fW().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public eov h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dh() : null;
      }
   }

   @Nullable
   public eov i() {
      return this.d;
   }

   public boolean a(aut<bng> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ajb<bng> $$0) {
      return this.a.a($$0);
   }

   public bng j() {
      return this.a.a();
   }

   public il<bng> k() {
      return this.a;
   }
}
