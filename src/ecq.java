import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class ecq extends eck {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected egg b;
   protected egc c;
   protected ib d;

   public ecq(ecx $$0, int $$1, egh $$2, ajc $$3, String $$4, egc $$5, ib $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ih.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public ecq(ecx $$0, sy $$1, egh $$2, Function<ajc, egc> $$3) {
      super($$0, $$1);
      this.a(ih.c);
      this.a = $$1.l("Template");
      this.d = new ib($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      ajc $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected ajc b() {
      return new ajc(this.a);
   }

   @Override
   protected void a(ecw $$0, sy $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (egg.c $$8 : this.b.a(this.d, this.c, czh.pa)) {
            if ($$8.c() != null) {
               dno $$9 = dno.valueOf($$8.c().l("mode"));
               if ($$9 == dno.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (egg.c $$11 : this.b.a(this.d, this.c, czh.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dme $$13 = czh.a.o();

               try {
                  $$13 = fm.a($$0.a(ki.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, ib var2, cwt var3, awt var4, eby var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dfr a() {
      return this.c.d();
   }

   public egg c() {
      return this.b;
   }

   public ib d() {
      return this.d;
   }

   public egc e() {
      return this.c;
   }
}
