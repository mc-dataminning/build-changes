import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class eja extends eiu {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected emq b;
   protected emm c;
   protected ja d;

   public eja(ejh $$0, int $$1, emr $$2, akk $$3, String $$4, emm $$5, ja $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jf.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public eja(ejh $$0, tx $$1, emr $$2, Function<akk, emm> $$3) {
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
   protected void a(ejg $$0, tx $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dcz $$0, dcx $$1, due $$2, aym $$3, eii $$4, dbk $$5, ja $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (emq.c $$8 : this.b.a(this.d, this.c, dfh.pa)) {
            if ($$8.c() != null) {
               dtr $$9 = dtr.valueOf($$8.c().l("mode"));
               if ($$9 == dtr.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (emq.c $$11 : this.b.a(this.d, this.c, dfh.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dsh $$13 = dfh.a.o();

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

   protected abstract void a(String var1, ja var2, dcs var3, aym var4, eii var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dls a() {
      return this.c.d();
   }

   public emq c() {
      return this.b;
   }

   public ja d() {
      return this.d;
   }

   public emm e() {
      return this.c;
   }
}
