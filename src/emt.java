import javax.annotation.Nullable;

public class emt {
   private final czn a;
   @Nullable
   private final ems b;
   private final in c;
   private final in.a d = new in.a();

   public emt(czn $$0, bsc $$1) {
      this.a = $$0;
      if ($$1.dN() instanceof aqh $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dn();
   }

   public emr a(int $$0, int $$1, int $$2) {
      in $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? emw.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dqh a(in $$0) {
      return this.a.a_($$0);
   }

   public czn a() {
      return this.a;
   }

   public in b() {
      return this.c;
   }
}
