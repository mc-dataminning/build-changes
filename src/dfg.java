import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dfg extends ddi {
   public static final MapCodec<dfg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkn.a.fieldOf("wood_type").forGetter(ddi::d), u()).apply($$0, dfg::new));
   public static final dju b = dae.aE;
   public static final emf c = cwj.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final emf d = cwj.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final emf e = emc.a(c, cwj.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final emf i = emc.a(d, cwj.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ic, emf> j = Maps.newEnumMap(ImmutableMap.of(ic.c, e, ic.d, e, ic.f, i, ic.e, i));

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   public dfg(dkn $$0, diz.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ic.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.c_($$2) instanceof dhx $$6) {
         cmr $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bjv.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dja $$0, cfb $$1, eli $$2, dhx $$3, cmr $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cmd && !this.a($$2, $$0);
   }

   private boolean a(eli $$0, dja $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return j.get($$0.c(b));
   }

   @Override
   public emf b_(dja $$0, cso $$1, hx $$2) {
      return this.a($$0, $$1, $$2, elr.a());
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      switch ((ic)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dja $$0, ctl $$1, hx $$2) {
      ic $$3 = $$0.c(b).h();
      ic $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(ctl $$0, dja $$1, hx $$2, ic $$3) {
      dja $$4 = $$0.a_($$2);
      return $$4.a(asb.ay) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dej.a);
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      dja $$1 = this.o();
      eek $$2 = $$0.q().b_($$0.a());
      ctl $$3 = $$0.q();
      hx $$4 = $$0.a();

      for (ic $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ic $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eel.c));
            }
         }
      }

      return null;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dja $$0) {
      return $$0.c(b).p();
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhl($$0, $$1);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return a($$2, dgq.i, dhx::a);
   }
}
