import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dlh extends dbd {
   public static final MapCodec<dlh> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dji.a.b.fieldOf("kind").forGetter(dbd::b), u()).apply($$0, dlh::new));
   public static final dqc d = dgc.aE;
   private static final Map<ij, etc> b = Maps.newEnumMap(
      ImmutableMap.of(
         ij.c,
         dch.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ij.d,
         dch.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ij.f,
         dch.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ij.e,
         dch.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dlh> a() {
      return c;
   }

   protected dlh(dji.a $$0, dph.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(d, ij.c));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dpi a(cux $$0) {
      dpi $$1 = super.a($$0);
      cym $$2 = $$0.q();
      id $$3 = $$0.a();
      ij[] $$4 = $$0.f();

      for (ij $$5 : $$4) {
         if ($$5.o().d()) {
            ij $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
