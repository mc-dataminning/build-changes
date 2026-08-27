import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bnk extends bld<cbn> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cjl e;
   private final List<cjl> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bnk(int $$0, int $$1) {
      super(ImmutableMap.of(bsn.q, bso.a), $$0, $$1);
   }

   public boolean a(akt $$0, cbn $$1) {
      bkm<?> $$2 = $$1.dN();
      if ($$2.c(bsn.q).isEmpty()) {
         return false;
      } else {
         bjm $$3 = $$2.c(bsn.q).get();
         return $$3.ag() == bja.bt && $$1.bv() && $$3.bv() && !$$1.m_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(akt $$0, cbn $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dN().c(bsn.q).isPresent();
   }

   public void b(akt $$0, cbn $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(akt $$0, cbn $$1, long $$2) {
      bjm $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(akt $$0, cbn $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dN().b(bsn.q);
      c($$1);
      this.e = null;
   }

   private void a(bjm $$0, cbn $$1) {
      boolean $$2 = false;
      cjl $$3 = $$0.eS();
      if (this.e == null || !cjl.b(this.e, $$3)) {
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

   private void a(cbn $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cbn $$0) {
      for (coz $$1 : $$0.gg()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(coz $$0) {
      return cjl.b(this.e, $$0.b()) || cjl.b(this.e, $$0.c());
   }

   private static void c(cbn $$0) {
      $$0.a(bjb.a, cjl.b);
      $$0.a(bjb.a, 0.085F);
   }

   private static void a(cbn $$0, cjl $$1) {
      $$0.a(bjb.a, $$1);
      $$0.a(bjb.a, 0.0F);
   }

   private bjm d(cbn $$0) {
      bkm<?> $$1 = $$0.dN();
      bjm $$2 = $$1.c(bsn.q).get();
      $$1.a(bsn.n, new blo($$2, true));
      return $$2;
   }

   private void e(cbn $$0) {
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
