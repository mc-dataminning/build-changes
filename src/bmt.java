import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bmt extends bmp<ccz> {
   @Nullable
   private cet c;

   public bmt(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(ama $$0, ccz $$1) {
      ht $$2 = $$1.dl();
      this.c = $$0.c($$2);
      return this.c != null && this.c.e() && bnx.a($$0, $$1, $$2);
   }

   protected boolean a(ama $$0, ccz $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(ama $$0, ccz $$1, long $$2) {
      this.c = null;
      $$1.dN().a($$0.W(), $$0.V());
   }

   protected void c(ama $$0, ccz $$1, long $$2) {
      ato $$3 = $$1.ef();
      if ($$3.a(100) == 0) {
         $$1.gj();
      }

      if ($$3.a(200) == 0 && bnx.a($$0, $$1, $$1.dl())) {
         cjp $$4 = ac.a(cjp.values(), $$3);
         int $$5 = $$3.a(3);
         clb $$6 = this.a($$4, $$5);
         cdz $$7 = new cdz($$1.dL(), $$1, $$1.dq(), $$1.du(), $$1.dw(), $$6);
         $$1.dL().b($$7);
      }
   }

   private clb a(cjp $$0, int $$1) {
      clb $$2 = new clb(cle.tB, 1);
      clb $$3 = new clb(cle.tC);
      rz $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)ckf.a.e.a());
      rz $$6 = $$2.a("Fireworks");
      sf $$7 = new sf();
      rz $$8 = $$3.b("Explosion");
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
