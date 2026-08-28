import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public record dzw(dzt a, dzr b, dzr c, int d, dzu e) {

   public int a(dzt $$0) {
      return $$0 == this.a ? 0 : this.c.a($$0);
   }

   public CompletableFuture<dys> a(dzy $$0, azt<aqt> $$1, dys $$2) {
      if ($$2.n().d(this.a)) {
         bpd $$3 = bpa.f.a($$2.f(), $$0.a().ai(), this.a.f());
         return this.e.doWork($$0, this, $$1, $$2).thenApply($$1x -> this.a($$1x, $$3));
      } else {
         return this.e.doWork($$0, this, $$1, $$2);
      }
   }

   private dys a(dys $$0, @Nullable bpd $$1) {
      if ($$0 instanceof dzm $$2 && $$2.n().d(this.a)) {
         $$2.a(this.a);
      }

      if ($$1 != null) {
         $$1.finish(true);
      }

      return $$0;
   }

   public static class a {
      private final dzt a;
      @Nullable
      private final dzw b;
      private dzt[] c;
      private int d = -1;
      private dzu e = dzv::a;

      protected a(dzt $$0) {
         if ($$0.c() != $$0) {
            throw new IllegalArgumentException("Not starting with the first status: " + $$0);
         } else {
            this.a = $$0;
            this.b = null;
            this.c = new dzt[0];
         }
      }

      protected a(dzt $$0, dzw $$1) {
         if ($$1.a.b() != $$0.b() - 1) {
            throw new IllegalArgumentException("Out of order status: " + $$0);
         } else {
            this.a = $$0;
            this.b = $$1;
            this.c = new dzt[]{$$1.a};
         }
      }

      public dzw.a a(dzt $$0, int $$1) {
         if ($$0.a(this.a)) {
            throw new IllegalArgumentException("Status " + $$0 + " can not be required by " + this.a);
         } else {
            dzt[] $$2 = this.c;
            int $$3 = $$1 + 1;
            if ($$3 > $$2.length) {
               this.c = new dzt[$$3];
               Arrays.fill(this.c, $$0);
            }

            for (int $$4 = 0; $$4 < Math.min($$3, $$2.length); $$4++) {
               this.c[$$4] = dzt.a($$2[$$4], $$0);
            }

            return this;
         }
      }

      public dzw.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public dzw.a a(dzu $$0) {
         this.e = $$0;
         return this;
      }

      public dzw a() {
         return new dzw(this.a, new dzr(ImmutableList.copyOf(this.c)), new dzr(ImmutableList.copyOf(this.b())), this.d, this.e);
      }

      private dzt[] b() {
         if (this.b == null) {
            return this.c;
         } else {
            int $$0 = this.a(this.b.a);
            dzr $$1 = this.b.c;
            dzt[] $$2 = new dzt[Math.max($$0 + $$1.b(), this.c.length)];

            for (int $$3 = 0; $$3 < $$2.length; $$3++) {
               int $$4 = $$3 - $$0;
               if ($$4 < 0 || $$4 >= $$1.b()) {
                  $$2[$$3] = this.c[$$3];
               } else if ($$3 >= this.c.length) {
                  $$2[$$3] = $$1.a($$4);
               } else {
                  $$2[$$3] = dzt.a(this.c[$$3], $$1.a($$4));
               }
            }

            return $$2;
         }
      }

      private int a(dzt $$0) {
         for (int $$1 = this.c.length - 1; $$1 >= 0; $$1--) {
            if (this.c[$$1].a($$0)) {
               return $$1;
            }
         }

         return 0;
      }
   }
}
