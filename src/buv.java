import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class buv {
   private final Map<jm<bur>, bus> a;

   buv(Map<jm<bur>, bus> $$0) {
      this.a = $$0;
   }

   private bus d(jm<bur> $$0) {
      bus $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jm<bur> $$0) {
      return this.d($$0).f();
   }

   public double b(jm<bur> $$0) {
      return this.d($$0).b();
   }

   public double a(jm<bur> $$0, akr $$1) {
      buu $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bus a(Consumer<bus> $$0, jm<bur> $$1) {
      bus $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bus $$3 = new bus($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static buv.a a() {
      return new buv.a();
   }

   public boolean c(jm<bur> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jm<bur> $$0, akr $$1) {
      bus $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jm<bur>, bus> a = ImmutableMap.builder();
      private boolean b;

      private bus b(jm<bur> $$0) {
         bus $$1 = new bus($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public buv.a a(jm<bur> $$0) {
         this.b($$0);
         return this;
      }

      public buv.a a(jm<bur> $$0, double $$1) {
         bus $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public buv a() {
         this.b = true;
         return new buv(this.a.buildKeepingLast());
      }
   }
}
