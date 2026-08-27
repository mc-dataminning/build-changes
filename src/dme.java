import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dme extends dke {
   public static final MapCodec<dme> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dru.a.fieldOf("wood_type").forGetter(dke::d), u()).apply($$0, dme::new));
   public static final drb b = dha.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<is, eui> i = Maps.newEnumMap(
      ImmutableMap.of(
         is.c,
         dde.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         is.d,
         dde.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         is.f,
         dde.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         is.e,
         dde.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   public dme(dru $$0, dqg.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, is.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = this.n();
      ema $$2 = $$0.q().b_($$0.a());
      dag $$3 = $$0.q();
      in $$4 = $$0.a();
      is[] $$5 = $$0.f();

      for (is $$6 : $$5) {
         if ($$6.o().d()) {
            is $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == emb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dqh $$0) {
      return $$0.c(b).p();
   }

   @Override
   public etp m(dqh $$0) {
      eui $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, f);
   }
}
