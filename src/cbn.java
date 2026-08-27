import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cbn extends bpw<cbl> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final atj l;
   private final atj m;
   private ens n;
   private cbn.a o = cbn.a.d;

   public cbn(atj $$0, atj $$1) {
      super(ImmutableMap.of(bxh.m, bxi.b, bxh.n, bxi.c, bxh.o, bxi.a, bxh.Z, bxi.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aov $$0, cbl $$1) {
      bog $$2 = $$1.dO().c(bxh.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dO().b(bxh.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != bor.i && cbl.j($$2);
   }

   protected boolean a(aov $$0, cbl $$1, long $$2) {
      return $$1.dO().a(bxh.o) && this.o != cbn.a.d && !$$1.dO().a(bxh.Z);
   }

   protected void b(aov $$0, cbl $$1, long $$2) {
      bog $$3 = $$1.dO().c(bxh.o).get();
      bpy.a($$1, $$3);
      $$1.a((bno)$$3);
      $$1.dO().a(bxh.m, new bxk($$3.dk(), 2.0F, 0));
      this.k = 10;
      this.o = cbn.a.a;
   }

   protected void c(aov $$0, cbl $$1, long $$2) {
      $$1.dO().b(bxh.o);
      $$1.u();
      $$1.b(bor.a);
   }

   private void b(aov $$0, cbl $$1) {
      $$0.a(null, $$1, this.m, atl.g, 2.0F, 1.0F);
      Optional<bno> $$2 = $$1.w();
      if ($$2.isPresent()) {
         bno $$3 = $$2.get();
         if ($$3.bx()) {
            $$1.B($$3);
            if (!$$3.bx()) {
               $$3.a(bno.c.a);
            }
         }
      }
   }

   protected void d(aov $$0, cbl $$1, long $$2) {
      bog $$3 = $$1.dO().c(bxh.o).get();
      $$1.a((bno)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, atl.g, 2.0F, 1.0F);
               $$1.b(bor.j);
               $$3.g($$3.dk().a($$1.dk()).d().a(0.75));
               this.n = $$3.dk();
               this.j = 0;
               this.o = cbn.a.b;
            } else if (this.k <= 0) {
               $$1.dO().a(bxh.m, new bxk($$3.dk(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cbn.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cbn.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cbl $$0, bog $$1) {
      ehe $$2 = $$0.N().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cbl $$0, bog $$1) {
      List<UUID> $$2 = $$0.dO().c(bxh.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cw());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cw());
      }

      $$0.dO().a(bxh.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
