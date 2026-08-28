import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class doh extends dmh {
   public static final MapCodec<doh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtx.a.fieldOf("wood_type").forGetter(dmh::d), u()).apply($$0, doh::new));
   public static final dte b = djd.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jf, ewy> i = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dfh.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jf.d,
         dfh.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jf.f,
         dfh.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jf.e,
         dfh.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   public doh(dtx $$0, dsj.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, jf.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = this.o();
      eoh $$2 = $$0.q().b_($$0.a());
      dci $$3 = $$0.q();
      ja $$4 = $$0.a();
      jf[] $$5 = $$0.f();

      for (jf $$6 : $$5) {
         if ($$6.o().d()) {
            jf $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eoi.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsk $$0) {
      return $$0.c(b).p();
   }

   @Override
   public ewf m(dsk $$0) {
      ewy $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, f);
   }
}
