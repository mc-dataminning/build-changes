import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddb implements dcz {
   final Optional<dca> c;
   final Optional<dca> d;
   final Optional<dca> e;
   final cxp f;
   @Nullable
   private dcd g;

   public ddb(Optional<dca> $$0, Optional<dca> $$1, Optional<dca> $$2, cxp $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public cxp a(dda $$0, js.a $$1) {
      cxp $$2 = $$0.d().a(this.f.h(), this.f.L());
      $$2.b(this.f.e());
      return $$2;
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
   public dco<ddb> a() {
      return dco.t;
   }

   @Override
   public dcd ap_() {
      if (this.g == null) {
         this.g = dcd.a(List.of(this.c, this.d, this.e));
      }

      return this.g;
   }

   @Override
   public List<ddj> g() {
      return List.of(new dds(dca.a(this.c), dca.a(this.d), dca.a(this.e), new ddp.f(this.f), new ddp.d(cxt.xg)));
   }

   public static class a implements dco<ddb> {
      private static final MapCodec<ddb> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dca.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dca.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dca.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e),
                  cxp.c.fieldOf("result").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, ddb::new)
      );
      public static final zt<xg, ddb> w = zt.a(dca.b, $$0 -> $$0.c, dca.b, $$0 -> $$0.d, dca.b, $$0 -> $$0.e, cxp.h, $$0 -> $$0.f, ddb::new);

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
