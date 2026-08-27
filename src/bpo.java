import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bpo {
   private final Map<ij<bpk>, bpl> a;

   bpo(Map<ij<bpk>, bpl> $$0) {
      this.a = $$0;
   }

   private bpl d(ij<bpk> $$0) {
      bpl $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(ij<bpk> $$0) {
      return this.d($$0).f();
   }

   public double b(ij<bpk> $$0) {
      return this.d($$0).b();
   }

   public double a(ij<bpk> $$0, UUID $$1) {
      bpn $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bpl a(Consumer<bpl> $$0, ij<bpk> $$1) {
      bpl $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bpl $$3 = new bpl($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bpo.a a() {
      return new bpo.a();
   }

   public boolean c(ij<bpk> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(ij<bpk> $$0, UUID $$1) {
      bpl $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<ij<bpk>, bpl> a = ImmutableMap.builder();
      private boolean b;

      private bpl b(ij<bpk> $$0) {
         bpl $$1 = new bpl($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bpo.a a(ij<bpk> $$0) {
         this.b($$0);
         return this;
      }

      public bpo.a a(ij<bpk> $$0, double $$1) {
         bpl $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bpo a() {
         this.b = true;
         return new bpo(this.a.buildKeepingLast());
      }
   }
}
