import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fdm {
   private final evh a;
   private final fdq b;
   private final fdn c;
   private final int d;
   private final ag e;
   private final ar f;
   private final cmx g;
   private final vf h;
   private final fdo i;
   private final Map<af, fdo> j = Maps.newLinkedHashMap();
   private double k;
   private double l;
   private int m = Integer.MAX_VALUE;
   private int n = Integer.MAX_VALUE;
   private int o = Integer.MIN_VALUE;
   private int p = Integer.MIN_VALUE;
   private float q;
   private boolean r;

   public fdm(evh $$0, fdq $$1, fdn $$2, int $$3, ag $$4, ar $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$5.c();
      this.h = $$5.a();
      this.i = new fdo(this, $$0, $$4, $$5);
      this.a(this.i, $$4.b());
   }

   public fdn a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ag c() {
      return this.e;
   }

   public vf d() {
      return this.h;
   }

   public ar e() {
      return this.f;
   }

   public void a(ewt $$0, int $$1, int $$2, boolean $$3) {
      this.c.a($$0, $$1, $$2, $$3, this.d);
   }

   public void a(ewt $$0, int $$1, int $$2) {
      this.c.a($$0, $$1, $$2, this.d, this.g);
   }

   public void b(ewt $$0, int $$1, int $$2) {
      if (!this.r) {
         this.k = (double)(117 - (this.o + this.m) / 2);
         this.l = (double)(56 - (this.p + this.n) / 2);
         this.r = true;
      }

      $$0.c($$1, $$2, $$1 + 234, $$2 + 113);
      $$0.c().a();
      $$0.c().a((float)$$1, (float)$$2, 0.0F);
      ahg $$3 = this.f.d().orElse(gen.a);
      int $$4 = aun.a(this.k);
      int $$5 = aun.a(this.l);
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

   public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, -200.0F);
      $$0.a(0, 0, 234, 113, aun.d(this.q * 255.0F) << 24);
      boolean $$5 = false;
      int $$6 = aun.a(this.k);
      int $$7 = aun.a(this.l);
      if ($$1 > 0 && $$1 < 234 && $$2 > 0 && $$2 < 113) {
         for (fdo $$8 : this.j.values()) {
            if ($$8.a($$6, $$7, $$1, $$2)) {
               $$5 = true;
               $$8.a($$0, $$6, $$7, this.q, $$3, $$4);
               break;
            }
         }
      }

      $$0.c().b();
      if ($$5) {
         this.q = aun.a(this.q + 0.02F, 0.0F, 0.3F);
      } else {
         this.q = aun.a(this.q - 0.04F, 0.0F, 1.0F);
      }
   }

   public boolean a(int $$0, int $$1, double $$2, double $$3) {
      return this.c.a($$0, $$1, this.d, $$2, $$3);
   }

   @Nullable
   public static fdm a(evh $$0, fdq $$1, int $$2, ag $$3) {
      Optional<ar> $$4 = $$3.a().c();
      if ($$4.isEmpty()) {
         return null;
      } else {
         for (fdn $$5 : fdn.values()) {
            if ($$2 < $$5.a()) {
               return new fdm($$0, $$1, $$5, $$2, $$3, $$4.get());
            }

            $$2 -= $$5.a();
         }

         return null;
      }
   }

   public void a(double $$0, double $$1) {
      if (this.o - this.m > 234) {
         this.k = aun.a(this.k + $$0, (double)(-(this.o - 234)), 0.0);
      }

      if (this.p - this.n > 113) {
         this.l = aun.a(this.l + $$1, (double)(-(this.p - 113)), 0.0);
      }
   }

   public void a(ag $$0) {
      Optional<ar> $$1 = $$0.a().c();
      if (!$$1.isEmpty()) {
         fdo $$2 = new fdo(this, this.a, $$0, $$1.get());
         this.a($$2, $$0.b());
      }
   }

   private void a(fdo $$0, af $$1) {
      this.j.put($$1, $$0);
      int $$2 = $$0.d();
      int $$3 = $$2 + 28;
      int $$4 = $$0.c();
      int $$5 = $$4 + 27;
      this.m = Math.min(this.m, $$2);
      this.o = Math.max(this.o, $$3);
      this.n = Math.min(this.n, $$4);
      this.p = Math.max(this.p, $$5);

      for (fdo $$6 : this.j.values()) {
         $$6.b();
      }
   }

   @Nullable
   public fdo a(af $$0) {
      return this.j.get($$0);
   }

   public fdq f() {
      return this.b;
   }
}
