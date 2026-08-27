import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bkr {
   private final Map<bkn, bko> a;

   public bkr(Map<bkn, bko> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bko d(bkn $$0) {
      bko $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + jb.v.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bkn $$0) {
      return this.d($$0).f();
   }

   public double b(bkn $$0) {
      return this.d($$0).b();
   }

   public double a(bkn $$0, UUID $$1) {
      bkq $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + jb.v.b($$0));
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bko a(Consumer<bko> $$0, bkn $$1) {
      bko $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bko $$3 = new bko($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bkr.a a() {
      return new bkr.a();
   }

   public boolean c(bkn $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bkn $$0, UUID $$1) {
      bko $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bkn, bko> a = Maps.newHashMap();
      private boolean b;

      private bko b(bkn $$0) {
         bko $$1 = new bko($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + jb.v.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bkr.a a(bkn $$0) {
         this.b($$0);
         return this;
      }

      public bkr.a a(bkn $$0, double $$1) {
         bko $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bkr a() {
         this.b = true;
         return new bkr(this.a);
      }
   }
}
