import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bna {
   private final Map<bmw, bmx> a;

   public bna(Map<bmw, bmx> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bmx d(bmw $$0) {
      bmx $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + kb.u.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bmw $$0) {
      return this.d($$0).f();
   }

   public double b(bmw $$0) {
      return this.d($$0).b();
   }

   public double a(bmw $$0, UUID $$1) {
      bmz $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + kb.u.b($$0));
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bmx a(Consumer<bmx> $$0, bmw $$1) {
      bmx $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bmx $$3 = new bmx($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bna.a a() {
      return new bna.a();
   }

   public boolean c(bmw $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bmw $$0, UUID $$1) {
      bmx $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bmw, bmx> a = Maps.newHashMap();
      private boolean b;

      private bmx b(bmw $$0) {
         bmx $$1 = new bmx($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + kb.u.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bna.a a(bmw $$0) {
         this.b($$0);
         return this;
      }

      public bna.a a(bmw $$0, double $$1) {
         bmx $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bna a() {
         this.b = true;
         return new bna(this.a);
      }
   }
}
