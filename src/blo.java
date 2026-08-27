import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class blo {
   private final Map<blk, bll> a;

   public blo(Map<blk, bll> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bll d(blk $$0) {
      bll $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + jy.v.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(blk $$0) {
      return this.d($$0).f();
   }

   public double b(blk $$0) {
      return this.d($$0).b();
   }

   public double a(blk $$0, UUID $$1) {
      bln $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + jy.v.b($$0));
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bll a(Consumer<bll> $$0, blk $$1) {
      bll $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bll $$3 = new bll($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static blo.a a() {
      return new blo.a();
   }

   public boolean c(blk $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(blk $$0, UUID $$1) {
      bll $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<blk, bll> a = Maps.newHashMap();
      private boolean b;

      private bll b(blk $$0) {
         bll $$1 = new bll($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + jy.v.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public blo.a a(blk $$0) {
         this.b($$0);
         return this;
      }

      public blo.a a(blk $$0, double $$1) {
         bll $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public blo a() {
         this.b = true;
         return new blo(this.a);
      }
   }
}
