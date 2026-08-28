import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcv implements dct {
   final Optional<dbv> c;
   final Optional<dbv> d;
   final Optional<dbv> e;
   final cxk f;
   @Nullable
   private dby g;

   public dcv(Optional<dbv> $$0, Optional<dbv> $$1, Optional<dbv> $$2, cxk $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public cxk a(dcu $$0, js.a $$1) {
      cxk $$2 = $$0.d().a(this.f.h(), this.f.L());
      $$2.b(this.f.e());
      return $$2;
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
   public dci<dcv> a() {
      return dci.t;
   }

   @Override
   public dby ap_() {
      if (this.g == null) {
         this.g = dby.a(List.of(this.c, this.d, this.e));
      }

      return this.g;
   }

   @Override
   public List<ddc> g() {
      return List.of(new ddk(new ddi.e(this.f), new ddi.d(cxo.xg)));
   }

   public static class a implements dci<dcv> {
      private static final MapCodec<dcv> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dbv.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dbv.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dbv.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e),
                  cxk.d.fieldOf("result").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dcv::new)
      );
      public static final zt<xg, dcv> w = zt.a(dbv.b, $$0 -> $$0.c, dbv.b, $$0 -> $$0.d, dbv.b, $$0 -> $$0.e, cxk.i, $$0 -> $$0.f, dcv::new);

      @Override
      public MapCodec<dcv> a() {
         return x;
      }

      @Override
      public zt<xg, dcv> b() {
         return w;
      }
   }
}
