import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public record edi(edf a, edd b, edd c, int d, edg e) {

   public int a(edf $$0) {
      return $$0 == this.a ? 0 : this.c.a($$0);
   }

   public CompletableFuture<ece> a(edk $$0, bai<arg> $$1, ece $$2) {
      if ($$2.n().d(this.a)) {
         bqz $$3 = bqw.f.a($$2.f(), $$0.a().aj(), this.a.f());
         return this.e.doWork($$0, this, $$1, $$2).thenApply($$1x -> this.a($$1x, $$3));
      } else {
         return this.e.doWork($$0, this, $$1, $$2);
      }
   }

   private ece a(ece $$0, @Nullable bqz $$1) {
      if ($$0 instanceof ecy $$2 && $$2.n().d(this.a)) {
         $$2.a(this.a);
      }

      if ($$1 != null) {
         $$1.finish(true);
      }

      return $$0;
   }

   public static class a {
      private final edf a;
      @Nullable
      private final edi b;
      private edf[] c;
      private int d = -1;
      private edg e = edh::a;

      protected a(edf $$0) {
         if ($$0.c() != $$0) {
            throw new IllegalArgumentException("Not starting with the first status: " + $$0);
         } else {
            this.a = $$0;
            this.b = null;
            this.c = new edf[0];
         }
      }

      protected a(edf $$0, edi $$1) {
         if ($$1.a.b() != $$0.b() - 1) {
            throw new IllegalArgumentException("Out of order status: " + $$0);
         } else {
            this.a = $$0;
            this.b = $$1;
            this.c = new edf[]{$$1.a};
         }
      }

      public edi.a a(edf $$0, int $$1) {
         if ($$0.a(this.a)) {
            throw new IllegalArgumentException("Status " + $$0 + " can not be required by " + this.a);
         } else {
            edf[] $$2 = this.c;
            int $$3 = $$1 + 1;
            if ($$3 > $$2.length) {
               this.c = new edf[$$3];
               Arrays.fill(this.c, $$0);
            }

            for (int $$4 = 0; $$4 < Math.min($$3, $$2.length); $$4++) {
               this.c[$$4] = edf.a($$2[$$4], $$0);
            }

            return this;
         }
      }

      public edi.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public edi.a a(edg $$0) {
         this.e = $$0;
         return this;
      }

      public edi a() {
         return new edi(this.a, new edd(ImmutableList.copyOf(this.c)), new edd(ImmutableList.copyOf(this.b())), this.d, this.e);
      }

      private edf[] b() {
         if (this.b == null) {
            return this.c;
         } else {
            int $$0 = this.a(this.b.a);
            edd $$1 = this.b.c;
            edf[] $$2 = new edf[Math.max($$0 + $$1.b(), this.c.length)];

            for (int $$3 = 0; $$3 < $$2.length; $$3++) {
               int $$4 = $$3 - $$0;
               if ($$4 < 0 || $$4 >= $$1.b()) {
                  $$2[$$3] = this.c[$$3];
               } else if ($$3 >= this.c.length) {
                  $$2[$$3] = $$1.a($$4);
               } else {
                  $$2[$$3] = edf.a(this.c[$$3], $$1.a($$4));
               }
            }

            return $$2;
         }
      }

      private int a(edf $$0) {
         for (int $$1 = this.c.length - 1; $$1 >= 0; $$1--) {
            if (this.c[$$1].a($$0)) {
               return $$1;
            }
         }

         return 0;
      }
   }
}
