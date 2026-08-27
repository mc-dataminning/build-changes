public class fro extends fqz {
   fro(fnk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fri $$7) {
      super($$0, $$1, $$2, $$3, $$7, 1.25F);
      this.B = 0.6F;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.D *= 0.75F;
      this.t = 60 + this.r.a(12);
      this.b($$7);
      if (this.r.a(4) == 0) {
         this.a(0.6F + this.r.i() * 0.2F, 0.6F + this.r.i() * 0.3F, this.r.i() * 0.2F);
      } else {
         this.a(0.1F + this.r.i() * 0.2F, 0.4F + this.r.i() * 0.3F, this.r.i() * 0.2F);
      }
   }

   public static class a implements fqq<ka> {
      private final fri a;

      public a(fri $$0) {
         this.a = $$0;
      }

      public fqn a(ka $$0, fnk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fro($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
