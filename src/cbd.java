import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cbd extends byv<cqo> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private czd e;
   private final List<czd> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public cbd(int $$0, int $$1) {
      super(ImmutableMap.of(cgg.r, cgh.a), $$0, $$1);
   }

   public boolean a(arq $$0, cqo $$1) {
      bye<?> $$2 = $$1.ec();
      if ($$2.c(cgg.r).isEmpty()) {
         return false;
      } else {
         bxe $$3 = $$2.c(cgg.r).get();
         return $$3.aq() == bwo.bS && $$1.bK() && $$3.bK() && !$$1.n_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(arq $$0, cqo $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.ec().c(cgg.r).isPresent();
   }

   public void b(arq $$0, cqo $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arq $$0, cqo $$1, long $$2) {
      bxe $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arq $$0, cqo $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.ec().b(cgg.r);
      c($$1);
      this.e = null;
   }

   private void a(bxe $$0, cqo $$1) {
      boolean $$2 = false;
      czd $$3 = $$0.fb();
      if (this.e == null || !czd.b(this.e, $$3)) {
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

   private void a(cqo $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cqo $$0) {
      for (dhy $$1 : $$0.gs()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dhy $$0) {
      return czd.b(this.e, $$0.b()) || czd.b(this.e, $$0.c());
   }

   private static void c(cqo $$0) {
      $$0.a(bwp.a, czd.k);
      $$0.a(bwp.a, 0.085F);
   }

   private static void a(cqo $$0, czd $$1) {
      $$0.a(bwp.a, $$1);
      $$0.a(bwp.a, 0.0F);
   }

   private bxe d(cqo $$0) {
      bye<?> $$1 = $$0.ec();
      bxe $$2 = $$1.c(cgg.r).get();
      $$1.a(cgg.o, new bzg($$2, true));
      return $$2;
   }

   private void e(cqo $$0) {
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
