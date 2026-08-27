import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class edm extends edg {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected ehc b;
   protected egy c;
   protected ib d;

   public edm(edt $$0, int $$1, ehd $$2, ajh $$3, String $$4, egy $$5, ib $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ih.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public edm(edt $$0, ta $$1, ehd $$2, Function<ajh, egy> $$3) {
      super($$0, $$1);
      this.a(ih.c);
      this.a = $$1.l("Template");
      this.d = new ib($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      ajh $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected ajh b() {
      return new ajh(this.a);
   }

   @Override
   protected void a(eds $$0, ta $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (ehc.c $$8 : this.b.a(this.d, this.c, dac.pa)) {
            if ($$8.c() != null) {
               doj $$9 = doj.valueOf($$8.c().l("mode"));
               if ($$9 == doj.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (ehc.c $$11 : this.b.a(this.d, this.c, dac.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dmz $$13 = dac.a.o();

               try {
                  $$13 = fm.a($$0.a(kj.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, ib var2, cxo var3, axd var4, ecu var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dgm a() {
      return this.c.d();
   }

   public ehc c() {
      return this.b;
   }

   public ib d() {
      return this.d;
   }

   public egy e() {
      return this.c;
   }
}
