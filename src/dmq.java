import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dmq extends djm {
   public static final MapCodec<dmq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, dmq::new)
   );
   private static final Map<djm, djm> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final fbu c = djm.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final djm e;

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   public dmq(djm $$0, dww.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return c;
   }

   @Override
   protected bsj a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsi $$5, faw $$6) {
      dwx $$8 = ($$0.h() instanceof cuv $$7 ? d.getOrDefault($$7.d(), djo.a) : djo.a).m();
      if ($$8.l()) {
         return bsj.f;
      } else if (!this.q()) {
         return bsj.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, ebt.c, $$3);
         $$4.a(awk.ah);
         $$0.a(1, $$4);
         return bsj.a;
      }
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (this.q()) {
         return bsj.c;
      } else {
         cwp $$5 = new cwp(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, djo.gm.m(), 3);
         $$1.a($$3, ebt.c, $$2);
         return bsj.a;
      }
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new cwp(this.e);
   }

   private boolean q() {
      return this.e == djo.a;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public djm b() {
      return this.e;
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   @Override
   protected boolean f(dwx $$0) {
      return $$0.a(djo.ub) || $$0.a(djo.uc);
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if (this.f($$0) && $$1.G_().j()) {
         boolean $$4 = this.e == djo.tZ;
         boolean $$5 = dlh.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dmg.a $$6 = dmg.a.a($$4).d();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.f(), awb.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public dwx o(dwx $$0) {
      if ($$0.a(djo.ub)) {
         return djo.uc.m();
      } else {
         return $$0.a(djo.uc) ? djo.ub.m() : $$0;
      }
   }
}
