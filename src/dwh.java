import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class dwh<T extends Enum<T> & bag> extends dwm<T> {
   private static final int c = -1;
   private final List<T> d;
   private final Map<String, T> e = Maps.newHashMap();
   @VisibleForTesting
   protected int a;
   @VisibleForTesting
   protected final int b;

   protected dwh(String $$0, Class<T> $$1, List<T> $$2) {
      super($$0, $$1);
      if ($$2.isEmpty()) {
         throw new IllegalArgumentException("Trying to make empty EnumProperty '" + $$0 + "'");
      } else {
         int[] $$3 = new int[]{-1};
         if (IntStream.range(0, $$2.size()).allMatch($$2x -> {
            int $$3x = $$2.get($$2x).ordinal() - $$2x;
            if ($$3[0] == -1) {
               $$3[0] = $$3x;
            }

            return $$3x == $$3[0];
         })) {
            this.d = Collections.unmodifiableList($$2);
            this.b = $$2.getLast().ordinal();
            this.a = $$3[0];
         } else {
            this.d = new ReferenceArrayList($$2);
            this.b = -1;
            this.a = -1;
         }

         for (T $$4 : $$2) {
            String $$5 = $$4.c();
            if (this.e.containsKey($$5)) {
               throw new IllegalArgumentException("Multiple values have the same name '" + $$5 + "'");
            }

            this.e.put($$5, $$4);
         }
      }
   }

   @Override
   public List<T> a() {
      return this.b == -1 ? Collections.unmodifiableList(this.d) : this.d;
   }

   @Override
   public Optional<T> b(String $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   public String a(T $$0) {
      return $$0.c();
   }

   public int b(T $$0) {
      int $$1 = $$0.ordinal();
      return $$1 <= this.b ? $$1 - this.a : this.d.indexOf($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dwh<?> $$1 && super.equals($$0)) {
            return this.d.equals($$1.d) && this.e.equals($$1.e);
         }

         return false;
      }
   }

   @Override
   public int b() {
      int $$0 = super.b();
      $$0 = 31 * $$0 + this.d.hashCode();
      return 31 * $$0 + this.e.hashCode();
   }

   public static <T extends Enum<T> & bag> dwh<T> a(String $$0, Class<T> $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static <T extends Enum<T> & bag> dwh<T> a(String $$0, Class<T> $$1, Predicate<T> $$2) {
      return a($$0, $$1, Arrays.<T>stream($$1.getEnumConstants()).filter($$2).collect(Collectors.toList()));
   }

   public static <T extends Enum<T> & bag> dwh<T> a(String $$0, Class<T> $$1, T... $$2) {
      return a($$0, $$1, Lists.newArrayList($$2));
   }

   public static <T extends Enum<T> & bag> dwh<T> a(String $$0, Class<T> $$1, List<T> $$2) {
      return new dwh<>($$0, $$1, $$2);
   }
}
