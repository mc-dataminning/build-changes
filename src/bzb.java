import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bzb {
   private final Map<jg<byx>, byy> a;

   bzb(Map<jg<byx>, byy> $$0) {
      this.a = $$0;
   }

   private byy d(jg<byx> $$0) {
      byy $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jg<byx> $$0) {
      return this.d($$0).g();
   }

   public double b(jg<byx> $$0) {
      return this.d($$0).b();
   }

   public double a(jg<byx> $$0, alk $$1) {
      bza $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.b();
      }
   }

   @Nullable
   public byy a(Consumer<byy> $$0, jg<byx> $$1) {
      byy $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         byy $$3 = new byy($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bzb.a a() {
      return new bzb.a();
   }

   public boolean c(jg<byx> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jg<byx> $$0, alk $$1) {
      byy $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jg<byx>, byy> a = ImmutableMap.builder();
      private boolean b;

      private byy b(jg<byx> $$0) {
         byy $$1 = new byy($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bzb.a a(jg<byx> $$0) {
         this.b($$0);
         return this;
      }

      public bzb.a a(jg<byx> $$0, double $$1) {
         byy $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bzb a() {
         this.b = true;
         return new bzb(this.a.buildKeepingLast());
      }
   }
}
