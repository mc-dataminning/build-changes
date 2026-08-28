import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class byj {
   private final Map<je<byf>, byg> a;

   byj(Map<je<byf>, byg> $$0) {
      this.a = $$0;
   }

   private byg d(je<byf> $$0) {
      byg $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(je<byf> $$0) {
      return this.d($$0).g();
   }

   public double b(je<byf> $$0) {
      return this.d($$0).b();
   }

   public double a(je<byf> $$0, alg $$1) {
      byi $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.b();
      }
   }

   @Nullable
   public byg a(Consumer<byg> $$0, je<byf> $$1) {
      byg $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         byg $$3 = new byg($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static byj.a a() {
      return new byj.a();
   }

   public boolean c(je<byf> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(je<byf> $$0, alg $$1) {
      byg $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<je<byf>, byg> a = ImmutableMap.builder();
      private boolean b;

      private byg b(je<byf> $$0) {
         byg $$1 = new byg($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public byj.a a(je<byf> $$0) {
         this.b($$0);
         return this;
      }

      public byj.a a(je<byf> $$0, double $$1) {
         byg $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public byj a() {
         this.b = true;
         return new byj(this.a.buildKeepingLast());
      }
   }
}
