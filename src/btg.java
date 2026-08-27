import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class btg {
   private final Map<iw<btc>, btd> a;

   btg(Map<iw<btc>, btd> $$0) {
      this.a = $$0;
   }

   private btd d(iw<btc> $$0) {
      btd $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(iw<btc> $$0) {
      return this.d($$0).f();
   }

   public double b(iw<btc> $$0) {
      return this.d($$0).b();
   }

   public double a(iw<btc> $$0, UUID $$1) {
      btf $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public btd a(Consumer<btd> $$0, iw<btc> $$1) {
      btd $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         btd $$3 = new btd($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static btg.a a() {
      return new btg.a();
   }

   public boolean c(iw<btc> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(iw<btc> $$0, UUID $$1) {
      btd $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<iw<btc>, btd> a = ImmutableMap.builder();
      private boolean b;

      private btd b(iw<btc> $$0) {
         btd $$1 = new btd($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public btg.a a(iw<btc> $$0) {
         this.b($$0);
         return this;
      }

      public btg.a a(iw<btc> $$0, double $$1) {
         btd $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public btg a() {
         this.b = true;
         return new btg(this.a.buildKeepingLast());
      }
   }
}
