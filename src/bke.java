import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bke {
   private final Map<bka, bkb> a;

   public bke(Map<bka, bkb> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bkb d(bka $$0) {
      bkb $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + jb.v.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bka $$0) {
      return this.d($$0).f();
   }

   public double b(bka $$0) {
      return this.d($$0).b();
   }

   public double a(bka $$0, UUID $$1) {
      bkd $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + jb.v.b($$0));
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public bkb a(Consumer<bkb> $$0, bka $$1) {
      bkb $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bkb $$3 = new bkb($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bke.a a() {
      return new bke.a();
   }

   public boolean c(bka $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bka $$0, UUID $$1) {
      bkb $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bka, bkb> a = Maps.newHashMap();
      private boolean b;

      private bkb b(bka $$0) {
         bkb $$1 = new bkb($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + jb.v.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bke.a a(bka $$0) {
         this.b($$0);
         return this;
      }

      public bke.a a(bka $$0, double $$1) {
         bkb $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bke a() {
         this.b = true;
         return new bke(this.a);
      }
   }
}
