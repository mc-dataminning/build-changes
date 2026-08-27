import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bnb extends bmx<cdh> {
   @Nullable
   private cfb c;

   public bnb(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(ame $$0, cdh $$1) {
      ht $$2 = $$1.dn();
      this.c = $$0.c($$2);
      return this.c != null && this.c.e() && bof.a($$0, $$1, $$2);
   }

   protected boolean a(ame $$0, cdh $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(ame $$0, cdh $$1, long $$2) {
      this.c = null;
      $$1.dP().a($$0.X(), $$0.W());
   }

   protected void c(ame $$0, cdh $$1, long $$2) {
      ats $$3 = $$1.eh();
      if ($$3.a(100) == 0) {
         $$1.gk();
      }

      if ($$3.a(200) == 0 && bof.a($$0, $$1, $$1.dn())) {
         cjx $$4 = ac.a(cjx.values(), $$3);
         int $$5 = $$3.a(3);
         clj $$6 = this.a($$4, $$5);
         ceh $$7 = new ceh($$1.dN(), $$1, $$1.ds(), $$1.dw(), $$1.dy(), $$6);
         $$1.dN().b($$7);
      }
   }

   private clj a(cjx $$0, int $$1) {
      clj $$2 = new clj(clm.um, 1);
      clj $$3 = new clj(clm.un);
      rz $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)ckn.a.e.a());
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
