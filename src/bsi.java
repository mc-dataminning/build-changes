import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bsi extends bqa<cgy> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cpd e;
   private final List<cpd> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bsi(int $$0, int $$1) {
      super(ImmutableMap.of(bxl.q, bxm.a), $$0, $$1);
   }

   public boolean a(aow $$0, cgy $$1) {
      bpj<?> $$2 = $$1.dO();
      if ($$2.c(bxl.q).isEmpty()) {
         return false;
      } else {
         boi $$3 = $$2.c(bxl.q).get();
         return $$3.ai() == bnw.bw && $$1.bx() && $$3.bx() && !$$1.o_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(aow $$0, cgy $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dO().c(bxl.q).isPresent();
   }

   public void b(aow $$0, cgy $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aow $$0, cgy $$1, long $$2) {
      boi $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aow $$0, cgy $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dO().b(bxl.q);
      c($$1);
      this.e = null;
   }

   private void a(boi $$0, cgy $$1) {
      boolean $$2 = false;
      cpd $$3 = $$0.eT();
      if (this.e == null || !cpd.b(this.e, $$3)) {
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

   private void a(cgy $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cgy $$0) {
      for (cup $$1 : $$0.gi()) {
         if (!$$1.q() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(cup $$0) {
      return cpd.b(this.e, $$0.b()) || cpd.b(this.e, $$0.c());
   }

   private static void c(cgy $$0) {
      $$0.a(bnx.a, cpd.h);
      $$0.a(bnx.a, 0.085F);
   }

   private static void a(cgy $$0, cpd $$1) {
      $$0.a(bnx.a, $$1);
      $$0.a(bnx.a, 0.0F);
   }

   private boi d(cgy $$0) {
      bpj<?> $$1 = $$0.dO();
      boi $$2 = $$1.c(bxl.q).get();
      $$1.a(bxl.n, new bql($$2, true));
      return $$2;
   }

   private void e(cgy $$0) {
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
