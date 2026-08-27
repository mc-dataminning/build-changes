import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bmv extends bko<cay> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private ciw e;
   private final List<ciw> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bmv(int $$0, int $$1) {
      super(ImmutableMap.of(bry.q, brz.a), $$0, $$1);
   }

   public boolean a(aki $$0, cay $$1) {
      bjx<?> $$2 = $$1.dM();
      if (!$$2.c(bry.q).isPresent()) {
         return false;
      } else {
         biw $$3 = $$2.c(bry.q).get();
         return $$3.ag() == bik.bt && $$1.bv() && $$3.bv() && !$$1.i_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(aki $$0, cay $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dM().c(bry.q).isPresent();
   }

   public void b(aki $$0, cay $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aki $$0, cay $$1, long $$2) {
      biw $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aki $$0, cay $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dM().b(bry.q);
      c($$1);
      this.e = null;
   }

   private void a(biw $$0, cay $$1) {
      boolean $$2 = false;
      ciw $$3 = $$0.eR();
      if (this.e == null || !ciw.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.b()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cay $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cay $$0) {
      for (coh $$1 : $$0.gb()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.d());
         }
      }
   }

   private boolean a(coh $$0) {
      return ciw.b(this.e, $$0.b()) || ciw.b(this.e, $$0.c());
   }

   private static void c(cay $$0) {
      $$0.a(bil.a, ciw.b);
      $$0.a(bil.a, 0.085F);
   }

   private static void a(cay $$0, ciw $$1) {
      $$0.a(bil.a, $$1);
      $$0.a(bil.a, 0.0F);
   }

   private biw d(cay $$0) {
      bjx<?> $$1 = $$0.dM();
      biw $$2 = $$1.c(bry.q).get();
      $$1.a(bry.n, new bkz($$2, true));
      return $$2;
   }

   private void e(cay $$0) {
      if (this.f.size() >= 2 && ++this.g >= 40) {
         this.h++;
         this.g = 0;
         if (this.h > this.f.size() - 1) {
            this.h = 0;
         }

         a($$0, this.f.get(this.h));
      }
   }
}
