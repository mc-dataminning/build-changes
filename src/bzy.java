import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bzy extends bxq<cpa> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cxg e;
   private final List<cxg> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bzy(int $$0, int $$1) {
      super(ImmutableMap.of(cfb.q, cfc.a), $$0, $$1);
   }

   public boolean a(arx $$0, cpa $$1) {
      bwz<?> $$2 = $$1.ec();
      if ($$2.c(cfb.q).isEmpty()) {
         return false;
      } else {
         bvx $$3 = $$2.c(cfb.q).get();
         return $$3.aq() == bvi.bS && $$1.bL() && $$3.bL() && !$$1.e_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(arx $$0, cpa $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.ec().c(cfb.q).isPresent();
   }

   public void b(arx $$0, cpa $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arx $$0, cpa $$1, long $$2) {
      bvx $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arx $$0, cpa $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.ec().b(cfb.q);
      c($$1);
      this.e = null;
   }

   private void a(bvx $$0, cpa $$1) {
      boolean $$2 = false;
      cxg $$3 = $$0.eZ();
      if (this.e == null || !cxg.b(this.e, $$3)) {
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

   private void a(cpa $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cpa $$0) {
      for (dfw $$1 : $$0.gq()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dfw $$0) {
      return cxg.b(this.e, $$0.b()) || cxg.b(this.e, $$0.c());
   }

   private static void c(cpa $$0) {
      $$0.a(bvj.a, cxg.j);
      $$0.a(bvj.a, 0.085F);
   }

   private static void a(cpa $$0, cxg $$1) {
      $$0.a(bvj.a, $$1);
      $$0.a(bvj.a, 0.0F);
   }

   private bvx d(cpa $$0) {
      bwz<?> $$1 = $$0.ec();
      bvx $$2 = $$1.c(cfb.q).get();
      $$1.a(cfb.n, new byb($$2, true));
      return $$2;
   }

   private void e(cpa $$0) {
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
