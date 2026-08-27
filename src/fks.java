public class fks extends fkt<ip> {
   protected fks(fin $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ip $$7, fmf $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static class a implements fln<ip> {
      private final fmf a;

      public a(fmf $$0) {
         this.a = $$0;
      }

      public flk a(ip $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fks($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
      }
   }
}
