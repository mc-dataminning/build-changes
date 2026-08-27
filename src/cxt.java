import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class cxt extends czb {
   public static final MapCodec<cxt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aix.a(kg.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               aix.a(kg.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               aix.a(kg.F).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, cxt::new)
   );
   public static final dmd b = dcn.aE;
   protected static final float c = 2.0F;
   private static final Map<ie, eos> d = Maps.newEnumMap(
      ImmutableMap.of(
         ie.d,
         cys.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ie.e,
         cys.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ie.c,
         cys.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ie.f,
         cys.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final aix<cys> e;
   private final aix<cys> f;
   private final aix<coy> g;

   @Override
   public MapCodec<cxt> a() {
      return a;
   }

   protected cxt(aix<cys> $$0, aix<cys> $$1, aix<coy> $$2, dli.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ie.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<cys> $$6 = $$3.I_().d(kg.f).d(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dgn.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return $$0.a(cyu.cC);
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return new cpd((cvq)DataFixUtils.orElse($$0.I_().d(kg.F).d(this.g), this));
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }
}
