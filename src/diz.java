import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class diz extends dfw {
   public static final MapCodec<diz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lt.e.r().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, diz::new)
   );
   private static final Map<dfw, dfw> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final exp c = dfw.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dfw e;

   @Override
   public MapCodec<diz> a() {
      return a;
   }

   public diz(dfw $$0, dsz.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return c;
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      dta $$8 = ($$0.g() instanceof csm $$7 ? d.getOrDefault($$7.d(), dfy.a) : dfy.a).o();
      if ($$8.i()) {
         return bqs.d;
      } else if (!this.m()) {
         return bqs.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dxw.c, $$3);
         $$4.a(avy.ah);
         $$0.a(1, $$4);
         return bqs.a($$2.B);
      }
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if (this.m()) {
         return bqq.c;
      } else {
         cuo $$5 = new cuo(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dfy.fR.o(), 3);
         $$1.a($$3, dxw.c, $$2);
         return bqq.a($$1.B);
      }
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return this.m() ? super.a($$0, $$1, $$2) : new cuo(this.e);
   }

   private boolean m() {
      return this.e == dfy.a;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dfw b() {
      return this.e;
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
