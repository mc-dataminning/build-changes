import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqv {
   private final arj b;
   private final dje c;
   @Nullable
   private eee d = null;
   public final eee a;
   private volatile boolean e;
   private final List<CompletableFuture<aqz<edd>>> f = new ArrayList<>();
   private final bam<ark> g;
   private boolean h;

   private aqv(arj $$0, eee $$1, dje $$2, bam<ark> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqv a(arj $$0, eee $$1, dje $$2) {
      int $$3 = eed.a.a($$1).a(eee.c);
      bam<ark> $$4 = bam.a($$2.h, $$2.i, $$3, ($$1x, $$2x) -> $$0.d(dje.c($$1x, $$2x)));
      return new aqv($$0, $$1, $$2, $$4);
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
      eee $$0;
      if (this.d == null) {
         $$0 = eee.c;
      } else if (!this.h && this.d == eee.c && !this.f()) {
         this.h = true;
         $$0 = eee.c;
      } else {
         $$0 = eee.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      ark $$0 = this.g.a(this.c.h, this.c.i);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == eee.c) {
         return true;
      } else {
         eee $$0 = this.g.a(this.c.h, this.c.i).q();
         if ($$0 != null && !$$0.d(this.a)) {
            eec $$1 = eed.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.h - $$2; $$3 <= this.c.h + $$2; $$3++) {
               for (int $$4 = this.c.i - $$2; $$4 <= this.c.i + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  eee $$6 = $$1.a($$5);
                  eee $$7 = this.g.a($$3, $$4).q();
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

   public ark c() {
      return this.g.a(this.c.h, this.c.i);
   }

   private void a(eee $$0, boolean $$1) {
      try (bri $$2 = brc.a().d("scheduleLayer")) {
         $$2.a($$0::f);
         int $$3 = this.b($$0, $$1);

         for (int $$4 = this.c.h - $$3; $$4 <= this.c.h + $$3; $$4++) {
            for (int $$5 = this.c.i - $$3; $$5 <= this.c.i + $$3; $$5++) {
               ark $$6 = this.g.a($$4, $$5);
               if (this.e || !this.a($$0, $$1, $$6)) {
                  return;
               }
            }
         }
      }
   }

   private int b(eee $$0, boolean $$1) {
      eed $$2 = $$1 ? eed.a : eed.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(eee $$0, boolean $$1, ark $$2) {
      eee $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      eed $$5 = $$4 ? eed.a : eed.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqz<edd>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqz<edd> $$7 = $$6.getNow(null);
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
         CompletableFuture<aqz<edd>> $$0 = this.f.getLast();
         aqz<edd> $$1 = $$0.getNow(null);
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
