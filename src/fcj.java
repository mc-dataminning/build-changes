import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcj extends exv {
   private static final Logger a = LogUtils.getLogger();
   private static final Object2IntMap<aeo<cpk>> b = ac.a(new Object2IntOpenCustomHashMap(ac.k()), $$0 -> {
      $$0.put(cpk.h, -13408734);
      $$0.put(cpk.i, -10075085);
      $$0.put(cpk.j, -8943531);
      $$0.defaultReturnValue(-2236963);
   });
   private final BooleanConsumer c;
   private final bgc k;

   @Nullable
   public static fcj a(eqn $$0, BooleanConsumer $$1, DataFixer $$2, ebv.c $$3, boolean $$4) {
      try {
         fcj var8;
         try (afk $$5 = $$0.w().a($$3, false)) {
            ecb $$6 = $$5.d();
            ht.b $$7 = $$5.c().a();
            $$3.a($$7, $$6);
            var8 = new fcj($$1, $$2, $$3, $$6.L(), $$4, $$7.d(jd.aI));
         }

         return var8;
      } catch (Exception var11) {
         a.warn("Failed to load datapacks, can't optimize world", var11);
         return null;
      }
   }

   private fcj(BooleanConsumer $$0, DataFixer $$1, ebv.c $$2, cpo $$3, boolean $$4, hs<dii> $$5) {
      super(te.a("optimizeWorld.title", $$3.a()));
      this.c = $$0;
      this.k = new bgc($$2, $$1, $$5, $$4);
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.d(esi.a(td.e, $$0 -> {
         this.k.a();
         this.c.accept(false);
      }).a(this.g / 2 - 100, this.h / 4 + 150, 200, 20).a());
   }

   @Override
   public void c() {
      if (this.k.b()) {
         this.c.accept(true);
      }
   }

   @Override
   public void au_() {
      this.c.accept(false);
   }

   @Override
   public void h() {
      this.k.a();
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      int $$4 = this.g / 2 - 150;
      int $$5 = this.g / 2 + 150;
      int $$6 = this.h / 4 + 100;
      int $$7 = $$6 + 10;
      $$0.a(this.i, this.k.h(), this.g / 2, $$6 - 9 - 2, 10526880);
      if (this.k.e() > 0) {
         $$0.a($$4 - 1, $$6 - 1, $$5 + 1, $$7 + 1, -16777216);
         $$0.b(this.i, te.a("optimizeWorld.info.converted", this.k.f()), $$4, 40, 10526880);
         $$0.b(this.i, te.a("optimizeWorld.info.skipped", this.k.g()), $$4, 40 + 9 + 3, 10526880);
         $$0.b(this.i, te.a("optimizeWorld.info.total", this.k.e()), $$4, 40 + (9 + 3) * 2, 10526880);
         int $$8 = 0;

         for (aeo<cpk> $$9 : this.k.c()) {
            int $$10 = aro.d(this.k.a($$9) * (float)($$5 - $$4));
            $$0.a($$4 + $$8, $$6, $$4 + $$8 + $$10, $$7, b.getInt($$9));
            $$8 += $$10;
         }

         int $$11 = this.k.f() + this.k.g();
         $$0.a(this.i, $$11 + " / " + this.k.e(), this.g / 2, $$6 + 2 * 9 + 2, 10526880);
         $$0.a(this.i, aro.d(this.k.d() * 100.0F) + "%", this.g / 2, $$6 + ($$7 - $$6) / 2 - 9 / 2, 10526880);
      }
   }
}
