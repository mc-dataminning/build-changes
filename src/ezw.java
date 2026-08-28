import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ezw {
   private final arq a;
   private final baz b;
   private final Map<alg, ezw.b> c;
   private final float d;

   public ezw(arq $$0, baz $$1, Map<alg, ezw.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public arq a() {
      return this.a;
   }

   public baz b() {
      return this.b;
   }

   public void a(alg $$0, Consumer<czn> $$1) {
      ezw.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float c() {
      return this.d;
   }

   public static class a {
      private final arq a;
      private final baz.a b = new baz.a();
      private final Map<alg, ezw.b> c = Maps.newHashMap();
      private float d;

      public a(arq $$0) {
         this.a = $$0;
      }

      public arq a() {
         return this.a;
      }

      public <T> ezw.a a(bax<T> $$0, T $$1) {
         this.b.a($$0, $$1);
         return this;
      }

      public <T> ezw.a b(bax<T> $$0, @Nullable T $$1) {
         this.b.b($$0, $$1);
         return this;
      }

      public <T> T a(bax<T> $$0) {
         return this.b.a($$0);
      }

      @Nullable
      public <T> T b(bax<T> $$0) {
         return this.b.b($$0);
      }

      public ezw.a a(alg $$0, ezw.b $$1) {
         ezw.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public ezw.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public ezw a(bay $$0) {
         baz $$1 = this.b.a($$0);
         return new ezw(this.a, $$1, this.c, this.d);
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<czn> var1);
   }
}
