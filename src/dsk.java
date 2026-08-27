import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class dsk extends dse {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected dvt b;
   protected dvp c;
   protected gu d;

   public dsk(dsr $$0, int $$1, dvu $$2, acq $$3, String $$4, dvp $$5, gu $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ha.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public dsk(dsr $$0, qr $$1, dvu $$2, Function<acq, dvp> $$3) {
      super($$0, $$1);
      this.a(ha.c);
      this.a = $$1.l("Template");
      this.d = new gu($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      acq $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected acq b() {
      return new acq(this.a);
   }

   @Override
   protected void a(dsq $$0, qr $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (dvt.c $$8 : this.b.a(this.d, this.c, cpo.pa)) {
            if ($$8.c() != null) {
               ddl $$9 = ddl.valueOf($$8.c().l("mode"));
               if ($$9 == ddl.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (dvt.c $$11 : this.b.a(this.d, this.c, cpo.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dcb $$13 = cpo.a.n();

               try {
                  $$13 = fg.a($$0.a(jc.e), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, gu var2, cnb var3, apf var4, drs var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public cvz a() {
      return this.c.d();
   }

   public dvt c() {
      return this.b;
   }

   public gu d() {
      return this.d;
   }

   public dvp e() {
      return this.c;
   }
}
