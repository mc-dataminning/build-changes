import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddi implements ddg {
   final Optional<dch> c;
   final Optional<dch> d;
   final Optional<dch> e;
   final ddo f;
   @Nullable
   private dck g;

   public ddi(Optional<dch> $$0, Optional<dch> $$1, Optional<dch> $$2, ddo $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public cxy a(ddh $$0, ju.a $$1) {
      return this.f.a($$0.d());
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
   public dcv<ddi> a() {
      return dcv.t;
   }

   @Override
   public dck ak_() {
      if (this.g == null) {
         this.g = dck.a(List.of(this.c, this.d, this.e));
      }

      return this.g;
   }

   @Override
   public List<ddr> g() {
      return List.of(new dea(dch.a(this.c), dch.a(this.d), dch.a(this.e), this.f.a(), new ddx.d(cyc.xu)));
   }

   public static class a implements dcv<ddi> {
      private static final MapCodec<ddi> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dch.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dch.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dch.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e),
                  ddo.a.fieldOf("result").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, ddi::new)
      );
      public static final yt<wg, ddi> w = yt.a(dch.b, $$0 -> $$0.c, dch.b, $$0 -> $$0.d, dch.b, $$0 -> $$0.e, ddo.b, $$0 -> $$0.f, ddi::new);

      @Override
      public MapCodec<ddi> a() {
         return x;
      }

      @Override
      public yt<wg, ddi> b() {
         return w;
      }
   }
}
