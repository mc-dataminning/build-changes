import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cbr extends bqa<cbp> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final atk l;
   private final atk m;
   private enz n;
   private cbr.a o = cbr.a.d;

   public cbr(atk $$0, atk $$1) {
      super(ImmutableMap.of(bxl.m, bxm.b, bxl.n, bxm.c, bxl.o, bxm.a, bxl.Z, bxm.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aow $$0, cbp $$1) {
      boi $$2 = $$1.dO().c(bxl.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dO().b(bxl.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != bot.i && cbp.j($$2);
   }

   protected boolean a(aow $$0, cbp $$1, long $$2) {
      return $$1.dO().a(bxl.o) && this.o != cbr.a.d && !$$1.dO().a(bxl.Z);
   }

   protected void b(aow $$0, cbp $$1, long $$2) {
      boi $$3 = $$1.dO().c(bxl.o).get();
      bqc.a($$1, $$3);
      $$1.a((bnq)$$3);
      $$1.dO().a(bxl.m, new bxo($$3.dk(), 2.0F, 0));
      this.k = 10;
      this.o = cbr.a.a;
   }

   protected void c(aow $$0, cbp $$1, long $$2) {
      $$1.dO().b(bxl.o);
      $$1.u();
      $$1.b(bot.a);
   }

   private void b(aow $$0, cbp $$1) {
      $$0.a(null, $$1, this.m, atm.g, 2.0F, 1.0F);
      Optional<bnq> $$2 = $$1.w();
      if ($$2.isPresent()) {
         bnq $$3 = $$2.get();
         if ($$3.bx()) {
            $$1.B($$3);
            if (!$$3.bx()) {
               $$3.a(bnq.c.a);
            }
         }
      }
   }

   protected void d(aow $$0, cbp $$1, long $$2) {
      boi $$3 = $$1.dO().c(bxl.o).get();
      $$1.a((bnq)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, atm.g, 2.0F, 1.0F);
               $$1.b(bot.j);
               $$3.g($$3.dk().a($$1.dk()).d().a(0.75));
               this.n = $$3.dk();
               this.j = 0;
               this.o = cbr.a.b;
            } else if (this.k <= 0) {
               $$1.dO().a(bxl.m, new bxo($$3.dk(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cbr.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cbr.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cbp $$0, boi $$1) {
      ehl $$2 = $$0.N().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cbp $$0, boi $$1) {
      List<UUID> $$2 = $$0.dO().c(bxl.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cw());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cw());
      }

      $$0.dO().a(bxl.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
