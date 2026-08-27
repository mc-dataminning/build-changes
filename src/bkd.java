import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bkd {
   private final Map<bjz, bka> a;

   public bkd(Map<bjz, bka> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bka d(bjz $$0) {
      bka $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + jb.v.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bjz $$0) {
      return this.d($$0).f();
   }

   public double b(bjz $$0) {
      return this.d($$0).b();
   }

   public double a(bjz $$0, UUID $$1) {
      bkc $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + jb.v.b($$0));
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public bka a(Consumer<bka> $$0, bjz $$1) {
      bka $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bka $$3 = new bka($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bkd.a a() {
      return new bkd.a();
   }

   public boolean c(bjz $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bjz $$0, UUID $$1) {
      bka $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bjz, bka> a = Maps.newHashMap();
      private boolean b;

      private bka b(bjz $$0) {
         bka $$1 = new bka($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + jb.v.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bkd.a a(bjz $$0) {
         this.b($$0);
         return this;
      }

      public bkd.a a(bjz $$0, double $$1) {
         bka $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bkd a() {
         this.b = true;
         return new bkd(this.a);
      }
   }
}
