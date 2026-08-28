import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dik extends dfh {
   public static final MapCodec<dik> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lq.e.r().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dik::new)
   );
   private static final Map<dfh, dfh> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final ewy c = dfh.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dfh e;

   @Override
   public MapCodec<dik> a() {
      return a;
   }

   public dik(dfh $$0, dsj.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return c;
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      dsk $$8 = ($$0.g() instanceof csb $$7 ? d.getOrDefault($$7.d(), dfj.a) : dfj.a).o();
      if ($$8.i()) {
         return bqi.d;
      } else if (!this.m()) {
         return bqi.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dxg.c, $$3);
         $$4.a(avr.ah);
         $$0.a(1, $$4);
         return bqi.a($$2.B);
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if (this.m()) {
         return bqg.c;
      } else {
         cuc $$5 = new cuc(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dfj.fR.o(), 3);
         $$1.a($$3, dxg.c, $$2);
         return bqg.a($$1.B);
      }
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return this.m() ? super.a($$0, $$1, $$2) : new cuc(this.e);
   }

   private boolean m() {
      return this.e == dfj.a;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dfh b() {
      return this.e;
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
