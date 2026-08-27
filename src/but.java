import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class but extends bsl<cjn> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private crs e;
   private final List<crs> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public but(int $$0, int $$1) {
      super(ImmutableMap.of(bzw.q, bzx.a), $$0, $$1);
   }

   public boolean a(apu $$0, cjn $$1) {
      bru<?> $$2 = $$1.dP();
      if ($$2.c(bzw.q).isEmpty()) {
         return false;
      } else {
         bqt $$3 = $$2.c(bzw.q).get();
         return $$3.ai() == bqg.bx && $$1.bA() && $$3.bA() && !$$1.p_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(apu $$0, cjn $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dP().c(bzw.q).isPresent();
   }

   public void b(apu $$0, cjn $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(apu $$0, cjn $$1, long $$2) {
      bqt $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(apu $$0, cjn $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dP().b(bzw.q);
      c($$1);
      this.e = null;
   }

   private void a(bqt $$0, cjn $$1) {
      boolean $$2 = false;
      crs $$3 = $$0.eU();
      if (this.e == null || !crs.b(this.e, $$3)) {
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

   private void a(cjn $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cjn $$0) {
      for (cye $$1 : $$0.gp()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(cye $$0) {
      return crs.b(this.e, $$0.b()) || crs.b(this.e, $$0.c());
   }

   private static void c(cjn $$0) {
      $$0.a(bqh.a, crs.i);
      $$0.a(bqh.a, 0.085F);
   }

   private static void a(cjn $$0, crs $$1) {
      $$0.a(bqh.a, $$1);
      $$0.a(bqh.a, 0.0F);
   }

   private bqt d(cjn $$0) {
      bru<?> $$1 = $$0.dP();
      bqt $$2 = $$1.c(bzw.q).get();
      $$1.a(bzw.n, new bsw($$2, true));
      return $$2;
   }

   private void e(cjn $$0) {
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
