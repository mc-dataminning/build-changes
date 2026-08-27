import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class buo extends bsg<cjg> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private crj e;
   private final List<crj> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public buo(int $$0, int $$1) {
      super(ImmutableMap.of(bzr.q, bzs.a), $$0, $$1);
   }

   public boolean a(aps $$0, cjg $$1) {
      brp<?> $$2 = $$1.dP();
      if ($$2.c(bzr.q).isEmpty()) {
         return false;
      } else {
         bqo $$3 = $$2.c(bzr.q).get();
         return $$3.ai() == bqb.bx && $$1.bA() && $$3.bA() && !$$1.p_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(aps $$0, cjg $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dP().c(bzr.q).isPresent();
   }

   public void b(aps $$0, cjg $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aps $$0, cjg $$1, long $$2) {
      bqo $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aps $$0, cjg $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dP().b(bzr.q);
      c($$1);
      this.e = null;
   }

   private void a(bqo $$0, cjg $$1) {
      boolean $$2 = false;
      crj $$3 = $$0.eU();
      if (this.e == null || !crj.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.d()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cjg $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cjg $$0) {
      for (cxv $$1 : $$0.gp()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(cxv $$0) {
      return crj.b(this.e, $$0.b()) || crj.b(this.e, $$0.c());
   }

   private static void c(cjg $$0) {
      $$0.a(bqc.a, crj.i);
      $$0.a(bqc.a, 0.085F);
   }

   private static void a(cjg $$0, crj $$1) {
      $$0.a(bqc.a, $$1);
      $$0.a(bqc.a, 0.0F);
   }

   private bqo d(cjg $$0) {
      brp<?> $$1 = $$0.dP();
      bqo $$2 = $$1.c(bzr.q).get();
      $$1.a(bzr.n, new bsr($$2, true));
      return $$2;
   }

   private void e(cjg $$0) {
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
