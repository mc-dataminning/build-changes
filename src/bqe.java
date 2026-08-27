import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bqe extends bnw<ceo> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cmr e;
   private final List<cmr> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bqe(int $$0, int $$1) {
      super(ImmutableMap.of(bvh.q, bvi.a), $$0, $$1);
   }

   public boolean a(amz $$0, ceo $$1) {
      bnf<?> $$2 = $$1.dO();
      if ($$2.c(bvh.q).isEmpty()) {
         return false;
      } else {
         bmf $$3 = $$2.c(bvh.q).get();
         return $$3.ai() == blt.bv && $$1.bx() && $$3.bx() && !$$1.o_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(amz $$0, ceo $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dO().c(bvh.q).isPresent();
   }

   public void b(amz $$0, ceo $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(amz $$0, ceo $$1, long $$2) {
      bmf $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(amz $$0, ceo $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dO().b(bvh.q);
      c($$1);
      this.e = null;
   }

   private void a(bmf $$0, ceo $$1) {
      boolean $$2 = false;
      cmr $$3 = $$0.eT();
      if (this.e == null || !cmr.b(this.e, $$3)) {
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

   private void a(ceo $$0) {
      a($$0, this.f.get(0));
   }

   private void b(ceo $$0) {
      for (csg $$1 : $$0.gg()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(csg $$0) {
      return cmr.b(this.e, $$0.b()) || cmr.b(this.e, $$0.c());
   }

   private static void c(ceo $$0) {
      $$0.a(blu.a, cmr.f);
      $$0.a(blu.a, 0.085F);
   }

   private static void a(ceo $$0, cmr $$1) {
      $$0.a(blu.a, $$1);
      $$0.a(blu.a, 0.0F);
   }

   private bmf d(ceo $$0) {
      bnf<?> $$1 = $$0.dO();
      bmf $$2 = $$1.c(bvh.q).get();
      $$1.a(bvh.n, new boh($$2, true));
      return $$2;
   }

   private void e(ceo $$0) {
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
