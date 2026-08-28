import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class emh extends emb {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected epz b;
   protected epv c;
   protected jh d;

   public emh(emo $$0, int $$1, eqa $$2, ali $$3, String $$4, epv $$5, jh $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jm.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public emh(emo $$0, uk $$1, eqa $$2, Function<ali, epv> $$3) {
      super($$0, $$1);
      this.a(jm.c);
      this.a = $$1.l("Template");
      this.d = new jh($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      ali $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected ali b() {
      return ali.a(this.a);
   }

   @Override
   protected void a(emn $$0, uk $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (epz.c $$8 : this.b.a(this.d, this.c, dig.pa)) {
            if ($$8.c() != null) {
               dwt $$9 = dwt.valueOf($$8.c().l("mode"));
               if ($$9 == dwt.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (epz.c $$11 : this.b.a(this.d, this.c, dig.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dvj $$13 = dig.a.m();

               try {
                  $$13 = gq.a($$0.a(lz.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, jh var2, dfr var3, azs var4, elp var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dor a() {
      return this.c.d();
   }

   public epz c() {
      return this.b;
   }

   public jh d() {
      return this.d;
   }

   public epv e() {
      return this.c;
   }
}
