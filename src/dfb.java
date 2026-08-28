import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfb implements dez {
   final Optional<dea> d;
   final dea e;
   final Optional<dea> f;
   final dfh g;
   @Nullable
   private ded h;

   public dfb(Optional<dea> $$0, dea $$1, Optional<dea> $$2, dfh $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public czn a(dfa $$0, jh.a $$1) {
      return this.g.a($$0.d());
   }

   @Override
   public Optional<dea> c() {
      return this.d;
   }

   @Override
   public dea f() {
      return this.e;
   }

   @Override
   public Optional<dea> k() {
      return this.f;
   }

   @Override
   public deo<dfb> a() {
      return deo.t;
   }

   @Override
   public ded al_() {
      if (this.h == null) {
         this.h = ded.a(List.of(this.d, Optional.of(this.e), this.f));
      }

      return this.h;
   }

   @Override
   public List<dfk> g() {
      return List.of(new dft(dea.a(this.d), this.e.c(), dea.a(this.f), this.g.a(), new dfq.d(czr.xB)));
   }

   public static class a implements deo<dfb> {
      private static final MapCodec<dfb> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dea.d.optionalFieldOf("template").forGetter($$0x -> $$0x.d),
                  dea.d.fieldOf("base").forGetter($$0x -> $$0x.e),
                  dea.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.f),
                  dfh.a.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dfb::new)
      );
      public static final yw<wj, dfb> w = yw.a(dea.b, $$0 -> $$0.d, dea.a, $$0 -> $$0.e, dea.b, $$0 -> $$0.f, dfh.b, $$0 -> $$0.g, dfb::new);

      @Override
      public MapCodec<dfb> a() {
         return x;
      }

      @Override
      public yw<wj, dfb> b() {
         return w;
      }
   }
}
