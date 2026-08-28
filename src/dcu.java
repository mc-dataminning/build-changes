import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dcu implements dbt {
   final String c;
   final dbr d;
   final cxp e;
   final List<dca> f;
   @Nullable
   private dcd g;

   public dcu(String $$0, dbr $$1, cxp $$2, List<dca> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public dco<dcu> a() {
      return dco.b;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dbr c() {
      return this.d;
   }

   @Override
   public dcd ap_() {
      if (this.g == null) {
         this.g = dcd.b(this.f);
      }

      return this.g;
   }

   public boolean a(dbs $$0, dhi $$1) {
      if ($$0.e() != this.f.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.f.size() == 1 ? this.f.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cxp a(dbs $$0, js.a $$1) {
      return this.e.v();
   }

   @Override
   public List<ddj> g() {
      return List.of(new ddo(this.f.stream().map(dca::b).toList(), new ddp.f(this.e), new ddp.d(cxt.fa)));
   }

   public static class a implements dco<dcu> {
      private static final MapCodec<dcu> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dbr.e.fieldOf("category").orElse(dbr.d).forGetter($$0x -> $$0x.d),
                  cxp.c.fieldOf("result").forGetter($$0x -> $$0x.e),
                  dca.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dcu::new)
      );
      public static final zt<xg, dcu> w = zt.a(zr.o, $$0 -> $$0.c, dbr.g, $$0 -> $$0.d, cxp.h, $$0 -> $$0.e, dca.a.a(zr.a()), $$0 -> $$0.f, dcu::new);

      @Override
      public MapCodec<dcu> a() {
         return x;
      }

      @Override
      public zt<xg, dcu> b() {
         return w;
      }
   }
}
