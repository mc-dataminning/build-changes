import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class eou extends eoo {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected esm b;
   protected esi c;
   protected jh d;

   public eou(epb $$0, int $$1, esn $$2, alz $$3, String $$4, esi $$5, jh $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jm.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public eou(epb $$0, ux $$1, esn $$2, Function<alz, esi> $$3) {
      super($$0, $$1);
      this.a(jm.c);
      this.a = $$1.l("Template");
      this.d = new jh($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      alz $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected alz b() {
      return alz.a(this.a);
   }

   @Override
   protected void a(epa $$0, ux $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (esm.d $$8 : this.b.a(this.d, this.c, dko.pv)) {
            if ($$8.c() != null) {
               dze $$9 = dze.valueOf($$8.c().l("mode"));
               if ($$9 == dze.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (esm.d $$11 : this.b.a(this.d, this.c, dko.pw)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dxv $$13 = dko.a.m();

               try {
                  $$13 = gq.a($$0.a(mb.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, jh var2, dhz var3, bam var4, eoc var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public drc a() {
      return this.c.d();
   }

   public esm c() {
      return this.b;
   }

   public jh d() {
      return this.d;
   }

   public esi e() {
      return this.c;
   }
}
