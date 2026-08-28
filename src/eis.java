import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class eis extends eim {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected emi b;
   protected eme c;
   protected iz d;

   public eis(eiz $$0, int $$1, emj $$2, ale $$3, String $$4, eme $$5, iz $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(je.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public eis(eiz $$0, ur $$1, emj $$2, Function<ale, eme> $$3) {
      super($$0, $$1);
      this.a(je.c);
      this.a = $$1.l("Template");
      this.d = new iz($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      ale $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected ale b() {
      return new ale(this.a);
   }

   @Override
   protected void a(eiy $$0, ur $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dcr $$0, dcp $$1, dtx $$2, azf $$3, eia $$4, dbd $$5, iz $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (emi.c $$8 : this.b.a(this.d, this.c, dez.pa)) {
            if ($$8.c() != null) {
               dtk $$9 = dtk.valueOf($$8.c().l("mode"));
               if ($$9 == dtk.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (emi.c $$11 : this.b.a(this.d, this.c, dez.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dsa $$13 = dez.a.o();

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

   protected abstract void a(String var1, iz var2, dcl var3, azf var4, eia var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dlk a() {
      return this.c.d();
   }

   public emi c() {
      return this.b;
   }

   public iz d() {
      return this.d;
   }

   public eme e() {
      return this.c;
   }
}
