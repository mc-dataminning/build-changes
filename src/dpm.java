import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dpm extends dmf {
   public static final MapCodec<dpm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.e.q().fieldOf("potted").forGetter($$0x -> $$0x.d), t()).apply($$0, dpm::new)
   );
   private static final Map<dmf, dmf> b = Maps.newHashMap();
   private static final ffk c = dmf.b(6.0, 0.0, 6.0);
   private final dmf d;

   @Override
   public MapCodec<dpm> a() {
      return a;
   }

   public dpm(dmf $$0, eag.d $$1) {
      super($$1);
      this.d = $$0;
      b.put($$0, this);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c;
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      eah $$8 = ($$0.h() instanceof cxl $$7 ? b.getOrDefault($$7.c(), dmh.a) : dmh.a).m();
      if ($$8.l()) {
         return bud.f;
      } else if (!this.q()) {
         return bud.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, efh.c, $$3);
         $$4.a(awx.ah);
         $$0.a(1, $$4);
         return bud.a;
      }
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (this.q()) {
         return bud.c;
      } else {
         czd $$5 = new czd(this.d);
         if (!$$3.h($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dmh.gq.m(), 3);
         $$1.a($$3, efh.c, $$2);
         return bud.a;
      }
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new czd(this.d);
   }

   private boolean q() {
      return this.d == dmh.a;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dmf b() {
      return this.d;
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   @Override
   protected boolean f(eah $$0) {
      return $$0.a(dmh.uj) || $$0.a(dmh.uk);
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (this.f($$0) && $$1.B_().j()) {
         boolean $$4 = this.d == dmh.uh;
         boolean $$5 = dob.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dpa.a $$6 = dpa.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), awo.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public eah o(eah $$0) {
      if ($$0.a(dmh.uj)) {
         return dmh.uk.m();
      } else {
         return $$0.a(dmh.uk) ? dmh.uj.m() : $$0;
      }
   }
}
