import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bpe extends bmx<cdh> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private clj e;
   private final List<clj> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bpe(int $$0, int $$1) {
      super(ImmutableMap.of(buh.q, bui.a), $$0, $$1);
   }

   public boolean a(ame $$0, cdh $$1) {
      bmg<?> $$2 = $$1.dP();
      if ($$2.c(buh.q).isEmpty()) {
         return false;
      } else {
         blg $$3 = $$2.c(buh.q).get();
         return $$3.ai() == bku.bt && $$1.bx() && $$3.bx() && !$$1.n_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(ame $$0, cdh $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dP().c(buh.q).isPresent();
   }

   public void b(ame $$0, cdh $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(ame $$0, cdh $$1, long $$2) {
      blg $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(ame $$0, cdh $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dP().b(buh.q);
      c($$1);
      this.e = null;
   }

   private void a(blg $$0, cdh $$1) {
      boolean $$2 = false;
      clj $$3 = $$0.eU();
      if (this.e == null || !clj.b(this.e, $$3)) {
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

   private void a(cdh $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cdh $$0) {
      for (cqy $$1 : $$0.gh()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(cqy $$0) {
      return clj.b(this.e, $$0.b()) || clj.b(this.e, $$0.c());
   }

   private static void c(cdh $$0) {
      $$0.a(bkv.a, clj.b);
      $$0.a(bkv.a, 0.085F);
   }

   private static void a(cdh $$0, clj $$1) {
      $$0.a(bkv.a, $$1);
      $$0.a(bkv.a, 0.0F);
   }

   private blg d(cdh $$0) {
      bmg<?> $$1 = $$0.dP();
      blg $$2 = $$1.c(buh.q).get();
      $$1.a(buh.n, new bni($$2, true));
      return $$2;
   }

   private void e(cdh $$0) {
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
