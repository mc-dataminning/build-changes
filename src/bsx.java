import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bsx extends bqp<chn> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cpq e;
   private final List<cpq> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bsx(int $$0, int $$1) {
      super(ImmutableMap.of(bya.q, byb.a), $$0, $$1);
   }

   public boolean a(apa $$0, chn $$1) {
      bpy<?> $$2 = $$1.dM();
      if ($$2.c(bya.q).isEmpty()) {
         return false;
      } else {
         box $$3 = $$2.c(bya.q).get();
         return $$3.ai() == bol.bw && $$1.bx() && $$3.bx() && !$$1.o_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(apa $$0, chn $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dM().c(bya.q).isPresent();
   }

   public void b(apa $$0, chn $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(apa $$0, chn $$1, long $$2) {
      box $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(apa $$0, chn $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dM().b(bya.q);
      c($$1);
      this.e = null;
   }

   private void a(box $$0, chn $$1) {
      boolean $$2 = false;
      cpq $$3 = $$0.eR();
      if (this.e == null || !cpq.b(this.e, $$3)) {
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

   private void a(chn $$0) {
      a($$0, this.f.get(0));
   }

   private void b(chn $$0) {
      for (cvc $$1 : $$0.gn()) {
         if (!$$1.q() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(cvc $$0) {
      return cpq.b(this.e, $$0.b()) || cpq.b(this.e, $$0.c());
   }

   private static void c(chn $$0) {
      $$0.a(bom.a, cpq.h);
      $$0.a(bom.a, 0.085F);
   }

   private static void a(chn $$0, cpq $$1) {
      $$0.a(bom.a, $$1);
      $$0.a(bom.a, 0.0F);
   }

   private box d(chn $$0) {
      bpy<?> $$1 = $$0.dM();
      box $$2 = $$1.c(bya.q).get();
      $$1.a(bya.n, new bra($$2, true));
      return $$2;
   }

   private void e(chn $$0) {
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
