import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bqd {
   private final Map<il<bpz>, bqa> a;

   bqd(Map<il<bpz>, bqa> $$0) {
      this.a = $$0;
   }

   private bqa d(il<bpz> $$0) {
      bqa $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(il<bpz> $$0) {
      return this.d($$0).f();
   }

   public double b(il<bpz> $$0) {
      return this.d($$0).b();
   }

   public double a(il<bpz> $$0, UUID $$1) {
      bqc $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bqa a(Consumer<bqa> $$0, il<bpz> $$1) {
      bqa $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bqa $$3 = new bqa($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bqd.a a() {
      return new bqd.a();
   }

   public boolean c(il<bpz> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(il<bpz> $$0, UUID $$1) {
      bqa $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<il<bpz>, bqa> a = ImmutableMap.builder();
      private boolean b;

      private bqa b(il<bpz> $$0) {
         bqa $$1 = new bqa($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bqd.a a(il<bpz> $$0) {
         this.b($$0);
         return this;
      }

      public bqd.a a(il<bpz> $$0, double $$1) {
         bqa $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bqd a() {
         this.b = true;
         return new bqd(this.a.buildKeepingLast());
      }
   }
}
