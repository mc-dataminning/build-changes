import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bng extends bkz<cbj> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cjh e;
   private final List<cjh> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bng(int $$0, int $$1) {
      super(ImmutableMap.of(bsj.q, bsk.a), $$0, $$1);
   }

   public boolean a(aks $$0, cbj $$1) {
      bki<?> $$2 = $$1.dN();
      if ($$2.c(bsj.q).isEmpty()) {
         return false;
      } else {
         bji $$3 = $$2.c(bsj.q).get();
         return $$3.ag() == biw.bt && $$1.bv() && $$3.bv() && !$$1.m_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(aks $$0, cbj $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dN().c(bsj.q).isPresent();
   }

   public void b(aks $$0, cbj $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aks $$0, cbj $$1, long $$2) {
      bji $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aks $$0, cbj $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dN().b(bsj.q);
      c($$1);
      this.e = null;
   }

   private void a(bji $$0, cbj $$1) {
      boolean $$2 = false;
      cjh $$3 = $$0.eS();
      if (this.e == null || !cjh.b(this.e, $$3)) {
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

   private void a(cbj $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cbj $$0) {
      for (cov $$1 : $$0.gf()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(cov $$0) {
      return cjh.b(this.e, $$0.b()) || cjh.b(this.e, $$0.c());
   }

   private static void c(cbj $$0) {
      $$0.a(bix.a, cjh.b);
      $$0.a(bix.a, 0.085F);
   }

   private static void a(cbj $$0, cjh $$1) {
      $$0.a(bix.a, $$1);
      $$0.a(bix.a, 0.0F);
   }

   private bji d(cbj $$0) {
      bki<?> $$1 = $$0.dN();
      bji $$2 = $$1.c(bsj.q).get();
      $$1.a(bsj.n, new blk($$2, true));
      return $$2;
   }

   private void e(cbj $$0) {
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
