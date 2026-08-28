import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public class fso implements fsq {
   private static final ale a = ale.b("container/bundle/bundle_progressbar_border");
   private static final ale b = ale.b("container/bundle/bundle_progressbar_fill");
   private static final ale c = ale.b("container/bundle/bundle_progressbar_full");
   private static final int d = 4;
   private static final int e = 24;
   private static final int f = 96;
   private static final int g = 13;
   private static final int h = 96;
   private static final int i = 1;
   private static final int j = 94;
   private static final int k = 4;
   private static final xe l = xe.c("item.minecraft.bundle.full");
   private static final xe m = xe.c("item.minecraft.bundle.empty");
   private static final xe n = xe.c("item.minecraft.bundle.empty.description");
   private final cyc o;

   public fso(cyc $$0) {
      this.o = $$0;
   }

   @Override
   public int a(fjz $$0) {
      return this.o.g() ? c($$0) : this.b();
   }

   @Override
   public int b(fjz $$0) {
      return 96;
   }

   @Override
   public boolean a() {
      return true;
   }

   private static int c(fjz $$0) {
      return d($$0) + 13 + 8;
   }

   private int b() {
      return this.c() + 13 + 8;
   }

   private int c() {
      return this.d() * 24;
   }

   private int a(int $$0) {
      return ($$0 - 96) / 2;
   }

   private int d() {
      return azf.e(this.e(), 4);
   }

   private int e() {
      return Math.min(12, this.o.e());
   }

   @Override
   public void a(fjz $$0, int $$1, int $$2, int $$3, int $$4, fkb $$5) {
      if (this.o.g()) {
         this.b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         this.c($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private void b(fjz $$0, int $$1, int $$2, int $$3, int $$4, fkb $$5) {
      b($$1 + this.a($$3), $$2, $$0, $$5);
      this.a($$1 + this.a($$3), $$2 + d($$0) + 4, $$0, $$5);
   }

   private void c(fjz $$0, int $$1, int $$2, int $$3, int $$4, fkb $$5) {
      boolean $$6 = this.o.e() > 12;
      List<cvs> $$7 = this.b(this.o.a());
      int $$8 = $$1 + this.a($$3) + 96;
      int $$9 = $$2 + this.d() * 24;
      int $$10 = 1;

      for (int $$11 = 1; $$11 <= this.d(); $$11++) {
         for (int $$12 = 1; $$12 <= 4; $$12++) {
            int $$13 = $$8 - $$12 * 24;
            int $$14 = $$9 - $$11 * 24;
            if (a($$6, $$12, $$11)) {
               a($$13, $$14, this.a($$7), $$0, $$5);
            } else if (a($$7, $$10)) {
               this.a($$10, $$13, $$14, $$7, $$10, $$0, $$5);
               $$10++;
            }
         }
      }

      this.a($$0, $$5, $$1, $$2, $$3);
      this.a($$1 + this.a($$3), $$2 + this.c() + 4, $$0, $$5);
   }

   private List<cvs> b(int $$0) {
      int $$1 = Math.min(this.o.e(), $$0);
      return this.o.b().toList().subList(0, $$1);
   }

   private static boolean a(boolean $$0, int $$1, int $$2) {
      return $$0 && $$1 * $$2 == 1;
   }

   private static boolean a(List<cvs> $$0, int $$1) {
      return $$0.size() >= $$1;
   }

   private int a(List<cvs> $$0) {
      return this.o.b().skip((long)$$0.size()).mapToInt(cvs::K).sum();
   }

   private void a(int $$0, int $$1, int $$2, List<cvs> $$3, int $$4, fjz $$5, fkb $$6) {
      int $$7 = $$3.size() - $$0;
      cvs $$8 = $$3.get($$7);
      this.a($$7, $$6, $$1, $$2);
      $$6.a($$8, $$1 + 4, $$2 + 4, $$4);
      $$6.a($$5, $$8, $$1 + 4, $$2 + 4);
   }

   private static void a(int $$0, int $$1, int $$2, fjz $$3, fkb $$4) {
      $$4.a($$3, "+" + $$2, $$0 + 12, $$1 + 10, 16777215);
   }

   private void a(int $$0, fkb $$1, int $$2, int $$3) {
      if ($$0 != -1 && $$0 == this.o.h()) {
         $$1.a(ghv.F(), $$2, $$3, $$2 + 24, $$3 + 24, -2130706433, -2130706433, 0);
      }
   }

   private void a(fjz $$0, fkb $$1, int $$2, int $$3, int $$4) {
      if (this.o.i()) {
         cvs $$5 = this.o.a(this.o.h());
         xe $$6 = $$5.z();
         int $$7 = $$0.a($$6.g());
         int $$8 = $$2 + $$4 / 2 - 12;
         $$1.a($$0, $$6, $$8 - $$7 / 2, $$3 - 15);
      }
   }

   private void a(int $$0, int $$1, fjz $$2, fkb $$3) {
      $$3.a(ghv::B, this.g(), $$0 + 1, $$1, this.f(), 13);
      $$3.a(ghv::B, a, $$0, $$1, 96, 13);
      xe $$4 = this.h();
      if ($$4 != null) {
         $$3.a($$2, $$4, $$0 + 48, $$1 + 3, 16777215);
      }
   }

   private static void b(int $$0, int $$1, fjz $$2, fkb $$3) {
      $$3.a($$2, n, $$0, $$1, 96, 11184810);
   }

   private static int d(fjz $$0) {
      return $$0.c(n, 96).size() * 9;
   }

   private int f() {
      return azf.a(azf.a(this.o.f(), 94), 0, 94);
   }

   private ale g() {
      return this.o.f().compareTo(Fraction.ONE) >= 0 ? c : b;
   }

   @Nullable
   private xe h() {
      if (this.o.g()) {
         return m;
      } else {
         return this.o.f().compareTo(Fraction.ONE) >= 0 ? l : null;
      }
   }
}
