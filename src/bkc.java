import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bkc {
   private final Map<bjy, bjz> a;

   public bkc(Map<bjy, bjz> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bjz d(bjy $$0) {
      bjz $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + jc.v.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bjy $$0) {
      return this.d($$0).f();
   }

   public double b(bjy $$0) {
      return this.d($$0).b();
   }

   public double a(bjy $$0, UUID $$1) {
      bkb $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + jc.v.b($$0));
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public bjz a(Consumer<bjz> $$0, bjy $$1) {
      bjz $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bjz $$3 = new bjz($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bkc.a a() {
      return new bkc.a();
   }

   public boolean c(bjy $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bjy $$0, UUID $$1) {
      bjz $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bjy, bjz> a = Maps.newHashMap();
      private boolean b;

      private bjz b(bjy $$0) {
         bjz $$1 = new bjz($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + jc.v.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bkc.a a(bjy $$0) {
         this.b($$0);
         return this;
      }

      public bkc.a a(bjy $$0, double $$1) {
         bjz $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bkc a() {
         this.b = true;
         return new bkc(this.a);
      }
   }
}
