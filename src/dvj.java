import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class dvj extends dvd {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected dys b;
   protected dyo c;
   protected gu d;

   public dvj(dvq $$0, int $$1, dyt $$2, aer $$3, String $$4, dyo $$5, gu $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ha.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public dvj(dvq $$0, qr $$1, dyt $$2, Function<aer, dyo> $$3) {
      super($$0, $$1);
      this.a(ha.c);
      this.a = $$1.l("Template");
      this.d = new gu($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      aer $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected aer b() {
      return new aer(this.a);
   }

   @Override
   protected void a(dvp $$0, qr $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (dys.c $$8 : this.b.a(this.d, this.c, csn.pa)) {
            if ($$8.c() != null) {
               dgk $$9 = dgk.valueOf($$8.c().l("mode"));
               if ($$9 == dgk.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (dys.c $$11 : this.b.a(this.d, this.c, csn.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dfa $$13 = csn.a.n();

               try {
                  $$13 = fg.a($$0.a(jc.e), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, gu var2, cqb var3, aru var4, dur var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public cyy a() {
      return this.c.d();
   }

   public dys c() {
      return this.b;
   }

   public gu d() {
      return this.d;
   }

   public dyo e() {
      return this.c;
   }
}
