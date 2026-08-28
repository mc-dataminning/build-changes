import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class enx extends enr {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected erp b;
   protected erl c;
   protected ji d;

   public enx(eoe $$0, int $$1, erq $$2, akv $$3, String $$4, erl $$5, ji $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jn.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public enx(eoe $$0, tq $$1, erq $$2, Function<akv, erl> $$3) {
      super($$0, $$1);
      this.a(jn.c);
      this.a = $$1.l("Template");
      this.d = new ji($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      akv $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected akv b() {
      return akv.a(this.a);
   }

   @Override
   protected void a(eod $$0, tq $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dhh $$0, dhf $$1, dyu $$2, azh $$3, enf $$4, dfp $$5, ji $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (erp.d $$8 : this.b.a(this.d, this.c, djp.pC)) {
            if ($$8.c() != null) {
               dyh $$9 = dyh.valueOf($$8.c().l("mode"));
               if ($$9 == dyh.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (erp.d $$11 : this.b.a(this.d, this.c, djp.pD)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dwy $$13 = djp.a.m();

               try {
                  $$13 = gr.a($$0.a(mc.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, ji var2, dha var3, azh var4, enf var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dqf a() {
      return this.c.d();
   }

   public erp c() {
      return this.b;
   }

   public ji d() {
      return this.d;
   }

   public erl e() {
      return this.c;
   }
}
