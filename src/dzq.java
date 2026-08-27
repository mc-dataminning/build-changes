import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class dzq extends dzk {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected edg b;
   protected edc c;
   protected hx d;

   public dzq(dzx $$0, int $$1, edh $$2, ahg $$3, String $$4, edc $$5, hx $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ic.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public dzq(dzx $$0, sn $$1, edh $$2, Function<ahg, edc> $$3) {
      super($$0, $$1);
      this.a(ic.c);
      this.a = $$1.l("Template");
      this.d = new hx($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      ahg $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected ahg b() {
      return new ahg(this.a);
   }

   @Override
   protected void a(dzw $$0, sn $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(cuk $$0, cui $$1, dle $$2, auv $$3, dyy $$4, csw $$5, hx $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (edg.c $$8 : this.b.a(this.d, this.c, cws.pa)) {
            if ($$8.c() != null) {
               dkr $$9 = dkr.valueOf($$8.c().l("mode"));
               if ($$9 == dkr.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (edg.c $$11 : this.b.a(this.d, this.c, cws.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               djh $$13 = cws.a.o();

               try {
                  $$13 = fk.a($$0.a(ke.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, hx var2, cue var3, auv var4, dyy var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public ddc a() {
      return this.c.d();
   }

   public edg c() {
      return this.b;
   }

   public hx d() {
      return this.d;
   }

   public edc e() {
      return this.c;
   }
}
