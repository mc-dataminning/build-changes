import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcw implements dct {
   final Optional<dbv> c;
   final Optional<dbv> d;
   final Optional<dbv> e;
   @Nullable
   private dby f;

   public dcw(Optional<dbv> $$0, Optional<dbv> $$1, Optional<dbv> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public cxk a(dcu $$0, js.a $$1) {
      cxk $$2 = $$0.d();
      if (dbv.a(this.d, $$2)) {
         Optional<jq.c<dfp>> $$3 = dfq.a($$1, $$0.e());
         Optional<jq.c<dfr>> $$4 = dfs.a($$1, $$0.c());
         if ($$3.isPresent() && $$4.isPresent()) {
            dfo $$5 = $$2.a(ku.U);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cxk.k;
            }

            cxk $$6 = $$2.c(1);
            $$6.b(ku.U, new dfo($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cxk.k;
   }

   @Override
   public Optional<dbv> c() {
      return this.c;
   }

   @Override
   public Optional<dbv> f() {
      return this.d;
   }

   @Override
   public Optional<dbv> k() {
      return this.e;
   }

   @Override
   public dci<dcw> a() {
      return dci.u;
   }

   @Override
   public dby ap_() {
      if (this.f == null) {
         this.f = dby.a(List.of(this.c, this.d, this.e));
      }

      return this.f;
   }

   @Override
   public List<ddc> g() {
      return List.of(new ddk(ddi.h.c, new ddi.d(cxo.xg)));
   }

   public static class a implements dci<dcw> {
      private static final MapCodec<dcw> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dbv.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dbv.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dbv.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dcw::new)
      );
      public static final zt<xg, dcw> w = zt.a(dbv.b, $$0 -> $$0.c, dbv.b, $$0 -> $$0.d, dbv.b, $$0 -> $$0.e, dcw::new);

      @Override
      public MapCodec<dcw> a() {
         return x;
      }

      @Override
      public zt<xg, dcw> b() {
         return w;
      }
   }
}
