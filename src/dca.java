import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dca implements dby {
   final Optional<daz> c;
   final Optional<daz> d;
   final Optional<daz> e;
   final cwo f;
   @Nullable
   private dbc g;

   public dca(Optional<daz> $$0, Optional<daz> $$1, Optional<daz> $$2, cwo $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public cwo a(dbz $$0, jt.a $$1) {
      cwo $$2 = $$0.d().a(this.f.h(), this.f.M());
      $$2.b(this.f.d());
      return $$2;
   }

   @Override
   public Optional<daz> c() {
      return this.c;
   }

   @Override
   public Optional<daz> f() {
      return this.d;
   }

   @Override
   public Optional<daz> k() {
      return this.e;
   }

   @Override
   public dbn<dca> a() {
      return dbn.t;
   }

   @Override
   public dbc ao_() {
      if (this.g == null) {
         this.g = dbc.a(List.of(this.c, this.d, this.e));
      }

      return this.g;
   }

   @Override
   public List<dci> g() {
      return List.of(new dcr(daz.a(this.c), daz.a(this.d), daz.a(this.e), new dco.f(this.f), new dco.d(cws.xq)));
   }

   public static class a implements dbn<dca> {
      private static final MapCodec<dca> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  daz.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  daz.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  daz.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e),
                  cwo.c.fieldOf("result").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dca::new)
      );
      public static final yn<wa, dca> w = yn.a(daz.b, $$0 -> $$0.c, daz.b, $$0 -> $$0.d, daz.b, $$0 -> $$0.e, cwo.h, $$0 -> $$0.f, dca::new);

      @Override
      public MapCodec<dca> a() {
         return x;
      }

      @Override
      public yn<wa, dca> b() {
         return w;
      }
   }
}
