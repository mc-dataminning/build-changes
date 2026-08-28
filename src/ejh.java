import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class ejh extends ejb {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected emy b;
   protected emu c;
   protected ja d;

   public ejh(ejo $$0, int $$1, emz $$2, akk $$3, String $$4, emu $$5, ja $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jf.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public ejh(ejo $$0, tx $$1, emz $$2, Function<akk, emu> $$3) {
      super($$0, $$1);
      this.a(jf.c);
      this.a = $$1.l("Template");
      this.d = new ja($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      akk $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected akk b() {
      return new akk(this.a);
   }

   @Override
   protected void a(ejn $$0, tx $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (emy.c $$8 : this.b.a(this.d, this.c, dfk.pa)) {
            if ($$8.c() != null) {
               dtv $$9 = dtv.valueOf($$8.c().l("mode"));
               if ($$9 == dtv.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (emy.c $$11 : this.b.a(this.d, this.c, dfk.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dsl $$13 = dfk.a.o();

               try {
                  $$13 = gk.a($$0.a(lr.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, ja var2, dcv var3, ayo var4, eip var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dlv a() {
      return this.c.d();
   }

   public emy c() {
      return this.b;
   }

   public ja d() {
      return this.d;
   }

   public emu e() {
      return this.c;
   }
}
