import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bwo {
   private final Map<jr<bwk>, bwl> a;

   bwo(Map<jr<bwk>, bwl> $$0) {
      this.a = $$0;
   }

   private bwl d(jr<bwk> $$0) {
      bwl $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jr<bwk> $$0) {
      return this.d($$0).g();
   }

   public double b(jr<bwk> $$0) {
      return this.d($$0).b();
   }

   public double a(jr<bwk> $$0, akv $$1) {
      bwn $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bwl a(Consumer<bwl> $$0, jr<bwk> $$1) {
      bwl $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bwl $$3 = new bwl($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bwo.a a() {
      return new bwo.a();
   }

   public boolean c(jr<bwk> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jr<bwk> $$0, akv $$1) {
      bwl $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jr<bwk>, bwl> a = ImmutableMap.builder();
      private boolean b;

      private bwl b(jr<bwk> $$0) {
         bwl $$1 = new bwl($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bwo.a a(jr<bwk> $$0) {
         this.b($$0);
         return this;
      }

      public bwo.a a(jr<bwk> $$0, double $$1) {
         bwl $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bwo a() {
         this.b = true;
         return new bwo(this.a.buildKeepingLast());
      }
   }
}
