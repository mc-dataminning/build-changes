import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcs implements dcq {
   final Optional<dbr> c;
   final Optional<dbr> d;
   final Optional<dbr> e;
   final cxg f;
   @Nullable
   private dbu g;

   public dcs(Optional<dbr> $$0, Optional<dbr> $$1, Optional<dbr> $$2, cxg $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public cxg a(dcr $$0, js.a $$1) {
      cxg $$2 = $$0.d().a(this.f.h(), this.f.M());
      $$2.b(this.f.e());
      return $$2;
   }

   @Override
   public Optional<dbr> c() {
      return this.c;
   }

   @Override
   public Optional<dbr> f() {
      return this.d;
   }

   @Override
   public Optional<dbr> k() {
      return this.e;
   }

   @Override
   public dcf<dcs> a() {
      return dcf.t;
   }

   @Override
   public dbu ap_() {
      if (this.g == null) {
         this.g = dbu.a(List.of(this.c, this.d, this.e));
      }

      return this.g;
   }

   @Override
   public List<dda> g() {
      return List.of(new ddj(dbr.a(this.c), dbr.a(this.d), dbr.a(this.e), new ddg.f(this.f), new ddg.d(cxk.xq)));
   }

   public static class a implements dcf<dcs> {
      private static final MapCodec<dcs> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dbr.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dbr.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dbr.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e),
                  cxg.c.fieldOf("result").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dcs::new)
      );
      public static final zi<wv, dcs> w = zi.a(dbr.b, $$0 -> $$0.c, dbr.b, $$0 -> $$0.d, dbr.b, $$0 -> $$0.e, cxg.h, $$0 -> $$0.f, dcs::new);

      @Override
      public MapCodec<dcs> a() {
         return x;
      }

      @Override
      public zi<wv, dcs> b() {
         return w;
      }
   }
}
