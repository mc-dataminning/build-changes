import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bxe {
   private final Map<jq<bxa>, bxb> a;

   bxe(Map<jq<bxa>, bxb> $$0) {
      this.a = $$0;
   }

   private bxb d(jq<bxa> $$0) {
      bxb $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jq<bxa> $$0) {
      return this.d($$0).g();
   }

   public double b(jq<bxa> $$0) {
      return this.d($$0).b();
   }

   public double a(jq<bxa> $$0, alp $$1) {
      bxd $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bxb a(Consumer<bxb> $$0, jq<bxa> $$1) {
      bxb $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bxb $$3 = new bxb($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bxe.a a() {
      return new bxe.a();
   }

   public boolean c(jq<bxa> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jq<bxa> $$0, alp $$1) {
      bxb $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jq<bxa>, bxb> a = ImmutableMap.builder();
      private boolean b;

      private bxb b(jq<bxa> $$0) {
         bxb $$1 = new bxb($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bxe.a a(jq<bxa> $$0) {
         this.b($$0);
         return this;
      }

      public bxe.a a(jq<bxa> $$0, double $$1) {
         bxb $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bxe a() {
         this.b = true;
         return new bxe(this.a.buildKeepingLast());
      }
   }
}
