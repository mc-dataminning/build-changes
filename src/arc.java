import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class arc {
   private final arq b;
   private final djo c;
   @Nullable
   private eeo d = null;
   public final eeo a;
   private volatile boolean e;
   private final List<CompletableFuture<arg<edn>>> f = new ArrayList<>();
   private final bav<arr> g;
   private boolean h;

   private arc(arq $$0, eeo $$1, djo $$2, bav<arr> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static arc a(arq $$0, eeo $$1, djo $$2) {
      int $$3 = een.a.a($$1).a(eeo.c);
      bav<arr> $$4 = bav.a($$2.h, $$2.i, $$3, ($$1x, $$2x) -> $$0.d(djo.c($$1x, $$2x)));
      return new arc($$0, $$1, $$2, $$4);
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
      eeo $$0;
      if (this.d == null) {
         $$0 = eeo.c;
      } else if (!this.h && this.d == eeo.c && !this.f()) {
         this.h = true;
         $$0 = eeo.c;
      } else {
         $$0 = eeo.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      arr $$0 = this.g.a(this.c.h, this.c.i);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == eeo.c) {
         return true;
      } else {
         eeo $$0 = this.g.a(this.c.h, this.c.i).q();
         if ($$0 != null && !$$0.d(this.a)) {
            eem $$1 = een.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.h - $$2; $$3 <= this.c.h + $$2; $$3++) {
               for (int $$4 = this.c.i - $$2; $$4 <= this.c.i + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  eeo $$6 = $$1.a($$5);
                  eeo $$7 = this.g.a($$3, $$4).q();
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

   public arr c() {
      return this.g.a(this.c.h, this.c.i);
   }

   private void a(eeo $$0, boolean $$1) {
      try (brr $$2 = brl.a().d("scheduleLayer")) {
         $$2.a($$0::f);
         int $$3 = this.b($$0, $$1);

         for (int $$4 = this.c.h - $$3; $$4 <= this.c.h + $$3; $$4++) {
            for (int $$5 = this.c.i - $$3; $$5 <= this.c.i + $$3; $$5++) {
               arr $$6 = this.g.a($$4, $$5);
               if (this.e || !this.a($$0, $$1, $$6)) {
                  return;
               }
            }
         }
      }
   }

   private int b(eeo $$0, boolean $$1) {
      een $$2 = $$1 ? een.a : een.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(eeo $$0, boolean $$1, arr $$2) {
      eeo $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      een $$5 = $$4 ? een.a : een.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<arg<edn>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         arg<edn> $$7 = $$6.getNow(null);
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
         CompletableFuture<arg<edn>> $$0 = this.f.getLast();
         arg<edn> $$1 = $$0.getNow(null);
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
