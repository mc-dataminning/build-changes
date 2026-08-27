import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flz extends fhf {
   private static final Logger a = LogUtils.getLogger();
   private static final ToIntFunction<ajg<cwz>> b = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.put(cwz.h, -13408734);
      $$0.put(cwz.i, -10075085);
      $$0.put(cwz.j, -8943531);
      $$0.defaultReturnValue(-2236963);
   });
   private final BooleanConsumer c;
   private final bmq k;

   @Nullable
   public static flz a(ezg $$0, BooleanConsumer $$1, DataFixer $$2, ekk.c $$3, boolean $$4) {
      try {
         fmf $$5 = $$0.x();
         arz $$6 = asc.a($$3);

         flz var10;
         try (akd $$7 = $$5.a($$3.f(), false, $$6)) {
            ekq $$8 = $$7.d();
            iz.b $$9 = $$7.c().a();
            $$3.a($$9, $$8);
            var10 = new flz($$1, $$2, $$3, $$8.J(), $$4, $$9);
         }

         return var10;
      } catch (Exception var13) {
         a.warn("Failed to load datapacks, can't optimize world", var13);
         return null;
      }
   }

   private flz(BooleanConsumer $$0, DataFixer $$1, ekk.c $$2, cxd $$3, boolean $$4, iz $$5) {
      super(vu.a("optimizeWorld.title", $$3.a()));
      this.c = $$0;
      this.k = new bmq($$2, $$1, $$5, $$4, false);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.c(fbg.a(vt.e, $$0 -> {
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
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      int $$4 = this.g / 2 - 150;
      int $$5 = this.g / 2 + 150;
      int $$6 = this.h / 4 + 100;
      int $$7 = $$6 + 10;
      $$0.a(this.i, this.k.h(), this.g / 2, $$6 - 9 - 2, 10526880);
      if (this.k.e() > 0) {
         $$0.a($$4 - 1, $$6 - 1, $$5 + 1, $$7 + 1, -16777216);
         $$0.b(this.i, vu.a("optimizeWorld.info.converted", this.k.f()), $$4, 40, 10526880);
         $$0.b(this.i, vu.a("optimizeWorld.info.skipped", this.k.g()), $$4, 40 + 9 + 3, 10526880);
         $$0.b(this.i, vu.a("optimizeWorld.info.total", this.k.e()), $$4, 40 + (9 + 3) * 2, 10526880);
         int $$8 = 0;

         for (ajg<cwz> $$9 : this.k.c()) {
            int $$10 = aww.d(this.k.a($$9) * (float)($$5 - $$4));
            $$0.a($$4 + $$8, $$6, $$4 + $$8 + $$10, $$7, b.applyAsInt($$9));
            $$8 += $$10;
         }

         int $$11 = this.k.f() + this.k.g();
         vu $$12 = vu.a("optimizeWorld.progress.counter", $$11, this.k.e());
         vu $$13 = vu.a("optimizeWorld.progress.percentage", aww.d(this.k.d() * 100.0F));
         $$0.a(this.i, $$12, this.g / 2, $$6 + 2 * 9 + 2, 10526880);
         $$0.a(this.i, $$13, this.g / 2, $$6 + ($$7 - $$6) / 2 - 9 / 2, 10526880);
      }
   }
}
