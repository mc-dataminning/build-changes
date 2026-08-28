import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dob extends dmb {
   public static final MapCodec<dob> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtr.a.fieldOf("wood_type").forGetter(dmb::d), u()).apply($$0, dob::new));
   public static final dsy b = dix.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<je, ewm> i = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dfb.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         je.d,
         dfb.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         je.f,
         dfb.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         je.e,
         dfb.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dob> a() {
      return a;
   }

   public dob(dtr $$0, dsd.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, je.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      dse $$1 = this.o();
      enx $$2 = $$0.q().b_($$0.a());
      dcd $$3 = $$0.q();
      iz $$4 = $$0.a();
      je[] $$5 = $$0.f();

      for (je $$6 : $$5) {
         if ($$6.o().d()) {
            je $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eny.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dse $$0) {
      return $$0.c(b).p();
   }

   @Override
   public evt m(dse $$0) {
      ewm $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, f);
   }
}
