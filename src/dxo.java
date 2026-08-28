import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public record dxo(dxl a, dxj b, dxj c, int d, dxm e) {

   public int a(dxl $$0) {
      return $$0 == this.a ? 0 : this.c.a($$0);
   }

   public CompletableFuture<dwk> a(dxq $$0, azx<aqz> $$1, dwk $$2) {
      if ($$2.j().d(this.a)) {
         bom $$3 = boj.f.a($$2.f(), $$0.a().ag(), this.a.f());
         return this.e.doWork($$0, this, $$1, $$2).thenApply($$1x -> this.a($$1x, $$3));
      } else {
         return this.e.doWork($$0, this, $$1, $$2);
      }
   }

   private dwk a(dwk $$0, @Nullable bom $$1) {
      if ($$0 instanceof dxe $$2 && $$2.j().d(this.a)) {
         $$2.a(this.a);
      }

      if ($$1 != null) {
         $$1.finish();
      }

      return $$0;
   }

   public static class a {
      private final dxl a;
      @Nullable
      private final dxo b;
      private dxl[] c;
      private int d = -1;
      private dxm e = dxn::a;

      protected a(dxl $$0) {
         if ($$0.c() != $$0) {
            throw new IllegalArgumentException("Not starting with the first status: " + $$0);
         } else {
            this.a = $$0;
            this.b = null;
            this.c = new dxl[0];
         }
      }

      protected a(dxl $$0, dxo $$1) {
         if ($$1.a.b() != $$0.b() - 1) {
            throw new IllegalArgumentException("Out of order status: " + $$0);
         } else {
            this.a = $$0;
            this.b = $$1;
            this.c = new dxl[]{$$1.a};
         }
      }

      public dxo.a a(dxl $$0, int $$1) {
         if ($$0.a(this.a)) {
            throw new IllegalArgumentException("Status " + $$0 + " can not be required by " + this.a);
         } else {
            dxl[] $$2 = this.c;
            int $$3 = $$1 + 1;
            if ($$3 > $$2.length) {
               this.c = new dxl[$$3];
               Arrays.fill(this.c, $$0);
            }

            for (int $$4 = 0; $$4 < Math.min($$3, $$2.length); $$4++) {
               this.c[$$4] = dxl.a($$2[$$4], $$0);
            }

            return this;
         }
      }

      public dxo.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public dxo.a a(dxm $$0) {
         this.e = $$0;
         return this;
      }

      public dxo a() {
         return new dxo(this.a, new dxj(ImmutableList.copyOf(this.c)), new dxj(ImmutableList.copyOf(this.b())), this.d, this.e);
      }

      private dxl[] b() {
         if (this.b == null) {
            return this.c;
         } else {
            int $$0 = this.a(this.b.a);
            dxj $$1 = this.b.c;
            dxl[] $$2 = new dxl[Math.max($$0 + $$1.b(), this.c.length)];

            for (int $$3 = 0; $$3 < $$2.length; $$3++) {
               int $$4 = $$3 - $$0;
               if ($$4 < 0 || $$4 >= $$1.b()) {
                  $$2[$$3] = this.c[$$3];
               } else if ($$3 >= this.c.length) {
                  $$2[$$3] = $$1.a($$4);
               } else {
                  $$2[$$3] = dxl.a(this.c[$$3], $$1.a($$4));
               }
            }

            return $$2;
         }
      }

      private int a(dxl $$0) {
         for (int $$1 = this.c.length - 1; $$1 >= 0; $$1--) {
            if (this.c[$$1].a($$0)) {
               return $$1;
            }
         }

         return 0;
      }
   }
}
