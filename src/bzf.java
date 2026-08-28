import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bzf extends bwx<coc> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cwf e;
   private final List<cwf> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bzf(int $$0, int $$1) {
      super(ImmutableMap.of(cei.q, cej.a), $$0, $$1);
   }

   public boolean a(arq $$0, coc $$1) {
      bwg<?> $$2 = $$1.ee();
      if ($$2.c(cei.q).isEmpty()) {
         return false;
      } else {
         bve $$3 = $$2.c(cei.q).get();
         return $$3.ar() == bup.by && $$1.bN() && $$3.bN() && !$$1.p_() && $$1.g((bui)$$3) <= 17.0;
      }
   }

   public boolean a(arq $$0, coc $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.ee().c(cei.q).isPresent();
   }

   public void b(arq $$0, coc $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arq $$0, coc $$1, long $$2) {
      bve $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arq $$0, coc $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.ee().b(cei.q);
      c($$1);
      this.e = null;
   }

   private void a(bve $$0, coc $$1) {
      boolean $$2 = false;
      cwf $$3 = $$0.fc();
      if (this.e == null || !cwf.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.f()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(coc $$0) {
      a($$0, this.f.get(0));
   }

   private void b(coc $$0) {
      for (dec $$1 : $$0.gx()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dec $$0) {
      return cwf.b(this.e, $$0.b()) || cwf.b(this.e, $$0.c());
   }

   private static void c(coc $$0) {
      $$0.a(buq.a, cwf.k);
      $$0.a(buq.a, 0.085F);
   }

   private static void a(coc $$0, cwf $$1) {
      $$0.a(buq.a, $$1);
      $$0.a(buq.a, 0.0F);
   }

   private bve d(coc $$0) {
      bwg<?> $$1 = $$0.ee();
      bve $$2 = $$1.c(cei.q).get();
      $$1.a(cei.n, new bxi($$2, true));
      return $$2;
   }

   private void e(coc $$0) {
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
