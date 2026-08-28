import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dmo extends djk {
   public static final MapCodec<dmo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, dmo::new)
   );
   private static final Map<djk, djk> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final fbs c = djk.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final djk e;

   @Override
   public MapCodec<dmo> a() {
      return a;
   }

   public dmo(djk $$0, dwu.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return c;
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      dwv $$8 = ($$0.h() instanceof cut $$7 ? d.getOrDefault($$7.d(), djm.a) : djm.a).m();
      if ($$8.l()) {
         return bsi.f;
      } else if (!this.q()) {
         return bsi.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, ebr.c, $$3);
         $$4.a(awj.ah);
         $$0.a(1, $$4);
         return bsi.a;
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (this.q()) {
         return bsi.c;
      } else {
         cwn $$5 = new cwn(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, djm.gm.m(), 3);
         $$1.a($$3, ebr.c, $$2);
         return bsi.a;
      }
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new cwn(this.e);
   }

   private boolean q() {
      return this.e == djm.a;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public djk b() {
      return this.e;
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   @Override
   protected boolean f(dwv $$0) {
      return $$0.a(djm.ub) || $$0.a(djm.uc);
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (this.f($$0) && $$1.G_().j()) {
         boolean $$4 = this.e == djm.tZ;
         boolean $$5 = dlf.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dme.a $$6 = dme.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), awa.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public dwv o(dwv $$0) {
      if ($$0.a(djm.ub)) {
         return djm.uc.m();
      } else {
         return $$0.a(djm.uc) ? djm.ub.m() : $$0;
      }
   }
}
