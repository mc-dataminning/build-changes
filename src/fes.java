import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;

public class fes extends ffk {
   private final DoubleList b;
   private final DoubleList c;
   private final DoubleList d;

   protected fes(fez $$0, double[] $$1, double[] $$2, double[] $$3) {
      this(
         $$0,
         DoubleArrayList.wrap(Arrays.copyOf($$1, $$0.b() + 1)),
         DoubleArrayList.wrap(Arrays.copyOf($$2, $$0.c() + 1)),
         DoubleArrayList.wrap(Arrays.copyOf($$3, $$0.d() + 1))
      );
   }

   fes(fez $$0, DoubleList $$1, DoubleList $$2, DoubleList $$3) {
      super($$0);
      int $$4 = $$0.b() + 1;
      int $$5 = $$0.c() + 1;
      int $$6 = $$0.d() + 1;
      if ($$4 == $$1.size() && $$5 == $$2.size() && $$6 == $$3.size()) {
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      } else {
         throw (IllegalArgumentException)af.b(new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape."));
      }
   }

   @Override
   public DoubleList a(ja.a $$0) {
      return switch ($$0) {
         case a -> this.b;
         case b -> this.c;
         case c -> this.d;
      };
   }
}
