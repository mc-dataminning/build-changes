import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgw extends fcc {
   private static final Logger a = LogUtils.getLogger();
   private static final ToIntFunction<ags<csy>> b = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.put(csy.h, -13408734);
      $$0.put(csy.i, -10075085);
      $$0.put(csy.j, -8943531);
      $$0.defaultReturnValue(-2236963);
   });
   private final BooleanConsumer c;
   private final biz k;

   @Nullable
   public static fgw a(euk $$0, BooleanConsumer $$1, DataFixer $$2, efu.c $$3, boolean $$4) {
      try {
         fhc $$5 = $$0.w();
         apd $$6 = apg.a($$3);

         fgw var10;
         try (ahp $$7 = $$5.a($$3.f(), false, $$6)) {
            ega $$8 = $$7.d();
            is.b $$9 = $$7.c().a();
            $$3.a($$9, $$8);
            var10 = new fgw($$1, $$2, $$3, $$8.L(), $$4, $$9.d(kc.aM));
         }

         return var10;
      } catch (Exception var13) {
         a.warn("Failed to load datapacks, can't optimize world", var13);
         return null;
      }
   }

   private fgw(BooleanConsumer $$0, DataFixer $$1, efu.c $$2, ctc $$3, boolean $$4, ir<dlz> $$5) {
      super(vb.a("optimizeWorld.title", $$3.a()));
      this.c = $$0;
      this.k = new biz($$2, $$1, $$5, $$4);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.d(ewh.a(va.e, $$0 -> {
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
   public void aF_() {
      this.c.accept(false);
   }

   @Override
   public void aG_() {
      this.k.a();
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      int $$4 = this.g / 2 - 150;
      int $$5 = this.g / 2 + 150;
      int $$6 = this.h / 4 + 100;
      int $$7 = $$6 + 10;
      $$0.a(this.i, this.k.h(), this.g / 2, $$6 - 9 - 2, 10526880);
      if (this.k.e() > 0) {
         $$0.a($$4 - 1, $$6 - 1, $$5 + 1, $$7 + 1, -16777216);
         $$0.b(this.i, vb.a("optimizeWorld.info.converted", this.k.f()), $$4, 40, 10526880);
         $$0.b(this.i, vb.a("optimizeWorld.info.skipped", this.k.g()), $$4, 40 + 9 + 3, 10526880);
         $$0.b(this.i, vb.a("optimizeWorld.info.total", this.k.e()), $$4, 40 + (9 + 3) * 2, 10526880);
         int $$8 = 0;

         for (ags<csy> $$9 : this.k.c()) {
            int $$10 = aty.d(this.k.a($$9) * (float)($$5 - $$4));
            $$0.a($$4 + $$8, $$6, $$4 + $$8 + $$10, $$7, b.applyAsInt($$9));
            $$8 += $$10;
         }

         int $$11 = this.k.f() + this.k.g();
         vb $$12 = vb.a("optimizeWorld.progress.counter", $$11, this.k.e());
         vb $$13 = vb.a("optimizeWorld.progress.percentage", aty.d(this.k.d() * 100.0F));
         $$0.a(this.i, $$12, this.g / 2, $$6 + 2 * 9 + 2, 10526880);
         $$0.a(this.i, $$13, this.g / 2, $$6 + ($$7 - $$6) / 2 - 9 / 2, 10526880);
      }
   }
}
