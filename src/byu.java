import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byu extends bza<ciz> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bwr<? extends ciz> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public byu(bwr<? extends ciz> $$0) {
      this($$0, 1.0F, 2);
   }

   public byu(bwr<? extends ciz> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cgl.h, cgm.a, cgl.s, cgm.b, cgl.n, cgm.c, cgl.o, cgm.c, cgl.aa, cgm.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arq $$0, ciz $$1) {
      return $$1.gD() && this.c($$1).isPresent();
   }

   protected void a(arq $$0, ciz $$1, long $$2) {
      ciz $$3 = this.c($$1).get();
      $$1.eb().a(cgl.s, $$3);
      $$3.eb().a(cgl.s, $$1);
      bzc.a($$1, (bxj)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dX().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arq $$0, ciz $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         ciz $$3 = this.a($$1);
         return $$3.bI() && $$1.a($$3) && bzc.a($$1.eb(), $$3) && $$2 <= this.j && !$$1.gq() && !$$3.gq();
      }
   }

   protected void c(arq $$0, ciz $$1, long $$2) {
      ciz $$3 = this.a($$1);
      bzc.a($$1, (bxj)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.eb().b(cgl.s);
            $$3.eb().b(cgl.s);
         }
      }
   }

   protected void d(arq $$0, ciz $$1, long $$2) {
      $$1.eb().b(cgl.s);
      $$1.eb().b(cgl.n);
      $$1.eb().b(cgl.o);
      this.j = 0L;
   }

   private ciz a(ciz $$0) {
      return (ciz)$$0.eb().c(cgl.s).get();
   }

   private boolean b(ciz $$0) {
      byj<?> $$1 = $$0.eb();
      return $$1.a(cgl.s) && $$1.c(cgl.s).get().an() == this.f;
   }

   private Optional<? extends ciz> c(ciz $$0) {
      return $$0.eb().c(cgl.h).get().a($$1 -> {
         if ($$1.an() == this.f && $$1 instanceof ciz $$2 && $$0.a($$2) && !$$2.gq()) {
            return true;
         }

         return false;
      }).map(ciz.class::cast);
   }
}
