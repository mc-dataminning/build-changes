import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class dyy extends dys {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected eco b;
   protected eck c;
   protected hv d;

   public dyy(dzf $$0, int $$1, ecp $$2, agt $$3, String $$4, eck $$5, hv $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ia.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public dyy(dzf $$0, sj $$1, ecp $$2, Function<agt, eck> $$3) {
      super($$0, $$1);
      this.a(ia.c);
      this.a = $$1.l("Template");
      this.d = new hv($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      agt $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected agt b() {
      return new agt(this.a);
   }

   @Override
   protected void a(dze $$0, sj $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (eco.c $$8 : this.b.a(this.d, this.c, cwb.pa)) {
            if ($$8.c() != null) {
               djz $$9 = djz.valueOf($$8.c().l("mode"));
               if ($$9 == djz.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (eco.c $$11 : this.b.a(this.d, this.c, cwb.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dip $$13 = cwb.a.o();

               try {
                  $$13 = fi.a($$0.a(kc.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, hv var2, ctn var3, auf var4, dyg var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dcl a() {
      return this.c.d();
   }

   public eco c() {
      return this.b;
   }

   public hv d() {
      return this.d;
   }

   public eck e() {
      return this.c;
   }
}
