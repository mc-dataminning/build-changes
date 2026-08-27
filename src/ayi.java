import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface ayi {
   ayi a(String var1);

   void b(String var1);

   public static class a implements ayi {
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

      private String b() {
         if (this.c == null) {
            this.c = this.b.get();
         }

         return this.c;
      }

      @Override
      public ayi a(String $$0) {
         return new ayi.a(this.a, () -> this.b() + $$0);
      }

      @Override
      public void b(String $$0) {
         this.a.put(this.b(), $$0);
      }

      public Multimap<String, String> a() {
         return ImmutableMultimap.copyOf(this.a);
      }
   }
}
