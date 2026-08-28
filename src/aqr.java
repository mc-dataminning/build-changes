import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqr {
   private final arf b;
   private final dic c;
   @Nullable
   private ecx d = null;
   public final ecx a;
   private volatile boolean e;
   private final List<CompletableFuture<aqv<ebw>>> f = new ArrayList<>();
   private final bai<arg> g;
   private boolean h;

   private aqr(arf $$0, ecx $$1, dic $$2, bai<arg> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqr a(arf $$0, ecx $$1, dic $$2) {
      int $$3 = ecw.a.a($$1).a(ecx.c);
      bai<arg> $$4 = bai.a($$2.h, $$2.i, $$3, ($$1x, $$2x) -> $$0.d(dic.c($$1x, $$2x)));
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
      ecx $$0;
      if (this.d == null) {
         $$0 = ecx.c;
      } else if (!this.h && this.d == ecx.c && !this.f()) {
         this.h = true;
         $$0 = ecx.c;
      } else {
         $$0 = ecx.a().get(this.d.b() + 1);
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
      if (this.a == ecx.c) {
         return true;
      } else {
         ecx $$0 = this.g.a(this.c.h, this.c.i).q();
         if ($$0 != null && !$$0.d(this.a)) {
            ecv $$1 = ecw.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.h - $$2; $$3 <= this.c.h + $$2; $$3++) {
               for (int $$4 = this.c.i - $$2; $$4 <= this.c.i + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  ecx $$6 = $$1.a($$5);
                  ecx $$7 = this.g.a($$3, $$4).q();
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

   private void a(ecx $$0, boolean $$1) {
      try (bqr $$2 = bql.a().d("scheduleLayer")) {
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

   private int b(ecx $$0, boolean $$1) {
      ecw $$2 = $$1 ? ecw.a : ecw.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(ecx $$0, boolean $$1, arg $$2) {
      ecx $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      ecw $$5 = $$4 ? ecw.a : ecw.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqv<ebw>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqv<ebw> $$7 = $$6.getNow(null);
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
         CompletableFuture<aqv<ebw>> $$0 = this.f.getLast();
         aqv<ebw> $$1 = $$0.getNow(null);
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
