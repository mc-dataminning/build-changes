import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bpk {
   private final Map<ij<bpg>, bph> a;

   bpk(Map<ij<bpg>, bph> $$0) {
      this.a = $$0;
   }

   private bph d(ij<bpg> $$0) {
      bph $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(ij<bpg> $$0) {
      return this.d($$0).f();
   }

   public double b(ij<bpg> $$0) {
      return this.d($$0).b();
   }

   public double a(ij<bpg> $$0, UUID $$1) {
      bpj $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bph a(Consumer<bph> $$0, ij<bpg> $$1) {
      bph $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bph $$3 = new bph($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bpk.a a() {
      return new bpk.a();
   }

   public boolean c(ij<bpg> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(ij<bpg> $$0, UUID $$1) {
      bph $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<ij<bpg>, bph> a = ImmutableMap.builder();
      private boolean b;

      private bph b(ij<bpg> $$0) {
         bph $$1 = new bph($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bpk.a a(ij<bpg> $$0) {
         this.b($$0);
         return this;
      }

      public bpk.a a(ij<bpg> $$0, double $$1) {
         bph $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bpk a() {
         this.b = true;
         return new bpk(this.a.buildKeepingLast());
      }
   }
}
