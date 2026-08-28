import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dib extends dey {
   public static final MapCodec<dib> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dib::new)
   );
   private static final Map<dey, dey> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final ewj c = dey.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dey e;

   @Override
   public MapCodec<dib> a() {
      return a;
   }

   public dib(dey $$0, dsa.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return c;
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      dsb $$8 = ($$0.g() instanceof csm $$7 ? d.getOrDefault($$7.d(), dfa.a) : dfa.a).o();
      if ($$8.i()) {
         return bqv.d;
      } else if (!this.m()) {
         return bqv.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dwu.c, $$3);
         $$4.a(awj.ah);
         $$0.a(1, $$4);
         return bqv.a($$2.B);
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if (this.m()) {
         return bqt.c;
      } else {
         cuo $$5 = new cuo(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dfa.fR.o(), 3);
         $$1.a($$3, dwu.c, $$2);
         return bqt.a($$1.B);
      }
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return this.m() ? super.a($$0, $$1, $$2) : new cuo(this.e);
   }

   private boolean m() {
      return this.e == dfa.a;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dey b() {
      return this.e;
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
