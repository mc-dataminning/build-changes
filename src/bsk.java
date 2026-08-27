import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bsk {
   private final Map<iv<bsg>, bsh> a;

   bsk(Map<iv<bsg>, bsh> $$0) {
      this.a = $$0;
   }

   private bsh d(iv<bsg> $$0) {
      bsh $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(iv<bsg> $$0) {
      return this.d($$0).f();
   }

   public double b(iv<bsg> $$0) {
      return this.d($$0).b();
   }

   public double a(iv<bsg> $$0, UUID $$1) {
      bsj $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public bsh a(Consumer<bsh> $$0, iv<bsg> $$1) {
      bsh $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bsh $$3 = new bsh($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bsk.a a() {
      return new bsk.a();
   }

   public boolean c(iv<bsg> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(iv<bsg> $$0, UUID $$1) {
      bsh $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<iv<bsg>, bsh> a = ImmutableMap.builder();
      private boolean b;

      private bsh b(iv<bsg> $$0) {
         bsh $$1 = new bsh($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bsk.a a(iv<bsg> $$0) {
         this.b($$0);
         return this;
      }

      public bsk.a a(iv<bsg> $$0, double $$1) {
         bsh $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bsk a() {
         this.b = true;
         return new bsk(this.a.buildKeepingLast());
      }
   }
}
