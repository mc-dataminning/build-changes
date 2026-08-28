import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class enu extends eno {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected erm b;
   protected eri c;
   protected ji d;

   public enu(eob $$0, int $$1, ern $$2, aku $$3, String $$4, eri $$5, ji $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jn.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public enu(eob $$0, tq $$1, ern $$2, Function<aku, eri> $$3) {
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
   protected void a(eoa $$0, tq $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dhe $$0, dhc $$1, dyr $$2, azg $$3, enc $$4, dfm $$5, ji $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (erm.d $$8 : this.b.a(this.d, this.c, djm.pC)) {
            if ($$8.c() != null) {
               dye $$9 = dye.valueOf($$8.c().l("mode"));
               if ($$9 == dye.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (erm.d $$11 : this.b.a(this.d, this.c, djm.pD)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dwv $$13 = djm.a.m();

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

   protected abstract void a(String var1, ji var2, dgx var3, azg var4, enc var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dqc a() {
      return this.c.d();
   }

   public erm c() {
      return this.b;
   }

   public ji d() {
      return this.d;
   }

   public eri e() {
      return this.c;
   }
}
