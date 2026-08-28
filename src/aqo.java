import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aqo {
   private final arc b;
   private final dgw c;
   @Nullable
   private ebk d = null;
   public final ebk a;
   private volatile boolean e;
   private final List<CompletableFuture<aqs<eaj>>> f = new ArrayList<>();
   private final bae<ard> g;
   private boolean h;

   private aqo(arc $$0, ebk $$1, dgw $$2, bae<ard> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static aqo a(arc $$0, ebk $$1, dgw $$2) {
      int $$3 = ebj.a.a($$1).a(ebk.c);
      bae<ard> $$4 = bae.a($$2.h, $$2.i, $$3, ($$1x, $$2x) -> $$0.d(dgw.c($$1x, $$2x)));
      return new aqo($$0, $$1, $$2, $$4);
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
      ebk $$0;
      if (this.d == null) {
         $$0 = ebk.c;
      } else if (!this.h && this.d == ebk.c && !this.f()) {
         this.h = true;
         $$0 = ebk.c;
      } else {
         $$0 = ebk.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      ard $$0 = this.g.a(this.c.h, this.c.i);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == ebk.c) {
         return true;
      } else {
         ebk $$0 = this.g.a(this.c.h, this.c.i).q();
         if ($$0 != null && !$$0.d(this.a)) {
            ebi $$1 = ebj.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.h - $$2; $$3 <= this.c.h + $$2; $$3++) {
               for (int $$4 = this.c.i - $$2; $$4 <= this.c.i + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  ebk $$6 = $$1.a($$5);
                  ebk $$7 = this.g.a($$3, $$4).q();
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

   public ard c() {
      return this.g.a(this.c.h, this.c.i);
   }

   private void a(ebk $$0, boolean $$1) {
      try (bqg $$2 = bqa.a().d("scheduleLayer")) {
         $$2.a($$0::f);
         int $$3 = this.b($$0, $$1);

         for (int $$4 = this.c.h - $$3; $$4 <= this.c.h + $$3; $$4++) {
            for (int $$5 = this.c.i - $$3; $$5 <= this.c.i + $$3; $$5++) {
               ard $$6 = this.g.a($$4, $$5);
               if (this.e || !this.a($$0, $$1, $$6)) {
                  return;
               }
            }
         }
      }
   }

   private int b(ebk $$0, boolean $$1) {
      ebj $$2 = $$1 ? ebj.a : ebj.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(ebk $$0, boolean $$1, ard $$2) {
      ebk $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      ebj $$5 = $$4 ? ebj.a : ebj.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<aqs<eaj>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         aqs<eaj> $$7 = $$6.getNow(null);
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
         CompletableFuture<aqs<eaj>> $$0 = this.f.getLast();
         aqs<eaj> $$1 = $$0.getNow(null);
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
