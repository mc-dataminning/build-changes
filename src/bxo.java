import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxo extends bxu<chs> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bvm<? extends chs> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bxo(bvm<? extends chs> $$0) {
      this($$0, 1.0F, 2);
   }

   public bxo(bvm<? extends chs> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cff.h, cfg.a, cff.r, cfg.b, cff.m, cfg.c, cff.n, cfg.c, cff.Z, cfg.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(ash $$0, chs $$1) {
      return $$1.gw() && this.c($$1).isPresent();
   }

   protected void a(ash $$0, chs $$1, long $$2) {
      chs $$3 = this.c($$1).get();
      $$1.eb().a(cff.r, $$3);
      $$3.eb().a(cff.r, $$1);
      bxw.a($$1, (bwb)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dY().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(ash $$0, chs $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         chs $$3 = this.a($$1);
         return $$3.bL() && $$1.a($$3) && bxw.a($$1.eb(), $$3) && $$2 <= this.j && !$$1.gj() && !$$3.gj();
      }
   }

   protected void c(ash $$0, chs $$1, long $$2) {
      chs $$3 = this.a($$1);
      bxw.a($$1, (bwb)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.eb().b(cff.r);
            $$3.eb().b(cff.r);
         }
      }
   }

   protected void d(ash $$0, chs $$1, long $$2) {
      $$1.eb().b(cff.r);
      $$1.eb().b(cff.m);
      $$1.eb().b(cff.n);
      this.j = 0L;
   }

   private chs a(chs $$0) {
      return (chs)$$0.eb().c(cff.r).get();
   }

   private boolean b(chs $$0) {
      bxd<?> $$1 = $$0.eb();
      return $$1.a(cff.r) && $$1.c(cff.r).get().aq() == this.f;
   }

   private Optional<? extends chs> c(chs $$0) {
      return $$0.eb().c(cff.h).get().a($$1 -> {
         if ($$1.aq() == this.f && $$1 instanceof chs $$2 && $$0.a($$2) && !$$2.gj()) {
            return true;
         }

         return false;
      }).map(chs.class::cast);
   }
}
