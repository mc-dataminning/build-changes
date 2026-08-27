import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bme extends bma<cck> {
   @Nullable
   private cee c;

   public bme(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(alq $$0, cck $$1) {
      ht $$2 = $$1.dl();
      this.c = $$0.c($$2);
      return this.c != null && this.c.e() && bni.a($$0, $$1, $$2);
   }

   protected boolean a(alq $$0, cck $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(alq $$0, cck $$1, long $$2) {
      this.c = null;
      $$1.dN().a($$0.W(), $$0.V());
   }

   protected void c(alq $$0, cck $$1, long $$2) {
      ate $$3 = $$1.ef();
      if ($$3.a(100) == 0) {
         $$1.gj();
      }

      if ($$3.a(200) == 0 && bni.a($$0, $$1, $$1.dl())) {
         cix $$4 = ac.a(cix.values(), $$3);
         int $$5 = $$3.a(3);
         ckj $$6 = this.a($$4, $$5);
         cdk $$7 = new cdk($$1.dL(), $$1, $$1.dq(), $$1.du(), $$1.dw(), $$6);
         $$1.dL().b($$7);
      }
   }

   private ckj a(cix $$0, int $$1) {
      ckj $$2 = new ckj(ckm.tA, 1);
      ckj $$3 = new ckj(ckm.tB);
      rt $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cjn.a.e.a());
      rt $$6 = $$2.a("Fireworks");
      rz $$7 = new rz();
      rt $$8 = $$3.b("Explosion");
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
