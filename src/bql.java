import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bql extends bpw<cgu> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cgx, aiy> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cgx.c, eit.ax);
      $$0.put(cgx.d, eit.ay);
      $$0.put(cgx.e, eit.az);
      $$0.put(cgx.f, eit.aA);
      $$0.put(cgx.g, eit.aB);
      $$0.put(cgx.h, eit.aC);
      $$0.put(cgx.i, eit.aD);
      $$0.put(cgx.j, eit.aE);
      $$0.put(cgx.k, eit.aF);
      $$0.put(cgx.l, eit.aG);
      $$0.put(cgx.n, eit.aH);
      $$0.put(cgx.o, eit.aI);
      $$0.put(cgx.p, eit.aJ);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bql(int $$0) {
      super(ImmutableMap.of(bxh.m, bxi.c, bxh.n, bxi.c, bxh.q, bxi.c, bxh.k, bxi.a), $$0);
   }

   protected boolean a(aov $$0, cgu $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aov $$0, cgu $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      chh $$3 = this.c($$1).get();
      $$1.dO().a(bxh.q, $$3);
      bpy.a($$1, $$3);
   }

   protected boolean b(aov $$0, cgu $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aov $$0, cgu $$1, long $$2) {
      chh $$3 = this.c($$1).get();
      bpy.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bog)$$3);
            this.j = true;
         }
      } else {
         bpy.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aov $$0, cgu $$1, long $$2) {
      this.i = a($$0);
      $$1.dO().b(bxh.q);
      $$1.dO().b(bxh.m);
      $$1.dO().b(bxh.n);
   }

   private void a(cgu $$0, bog $$1) {
      for (coz $$3 : this.a($$0)) {
         bpy.a($$0, $$3, $$1.dk());
      }
   }

   private List<coz> a(cgu $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new coz(cpc.dk));
      } else {
         cgx $$1 = $$0.gr().b();
         if (g.containsKey($$1)) {
            ejd $$2 = $$0.dM().o().aJ().getLootTable(g.get($$1));
            ejb $$3 = new ejb.a((aov)$$0.dM()).a(elg.f, $$0.dk()).a(elg.a, $$0).a(elf.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new coz(cpc.pu));
         }
      }
   }

   private boolean b(cgu $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<chh> c(cgu $$0) {
      return $$0.dO().c(bxh.k).filter(this::a);
   }

   private boolean a(chh $$0) {
      return $$0.a(bnd.F);
   }

   private boolean a(cgu $$0, chh $$1) {
      hz $$2 = $$1.dm();
      hz $$3 = $$0.dm();
      return $$3.a($$2, 5.0);
   }

   private static int a(aov $$0) {
      return 600 + $$0.z.a(6001);
   }
}
