import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dow extends dmx {
   public static final MapCodec<dow> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dun.a.fieldOf("wood_type").forGetter(dmx::d), u()).apply($$0, dow::new));
   public static final dtu b = djs.aE;
   public static final exp c = dfw.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final exp d = dfw.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final exp e = exm.a(c, dfw.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final exp i = exm.a(d, dfw.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ji, exp> j = Maps.newEnumMap(ImmutableMap.of(ji.c, e, ji.d, e, ji.f, i, ji.e, i));

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   public dow(dun $$0, dsz.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ji.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if ($$2.c_($$3) instanceof drq $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bqs.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dta $$0, cmv $$1, ews $$2, drq $$3, cuo $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.g() instanceof cub && !this.a($$2, $$0);
   }

   private boolean a(ews $$0, dta $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected exp b_(dta $$0, dca $$1, jd $$2) {
      return this.a($$0, $$1, $$2, exb.a());
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      switch ((ji)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dta $$0, dcx $$1, jd $$2) {
      ji $$3 = $$0.c(b).h();
      ji $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dcx $$0, dta $$1, jd $$2, ji $$3) {
      dta $$4 = $$0.a_($$2);
      return $$4.a(awd.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dny.a);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dta $$1 = this.o();
      eoy $$2 = $$0.q().b_($$0.a());
      dcx $$3 = $$0.q();
      jd $$4 = $$0.a();

      for (ji $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ji $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eoz.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dta $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drd($$0, $$1);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return a($$2, dqh.i, drq::a);
   }
}
