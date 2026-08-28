import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public class fsk implements fsm {
   private static final alc a = alc.b("container/bundle/bundle_progressbar_border");
   private static final int b = 4;
   private static final int c = 24;
   private static final int d = 96;
   private static final int e = 13;
   private static final int f = 96;
   private static final int g = 1;
   private static final int h = 94;
   private static final int i = 4;
   private static final xd j = xd.c("item.minecraft.bundle.full");
   private static final xd k = xd.c("item.minecraft.bundle.empty");
   private static final xd l = xd.c("item.minecraft.bundle.empty.description");
   private final cxz m;

   public fsk(cxz $$0) {
      this.m = $$0;
   }

   @Override
   public int a(fjv $$0) {
      return this.m.g() ? c($$0) : this.b();
   }

   @Override
   public int b(fjv $$0) {
      return 96;
   }

   @Override
   public boolean a() {
      return true;
   }

   private static int c(fjv $$0) {
      return d($$0) + 13 + 8;
   }

   private int b() {
      return this.c() + 13 + 8;
   }

   private int c() {
      return this.d() * 24;
   }

   private int d() {
      return azd.e(this.e(), 4);
   }

   private int e() {
      return Math.min(12, this.m.e());
   }

   @Override
   public void a(fjv $$0, int $$1, int $$2, fjx $$3) {
      if (this.m.g()) {
         this.b($$0, $$1, $$2, $$3);
      } else {
         this.c($$0, $$1, $$2, $$3);
      }
   }

   private void b(fjv $$0, int $$1, int $$2, fjx $$3) {
      b($$1, $$2, $$0, $$3);
      this.a($$1, $$2 + d($$0) + 4, $$0, $$3);
   }

   private void c(fjv $$0, int $$1, int $$2, fjx $$3) {
      boolean $$4 = this.m.e() > 12;
      List<cvp> $$5 = this.a(this.m.a());
      int $$6 = $$1 + 96;
      int $$7 = $$2 + this.d() * 24;
      int $$8 = 1;

      for (int $$9 = 1; $$9 <= this.d(); $$9++) {
         for (int $$10 = 1; $$10 <= 4; $$10++) {
            int $$11 = $$6 - $$10 * 24;
            int $$12 = $$7 - $$9 * 24;
            if (a($$4, $$10, $$9)) {
               a($$11, $$12, this.a($$5), $$0, $$3);
            } else if (a($$5, $$8)) {
               this.a($$8, $$11, $$12, $$5, $$8, $$0, $$3);
               $$8++;
            }
         }
      }

      this.a($$0, $$3, $$1, $$2);
      this.a($$1, $$2 + this.c() + 4, $$0, $$3);
   }

   private List<cvp> a(int $$0) {
      int $$1 = Math.min(this.m.e(), $$0);
      return this.m.b().toList().subList(0, $$1);
   }

   private static boolean a(boolean $$0, int $$1, int $$2) {
      return $$0 && $$1 * $$2 == 1;
   }

   private static boolean a(List<cvp> $$0, int $$1) {
      return $$0.size() >= $$1;
   }

   private int a(List<cvp> $$0) {
      return this.m.b().skip((long)$$0.size()).mapToInt(cvp::J).sum();
   }

   private void a(int $$0, int $$1, int $$2, List<cvp> $$3, int $$4, fjv $$5, fjx $$6) {
      int $$7 = $$3.size() - $$0;
      cvp $$8 = $$3.get($$7);
      this.a($$7, $$6, $$1, $$2);
      $$6.a($$8, $$1 + 4, $$2 + 4, $$4);
      $$6.a($$5, $$8, $$1 + 4, $$2 + 4);
   }

   private static void a(int $$0, int $$1, int $$2, fjv $$3, fjx $$4) {
      $$4.a($$3, "+" + $$2, $$0 + 12, $$1 + 10, 16777215);
   }

   private void a(int $$0, fjx $$1, int $$2, int $$3) {
      if ($$0 != -1 && $$0 == this.m.h()) {
         $$1.a(ghq.F(), $$2, $$3, $$2 + 24, $$3 + 24, -2130706433, -2130706433, 0);
      }
   }

   private void a(fjv $$0, fjx $$1, int $$2, int $$3) {
      if (this.m.i()) {
         cvp $$4 = this.m.a(this.m.h());
         xd $$5 = $$4.y();
         int $$6 = $$0.a($$5.g());
         int $$7 = $$2 + this.b($$0) / 2 - 12;
         $$1.a($$0, $$5, $$7 - $$6 / 2, $$3 - 15);
      }
   }

   private void a(int $$0, int $$1, fjv $$2, fjx $$3) {
      $$3.a(ghq.F(), $$0 + 1, $$1, $$0 + 1 + this.f(), $$1 + 13, cty.a(this.m.f()) | 0xFF000000);
      $$3.a(ghq::B, a, $$0, $$1, 96, 13);
      xd $$4 = this.g();
      if ($$4 != null) {
         $$3.a($$2, $$4, $$0 + 48, $$1 + 3, 16777215);
      }
   }

   private static void b(int $$0, int $$1, fjv $$2, fjx $$3) {
      $$3.a($$2, l, $$0, $$1, 96, 11184810);
   }

   private static int d(fjv $$0) {
      return $$0.c(l, 96).size() * 9;
   }

   private int f() {
      return azd.a(this.m.f(), 94);
   }

   @Nullable
   private xd g() {
      if (this.m.g()) {
         return k;
      } else {
         return this.m.f().compareTo(Fraction.ONE) >= 0 ? j : null;
      }
   }
}
