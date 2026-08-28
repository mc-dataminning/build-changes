import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class esx extends esr {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected ewp b;
   protected ewl c;
   protected iw d;

   public esx(ete $$0, int $$1, ewq $$2, alr $$3, String $$4, ewl $$5, iw $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jc.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public esx(ete $$0, ua $$1, ewq $$2, Function<alr, ewl> $$3) {
      super($$0, $$1);
      this.a(jc.c);
      this.a = $$1.b("Template", "");
      this.d = new iw($$1.b("TPX", 0), $$1.b("TPY", 0), $$1.b("TPZ", 0));
      alr $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected alr b() {
      return alr.a(this.a);
   }

   @Override
   protected void a(etd $$0, ua $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (ewp.d $$8 : this.b.a(this.d, this.c, dnq.pG)) {
            if ($$8.c() != null) {
               eda $$9 = $$8.c().<eda>a("mode", eda.e).orElseThrow();
               if ($$9 == eda.d) {
                  this.a($$8.c().b("metadata", ""), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (ewp.d $$11 : this.b.a(this.d, this.c, dnq.pH)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().b("final_state", "minecraft:air");
               ebq $$13 = dnq.a.m();

               try {
                  $$13 = gf.a($$0.a(mi.i), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, iw var2, dla var3, bai var4, esf var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dui a() {
      return this.c.d();
   }

   public ewp c() {
      return this.b;
   }

   public iw d() {
      return this.d;
   }

   public ewl e() {
      return this.c;
   }
}
