import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class deh implements dee {
   final ddf c;
   final ddf d;
   final ddf e;
   final je<dhh> f;
   @Nullable
   private ddi g;

   public deh(ddf $$0, ddf $$1, ddf $$2, je<dhh> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public cys a(def $$0, jg.a $$1) {
      return a($$1, $$0.d(), $$0.e(), this.f);
   }

   public static cys a(jg.a $$0, cys $$1, cys $$2, je<dhh> $$3) {
      Optional<je<dhf>> $$4 = dhg.a($$0, $$2);
      if ($$4.isPresent()) {
         dhd $$5 = $$1.a(kj.W);
         dhd $$6 = new dhd($$4.get(), $$3);
         if (Objects.equals($$5, $$6)) {
            return cys.k;
         } else {
            cys $$7 = $$1.c(1);
            $$7.b(kj.W, $$6);
            return $$7;
         }
      } else {
         return cys.k;
      }
   }

   @Override
   public Optional<ddf> c() {
      return Optional.of(this.c);
   }

   @Override
   public ddf f() {
      return this.d;
   }

   @Override
   public Optional<ddf> k() {
      return Optional.of(this.e);
   }

   @Override
   public ddt<deh> a() {
      return ddt.u;
   }

   @Override
   public ddi ak_() {
      if (this.g == null) {
         this.g = ddi.b(List.of(this.c, this.d, this.e));
      }

      return this.g;
   }

   @Override
   public List<dep> g() {
      dev $$0 = this.d.c();
      dev $$1 = this.e.c();
      dev $$2 = this.c.c();
      return List.of(new dey($$2, $$0, $$1, new dev.g($$0, $$1, this.f), new dev.d(cyw.xu)));
   }

   public static class a implements ddt<deh> {
      private static final MapCodec<deh> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ddf.d.fieldOf("template").forGetter($$0x -> $$0x.c),
                  ddf.d.fieldOf("base").forGetter($$0x -> $$0x.d),
                  ddf.d.fieldOf("addition").forGetter($$0x -> $$0x.e),
                  dhh.c.fieldOf("pattern").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, deh::new)
      );
      public static final yu<wh, deh> w = yu.a(ddf.a, $$0 -> $$0.c, ddf.a, $$0 -> $$0.d, ddf.a, $$0 -> $$0.e, dhh.d, $$0 -> $$0.f, deh::new);

      @Override
      public MapCodec<deh> a() {
         return x;
      }

      @Override
      public yu<wh, deh> b() {
         return w;
      }
   }
}
