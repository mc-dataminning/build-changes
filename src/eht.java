import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class eht extends ehn {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected elj b;
   protected elf c;
   protected io d;

   public eht(eia $$0, int $$1, elk $$2, akm $$3, String $$4, elf $$5, io $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(it.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public eht(eia $$0, ud $$1, elk $$2, Function<akm, elf> $$3) {
      super($$0, $$1);
      this.a(it.c);
      this.a = $$1.l("Template");
      this.d = new io($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      akm $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected akm b() {
      return new akm(this.a);
   }

   @Override
   protected void a(ehz $$0, ud $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dbs $$0, dbq $$1, dsy $$2, ayk $$3, ehb $$4, dae $$5, io $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (elj.c $$8 : this.b.a(this.d, this.c, dea.pa)) {
            if ($$8.c() != null) {
               dsl $$9 = dsl.valueOf($$8.c().l("mode"));
               if ($$9 == dsl.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (elj.c $$11 : this.b.a(this.d, this.c, dea.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               drb $$13 = dea.a.n();

               try {
                  $$13 = fy.a($$0.a(lf.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, io var2, dbm var3, ayk var4, ehb var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dkl a() {
      return this.c.d();
   }

   public elj c() {
      return this.b;
   }

   public io d() {
      return this.d;
   }

   public elf e() {
      return this.c;
   }
}
