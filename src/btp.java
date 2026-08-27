import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class btp extends brh<cih> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cqm e;
   private final List<cqm> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public btp(int $$0, int $$1) {
      super(ImmutableMap.of(bys.q, byt.a), $$0, $$1);
   }

   public boolean a(apf $$0, cih $$1) {
      bqq<?> $$2 = $$1.dP();
      if ($$2.c(bys.q).isEmpty()) {
         return false;
      } else {
         bpp $$3 = $$2.c(bys.q).get();
         return $$3.ai() == bpd.by && $$1.bA() && $$3.bA() && !$$1.o_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(apf $$0, cih $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dP().c(bys.q).isPresent();
   }

   public void b(apf $$0, cih $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(apf $$0, cih $$1, long $$2) {
      bpp $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(apf $$0, cih $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dP().b(bys.q);
      c($$1);
      this.e = null;
   }

   private void a(bpp $$0, cih $$1) {
      boolean $$2 = false;
      cqm $$3 = $$0.eU();
      if (this.e == null || !cqm.b(this.e, $$3)) {
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

   private void a(cih $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cih $$0) {
      for (cvz $$1 : $$0.gp()) {
         if (!$$1.q() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(cvz $$0) {
      return cqm.b(this.e, $$0.b()) || cqm.b(this.e, $$0.c());
   }

   private static void c(cih $$0) {
      $$0.a(bpe.a, cqm.h);
      $$0.a(bpe.a, 0.085F);
   }

   private static void a(cih $$0, cqm $$1) {
      $$0.a(bpe.a, $$1);
      $$0.a(bpe.a, 0.0F);
   }

   private bpp d(cih $$0) {
      bqq<?> $$1 = $$0.dP();
      bpp $$2 = $$1.c(bys.q).get();
      $$1.a(bys.n, new brs($$2, true));
      return $$2;
   }

   private void e(cih $$0) {
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
