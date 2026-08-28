import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class doi extends dmi {
   public static final MapCodec<doi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dty.a.fieldOf("wood_type").forGetter(dmi::d), u()).apply($$0, doi::new));
   public static final dtf b = dje.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jf, exa> i = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dfi.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jf.d,
         dfi.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jf.f,
         dfi.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jf.e,
         dfi.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   public doi(dty $$0, dsk.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, jf.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = this.o();
      eoj $$2 = $$0.q().b_($$0.a());
      dcj $$3 = $$0.q();
      ja $$4 = $$0.a();
      jf[] $$5 = $$0.f();

      for (jf $$6 : $$5) {
         if ($$6.o().d()) {
            jf $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eok.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsl $$0) {
      return $$0.c(b).p();
   }

   @Override
   public ewh m(dsl $$0) {
      exa $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, f);
   }
}
