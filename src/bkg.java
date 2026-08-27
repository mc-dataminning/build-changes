import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bkg {
   private final Map<bkc, bkd> a;

   public bkg(Map<bkc, bkd> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bkd d(bkc $$0) {
      bkd $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + jd.v.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bkc $$0) {
      return this.d($$0).f();
   }

   public double b(bkc $$0) {
      return this.d($$0).b();
   }

   public double a(bkc $$0, UUID $$1) {
      bkf $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + jd.v.b($$0));
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public bkd a(Consumer<bkd> $$0, bkc $$1) {
      bkd $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bkd $$3 = new bkd($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bkg.a a() {
      return new bkg.a();
   }

   public boolean c(bkc $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bkc $$0, UUID $$1) {
      bkd $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bkc, bkd> a = Maps.newHashMap();
      private boolean b;

      private bkd b(bkc $$0) {
         bkd $$1 = new bkd($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + jd.v.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bkg.a a(bkc $$0) {
         this.b($$0);
         return this;
      }

      public bkg.a a(bkc $$0, double $$1) {
         bkd $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bkg a() {
         this.b = true;
         return new bkg(this.a);
      }
   }
}
