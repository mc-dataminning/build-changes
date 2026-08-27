import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class btu {
   private final Map<ja<btq>, btr> a;

   btu(Map<ja<btq>, btr> $$0) {
      this.a = $$0;
   }

   private btr d(ja<btq> $$0) {
      btr $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(ja<btq> $$0) {
      return this.d($$0).f();
   }

   public double b(ja<btq> $$0) {
      return this.d($$0).b();
   }

   public double a(ja<btq> $$0, UUID $$1) {
      btt $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public btr a(Consumer<btr> $$0, ja<btq> $$1) {
      btr $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         btr $$3 = new btr($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static btu.a a() {
      return new btu.a();
   }

   public boolean c(ja<btq> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(ja<btq> $$0, UUID $$1) {
      btr $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<ja<btq>, btr> a = ImmutableMap.builder();
      private boolean b;

      private btr b(ja<btq> $$0) {
         btr $$1 = new btr($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public btu.a a(ja<btq> $$0) {
         this.b($$0);
         return this;
      }

      public btu.a a(ja<btq> $$0, double $$1) {
         btr $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public btu a() {
         this.b = true;
         return new btu(this.a.buildKeepingLast());
      }
   }
}
