import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dcv extends day {
   public static final MapCodec<dcv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dho.a.fieldOf("wood_type").forGetter(day::d), t()).apply($$0, dcv::new));
   public static final dgv b = cxu.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<hx, eiy> i = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cua.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         hx.d,
         cua.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         hx.f,
         cua.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         hx.e,
         cua.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dcv> a() {
      return a;
   }

   public dcv(dho $$0, dga.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, hx.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = this.o();
      ebe $$2 = $$0.q().b_($$0.a());
      crc $$3 = $$0.q();
      ht $$4 = $$0.a();
      hx[] $$5 = $$0.f();

      for (hx $$6 : $$5) {
         if ($$6.o().d()) {
            hx $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == ebf.c));
            }
         }
      }

      return null;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dgb $$0) {
      return $$0.c(b).p();
   }

   @Override
   public eif h(dgb $$0) {
      eiy $$1 = i.get($$0.c(b));
      return $$1.a().f();
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
}
