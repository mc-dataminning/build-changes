import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfo implements dfm {
   final Optional<den> d;
   final den e;
   final Optional<den> f;
   final dfu g;
   @Nullable
   private deq h;

   public dfo(Optional<den> $$0, den $$1, Optional<den> $$2, dfu $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public daa a(dfn $$0, ji.a $$1) {
      return this.g.a($$0.d());
   }

   @Override
   public Optional<den> c() {
      return this.d;
   }

   @Override
   public den f() {
      return this.e;
   }

   @Override
   public Optional<den> k() {
      return this.f;
   }

   @Override
   public dfb<dfo> a() {
      return dfb.t;
   }

   @Override
   public deq ap_() {
      if (this.h == null) {
         this.h = deq.a(List.of(this.d, Optional.of(this.e), this.f));
      }

      return this.h;
   }

   @Override
   public List<dfx> g() {
      return List.of(new dgg(den.a(this.d), this.e.c(), den.a(this.f), this.g.a(), new dgd.d(dae.xB)));
   }

   public static class a implements dfb<dfo> {
      private static final MapCodec<dfo> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  den.d.optionalFieldOf("template").forGetter($$0x -> $$0x.d),
                  den.d.fieldOf("base").forGetter($$0x -> $$0x.e),
                  den.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.f),
                  dfu.a.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dfo::new)
      );
      public static final za<wn, dfo> w = za.a(den.b, $$0 -> $$0.d, den.a, $$0 -> $$0.e, den.b, $$0 -> $$0.f, dfu.b, $$0 -> $$0.g, dfo::new);

      @Override
      public MapCodec<dfo> a() {
         return x;
      }

      @Override
      public za<wn, dfo> b() {
         return w;
      }
   }
}
