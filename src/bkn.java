import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bkn {
   private final Map<bkj, bkk> a;

   public bkn(Map<bkj, bkk> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bkk d(bkj $$0) {
      bkk $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + jd.v.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bkj $$0) {
      return this.d($$0).f();
   }

   public double b(bkj $$0) {
      return this.d($$0).b();
   }

   public double a(bkj $$0, UUID $$1) {
      bkm $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + jd.v.b($$0));
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public bkk a(Consumer<bkk> $$0, bkj $$1) {
      bkk $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bkk $$3 = new bkk($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bkn.a a() {
      return new bkn.a();
   }

   public boolean c(bkj $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bkj $$0, UUID $$1) {
      bkk $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bkj, bkk> a = Maps.newHashMap();
      private boolean b;

      private bkk b(bkj $$0) {
         bkk $$1 = new bkk($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + jd.v.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bkn.a a(bkj $$0) {
         this.b($$0);
         return this;
      }

      public bkn.a a(bkj $$0, double $$1) {
         bkk $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bkn a() {
         this.b = true;
         return new bkn(this.a);
      }
   }
}
