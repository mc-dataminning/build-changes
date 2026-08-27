import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bld extends bkz<cbj> {
   @Nullable
   private cdd c;

   public bld(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aks $$0, cbj $$1) {
      gw $$2 = $$1.dl();
      this.c = $$0.c($$2);
      return this.c != null && this.c.e() && bmh.a($$0, $$1, $$2);
   }

   protected boolean a(aks $$0, cbj $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aks $$0, cbj $$1, long $$2) {
      this.c = null;
      $$1.dN().a($$0.W(), $$0.V());
   }

   protected void c(aks $$0, cbj $$1, long $$2) {
      ase $$3 = $$1.ef();
      if ($$3.a(100) == 0) {
         $$1.gi();
      }

      if ($$3.a(200) == 0 && bmh.a($$0, $$1, $$1.dl())) {
         chv $$4 = ac.a(chv.values(), $$3);
         int $$5 = $$3.a(3);
         cjh $$6 = this.a($$4, $$5);
         ccj $$7 = new ccj($$1.dL(), $$1, $$1.dq(), $$1.du(), $$1.dw(), $$6);
         $$1.dL().b($$7);
      }
   }

   private cjh a(chv $$0, int $$1) {
      cjh $$2 = new cjh(cjk.tA, 1);
      cjh $$3 = new cjh(cjk.tB);
      qy $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cil.a.e.a());
      qy $$6 = $$2.a("Fireworks");
      re $$7 = new re();
      qy $$8 = $$3.b("Explosion");
      if ($$8 != null) {
         $$7.add($$8);
      }

      $$6.a("Flight", (byte)$$1);
      if (!$$7.isEmpty()) {
         $$6.a("Explosions", $$7);
      }

      return $$2;
   }
}
