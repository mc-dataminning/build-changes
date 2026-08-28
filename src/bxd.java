import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxd extends buv<cly> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cud e;
   private final List<cud> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bxd(int $$0, int $$1) {
      super(ImmutableMap.of(ccg.q, cch.a), $$0, $$1);
   }

   public boolean a(aqm $$0, cly $$1) {
      bue<?> $$2 = $$1.dV();
      if ($$2.c(ccg.q).isEmpty()) {
         return false;
      } else {
         btc $$3 = $$2.c(ccg.q).get();
         return $$3.am() == bsn.by && $$1.bF() && $$3.bF() && !$$1.o_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(aqm $$0, cly $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dV().c(ccg.q).isPresent();
   }

   public void b(aqm $$0, cly $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aqm $$0, cly $$1, long $$2) {
      btc $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aqm $$0, cly $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dV().b(ccg.q);
      c($$1);
      this.e = null;
   }

   private void a(btc $$0, cly $$1) {
      boolean $$2 = false;
      cud $$3 = $$0.eV();
      if (this.e == null || !cud.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.e()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cly $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cly $$0) {
      for (dbe $$1 : $$0.gp()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dbe $$0) {
      return cud.b(this.e, $$0.b()) || cud.b(this.e, $$0.c());
   }

   private static void c(cly $$0) {
      $$0.a(bso.a, cud.l);
      $$0.a(bso.a, 0.085F);
   }

   private static void a(cly $$0, cud $$1) {
      $$0.a(bso.a, $$1);
      $$0.a(bso.a, 0.0F);
   }

   private btc d(cly $$0) {
      bue<?> $$1 = $$0.dV();
      btc $$2 = $$1.c(ccg.q).get();
      $$1.a(ccg.n, new bvg($$2, true));
      return $$2;
   }

   private void e(cly $$0) {
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
