import javax.annotation.Nullable;

public class bir {
   private final ib<bit> a;
   @Nullable
   private final bjt b;
   @Nullable
   private final bjt c;
   @Nullable
   private final eif d;

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

   private bir(ib<bit> $$0, @Nullable bjt $$1, @Nullable bjt $$2, @Nullable eif $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bir(ib<bit> $$0, @Nullable bjt $$1, @Nullable bjt $$2) {
      this($$0, $$1, $$2, null);
   }

   public bir(ib<bit> $$0, eif $$1) {
      this($$0, null, null, $$1);
   }

   public bir(ib<bit> $$0, @Nullable bjt $$1) {
      this($$0, $$1, $$1);
   }

   public bir(ib<bit> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bjt c() {
      return this.c;
   }

   @Nullable
   public bjt d() {
      return this.b;
   }

   public ui a(bkj $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bkj $$5 = $$0.eK();
         String $$6 = $$1 + ".player";
         return $$5 != null ? ui.a($$6, $$0.O_(), $$5.O_()) : ui.a($$1, $$0.O_());
      } else {
         ui $$2 = this.b == null ? this.c.O_() : this.b.O_();
         ckj $$4 = this.b instanceof bkj $$3 ? $$3.eS() : ckj.b;
         return !$$4.b() && $$4.A() ? ui.a($$1 + ".item", $$0.O_(), $$2, $$4.J()) : ui.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bkj && !(this.b instanceof ccx);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof ccx $$0 && $$0.fT().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public eif h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dj() : null;
      }
   }

   @Nullable
   public eif i() {
      return this.d;
   }

   public boolean a(arh<bit> $$0) {
      return this.a.a($$0);
   }

   public boolean a(afv<bit> $$0) {
      return this.a.a($$0);
   }

   public bit j() {
      return this.a.a();
   }

   public ib<bit> k() {
      return this.a;
   }
}
