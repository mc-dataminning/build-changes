import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class eiu extends eio {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected emk b;
   protected emg c;
   protected iz d;

   public eiu(ejb $$0, int $$1, eml $$2, alf $$3, String $$4, emg $$5, iz $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(je.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public eiu(ejb $$0, us $$1, eml $$2, Function<alf, emg> $$3) {
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
   protected void a(eja $$0, us $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (emk.c $$8 : this.b.a(this.d, this.c, dfb.pa)) {
            if ($$8.c() != null) {
               dtm $$9 = dtm.valueOf($$8.c().l("mode"));
               if ($$9 == dtm.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (emk.c $$11 : this.b.a(this.d, this.c, dfb.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dsc $$13 = dfb.a.o();

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

   protected abstract void a(String var1, iz var2, dcn var3, azh var4, eic var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dlm a() {
      return this.c.d();
   }

   public emk c() {
      return this.b;
   }

   public iz d() {
      return this.d;
   }

   public emg e() {
      return this.c;
   }
}
