import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eyq {
   private final aro a;
   private final bax b;
   private final Map<ale, eyq.b> c;
   private final float d;

   public eyq(aro $$0, bax $$1, Map<ale, eyq.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public aro a() {
      return this.a;
   }

   public bax b() {
      return this.b;
   }

   public void a(ale $$0, Consumer<cys> $$1) {
      eyq.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float c() {
      return this.d;
   }

   public static class a {
      private final aro a;
      private final bax.a b = new bax.a();
      private final Map<ale, eyq.b> c = Maps.newHashMap();
      private float d;

      public a(aro $$0) {
         this.a = $$0;
      }

      public aro a() {
         return this.a;
      }

      public <T> eyq.a a(bav<T> $$0, T $$1) {
         this.b.a($$0, $$1);
         return this;
      }

      public <T> eyq.a b(bav<T> $$0, @Nullable T $$1) {
         this.b.b($$0, $$1);
         return this;
      }

      public <T> T a(bav<T> $$0) {
         return this.b.a($$0);
      }

      @Nullable
      public <T> T b(bav<T> $$0) {
         return this.b.b($$0);
      }

      public eyq.a a(ale $$0, eyq.b $$1) {
         eyq.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public eyq.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public eyq a(baw $$0) {
         bax $$1 = this.b.a($$0);
         return new eyq(this.a, $$1, this.c, this.d);
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<cys> var1);
   }
}
