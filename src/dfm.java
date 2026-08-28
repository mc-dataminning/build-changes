import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfm implements dfk {
   final Optional<del> d;
   final del e;
   final Optional<del> f;
   final dfs g;
   @Nullable
   private deo h;

   public dfm(Optional<del> $$0, del $$1, Optional<del> $$2, dfs $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public czy a(dfl $$0, jh.a $$1) {
      return this.g.a($$0.d());
   }

   @Override
   public Optional<del> c() {
      return this.d;
   }

   @Override
   public del f() {
      return this.e;
   }

   @Override
   public Optional<del> k() {
      return this.f;
   }

   @Override
   public dez<dfm> a() {
      return dez.t;
   }

   @Override
   public deo ap_() {
      if (this.h == null) {
         this.h = deo.a(List.of(this.d, Optional.of(this.e), this.f));
      }

      return this.h;
   }

   @Override
   public List<dfv> g() {
      return List.of(new dge(del.a(this.d), this.e.c(), del.a(this.f), this.g.a(), new dgb.d(dac.xB)));
   }

   public static class a implements dez<dfm> {
      private static final MapCodec<dfm> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  del.d.optionalFieldOf("template").forGetter($$0x -> $$0x.d),
                  del.d.fieldOf("base").forGetter($$0x -> $$0x.e),
                  del.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.f),
                  dfs.a.fieldOf("result").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dfm::new)
      );
      public static final yy<wl, dfm> w = yy.a(del.b, $$0 -> $$0.d, del.a, $$0 -> $$0.e, del.b, $$0 -> $$0.f, dfs.b, $$0 -> $$0.g, dfm::new);

      @Override
      public MapCodec<dfm> a() {
         return x;
      }

      @Override
      public yy<wl, dfm> b() {
         return w;
      }
   }
}
