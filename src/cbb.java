import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cbb extends byt<cqk> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cyy e;
   private final List<cyy> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public cbb(int $$0, int $$1) {
      super(ImmutableMap.of(cge.r, cgf.a), $$0, $$1);
   }

   public boolean a(arq $$0, cqk $$1) {
      byc<?> $$2 = $$1.eb();
      if ($$2.c(cge.r).isEmpty()) {
         return false;
      } else {
         bxc $$3 = $$2.c(cge.r).get();
         return $$3.aq() == bwm.bS && $$1.bK() && $$3.bK() && !$$1.n_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(arq $$0, cqk $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.eb().c(cge.r).isPresent();
   }

   public void b(arq $$0, cqk $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arq $$0, cqk $$1, long $$2) {
      bxc $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arq $$0, cqk $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.eb().b(cge.r);
      c($$1);
      this.e = null;
   }

   private void a(bxc $$0, cqk $$1) {
      boolean $$2 = false;
      cyy $$3 = $$0.fa();
      if (this.e == null || !cyy.b(this.e, $$3)) {
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

   private void a(cqk $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cqk $$0) {
      for (dht $$1 : $$0.gr()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dht $$0) {
      return cyy.b(this.e, $$0.b()) || cyy.b(this.e, $$0.c());
   }

   private static void c(cqk $$0) {
      $$0.a(bwn.a, cyy.k);
      $$0.a(bwn.a, 0.085F);
   }

   private static void a(cqk $$0, cyy $$1) {
      $$0.a(bwn.a, $$1);
      $$0.a(bwn.a, 0.0F);
   }

   private bxc d(cqk $$0) {
      byc<?> $$1 = $$0.eb();
      bxc $$2 = $$1.c(cge.r).get();
      $$1.a(cge.o, new bze($$2, true));
      return $$2;
   }

   private void e(cqk $$0) {
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
