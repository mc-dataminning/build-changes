import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class deu implements ddt {
   final String d;
   final ddr e;
   final czn f;
   final List<dea> g;
   @Nullable
   private ded h;

   public deu(String $$0, ddr $$1, czn $$2, List<dea> $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public deo<deu> a() {
      return deo.b;
   }

   @Override
   public String j() {
      return this.d;
   }

   @Override
   public ddr c() {
      return this.e;
   }

   @Override
   public ded al_() {
      if (this.h == null) {
         this.h = ded.b(this.g);
      }

      return this.h;
   }

   public boolean a(dds $$0, djm $$1) {
      if ($$0.e() != this.g.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.g.size() == 1 ? this.g.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public czn a(dds $$0, jh.a $$1) {
      return this.f.v();
   }

   @Override
   public List<dfk> g() {
      return List.of(new dfp(this.g.stream().map(dea::c).toList(), new dfq.f(this.f), new dfq.d(czr.fi)));
   }

   public static class a implements deo<deu> {
      private static final MapCodec<deu> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.d),
                  ddr.e.fieldOf("category").orElse(ddr.d).forGetter($$0x -> $$0x.e),
                  czn.d.fieldOf("result").forGetter($$0x -> $$0x.f),
                  dea.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, deu::new)
      );
      public static final yw<wj, deu> w = yw.a(yu.p, $$0 -> $$0.d, ddr.g, $$0 -> $$0.e, czn.i, $$0 -> $$0.f, dea.a.a(yu.a()), $$0 -> $$0.g, deu::new);

      @Override
      public MapCodec<deu> a() {
         return x;
      }

      @Override
      public yw<wj, deu> b() {
         return w;
      }
   }
}
