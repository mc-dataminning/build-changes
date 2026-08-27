import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bwr extends buj<cll> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private ctq e;
   private final List<ctq> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bwr(int $$0, int $$1) {
      super(ImmutableMap.of(cbu.q, cbv.a), $$0, $$1);
   }

   public boolean a(aqn $$0, cll $$1) {
      bts<?> $$2 = $$1.dS();
      if ($$2.c(cbu.q).isEmpty()) {
         return false;
      } else {
         bsq $$3 = $$2.c(cbu.q).get();
         return $$3.ak() == bsc.by && $$1.bD() && $$3.bD() && !$$1.p_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(aqn $$0, cll $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dS().c(cbu.q).isPresent();
   }

   public void b(aqn $$0, cll $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aqn $$0, cll $$1, long $$2) {
      bsq $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aqn $$0, cll $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dS().b(cbu.q);
      c($$1);
      this.e = null;
   }

   private void a(bsq $$0, cll $$1) {
      boolean $$2 = false;
      ctq $$3 = $$0.eX();
      if (this.e == null || !ctq.b(this.e, $$3)) {
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

   private void a(cll $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cll $$0) {
      for (czx $$1 : $$0.gr()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(czx $$0) {
      return ctq.b(this.e, $$0.b()) || ctq.b(this.e, $$0.c());
   }

   private static void c(cll $$0) {
      $$0.a(bsd.a, ctq.i);
      $$0.a(bsd.a, 0.085F);
   }

   private static void a(cll $$0, ctq $$1) {
      $$0.a(bsd.a, $$1);
      $$0.a(bsd.a, 0.0F);
   }

   private bsq d(cll $$0) {
      bts<?> $$1 = $$0.dS();
      bsq $$2 = $$1.c(cbu.q).get();
      $$1.a(cbu.n, new buu($$2, true));
      return $$2;
   }

   private void e(cll $$0) {
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
