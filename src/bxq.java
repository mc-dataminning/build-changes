import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxq extends bvi<cmk> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cup e;
   private final List<cup> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bxq(int $$0, int $$1) {
      super(ImmutableMap.of(cct.q, ccu.a), $$0, $$1);
   }

   public boolean a(arf $$0, cmk $$1) {
      bur<?> $$2 = $$1.dS();
      if ($$2.c(cct.q).isEmpty()) {
         return false;
      } else {
         btp $$3 = $$2.c(cct.q).get();
         return $$3.ak() == bta.by && $$1.bD() && $$3.bD() && !$$1.p_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(arf $$0, cmk $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dS().c(cct.q).isPresent();
   }

   public void b(arf $$0, cmk $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arf $$0, cmk $$1, long $$2) {
      btp $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arf $$0, cmk $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dS().b(cct.q);
      c($$1);
      this.e = null;
   }

   private void a(btp $$0, cmk $$1) {
      boolean $$2 = false;
      cup $$3 = $$0.eX();
      if (this.e == null || !cup.b(this.e, $$3)) {
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

   private void a(cmk $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cmk $$0) {
      for (daw $$1 : $$0.gs()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(daw $$0) {
      return cup.b(this.e, $$0.b()) || cup.b(this.e, $$0.c());
   }

   private static void c(cmk $$0) {
      $$0.a(btb.a, cup.l);
      $$0.a(btb.a, 0.085F);
   }

   private static void a(cmk $$0, cup $$1) {
      $$0.a(btb.a, $$1);
      $$0.a(btb.a, 0.0F);
   }

   private btp d(cmk $$0) {
      bur<?> $$1 = $$0.dS();
      btp $$2 = $$1.c(cct.q).get();
      $$1.a(cct.n, new bvt($$2, true));
      return $$2;
   }

   private void e(cmk $$0) {
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
