import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bkl {
   private final Map<bkh, bki> a;

   public bkl(Map<bkh, bki> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bki d(bkh $$0) {
      bki $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + jd.v.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bkh $$0) {
      return this.d($$0).f();
   }

   public double b(bkh $$0) {
      return this.d($$0).b();
   }

   public double a(bkh $$0, UUID $$1) {
      bkk $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + jd.v.b($$0));
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public bki a(Consumer<bki> $$0, bkh $$1) {
      bki $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bki $$3 = new bki($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bkl.a a() {
      return new bkl.a();
   }

   public boolean c(bkh $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bkh $$0, UUID $$1) {
      bki $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bkh, bki> a = Maps.newHashMap();
      private boolean b;

      private bki b(bkh $$0) {
         bki $$1 = new bki($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + jd.v.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bkl.a a(bkh $$0) {
         this.b($$0);
         return this;
      }

      public bkl.a a(bkh $$0, double $$1) {
         bki $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bkl a() {
         this.b = true;
         return new bkl(this.a);
      }
   }
}
