import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bzh extends bwz<coi> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cwp e;
   private final List<cwp> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bzh(int $$0, int $$1) {
      super(ImmutableMap.of(cek.q, cel.a), $$0, $$1);
   }

   public boolean a(arc $$0, coi $$1) {
      bwi<?> $$2 = $$1.ec();
      if ($$2.c(cek.q).isEmpty()) {
         return false;
      } else {
         bvg $$3 = $$2.c(cek.q).get();
         return $$3.aq() == bur.bS && $$1.bL() && $$3.bL() && !$$1.e_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(arc $$0, coi $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.ec().c(cek.q).isPresent();
   }

   public void b(arc $$0, coi $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arc $$0, coi $$1, long $$2) {
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

   public void d(arc $$0, coi $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.ec().b(cek.q);
      c($$1);
      this.e = null;
   }

   private void a(bvg $$0, coi $$1) {
      boolean $$2 = false;
      cwp $$3 = $$0.eZ();
      if (this.e == null || !cwp.b(this.e, $$3)) {
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

   private void a(coi $$0) {
      a($$0, this.f.get(0));
   }

   private void b(coi $$0) {
      for (dff $$1 : $$0.gr()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dff $$0) {
      return cwp.b(this.e, $$0.b()) || cwp.b(this.e, $$0.c());
   }

   private static void c(coi $$0) {
      $$0.a(bus.a, cwp.j);
      $$0.a(bus.a, 0.085F);
   }

   private static void a(coi $$0, cwp $$1) {
      $$0.a(bus.a, $$1);
      $$0.a(bus.a, 0.0F);
   }

   private bvg d(coi $$0) {
      bwi<?> $$1 = $$0.ec();
      bvg $$2 = $$1.c(cek.q).get();
      $$1.a(cek.n, new bxk($$2, true));
      return $$2;
   }

   private void e(coi $$0) {
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
