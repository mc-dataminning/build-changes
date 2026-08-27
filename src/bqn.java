import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bqn extends bof<cfd> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cng e;
   private final List<cng> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bqn(int $$0, int $$1) {
      super(ImmutableMap.of(bvq.q, bvr.a), $$0, $$1);
   }

   public boolean a(ane $$0, cfd $$1) {
      bno<?> $$2 = $$1.dN();
      if ($$2.c(bvq.q).isEmpty()) {
         return false;
      } else {
         bmo $$3 = $$2.c(bvq.q).get();
         return $$3.ai() == bmc.bw && $$1.bx() && $$3.bx() && !$$1.o_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(ane $$0, cfd $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dN().c(bvq.q).isPresent();
   }

   public void b(ane $$0, cfd $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(ane $$0, cfd $$1, long $$2) {
      bmo $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(ane $$0, cfd $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dN().b(bvq.q);
      c($$1);
      this.e = null;
   }

   private void a(bmo $$0, cfd $$1) {
      boolean $$2 = false;
      cng $$3 = $$0.eT();
      if (this.e == null || !cng.b(this.e, $$3)) {
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

   private void a(cfd $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cfd $$0) {
      for (csv $$1 : $$0.gh()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(csv $$0) {
      return cng.b(this.e, $$0.b()) || cng.b(this.e, $$0.c());
   }

   private static void c(cfd $$0) {
      $$0.a(bmd.a, cng.f);
      $$0.a(bmd.a, 0.085F);
   }

   private static void a(cfd $$0, cng $$1) {
      $$0.a(bmd.a, $$1);
      $$0.a(bmd.a, 0.0F);
   }

   private bmo d(cfd $$0) {
      bno<?> $$1 = $$0.dN();
      bmo $$2 = $$1.c(bvq.q).get();
      $$1.a(bvq.n, new boq($$2, true));
      return $$2;
   }

   private void e(cfd $$0) {
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
