import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bng extends bnc<cdm> {
   @Nullable
   private cfg c;

   public bng(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(ami $$0, cdm $$1) {
      hx $$2 = $$1.dn();
      this.c = $$0.c($$2);
      return this.c != null && this.c.e() && bok.a($$0, $$1, $$2);
   }

   protected boolean a(ami $$0, cdm $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(ami $$0, cdm $$1, long $$2) {
      this.c = null;
      $$1.dP().a($$0.X(), $$0.W());
   }

   protected void c(ami $$0, cdm $$1, long $$2) {
      atw $$3 = $$1.eh();
      if ($$3.a(100) == 0) {
         $$1.gk();
      }

      if ($$3.a(200) == 0 && bok.a($$0, $$1, $$1.dn())) {
         ckc $$4 = ac.a(ckc.values(), $$3);
         int $$5 = $$3.a(3);
         clo $$6 = this.a($$4, $$5);
         cem $$7 = new cem($$1.dN(), $$1, $$1.ds(), $$1.dw(), $$1.dy(), $$6);
         $$1.dN().b($$7);
      }
   }

   private clo a(ckc $$0, int $$1) {
      clo $$2 = new clo(clr.um, 1);
      clo $$3 = new clo(clr.un);
      sd $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)cks.a.e.a());
      sd $$6 = $$2.a("Fireworks");
      sj $$7 = new sj();
      sd $$8 = $$3.b("Explosion");
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
