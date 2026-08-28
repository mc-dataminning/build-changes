import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bzk {
   private final Map<jg<bzg>, bzh> a;

   bzk(Map<jg<bzg>, bzh> $$0) {
      this.a = $$0;
   }

   private bzh d(jg<bzg> $$0) {
      bzh $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jg<bzg> $$0) {
      return this.d($$0).g();
   }

   public double b(jg<bzg> $$0) {
      return this.d($$0).b();
   }

   public double a(jg<bzg> $$0, alr $$1) {
      bzj $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.b();
      }
   }

   @Nullable
   public bzh a(Consumer<bzh> $$0, jg<bzg> $$1) {
      bzh $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bzh $$3 = new bzh($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bzk.a a() {
      return new bzk.a();
   }

   public boolean c(jg<bzg> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jg<bzg> $$0, alr $$1) {
      bzh $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jg<bzg>, bzh> a = ImmutableMap.builder();
      private boolean b;

      private bzh b(jg<bzg> $$0) {
         bzh $$1 = new bzh($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bzk.a a(jg<bzg> $$0) {
         this.b($$0);
         return this;
      }

      public bzk.a a(jg<bzg> $$0, double $$1) {
         bzh $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bzk a() {
         this.b = true;
         return new bzk(this.a.buildKeepingLast());
      }
   }
}
