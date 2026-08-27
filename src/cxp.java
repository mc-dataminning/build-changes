import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxp extends ddp {
   public static final MapCodec<cxp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dku.a.fieldOf("wood_type").forGetter(ddp::d), u()).apply($$0, cxp::new));
   public static final dkh b = djx.ba;
   public static final djy c = djx.a;
   protected static final float d = 5.0F;
   protected static final emm e = cwq.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, emm> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         cwq.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         cwq.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         cwq.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         cwq.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<cxp> a() {
      return a;
   }

   public cxp(dku $$0, djg.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.c_($$2) instanceof die $$6) {
         cmy $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bkb.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cfi $$0, elp $$1, die $$2, cmy $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cmk && $$1.b().equals(ic.a);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ic.a, deq.b);
   }

   @Override
   public djh a(cph $$0) {
      ctp $$1 = $$0.q();
      eer $$2 = $$1.b_($$0.a());
      hx $$3 = $$0.a().c();
      djh $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(ash.az);
      ic $$6 = ic.a((double)$$0.i());
      boolean $$7 = !cwq.a($$4.k($$1, $$3), ic.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dfn.b)) {
            ic $$8 = $$4.c(dfn.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ic> $$9 = dkn.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dkn.a($$6.g()) : dkn.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == ees.c));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      emm $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   public emm b_(djh $$0, csv $$1, hx $$2) {
      return this.a($$0, $$1, $$2, ely.a());
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1 == ic.b && !this.a($$0, $$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(djh $$0) {
      return dkn.b($$0.c(b));
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return a($$2, dgx.i, die::a);
   }
}
