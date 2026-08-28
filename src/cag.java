import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cag extends bxy<cpi> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cxo e;
   private final List<cxo> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public cag(int $$0, int $$1) {
      super(ImmutableMap.of(cfj.q, cfk.a), $$0, $$1);
   }

   public boolean a(ash $$0, cpi $$1) {
      bxh<?> $$2 = $$1.ec();
      if ($$2.c(cfj.q).isEmpty()) {
         return false;
      } else {
         bwf $$3 = $$2.c(cfj.q).get();
         return $$3.aq() == bvq.bS && $$1.bL() && $$3.bL() && !$$1.e_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(ash $$0, cpi $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.ec().c(cfj.q).isPresent();
   }

   public void b(ash $$0, cpi $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(ash $$0, cpi $$1, long $$2) {
      bwf $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(ash $$0, cpi $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.ec().b(cfj.q);
      c($$1);
      this.e = null;
   }

   private void a(bwf $$0, cpi $$1) {
      boolean $$2 = false;
      cxo $$3 = $$0.eZ();
      if (this.e == null || !cxo.b(this.e, $$3)) {
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

   private void a(cpi $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cpi $$0) {
      for (dge $$1 : $$0.gq()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dge $$0) {
      return cxo.b(this.e, $$0.b()) || cxo.b(this.e, $$0.c());
   }

   private static void c(cpi $$0) {
      $$0.a(bvr.a, cxo.j);
      $$0.a(bvr.a, 0.085F);
   }

   private static void a(cpi $$0, cxo $$1) {
      $$0.a(bvr.a, $$1);
      $$0.a(bvr.a, 0.0F);
   }

   private bwf d(cpi $$0) {
      bxh<?> $$1 = $$0.ec();
      bwf $$2 = $$1.c(cfj.q).get();
      $$1.a(cfj.n, new byj($$2, true));
      return $$2;
   }

   private void e(cpi $$0) {
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
