import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dkw extends dix {
   public static final MapCodec<dkw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqm.a.fieldOf("wood_type").forGetter(dix::d), u()).apply($$0, dkw::new));
   public static final dpt b = dft.aE;
   public static final est c = dby.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final est d = dby.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final est e = esq.a(c, dby.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final est i = esq.a(d, dby.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ih, est> j = Maps.newEnumMap(ImmutableMap.of(ih.c, e, ih.d, e, ih.f, i, ih.e, i));

   @Override
   public MapCodec<dkw> a() {
      return a;
   }

   public dkw(dqm $$0, doy.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ih.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if ($$2.c_($$3) instanceof dnp $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return boc.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(doz $$0, cjt $$1, erw $$2, dnp $$3, crj $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.f() instanceof cqw && !this.a($$2, $$0);
   }

   private boolean a(erw $$0, doz $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected est b_(doz $$0, cyd $$1, ib $$2) {
      return this.a($$0, $$1, $$2, esf.a());
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      switch ((ih)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(doz $$0, cza $$1, ib $$2) {
      ih $$3 = $$0.c(b).h();
      ih $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cza $$0, doz $$1, ib $$2, ih $$3) {
      doz $$4 = $$0.a_($$2);
      return $$4.a(avc.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, djy.a);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      doz $$1 = this.n();
      eks $$2 = $$0.q().b_($$0.a());
      cza $$3 = $$0.q();
      ib $$4 = $$0.a();

      for (ih $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ih $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == ekt.c));
            }
         }
      }

      return null;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(doz $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnc($$0, $$1);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return a($$2, dmh.i, dnp::a);
   }
}
