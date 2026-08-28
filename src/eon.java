import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class eon extends eoh {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected esf b;
   protected esb c;
   protected jh d;

   public eon(eou $$0, int $$1, esg $$2, alp $$3, String $$4, esb $$5, jh $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jm.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public eon(eou $$0, um $$1, esg $$2, Function<alp, esb> $$3) {
      super($$0, $$1);
      this.a(jm.c);
      this.a = $$1.l("Template");
      this.d = new jh($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      alp $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected alp b() {
      return alp.a(this.a);
   }

   @Override
   protected void a(eot $$0, um $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (esf.d $$8 : this.b.a(this.d, this.c, dkf.pC)) {
            if ($$8.c() != null) {
               dyx $$9 = dyx.valueOf($$8.c().l("mode"));
               if ($$9 == dyx.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (esf.d $$11 : this.b.a(this.d, this.c, dkf.pD)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dxo $$13 = dkf.a.m();

               try {
                  $$13 = gq.a($$0.a(mb.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, jh var2, dhq var3, bac var4, env var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dqv a() {
      return this.c.d();
   }

   public esf c() {
      return this.b;
   }

   public jh d() {
      return this.d;
   }

   public esb e() {
      return this.c;
   }
}
