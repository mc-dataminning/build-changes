import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public class ftw implements fty {
   private static final all a = all.b("container/bundle/bundle_progressbar_border");
   private static final all b = all.b("container/bundle/bundle_progressbar_fill");
   private static final all c = all.b("container/bundle/bundle_progressbar_full");
   private static final all d = all.b("container/bundle/slot_highlight_back");
   private static final all e = all.b("container/bundle/slot_highlight_front");
   private static final int f = 4;
   private static final int g = 24;
   private static final int h = 96;
   private static final int i = 13;
   private static final int j = 96;
   private static final int k = 1;
   private static final int l = 94;
   private static final int m = 4;
   private static final xl n = xl.c("item.minecraft.bundle.full");
   private static final xl o = xl.c("item.minecraft.bundle.empty");
   private static final xl p = xl.c("item.minecraft.bundle.empty.description");
   private final cyj q;

   public ftw(cyj $$0) {
      this.q = $$0;
   }

   @Override
   public int a(flh $$0) {
      return this.q.g() ? c($$0) : this.b();
   }

   @Override
   public int b(flh $$0) {
      return 96;
   }

   @Override
   public boolean a() {
      return true;
   }

   private static int c(flh $$0) {
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
      return azn.e(this.e(), 4);
   }

   private int e() {
      return Math.min(12, this.q.e());
   }

   @Override
   public void a(flh $$0, int $$1, int $$2, int $$3, int $$4, flj $$5) {
      if (this.q.g()) {
         this.b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         this.c($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private void b(flh $$0, int $$1, int $$2, int $$3, int $$4, flj $$5) {
      b($$1 + this.a($$3), $$2, $$0, $$5);
      this.a($$1 + this.a($$3), $$2 + d($$0) + 4, $$0, $$5);
   }

   private void c(flh $$0, int $$1, int $$2, int $$3, int $$4, flj $$5) {
      boolean $$6 = this.q.e() > 12;
      List<cwf> $$7 = this.b(this.q.a());
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

   private List<cwf> b(int $$0) {
      int $$1 = Math.min(this.q.e(), $$0);
      return this.q.b().toList().subList(0, $$1);
   }

   private static boolean a(boolean $$0, int $$1, int $$2) {
      return $$0 && $$1 * $$2 == 1;
   }

   private static boolean a(List<cwf> $$0, int $$1) {
      return $$0.size() >= $$1;
   }

   private int a(List<cwf> $$0) {
      return this.q.b().skip((long)$$0.size()).mapToInt(cwf::L).sum();
   }

   private void a(int $$0, int $$1, int $$2, List<cwf> $$3, int $$4, flh $$5, flj $$6) {
      int $$7 = $$3.size() - $$0;
      boolean $$8 = $$7 == this.q.h();
      cwf $$9 = $$3.get($$7);
      if ($$8) {
         $$6.a(gjh::B, d, $$1, $$2, 24, 24);
      }

      $$6.a($$9, $$1 + 4, $$2 + 4, $$4);
      $$6.a($$5, $$9, $$1 + 4, $$2 + 4);
      if ($$8) {
         $$6.a(gjh::z, e, $$1, $$2, 24, 24);
      }
   }

   private static void a(int $$0, int $$1, int $$2, flh $$3, flj $$4) {
      $$4.a($$3, "+" + $$2, $$0 + 12, $$1 + 10, 16777215);
   }

   private void a(flh $$0, flj $$1, int $$2, int $$3, int $$4) {
      if (this.q.i()) {
         cwf $$5 = this.q.a(this.q.h());
         xl $$6 = $$5.A();
         int $$7 = $$0.a($$6.g());
         int $$8 = $$2 + $$4 / 2 - 12;
         $$1.a($$0, $$6, $$8 - $$7 / 2, $$3 - 15, $$5.a(ku.G));
      }
   }

   private void a(int $$0, int $$1, flh $$2, flj $$3) {
      $$3.a(gjh::B, this.g(), $$0 + 1, $$1, this.f(), 13);
      $$3.a(gjh::B, a, $$0, $$1, 96, 13);
      xl $$4 = this.h();
      if ($$4 != null) {
         $$3.a($$2, $$4, $$0 + 48, $$1 + 3, 16777215);
      }
   }

   private static void b(int $$0, int $$1, flh $$2, flj $$3) {
      $$3.a($$2, p, $$0, $$1, 96, 11184810);
   }

   private static int d(flh $$0) {
      return $$0.c(p, 96).size() * 9;
   }

   private int f() {
      return azn.a(azn.a(this.q.f(), 94), 0, 94);
   }

   private all g() {
      return this.q.f().compareTo(Fraction.ONE) >= 0 ? c : b;
   }

   @Nullable
   private xl h() {
      if (this.q.g()) {
         return o;
      } else {
         return this.q.f().compareTo(Fraction.ONE) >= 0 ? n : null;
      }
   }
}
