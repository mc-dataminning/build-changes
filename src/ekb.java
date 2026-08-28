import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class ekb extends ejv {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected ent b;
   protected enp c;
   protected jd d;

   public ekb(eki $$0, int $$1, enu $$2, akr $$3, String $$4, enp $$5, jd $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ji.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public ekb(eki $$0, ub $$1, enu $$2, Function<akr, enp> $$3) {
      super($$0, $$1);
      this.a(ji.c);
      this.a = $$1.l("Template");
      this.d = new jd($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      akr $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected akr b() {
      return akr.a(this.a);
   }

   @Override
   protected void a(ekh $$0, ub $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (ent.c $$8 : this.b.a(this.d, this.c, dga.pa)) {
            if ($$8.c() != null) {
               dum $$9 = dum.valueOf($$8.c().l("mode"));
               if ($$9 == dum.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (ent.c $$11 : this.b.a(this.d, this.c, dga.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dtc $$13 = dga.a.o();

               try {
                  $$13 = gn.a($$0.a(lu.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, jd var2, ddl var3, ayw var4, ejj var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dmm a() {
      return this.c.d();
   }

   public ent c() {
      return this.b;
   }

   public jd d() {
      return this.d;
   }

   public enp e() {
      return this.c;
   }
}
