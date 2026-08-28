import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class dez implements dew {
   final ddx d;
   final ddx e;
   final ddx f;
   final jf<dhz> g;
   @Nullable
   private dea h;

   public dez(ddx $$0, ddx $$1, ddx $$2, jf<dhz> $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public czk a(dex $$0, jh.a $$1) {
      return a($$1, $$0.d(), $$0.e(), this.g);
   }

   public static czk a(jh.a $$0, czk $$1, czk $$2, jf<dhz> $$3) {
      Optional<jf<dhx>> $$4 = dhy.a($$0, $$2);
      if ($$4.isPresent()) {
         dhv $$5 = $$1.a(kk.W);
         dhv $$6 = new dhv($$4.get(), $$3);
         if (Objects.equals($$5, $$6)) {
            return czk.k;
         } else {
            czk $$7 = $$1.c(1);
            $$7.b(kk.W, $$6);
            return $$7;
         }
      } else {
         return czk.k;
      }
   }

   @Override
   public Optional<ddx> c() {
      return Optional.of(this.d);
   }

   @Override
   public ddx f() {
      return this.e;
   }

   @Override
   public Optional<ddx> k() {
      return Optional.of(this.f);
   }

   @Override
   public del<dez> a() {
      return del.u;
   }

   @Override
   public dea al_() {
      if (this.h == null) {
         this.h = dea.b(List.of(this.d, this.e, this.f));
      }

      return this.h;
   }

   @Override
   public List<dfh> g() {
      dfn $$0 = this.e.c();
      dfn $$1 = this.f.c();
      dfn $$2 = this.d.c();
      return List.of(new dfq($$2, $$0, $$1, new dfn.g($$0, $$1, this.g), new dfn.d(czo.xB)));
   }

   public static class a implements del<dez> {
      private static final MapCodec<dez> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ddx.d.fieldOf("template").forGetter($$0x -> $$0x.d),
                  ddx.d.fieldOf("base").forGetter($$0x -> $$0x.e),
                  ddx.d.fieldOf("addition").forGetter($$0x -> $$0x.f),
                  dhz.c.fieldOf("pattern").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dez::new)
      );
      public static final yw<wj, dez> w = yw.a(ddx.a, $$0 -> $$0.d, ddx.a, $$0 -> $$0.e, ddx.a, $$0 -> $$0.f, dhz.d, $$0 -> $$0.g, dez::new);

      @Override
      public MapCodec<dez> a() {
         return x;
      }

      @Override
      public yw<wj, dez> b() {
         return w;
      }
   }
}
