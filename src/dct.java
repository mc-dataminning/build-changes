import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dct implements dcq {
   final Optional<dbr> c;
   final Optional<dbr> d;
   final Optional<dbr> e;
   @Nullable
   private dbu f;

   public dct(Optional<dbr> $$0, Optional<dbr> $$1, Optional<dbr> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public cxg a(dcr $$0, js.a $$1) {
      return a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public static cxg a(js.a $$0, cxg $$1, cxg $$2, cxg $$3) {
      Optional<jq.c<dfo>> $$4 = dfp.a($$0, $$2);
      Optional<jq.c<dfq>> $$5 = dfr.a($$0, $$3);
      if ($$4.isPresent() && $$5.isPresent()) {
         dfn $$6 = $$1.a(ku.U);
         if ($$6 != null && $$6.a($$5.get(), $$4.get())) {
            return cxg.j;
         } else {
            cxg $$7 = $$1.c(1);
            $$7.b(ku.U, new dfn($$4.get(), $$5.get()));
            return $$7;
         }
      } else {
         return cxg.j;
      }
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
   public dcf<dct> a() {
      return dcf.u;
   }

   @Override
   public dbu ap_() {
      if (this.f == null) {
         this.f = dbu.a(List.of(this.c, this.d, this.e));
      }

      return this.f;
   }

   @Override
   public List<dda> g() {
      ddg $$0 = dbr.a(this.d);
      ddg $$1 = dbr.a(this.e);
      ddg $$2 = dbr.a(this.c);
      return List.of(new ddj($$2, $$0, $$1, new ddg.g($$0, $$1, $$2), new ddg.d(cxk.xq)));
   }

   public static class a implements dcf<dct> {
      private static final MapCodec<dct> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dbr.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dbr.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dbr.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dct::new)
      );
      public static final zi<wv, dct> w = zi.a(dbr.b, $$0 -> $$0.c, dbr.b, $$0 -> $$0.d, dbr.b, $$0 -> $$0.e, dct::new);

      @Override
      public MapCodec<dct> a() {
         return x;
      }

      @Override
      public zi<wv, dct> b() {
         return w;
      }
   }
}
