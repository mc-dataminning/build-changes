import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dfv extends ddx {
   public static final MapCodec<dfv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlc.a.fieldOf("wood_type").forGetter(ddx::d), u()).apply($$0, dfv::new));
   public static final dkj b = dat.aE;
   public static final emv c = cwy.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final emv d = cwy.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final emv e = ems.a(c, cwy.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final emv i = ems.a(d, cwy.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ic, emv> j = Maps.newEnumMap(ImmutableMap.of(ic.c, e, ic.d, e, ic.f, i, ic.e, i));

   @Override
   public MapCodec<dfv> a() {
      return a;
   }

   public dfv(dlc $$0, djo.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ic.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      if ($$2.c_($$3) instanceof dim $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bke.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(djp $$0, cfq $$1, ely $$2, dim $$3, cng $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cmt && !this.a($$2, $$0);
   }

   private boolean a(ely $$0, djp $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return j.get($$0.c(b));
   }

   @Override
   public emv b_(djp $$0, ctd $$1, hx $$2) {
      return this.a($$0, $$1, $$2, emh.a());
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      switch ((ic)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(djp $$0, cua $$1, hx $$2) {
      ic $$3 = $$0.c(b).h();
      ic $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cua $$0, djp $$1, hx $$2, ic $$3) {
      djp $$4 = $$0.a_($$2);
      return $$4.a(asi.ay) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dey.a);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      djp $$1 = this.o();
      eez $$2 = $$0.q().b_($$0.a());
      cua $$3 = $$0.q();
      hx $$4 = $$0.a();

      for (ic $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ic $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == efa.c));
            }
         }
      }

      return null;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(djp $$0) {
      return $$0.c(b).p();
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dia($$0, $$1);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return a($$2, dhf.i, dim::a);
   }
}
