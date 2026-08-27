import javax.annotation.Nullable;

public class bhu {
   private final he<bhw> a;
   @Nullable
   private final biw b;
   @Nullable
   private final biw c;
   @Nullable
   private final ehh d;

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

   private bhu(he<bhw> $$0, @Nullable biw $$1, @Nullable biw $$2, @Nullable ehh $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bhu(he<bhw> $$0, @Nullable biw $$1, @Nullable biw $$2) {
      this($$0, $$1, $$2, null);
   }

   public bhu(he<bhw> $$0, ehh $$1) {
      this($$0, null, null, $$1);
   }

   public bhu(he<bhw> $$0, @Nullable biw $$1) {
      this($$0, $$1, $$1);
   }

   public bhu(he<bhw> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public biw c() {
      return this.c;
   }

   @Nullable
   public biw d() {
      return this.b;
   }

   public tl a(bjm $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bjm $$5 = $$0.eK();
         String $$6 = $$1 + ".player";
         return $$5 != null ? tl.a($$6, $$0.N_(), $$5.N_()) : tl.a($$1, $$0.N_());
      } else {
         tl $$2 = this.b == null ? this.c.N_() : this.b.N_();
         cjl $$4 = this.b instanceof bjm $$3 ? $$3.eS() : cjl.b;
         return !$$4.b() && $$4.A() ? tl.a($$1 + ".item", $$0.N_(), $$2, $$4.J()) : tl.a($$1, $$0.N_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bjm && !(this.b instanceof cca);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cca $$0 && $$0.fT().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ehh h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dj() : null;
      }
   }

   @Nullable
   public ehh i() {
      return this.d;
   }

   public boolean a(aqk<bhw> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aey<bhw> $$0) {
      return this.a.a($$0);
   }

   public bhw j() {
      return this.a.a();
   }

   public he<bhw> k() {
      return this.a;
   }
}
