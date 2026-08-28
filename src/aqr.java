import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqr {
   private final arf b;
   private final des c;
   @Nullable
   private dyr d = null;
   public final dyr a;
   private volatile boolean e;
   private final List<CompletableFuture<aqv<dxq>>> f = new ArrayList<>();
   private final bag<arg> g;
   private boolean h;

   private aqr(arf $$0, dyr $$1, des $$2, bag<arg> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqr a(arf $$0, dyr $$1, des $$2) {
      int $$3 = dyq.a.a($$1).a(dyr.c);
      bag<arg> $$4 = bag.a($$2.g, $$2.h, $$3, ($$1x, $$2x) -> $$0.d(des.c($$1x, $$2x)));
      return new aqr($$0, $$1, $$2, $$4);
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
      dyr $$0;
      if (this.d == null) {
         $$0 = dyr.c;
      } else if (!this.h && this.d == dyr.c && !this.f()) {
         this.h = true;
         $$0 = dyr.c;
      } else {
         $$0 = dyr.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      arg $$0 = this.g.a(this.c.g, this.c.h);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == dyr.c) {
         return true;
      } else {
         dyr $$0 = this.g.a(this.c.g, this.c.h).p();
         if ($$0 != null && !$$0.d(this.a)) {
            dyp $$1 = dyq.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.g - $$2; $$3 <= this.c.g + $$2; $$3++) {
               for (int $$4 = this.c.h - $$2; $$4 <= this.c.h + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  dyr $$6 = $$1.a($$5);
                  dyr $$7 = this.g.a($$3, $$4).p();
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

   public arg c() {
      return this.g.a(this.c.g, this.c.h);
   }

   private void a(dyr $$0, boolean $$1) {
      try (boz $$2 = bot.a().d("scheduleLayer")) {
         $$2.a($$0::f);
         int $$3 = this.b($$0, $$1);

         for (int $$4 = this.c.g - $$3; $$4 <= this.c.g + $$3; $$4++) {
            for (int $$5 = this.c.h - $$3; $$5 <= this.c.h + $$3; $$5++) {
               arg $$6 = this.g.a($$4, $$5);
               if (this.e || !this.a($$0, $$1, $$6)) {
                  return;
               }
            }
         }
      }
   }

   private int b(dyr $$0, boolean $$1) {
      dyq $$2 = $$1 ? dyq.a : dyq.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(dyr $$0, boolean $$1, arg $$2) {
      dyr $$3 = $$2.p();
      boolean $$4 = $$3 != null && $$0.b($$3);
      dyq $$5 = $$4 ? dyq.a : dyq.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqv<dxq>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqv<dxq> $$7 = $$6.getNow(null);
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
         CompletableFuture<aqv<dxq>> $$0 = this.f.getLast();
         aqv<dxq> $$1 = $$0.getNow(null);
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
