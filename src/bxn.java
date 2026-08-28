import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxn extends bvf<cmi> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cuo e;
   private final List<cuo> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bxn(int $$0, int $$1) {
      super(ImmutableMap.of(ccq.q, ccr.a), $$0, $$1);
   }

   public boolean a(aqt $$0, cmi $$1) {
      buo<?> $$2 = $$1.dU();
      if ($$2.c(ccq.q).isEmpty()) {
         return false;
      } else {
         btl $$3 = $$2.c(ccq.q).get();
         return $$3.am() == bsw.by && $$1.bE() && $$3.bE() && !$$1.o_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(aqt $$0, cmi $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dU().c(ccq.q).isPresent();
   }

   public void b(aqt $$0, cmi $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aqt $$0, cmi $$1, long $$2) {
      btl $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aqt $$0, cmi $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dU().b(ccq.q);
      c($$1);
      this.e = null;
   }

   private void a(btl $$0, cmi $$1) {
      boolean $$2 = false;
      cuo $$3 = $$0.eU();
      if (this.e == null || !cuo.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.e()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cmi $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cmi $$0) {
      for (dbs $$1 : $$0.go()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dbs $$0) {
      return cuo.b(this.e, $$0.b()) || cuo.b(this.e, $$0.c());
   }

   private static void c(cmi $$0) {
      $$0.a(bsx.a, cuo.l);
      $$0.a(bsx.a, 0.085F);
   }

   private static void a(cmi $$0, cuo $$1) {
      $$0.a(bsx.a, $$1);
      $$0.a(bsx.a, 0.0F);
   }

   private btl d(cmi $$0) {
      buo<?> $$1 = $$0.dU();
      btl $$2 = $$1.c(ccq.q).get();
      $$1.a(ccq.n, new bvq($$2, true));
      return $$2;
   }

   private void e(cmi $$0) {
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
