import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class ems extends emm {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected eqk b;
   protected eqg c;
   protected jh d;

   public ems(emz $$0, int $$1, eql $$2, alj $$3, String $$4, eqg $$5, jh $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jm.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public ems(emz $$0, ul $$1, eql $$2, Function<alj, eqg> $$3) {
      super($$0, $$1);
      this.a(jm.c);
      this.a = $$1.l("Template");
      this.d = new jh($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      alj $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected alj b() {
      return alj.a(this.a);
   }

   @Override
   protected void a(emy $$0, ul $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (eqk.c $$8 : this.b.a(this.d, this.c, dis.pa)) {
            if ($$8.c() != null) {
               dxe $$9 = dxe.valueOf($$8.c().l("mode"));
               if ($$9 == dxe.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (eqk.c $$11 : this.b.a(this.d, this.c, dis.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dvv $$13 = dis.a.m();

               try {
                  $$13 = gq.a($$0.a(ma.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, jh var2, dgd var3, azu var4, ema var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dpd a() {
      return this.c.d();
   }

   public eqk c() {
      return this.b;
   }

   public jh d() {
      return this.d;
   }

   public eqg e() {
      return this.c;
   }
}
