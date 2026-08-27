import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bmq {
   private final Map<bmm, bmn> a;

   public bmq(Map<bmm, bmn> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bmn d(bmm $$0) {
      bmn $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + kc.v.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bmm $$0) {
      return this.d($$0).f();
   }

   public double b(bmm $$0) {
      return this.d($$0).b();
   }

   public double a(bmm $$0, UUID $$1) {
      bmp $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + kc.v.b($$0));
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bmn a(Consumer<bmn> $$0, bmm $$1) {
      bmn $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bmn $$3 = new bmn($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bmq.a a() {
      return new bmq.a();
   }

   public boolean c(bmm $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bmm $$0, UUID $$1) {
      bmn $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bmm, bmn> a = Maps.newHashMap();
      private boolean b;

      private bmn b(bmm $$0) {
         bmn $$1 = new bmn($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + kc.v.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bmq.a a(bmm $$0) {
         this.b($$0);
         return this;
      }

      public bmq.a a(bmm $$0, double $$1) {
         bmn $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bmq a() {
         this.b = true;
         return new bmq(this.a);
      }
   }
}
