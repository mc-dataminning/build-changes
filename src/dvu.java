import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class dvu extends dvo {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected dzd b;
   protected dyz c;
   protected gw d;

   public dvu(dwb $$0, int $$1, dze $$2, aey $$3, String $$4, dyz $$5, gw $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(hc.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public dvu(dwb $$0, qy $$1, dze $$2, Function<aey, dyz> $$3) {
      super($$0, $$1);
      this.a(hc.c);
      this.a = $$1.l("Template");
      this.d = new gw($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      aey $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected aey b() {
      return new aey(this.a);
   }

   @Override
   protected void a(dwa $$0, qy $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, gw $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (dzd.c $$8 : this.b.a(this.d, this.c, csy.pa)) {
            if ($$8.c() != null) {
               dgv $$9 = dgv.valueOf($$8.c().l("mode"));
               if ($$9 == dgv.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (dzd.c $$11 : this.b.a(this.d, this.c, csy.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dfl $$13 = csy.a.n();

               try {
                  $$13 = fi.a($$0.a(je.e), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, gw var2, cqm var3, ase var4, dvc var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public czj a() {
      return this.c.d();
   }

   public dzd c() {
      return this.b;
   }

   public gw d() {
      return this.d;
   }

   public dyz e() {
      return this.c;
   }
}
