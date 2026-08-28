import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dco implements dbp {
   final String c;
   final dbn d;
   final cxk e;
   final List<dbv> f;
   @Nullable
   private dby g;

   public dco(String $$0, dbn $$1, cxk $$2, List<dbv> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public dci<dco> a() {
      return dci.b;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dbn c() {
      return this.d;
   }

   @Override
   public dby ap_() {
      if (this.g == null) {
         this.g = dby.b(this.f);
      }

      return this.g;
   }

   public boolean a(dbo $$0, dha $$1) {
      if ($$0.e() != this.f.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.f.size() == 1 ? this.f.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cxk a(dbo $$0, js.a $$1) {
      return this.e.v();
   }

   @Override
   public List<ddc> g() {
      return List.of(new ddh(this.f.stream().map(dbv::b).toList(), new ddi.e(this.e), new ddi.d(cxo.fa)));
   }

   public static class a implements dci<dco> {
      private static final MapCodec<dco> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dbn.e.fieldOf("category").orElse(dbn.d).forGetter($$0x -> $$0x.d),
                  cxk.d.fieldOf("result").forGetter($$0x -> $$0x.e),
                  dbv.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dco::new)
      );
      public static final zt<xg, dco> w = zt.a(zr.o, $$0 -> $$0.c, dbn.g, $$0 -> $$0.d, cxk.i, $$0 -> $$0.e, dbv.a.a(zr.a()), $$0 -> $$0.f, dco::new);

      @Override
      public MapCodec<dco> a() {
         return x;
      }

      @Override
      public zt<xg, dco> b() {
         return w;
      }
   }
}
