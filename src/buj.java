import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class buj {
   private final Map<jj<buf>, bug> a;

   buj(Map<jj<buf>, bug> $$0) {
      this.a = $$0;
   }

   private bug d(jj<buf> $$0) {
      bug $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jj<buf> $$0) {
      return this.d($$0).f();
   }

   public double b(jj<buf> $$0) {
      return this.d($$0).b();
   }

   public double a(jj<buf> $$0, UUID $$1) {
      bui $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public bug a(Consumer<bug> $$0, jj<buf> $$1) {
      bug $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bug $$3 = new bug($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static buj.a a() {
      return new buj.a();
   }

   public boolean c(jj<buf> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jj<buf> $$0, UUID $$1) {
      bug $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jj<buf>, bug> a = ImmutableMap.builder();
      private boolean b;

      private bug b(jj<buf> $$0) {
         bug $$1 = new bug($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public buj.a a(jj<buf> $$0) {
         this.b($$0);
         return this;
      }

      public buj.a a(jj<buf> $$0, double $$1) {
         bug $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public buj a() {
         this.b = true;
         return new buj(this.a.buildKeepingLast());
      }
   }
}
