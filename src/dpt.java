import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dpt extends dmm {
   public static final MapCodec<dpt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("potted").forGetter($$0x -> $$0x.d), t()).apply($$0, dpt::new)
   );
   private static final Map<dmm, dmm> b = Maps.newHashMap();
   private static final ffr c = dmm.b(6.0, 0.0, 6.0);
   private final dmm d;

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   public dpt(dmm $$0, ean.d $$1) {
      super($$1);
      this.d = $$0;
      b.put($$0, this);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c;
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      eao $$8 = ($$0.h() instanceof cxs $$7 ? b.getOrDefault($$7.c(), dmo.a) : dmo.a).m();
      if ($$8.l()) {
         return bug.f;
      } else if (!this.q()) {
         return bug.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, efo.c, $$3);
         $$4.a(awx.ah);
         $$0.a(1, $$4);
         return bug.a;
      }
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (this.q()) {
         return bug.c;
      } else {
         czk $$5 = new czk(this.d);
         if (!$$3.h($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dmo.gq.m(), 3);
         $$1.a($$3, efo.c, $$2);
         return bug.a;
      }
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new czk(this.d);
   }

   private boolean q() {
      return this.d == dmo.a;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4 == jb.a && !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dmm b() {
      return this.d;
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   @Override
   protected boolean f(eao $$0) {
      return $$0.a(dmo.uj) || $$0.a(dmo.uk);
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (this.f($$0) && $$1.B_().j()) {
         boolean $$4 = this.d == dmo.uh;
         boolean $$5 = doi.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dph.a $$6 = dph.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), awo.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public eao o(eao $$0) {
      if ($$0.a(dmo.uj)) {
         return dmo.uk.m();
      } else {
         return $$0.a(dmo.uk) ? dmo.uj.m() : $$0;
      }
   }
}
