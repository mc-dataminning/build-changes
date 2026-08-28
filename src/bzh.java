import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bzh extends bwz<coh> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cwo e;
   private final List<cwo> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bzh(int $$0, int $$1) {
      super(ImmutableMap.of(cek.q, cel.a), $$0, $$1);
   }

   public boolean a(ard $$0, coh $$1) {
      bwi<?> $$2 = $$1.eb();
      if ($$2.c(cek.q).isEmpty()) {
         return false;
      } else {
         bvg $$3 = $$2.c(cek.q).get();
         return $$3.aq() == bur.bR && $$1.bL() && $$3.bL() && !$$1.e_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(ard $$0, coh $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.eb().c(cek.q).isPresent();
   }

   public void b(ard $$0, coh $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(ard $$0, coh $$1, long $$2) {
      bvg $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(ard $$0, coh $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.eb().b(cek.q);
      c($$1);
      this.e = null;
   }

   private void a(bvg $$0, coh $$1) {
      boolean $$2 = false;
      cwo $$3 = $$0.eZ();
      if (this.e == null || !cwo.b(this.e, $$3)) {
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

   private void a(coh $$0) {
      a($$0, this.f.get(0));
   }

   private void b(coh $$0) {
      for (dfe $$1 : $$0.gu()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dfe $$0) {
      return cwo.b(this.e, $$0.b()) || cwo.b(this.e, $$0.c());
   }

   private static void c(coh $$0) {
      $$0.a(bus.a, cwo.j);
      $$0.a(bus.a, 0.085F);
   }

   private static void a(coh $$0, cwo $$1) {
      $$0.a(bus.a, $$1);
      $$0.a(bus.a, 0.0F);
   }

   private bvg d(coh $$0) {
      bwi<?> $$1 = $$0.eb();
      bvg $$2 = $$1.c(cek.q).get();
      $$1.a(cek.n, new bxk($$2, true));
      return $$2;
   }

   private void e(coh $$0) {
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
