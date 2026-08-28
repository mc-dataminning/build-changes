import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fru extends fnb {
   private static final Logger a = LogUtils.getLogger();
   private static final ToIntFunction<ald<dbw>> b = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.put(dbw.h, -13408734);
      $$0.put(dbw.i, -10075085);
      $$0.put(dbw.j, -8943531);
      $$0.defaultReturnValue(-2236963);
   });
   private final BooleanConsumer c;
   private final bqg d;

   @Nullable
   public static fru a(ffd $$0, BooleanConsumer $$1, DataFixer $$2, epu.c $$3, boolean $$4) {
      try {
         fsa $$5 = $$0.x();
         atz $$6 = auc.a($$3);

         fru var10;
         try (amb $$7 = $$5.a($$3.h(), false, $$6)) {
            eqa $$8 = $$7.d();
            jw.b $$9 = $$7.c().a();
            $$3.a($$9, $$8);
            var10 = new fru($$1, $$2, $$3, $$8.J(), $$4, $$9);
         }

         return var10;
      } catch (Exception var13) {
         a.warn("Failed to load datapacks, can't optimize world", var13);
         return null;
      }
   }

   private fru(BooleanConsumer $$0, DataFixer $$1, epu.c $$2, dca $$3, boolean $$4, jw $$5) {
      super(xo.a("optimizeWorld.title", $$3.a()));
      this.c = $$0;
      this.d = new bqg($$2, $$1, $$5, $$4, false);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.c(fhc.a(xn.e, $$0 -> {
         this.d.a();
         this.c.accept(false);
      }).a(this.n / 2 - 100, this.o / 4 + 150, 200, 20).a());
   }

   @Override
   public void e() {
      if (this.d.b()) {
         this.c.accept(true);
      }
   }

   @Override
   public void d() {
      this.c.accept(false);
   }

   @Override
   public void j() {
      this.d.a();
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
      int $$4 = this.n / 2 - 150;
      int $$5 = this.n / 2 + 150;
      int $$6 = this.o / 4 + 100;
      int $$7 = $$6 + 10;
      $$0.a(this.p, this.d.h(), this.n / 2, $$6 - 9 - 2, 10526880);
      if (this.d.e() > 0) {
         $$0.a($$4 - 1, $$6 - 1, $$5 + 1, $$7 + 1, -16777216);
         $$0.b(this.p, xo.a("optimizeWorld.info.converted", this.d.f()), $$4, 40, 10526880);
         $$0.b(this.p, xo.a("optimizeWorld.info.skipped", this.d.g()), $$4, 40 + 9 + 3, 10526880);
         $$0.b(this.p, xo.a("optimizeWorld.info.total", this.d.e()), $$4, 40 + (9 + 3) * 2, 10526880);
         int $$8 = 0;

         for (ald<dbw> $$9 : this.d.c()) {
            int $$10 = ayx.d(this.d.a($$9) * (float)($$5 - $$4));
            $$0.a($$4 + $$8, $$6, $$4 + $$8 + $$10, $$7, b.applyAsInt($$9));
            $$8 += $$10;
         }

         int $$11 = this.d.f() + this.d.g();
         xo $$12 = xo.a("optimizeWorld.progress.counter", $$11, this.d.e());
         xo $$13 = xo.a("optimizeWorld.progress.percentage", ayx.d(this.d.d() * 100.0F));
         $$0.a(this.p, $$12, this.n / 2, $$6 + 2 * 9 + 2, 10526880);
         $$0.a(this.p, $$13, this.n / 2, $$6 + ($$7 - $$6) / 2 - 9 / 2, 10526880);
      }
   }
}
