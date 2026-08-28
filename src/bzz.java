import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bzz extends bxr<cpd> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cxh e;
   private final List<cxh> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bzz(int $$0, int $$1) {
      super(ImmutableMap.of(cfc.q, cfd.a), $$0, $$1);
   }

   public boolean a(ard $$0, cpd $$1) {
      bxa<?> $$2 = $$1.ea();
      if ($$2.c(cfc.q).isEmpty()) {
         return false;
      } else {
         bvy $$3 = $$2.c(cfc.q).get();
         return $$3.aq() == bvi.bR && $$1.bJ() && $$3.bJ() && !$$1.n_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(ard $$0, cpd $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.ea().c(cfc.q).isPresent();
   }

   public void b(ard $$0, cpd $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(ard $$0, cpd $$1, long $$2) {
      bvy $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(ard $$0, cpd $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.ea().b(cfc.q);
      c($$1);
      this.e = null;
   }

   private void a(bvy $$0, cpd $$1) {
      boolean $$2 = false;
      cxh $$3 = $$0.eZ();
      if (this.e == null || !cxh.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.f()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cpd $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cpd $$0) {
      for (dfx $$1 : $$0.gt()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dfx $$0) {
      return cxh.b(this.e, $$0.b()) || cxh.b(this.e, $$0.c());
   }

   private static void c(cpd $$0) {
      $$0.a(bvj.a, cxh.k);
      $$0.a(bvj.a, 0.085F);
   }

   private static void a(cpd $$0, cxh $$1) {
      $$0.a(bvj.a, $$1);
      $$0.a(bvj.a, 0.0F);
   }

   private bvy d(cpd $$0) {
      bxa<?> $$1 = $$0.ea();
      bvy $$2 = $$1.c(cfc.q).get();
      $$1.a(cfc.n, new byc($$2, true));
      return $$2;
   }

   private void e(cpd $$0) {
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
