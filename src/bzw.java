import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class bzw extends bof<bzu> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final ars l;
   private final ars m;
   private emc n;
   private bzw.a o = bzw.a.d;

   public bzw(ars $$0, ars $$1) {
      super(ImmutableMap.of(bvq.m, bvr.b, bvq.n, bvr.c, bvq.o, bvr.a, bvq.Z, bvr.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(ane $$0, bzu $$1) {
      bmo $$2 = $$1.dN().c(bvq.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dN().b(bvq.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != bna.i && bzu.j($$2);
   }

   protected boolean a(ane $$0, bzu $$1, long $$2) {
      return $$1.dN().a(bvq.o) && this.o != bzw.a.d && !$$1.dN().a(bvq.Z);
   }

   protected void b(ane $$0, bzu $$1, long $$2) {
      bmo $$3 = $$1.dN().c(bvq.o).get();
      boh.a($$1, $$3);
      $$1.a((blw)$$3);
      $$1.dN().a(bvq.m, new bvt($$3.dj(), 2.0F, 0));
      this.k = 10;
      this.o = bzw.a.a;
   }

   protected void c(ane $$0, bzu $$1, long $$2) {
      $$1.dN().b(bvq.o);
      $$1.u();
      $$1.b(bna.a);
   }

   private void b(ane $$0, bzu $$1) {
      $$0.a(null, $$1, this.m, aru.g, 2.0F, 1.0F);
      Optional<blw> $$2 = $$1.w();
      if ($$2.isPresent()) {
         blw $$3 = $$2.get();
         if ($$3.bx()) {
            $$1.B($$3);
            if (!$$3.bx()) {
               $$3.a(blw.c.a);
            }
         }
      }
   }

   protected void d(ane $$0, bzu $$1, long $$2) {
      bmo $$3 = $$1.dN().c(bvq.o).get();
      $$1.a((blw)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, aru.g, 2.0F, 1.0F);
               $$1.b(bna.j);
               $$3.g($$3.dj().a($$1.dj()).d().a(0.75));
               this.n = $$3.dj();
               this.j = 0;
               this.o = bzw.a.b;
            } else if (this.k <= 0) {
               $$1.dN().a(bvq.m, new bvt($$3.dj(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = bzw.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = bzw.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(bzu $$0, bmo $$1) {
      efo $$2 = $$0.N().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(bzu $$0, bmo $$1) {
      List<UUID> $$2 = $$0.dN().c(bvq.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cw());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cw());
      }

      $$0.dN().a(bvq.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
