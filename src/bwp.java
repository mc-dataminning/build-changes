import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bwp {
   private final Map<jr<bwl>, bwm> a;

   bwp(Map<jr<bwl>, bwm> $$0) {
      this.a = $$0;
   }

   private bwm d(jr<bwl> $$0) {
      bwm $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jr<bwl> $$0) {
      return this.d($$0).g();
   }

   public double b(jr<bwl> $$0) {
      return this.d($$0).b();
   }

   public double a(jr<bwl> $$0, akv $$1) {
      bwo $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bwm a(Consumer<bwm> $$0, jr<bwl> $$1) {
      bwm $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bwm $$3 = new bwm($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bwp.a a() {
      return new bwp.a();
   }

   public boolean c(jr<bwl> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jr<bwl> $$0, akv $$1) {
      bwm $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jr<bwl>, bwm> a = ImmutableMap.builder();
      private boolean b;

      private bwm b(jr<bwl> $$0) {
         bwm $$1 = new bwm($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bwp.a a(jr<bwl> $$0) {
         this.b($$0);
         return this;
      }

      public bwp.a a(jr<bwl> $$0, double $$1) {
         bwm $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bwp a() {
         this.b = true;
         return new bwp(this.a.buildKeepingLast());
      }
   }
}
