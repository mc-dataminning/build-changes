import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bne extends bkx<cbh> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cjf e;
   private final List<cjf> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bne(int $$0, int $$1) {
      super(ImmutableMap.of(bsh.q, bsi.a), $$0, $$1);
   }

   public boolean a(akr $$0, cbh $$1) {
      bkg<?> $$2 = $$1.dN();
      if ($$2.c(bsh.q).isEmpty()) {
         return false;
      } else {
         bjg $$3 = $$2.c(bsh.q).get();
         return $$3.ah() == biu.bt && $$1.bw() && $$3.bw() && !$$1.m_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(akr $$0, cbh $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dN().c(bsh.q).isPresent();
   }

   public void b(akr $$0, cbh $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(akr $$0, cbh $$1, long $$2) {
      bjg $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(akr $$0, cbh $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dN().b(bsh.q);
      c($$1);
      this.e = null;
   }

   private void a(bjg $$0, cbh $$1) {
      boolean $$2 = false;
      cjf $$3 = $$0.eS();
      if (this.e == null || !cjf.b(this.e, $$3)) {
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

   private void a(cbh $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cbh $$0) {
      for (cot $$1 : $$0.gf()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.d());
         }
      }
   }

   private boolean a(cot $$0) {
      return cjf.b(this.e, $$0.b()) || cjf.b(this.e, $$0.c());
   }

   private static void c(cbh $$0) {
      $$0.a(biv.a, cjf.b);
      $$0.a(biv.a, 0.085F);
   }

   private static void a(cbh $$0, cjf $$1) {
      $$0.a(biv.a, $$1);
      $$0.a(biv.a, 0.0F);
   }

   private bjg d(cbh $$0) {
      bkg<?> $$1 = $$0.dN();
      bjg $$2 = $$1.c(bsh.q).get();
      $$1.a(bsh.n, new bli($$2, true));
      return $$2;
   }

   private void e(cbh $$0) {
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
