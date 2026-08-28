import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class epq extends epk {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected eti b;
   protected ete c;
   protected jj d;

   public epq(epx $$0, int $$1, etj $$2, ald $$3, String $$4, ete $$5, jj $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jo.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public epq(epx $$0, tw $$1, etj $$2, Function<ald, ete> $$3) {
      super($$0, $$1);
      this.a(jo.c);
      this.a = $$1.l("Template");
      this.d = new jj($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      ald $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected ald b() {
      return ald.a(this.a);
   }

   @Override
   protected void a(epw $$0, tw $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (eti.d $$8 : this.b.a(this.d, this.c, dkw.pC)) {
            if ($$8.c() != null) {
               dzw $$9 = dzw.valueOf($$8.c().l("mode"));
               if ($$9 == dzw.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (eti.d $$11 : this.b.a(this.d, this.c, dkw.pD)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dym $$13 = dkw.a.m();

               try {
                  $$13 = gs.a($$0.a(me.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, jj var2, dig var3, azs var4, eoy var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public drm a() {
      return this.c.d();
   }

   public eti c() {
      return this.b;
   }

   public jj d() {
      return this.d;
   }

   public ete e() {
      return this.c;
   }
}
