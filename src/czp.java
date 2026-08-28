import javax.annotation.Nullable;

public class czp {
   @Nullable
   private final cnx a;
   private final brr b;
   private final eys c;
   private final dej d;
   private final cvs e;

   public czp(cnx $$0, brr $$1, eys $$2) {
      this($$0.dS(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected czp(dej $$0, @Nullable cnx $$1, brr $$2, cvs $$3, eys $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final eys j() {
      return this.c;
   }

   public jf a() {
      return this.c.b();
   }

   public jk k() {
      return this.c.c();
   }

   public eyw l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cvs n() {
      return this.e;
   }

   @Nullable
   public cnx o() {
      return this.a;
   }

   public brr p() {
      return this.b;
   }

   public dej q() {
      return this.d;
   }

   public jk g() {
      return this.a == null ? jk.c : this.a.cL();
   }

   public boolean h() {
      return this.a != null && this.a.fT();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dI();
   }
}
