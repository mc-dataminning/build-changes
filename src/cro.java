import it.unimi.dsi.fastutil.ints.IntList;

public interface cro extends azs {
   IntList a();

   default int b() {
      return this.a().size();
   }

   static cro a(final String $$0, final IntList $$1) {
      return new cro() {
         @Override
         public IntList a() {
            return $$1;
         }

         @Override
         public String c() {
            return $$0;
         }

         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
