import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dii extends dff {
   public static final MapCodec<dii> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lq.e.r().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dii::new)
   );
   private static final Map<dff, dff> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final ews c = dff.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dff e;

   @Override
   public MapCodec<dii> a() {
      return a;
   }

   public dii(dff $$0, dsg.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return c;
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      dsh $$8 = ($$0.g() instanceof cry $$7 ? d.getOrDefault($$7.d(), dfh.a) : dfh.a).o();
      if ($$8.i()) {
         return bqf.d;
      } else if (!this.m()) {
         return bqf.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dxa.c, $$3);
         $$4.a(avp.ah);
         $$0.a(1, $$4);
         return bqf.a($$2.B);
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if (this.m()) {
         return bqd.c;
      } else {
         cua $$5 = new cua(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dfh.fR.o(), 3);
         $$1.a($$3, dxa.c, $$2);
         return bqd.a($$1.B);
      }
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return this.m() ? super.a($$0, $$1, $$2) : new cua(this.e);
   }

   private boolean m() {
      return this.e == dfh.a;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dff b() {
      return this.e;
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
