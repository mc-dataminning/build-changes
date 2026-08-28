import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cis extends bwy<ciq> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final avy l;
   private final avy m;
   private fay n;
   private cis.a o = cis.a.d;

   public cis(avy $$0, avy $$1) {
      super(ImmutableMap.of(cej.m, cek.b, cej.n, cek.c, cej.o, cek.a, cej.Z, cek.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(arc $$0, ciq $$1) {
      bvf $$2 = $$1.ec().c(cej.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.ec().b(cej.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.aw() != bvr.i && ciq.j($$2);
   }

   protected boolean a(arc $$0, ciq $$1, long $$2) {
      return $$1.ec().a(cej.o) && this.o != cis.a.d && !$$1.ec().a(cej.Z);
   }

   protected void b(arc $$0, ciq $$1, long $$2) {
      bvf $$3 = $$1.ec().c(cej.o).get();
      bxa.a($$1, $$3);
      $$1.b($$3);
      $$1.ec().a(cej.m, new cem($$3.du(), 2.0F, 0));
      this.k = 10;
      this.o = cis.a.a;
   }

   protected void c(arc $$0, ciq $$1, long $$2) {
      $$1.ec().b(cej.o);
      $$1.p();
      $$1.b(bvr.a);
   }

   private void b(arc $$0, ciq $$1) {
      $$0.a(null, $$1, this.m, awa.g, 2.0F, 1.0F);
      Optional<buj> $$2 = $$1.t();
      if ($$2.isPresent()) {
         buj $$3 = $$2.get();
         if ($$3.bL()) {
            $$1.c($$0, $$3);
            if (!$$3.bL()) {
               $$3.a(buj.d.a);
            }
         }
      }
   }

   protected void d(arc $$0, ciq $$1, long $$2) {
      bvf $$3 = $$1.ec().c(cej.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awa.g, 2.0F, 1.0F);
               $$1.b(bvr.j);
               $$3.h($$3.du().a($$1.du()).d().c(0.75));
               this.n = $$3.du();
               this.j = 0;
               this.o = cis.a.b;
            } else if (this.k <= 0) {
               $$1.ec().a(cej.m, new cem($$3.du(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cis.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cis.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(ciq $$0, bvf $$1) {
      etl $$2 = $$0.L().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(ciq $$0, bvf $$1) {
      List<UUID> $$2 = $$0.ec().c(cej.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cG());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cG());
      }

      $$0.ec().a(cej.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
