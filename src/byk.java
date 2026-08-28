import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byk extends byq<cio> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bwj<? extends cio> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public byk(bwj<? extends cio> $$0) {
      this($$0, 1.0F, 2);
   }

   public byk(bwj<? extends cio> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cgb.h, cgc.a, cgb.s, cgc.b, cgb.n, cgc.c, cgb.o, cgc.c, cgb.aa, cgc.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aro $$0, cio $$1) {
      return $$1.gA() && this.c($$1).isPresent();
   }

   protected void a(aro $$0, cio $$1, long $$2) {
      cio $$3 = this.c($$1).get();
      $$1.eb().a(cgb.s, $$3);
      $$3.eb().a(cgb.s, $$1);
      bys.a($$1, (bwz)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dY().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(aro $$0, cio $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cio $$3 = this.a($$1);
         return $$3.bK() && $$1.a($$3) && bys.a($$1.eb(), $$3) && $$2 <= this.j && !$$1.gn() && !$$3.gn();
      }
   }

   protected void c(aro $$0, cio $$1, long $$2) {
      cio $$3 = this.a($$1);
      bys.a($$1, (bwz)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.eb().b(cgb.s);
            $$3.eb().b(cgb.s);
         }
      }
   }

   protected void d(aro $$0, cio $$1, long $$2) {
      $$1.eb().b(cgb.s);
      $$1.eb().b(cgb.n);
      $$1.eb().b(cgb.o);
      this.j = 0L;
   }

   private cio a(cio $$0) {
      return (cio)$$0.eb().c(cgb.s).get();
   }

   private boolean b(cio $$0) {
      bxz<?> $$1 = $$0.eb();
      return $$1.a(cgb.s) && $$1.c(cgb.s).get().aq() == this.f;
   }

   private Optional<? extends cio> c(cio $$0) {
      return $$0.eb().c(cgb.h).get().a($$1 -> {
         if ($$1.aq() == this.f && $$1 instanceof cio $$2 && $$0.a($$2) && !$$2.gn()) {
            return true;
         }

         return false;
      }).map(cio.class::cast);
   }
}
