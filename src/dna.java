import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dna extends dla {
   public static final MapCodec<dna> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dsq.a.fieldOf("wood_type").forGetter(dla::d), u()).apply($$0, dna::new));
   public static final drx b = dhw.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<it, evf> i = Maps.newEnumMap(
      ImmutableMap.of(
         it.c,
         dea.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         it.d,
         dea.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         it.f,
         dea.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         it.e,
         dea.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   public dna(dsq $$0, drc.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, it.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      drd $$1 = this.n();
      emw $$2 = $$0.q().b_($$0.a());
      dbc $$3 = $$0.q();
      io $$4 = $$0.a();
      it[] $$5 = $$0.f();

      for (it $$6 : $$5) {
         if ($$6.o().d()) {
            it $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == emx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(drd $$0) {
      return $$0.c(b).p();
   }

   @Override
   public eum m(drd $$0) {
      evf $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, f);
   }
}
