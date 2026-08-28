import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqp {
   private final ard b;
   private final dhw c;
   @Nullable
   private ecm d = null;
   public final ecm a;
   private volatile boolean e;
   private final List<CompletableFuture<aqt<ebl>>> f = new ArrayList<>();
   private final bag<are> g;
   private boolean h;

   private aqp(ard $$0, ecm $$1, dhw $$2, bag<are> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqp a(ard $$0, ecm $$1, dhw $$2) {
      int $$3 = ecl.a.a($$1).a(ecm.c);
      bag<are> $$4 = bag.a($$2.h, $$2.i, $$3, ($$1x, $$2x) -> $$0.d(dhw.c($$1x, $$2x)));
      return new aqp($$0, $$1, $$2, $$4);
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
      ecm $$0;
      if (this.d == null) {
         $$0 = ecm.c;
      } else if (!this.h && this.d == ecm.c && !this.f()) {
         this.h = true;
         $$0 = ecm.c;
      } else {
         $$0 = ecm.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      are $$0 = this.g.a(this.c.h, this.c.i);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == ecm.c) {
         return true;
      } else {
         ecm $$0 = this.g.a(this.c.h, this.c.i).q();
         if ($$0 != null && !$$0.d(this.a)) {
            eck $$1 = ecl.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.h - $$2; $$3 <= this.c.h + $$2; $$3++) {
               for (int $$4 = this.c.i - $$2; $$4 <= this.c.i + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  ecm $$6 = $$1.a($$5);
                  ecm $$7 = this.g.a($$3, $$4).q();
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

   public are c() {
      return this.g.a(this.c.h, this.c.i);
   }

   private void a(ecm $$0, boolean $$1) {
      try (bqo $$2 = bqi.a().d("scheduleLayer")) {
         $$2.a($$0::f);
         int $$3 = this.b($$0, $$1);

         for (int $$4 = this.c.h - $$3; $$4 <= this.c.h + $$3; $$4++) {
            for (int $$5 = this.c.i - $$3; $$5 <= this.c.i + $$3; $$5++) {
               are $$6 = this.g.a($$4, $$5);
               if (this.e || !this.a($$0, $$1, $$6)) {
                  return;
               }
            }
         }
      }
   }

   private int b(ecm $$0, boolean $$1) {
      ecl $$2 = $$1 ? ecl.a : ecl.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(ecm $$0, boolean $$1, are $$2) {
      ecm $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      ecl $$5 = $$4 ? ecl.a : ecl.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqt<ebl>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqt<ebl> $$7 = $$6.getNow(null);
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
         CompletableFuture<aqt<ebl>> $$0 = this.f.getLast();
         aqt<ebl> $$1 = $$0.getNow(null);
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
