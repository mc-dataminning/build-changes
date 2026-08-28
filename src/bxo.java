import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxo extends bvg<cmi> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cun e;
   private final List<cun> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bxo(int $$0, int $$1) {
      super(ImmutableMap.of(ccr.q, ccs.a), $$0, $$1);
   }

   public boolean a(are $$0, cmi $$1) {
      bup<?> $$2 = $$1.dS();
      if ($$2.c(ccr.q).isEmpty()) {
         return false;
      } else {
         btn $$3 = $$2.c(ccr.q).get();
         return $$3.ak() == bsy.by && $$1.bD() && $$3.bD() && !$$1.p_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(are $$0, cmi $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dS().c(ccr.q).isPresent();
   }

   public void b(are $$0, cmi $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(are $$0, cmi $$1, long $$2) {
      btn $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(are $$0, cmi $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dS().b(ccr.q);
      c($$1);
      this.e = null;
   }

   private void a(btn $$0, cmi $$1) {
      boolean $$2 = false;
      cun $$3 = $$0.eX();
      if (this.e == null || !cun.b(this.e, $$3)) {
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
      for (dau $$1 : $$0.gs()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dau $$0) {
      return cun.b(this.e, $$0.b()) || cun.b(this.e, $$0.c());
   }

   private static void c(cmi $$0) {
      $$0.a(bsz.a, cun.l);
      $$0.a(bsz.a, 0.085F);
   }

   private static void a(cmi $$0, cun $$1) {
      $$0.a(bsz.a, $$1);
      $$0.a(bsz.a, 0.0F);
   }

   private btn d(cmi $$0) {
      bup<?> $$1 = $$0.dS();
      btn $$2 = $$1.c(ccr.q).get();
      $$1.a(ccr.n, new bvr($$2, true));
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
