import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dmr extends djn {
   public static final MapCodec<dmr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, dmr::new)
   );
   private static final Map<djn, djn> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final fbv c = djn.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final djn e;

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   public dmr(djn $$0, dwx.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return c;
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      dwy $$8 = ($$0.h() instanceof cuw $$7 ? d.getOrDefault($$7.d(), djp.a) : djp.a).m();
      if ($$8.l()) {
         return bsl.f;
      } else if (!this.q()) {
         return bsl.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, ebu.c, $$3);
         $$4.a(awk.ah);
         $$0.a(1, $$4);
         return bsl.a;
      }
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (this.q()) {
         return bsl.c;
      } else {
         cwq $$5 = new cwq(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, djp.gm.m(), 3);
         $$1.a($$3, ebu.c, $$2);
         return bsl.a;
      }
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new cwq(this.e);
   }

   private boolean q() {
      return this.e == djp.a;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public djn b() {
      return this.e;
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   @Override
   protected boolean f(dwy $$0) {
      return $$0.a(djp.ub) || $$0.a(djp.uc);
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (this.f($$0) && $$1.G_().j()) {
         boolean $$4 = this.e == djp.tZ;
         boolean $$5 = dli.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dmh.a $$6 = dmh.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), awb.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public dwy o(dwy $$0) {
      if ($$0.a(djp.ub)) {
         return djp.uc.m();
      } else {
         return $$0.a(djp.uc) ? djp.ub.m() : $$0;
      }
   }
}
