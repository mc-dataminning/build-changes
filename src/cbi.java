import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cbi extends bza<cqy> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private czn e;
   private final List<czn> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public cbi(int $$0, int $$1) {
      super(ImmutableMap.of(cgl.r, cgm.a), $$0, $$1);
   }

   public boolean a(arq $$0, cqy $$1) {
      byj<?> $$2 = $$1.eb();
      if ($$2.c(cgl.r).isEmpty()) {
         return false;
      } else {
         bxj $$3 = $$2.c(cgl.r).get();
         return $$3.an() == bwr.bS && $$1.bI() && $$3.bI() && !$$1.n_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(arq $$0, cqy $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.eb().c(cgl.r).isPresent();
   }

   public void b(arq $$0, cqy $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arq $$0, cqy $$1, long $$2) {
      bxj $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arq $$0, cqy $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.eb().b(cgl.r);
      c($$1);
      this.e = null;
   }

   private void a(bxj $$0, cqy $$1) {
      boolean $$2 = false;
      czn $$3 = $$0.fa();
      if (this.e == null || !czn.b(this.e, $$3)) {
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

   private void a(cqy $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cqy $$0) {
      for (dii $$1 : $$0.gu()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dii $$0) {
      return czn.b(this.e, $$0.b()) || czn.b(this.e, $$0.c());
   }

   private static void c(cqy $$0) {
      $$0.a(bws.a, czn.k);
      $$0.a(bws.a, 0.085F);
   }

   private static void a(cqy $$0, czn $$1) {
      $$0.a(bws.a, $$1);
      $$0.a(bws.a, 0.0F);
   }

   private bxj d(cqy $$0) {
      byj<?> $$1 = $$0.eb();
      bxj $$2 = $$1.c(cgl.r).get();
      $$1.a(cgl.o, new bzl($$2, true));
      return $$2;
   }

   private void e(cqy $$0) {
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
