import javax.annotation.Nullable;

public class bhq {
   private final hg<bhs> a;
   @Nullable
   private final bis b;
   @Nullable
   private final bis c;
   @Nullable
   private final ehp d;

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

   private bhq(hg<bhs> $$0, @Nullable bis $$1, @Nullable bis $$2, @Nullable ehp $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bhq(hg<bhs> $$0, @Nullable bis $$1, @Nullable bis $$2) {
      this($$0, $$1, $$2, null);
   }

   public bhq(hg<bhs> $$0, ehp $$1) {
      this($$0, null, null, $$1);
   }

   public bhq(hg<bhs> $$0, @Nullable bis $$1) {
      this($$0, $$1, $$1);
   }

   public bhq(hg<bhs> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bis c() {
      return this.c;
   }

   @Nullable
   public bis d() {
      return this.b;
   }

   public tn a(bji $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bji $$5 = $$0.eK();
         String $$6 = $$1 + ".player";
         return $$5 != null ? tn.a($$6, $$0.N_(), $$5.N_()) : tn.a($$1, $$0.N_());
      } else {
         tn $$2 = this.b == null ? this.c.N_() : this.b.N_();
         cjh $$4 = this.b instanceof bji $$3 ? $$3.eS() : cjh.b;
         return !$$4.b() && $$4.A() ? tn.a($$1 + ".item", $$0.N_(), $$2, $$4.J()) : tn.a($$1, $$0.N_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bji && !(this.b instanceof cbw);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cbw $$0 && $$0.fS().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ehp h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dj() : null;
      }
   }

   @Nullable
   public ehp i() {
      return this.d;
   }

   public boolean a(aqj<bhs> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aex<bhs> $$0) {
      return this.a.a($$0);
   }

   public bhs j() {
      return this.a.a();
   }

   public hg<bhs> k() {
      return this.a;
   }
}
