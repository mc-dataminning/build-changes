import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dda implements dcy {
   final Optional<dbz> c;
   final Optional<dbz> d;
   final Optional<dbz> e;
   final cxo f;
   @Nullable
   private dcc g;

   public dda(Optional<dbz> $$0, Optional<dbz> $$1, Optional<dbz> $$2, cxo $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public cxo a(dcz $$0, js.a $$1) {
      cxo $$2 = $$0.d().a(this.f.h(), this.f.L());
      $$2.b(this.f.e());
      return $$2;
   }

   @Override
   public Optional<dbz> c() {
      return this.c;
   }

   @Override
   public Optional<dbz> f() {
      return this.d;
   }

   @Override
   public Optional<dbz> k() {
      return this.e;
   }

   @Override
   public dcn<dda> a() {
      return dcn.t;
   }

   @Override
   public dcc ap_() {
      if (this.g == null) {
         this.g = dcc.a(List.of(this.c, this.d, this.e));
      }

      return this.g;
   }

   @Override
   public List<ddi> g() {
      return List.of(new ddr(dbz.a(this.c), dbz.a(this.d), dbz.a(this.e), new ddo.f(this.f), new ddo.d(cxs.xg)));
   }

   public static class a implements dcn<dda> {
      private static final MapCodec<dda> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dbz.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dbz.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dbz.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e),
                  cxo.c.fieldOf("result").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dda::new)
      );
      public static final zt<xg, dda> w = zt.a(dbz.b, $$0 -> $$0.c, dbz.b, $$0 -> $$0.d, dbz.b, $$0 -> $$0.e, cxo.h, $$0 -> $$0.f, dda::new);

      @Override
      public MapCodec<dda> a() {
         return x;
      }

      @Override
      public zt<xg, dda> b() {
         return w;
      }
   }
}
