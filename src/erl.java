import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class erl extends erf {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected evd b;
   protected euz c;
   protected iu d;

   public erl(ers $$0, int $$1, eve $$2, alg $$3, String $$4, euz $$5, iu $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ja.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public erl(ers $$0, tz $$1, eve $$2, Function<alg, euz> $$3) {
      super($$0, $$1);
      this.a(ja.c);
      this.a = $$1.l("Template");
      this.d = new iu($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      alg $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected alg b() {
      return alg.a(this.a);
   }

   @Override
   protected void a(err $$0, tz $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(djz $$0, djw $$1, ecf $$2, azv $$3, eqt $$4, dih $$5, iu $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (evd.d $$8 : this.b.a(this.d, this.c, dmh.pG)) {
            if ($$8.c() != null) {
               ebr $$9 = ebr.valueOf($$8.c().l("mode"));
               if ($$9 == ebr.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (evd.d $$11 : this.b.a(this.d, this.c, dmh.pH)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               eah $$13 = dmh.a.m();

               try {
                  $$13 = gd.a($$0.a(mg.i), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, iu var2, djr var3, azv var4, eqt var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dsz a() {
      return this.c.d();
   }

   public evd c() {
      return this.b;
   }

   public iu d() {
      return this.d;
   }

   public euz e() {
      return this.c;
   }
}
