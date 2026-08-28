import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqt {
   private final arh b;
   private final djc c;
   @Nullable
   private eec d = null;
   public final eec a;
   private volatile boolean e;
   private final List<CompletableFuture<aqx<edb>>> f = new ArrayList<>();
   private final bak<ari> g;
   private boolean h;

   private aqt(arh $$0, eec $$1, djc $$2, bak<ari> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqt a(arh $$0, eec $$1, djc $$2) {
      int $$3 = eeb.a.a($$1).a(eec.c);
      bak<ari> $$4 = bak.a($$2.h, $$2.i, $$3, ($$1x, $$2x) -> $$0.d(djc.c($$1x, $$2x)));
      return new aqt($$0, $$1, $$2, $$4);
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
      eec $$0;
      if (this.d == null) {
         $$0 = eec.c;
      } else if (!this.h && this.d == eec.c && !this.f()) {
         this.h = true;
         $$0 = eec.c;
      } else {
         $$0 = eec.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      ari $$0 = this.g.a(this.c.h, this.c.i);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == eec.c) {
         return true;
      } else {
         eec $$0 = this.g.a(this.c.h, this.c.i).q();
         if ($$0 != null && !$$0.d(this.a)) {
            eea $$1 = eeb.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.h - $$2; $$3 <= this.c.h + $$2; $$3++) {
               for (int $$4 = this.c.i - $$2; $$4 <= this.c.i + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  eec $$6 = $$1.a($$5);
                  eec $$7 = this.g.a($$3, $$4).q();
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

   public ari c() {
      return this.g.a(this.c.h, this.c.i);
   }

   private void a(eec $$0, boolean $$1) {
      try (brg $$2 = bra.a().d("scheduleLayer")) {
         $$2.a($$0::f);
         int $$3 = this.b($$0, $$1);

         for (int $$4 = this.c.h - $$3; $$4 <= this.c.h + $$3; $$4++) {
            for (int $$5 = this.c.i - $$3; $$5 <= this.c.i + $$3; $$5++) {
               ari $$6 = this.g.a($$4, $$5);
               if (this.e || !this.a($$0, $$1, $$6)) {
                  return;
               }
            }
         }
      }
   }

   private int b(eec $$0, boolean $$1) {
      eeb $$2 = $$1 ? eeb.a : eeb.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(eec $$0, boolean $$1, ari $$2) {
      eec $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      eeb $$5 = $$4 ? eeb.a : eeb.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqx<edb>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqx<edb> $$7 = $$6.getNow(null);
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
         CompletableFuture<aqx<edb>> $$0 = this.f.getLast();
         aqx<edb> $$1 = $$0.getNow(null);
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
