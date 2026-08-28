import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cha extends bvh<cgy> {
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
   private evq n;
   private cha.a o = cha.a.d;

   public cha(avy $$0, avy $$1) {
      super(ImmutableMap.of(ccs.m, cct.b, ccs.n, cct.c, ccs.o, cct.a, ccs.Z, cct.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(are $$0, cgy $$1) {
      bto $$2 = $$1.dS().c(ccs.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dS().b(ccs.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ar() != bua.i && cgy.j($$2);
   }

   protected boolean a(are $$0, cgy $$1, long $$2) {
      return $$1.dS().a(ccs.o) && this.o != cha.a.d && !$$1.dS().a(ccs.Z);
   }

   protected void b(are $$0, cgy $$1, long $$2) {
      bto $$3 = $$1.dS().c(ccs.o).get();
      bvj.a($$1, $$3);
      $$1.b($$3);
      $$1.dS().a(ccs.m, new ccv($$3.dn(), 2.0F, 0));
      this.k = 10;
      this.o = cha.a.a;
   }

   protected void c(are $$0, cgy $$1, long $$2) {
      $$1.dS().b(ccs.o);
      $$1.s();
      $$1.b(bua.a);
   }

   private void b(are $$0, cgy $$1) {
      $$0.a(null, $$1, this.m, awa.g, 2.0F, 1.0F);
      Optional<bst> $$2 = $$1.u();
      if ($$2.isPresent()) {
         bst $$3 = $$2.get();
         if ($$3.bD()) {
            $$1.C($$3);
            if (!$$3.bD()) {
               $$3.a(bst.c.a);
            }
         }
      }
   }

   protected void d(are $$0, cgy $$1, long $$2) {
      bto $$3 = $$1.dS().c(ccs.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awa.g, 2.0F, 1.0F);
               $$1.b(bua.j);
               $$3.h($$3.dn().a($$1.dn()).d().a(0.75));
               this.n = $$3.dn();
               this.j = 0;
               this.o = cha.a.b;
            } else if (this.k <= 0) {
               $$1.dS().a(ccs.m, new ccv($$3.dn(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cha.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cha.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cgy $$0, bto $$1) {
      eoi $$2 = $$0.K().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cgy $$0, bto $$1) {
      List<UUID> $$2 = $$0.dS().c(ccs.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cz());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cz());
      }

      $$0.dS().a(ccs.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
