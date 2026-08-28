import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class doz extends dmz {
   public static final MapCodec<doz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dup.a.fieldOf("wood_type").forGetter(dmz::d), u()).apply($$0, doz::new));
   public static final dtw b = dju.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ji, ext> i = Maps.newEnumMap(
      ImmutableMap.of(
         ji.c,
         dfy.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ji.d,
         dfy.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ji.f,
         dfy.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ji.e,
         dfy.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<doz> a() {
      return a;
   }

   public doz(dup $$0, dtb.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ji.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = this.o();
      epc $$2 = $$0.q().b_($$0.a());
      dcz $$3 = $$0.q();
      jd $$4 = $$0.a();
      ji[] $$5 = $$0.f();

      for (ji $$6 : $$5) {
         if ($$6.o().d()) {
            ji $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == epd.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dtc $$0) {
      return $$0.c(b).p();
   }

   @Override
   public exa m(dtc $$0) {
      ext $$1 = i.get($$0.c(b));
      return $$1.a().f();
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
}
