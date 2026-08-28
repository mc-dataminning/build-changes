import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class doy extends dmz {
   public static final MapCodec<doy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dup.a.fieldOf("wood_type").forGetter(dmz::d), u()).apply($$0, doy::new));
   public static final dtw b = dju.aE;
   public static final ext c = dfy.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ext d = dfy.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ext e = exq.a(c, dfy.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ext i = exq.a(d, dfy.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ji, ext> j = Maps.newEnumMap(ImmutableMap.of(ji.c, e, ji.d, e, ji.f, i, ji.e, i));

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   public doy(dup $$0, dtb.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ji.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, eww $$6) {
      if ($$2.c_($$3) instanceof drs $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bqt.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dtc $$0, cmx $$1, eww $$2, drs $$3, cuq $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.g() instanceof cud && !this.a($$2, $$0);
   }

   private boolean a(eww $$0, dtc $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected ext b_(dtc $$0, dcc $$1, jd $$2) {
      return this.a($$0, $$1, $$2, exf.a());
   }

   @Override
   protected ext b(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      switch ((ji)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dtc $$0, dcz $$1, jd $$2) {
      ji $$3 = $$0.c(b).h();
      ji $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dcz $$0, dtc $$1, jd $$2, ji $$3) {
      dtc $$4 = $$0.a_($$2);
      return $$4.a(awe.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, doa.a);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = this.o();
      epc $$2 = $$0.q().b_($$0.a());
      dcz $$3 = $$0.q();
      jd $$4 = $$0.a();

      for (ji $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ji $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == epd.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dtc $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drf($$0, $$1);
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return a($$2, dqj.i, drs::a);
   }
}
