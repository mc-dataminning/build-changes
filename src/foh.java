import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class foh {
   private final fgm a;
   private final fol b;
   private final foi c;
   private final int d;
   private final ah e;
   private final as f;
   private final cuq g;
   private final wz h;
   private final foj i;
   private final Map<ag, foj> j = Maps.newLinkedHashMap();
   private double k;
   private double l;
   private int m = Integer.MAX_VALUE;
   private int n = Integer.MAX_VALUE;
   private int o = Integer.MIN_VALUE;
   private int p = Integer.MIN_VALUE;
   private float q;
   private boolean r;

   public foh(fgm $$0, fol $$1, foi $$2, int $$3, ah $$4, as $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$5.c();
      this.h = $$5.a();
      this.i = new foj(this, $$0, $$4, $$5);
      this.a(this.i, $$4.b());
   }

   public foi a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ah c() {
      return this.e;
   }

   public wz d() {
      return this.h;
   }

   public as e() {
      return this.f;
   }

   public void a(fhx $$0, int $$1, int $$2, boolean $$3) {
      this.c.a($$0, $$1, $$2, $$3, this.d);
   }

   public void a(fhx $$0, int $$1, int $$2) {
      this.c.a($$0, $$1, $$2, this.d, this.g);
   }

   public void b(fhx $$0, int $$1, int $$2) {
      if (!this.r) {
         this.k = (double)(117 - (this.o + this.m) / 2);
         this.l = (double)(56 - (this.p + this.n) / 2);
         this.r = true;
      }

      $$0.c($$1, $$2, $$1 + 234, $$2 + 113);
      $$0.c().a();
      $$0.c().a((float)$$1, (float)$$2, 0.0F);
      akr $$3 = this.f.d().orElse(gqk.a);
      int $$4 = ayo.a(this.k);
      int $$5 = ayo.a(this.l);
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

   public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, -200.0F);
      $$0.a(0, 0, 234, 113, ayo.d(this.q * 255.0F) << 24);
      boolean $$5 = false;
      int $$6 = ayo.a(this.k);
      int $$7 = ayo.a(this.l);
      if ($$1 > 0 && $$1 < 234 && $$2 > 0 && $$2 < 113) {
         for (foj $$8 : this.j.values()) {
            if ($$8.a($$6, $$7, $$1, $$2)) {
               $$5 = true;
               $$8.a($$0, $$6, $$7, this.q, $$3, $$4);
               break;
            }
         }
      }

      $$0.c().b();
      if ($$5) {
         this.q = ayo.a(this.q + 0.02F, 0.0F, 0.3F);
      } else {
         this.q = ayo.a(this.q - 0.04F, 0.0F, 1.0F);
      }
   }

   public boolean a(int $$0, int $$1, double $$2, double $$3) {
      return this.c.a($$0, $$1, this.d, $$2, $$3);
   }

   @Nullable
   public static foh a(fgm $$0, fol $$1, int $$2, ah $$3) {
      Optional<as> $$4 = $$3.a().c();
      if ($$4.isEmpty()) {
         return null;
      } else {
         for (foi $$5 : foi.values()) {
            if ($$2 < $$5.a()) {
               return new foh($$0, $$1, $$5, $$2, $$3, $$4.get());
            }

            $$2 -= $$5.a();
         }

         return null;
      }
   }

   public void a(double $$0, double $$1) {
      if (this.o - this.m > 234) {
         this.k = ayo.a(this.k + $$0, (double)(-(this.o - 234)), 0.0);
      }

      if (this.p - this.n > 113) {
         this.l = ayo.a(this.l + $$1, (double)(-(this.p - 113)), 0.0);
      }
   }

   public void a(ah $$0) {
      Optional<as> $$1 = $$0.a().c();
      if (!$$1.isEmpty()) {
         foj $$2 = new foj(this, this.a, $$0, $$1.get());
         this.a($$2, $$0.b());
      }
   }

   private void a(foj $$0, ag $$1) {
      this.j.put($$1, $$0);
      int $$2 = $$0.d();
      int $$3 = $$2 + 28;
      int $$4 = $$0.c();
      int $$5 = $$4 + 27;
      this.m = Math.min(this.m, $$2);
      this.o = Math.max(this.o, $$3);
      this.n = Math.min(this.n, $$4);
      this.p = Math.max(this.p, $$5);

      for (foj $$6 : this.j.values()) {
         $$6.b();
      }
   }

   @Nullable
   public foj a(ag $$0) {
      return this.j.get($$0);
   }

   public fol f() {
      return this.b;
   }
}
