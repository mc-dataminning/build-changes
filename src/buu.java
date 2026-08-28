import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class buu {
   private final Map<ji<buq>, bur> a;

   buu(Map<ji<buq>, bur> $$0) {
      this.a = $$0;
   }

   private bur d(ji<buq> $$0) {
      bur $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(ji<buq> $$0) {
      return this.d($$0).f();
   }

   public double b(ji<buq> $$0) {
      return this.d($$0).b();
   }

   public double a(ji<buq> $$0, UUID $$1) {
      but $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public bur a(Consumer<bur> $$0, ji<buq> $$1) {
      bur $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bur $$3 = new bur($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static buu.a a() {
      return new buu.a();
   }

   public boolean c(ji<buq> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(ji<buq> $$0, UUID $$1) {
      bur $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<ji<buq>, bur> a = ImmutableMap.builder();
      private boolean b;

      private bur b(ji<buq> $$0) {
         bur $$1 = new bur($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public buu.a a(ji<buq> $$0) {
         this.b($$0);
         return this;
      }

      public buu.a a(ji<buq> $$0, double $$1) {
         bur $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public buu a() {
         this.b = true;
         return new buu(this.a.buildKeepingLast());
      }
   }
}
