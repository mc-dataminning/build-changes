import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bwm {
   private final Map<jr<bwi>, bwj> a;

   bwm(Map<jr<bwi>, bwj> $$0) {
      this.a = $$0;
   }

   private bwj d(jr<bwi> $$0) {
      bwj $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jr<bwi> $$0) {
      return this.d($$0).g();
   }

   public double b(jr<bwi> $$0) {
      return this.d($$0).b();
   }

   public double a(jr<bwi> $$0, aku $$1) {
      bwl $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bwj a(Consumer<bwj> $$0, jr<bwi> $$1) {
      bwj $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bwj $$3 = new bwj($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bwm.a a() {
      return new bwm.a();
   }

   public boolean c(jr<bwi> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jr<bwi> $$0, aku $$1) {
      bwj $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jr<bwi>, bwj> a = ImmutableMap.builder();
      private boolean b;

      private bwj b(jr<bwi> $$0) {
         bwj $$1 = new bwj($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bwm.a a(jr<bwi> $$0) {
         this.b($$0);
         return this;
      }

      public bwm.a a(jr<bwi> $$0, double $$1) {
         bwj $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bwm a() {
         this.b = true;
         return new bwm(this.a.buildKeepingLast());
      }
   }
}
