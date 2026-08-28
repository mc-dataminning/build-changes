import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bur {
   private final Map<ji<bun>, buo> a;

   bur(Map<ji<bun>, buo> $$0) {
      this.a = $$0;
   }

   private buo d(ji<bun> $$0) {
      buo $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(ji<bun> $$0) {
      return this.d($$0).f();
   }

   public double b(ji<bun> $$0) {
      return this.d($$0).b();
   }

   public double a(ji<bun> $$0, UUID $$1) {
      buq $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public buo a(Consumer<buo> $$0, ji<bun> $$1) {
      buo $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         buo $$3 = new buo($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bur.a a() {
      return new bur.a();
   }

   public boolean c(ji<bun> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(ji<bun> $$0, UUID $$1) {
      buo $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<ji<bun>, buo> a = ImmutableMap.builder();
      private boolean b;

      private buo b(ji<bun> $$0) {
         buo $$1 = new buo($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bur.a a(ji<bun> $$0) {
         this.b($$0);
         return this;
      }

      public bur.a a(ji<bun> $$0, double $$1) {
         buo $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bur a() {
         this.b = true;
         return new bur(this.a.buildKeepingLast());
      }
   }
}
