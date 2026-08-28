import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bzi extends bxa<coi> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cwp e;
   private final List<cwp> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bzi(int $$0, int $$1) {
      super(ImmutableMap.of(cel.q, cem.a), $$0, $$1);
   }

   public boolean a(ard $$0, coi $$1) {
      bwj<?> $$2 = $$1.eb();
      if ($$2.c(cel.q).isEmpty()) {
         return false;
      } else {
         bvh $$3 = $$2.c(cel.q).get();
         return $$3.aq() == bus.bR && $$1.bL() && $$3.bL() && !$$1.e_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(ard $$0, coi $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.eb().c(cel.q).isPresent();
   }

   public void b(ard $$0, coi $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(ard $$0, coi $$1, long $$2) {
      bvh $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(ard $$0, coi $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.eb().b(cel.q);
      c($$1);
      this.e = null;
   }

   private void a(bvh $$0, coi $$1) {
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
      for (dff $$1 : $$0.gu()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dff $$0) {
      return cwp.b(this.e, $$0.b()) || cwp.b(this.e, $$0.c());
   }

   private static void c(coi $$0) {
      $$0.a(but.a, cwp.j);
      $$0.a(but.a, 0.085F);
   }

   private static void a(coi $$0, cwp $$1) {
      $$0.a(but.a, $$1);
      $$0.a(but.a, 0.0F);
   }

   private bvh d(coi $$0) {
      bwj<?> $$1 = $$0.eb();
      bvh $$2 = $$1.c(cel.q).get();
      $$1.a(cel.n, new bxl($$2, true));
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
