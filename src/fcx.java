import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcx extends eyf {
   private static final Logger a = LogUtils.getLogger();
   private static final Object2IntMap<aet<cpq>> b = ac.a(new Object2IntOpenCustomHashMap(ac.k()), $$0 -> {
      $$0.put(cpq.h, -13408734);
      $$0.put(cpq.i, -10075085);
      $$0.put(cpq.j, -8943531);
      $$0.defaultReturnValue(-2236963);
   });
   private final BooleanConsumer c;
   private final bgh k;

   @Nullable
   public static fcx a(eqq $$0, BooleanConsumer $$1, DataFixer $$2, ecb.c $$3, boolean $$4) {
      try {
         fcx var8;
         try (afp $$5 = $$0.y().a($$3, false)) {
            ech $$6 = $$5.d();
            hu.b $$7 = $$5.c().a();
            $$3.a($$7, $$6);
            var8 = new fcx($$1, $$2, $$3, $$6.L(), $$4, $$7.d(je.aI));
         }

         return var8;
      } catch (Exception var11) {
         a.warn("Failed to load datapacks, can't optimize world", var11);
         return null;
      }
   }

   private fcx(BooleanConsumer $$0, DataFixer $$1, ecb.c $$2, cpu $$3, boolean $$4, ht<dio> $$5) {
      super(ti.a("optimizeWorld.title", $$3.a()));
      this.c = $$0;
      this.k = new bgh($$2, $$1, $$5, $$4);
   }

   @Override
   protected void aD_() {
      super.aD_();
      this.d(esl.a(th.e, $$0 -> {
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
   public void av_() {
      this.k.a();
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      int $$4 = this.g / 2 - 150;
      int $$5 = this.g / 2 + 150;
      int $$6 = this.h / 4 + 100;
      int $$7 = $$6 + 10;
      $$0.a(this.i, this.k.h(), this.g / 2, $$6 - 9 - 2, 10526880);
      if (this.k.e() > 0) {
         $$0.a($$4 - 1, $$6 - 1, $$5 + 1, $$7 + 1, -16777216);
         $$0.b(this.i, ti.a("optimizeWorld.info.converted", this.k.f()), $$4, 40, 10526880);
         $$0.b(this.i, ti.a("optimizeWorld.info.skipped", this.k.g()), $$4, 40 + 9 + 3, 10526880);
         $$0.b(this.i, ti.a("optimizeWorld.info.total", this.k.e()), $$4, 40 + (9 + 3) * 2, 10526880);
         int $$8 = 0;

         for (aet<cpq> $$9 : this.k.c()) {
            int $$10 = ars.d(this.k.a($$9) * (float)($$5 - $$4));
            $$0.a($$4 + $$8, $$6, $$4 + $$8 + $$10, $$7, b.getInt($$9));
            $$8 += $$10;
         }

         int $$11 = this.k.f() + this.k.g();
         $$0.a(this.i, $$11 + " / " + this.k.e(), this.g / 2, $$6 + 2 * 9 + 2, 10526880);
         $$0.a(this.i, ars.d(this.k.d() * 100.0F) + "%", this.g / 2, $$6 + ($$7 - $$6) / 2 - 9 / 2, 10526880);
      }
   }
}
