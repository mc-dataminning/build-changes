import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bui {
   private final Map<jj<bue>, buf> a;

   bui(Map<jj<bue>, buf> $$0) {
      this.a = $$0;
   }

   private buf d(jj<bue> $$0) {
      buf $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jj<bue> $$0) {
      return this.d($$0).f();
   }

   public double b(jj<bue> $$0) {
      return this.d($$0).b();
   }

   public double a(jj<bue> $$0, UUID $$1) {
      buh $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public buf a(Consumer<buf> $$0, jj<bue> $$1) {
      buf $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         buf $$3 = new buf($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bui.a a() {
      return new bui.a();
   }

   public boolean c(jj<bue> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jj<bue> $$0, UUID $$1) {
      buf $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jj<bue>, buf> a = ImmutableMap.builder();
      private boolean b;

      private buf b(jj<bue> $$0) {
         buf $$1 = new buf($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bui.a a(jj<bue> $$0) {
         this.b($$0);
         return this;
      }

      public bui.a a(jj<bue> $$0, double $$1) {
         buf $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bui a() {
         this.b = true;
         return new bui(this.a.buildKeepingLast());
      }
   }
}
