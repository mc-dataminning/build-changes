import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqr {
   private final arf b;
   private final dio c;
   @Nullable
   private edm d = null;
   public final edm a;
   private volatile boolean e;
   private final List<CompletableFuture<aqv<ecl>>> f = new ArrayList<>();
   private final bai<arg> g;
   private boolean h;

   private aqr(arf $$0, edm $$1, dio $$2, bai<arg> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqr a(arf $$0, edm $$1, dio $$2) {
      int $$3 = edl.a.a($$1).a(edm.c);
      bai<arg> $$4 = bai.a($$2.h, $$2.i, $$3, ($$1x, $$2x) -> $$0.d(dio.c($$1x, $$2x)));
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
      edm $$0;
      if (this.d == null) {
         $$0 = edm.c;
      } else if (!this.h && this.d == edm.c && !this.f()) {
         this.h = true;
         $$0 = edm.c;
      } else {
         $$0 = edm.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      arg $$0 = this.g.a(this.c.h, this.c.i);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == edm.c) {
         return true;
      } else {
         edm $$0 = this.g.a(this.c.h, this.c.i).q();
         if ($$0 != null && !$$0.d(this.a)) {
            edk $$1 = edl.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.h - $$2; $$3 <= this.c.h + $$2; $$3++) {
               for (int $$4 = this.c.i - $$2; $$4 <= this.c.i + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  edm $$6 = $$1.a($$5);
                  edm $$7 = this.g.a($$3, $$4).q();
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
      return this.g.a(this.c.h, this.c.i);
   }

   private void a(edm $$0, boolean $$1) {
      try (bqv $$2 = bqp.a().d("scheduleLayer")) {
         $$2.a($$0::f);
         int $$3 = this.b($$0, $$1);

         for (int $$4 = this.c.h - $$3; $$4 <= this.c.h + $$3; $$4++) {
            for (int $$5 = this.c.i - $$3; $$5 <= this.c.i + $$3; $$5++) {
               arg $$6 = this.g.a($$4, $$5);
               if (this.e || !this.a($$0, $$1, $$6)) {
                  return;
               }
            }
         }
      }
   }

   private int b(edm $$0, boolean $$1) {
      edl $$2 = $$1 ? edl.a : edl.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(edm $$0, boolean $$1, arg $$2) {
      edm $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      edl $$5 = $$4 ? edl.a : edl.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqv<ecl>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqv<ecl> $$7 = $$6.getNow(null);
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
         CompletableFuture<aqv<ecl>> $$0 = this.f.getLast();
         aqv<ecl> $$1 = $$0.getNow(null);
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
