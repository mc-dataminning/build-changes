import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class but {
   private final Map<jm<bup>, buq> a;

   but(Map<jm<bup>, buq> $$0) {
      this.a = $$0;
   }

   private buq d(jm<bup> $$0) {
      buq $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jm<bup> $$0) {
      return this.d($$0).f();
   }

   public double b(jm<bup> $$0) {
      return this.d($$0).b();
   }

   public double a(jm<bup> $$0, akq $$1) {
      bus $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public buq a(Consumer<buq> $$0, jm<bup> $$1) {
      buq $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         buq $$3 = new buq($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static but.a a() {
      return new but.a();
   }

   public boolean c(jm<bup> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jm<bup> $$0, akq $$1) {
      buq $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jm<bup>, buq> a = ImmutableMap.builder();
      private boolean b;

      private buq b(jm<bup> $$0) {
         buq $$1 = new buq($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public but.a a(jm<bup> $$0) {
         this.b($$0);
         return this;
      }

      public but.a a(jm<bup> $$0, double $$1) {
         buq $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public but a() {
         this.b = true;
         return new but(this.a.buildKeepingLast());
      }
   }
}
