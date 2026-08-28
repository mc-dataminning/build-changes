import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class eky extends eks {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected eoq b;
   protected eom c;
   protected je d;

   public eky(elf $$0, int $$1, eor $$2, alb $$3, String $$4, eom $$5, je $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jj.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public eky(elf $$0, uf $$1, eor $$2, Function<alb, eom> $$3) {
      super($$0, $$1);
      this.a(jj.c);
      this.a = $$1.l("Template");
      this.d = new je($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      alb $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected alb b() {
      return alb.a(this.a);
   }

   @Override
   protected void a(ele $$0, uf $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (eoq.c $$8 : this.b.a(this.d, this.c, dgx.pa)) {
            if ($$8.c() != null) {
               dvk $$9 = dvk.valueOf($$8.c().l("mode"));
               if ($$9 == dvk.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (eoq.c $$11 : this.b.a(this.d, this.c, dgx.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dua $$13 = dgx.a.o();

               try {
                  $$13 = gn.a($$0.a(lv.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, je var2, dei var3, azk var4, ekg var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dnj a() {
      return this.c.d();
   }

   public eoq c() {
      return this.b;
   }

   public je d() {
      return this.d;
   }

   public eom e() {
      return this.c;
   }
}
