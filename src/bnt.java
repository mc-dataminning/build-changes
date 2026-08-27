import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bnt {
   private final Map<ih<bnp>, bnq> a;

   bnt(Map<ih<bnp>, bnq> $$0) {
      this.a = $$0;
   }

   private bnq d(ih<bnp> $$0) {
      bnq $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(ih<bnp> $$0) {
      return this.d($$0).f();
   }

   public double b(ih<bnp> $$0) {
      return this.d($$0).b();
   }

   public double a(ih<bnp> $$0, UUID $$1) {
      bns $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bnq a(Consumer<bnq> $$0, ih<bnp> $$1) {
      bnq $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bnq $$3 = new bnq($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bnt.a a() {
      return new bnt.a();
   }

   public boolean c(ih<bnp> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(ih<bnp> $$0, UUID $$1) {
      bnq $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<ih<bnp>, bnq> a = ImmutableMap.builder();
      private boolean b;

      private bnq b(ih<bnp> $$0) {
         bnq $$1 = new bnq($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bnt.a a(ih<bnp> $$0) {
         this.b($$0);
         return this;
      }

      public bnt.a a(ih<bnp> $$0, double $$1) {
         bnq $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bnt a() {
         this.b = true;
         return new bnt(this.a.buildKeepingLast());
      }
   }
}
