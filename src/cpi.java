import javax.annotation.Nullable;

public class cpi {
   @Nullable
   private final cfh a;
   private final bjz b;
   private final elo c;
   private final cto d;
   private final cmx e;

   public cpi(cfh $$0, bjz $$1, elo $$2) {
      this($$0.dM(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cpi(cto $$0, @Nullable cfh $$1, bjz $$2, cmx $$3, elo $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final elo j() {
      return this.c;
   }

   public hx a() {
      return this.c.a();
   }

   public ic k() {
      return this.c.b();
   }

   public els l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public cmx n() {
      return this.e;
   }

   @Nullable
   public cfh o() {
      return this.a;
   }

   public bjz p() {
      return this.b;
   }

   public cto q() {
      return this.d;
   }

   public ic g() {
      return this.a == null ? ic.c : this.a.cE();
   }

   public boolean h() {
      return this.a != null && this.a.fI();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dC();
   }
}
