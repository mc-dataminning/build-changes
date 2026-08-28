import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byn extends byt<cis> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bwm<? extends cis> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public byn(bwm<? extends cis> $$0) {
      this($$0, 1.0F, 2);
   }

   public byn(bwm<? extends cis> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cge.h, cgf.a, cge.s, cgf.b, cge.n, cgf.c, cge.o, cgf.c, cge.aa, cgf.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arq $$0, cis $$1) {
      return $$1.gA() && this.c($$1).isPresent();
   }

   protected void a(arq $$0, cis $$1, long $$2) {
      cis $$3 = this.c($$1).get();
      $$1.eb().a(cge.s, $$3);
      $$3.eb().a(cge.s, $$1);
      byv.a($$1, (bxc)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dY().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arq $$0, cis $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cis $$3 = this.a($$1);
         return $$3.bK() && $$1.a($$3) && byv.a($$1.eb(), $$3) && $$2 <= this.j && !$$1.gn() && !$$3.gn();
      }
   }

   protected void c(arq $$0, cis $$1, long $$2) {
      cis $$3 = this.a($$1);
      byv.a($$1, (bxc)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.eb().b(cge.s);
            $$3.eb().b(cge.s);
         }
      }
   }

   protected void d(arq $$0, cis $$1, long $$2) {
      $$1.eb().b(cge.s);
      $$1.eb().b(cge.n);
      $$1.eb().b(cge.o);
      this.j = 0L;
   }

   private cis a(cis $$0) {
      return (cis)$$0.eb().c(cge.s).get();
   }

   private boolean b(cis $$0) {
      byc<?> $$1 = $$0.eb();
      return $$1.a(cge.s) && $$1.c(cge.s).get().aq() == this.f;
   }

   private Optional<? extends cis> c(cis $$0) {
      return $$0.eb().c(cge.h).get().a($$1 -> {
         if ($$1.aq() == this.f && $$1 instanceof cis $$2 && $$0.a($$2) && !$$2.gn()) {
            return true;
         }

         return false;
      }).map(cis.class::cast);
   }
}
