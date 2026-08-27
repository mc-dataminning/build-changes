import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class dvh extends dvb {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected dyq b;
   protected dym c;
   protected gv d;

   public dvh(dvo $$0, int $$1, dyr $$2, aep $$3, String $$4, dym $$5, gv $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(hb.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public dvh(dvo $$0, qs $$1, dyr $$2, Function<aep, dym> $$3) {
      super($$0, $$1);
      this.a(hb.c);
      this.a = $$1.l("Template");
      this.d = new gv($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      aep $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected aep b() {
      return new aep(this.a);
   }

   @Override
   protected void a(dvn $$0, qs $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(cqe $$0, cqc $$1, dgv $$2, art $$3, dup $$4, cor $$5, gv $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (dyq.c $$8 : this.b.a(this.d, this.c, csl.pa)) {
            if ($$8.c() != null) {
               dgi $$9 = dgi.valueOf($$8.c().l("mode"));
               if ($$9 == dgi.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (dyq.c $$11 : this.b.a(this.d, this.c, csl.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dey $$13 = csl.a.n();

               try {
                  $$13 = fh.a($$0.a(jd.e), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, gv var2, cpz var3, art var4, dup var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public cyw a() {
      return this.c.d();
   }

   public dyq c() {
      return this.b;
   }

   public gv d() {
      return this.d;
   }

   public dym e() {
      return this.c;
   }
}
