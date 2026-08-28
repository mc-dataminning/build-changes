import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class caq extends byi<cpu> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cxy e;
   private final List<cxy> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public caq(int $$0, int $$1) {
      super(ImmutableMap.of(cft.r, cfu.a), $$0, $$1);
   }

   public boolean a(arn $$0, cpu $$1) {
      bxr<?> $$2 = $$1.eb();
      if ($$2.c(cft.r).isEmpty()) {
         return false;
      } else {
         bwr $$3 = $$2.c(cft.r).get();
         return $$3.aq() == bwb.bR && $$1.bK() && $$3.bK() && !$$1.n_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(arn $$0, cpu $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.eb().c(cft.r).isPresent();
   }

   public void b(arn $$0, cpu $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arn $$0, cpu $$1, long $$2) {
      bwr $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arn $$0, cpu $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.eb().b(cft.r);
      c($$1);
      this.e = null;
   }

   private void a(bwr $$0, cpu $$1) {
      boolean $$2 = false;
      cxy $$3 = $$0.fa();
      if (this.e == null || !cxy.b(this.e, $$3)) {
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

   private void a(cpu $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cpu $$0) {
      for (dgn $$1 : $$0.gr()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dgn $$0) {
      return cxy.b(this.e, $$0.b()) || cxy.b(this.e, $$0.c());
   }

   private static void c(cpu $$0) {
      $$0.a(bwc.a, cxy.k);
      $$0.a(bwc.a, 0.085F);
   }

   private static void a(cpu $$0, cxy $$1) {
      $$0.a(bwc.a, $$1);
      $$0.a(bwc.a, 0.0F);
   }

   private bwr d(cpu $$0) {
      bxr<?> $$1 = $$0.eb();
      bwr $$2 = $$1.c(cft.r).get();
      $$1.a(cft.o, new byt($$2, true));
      return $$2;
   }

   private void e(cpu $$0) {
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
