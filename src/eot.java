import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class eot extends eon {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected esl b;
   protected esh c;
   protected ji d;

   public eot(epa $$0, int $$1, esm $$2, aku $$3, String $$4, esh $$5, ji $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jn.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public eot(epa $$0, tq $$1, esm $$2, Function<aku, esh> $$3) {
      super($$0, $$1);
      this.a(jn.c);
      this.a = $$1.l("Template");
      this.d = new ji($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      aku $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected aku b() {
      return aku.a(this.a);
   }

   @Override
   protected void a(eoz $$0, tq $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (esl.d $$8 : this.b.a(this.d, this.c, dkg.pC)) {
            if ($$8.c() != null) {
               dza $$9 = dza.valueOf($$8.c().l("mode"));
               if ($$9 == dza.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (esl.d $$11 : this.b.a(this.d, this.c, dkg.pD)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dxq $$13 = dkg.a.m();

               try {
                  $$13 = gr.a($$0.a(mc.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, ji var2, dhq var3, azh var4, eob var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dqw a() {
      return this.c.d();
   }

   public esl c() {
      return this.b;
   }

   public ji d() {
      return this.d;
   }

   public esh e() {
      return this.c;
   }
}
