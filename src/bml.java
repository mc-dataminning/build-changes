import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bml {
   private final Map<bmh, bmi> a;

   public bml(Map<bmh, bmi> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bmi d(bmh $$0) {
      bmi $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + jy.v.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bmh $$0) {
      return this.d($$0).f();
   }

   public double b(bmh $$0) {
      return this.d($$0).b();
   }

   public double a(bmh $$0, UUID $$1) {
      bmk $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + jy.v.b($$0));
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bmi a(Consumer<bmi> $$0, bmh $$1) {
      bmi $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bmi $$3 = new bmi($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bml.a a() {
      return new bml.a();
   }

   public boolean c(bmh $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bmh $$0, UUID $$1) {
      bmi $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bmh, bmi> a = Maps.newHashMap();
      private boolean b;

      private bmi b(bmh $$0) {
         bmi $$1 = new bmi($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + jy.v.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bml.a a(bmh $$0) {
         this.b($$0);
         return this;
      }

      public bml.a a(bmh $$0, double $$1) {
         bmi $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bml a() {
         this.b = true;
         return new bml(this.a);
      }
   }
}
