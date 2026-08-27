import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class boj extends bof<cfd> {
   @Nullable
   private cgy c;

   public boj(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(ane $$0, cfd $$1) {
      hx $$2 = $$1.dl();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && bpo.a($$0, $$1, $$2);
   }

   protected boolean a(ane $$0, cfd $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(ane $$0, cfd $$1, long $$2) {
      this.c = null;
      $$1.dN().a($$0.Y(), $$0.X());
   }

   protected void c(ane $$0, cfd $$1, long $$2) {
      auw $$3 = $$1.eg();
      if ($$3.a(100) == 0) {
         $$1.gk();
      }

      if ($$3.a(200) == 0 && bpo.a($$0, $$1, $$1.dl())) {
         clv $$4 = ac.a(clv.values(), $$3);
         int $$5 = $$3.a(3);
         cng $$6 = this.a($$4, $$5);
         cgd $$7 = new cgd($$1.dL(), $$1, $$1.dq(), $$1.du(), $$1.dw(), $$6);
         $$1.dL().b($$7);
      }
   }

   private cng a(clv $$0, int $$1) {
      cng $$2 = new cng(cnj.uq, 1);
      cng $$3 = new cng(cnj.ur);
      so $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cml.a.e.a());
      so $$6 = $$2.a("Fireworks");
      su $$7 = new su();
      so $$8 = $$3.b("Explosion");
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
