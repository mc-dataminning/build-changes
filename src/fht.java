import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fht {
   private final ezi a;
   private final fhx b;
   private final fhu c;
   private final int d;
   private final ag e;
   private final ar f;
   private final cqm g;
   private final vu h;
   private final fhv i;
   private final Map<af, fhv> j = Maps.newLinkedHashMap();
   private double k;
   private double l;
   private int m = Integer.MAX_VALUE;
   private int n = Integer.MAX_VALUE;
   private int o = Integer.MIN_VALUE;
   private int p = Integer.MIN_VALUE;
   private float q;
   private boolean r;

   public fht(ezi $$0, fhx $$1, fhu $$2, int $$3, ag $$4, ar $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$5.c();
      this.h = $$5.a();
      this.i = new fhv(this, $$0, $$4, $$5);
      this.a(this.i, $$4.b());
   }

   public fhu a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ag c() {
      return this.e;
   }

   public vu d() {
      return this.h;
   }

   public ar e() {
      return this.f;
   }

   public void a(fav $$0, int $$1, int $$2, boolean $$3) {
      this.c.a($$0, $$1, $$2, $$3, this.d);
   }

   public void a(fav $$0, int $$1, int $$2) {
      this.c.a($$0, $$1, $$2, this.d, this.g);
   }

   public void b(fav $$0, int $$1, int $$2) {
      if (!this.r) {
         this.k = (double)(117 - (this.o + this.m) / 2);
         this.l = (double)(56 - (this.p + this.n) / 2);
         this.r = true;
      }

      $$0.c($$1, $$2, $$1 + 234, $$2 + 113);
      $$0.c().a();
      $$0.c().a((float)$$1, (float)$$2, 0.0F);
      ajh $$3 = this.f.d().orElse(gjd.a);
      int $$4 = aww.a(this.k);
      int $$5 = aww.a(this.l);
      int $$6 = $$4 % 16;
      int $$7 = $$5 % 16;

      for (int $$8 = -1; $$8 <= 15; $$8++) {
         for (int $$9 = -1; $$9 <= 8; $$9++) {
            $$0.a($$3, $$6 + 16 * $$8, $$7 + 16 * $$9, 0.0F, 0.0F, 16, 16, 16, 16);
         }
      }

      this.i.a($$0, $$4, $$5, true);
      this.i.a($$0, $$4, $$5, false);
      this.i.a($$0, $$4, $$5);
      $$0.c().b();
      $$0.f();
   }

   public void a(fav $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, -200.0F);
      $$0.a(0, 0, 234, 113, aww.d(this.q * 255.0F) << 24);
      boolean $$5 = false;
      int $$6 = aww.a(this.k);
      int $$7 = aww.a(this.l);
      if ($$1 > 0 && $$1 < 234 && $$2 > 0 && $$2 < 113) {
         for (fhv $$8 : this.j.values()) {
            if ($$8.a($$6, $$7, $$1, $$2)) {
               $$5 = true;
               $$8.a($$0, $$6, $$7, this.q, $$3, $$4);
               break;
            }
         }
      }

      $$0.c().b();
      if ($$5) {
         this.q = aww.a(this.q + 0.02F, 0.0F, 0.3F);
      } else {
         this.q = aww.a(this.q - 0.04F, 0.0F, 1.0F);
      }
   }

   public boolean a(int $$0, int $$1, double $$2, double $$3) {
      return this.c.a($$0, $$1, this.d, $$2, $$3);
   }

   @Nullable
   public static fht a(ezi $$0, fhx $$1, int $$2, ag $$3) {
      Optional<ar> $$4 = $$3.a().c();
      if ($$4.isEmpty()) {
         return null;
      } else {
         for (fhu $$5 : fhu.values()) {
            if ($$2 < $$5.a()) {
               return new fht($$0, $$1, $$5, $$2, $$3, $$4.get());
            }

            $$2 -= $$5.a();
         }

         return null;
      }
   }

   public void a(double $$0, double $$1) {
      if (this.o - this.m > 234) {
         this.k = aww.a(this.k + $$0, (double)(-(this.o - 234)), 0.0);
      }

      if (this.p - this.n > 113) {
         this.l = aww.a(this.l + $$1, (double)(-(this.p - 113)), 0.0);
      }
   }

   public void a(ag $$0) {
      Optional<ar> $$1 = $$0.a().c();
      if (!$$1.isEmpty()) {
         fhv $$2 = new fhv(this, this.a, $$0, $$1.get());
         this.a($$2, $$0.b());
      }
   }

   private void a(fhv $$0, af $$1) {
      this.j.put($$1, $$0);
      int $$2 = $$0.d();
      int $$3 = $$2 + 28;
      int $$4 = $$0.c();
      int $$5 = $$4 + 27;
      this.m = Math.min(this.m, $$2);
      this.o = Math.max(this.o, $$3);
      this.n = Math.min(this.n, $$4);
      this.p = Math.max(this.p, $$5);

      for (fhv $$6 : this.j.values()) {
         $$6.b();
      }
   }

   @Nullable
   public fhv a(af $$0) {
      return this.j.get($$0);
   }

   public fhx f() {
      return this.b;
   }
}
