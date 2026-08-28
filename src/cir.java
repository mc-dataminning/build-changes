import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cir extends bwx<cip> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final awn l;
   private final awn m;
   private ezr n;
   private cir.a o = cir.a.d;

   public cir(awn $$0, awn $$1) {
      super(ImmutableMap.of(cei.m, cej.b, cei.n, cej.c, cei.o, cej.a, cei.Z, cej.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(arq $$0, cip $$1) {
      bve $$2 = $$1.ee().c(cei.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.ee().b(cei.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ay() != bvq.i && cip.j($$2);
   }

   protected boolean a(arq $$0, cip $$1, long $$2) {
      return $$1.ee().a(cei.o) && this.o != cir.a.d && !$$1.ee().a(cei.Z);
   }

   protected void b(arq $$0, cip $$1, long $$2) {
      bve $$3 = $$1.ee().c(cei.o).get();
      bwz.a($$1, $$3);
      $$1.c($$3);
      $$1.ee().a(cei.m, new cel($$3.dw(), 2.0F, 0));
      this.k = 10;
      this.o = cir.a.a;
   }

   protected void c(arq $$0, cip $$1, long $$2) {
      $$1.ee().b(cei.o);
      $$1.q();
      $$1.b(bvq.a);
   }

   private void b(arq $$0, cip $$1) {
      $$0.a(null, $$1, this.m, awp.g, 2.0F, 1.0F);
      Optional<bui> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bui $$3 = $$2.get();
         if ($$3.bN()) {
            $$1.E($$3);
            if (!$$3.bN()) {
               $$3.a(bui.c.a);
            }
         }
      }
   }

   protected void d(arq $$0, cip $$1, long $$2) {
      bve $$3 = $$1.ee().c(cei.o).get();
      $$1.c($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awp.g, 2.0F, 1.0F);
               $$1.b(bvq.j);
               $$3.h($$3.dw().a($$1.dw()).d().c(0.75));
               this.n = $$3.dw();
               this.j = 0;
               this.o = cir.a.b;
            } else if (this.k <= 0) {
               $$1.ee().a(cei.m, new cel($$3.dw(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cir.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cir.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cip $$0, bve $$1) {
      esc $$2 = $$0.P().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cip $$0, bve $$1) {
      List<UUID> $$2 = $$0.ee().c(cei.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cI());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cI());
      }

      $$0.ee().a(cei.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
