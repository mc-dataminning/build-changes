import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddj implements ddg {
   final Optional<dch> c;
   final Optional<dch> d;
   final Optional<dch> e;
   @Nullable
   private dck f;

   public ddj(Optional<dch> $$0, Optional<dch> $$1, Optional<dch> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public cxy a(ddh $$0, ju.a $$1) {
      return a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public static cxy a(ju.a $$0, cxy $$1, cxy $$2, cxy $$3) {
      Optional<js.c<dgf>> $$4 = dgg.a($$0, $$2);
      Optional<js.c<dgh>> $$5 = dgi.a($$0, $$3);
      if ($$4.isPresent() && $$5.isPresent()) {
         dge $$6 = $$1.a(kx.W);
         if ($$6 != null && $$6.a($$5.get(), $$4.get())) {
            return cxy.k;
         } else {
            cxy $$7 = $$1.c(1);
            $$7.b(kx.W, new dge($$4.get(), $$5.get()));
            return $$7;
         }
      } else {
         return cxy.k;
      }
   }

   @Override
   public Optional<dch> c() {
      return this.c;
   }

   @Override
   public Optional<dch> f() {
      return this.d;
   }

   @Override
   public Optional<dch> k() {
      return this.e;
   }

   @Override
   public dcv<ddj> a() {
      return dcv.u;
   }

   @Override
   public dck ak_() {
      if (this.f == null) {
         this.f = dck.a(List.of(this.c, this.d, this.e));
      }

      return this.f;
   }

   @Override
   public List<ddr> g() {
      ddx $$0 = dch.a(this.d);
      ddx $$1 = dch.a(this.e);
      ddx $$2 = dch.a(this.c);
      return List.of(new dea($$2, $$0, $$1, new ddx.g($$0, $$1, $$2), new ddx.d(cyc.xu)));
   }

   public static class a implements dcv<ddj> {
      private static final MapCodec<ddj> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dch.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dch.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dch.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, ddj::new)
      );
      public static final yt<wg, ddj> w = yt.a(dch.b, $$0 -> $$0.c, dch.b, $$0 -> $$0.d, dch.b, $$0 -> $$0.e, ddj::new);

      @Override
      public MapCodec<ddj> a() {
         return x;
      }

      @Override
      public yt<wg, ddj> b() {
         return w;
      }
   }
}
