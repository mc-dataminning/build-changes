import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class apy {
   private final aqm b;
   private final dcd c;
   @Nullable
   private dvz d = null;
   public final dvz a;
   private volatile boolean e;
   private final List<CompletableFuture<aqc<duy>>> f = new ArrayList<>();
   private final azi<aqn> g;
   private boolean h;

   private apy(aqm $$0, dvz $$1, dcd $$2, azi<aqn> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static apy a(aqm $$0, dvz $$1, dcd $$2) {
      int $$3 = dvy.a.a($$1).a(dvz.c);
      azi<aqn> $$4 = azi.a($$2.e, $$2.f, $$3, ($$1x, $$2x) -> $$0.d(dcd.c($$1x, $$2x)));
      return new apy($$0, $$1, $$2, $$4);
   }

   @Nullable
   public CompletableFuture<?> a() {
      while (true) {
         CompletableFuture<?> $$0 = this.g();
         if ($$0 != null) {
            return $$0;
         }

         if (this.e || this.d == this.a) {
            this.e();
            return null;
         }

         this.d();
      }
   }

   private void d() {
      dvz $$0;
      if (this.d == null) {
         $$0 = dvz.c;
      } else if (!this.h && this.d == dvz.c && !this.f()) {
         this.h = true;
         $$0 = dvz.c;
      } else {
         $$0 = dvz.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      aqn $$0 = this.g.a(this.c.e, this.c.f);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == dvz.c) {
         return true;
      } else {
         dvz $$0 = this.g.a(this.c.e, this.c.f).q();
         if ($$0 != null && !$$0.d(this.a)) {
            dvx $$1 = dvy.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.e - $$2; $$3 <= this.c.e + $$2; $$3++) {
               for (int $$4 = this.c.f - $$2; $$4 <= this.c.f + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  dvz $$6 = $$1.a($$5);
                  dvz $$7 = this.g.a($$3, $$4).q();
                  if ($$7 == null || $$7.d($$6)) {
                     return false;
                  }
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public aqn c() {
      return this.g.a(this.c.e, this.c.f);
   }

   private void a(dvz $$0, boolean $$1) {
      int $$2 = this.b($$0, $$1);

      for (int $$3 = this.c.e - $$2; $$3 <= this.c.e + $$2; $$3++) {
         for (int $$4 = this.c.f - $$2; $$4 <= this.c.f + $$2; $$4++) {
            aqn $$5 = this.g.a($$3, $$4);
            if (this.e || !this.a($$0, $$1, $$5)) {
               return;
            }
         }
      }
   }

   private int b(dvz $$0, boolean $$1) {
      dvy $$2 = $$1 ? dvy.a : dvy.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(dvz $$0, boolean $$1, aqn $$2) {
      dvz $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      dvy $$5 = $$4 ? dvy.a : dvy.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqc<duy>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqc<duy> $$7 = $$6.getNow(null);
         if ($$7 == null) {
            this.f.add($$6);
            return true;
         } else if ($$7.a()) {
            return true;
         } else {
            this.b();
            return false;
         }
      }
   }

   @Nullable
   private CompletableFuture<?> g() {
      while (!this.f.isEmpty()) {
         CompletableFuture<aqc<duy>> $$0 = this.f.getLast();
         aqc<duy> $$1 = $$0.getNow(null);
         if ($$1 == null) {
            return $$0;
         }

         this.f.removeLast();
         if (!$$1.a()) {
            this.b();
         }
      }

      return null;
   }
}
