import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bto extends brg<cif> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cqk e;
   private final List<cqk> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bto(int $$0, int $$1) {
      super(ImmutableMap.of(byr.q, bys.a), $$0, $$1);
   }

   public boolean a(apf $$0, cif $$1) {
      bqp<?> $$2 = $$1.dP();
      if ($$2.c(byr.q).isEmpty()) {
         return false;
      } else {
         bpo $$3 = $$2.c(byr.q).get();
         return $$3.ai() == bpc.bx && $$1.bA() && $$3.bA() && !$$1.o_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(apf $$0, cif $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dP().c(byr.q).isPresent();
   }

   public void b(apf $$0, cif $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(apf $$0, cif $$1, long $$2) {
      bpo $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(apf $$0, cif $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dP().b(byr.q);
      c($$1);
      this.e = null;
   }

   private void a(bpo $$0, cif $$1) {
      boolean $$2 = false;
      cqk $$3 = $$0.eU();
      if (this.e == null || !cqk.b(this.e, $$3)) {
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

   private void a(cif $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cif $$0) {
      for (cvx $$1 : $$0.gp()) {
         if (!$$1.q() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(cvx $$0) {
      return cqk.b(this.e, $$0.b()) || cqk.b(this.e, $$0.c());
   }

   private static void c(cif $$0) {
      $$0.a(bpd.a, cqk.h);
      $$0.a(bpd.a, 0.085F);
   }

   private static void a(cif $$0, cqk $$1) {
      $$0.a(bpd.a, $$1);
      $$0.a(bpd.a, 0.0F);
   }

   private bpo d(cif $$0) {
      bqp<?> $$1 = $$0.dP();
      bpo $$2 = $$1.c(byr.q).get();
      $$1.a(byr.n, new brr($$2, true));
      return $$2;
   }

   private void e(cif $$0) {
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
