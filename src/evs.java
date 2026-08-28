import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class evs {
   private final arc a;
   private final baj b;
   private final Map<aku, evs.b> c;
   private final float d;

   public evs(arc $$0, baj $$1, Map<aku, evs.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public arc a() {
      return this.a;
   }

   public baj b() {
      return this.b;
   }

   public void a(aku $$0, Consumer<cwn> $$1) {
      evs.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float c() {
      return this.d;
   }

   public static class a {
      private final arc a;
      private final baj.a b = new baj.a();
      private final Map<aku, evs.b> c = Maps.newHashMap();
      private float d;

      public a(arc $$0) {
         this.a = $$0;
      }

      public arc a() {
         return this.a;
      }

      public <T> evs.a a(bah<T> $$0, T $$1) {
         this.b.a($$0, $$1);
         return this;
      }

      public <T> evs.a b(bah<T> $$0, @Nullable T $$1) {
         this.b.b($$0, $$1);
         return this;
      }

      public <T> T a(bah<T> $$0) {
         return this.b.a($$0);
      }

      @Nullable
      public <T> T b(bah<T> $$0) {
         return this.b.b($$0);
      }

      public evs.a a(aku $$0, evs.b $$1) {
         evs.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public evs.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public evs a(bai $$0) {
         baj $$1 = this.b.a($$0);
         return new evs(this.a, $$1, this.c, this.d);
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cwn> var1);
   }
}
