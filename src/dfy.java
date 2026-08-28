import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfy implements dfw {
   final Optional<dex> d;
   final dex e;
   final Optional<dex> f;
   final dge g;
   @Nullable
   private dfa h;

   public dfy(Optional<dex> $$0, dex $$1, Optional<dex> $$2, dge $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public dak a(dfx $$0, ji.a $$1) {
      return this.g.a($$0.d());
   }

   @Override
   public Optional<dex> c() {
      return this.d;
   }

   @Override
   public dex f() {
      return this.e;
   }

   @Override
   public Optional<dex> k() {
      return this.f;
   }

   @Override
   public dfl<dfy> a() {
      return dfl.t;
   }

   @Override
   public dfa al_() {
      if (this.h == null) {
         this.h = dfa.a(List.of(this.d, Optional.of(this.e), this.f));
      }

      return this.h;
   }

   @Override
   public List<dgh> g() {
      return List.of(new dgq(dex.a(this.d), this.e.c(), dex.a(this.f), this.g.a(), new dgn.d(dao.xB)));
   }

   public static class a implements dfl<dfy> {
      private static final MapCodec<dfy> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dex.d.optionalFieldOf("template").forGetter($$0x -> $$0x.d),
                  dex.d.fieldOf("base").forGetter($$0x -> $$0x.e),
                  dex.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.f),
                  dge.a.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dfy::new)
      );
      public static final ze<wp, dfy> w = ze.a(dex.b, $$0 -> $$0.d, dex.a, $$0 -> $$0.e, dex.b, $$0 -> $$0.f, dge.b, $$0 -> $$0.g, dfy::new);

      @Override
      public MapCodec<dfy> a() {
         return x;
      }

      @Override
      public ze<wp, dfy> b() {
         return w;
      }
   }
}
