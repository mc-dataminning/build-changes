import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dey implements dew {
   final Optional<ddx> d;
   final ddx e;
   final Optional<ddx> f;
   final dfe g;
   @Nullable
   private dea h;

   public dey(Optional<ddx> $$0, ddx $$1, Optional<ddx> $$2, dfe $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public czk a(dex $$0, jh.a $$1) {
      return this.g.a($$0.d());
   }

   @Override
   public Optional<ddx> c() {
      return this.d;
   }

   @Override
   public ddx f() {
      return this.e;
   }

   @Override
   public Optional<ddx> k() {
      return this.f;
   }

   @Override
   public del<dey> a() {
      return del.t;
   }

   @Override
   public dea al_() {
      if (this.h == null) {
         this.h = dea.a(List.of(this.d, Optional.of(this.e), this.f));
      }

      return this.h;
   }

   @Override
   public List<dfh> g() {
      return List.of(new dfq(ddx.a(this.d), this.e.c(), ddx.a(this.f), this.g.a(), new dfn.d(czo.xB)));
   }

   public static class a implements del<dey> {
      private static final MapCodec<dey> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ddx.d.optionalFieldOf("template").forGetter($$0x -> $$0x.d),
                  ddx.d.fieldOf("base").forGetter($$0x -> $$0x.e),
                  ddx.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.f),
                  dfe.a.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dey::new)
      );
      public static final yw<wj, dey> w = yw.a(ddx.b, $$0 -> $$0.d, ddx.a, $$0 -> $$0.e, ddx.b, $$0 -> $$0.f, dfe.b, $$0 -> $$0.g, dey::new);

      @Override
      public MapCodec<dey> a() {
         return x;
      }

      @Override
      public yw<wj, dey> b() {
         return w;
      }
   }
}
