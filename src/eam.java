import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class eam<T extends Enum<T> & bai> extends ear<T> {
   private final List<T> a;
   private final Map<String, T> b;
   private final int[] c;

   private eam(String $$0, Class<T> $$1, List<T> $$2) {
      super($$0, $$1);
      if ($$2.isEmpty()) {
         throw new IllegalArgumentException("Trying to make empty EnumProperty '" + $$0 + "'");
      } else {
         this.a = List.copyOf($$2);
         T[] $$3 = $$1.getEnumConstants();
         this.c = new int[$$3.length];

         for (T $$4 : $$3) {
            this.c[$$4.ordinal()] = $$2.indexOf($$4);
         }

         Builder<String, T> $$5 = ImmutableMap.builder();

         for (T $$6 : $$2) {
            String $$7 = $$6.c();
            $$5.put($$7, $$6);
         }

         this.b = $$5.buildOrThrow();
      }
   }

   @Override
   public List<T> a() {
      return this.a;
   }

   @Override
   public Optional<T> b(String $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public String a(T $$0) {
      return $$0.c();
   }

   public int b(T $$0) {
      return this.c[$$0.ordinal()];
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof eam<?> $$1 && super.equals($$0)) {
            return this.a.equals($$1.a);
         }

         return false;
      }
   }

   @Override
   public int b() {
      int $$0 = super.b();
      return 31 * $$0 + this.a.hashCode();
   }

   public static <T extends Enum<T> & bai> eam<T> a(String $$0, Class<T> $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static <T extends Enum<T> & bai> eam<T> a(String $$0, Class<T> $$1, Predicate<T> $$2) {
      return a($$0, $$1, Arrays.<T>stream($$1.getEnumConstants()).filter($$2).collect(Collectors.toList()));
   }

   @SafeVarargs
   public static <T extends Enum<T> & bai> eam<T> a(String $$0, Class<T> $$1, T... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T extends Enum<T> & bai> eam<T> a(String $$0, Class<T> $$1, List<T> $$2) {
      return new eam<>($$0, $$1, $$2);
   }
}
