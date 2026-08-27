import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdw extends ezd {
   private static final Logger a = LogUtils.getLogger();
   private static final ToIntFunction<afv<cqz>> b = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.put(cqz.h, -13408734);
      $$0.put(cqz.i, -10075085);
      $$0.put(cqz.j, -8943531);
      $$0.defaultReturnValue(-2236963);
   });
   private final BooleanConsumer c;
   private final bhp k;

   @Nullable
   public static fdw a(ero $$0, BooleanConsumer $$1, DataFixer $$2, ecy.c $$3, boolean $$4) {
      try {
         fdw var8;
         try (agr $$5 = $$0.y().a($$3, false)) {
            ede $$6 = $$5.d();
            ip.b $$7 = $$5.c().a();
            $$3.a($$7, $$6);
            var8 = new fdw($$1, $$2, $$3, $$6.L(), $$4, $$7.d(jz.aJ));
         }

         return var8;
      } catch (Exception var11) {
         a.warn("Failed to load datapacks, can't optimize world", var11);
         return null;
      }
   }

   private fdw(BooleanConsumer $$0, DataFixer $$1, ecy.c $$2, crd $$3, boolean $$4, io<djl> $$5) {
      super(ui.a("optimizeWorld.title", $$3.a()));
      this.c = $$0;
      this.k = new bhp($$2, $$1, $$5, $$4);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.d(etj.a(uh.e, $$0 -> {
         this.k.a();
         this.c.accept(false);
      }).a(this.g / 2 - 100, this.h / 4 + 150, 200, 20).a());
   }

   @Override
   public void d() {
      if (this.k.b()) {
         this.c.accept(true);
      }
   }

   @Override
   public void aC_() {
      this.c.accept(false);
   }

   @Override
   public void aD_() {
      this.k.a();
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      int $$4 = this.g / 2 - 150;
      int $$5 = this.g / 2 + 150;
      int $$6 = this.h / 4 + 100;
      int $$7 = $$6 + 10;
      $$0.a(this.i, this.k.h(), this.g / 2, $$6 - 9 - 2, 10526880);
      if (this.k.e() > 0) {
         $$0.a($$4 - 1, $$6 - 1, $$5 + 1, $$7 + 1, -16777216);
         $$0.b(this.i, ui.a("optimizeWorld.info.converted", this.k.f()), $$4, 40, 10526880);
         $$0.b(this.i, ui.a("optimizeWorld.info.skipped", this.k.g()), $$4, 40 + 9 + 3, 10526880);
         $$0.b(this.i, ui.a("optimizeWorld.info.total", this.k.e()), $$4, 40 + (9 + 3) * 2, 10526880);
         int $$8 = 0;

         for (afv<cqz> $$9 : this.k.c()) {
            int $$10 = asy.d(this.k.a($$9) * (float)($$5 - $$4));
            $$0.a($$4 + $$8, $$6, $$4 + $$8 + $$10, $$7, b.applyAsInt($$9));
            $$8 += $$10;
         }

         int $$11 = this.k.f() + this.k.g();
         ui $$12 = ui.a("optimizeWorld.progress.counter", $$11, this.k.e());
         ui $$13 = ui.a("optimizeWorld.progress.percentage", asy.d(this.k.d() * 100.0F));
         $$0.a(this.i, $$12, this.g / 2, $$6 + 2 * 9 + 2, 10526880);
         $$0.a(this.i, $$13, this.g / 2, $$6 + ($$7 - $$6) / 2 - 9 / 2, 10526880);
      }
   }
}
