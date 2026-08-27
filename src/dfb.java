import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfb extends dby {
   public static final MapCodec<dfb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kr.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dfb::new)
   );
   private static final Map<dby, dby> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final est c = dby.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dby e;

   @Override
   public MapCodec<dfb> a() {
      return a;
   }

   public dfb(dby $$0, doy.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return c;
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      doz $$8 = ($$0.f() instanceof cph $$7 ? d.getOrDefault($$7.d(), dca.a) : dca.a).n();
      if ($$8.i()) {
         return boc.d;
      } else if (!this.k()) {
         return boc.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dts.c, $$3);
         $$4.a(auw.ah);
         $$0.a(1, $$4);
         return boc.a($$2.B);
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if (this.k()) {
         return boa.b;
      } else {
         crj $$5 = new crj(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dca.fR.n(), 3);
         $$1.a($$3, dts.c, $$2);
         return boa.a($$1.B);
      }
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return this.k() ? super.a($$0, $$1, $$2) : new crj(this.e);
   }

   private boolean k() {
      return this.e == dca.a;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dby b() {
      return this.e;
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
