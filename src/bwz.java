import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bwz extends bur<clu> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cua e;
   private final List<cua> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bwz(int $$0, int $$1) {
      super(ImmutableMap.of(ccc.q, ccd.a), $$0, $$1);
   }

   public boolean a(aqk $$0, clu $$1) {
      bua<?> $$2 = $$1.dT();
      if ($$2.c(ccc.q).isEmpty()) {
         return false;
      } else {
         bsy $$3 = $$2.c(ccc.q).get();
         return $$3.ak() == bsj.by && $$1.bD() && $$3.bD() && !$$1.p_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(aqk $$0, clu $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dT().c(ccc.q).isPresent();
   }

   public void b(aqk $$0, clu $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aqk $$0, clu $$1, long $$2) {
      bsy $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aqk $$0, clu $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dT().b(ccc.q);
      c($$1);
      this.e = null;
   }

   private void a(bsy $$0, clu $$1) {
      boolean $$2 = false;
      cua $$3 = $$0.eT();
      if (this.e == null || !cua.b(this.e, $$3)) {
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

   private void a(clu $$0) {
      a($$0, this.f.get(0));
   }

   private void b(clu $$0) {
      for (dbb $$1 : $$0.gp()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dbb $$0) {
      return cua.b(this.e, $$0.b()) || cua.b(this.e, $$0.c());
   }

   private static void c(clu $$0) {
      $$0.a(bsk.a, cua.l);
      $$0.a(bsk.a, 0.085F);
   }

   private static void a(clu $$0, cua $$1) {
      $$0.a(bsk.a, $$1);
      $$0.a(bsk.a, 0.0F);
   }

   private bsy d(clu $$0) {
      bua<?> $$1 = $$0.dT();
      bsy $$2 = $$1.c(ccc.q).get();
      $$1.a(ccc.n, new bvc($$2, true));
      return $$2;
   }

   private void e(clu $$0) {
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
