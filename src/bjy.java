import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bjy extends bhr<byb> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cfz e;
   private final List<cfz> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bjy(int $$0, int $$1) {
      super(ImmutableMap.of(bpb.q, bpc.a), $$0, $$1);
   }

   public boolean a(aif $$0, byb $$1) {
      bha<?> $$2 = $$1.dK();
      if (!$$2.c(bpb.q).isPresent()) {
         return false;
      } else {
         bfz $$3 = $$2.c(bpb.q).get();
         return $$3.ae() == bfn.bt && $$1.bs() && $$3.bs() && !$$1.h_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(aif $$0, byb $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dK().c(bpb.q).isPresent();
   }

   public void b(aif $$0, byb $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aif $$0, byb $$1, long $$2) {
      bfz $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aif $$0, byb $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dK().b(bpb.q);
      c($$1);
      this.e = null;
   }

   private void a(bfz $$0, byb $$1) {
      boolean $$2 = false;
      cfz $$3 = $$0.eO();
      if (this.e == null || !cfz.b(this.e, $$3)) {
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

   private void a(byb $$0) {
      a($$0, this.f.get(0));
   }

   private void b(byb $$0) {
      for (clk $$1 : $$0.ga()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.d());
         }
      }
   }

   private boolean a(clk $$0) {
      return cfz.b(this.e, $$0.b()) || cfz.b(this.e, $$0.c());
   }

   private static void c(byb $$0) {
      $$0.a(bfo.a, cfz.b);
      $$0.a(bfo.a, 0.085F);
   }

   private static void a(byb $$0, cfz $$1) {
      $$0.a(bfo.a, $$1);
      $$0.a(bfo.a, 0.0F);
   }

   private bfz d(byb $$0) {
      bha<?> $$1 = $$0.dK();
      bfz $$2 = $$1.c(bpb.q).get();
      $$1.a(bpb.n, new bic($$2, true));
      return $$2;
   }

   private void e(byb $$0) {
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
