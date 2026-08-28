import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class deg implements dee {
   final Optional<ddf> c;
   final ddf d;
   final Optional<ddf> e;
   final dem f;
   @Nullable
   private ddi g;

   public deg(Optional<ddf> $$0, ddf $$1, Optional<ddf> $$2, dem $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public cys a(def $$0, jg.a $$1) {
      return this.f.a($$0.d());
   }

   @Override
   public Optional<ddf> c() {
      return this.c;
   }

   @Override
   public ddf f() {
      return this.d;
   }

   @Override
   public Optional<ddf> k() {
      return this.e;
   }

   @Override
   public ddt<deg> a() {
      return ddt.t;
   }

   @Override
   public ddi ak_() {
      if (this.g == null) {
         this.g = ddi.a(List.of(this.c, Optional.of(this.d), this.e));
      }

      return this.g;
   }

   @Override
   public List<dep> g() {
      return List.of(new dey(ddf.a(this.c), this.d.c(), ddf.a(this.e), this.f.a(), new dev.d(cyw.xu)));
   }

   public static class a implements ddt<deg> {
      private static final MapCodec<deg> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ddf.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  ddf.d.fieldOf("base").forGetter($$0x -> $$0x.d),
                  ddf.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e),
                  dem.a.fieldOf("result").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, deg::new)
      );
      public static final yu<wh, deg> w = yu.a(ddf.b, $$0 -> $$0.c, ddf.a, $$0 -> $$0.d, ddf.b, $$0 -> $$0.e, dem.b, $$0 -> $$0.f, deg::new);

      @Override
      public MapCodec<deg> a() {
         return x;
      }

      @Override
      public yu<wh, deg> b() {
         return w;
      }
   }
}
