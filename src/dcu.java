import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dcu extends day {
   public static final MapCodec<dcu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dho.a.fieldOf("wood_type").forGetter(day::d), t()).apply($$0, dcu::new));
   public static final dgv b = cxu.aE;
   public static final eiy c = cua.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final eiy d = cua.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final eiy e = eiv.a(c, cua.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final eiy i = eiv.a(d, cua.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<hx, eiy> j = Maps.newEnumMap(ImmutableMap.of(hx.c, e, hx.d, e, hx.f, i, hx.e, i));

   @Override
   public MapCodec<dcu> a() {
      return a;
   }

   public dcu(dho $$0, dga.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, hx.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.c_($$2) instanceof dff $$6) {
         ckj $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bib.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dgb $$0, ccx $$1, eib $$2, dff $$3, ckj $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cjv && !this.a($$2, $$0);
   }

   private boolean a(eib $$0, dgb $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return j.get($$0.c(b));
   }

   @Override
   public eiy b_(dgb $$0, cqf $$1, ht $$2) {
      return this.a($$0, $$1, $$2, eik.a());
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      switch ((hx)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dgb $$0, crc $$1, ht $$2) {
      hx $$3 = $$0.c(b).h();
      hx $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(crc $$0, dgb $$1, ht $$2, hx $$3) {
      dgb $$4 = $$0.a_($$2);
      return $$4.a(aqs.ay) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dbz.a);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = this.o();
      ebe $$2 = $$0.q().b_($$0.a());
      crc $$3 = $$0.q();
      ht $$4 = $$0.a();

      for (hx $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            hx $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == ebf.c));
            }
         }
      }

      return null;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dgb $$0) {
      return $$0.c(b).p();
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, f);
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new det($$0, $$1);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return a($$2, ddz.i, dff::a);
   }
}
