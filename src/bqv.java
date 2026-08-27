import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bqv {
   private final Map<il<bqr>, bqs> a;

   bqv(Map<il<bqr>, bqs> $$0) {
      this.a = $$0;
   }

   private bqs d(il<bqr> $$0) {
      bqs $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(il<bqr> $$0) {
      return this.d($$0).f();
   }

   public double b(il<bqr> $$0) {
      return this.d($$0).b();
   }

   public double a(il<bqr> $$0, UUID $$1) {
      bqu $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bqs a(Consumer<bqs> $$0, il<bqr> $$1) {
      bqs $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bqs $$3 = new bqs($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bqv.a a() {
      return new bqv.a();
   }

   public boolean c(il<bqr> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(il<bqr> $$0, UUID $$1) {
      bqs $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<il<bqr>, bqs> a = ImmutableMap.builder();
      private boolean b;

      private bqs b(il<bqr> $$0) {
         bqs $$1 = new bqs($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bqv.a a(il<bqr> $$0) {
         this.b($$0);
         return this;
      }

      public bqv.a a(il<bqr> $$0, double $$1) {
         bqs $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bqv a() {
         this.b = true;
         return new bqv(this.a.buildKeepingLast());
      }
   }
}
