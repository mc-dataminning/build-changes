import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class dwk extends dwe {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected dzt b;
   protected dzp c;
   protected ht d;

   public dwk(dwr $$0, int $$1, dzu $$2, afw $$3, String $$4, dzp $$5, ht $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(hx.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public dwk(dwr $$0, rt $$1, dzu $$2, Function<afw, dzp> $$3) {
      super($$0, $$1);
      this.a(hx.c);
      this.a = $$1.l("Template");
      this.d = new ht($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      afw $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected afw b() {
      return new afw(this.a);
   }

   @Override
   protected void a(dwq $$0, rt $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (dzt.c $$8 : this.b.a(this.d, this.c, cuc.pa)) {
            if ($$8.c() != null) {
               dhl $$9 = dhl.valueOf($$8.c().l("mode"));
               if ($$9 == dhl.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (dzt.c $$11 : this.b.a(this.d, this.c, cuc.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dgb $$13 = cuc.a.o();

               try {
                  $$13 = fk.a($$0.a(jz.e), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, ht var2, cro var3, ate var4, dvs var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dal a() {
      return this.c.d();
   }

   public dzt c() {
      return this.b;
   }

   public ht d() {
      return this.d;
   }

   public dzp e() {
      return this.c;
   }
}
