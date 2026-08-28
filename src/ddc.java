import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddc implements dcz {
   final Optional<dca> c;
   final Optional<dca> d;
   final Optional<dca> e;
   @Nullable
   private dcd f;

   public ddc(Optional<dca> $$0, Optional<dca> $$1, Optional<dca> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public cxp a(dda $$0, js.a $$1) {
      return a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public static cxp a(js.a $$0, cxp $$1, cxp $$2, cxp $$3) {
      Optional<jq.c<dfx>> $$4 = dfy.a($$0, $$2);
      Optional<jq.c<dfz>> $$5 = dga.a($$0, $$3);
      if ($$4.isPresent() && $$5.isPresent()) {
         dfw $$6 = $$1.a(ku.U);
         if ($$6 != null && $$6.a($$5.get(), $$4.get())) {
            return cxp.j;
         } else {
            cxp $$7 = $$1.c(1);
            $$7.b(ku.U, new dfw($$4.get(), $$5.get()));
            return $$7;
         }
      } else {
         return cxp.j;
      }
   }

   @Override
   public Optional<dca> c() {
      return this.c;
   }

   @Override
   public Optional<dca> f() {
      return this.d;
   }

   @Override
   public Optional<dca> k() {
      return this.e;
   }

   @Override
   public dco<ddc> a() {
      return dco.u;
   }

   @Override
   public dcd ap_() {
      if (this.f == null) {
         this.f = dcd.a(List.of(this.c, this.d, this.e));
      }

      return this.f;
   }

   @Override
   public List<ddj> g() {
      ddp $$0 = dca.a(this.d);
      ddp $$1 = dca.a(this.e);
      ddp $$2 = dca.a(this.c);
      return List.of(new dds($$2, $$0, $$1, new ddp.g($$0, $$1, $$2), new ddp.d(cxt.xg)));
   }

   public static class a implements dco<ddc> {
      private static final MapCodec<ddc> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dca.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dca.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dca.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, ddc::new)
      );
      public static final zt<xg, ddc> w = zt.a(dca.b, $$0 -> $$0.c, dca.b, $$0 -> $$0.d, dca.b, $$0 -> $$0.e, ddc::new);

      @Override
      public MapCodec<ddc> a() {
         return x;
      }

      @Override
      public zt<xg, ddc> b() {
         return w;
      }
   }
}
