import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class dxw extends dxq {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected ebm b;
   protected ebi c;
   protected hx d;

   public dxw(dyd $$0, int $$1, ebn $$2, agm $$3, String $$4, ebi $$5, hx $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ib.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public dxw(dyd $$0, sd $$1, ebn $$2, Function<agm, ebi> $$3) {
      super($$0, $$1);
      this.a(ib.c);
      this.a = $$1.l("Template");
      this.d = new hx($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      agm $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected agm b() {
      return new agm(this.a);
   }

   @Override
   protected void a(dyc $$0, sd $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (ebm.c $$8 : this.b.a(this.d, this.c, cvh.pa)) {
            if ($$8.c() != null) {
               dix $$9 = dix.valueOf($$8.c().l("mode"));
               if ($$9 == dix.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (ebm.c $$11 : this.b.a(this.d, this.c, cvh.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dhn $$13 = cvh.a.o();

               try {
                  $$13 = fk.a($$0.a(kd.e), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, hx var2, csu var3, atw var4, dxe var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dbr a() {
      return this.c.d();
   }

   public ebm c() {
      return this.b;
   }

   public hx d() {
      return this.d;
   }

   public ebi e() {
      return this.c;
   }
}
