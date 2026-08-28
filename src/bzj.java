import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bzj extends bxb<coj> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cwq e;
   private final List<cwq> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bzj(int $$0, int $$1) {
      super(ImmutableMap.of(cem.q, cen.a), $$0, $$1);
   }

   public boolean a(ard $$0, coj $$1) {
      bwk<?> $$2 = $$1.eb();
      if ($$2.c(cem.q).isEmpty()) {
         return false;
      } else {
         bvi $$3 = $$2.c(cem.q).get();
         return $$3.aq() == but.bR && $$1.bL() && $$3.bL() && !$$1.e_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(ard $$0, coj $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.eb().c(cem.q).isPresent();
   }

   public void b(ard $$0, coj $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(ard $$0, coj $$1, long $$2) {
      bvi $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(ard $$0, coj $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.eb().b(cem.q);
      c($$1);
      this.e = null;
   }

   private void a(bvi $$0, coj $$1) {
      boolean $$2 = false;
      cwq $$3 = $$0.eZ();
      if (this.e == null || !cwq.b(this.e, $$3)) {
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

   private void a(coj $$0) {
      a($$0, this.f.get(0));
   }

   private void b(coj $$0) {
      for (dfg $$1 : $$0.gu()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dfg $$0) {
      return cwq.b(this.e, $$0.b()) || cwq.b(this.e, $$0.c());
   }

   private static void c(coj $$0) {
      $$0.a(buu.a, cwq.j);
      $$0.a(buu.a, 0.085F);
   }

   private static void a(coj $$0, cwq $$1) {
      $$0.a(buu.a, $$1);
      $$0.a(buu.a, 0.0F);
   }

   private bvi d(coj $$0) {
      bwk<?> $$1 = $$0.eb();
      bvi $$2 = $$1.c(cem.q).get();
      $$1.a(cem.n, new bxm($$2, true));
      return $$2;
   }

   private void e(coj $$0) {
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
