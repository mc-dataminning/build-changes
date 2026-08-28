import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bzg extends bwy<cog> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cwn e;
   private final List<cwn> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bzg(int $$0, int $$1) {
      super(ImmutableMap.of(cej.q, cek.a), $$0, $$1);
   }

   public boolean a(arc $$0, cog $$1) {
      bwh<?> $$2 = $$1.ec();
      if ($$2.c(cej.q).isEmpty()) {
         return false;
      } else {
         bvf $$3 = $$2.c(cej.q).get();
         return $$3.aq() == buq.bR && $$1.bL() && $$3.bL() && !$$1.e_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(arc $$0, cog $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.ec().c(cej.q).isPresent();
   }

   public void b(arc $$0, cog $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arc $$0, cog $$1, long $$2) {
      bvf $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arc $$0, cog $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.ec().b(cej.q);
      c($$1);
      this.e = null;
   }

   private void a(bvf $$0, cog $$1) {
      boolean $$2 = false;
      cwn $$3 = $$0.eZ();
      if (this.e == null || !cwn.b(this.e, $$3)) {
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

   private void a(cog $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cog $$0) {
      for (dfd $$1 : $$0.gr()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dfd $$0) {
      return cwn.b(this.e, $$0.b()) || cwn.b(this.e, $$0.c());
   }

   private static void c(cog $$0) {
      $$0.a(bur.a, cwn.j);
      $$0.a(bur.a, 0.085F);
   }

   private static void a(cog $$0, cwn $$1) {
      $$0.a(bur.a, $$1);
      $$0.a(bur.a, 0.0F);
   }

   private bvf d(cog $$0) {
      bwh<?> $$1 = $$0.ec();
      bvf $$2 = $$1.c(cej.q).get();
      $$1.a(cej.n, new bxj($$2, true));
      return $$2;
   }

   private void e(cog $$0) {
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
