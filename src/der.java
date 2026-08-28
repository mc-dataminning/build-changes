import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class der implements ddq {
   final String d;
   final ddo e;
   final czk f;
   final List<ddx> g;
   @Nullable
   private dea h;

   public der(String $$0, ddo $$1, czk $$2, List<ddx> $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public del<der> a() {
      return del.b;
   }

   @Override
   public String j() {
      return this.d;
   }

   @Override
   public ddo c() {
      return this.e;
   }

   @Override
   public dea al_() {
      if (this.h == null) {
         this.h = dea.b(this.g);
      }

      return this.h;
   }

   public boolean a(ddp $$0, djh $$1) {
      if ($$0.e() != this.g.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.g.size() == 1 ? this.g.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public czk a(ddp $$0, jh.a $$1) {
      return this.f.v();
   }

   @Override
   public List<dfh> g() {
      return List.of(new dfm(this.g.stream().map(ddx::c).toList(), new dfn.f(this.f), new dfn.d(czo.fi)));
   }

   public static class a implements del<der> {
      private static final MapCodec<der> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.d),
                  ddo.e.fieldOf("category").orElse(ddo.d).forGetter($$0x -> $$0x.e),
                  czk.d.fieldOf("result").forGetter($$0x -> $$0x.f),
                  ddx.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, der::new)
      );
      public static final yw<wj, der> w = yw.a(yu.p, $$0 -> $$0.d, ddo.g, $$0 -> $$0.e, czk.i, $$0 -> $$0.f, ddx.a.a(yu.a()), $$0 -> $$0.g, der::new);

      @Override
      public MapCodec<der> a() {
         return x;
      }

      @Override
      public yw<wj, der> b() {
         return w;
      }
   }
}
