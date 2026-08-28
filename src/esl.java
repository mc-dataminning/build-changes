import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class esl extends esf {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected ewd b;
   protected evz c;
   protected iv d;

   public esl(ess $$0, int $$1, ewe $$2, ali $$3, String $$4, evz $$5, iv $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jb.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public esl(ess $$0, tz $$1, ewe $$2, Function<ali, evz> $$3) {
      super($$0, $$1);
      this.a(jb.c);
      this.a = $$1.b("Template", "");
      this.d = new iv($$1.b("TPX", 0), $$1.b("TPY", 0), $$1.b("TPZ", 0));
      ali $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected ali b() {
      return ali.a(this.a);
   }

   @Override
   protected void a(esr $$0, tz $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (ewd.d $$8 : this.b.a(this.d, this.c, dne.pG)) {
            if ($$8.c() != null) {
               eco $$9 = $$8.c().<eco>a("mode", eco.e).orElseThrow();
               if ($$9 == eco.d) {
                  this.a($$8.c().b("metadata", ""), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (ewd.d $$11 : this.b.a(this.d, this.c, dne.pH)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().b("final_state", "minecraft:air");
               ebe $$13 = dne.a.m();

               try {
                  $$13 = ge.a($$0.a(mh.i), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, iv var2, dko var3, azx var4, ert var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dtw a() {
      return this.c.d();
   }

   public ewd c() {
      return this.b;
   }

   public iv d() {
      return this.d;
   }

   public evz e() {
      return this.c;
   }
}
