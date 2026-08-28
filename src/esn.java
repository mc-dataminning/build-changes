import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class esn extends esh {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected ewf b;
   protected ewb c;
   protected iw d;

   public esn(esu $$0, int $$1, ewg $$2, alk $$3, String $$4, ewb $$5, iw $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jc.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public esn(esu $$0, ua $$1, ewg $$2, Function<alk, ewb> $$3) {
      super($$0, $$1);
      this.a(jc.c);
      this.a = $$1.b("Template", "");
      this.d = new iw($$1.b("TPX", 0), $$1.b("TPY", 0), $$1.b("TPZ", 0));
      alk $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected alk b() {
      return alk.a(this.a);
   }

   @Override
   protected void a(est $$0, ua $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (ewf.d $$8 : this.b.a(this.d, this.c, dng.pG)) {
            if ($$8.c() != null) {
               ecq $$9 = $$8.c().<ecq>a("mode", ecq.e).orElseThrow();
               if ($$9 == ecq.d) {
                  this.a($$8.c().b("metadata", ""), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (ewf.d $$11 : this.b.a(this.d, this.c, dng.pH)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().b("final_state", "minecraft:air");
               ebg $$13 = dng.a.m();

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

   protected abstract void a(String var1, iw var2, dkq var3, azz var4, erv var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dty a() {
      return this.c.d();
   }

   public ewf c() {
      return this.b;
   }

   public iw d() {
      return this.d;
   }

   public ewb e() {
      return this.c;
   }
}
