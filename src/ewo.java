import javax.annotation.Nullable;

public class ewo {
   private final dhz a;
   @Nullable
   private final ewn b;
   private final iu c;
   private final iu.a d = new iu.a();

   public ewo(dhz $$0, bxb $$1) {
      this.a = $$0;
      if ($$1.dV() instanceof aro $$2) {
         this.b = $$2.I();
      } else {
         this.b = null;
      }

      this.c = $$1.dv();
   }

   public ewm a(int $$0, int $$1, int $$2) {
      iu $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? ewr.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dzo a(iu $$0) {
      return this.a.a_($$0);
   }

   public dhz a() {
      return this.a;
   }

   public iu b() {
      return this.c;
   }
}
