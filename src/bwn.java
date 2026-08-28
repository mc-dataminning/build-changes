import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bwn {
   private final Map<jr<bwj>, bwk> a;

   bwn(Map<jr<bwj>, bwk> $$0) {
      this.a = $$0;
   }

   private bwk d(jr<bwj> $$0) {
      bwk $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jr<bwj> $$0) {
      return this.d($$0).g();
   }

   public double b(jr<bwj> $$0) {
      return this.d($$0).b();
   }

   public double a(jr<bwj> $$0, akv $$1) {
      bwm $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bwk a(Consumer<bwk> $$0, jr<bwj> $$1) {
      bwk $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bwk $$3 = new bwk($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bwn.a a() {
      return new bwn.a();
   }

   public boolean c(jr<bwj> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jr<bwj> $$0, akv $$1) {
      bwk $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jr<bwj>, bwk> a = ImmutableMap.builder();
      private boolean b;

      private bwk b(jr<bwj> $$0) {
         bwk $$1 = new bwk($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bwn.a a(jr<bwj> $$0) {
         this.b($$0);
         return this;
      }

      public bwn.a a(jr<bwj> $$0, double $$1) {
         bwk $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bwn a() {
         this.b = true;
         return new bwn(this.a.buildKeepingLast());
      }
   }
}
