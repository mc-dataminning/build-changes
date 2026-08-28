import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dct implements dbs {
   final String c;
   final dbq d;
   final cxo e;
   final List<dbz> f;
   @Nullable
   private dcc g;

   public dct(String $$0, dbq $$1, cxo $$2, List<dbz> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public dcn<dct> a() {
      return dcn.b;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dbq c() {
      return this.d;
   }

   @Override
   public dcc ap_() {
      if (this.g == null) {
         this.g = dcc.b(this.f);
      }

      return this.g;
   }

   public boolean a(dbr $$0, dhh $$1) {
      if ($$0.e() != this.f.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.f.size() == 1 ? this.f.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cxo a(dbr $$0, js.a $$1) {
      return this.e.v();
   }

   @Override
   public List<ddi> g() {
      return List.of(new ddn(this.f.stream().map(dbz::b).toList(), new ddo.f(this.e), new ddo.d(cxs.fa)));
   }

   public static class a implements dcn<dct> {
      private static final MapCodec<dct> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dbq.e.fieldOf("category").orElse(dbq.d).forGetter($$0x -> $$0x.d),
                  cxo.c.fieldOf("result").forGetter($$0x -> $$0x.e),
                  dbz.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dct::new)
      );
      public static final zt<xg, dct> w = zt.a(zr.o, $$0 -> $$0.c, dbq.g, $$0 -> $$0.d, cxo.h, $$0 -> $$0.e, dbz.a.a(zr.a()), $$0 -> $$0.f, dct::new);

      @Override
      public MapCodec<dct> a() {
         return x;
      }

      @Override
      public zt<xg, dct> b() {
         return w;
      }
   }
}
