import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bqu {
   private final Map<il<bqq>, bqr> a;

   bqu(Map<il<bqq>, bqr> $$0) {
      this.a = $$0;
   }

   private bqr d(il<bqq> $$0) {
      bqr $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(il<bqq> $$0) {
      return this.d($$0).f();
   }

   public double b(il<bqq> $$0) {
      return this.d($$0).b();
   }

   public double a(il<bqq> $$0, UUID $$1) {
      bqt $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bqr a(Consumer<bqr> $$0, il<bqq> $$1) {
      bqr $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bqr $$3 = new bqr($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bqu.a a() {
      return new bqu.a();
   }

   public boolean c(il<bqq> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(il<bqq> $$0, UUID $$1) {
      bqr $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<il<bqq>, bqr> a = ImmutableMap.builder();
      private boolean b;

      private bqr b(il<bqq> $$0) {
         bqr $$1 = new bqr($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bqu.a a(il<bqq> $$0) {
         this.b($$0);
         return this;
      }

      public bqu.a a(il<bqq> $$0, double $$1) {
         bqr $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bqu a() {
         this.b = true;
         return new bqu(this.a.buildKeepingLast());
      }
   }
}
