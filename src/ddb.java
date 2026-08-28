import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddb implements dcy {
   final Optional<dbz> c;
   final Optional<dbz> d;
   final Optional<dbz> e;
   @Nullable
   private dcc f;

   public ddb(Optional<dbz> $$0, Optional<dbz> $$1, Optional<dbz> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public cxo a(dcz $$0, js.a $$1) {
      return a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public static cxo a(js.a $$0, cxo $$1, cxo $$2, cxo $$3) {
      Optional<jq.c<dfw>> $$4 = dfx.a($$0, $$2);
      Optional<jq.c<dfy>> $$5 = dfz.a($$0, $$3);
      if ($$4.isPresent() && $$5.isPresent()) {
         dfv $$6 = $$1.a(ku.U);
         if ($$6 != null && $$6.a($$5.get(), $$4.get())) {
            return cxo.k;
         } else {
            cxo $$7 = $$1.c(1);
            $$7.b(ku.U, new dfv($$4.get(), $$5.get()));
            return $$7;
         }
      } else {
         return cxo.k;
      }
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
   public dcn<ddb> a() {
      return dcn.u;
   }

   @Override
   public dcc ap_() {
      if (this.f == null) {
         this.f = dcc.a(List.of(this.c, this.d, this.e));
      }

      return this.f;
   }

   @Override
   public List<ddi> g() {
      ddo $$0 = dbz.a(this.d);
      ddo $$1 = dbz.a(this.e);
      ddo $$2 = dbz.a(this.c);
      return List.of(new ddr($$2, $$0, $$1, new ddo.g($$0, $$1, $$2), new ddo.d(cxs.xg)));
   }

   public static class a implements dcn<ddb> {
      private static final MapCodec<ddb> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dbz.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dbz.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dbz.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, ddb::new)
      );
      public static final zt<xg, ddb> w = zt.a(dbz.b, $$0 -> $$0.c, dbz.b, $$0 -> $$0.d, dbz.b, $$0 -> $$0.e, ddb::new);

      @Override
      public MapCodec<ddb> a() {
         return x;
      }

      @Override
      public zt<xg, ddb> b() {
         return w;
      }
   }
}
