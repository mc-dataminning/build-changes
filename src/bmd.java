import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bmd {
   private final Map<blz, bma> a;

   public bmd(Map<blz, bma> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bma d(blz $$0) {
      bma $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + jy.v.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(blz $$0) {
      return this.d($$0).f();
   }

   public double b(blz $$0) {
      return this.d($$0).b();
   }

   public double a(blz $$0, UUID $$1) {
      bmc $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + jy.v.b($$0));
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bma a(Consumer<bma> $$0, blz $$1) {
      bma $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bma $$3 = new bma($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bmd.a a() {
      return new bmd.a();
   }

   public boolean c(blz $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(blz $$0, UUID $$1) {
      bma $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<blz, bma> a = Maps.newHashMap();
      private boolean b;

      private bma b(blz $$0) {
         bma $$1 = new bma($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + jy.v.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bmd.a a(blz $$0) {
         this.b($$0);
         return this;
      }

      public bmd.a a(blz $$0, double $$1) {
         bma $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bmd a() {
         this.b = true;
         return new bmd(this.a);
      }
   }
}
