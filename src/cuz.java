import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cuz extends day {
   public static final MapCodec<cuz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dho.a.fieldOf("wood_type").forGetter(day::d), t()).apply($$0, cuz::new));
   public static final dhb b = dgr.ba;
   public static final dgs c = dgr.a;
   protected static final float d = 5.0F;
   protected static final eiy e = cua.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, eiy> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         cua.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         cua.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         cua.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         cua.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<cuz> a() {
      return a;
   }

   public cuz(dho $$0, dga.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.c_($$2) instanceof dff $$6) {
         ckj $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bib.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(ccx $$0, eib $$1, dff $$2, ckj $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cjv && $$1.b().equals(hx.a);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), hx.a, dbz.b);
   }

   @Override
   public dgb a(cmr $$0) {
      cqz $$1 = $$0.q();
      ebe $$2 = $$1.b_($$0.a());
      ht $$3 = $$0.a().c();
      dgb $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(aqs.az);
      hx $$6 = hx.a((double)$$0.i());
      boolean $$7 = !cua.a($$4.k($$1, $$3), hx.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dcu.b)) {
            hx $$8 = $$4.c(dcu.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<hx> $$9 = dhh.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dhh.a($$6.g()) : dhh.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == ebf.c));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      eiy $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   public eiy b_(dgb $$0, cqf $$1, ht $$2) {
      return this.a($$0, $$1, $$2, eik.a());
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1 == hx.b && !this.a($$0, $$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dgb $$0) {
      return dhh.b($$0.c(b));
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new det($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return a($$2, ddz.i, dff::a);
   }
}
