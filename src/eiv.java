import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class eiv extends eip {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected eml b;
   protected emh c;
   protected iz d;

   public eiv(ejc $$0, int $$1, emm $$2, alf $$3, String $$4, emh $$5, iz $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(je.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public eiv(ejc $$0, us $$1, emm $$2, Function<alf, emh> $$3) {
      super($$0, $$1);
      this.a(je.c);
      this.a = $$1.l("Template");
      this.d = new iz($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      alf $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected alf b() {
      return new alf(this.a);
   }

   @Override
   protected void a(ejb $$0, us $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (eml.c $$8 : this.b.a(this.d, this.c, dfc.pa)) {
            if ($$8.c() != null) {
               dtn $$9 = dtn.valueOf($$8.c().l("mode"));
               if ($$9 == dtn.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (eml.c $$11 : this.b.a(this.d, this.c, dfc.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dsd $$13 = dfc.a.o();

               try {
                  $$13 = gj.a($$0.a(lq.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, iz var2, dco var3, azh var4, eid var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dln a() {
      return this.c.d();
   }

   public eml c() {
      return this.b;
   }

   public iz d() {
      return this.d;
   }

   public emh e() {
      return this.c;
   }
}
