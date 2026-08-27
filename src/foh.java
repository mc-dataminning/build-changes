import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class foh extends fjo {
   private static final Logger a = LogUtils.getLogger();
   private static final ToIntFunction<ajs<cyx>> b = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.put(cyx.h, -13408734);
      $$0.put(cyx.i, -10075085);
      $$0.put(cyx.j, -8943531);
      $$0.defaultReturnValue(-2236963);
   });
   private final BooleanConsumer c;
   private final bno d;

   @Nullable
   public static foh a(fbp $$0, BooleanConsumer $$1, DataFixer $$2, emr.c $$3, boolean $$4) {
      try {
         fon $$5 = $$0.x();
         asn $$6 = asq.a($$3);

         foh var10;
         try (akp $$7 = $$5.a($$3.h(), false, $$6)) {
            emx $$8 = $$7.d();
            iz.b $$9 = $$7.c().a();
            $$3.a($$9, $$8);
            var10 = new foh($$1, $$2, $$3, $$8.J(), $$4, $$9);
         }

         return var10;
      } catch (Exception var13) {
         a.warn("Failed to load datapacks, can't optimize world", var13);
         return null;
      }
   }

   private foh(BooleanConsumer $$0, DataFixer $$1, emr.c $$2, czb $$3, boolean $$4, iz $$5) {
      super(wg.a("optimizeWorld.title", $$3.a()));
      this.c = $$0;
      this.d = new bno($$2, $$1, $$5, $$4, false);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.c(fdp.a(wf.e, $$0 -> {
         this.d.a();
         this.c.accept(false);
      }).a(this.k / 2 - 100, this.l / 4 + 150, 200, 20).a());
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
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 20, 16777215);
      int $$4 = this.k / 2 - 150;
      int $$5 = this.k / 2 + 150;
      int $$6 = this.l / 4 + 100;
      int $$7 = $$6 + 10;
      $$0.a(this.m, this.d.h(), this.k / 2, $$6 - 9 - 2, 10526880);
      if (this.d.e() > 0) {
         $$0.a($$4 - 1, $$6 - 1, $$5 + 1, $$7 + 1, -16777216);
         $$0.b(this.m, wg.a("optimizeWorld.info.converted", this.d.f()), $$4, 40, 10526880);
         $$0.b(this.m, wg.a("optimizeWorld.info.skipped", this.d.g()), $$4, 40 + 9 + 3, 10526880);
         $$0.b(this.m, wg.a("optimizeWorld.info.total", this.d.e()), $$4, 40 + (9 + 3) * 2, 10526880);
         int $$8 = 0;

         for (ajs<cyx> $$9 : this.d.c()) {
            int $$10 = axk.d(this.d.a($$9) * (float)($$5 - $$4));
            $$0.a($$4 + $$8, $$6, $$4 + $$8 + $$10, $$7, b.applyAsInt($$9));
            $$8 += $$10;
         }

         int $$11 = this.d.f() + this.d.g();
         wg $$12 = wg.a("optimizeWorld.progress.counter", $$11, this.d.e());
         wg $$13 = wg.a("optimizeWorld.progress.percentage", axk.d(this.d.d() * 100.0F));
         $$0.a(this.m, $$12, this.k / 2, $$6 + 2 * 9 + 2, 10526880);
         $$0.a(this.m, $$13, this.k / 2, $$6 + ($$7 - $$6) / 2 - 9 / 2, 10526880);
      }
   }
}
