import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class djb extends dhb {
   public static final MapCodec<djb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(doo.a.fieldOf("wood_type").forGetter(dhb::d), u()).apply($$0, djb::new));
   public static final dnv b = ddx.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ih, eqm> i = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         dac.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ih.d,
         dac.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ih.f,
         dac.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ih.e,
         dac.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<djb> a() {
      return a;
   }

   public djb(doo $$0, dna.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ih.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      dnb $$1 = this.o();
      eip $$2 = $$0.q().b_($$0.a());
      cxe $$3 = $$0.q();
      ib $$4 = $$0.a();
      ih[] $$5 = $$0.f();

      for (ih $$6 : $$5) {
         if ($$6.o().d()) {
            ih $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eiq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dnb $$0) {
      return $$0.c(b).p();
   }

   @Override
   public ept m(dnb $$0) {
      eqm $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, f);
   }
}
