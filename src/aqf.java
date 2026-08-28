import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqf {
   private final aqt b;
   private final dfn c;
   @Nullable
   private dzs d = null;
   public final dzs a;
   private volatile boolean e;
   private final List<CompletableFuture<aqj<dyr>>> f = new ArrayList<>();
   private final azt<aqu> g;
   private boolean h;

   private aqf(aqt $$0, dzs $$1, dfn $$2, azt<aqu> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqf a(aqt $$0, dzs $$1, dfn $$2) {
      int $$3 = dzr.a.a($$1).a(dzs.c);
      azt<aqu> $$4 = azt.a($$2.h, $$2.i, $$3, ($$1x, $$2x) -> $$0.d(dfn.c($$1x, $$2x)));
      return new aqf($$0, $$1, $$2, $$4);
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
      dzs $$0;
      if (this.d == null) {
         $$0 = dzs.c;
      } else if (!this.h && this.d == dzs.c && !this.f()) {
         this.h = true;
         $$0 = dzs.c;
      } else {
         $$0 = dzs.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      aqu $$0 = this.g.a(this.c.h, this.c.i);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == dzs.c) {
         return true;
      } else {
         dzs $$0 = this.g.a(this.c.h, this.c.i).q();
         if ($$0 != null && !$$0.d(this.a)) {
            dzq $$1 = dzr.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.h - $$2; $$3 <= this.c.h + $$2; $$3++) {
               for (int $$4 = this.c.i - $$2; $$4 <= this.c.i + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  dzs $$6 = $$1.a($$5);
                  dzs $$7 = this.g.a($$3, $$4).q();
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

   public aqu c() {
      return this.g.a(this.c.h, this.c.i);
   }

   private void a(dzs $$0, boolean $$1) {
      try (box $$2 = bor.a().d("scheduleLayer")) {
         $$2.a($$0::f);
         int $$3 = this.b($$0, $$1);

         for (int $$4 = this.c.h - $$3; $$4 <= this.c.h + $$3; $$4++) {
            for (int $$5 = this.c.i - $$3; $$5 <= this.c.i + $$3; $$5++) {
               aqu $$6 = this.g.a($$4, $$5);
               if (this.e || !this.a($$0, $$1, $$6)) {
                  return;
               }
            }
         }
      }
   }

   private int b(dzs $$0, boolean $$1) {
      dzr $$2 = $$1 ? dzr.a : dzr.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(dzs $$0, boolean $$1, aqu $$2) {
      dzs $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      dzr $$5 = $$4 ? dzr.a : dzr.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqj<dyr>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqj<dyr> $$7 = $$6.getNow(null);
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
         CompletableFuture<aqj<dyr>> $$0 = this.f.getLast();
         aqj<dyr> $$1 = $$0.getNow(null);
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
