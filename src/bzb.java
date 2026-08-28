import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bzb extends bwt<cny> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cwb e;
   private final List<cwb> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bzb(int $$0, int $$1) {
      super(ImmutableMap.of(cee.q, cef.a), $$0, $$1);
   }

   public boolean a(arn $$0, cny $$1) {
      bwc<?> $$2 = $$1.ed();
      if ($$2.c(cee.q).isEmpty()) {
         return false;
      } else {
         bva $$3 = $$2.c(cee.q).get();
         return $$3.ar() == bul.by && $$1.bM() && $$3.bM() && !$$1.p_() && $$1.g((bue)$$3) <= 17.0;
      }
   }

   public boolean a(arn $$0, cny $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.ed().c(cee.q).isPresent();
   }

   public void b(arn $$0, cny $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arn $$0, cny $$1, long $$2) {
      bva $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arn $$0, cny $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.ed().b(cee.q);
      c($$1);
      this.e = null;
   }

   private void a(bva $$0, cny $$1) {
      boolean $$2 = false;
      cwb $$3 = $$0.fb();
      if (this.e == null || !cwb.b(this.e, $$3)) {
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

   private void a(cny $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cny $$0) {
      for (ddy $$1 : $$0.gw()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(ddy $$0) {
      return cwb.b(this.e, $$0.b()) || cwb.b(this.e, $$0.c());
   }

   private static void c(cny $$0) {
      $$0.a(bum.a, cwb.k);
      $$0.a(bum.a, 0.085F);
   }

   private static void a(cny $$0, cwb $$1) {
      $$0.a(bum.a, $$1);
      $$0.a(bum.a, 0.0F);
   }

   private bva d(cny $$0) {
      bwc<?> $$1 = $$0.ed();
      bva $$2 = $$1.c(cee.q).get();
      $$1.a(cee.n, new bxe($$2, true));
      return $$2;
   }

   private void e(cny $$0) {
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
