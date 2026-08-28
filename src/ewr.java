import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ewr {
   private final ash a;
   private final bbp b;
   private final Map<alz, ewr.b> c;
   private final float d;

   public ewr(ash $$0, bbp $$1, Map<alz, ewr.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ash a() {
      return this.a;
   }

   public bbp b() {
      return this.b;
   }

   public void a(alz $$0, Consumer<cxo> $$1) {
      ewr.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float c() {
      return this.d;
   }

   public static class a {
      private final ash a;
      private final bbp.a b = new bbp.a();
      private final Map<alz, ewr.b> c = Maps.newHashMap();
      private float d;

      public a(ash $$0) {
         this.a = $$0;
      }

      public ash a() {
         return this.a;
      }

      public <T> ewr.a a(bbn<T> $$0, T $$1) {
         this.b.a($$0, $$1);
         return this;
      }

      public <T> ewr.a b(bbn<T> $$0, @Nullable T $$1) {
         this.b.b($$0, $$1);
         return this;
      }

      public <T> T a(bbn<T> $$0) {
         return this.b.a($$0);
      }

      @Nullable
      public <T> T b(bbn<T> $$0) {
         return this.b.b($$0);
      }

      public ewr.a a(alz $$0, ewr.b $$1) {
         ewr.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public ewr.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public ewr a(bbo $$0) {
         bbp $$1 = this.b.a($$0);
         return new ewr(this.a, $$1, this.c, this.d);
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cxo> var1);
   }
}
