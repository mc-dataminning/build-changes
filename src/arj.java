import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class arj {
   private final arx b;
   private final dgo c;
   @Nullable
   private ear d = null;
   public final ear a;
   private volatile boolean e;
   private final List<CompletableFuture<arn<dzq>>> f = new ArrayList<>();
   private final bay<ary> g;
   private boolean h;

   private arj(arx $$0, ear $$1, dgo $$2, bay<ary> $$3) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
      this.g = $$3;
   }

   public static arj a(arx $$0, ear $$1, dgo $$2) {
      int $$3 = eaq.a.a($$1).a(ear.c);
      bay<ary> $$4 = bay.a($$2.h, $$2.i, $$3, ($$1x, $$2x) -> $$0.d(dgo.c($$1x, $$2x)));
      return new arj($$0, $$1, $$2, $$4);
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
      ear $$0;
      if (this.d == null) {
         $$0 = ear.c;
      } else if (!this.h && this.d == ear.c && !this.f()) {
         this.h = true;
         $$0 = ear.c;
      } else {
         $$0 = ear.a().get(this.d.b() + 1);
      }

      this.a($$0, this.h);
      this.d = $$0;
   }

   public void b() {
      this.e = true;
   }

   private void e() {
      ary $$0 = this.g.a(this.c.h, this.c.i);
      $$0.a(this);
      this.g.a(this.b::a);
   }

   private boolean f() {
      if (this.a == ear.c) {
         return true;
      } else {
         ear $$0 = this.g.a(this.c.h, this.c.i).q();
         if ($$0 != null && !$$0.d(this.a)) {
            eap $$1 = eaq.b.a(this.a).c();
            int $$2 = $$1.c();

            for (int $$3 = this.c.h - $$2; $$3 <= this.c.h + $$2; $$3++) {
               for (int $$4 = this.c.i - $$2; $$4 <= this.c.i + $$2; $$4++) {
                  int $$5 = this.c.e($$3, $$4);
                  ear $$6 = $$1.a($$5);
                  ear $$7 = this.g.a($$3, $$4).q();
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

   public ary c() {
      return this.g.a(this.c.h, this.c.i);
   }

   private void a(ear $$0, boolean $$1) {
      try (bpy $$2 = bps.a().d("scheduleLayer")) {
         $$2.a($$0::f);
         int $$3 = this.b($$0, $$1);

         for (int $$4 = this.c.h - $$3; $$4 <= this.c.h + $$3; $$4++) {
            for (int $$5 = this.c.i - $$3; $$5 <= this.c.i + $$3; $$5++) {
               ary $$6 = this.g.a($$4, $$5);
               if (this.e || !this.a($$0, $$1, $$6)) {
                  return;
               }
            }
         }
      }
   }

   private int b(ear $$0, boolean $$1) {
      eaq $$2 = $$1 ? eaq.a : eaq.b;
      return $$2.a(this.a).a($$0);
   }

   private boolean a(ear $$0, boolean $$1, ary $$2) {
      ear $$3 = $$2.q();
      boolean $$4 = $$3 != null && $$0.b($$3);
      eaq $$5 = $$4 ? eaq.a : eaq.b;
      if ($$4 && !$$1) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<arn<dzq>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
         arn<dzq> $$7 = $$6.getNow(null);
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
         CompletableFuture<arn<dzq>> $$0 = this.f.getLast();
         arn<dzq> $$1 = $$0.getNow(null);
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
