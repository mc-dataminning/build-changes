import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bwo extends bug<cll> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cuh e;
   private final List<cuh> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bwo(int $$0, int $$1) {
      super(ImmutableMap.of(cbr.q, cbs.a), $$0, $$1);
   }

   public boolean a(aqt $$0, cll $$1) {
      btp<?> $$2 = $$1.dZ();
      if ($$2.c(cbr.q).isEmpty()) {
         return false;
      } else {
         bso $$3 = $$2.c(cbr.q).get();
         return $$3.ak() == bsb.bE && $$1.bI() && $$3.bI() && !$$1.o_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(aqt $$0, cll $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dZ().c(cbr.q).isPresent();
   }

   public void b(aqt $$0, cll $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aqt $$0, cll $$1, long $$2) {
      bso $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aqt $$0, cll $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dZ().b(cbr.q);
      c($$1);
      this.e = null;
   }

   private void a(bso $$0, cll $$1) {
      boolean $$2 = false;
      cuh $$3 = $$0.fg();
      if (this.e == null || !cuh.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.d()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cll $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cll $$0) {
      for (day $$1 : $$0.gA()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(day $$0) {
      return cuh.b(this.e, $$0.b()) || cuh.b(this.e, $$0.c());
   }

   private static void c(cll $$0) {
      $$0.a(bsc.a, cuh.i);
      $$0.a(bsc.a, 0.085F);
   }

   private static void a(cll $$0, cuh $$1) {
      $$0.a(bsc.a, $$1);
      $$0.a(bsc.a, 0.0F);
   }

   private bso d(cll $$0) {
      btp<?> $$1 = $$0.dZ();
      bso $$2 = $$1.c(cbr.q).get();
      $$1.a(cbr.n, new bur($$2, true));
      return $$2;
   }

   private void e(cll $$0) {
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
