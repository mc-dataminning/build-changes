import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dfn extends ddp {
   public static final MapCodec<dfn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dku.a.fieldOf("wood_type").forGetter(ddp::d), u()).apply($$0, dfn::new));
   public static final dkb b = dal.aE;
   public static final emm c = cwq.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final emm d = cwq.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final emm e = emj.a(c, cwq.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final emm i = emj.a(d, cwq.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ic, emm> j = Maps.newEnumMap(ImmutableMap.of(ic.c, e, ic.d, e, ic.f, i, ic.e, i));

   @Override
   public MapCodec<dfn> a() {
      return a;
   }

   public dfn(dku $$0, djg.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ic.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.c_($$2) instanceof die $$6) {
         cmy $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bkb.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(djh $$0, cfi $$1, elp $$2, die $$3, cmy $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cmk && !this.a($$2, $$0);
   }

   private boolean a(elp $$0, djh $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return j.get($$0.c(b));
   }

   @Override
   public emm b_(djh $$0, csv $$1, hx $$2) {
      return this.a($$0, $$1, $$2, ely.a());
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      switch ((ic)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(djh $$0, cts $$1, hx $$2) {
      ic $$3 = $$0.c(b).h();
      ic $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cts $$0, djh $$1, hx $$2, ic $$3) {
      djh $$4 = $$0.a_($$2);
      return $$4.a(ash.ay) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, deq.a);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      djh $$1 = this.o();
      eer $$2 = $$0.q().b_($$0.a());
      cts $$3 = $$0.q();
      hx $$4 = $$0.a();

      for (ic $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ic $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == ees.c));
            }
         }
      }

      return null;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(djh $$0) {
      return $$0.c(b).p();
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhs($$0, $$1);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return a($$2, dgx.i, die::a);
   }
}
