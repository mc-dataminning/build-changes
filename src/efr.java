import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class efr extends efl {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected ejh b;
   protected ejd c;
   protected ib d;

   public efr(efy $$0, int $$1, eji $$2, ajt $$3, String $$4, ejd $$5, ib $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ih.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public efr(efy $$0, tm $$1, eji $$2, Function<ajt, ejd> $$3) {
      super($$0, $$1);
      this.a(ih.c);
      this.a = $$1.l("Template");
      this.d = new ib($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      ajt $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected ajt b() {
      return new ajt(this.a);
   }

   @Override
   protected void a(efx $$0, tm $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(czs $$0, czq $$1, dqw $$2, axr $$3, eez $$4, cye $$5, ib $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (ejh.c $$8 : this.b.a(this.d, this.c, dca.pa)) {
            if ($$8.c() != null) {
               dqj $$9 = dqj.valueOf($$8.c().l("mode"));
               if ($$9 == dqj.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (ejh.c $$11 : this.b.a(this.d, this.c, dca.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               doz $$13 = dca.a.n();

               try {
                  $$13 = fm.a($$0.a(ks.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, ib var2, czm var3, axr var4, eez var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dik a() {
      return this.c.d();
   }

   public ejh c() {
      return this.b;
   }

   public ib d() {
      return this.d;
   }

   public ejd e() {
      return this.c;
   }
}
