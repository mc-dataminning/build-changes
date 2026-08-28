import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class byk extends bwc<cnh> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cvp e;
   private final List<cvp> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public byk(int $$0, int $$1) {
      super(ImmutableMap.of(cdn.q, cdo.a), $$0, $$1);
   }

   public boolean a(arh $$0, cnh $$1) {
      bvl<?> $$2 = $$1.dX();
      if ($$2.c(cdn.q).isEmpty()) {
         return false;
      } else {
         buk $$3 = $$2.c(cdn.q).get();
         return $$3.ao() == btv.by && $$1.bI() && $$3.bI() && !$$1.o_() && $$1.g((bto)$$3) <= 17.0;
      }
   }

   public boolean a(arh $$0, cnh $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dX().c(cdn.q).isPresent();
   }

   public void b(arh $$0, cnh $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arh $$0, cnh $$1, long $$2) {
      buk $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arh $$0, cnh $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dX().b(cdn.q);
      c($$1);
      this.e = null;
   }

   private void a(buk $$0, cnh $$1) {
      boolean $$2 = false;
      cvp $$3 = $$0.eW();
      if (this.e == null || !cvp.b(this.e, $$3)) {
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

   private void a(cnh $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cnh $$0) {
      for (ddd $$1 : $$0.gr()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(ddd $$0) {
      return cvp.b(this.e, $$0.b()) || cvp.b(this.e, $$0.c());
   }

   private static void c(cnh $$0) {
      $$0.a(btw.a, cvp.k);
      $$0.a(btw.a, 0.085F);
   }

   private static void a(cnh $$0, cvp $$1) {
      $$0.a(btw.a, $$1);
      $$0.a(btw.a, 0.0F);
   }

   private buk d(cnh $$0) {
      bvl<?> $$1 = $$0.dX();
      buk $$2 = $$1.c(cdn.q).get();
      $$1.a(cdn.n, new bwn($$2, true));
      return $$2;
   }

   private void e(cnh $$0) {
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
