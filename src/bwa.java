import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bwa extends bts<cku> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private csz e;
   private final List<csz> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bwa(int $$0, int $$1) {
      super(ImmutableMap.of(cbd.q, cbe.a), $$0, $$1);
   }

   public boolean a(aqh $$0, cku $$1) {
      btb<?> $$2 = $$1.dQ();
      if ($$2.c(cbd.q).isEmpty()) {
         return false;
      } else {
         bsa $$3 = $$2.c(cbd.q).get();
         return $$3.ai() == brn.bx && $$1.bB() && $$3.bB() && !$$1.p_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(aqh $$0, cku $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dQ().c(cbd.q).isPresent();
   }

   public void b(aqh $$0, cku $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aqh $$0, cku $$1, long $$2) {
      bsa $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aqh $$0, cku $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dQ().b(cbd.q);
      c($$1);
      this.e = null;
   }

   private void a(bsa $$0, cku $$1) {
      boolean $$2 = false;
      csz $$3 = $$0.eV();
      if (this.e == null || !csz.b(this.e, $$3)) {
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

   private void a(cku $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cku $$0) {
      for (czb $$1 : $$0.gr()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(czb $$0) {
      return csz.b(this.e, $$0.b()) || csz.b(this.e, $$0.c());
   }

   private static void c(cku $$0) {
      $$0.a(bro.a, csz.i);
      $$0.a(bro.a, 0.085F);
   }

   private static void a(cku $$0, csz $$1) {
      $$0.a(bro.a, $$1);
      $$0.a(bro.a, 0.0F);
   }

   private bsa d(cku $$0) {
      btb<?> $$1 = $$0.dQ();
      bsa $$2 = $$1.c(cbd.q).get();
      $$1.a(cbd.n, new bud($$2, true));
      return $$2;
   }

   private void e(cku $$0) {
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
