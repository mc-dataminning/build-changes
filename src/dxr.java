import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class dxr extends dxl {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected ebh b;
   protected ebd c;
   protected ht d;

   public dxr(dxy $$0, int $$1, ebi $$2, agi $$3, String $$4, ebd $$5, ht $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(hx.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public dxr(dxy $$0, rz $$1, ebi $$2, Function<agi, ebd> $$3) {
      super($$0, $$1);
      this.a(hx.c);
      this.a = $$1.l("Template");
      this.d = new ht($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      agi $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected agi b() {
      return new agi(this.a);
   }

   @Override
   protected void a(dxx $$0, rz $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(csu $$0, css $$1, djf $$2, ats $$3, dwz $$4, crh $$5, ht $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (ebh.c $$8 : this.b.a(this.d, this.c, cvc.pa)) {
            if ($$8.c() != null) {
               dis $$9 = dis.valueOf($$8.c().l("mode"));
               if ($$9 == dis.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (ebh.c $$11 : this.b.a(this.d, this.c, cvc.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dhi $$13 = cvc.a.o();

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

   protected abstract void a(String var1, ht var2, csp var3, ats var4, dwz var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dbm a() {
      return this.c.d();
   }

   public ebh c() {
      return this.b;
   }

   public ht d() {
      return this.d;
   }

   public ebd e() {
      return this.c;
   }
}
