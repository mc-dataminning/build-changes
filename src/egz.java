import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class egz extends egt {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected ekp b;
   protected ekl c;
   protected in d;

   public egz(ehg $$0, int $$1, ekq $$2, akh $$3, String $$4, ekl $$5, in $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(is.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public egz(ehg $$0, ua $$1, ekq $$2, Function<akh, ekl> $$3) {
      super($$0, $$1);
      this.a(is.c);
      this.a = $$1.l("Template");
      this.d = new in($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      akh $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected akh b() {
      return new akh(this.a);
   }

   @Override
   protected void a(ehf $$0, ua $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (ekp.c $$8 : this.b.a(this.d, this.c, ddg.pa)) {
            if ($$8.c() != null) {
               drr $$9 = drr.valueOf($$8.c().l("mode"));
               if ($$9 == drr.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (ekp.c $$11 : this.b.a(this.d, this.c, ddg.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dqh $$13 = ddg.a.n();

               try {
                  $$13 = fx.a($$0.a(le.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, in var2, das var3, ayg var4, egh var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public djr a() {
      return this.c.d();
   }

   public ekp c() {
      return this.b;
   }

   public in d() {
      return this.d;
   }

   public ekl e() {
      return this.c;
   }
}
