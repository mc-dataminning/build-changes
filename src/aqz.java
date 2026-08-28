import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqz {
   private final arn b;
   private final dgf c;
   @Nullable
   private eak d = null;
   public final eak a;
   private volatile boolean e;
   private final List<CompletableFuture<ard<dzj>>> f = new ArrayList<>();
   private final bao<aro> g;
   private boolean h;

   private aqz(arn $$0, eak $$1, dgf $$2, bao<aro> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqz a(arn $$0, eak $$1, dgf $$2) {
      int $$3 = eaj.a.a($$1).a(eak.c);
      bao<aro> $$4 = bao.a($$2.h, $$2.i, $$3, ($$1x, $$2x) -> $$0.d(dgf.c($$1x, $$2x)));
      return new aqz($$0, $$1, $$2, $$4);
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
      eak $$0;
      if (this.d == null) {
         $$0 = eak.c;
      } else if (!this.h && this.d == eak.c && !this.f()) {
         this.h = true;
         $$0 = eak.c;
      } else {
         $$0 = eak.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      aro $$0 = this.g.a(this.c.h, this.c.i);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == eak.c) {
         return true;
      } else {
         eak $$0 = this.g.a(this.c.h, this.c.i).q();
         if ($$0 != null && !$$0.d(this.a)) {
            eai $$1 = eaj.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.h - $$2; $$3 <= this.c.h + $$2; $$3++) {
               for (int $$4 = this.c.i - $$2; $$4 <= this.c.i + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  eak $$6 = $$1.a($$5);
                  eak $$7 = this.g.a($$3, $$4).q();
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

   public aro c() {
      return this.g.a(this.c.h, this.c.i);
   }

   private void a(eak $$0, boolean $$1) {
      try (bpo $$2 = bpi.a().d("scheduleLayer")) {
         $$2.a($$0::f);
         int $$3 = this.b($$0, $$1);

         for (int $$4 = this.c.h - $$3; $$4 <= this.c.h + $$3; $$4++) {
            for (int $$5 = this.c.i - $$3; $$5 <= this.c.i + $$3; $$5++) {
               aro $$6 = this.g.a($$4, $$5);
               if (this.e || !this.a($$0, $$1, $$6)) {
                  return;
               }
            }
         }
      }
   }

   private int b(eak $$0, boolean $$1) {
      eaj $$2 = $$1 ? eaj.a : eaj.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(eak $$0, boolean $$1, aro $$2) {
      eak $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      eaj $$5 = $$4 ? eaj.a : eaj.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<ard<dzj>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         ard<dzj> $$7 = $$6.getNow(null);
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
         CompletableFuture<ard<dzj>> $$0 = this.f.getLast();
         ard<dzj> $$1 = $$0.getNow(null);
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
