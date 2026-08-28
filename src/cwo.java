import it.unimi.dsi.fastutil.ints.IntList;

public interface cwo extends bak {
   IntList a();

   default int b() {
      return this.a().size();
   }

   static cwo a(final String $$0, final IntList $$1) {
      return new cwo() {
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
