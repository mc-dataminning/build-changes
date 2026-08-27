import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class eyk {
   private final eqm a;
   private final eyo b;
   private final eyl c;
   private final int d;
   private final ae e;
   private final an f;
   private final ciy g;
   private final tf h;
   private final eym i;
   private final Map<ae, eym> j = Maps.newLinkedHashMap();
   private double k;
   private double l;
   private int m = Integer.MAX_VALUE;
   private int n = Integer.MAX_VALUE;
   private int o = Integer.MIN_VALUE;
   private int p = Integer.MIN_VALUE;
   private float q;
   private boolean r;

   public eyk(eqm $$0, eyo $$1, eyl $$2, int $$3, ae $$4, an $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$5.c();
      this.h = $$5.a();
      this.i = new eym(this, $$0, $$4, $$5);
      this.a(this.i, $$4);
   }

   public eyl a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ae c() {
      return this.e;
   }

   public tf d() {
      return this.h;
   }

   public an e() {
      return this.f;
   }

   public void a(erw $$0, int $$1, int $$2, boolean $$3) {
      this.c.a($$0, $$1, $$2, $$3, this.d);
   }

   public void a(erw $$0, int $$1, int $$2) {
      this.c.a($$0, $$1, $$2, this.d, this.g);
   }

   public void b(erw $$0, int $$1, int $$2) {
      if (!this.r) {
         this.k = (double)(117 - (this.o + this.m) / 2);
         this.l = (double)(56 - (this.p + this.n) / 2);
         this.r = true;
      }

      $$0.c($$1, $$2, $$1 + 234, $$2 + 113);
      $$0.c().a();
      $$0.c().a((float)$$1, (float)$$2, 0.0F);
      aer $$3 = Objects.requireNonNullElse(this.f.d(), fym.a);
      int $$4 = arp.a(this.k);
      int $$5 = arp.a(this.l);
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

   public void a(erw $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, -200.0F);
      $$0.a(0, 0, 234, 113, arp.d(this.q * 255.0F) << 24);
      boolean $$5 = false;
      int $$6 = arp.a(this.k);
      int $$7 = arp.a(this.l);
      if ($$1 > 0 && $$1 < 234 && $$2 > 0 && $$2 < 113) {
         for (eym $$8 : this.j.values()) {
            if ($$8.a($$6, $$7, $$1, $$2)) {
               $$5 = true;
               $$8.a($$0, $$6, $$7, this.q, $$3, $$4);
               break;
            }
         }
      }

      $$0.c().b();
      if ($$5) {
         this.q = arp.a(this.q + 0.02F, 0.0F, 0.3F);
      } else {
         this.q = arp.a(this.q - 0.04F, 0.0F, 1.0F);
      }
   }

   public boolean a(int $$0, int $$1, double $$2, double $$3) {
      return this.c.a($$0, $$1, this.d, $$2, $$3);
   }

   @Nullable
   public static eyk a(eqm $$0, eyo $$1, int $$2, ae $$3) {
      if ($$3.d() == null) {
         return null;
      } else {
         for (eyl $$4 : eyl.values()) {
            if ($$2 < $$4.a()) {
               return new eyk($$0, $$1, $$4, $$2, $$3, $$3.d());
            }

            $$2 -= $$4.a();
         }

         return null;
      }
   }

   public void a(double $$0, double $$1) {
      if (this.o - this.m > 234) {
         this.k = arp.a(this.k + $$0, (double)(-(this.o - 234)), 0.0);
      }

      if (this.p - this.n > 113) {
         this.l = arp.a(this.l + $$1, (double)(-(this.p - 113)), 0.0);
      }
   }

   public void a(ae $$0) {
      if ($$0.d() != null) {
         eym $$1 = new eym(this, this.a, $$0, $$0.d());
         this.a($$1, $$0);
      }
   }

   private void a(eym $$0, ae $$1) {
      this.j.put($$1, $$0);
      int $$2 = $$0.d();
      int $$3 = $$2 + 28;
      int $$4 = $$0.c();
      int $$5 = $$4 + 27;
      this.m = Math.min(this.m, $$2);
      this.o = Math.max(this.o, $$3);
      this.n = Math.min(this.n, $$4);
      this.p = Math.max(this.p, $$5);

      for (eym $$6 : this.j.values()) {
         $$6.b();
      }
   }

   @Nullable
   public eym b(ae $$0) {
      return this.j.get($$0);
   }

   public eyo f() {
      return this.b;
   }
}
