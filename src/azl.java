import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface azl {
   azl a(String var1);

   void b(String var1);

   public static class a implements azl {
      private final Multimap<String, String> a;
      private final Supplier<String> b;
      @Nullable
      private String c;

      public a() {
         this(HashMultimap.create(), () -> "");
      }

      private a(Multimap<String, String> $$0, Supplier<String> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private String c() {
         if (this.c == null) {
            this.c = this.b.get();
         }

         return this.c;
      }

      @Override
      public azl a(String $$0) {
         return new azl.a(this.a, () -> this.c() + $$0);
      }

      @Override
      public void b(String $$0) {
         this.a.put(this.c(), $$0);
      }

      public Multimap<String, String> a() {
         return ImmutableMultimap.copyOf(this.a);
      }

      public Optional<String> b() {
         Multimap<String, String> $$0 = this.a();
         if (!$$0.isEmpty()) {
            String $$1 = $$0.asMap()
               .entrySet()
               .stream()
               .map($$0x -> " at " + (String)$$0x.getKey() + ": " + String.join("; ", (Iterable<? extends CharSequence>)$$0x.getValue()))
               .collect(Collectors.joining("\n"));
            return Optional.of($$1);
         } else {
            return Optional.empty();
         }
      }
   }
}
