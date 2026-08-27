import javax.annotation.Nullable;

public class bkd {
   private final ie<bkf> a;
   @Nullable
   private final blf b;
   @Nullable
   private final blf c;
   @Nullable
   private final elb d;

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

   private bkd(ie<bkf> $$0, @Nullable blf $$1, @Nullable blf $$2, @Nullable elb $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bkd(ie<bkf> $$0, @Nullable blf $$1, @Nullable blf $$2) {
      this($$0, $$1, $$2, null);
   }

   public bkd(ie<bkf> $$0, elb $$1) {
      this($$0, null, null, $$1);
   }

   public bkd(ie<bkf> $$0, @Nullable blf $$1) {
      this($$0, $$1, $$1);
   }

   public bkd(ie<bkf> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public blf c() {
      return this.c;
   }

   @Nullable
   public blf d() {
      return this.b;
   }

   public vb a(blv $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         blv $$5 = $$0.eL();
         String $$6 = $$1 + ".player";
         return $$5 != null ? vb.a($$6, $$0.Q_(), $$5.Q_()) : vb.a($$1, $$0.Q_());
      } else {
         vb $$2 = this.b == null ? this.c.Q_() : this.b.Q_();
         cmh $$4 = this.b instanceof blv $$3 ? $$3.eT() : cmh.f;
         return !$$4.b() && $$4.A() ? vb.a($$1 + ".item", $$0.Q_(), $$2, $$4.J()) : vb.a($$1, $$0.Q_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof blv && !(this.b instanceof cer);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cer $$0 && $$0.fT().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public elb h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dk() : null;
      }
   }

   @Nullable
   public elb i() {
      return this.d;
   }

   public boolean a(asg<bkf> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ags<bkf> $$0) {
      return this.a.a($$0);
   }

   public bkf j() {
      return this.a.a();
   }

   public ie<bkf> k() {
      return this.a;
   }
}
