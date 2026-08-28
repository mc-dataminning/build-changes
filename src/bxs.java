import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxs extends bvk<cmm> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cur e;
   private final List<cur> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bxs(int $$0, int $$1) {
      super(ImmutableMap.of(ccv.q, ccw.a), $$0, $$1);
   }

   public boolean a(arf $$0, cmm $$1) {
      but<?> $$2 = $$1.dS();
      if ($$2.c(ccv.q).isEmpty()) {
         return false;
      } else {
         btr $$3 = $$2.c(ccv.q).get();
         return $$3.ak() == btc.by && $$1.bD() && $$3.bD() && !$$1.p_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(arf $$0, cmm $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dS().c(ccv.q).isPresent();
   }

   public void b(arf $$0, cmm $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arf $$0, cmm $$1, long $$2) {
      btr $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arf $$0, cmm $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dS().b(ccv.q);
      c($$1);
      this.e = null;
   }

   private void a(btr $$0, cmm $$1) {
      boolean $$2 = false;
      cur $$3 = $$0.eX();
      if (this.e == null || !cur.b(this.e, $$3)) {
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

   private void a(cmm $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cmm $$0) {
      for (day $$1 : $$0.gs()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(day $$0) {
      return cur.b(this.e, $$0.b()) || cur.b(this.e, $$0.c());
   }

   private static void c(cmm $$0) {
      $$0.a(btd.a, cur.l);
      $$0.a(btd.a, 0.085F);
   }

   private static void a(cmm $$0, cur $$1) {
      $$0.a(btd.a, $$1);
      $$0.a(btd.a, 0.0F);
   }

   private btr d(cmm $$0) {
      but<?> $$1 = $$0.dS();
      btr $$2 = $$1.c(ccv.q).get();
      $$1.a(ccv.n, new bvv($$2, true));
      return $$2;
   }

   private void e(cmm $$0) {
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
