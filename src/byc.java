import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byc extends byi<cig> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bwb<? extends cig> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public byc(bwb<? extends cig> $$0) {
      this($$0, 1.0F, 2);
   }

   public byc(bwb<? extends cig> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cft.h, cfu.a, cft.s, cfu.b, cft.n, cfu.c, cft.o, cfu.c, cft.aa, cfu.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arn $$0, cig $$1) {
      return $$1.gA() && this.c($$1).isPresent();
   }

   protected void a(arn $$0, cig $$1, long $$2) {
      cig $$3 = this.c($$1).get();
      $$1.eb().a(cft.s, $$3);
      $$3.eb().a(cft.s, $$1);
      byk.a($$1, (bwr)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dY().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arn $$0, cig $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cig $$3 = this.a($$1);
         return $$3.bK() && $$1.a($$3) && byk.a($$1.eb(), $$3) && $$2 <= this.j && !$$1.gn() && !$$3.gn();
      }
   }

   protected void c(arn $$0, cig $$1, long $$2) {
      cig $$3 = this.a($$1);
      byk.a($$1, (bwr)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.eb().b(cft.s);
            $$3.eb().b(cft.s);
         }
      }
   }

   protected void d(arn $$0, cig $$1, long $$2) {
      $$1.eb().b(cft.s);
      $$1.eb().b(cft.n);
      $$1.eb().b(cft.o);
      this.j = 0L;
   }

   private cig a(cig $$0) {
      return (cig)$$0.eb().c(cft.s).get();
   }

   private boolean b(cig $$0) {
      bxr<?> $$1 = $$0.eb();
      return $$1.a(cft.s) && $$1.c(cft.s).get().aq() == this.f;
   }

   private Optional<? extends cig> c(cig $$0) {
      return $$0.eb().c(cft.h).get().a($$1 -> {
         if ($$1.aq() == this.f && $$1 instanceof cig $$2 && $$0.a($$2) && !$$2.gn()) {
            return true;
         }

         return false;
      }).map(cig.class::cast);
   }
}
