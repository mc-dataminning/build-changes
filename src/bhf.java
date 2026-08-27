import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bhf {
   private final Map<bhb, bhc> a;

   public bhf(Map<bhb, bhc> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bhc d(bhb $$0) {
      bhc $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + jb.v.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bhb $$0) {
      return this.d($$0).f();
   }

   public double b(bhb $$0) {
      return this.d($$0).b();
   }

   public double a(bhb $$0, UUID $$1) {
      bhe $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + jb.v.b($$0));
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public bhc a(Consumer<bhc> $$0, bhb $$1) {
      bhc $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bhc $$3 = new bhc($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bhf.a a() {
      return new bhf.a();
   }

   public boolean c(bhb $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bhb $$0, UUID $$1) {
      bhc $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bhb, bhc> a = Maps.newHashMap();
      private boolean b;

      private bhc b(bhb $$0) {
         bhc $$1 = new bhc($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + jb.v.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bhf.a a(bhb $$0) {
         this.b($$0);
         return this;
      }

      public bhf.a a(bhb $$0, double $$1) {
         bhc $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bhf a() {
         this.b = true;
         return new bhf(this.a);
      }
   }
}
