import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class apq {
   private final aqe b;
   private final dbm c;
   @Nullable
   private dvh d = null;
   public final dvh a;
   private volatile boolean e;
   private final List<CompletableFuture<apu<dug>>> f = new ArrayList<>();
   private final aza<aqf> g;
   private boolean h;

   private apq(aqe $$0, dvh $$1, dbm $$2, aza<aqf> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static apq a(aqe $$0, dvh $$1, dbm $$2) {
      int $$3 = dvg.a.a($$1).a(dvh.c);
      aza<aqf> $$4 = aza.a($$2.e, $$2.f, $$3, ($$1x, $$2x) -> $$0.d(dbm.c($$1x, $$2x)));
      return new apq($$0, $$1, $$2, $$4);
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
      dvh $$0;
      if (this.d == null) {
         $$0 = dvh.c;
      } else if (!this.h && this.d == dvh.c && !this.f()) {
         this.h = true;
         $$0 = dvh.c;
      } else {
         $$0 = dvh.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      aqf $$0 = this.g.a(this.c.e, this.c.f);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == dvh.c) {
         return true;
      } else {
         dvh $$0 = this.g.a(this.c.e, this.c.f).q();
         if ($$0 != null && !$$0.d(this.a)) {
            dvf $$1 = dvg.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.e - $$2; $$3 <= this.c.e + $$2; $$3++) {
               for (int $$4 = this.c.f - $$2; $$4 <= this.c.f + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  dvh $$6 = $$1.a($$5);
                  dvh $$7 = this.g.a($$3, $$4).q();
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

   public aqf c() {
      return this.g.a(this.c.e, this.c.f);
   }

   private void a(dvh $$0, boolean $$1) {
      int $$2 = this.b($$0, $$1);

      for (int $$3 = this.c.e - $$2; $$3 <= this.c.e + $$2; $$3++) {
         for (int $$4 = this.c.f - $$2; $$4 <= this.c.f + $$2; $$4++) {
            aqf $$5 = this.g.a($$3, $$4);
            if (this.e || !this.a($$0, $$1, $$5)) {
               return;
            }
         }
      }
   }

   private int b(dvh $$0, boolean $$1) {
      dvg $$2 = $$1 ? dvg.a : dvg.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(dvh $$0, boolean $$1, aqf $$2) {
      dvh $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      dvg $$5 = $$4 ? dvg.a : dvg.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<apu<dug>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         apu<dug> $$7 = $$6.getNow(null);
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
         CompletableFuture<apu<dug>> $$0 = this.f.getLast();
         apu<dug> $$1 = $$0.getNow(null);
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
