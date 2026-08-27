import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class egq extends egk {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected ekg b;
   protected ekc c;
   protected im d;

   public egq(egx $$0, int $$1, ekh $$2, akf $$3, String $$4, ekc $$5, im $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ir.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public egq(egx $$0, ty $$1, ekh $$2, Function<akf, ekc> $$3) {
      super($$0, $$1);
      this.a(ir.c);
      this.a = $$1.l("Template");
      this.d = new im($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      akf $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected akf b() {
      return new akf(this.a);
   }

   @Override
   protected void a(egw $$0, ty $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (ekg.c $$8 : this.b.a(this.d, this.c, dcx.pa)) {
            if ($$8.c() != null) {
               dri $$9 = dri.valueOf($$8.c().l("mode"));
               if ($$9 == dri.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (ekg.c $$11 : this.b.a(this.d, this.c, dcx.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dpy $$13 = dcx.a.n();

               try {
                  $$13 = fv.a($$0.a(ld.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, im var2, daj var3, ayd var4, efy var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dji a() {
      return this.c.d();
   }

   public ekg c() {
      return this.b;
   }

   public im d() {
      return this.d;
   }

   public ekc e() {
      return this.c;
   }
}
