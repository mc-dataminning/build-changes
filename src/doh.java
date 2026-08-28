import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class doh extends dmi {
   public static final MapCodec<doh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dty.a.fieldOf("wood_type").forGetter(dmi::d), u()).apply($$0, doh::new));
   public static final dtf b = dje.aE;
   public static final exa c = dfi.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final exa d = dfi.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final exa e = ewx.a(c, dfi.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final exa i = ewx.a(d, dfi.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jf, exa> j = Maps.newEnumMap(ImmutableMap.of(jf.c, e, jf.d, e, jf.f, i, jf.e, i));

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   public doh(dty $$0, dsk.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, jf.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if ($$2.c_($$3) instanceof drb $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bqj.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dsl $$0, cml $$1, ewd $$2, drb $$3, cud $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.g() instanceof ctq && !this.a($$2, $$0);
   }

   private boolean a(ewd $$0, dsl $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected exa b_(dsl $$0, dbm $$1, ja $$2) {
      return this.a($$0, $$1, $$2, ewm.a());
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      switch ((jf)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dsl $$0, dcj $$1, ja $$2) {
      jf $$3 = $$0.c(b).h();
      jf $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dcj $$0, dsl $$1, ja $$2, jf $$3) {
      dsl $$4 = $$0.a_($$2);
      return $$4.a(avw.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dnj.a);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = this.o();
      eoj $$2 = $$0.q().b_($$0.a());
      dcj $$3 = $$0.q();
      ja $$4 = $$0.a();

      for (jf $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jf $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eok.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsl $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqo($$0, $$1);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return a($$2, dps.i, drb::a);
   }
}
