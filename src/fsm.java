import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fsm extends fnl {
   private static final Logger a = LogUtils.getLogger();
   private static final ToIntFunction<akj<dcg>> b = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.put(dcg.h, -13408734);
      $$0.put(dcg.i, -10075085);
      $$0.put(dcg.j, -8943531);
      $$0.defaultReturnValue(-2236963);
   });
   private final BooleanConsumer c;
   private final bpv q;

   @Nullable
   public static fsm a(ffw $$0, BooleanConsumer $$1, DataFixer $$2, eqk.c $$3, boolean $$4) {
      try {
         fss $$5 = $$0.x();
         ath $$6 = atk.a($$3);

         fsm var10;
         try (alh $$7 = $$5.a($$3.h(), false, $$6)) {
            eqq $$8 = $$7.d();
            jx.b $$9 = $$7.c().a();
            $$3.a($$9, $$8);
            var10 = new fsm($$1, $$2, $$3, $$8.J(), $$4, $$9);
         }

         return var10;
      } catch (Exception var13) {
         a.warn("Failed to load datapacks, can't optimize world", var13);
         return null;
      }
   }

   private fsm(BooleanConsumer $$0, DataFixer $$1, eqk.c $$2, dck $$3, boolean $$4, jx $$5) {
      super(wu.a("optimizeWorld.title", $$3.a()));
      this.c = $$0;
      this.q = new bpv($$2, $$1, $$5, $$4, false);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.c(fhu.a(wt.e, $$0 -> {
         this.q.a();
         this.c.accept(false);
      }).a(this.m / 2 - 100, this.n / 4 + 150, 200, 20).a());
   }

   @Override
   public void e() {
      if (this.q.b()) {
         this.c.accept(true);
      }
   }

   @Override
   public void d() {
      this.c.accept(false);
   }

   @Override
   public void j() {
      this.q.a();
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 20, 16777215);
      int $$4 = this.m / 2 - 150;
      int $$5 = this.m / 2 + 150;
      int $$6 = this.n / 4 + 100;
      int $$7 = $$6 + 10;
      $$0.a(this.o, this.q.h(), this.m / 2, $$6 - 9 - 2, 10526880);
      if (this.q.e() > 0) {
         $$0.a($$4 - 1, $$6 - 1, $$5 + 1, $$7 + 1, -16777216);
         $$0.b(this.o, wu.a("optimizeWorld.info.converted", this.q.f()), $$4, 40, 10526880);
         $$0.b(this.o, wu.a("optimizeWorld.info.skipped", this.q.g()), $$4, 40 + 9 + 3, 10526880);
         $$0.b(this.o, wu.a("optimizeWorld.info.total", this.q.e()), $$4, 40 + (9 + 3) * 2, 10526880);
         int $$8 = 0;

         for (akj<dcg> $$9 : this.q.c()) {
            int $$10 = ayg.d(this.q.a($$9) * (float)($$5 - $$4));
            $$0.a($$4 + $$8, $$6, $$4 + $$8 + $$10, $$7, b.applyAsInt($$9));
            $$8 += $$10;
         }

         int $$11 = this.q.f() + this.q.g();
         wu $$12 = wu.a("optimizeWorld.progress.counter", $$11, this.q.e());
         wu $$13 = wu.a("optimizeWorld.progress.percentage", ayg.d(this.q.d() * 100.0F));
         $$0.a(this.o, $$12, this.m / 2, $$6 + 2 * 9 + 2, 10526880);
         $$0.a(this.o, $$13, this.m / 2, $$6 + ($$7 - $$6) / 2 - 9 / 2, 10526880);
      }
   }
}
