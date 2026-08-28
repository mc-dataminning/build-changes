import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cay extends byq<cqe> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cys e;
   private final List<cys> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public cay(int $$0, int $$1) {
      super(ImmutableMap.of(cgb.r, cgc.a), $$0, $$1);
   }

   public boolean a(aro $$0, cqe $$1) {
      bxz<?> $$2 = $$1.eb();
      if ($$2.c(cgb.r).isEmpty()) {
         return false;
      } else {
         bwz $$3 = $$2.c(cgb.r).get();
         return $$3.aq() == bwj.bS && $$1.bK() && $$3.bK() && !$$1.n_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(aro $$0, cqe $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.eb().c(cgb.r).isPresent();
   }

   public void b(aro $$0, cqe $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aro $$0, cqe $$1, long $$2) {
      bwz $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aro $$0, cqe $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.eb().b(cgb.r);
      c($$1);
      this.e = null;
   }

   private void a(bwz $$0, cqe $$1) {
      boolean $$2 = false;
      cys $$3 = $$0.fa();
      if (this.e == null || !cys.b(this.e, $$3)) {
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

   private void a(cqe $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cqe $$0) {
      for (dhn $$1 : $$0.gr()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dhn $$0) {
      return cys.b(this.e, $$0.b()) || cys.b(this.e, $$0.c());
   }

   private static void c(cqe $$0) {
      $$0.a(bwk.a, cys.k);
      $$0.a(bwk.a, 0.085F);
   }

   private static void a(cqe $$0, cys $$1) {
      $$0.a(bwk.a, $$1);
      $$0.a(bwk.a, 0.0F);
   }

   private bwz d(cqe $$0) {
      bxz<?> $$1 = $$0.eb();
      bwz $$2 = $$1.c(cgb.r).get();
      $$1.a(cgb.o, new bzb($$2, true));
      return $$2;
   }

   private void e(cqe $$0) {
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
