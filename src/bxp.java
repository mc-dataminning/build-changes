import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxp extends bvh<cmj> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cuo e;
   private final List<cuo> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bxp(int $$0, int $$1) {
      super(ImmutableMap.of(ccs.q, cct.a), $$0, $$1);
   }

   public boolean a(are $$0, cmj $$1) {
      buq<?> $$2 = $$1.dS();
      if ($$2.c(ccs.q).isEmpty()) {
         return false;
      } else {
         bto $$3 = $$2.c(ccs.q).get();
         return $$3.ak() == bsz.by && $$1.bD() && $$3.bD() && !$$1.p_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(are $$0, cmj $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dS().c(ccs.q).isPresent();
   }

   public void b(are $$0, cmj $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(are $$0, cmj $$1, long $$2) {
      bto $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(are $$0, cmj $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dS().b(ccs.q);
      c($$1);
      this.e = null;
   }

   private void a(bto $$0, cmj $$1) {
      boolean $$2 = false;
      cuo $$3 = $$0.eX();
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

   private void a(cmj $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cmj $$0) {
      for (dav $$1 : $$0.gs()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dav $$0) {
      return cuo.b(this.e, $$0.b()) || cuo.b(this.e, $$0.c());
   }

   private static void c(cmj $$0) {
      $$0.a(bta.a, cuo.l);
      $$0.a(bta.a, 0.085F);
   }

   private static void a(cmj $$0, cuo $$1) {
      $$0.a(bta.a, $$1);
      $$0.a(bta.a, 0.0F);
   }

   private bto d(cmj $$0) {
      buq<?> $$1 = $$0.dS();
      bto $$2 = $$1.c(ccs.q).get();
      $$1.a(ccs.n, new bvs($$2, true));
      return $$2;
   }

   private void e(cmj $$0) {
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
