import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class ddz implements dcy {
   final String c;
   final dcw d;
   final cys e;
   final List<ddf> f;
   @Nullable
   private ddi g;

   public ddz(String $$0, dcw $$1, cys $$2, List<ddf> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public ddt<ddz> a() {
      return ddt.b;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dcw c() {
      return this.d;
   }

   @Override
   public ddi ak_() {
      if (this.g == null) {
         this.g = ddi.b(this.f);
      }

      return this.g;
   }

   public boolean a(dcx $$0, dip $$1) {
      if ($$0.e() != this.f.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.f.size() == 1 ? this.f.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cys a(dcx $$0, jg.a $$1) {
      return this.e.v();
   }

   @Override
   public List<dep> g() {
      return List.of(new deu(this.f.stream().map(ddf::c).toList(), new dev.f(this.e), new dev.d(cyw.fe)));
   }

   public static class a implements ddt<ddz> {
      private static final MapCodec<ddz> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dcw.e.fieldOf("category").orElse(dcw.d).forGetter($$0x -> $$0x.d),
                  cys.d.fieldOf("result").forGetter($$0x -> $$0x.e),
                  ddf.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, ddz::new)
      );
      public static final yu<wh, ddz> w = yu.a(ys.o, $$0 -> $$0.c, dcw.g, $$0 -> $$0.d, cys.i, $$0 -> $$0.e, ddf.a.a(ys.a()), $$0 -> $$0.f, ddz::new);

      @Override
      public MapCodec<ddz> a() {
         return x;
      }

      @Override
      public yu<wh, ddz> b() {
         return w;
      }
   }
}
