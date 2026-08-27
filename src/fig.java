import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fig extends fdm {
   private static final Logger a = LogUtils.getLogger();
   private static final ToIntFunction<ahg<ctx>> b = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.put(ctx.h, -13408734);
      $$0.put(ctx.i, -10075085);
      $$0.put(ctx.j, -8943531);
      $$0.defaultReturnValue(-2236963);
   });
   private final BooleanConsumer c;
   private final bjq k;

   @Nullable
   public static fig a(evr $$0, BooleanConsumer $$1, DataFixer $$2, egv.c $$3, boolean $$4) {
      try {
         fim $$5 = $$0.w();
         apu $$6 = apx.a($$3);

         fig var10;
         try (aid $$7 = $$5.a($$3.f(), false, $$6)) {
            ehb $$8 = $$7.d();
            iu.b $$9 = $$7.c().a();
            $$3.a($$9, $$8);
            var10 = new fig($$1, $$2, $$3, $$8.L(), $$4, $$9.d(ke.aN));
         }

         return var10;
      } catch (Exception var13) {
         a.warn("Failed to load datapacks, can't optimize world", var13);
         return null;
      }
   }

   private fig(BooleanConsumer $$0, DataFixer $$1, egv.c $$2, cub $$3, boolean $$4, it<dmz> $$5) {
      super(vg.a("optimizeWorld.title", $$3.a()));
      this.c = $$0;
      this.k = new bjq($$2, $$1, $$5, $$4);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.d(exr.a(vf.e, $$0 -> {
         this.k.a();
         this.c.accept(false);
      }).a(this.g / 2 - 100, this.h / 4 + 150, 200, 20).a());
   }

   @Override
   public void e() {
      if (this.k.b()) {
         this.c.accept(true);
      }
   }

   @Override
   public void d() {
      this.c.accept(false);
   }

   @Override
   public void k() {
      this.k.a();
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      int $$4 = this.g / 2 - 150;
      int $$5 = this.g / 2 + 150;
      int $$6 = this.h / 4 + 100;
      int $$7 = $$6 + 10;
      $$0.a(this.i, this.k.h(), this.g / 2, $$6 - 9 - 2, 10526880);
      if (this.k.e() > 0) {
         $$0.a($$4 - 1, $$6 - 1, $$5 + 1, $$7 + 1, -16777216);
         $$0.b(this.i, vg.a("optimizeWorld.info.converted", this.k.f()), $$4, 40, 10526880);
         $$0.b(this.i, vg.a("optimizeWorld.info.skipped", this.k.g()), $$4, 40 + 9 + 3, 10526880);
         $$0.b(this.i, vg.a("optimizeWorld.info.total", this.k.e()), $$4, 40 + (9 + 3) * 2, 10526880);
         int $$8 = 0;

         for (ahg<ctx> $$9 : this.k.c()) {
            int $$10 = aup.d(this.k.a($$9) * (float)($$5 - $$4));
            $$0.a($$4 + $$8, $$6, $$4 + $$8 + $$10, $$7, b.applyAsInt($$9));
            $$8 += $$10;
         }

         int $$11 = this.k.f() + this.k.g();
         vg $$12 = vg.a("optimizeWorld.progress.counter", $$11, this.k.e());
         vg $$13 = vg.a("optimizeWorld.progress.percentage", aup.d(this.k.d() * 100.0F));
         $$0.a(this.i, $$12, this.g / 2, $$6 + 2 * 9 + 2, 10526880);
         $$0.a(this.i, $$13, this.g / 2, $$6 + ($$7 - $$6) / 2 - 9 / 2, 10526880);
      }
   }
}
