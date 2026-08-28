import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bxf {
   private final Map<jr<bxb>, bxc> a;

   bxf(Map<jr<bxb>, bxc> $$0) {
      this.a = $$0;
   }

   private bxc d(jr<bxb> $$0) {
      bxc $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jr<bxb> $$0) {
      return this.d($$0).g();
   }

   public double b(jr<bxb> $$0) {
      return this.d($$0).b();
   }

   public double a(jr<bxb> $$0, aku $$1) {
      bxe $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.c();
      }
   }

   @Nullable
   public bxc a(Consumer<bxc> $$0, jr<bxb> $$1) {
      bxc $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bxc $$3 = new bxc($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bxf.a a() {
      return new bxf.a();
   }

   public boolean c(jr<bxb> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jr<bxb> $$0, aku $$1) {
      bxc $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jr<bxb>, bxc> a = ImmutableMap.builder();
      private boolean b;

      private bxc b(jr<bxb> $$0) {
         bxc $$1 = new bxc($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bxf.a a(jr<bxb> $$0) {
         this.b($$0);
         return this;
      }

      public bxf.a a(jr<bxb> $$0, double $$1) {
         bxc $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bxf a() {
         this.b = true;
         return new bxf(this.a.buildKeepingLast());
      }
   }
}
