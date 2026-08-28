import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cgy extends bvf<cgw> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final avn l;
   private final avn m;
   private eww n;
   private cgy.a o = cgy.a.d;

   public cgy(avn $$0, avn $$1) {
      super(ImmutableMap.of(ccq.m, ccr.b, ccq.n, ccr.c, ccq.o, ccr.a, ccq.Z, ccr.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aqt $$0, cgw $$1) {
      btl $$2 = $$1.dU().c(ccq.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dU().b(ccq.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.at() != bty.i && cgw.j($$2);
   }

   protected boolean a(aqt $$0, cgw $$1, long $$2) {
      return $$1.dU().a(ccq.o) && this.o != cgy.a.d && !$$1.dU().a(ccq.Z);
   }

   protected void b(aqt $$0, cgw $$1, long $$2) {
      btl $$3 = $$1.dU().c(ccq.o).get();
      bvh.a($$1, $$3);
      $$1.b($$3);
      $$1.dU().a(ccq.m, new cct($$3.do(), 2.0F, 0));
      this.k = 10;
      this.o = cgy.a.a;
   }

   protected void c(aqt $$0, cgw $$1, long $$2) {
      $$1.dU().b(ccq.o);
      $$1.s();
      $$1.b(bty.a);
   }

   private void b(aqt $$0, cgw $$1) {
      $$0.a(null, $$1, this.m, avp.g, 2.0F, 1.0F);
      Optional<bsq> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bsq $$3 = $$2.get();
         if ($$3.bE()) {
            $$1.D($$3);
            if (!$$3.bE()) {
               $$3.a(bsq.c.a);
            }
         }
      }
   }

   protected void d(aqt $$0, cgw $$1, long $$2) {
      btl $$3 = $$1.dU().c(ccq.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, avp.g, 2.0F, 1.0F);
               $$1.b(bty.j);
               $$3.i($$3.do().a($$1.do()).d().a(0.75));
               this.n = $$3.do();
               this.j = 0;
               this.o = cgy.a.b;
            } else if (this.k <= 0) {
               $$1.dU().a(ccq.m, new cct($$3.do(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cgy.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cgy.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cgw $$0, btl $$1) {
      epm $$2 = $$0.J().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cgw $$0, btl $$1) {
      List<UUID> $$2 = $$0.dU().c(ccq.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cA());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cA());
      }

      $$0.dU().a(ccq.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
