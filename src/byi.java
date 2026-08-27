import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class byi extends bmx<byg> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final aqq l;
   private final aqq m;
   private eju n;
   private byi.a o = byi.a.d;

   public byi(aqq $$0, aqq $$1) {
      super(ImmutableMap.of(buh.m, bui.b, buh.n, bui.c, buh.o, bui.a, buh.Y, bui.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(ame $$0, byg $$1) {
      blg $$2 = $$1.dP().c(buh.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dP().b(buh.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != bls.i && byg.j($$2);
   }

   protected boolean a(ame $$0, byg $$1, long $$2) {
      return $$1.dP().a(buh.o) && this.o != byi.a.d && !$$1.dP().a(buh.Y);
   }

   protected void b(ame $$0, byg $$1, long $$2) {
      blg $$3 = $$1.dP().c(buh.o).get();
      bmz.a($$1, $$3);
      $$1.a((bkq)$$3);
      $$1.dP().a(buh.m, new buk($$3.dl(), 2.0F, 0));
      this.k = 10;
      this.o = byi.a.a;
   }

   protected void c(ame $$0, byg $$1, long $$2) {
      $$1.dP().b(buh.o);
      $$1.u();
      $$1.b(bls.a);
   }

   private void b(ame $$0, byg $$1) {
      $$0.a(null, $$1, this.m, aqs.g, 2.0F, 1.0F);
      Optional<bkq> $$2 = $$1.w();
      if ($$2.isPresent()) {
         bkq $$3 = $$2.get();
         if ($$3.bx()) {
            $$1.C($$3);
            if (!$$3.bx()) {
               $$3.a(bkq.c.a);
            }
         }
      }
   }

   protected void d(ame $$0, byg $$1, long $$2) {
      blg $$3 = $$1.dP().c(buh.o).get();
      $$1.a((bkq)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, aqs.g, 2.0F, 1.0F);
               $$1.b(bls.j);
               $$3.g($$3.dl().a($$1.dl()).d().a(0.75));
               this.n = $$3.dl();
               this.j = 0;
               this.o = byi.a.b;
            } else if (this.k <= 0) {
               $$1.dP().a(buh.m, new buk($$3.dl(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = byi.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = byi.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(byg $$0, blg $$1) {
      edh $$2 = $$0.N().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(byg $$0, blg $$1) {
      List<UUID> $$2 = $$0.dP().c(buh.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cw());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cw());
      }

      $$0.dP().a(buh.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
