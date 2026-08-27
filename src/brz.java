import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class brz {
   private final Map<in<brv>, brw> a;

   brz(Map<in<brv>, brw> $$0) {
      this.a = $$0;
   }

   private brw d(in<brv> $$0) {
      brw $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(in<brv> $$0) {
      return this.d($$0).f();
   }

   public double b(in<brv> $$0) {
      return this.d($$0).b();
   }

   public double a(in<brv> $$0, UUID $$1) {
      bry $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public brw a(Consumer<brw> $$0, in<brv> $$1) {
      brw $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         brw $$3 = new brw($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static brz.a a() {
      return new brz.a();
   }

   public boolean c(in<brv> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(in<brv> $$0, UUID $$1) {
      brw $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<in<brv>, brw> a = ImmutableMap.builder();
      private boolean b;

      private brw b(in<brv> $$0) {
         brw $$1 = new brw($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public brz.a a(in<brv> $$0) {
         this.b($$0);
         return this;
      }

      public brz.a a(in<brv> $$0, double $$1) {
         brw $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public brz a() {
         this.b = true;
         return new brz(this.a.buildKeepingLast());
      }
   }
}
