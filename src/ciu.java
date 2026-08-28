import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ciu extends bxa<cis> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final avz l;
   private final avz m;
   private fba n;
   private ciu.a o = ciu.a.d;

   public ciu(avz $$0, avz $$1) {
      super(ImmutableMap.of(cel.m, cem.b, cel.n, cem.c, cel.o, cem.a, cel.Z, cem.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(ard $$0, cis $$1) {
      bvh $$2 = $$1.eb().c(cel.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.eb().b(cel.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.aw() != bvt.i && cis.j($$2);
   }

   protected boolean a(ard $$0, cis $$1, long $$2) {
      return $$1.eb().a(cel.o) && this.o != ciu.a.d && !$$1.eb().a(cel.Z);
   }

   protected void b(ard $$0, cis $$1, long $$2) {
      bvh $$3 = $$1.eb().c(cel.o).get();
      bxc.a($$1, $$3);
      $$1.b($$3);
      $$1.eb().a(cel.m, new ceo($$3.dt(), 2.0F, 0));
      this.k = 10;
      this.o = ciu.a.a;
   }

   protected void c(ard $$0, cis $$1, long $$2) {
      $$1.eb().b(cel.o);
      $$1.p();
      $$1.b(bvt.a);
   }

   private void b(ard $$0, cis $$1) {
      $$0.a(null, $$1, this.m, awb.g, 2.0F, 1.0F);
      Optional<bul> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bul $$3 = $$2.get();
         if ($$3.bL()) {
            $$1.c($$0, $$3);
            if (!$$3.bL()) {
               $$3.a(bul.d.a);
            }
         }
      }
   }

   protected void d(ard $$0, cis $$1, long $$2) {
      bvh $$3 = $$1.eb().c(cel.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awb.g, 2.0F, 1.0F);
               $$1.b(bvt.j);
               $$3.i($$3.dt().a($$1.dt()).d().c(0.75));
               this.n = $$3.dt();
               this.j = 0;
               this.o = ciu.a.b;
            } else if (this.k <= 0) {
               $$1.eb().a(cel.m, new ceo($$3.dt(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = ciu.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = ciu.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cis $$0, bvh $$1) {
      etn $$2 = $$0.P().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cis $$0, bvh $$1) {
      List<UUID> $$2 = $$0.eb().c(cel.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cG());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cG());
      }

      $$0.eb().a(cel.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
