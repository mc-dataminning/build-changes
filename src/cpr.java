import javax.annotation.Nullable;

public class cpr {
   @Nullable
   private final cfq a;
   private final bkb b;
   private final ely c;
   private final ctx d;
   private final cng e;

   public cpr(cfq $$0, bkb $$1, ely $$2) {
      this($$0.dL(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cpr(ctx $$0, @Nullable cfq $$1, bkb $$2, cng $$3, ely $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final ely j() {
      return this.c;
   }

   public hx a() {
      return this.c.a();
   }

   public ic k() {
      return this.c.b();
   }

   public emc l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public cng n() {
      return this.e;
   }

   @Nullable
   public cfq o() {
      return this.a;
   }

   public bkb p() {
      return this.b;
   }

   public ctx q() {
      return this.d;
   }

   public ic g() {
      return this.a == null ? ic.c : this.a.cE();
   }

   public boolean h() {
      return this.a != null && this.a.fI();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dB();
   }
}
