import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dls extends diq {
   public static final MapCodec<dls> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lz.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, dls::new)
   );
   private static final Map<diq, diq> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final fas c = diq.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final diq e;

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   public dls(diq $$0, dvu.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return c;
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      dvv $$8 = ($$0.h() instanceof cus $$7 ? d.getOrDefault($$7.d(), dis.a) : dis.a).m();
      if ($$8.l()) {
         return bsk.f;
      } else if (!this.q()) {
         return bsk.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, ear.c, $$3);
         $$4.a(awx.ah);
         $$0.a(1, $$4);
         return bsk.a;
      }
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (this.q()) {
         return bsk.c;
      } else {
         cwm $$5 = new cwm(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dis.fR.m(), 3);
         $$1.a($$3, ear.c, $$2);
         return bsk.a;
      }
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return this.q() ? super.a($$0, $$1, $$2) : new cwm(this.e);
   }

   private boolean q() {
      return this.e == dis.a;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public diq b() {
      return this.e;
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
