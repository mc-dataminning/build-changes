import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public record dvk(dvh a, dvf b, dvf c, int d, dvi e) {

   public int a(dvh $$0) {
      return $$0 == this.a ? 0 : this.c.a($$0);
   }

   public CompletableFuture<dug> a(dvm $$0, aza<aqf> $$1, dug $$2) {
      if ($$2.j().d(this.a)) {
         bnd $$3 = bna.f.a($$2.f(), $$0.a().af(), this.a.f());
         return this.e.doWork($$0, this, $$1, $$2).thenApply($$1x -> this.a($$1x, $$3));
      } else {
         return this.e.doWork($$0, this, $$1, $$2);
      }
   }

   private dug a(dug $$0, @Nullable bnd $$1) {
      if ($$0 instanceof dva $$2 && $$2.j().d(this.a)) {
         $$2.a(this.a);
      }

      if ($$1 != null) {
         $$1.finish();
      }

      return $$0;
   }

   public static class a {
      private final dvh a;
      @Nullable
      private final dvk b;
      private dvh[] c;
      private int d = -1;
      private dvi e = dvj::a;

      protected a(dvh $$0) {
         if ($$0.c() != $$0) {
            throw new IllegalArgumentException("Not starting with the first status: " + $$0);
         } else {
            this.a = $$0;
            this.b = null;
            this.c = new dvh[0];
         }
      }

      protected a(dvh $$0, dvk $$1) {
         if ($$1.a.b() != $$0.b() - 1) {
            throw new IllegalArgumentException("Out of order status: " + $$0);
         } else {
            this.a = $$0;
            this.b = $$1;
            this.c = new dvh[]{$$1.a};
         }
      }

      public dvk.a a(dvh $$0, int $$1) {
         if ($$0.a(this.a)) {
            throw new IllegalArgumentException("Status " + $$0 + " can not be required by " + this.a);
         } else {
            dvh[] $$2 = this.c;
            int $$3 = $$1 + 1;
            if ($$3 > $$2.length) {
               this.c = new dvh[$$3];
               Arrays.fill(this.c, $$0);
            }

            for (int $$4 = 0; $$4 < Math.min($$3, $$2.length); $$4++) {
               this.c[$$4] = dvh.a($$2[$$4], $$0);
            }

            return this;
         }
      }

      public dvk.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public dvk.a a(dvi $$0) {
         this.e = $$0;
         return this;
      }

      public dvk a() {
         return new dvk(this.a, new dvf(ImmutableList.copyOf(this.c)), new dvf(ImmutableList.copyOf(this.b())), this.d, this.e);
      }

      private dvh[] b() {
         if (this.b == null) {
            return this.c;
         } else {
            int $$0 = this.a(this.b.a);
            dvf $$1 = this.b.c;
            dvh[] $$2 = new dvh[Math.max($$0 + $$1.b(), this.c.length)];

            for (int $$3 = 0; $$3 < $$2.length; $$3++) {
               int $$4 = $$3 - $$0;
               if ($$4 < 0 || $$4 >= $$1.b()) {
                  $$2[$$3] = this.c[$$3];
               } else if ($$3 >= this.c.length) {
                  $$2[$$3] = $$1.a($$4);
               } else {
                  $$2[$$3] = dvh.a(this.c[$$3], $$1.a($$4));
               }
            }

            return $$2;
         }
      }

      private int a(dvh $$0) {
         for (int $$1 = this.c.length - 1; $$1 >= 0; $$1--) {
            if (this.c[$$1].a($$0)) {
               return $$1;
            }
         }

         return 0;
      }
   }
}
