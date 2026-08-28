import it.unimi.dsi.fastutil.ints.IntImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public final class dxu extends dxx<Integer> {
   private final IntImmutableList a;
   private final int b;
   private final int c;

   private dxu(String $$0, int $$1, int $$2) {
      super($$0, Integer.class);
      if ($$1 < 0) {
         throw new IllegalArgumentException("Min value of " + $$0 + " must be 0 or greater");
      } else if ($$2 <= $$1) {
         throw new IllegalArgumentException("Max value of " + $$0 + " must be greater than min (" + $$1 + ")");
      } else {
         this.b = $$1;
         this.c = $$2;
         this.a = IntImmutableList.toList(IntStream.range($$1, $$2 + 1));
      }
   }

   @Override
   public List<Integer> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dxu $$1 && super.equals($$0)) {
            return this.a.equals($$1.a);
         }

         return false;
      }
   }

   @Override
   public int b() {
      return 31 * super.b() + this.a.hashCode();
   }

   public static dxu a(String $$0, int $$1, int $$2) {
      return new dxu($$0, $$1, $$2);
   }

   @Override
   public Optional<Integer> b(String $$0) {
      try {
         int $$1 = Integer.parseInt($$0);
         return $$1 >= this.b && $$1 <= this.c ? Optional.of($$1) : Optional.empty();
      } catch (NumberFormatException var3) {
         return Optional.empty();
      }
   }

   public String a(Integer $$0) {
      return $$0.toString();
   }

   public int b(Integer $$0) {
      return $$0 <= this.c ? $$0 - this.b : -1;
   }
}
