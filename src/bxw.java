import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bxw {
   private final Map<js<bxs>, bxt> a;

   bxw(Map<js<bxs>, bxt> $$0) {
      this.a = $$0;
   }

   private bxt d(js<bxs> $$0) {
      bxt $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(js<bxs> $$0) {
      return this.d($$0).g();
   }

   public double b(js<bxs> $$0) {
      return this.d($$0).b();
   }

   public double a(js<bxs> $$0, ald $$1) {
      bxv $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bxt a(Consumer<bxt> $$0, js<bxs> $$1) {
      bxt $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bxt $$3 = new bxt($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bxw.a a() {
      return new bxw.a();
   }

   public boolean c(js<bxs> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(js<bxs> $$0, ald $$1) {
      bxt $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<js<bxs>, bxt> a = ImmutableMap.builder();
      private boolean b;

      private bxt b(js<bxs> $$0) {
         bxt $$1 = new bxt($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bxw.a a(js<bxs> $$0) {
         this.b($$0);
         return this;
      }

      public bxw.a a(js<bxs> $$0, double $$1) {
         bxt $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bxw a() {
         this.b = true;
         return new bxw(this.a.buildKeepingLast());
      }
   }
}
