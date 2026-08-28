import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dek implements ddj {
   final String c;
   final ddh d;
   final czd e;
   final List<ddq> f;
   @Nullable
   private ddt g;

   public dek(String $$0, ddh $$1, czd $$2, List<ddq> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public dee<dek> a() {
      return dee.b;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public ddh c() {
      return this.d;
   }

   @Override
   public ddt al_() {
      if (this.g == null) {
         this.g = ddt.b(this.f);
      }

      return this.g;
   }

   public boolean a(ddi $$0, dja $$1) {
      if ($$0.e() != this.f.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.f.size() == 1 ? this.f.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public czd a(ddi $$0, jg.a $$1) {
      return this.e.v();
   }

   @Override
   public List<dfa> g() {
      return List.of(new dff(this.f.stream().map(ddq::c).toList(), new dfg.f(this.e), new dfg.d(czh.fi)));
   }

   public static class a implements dee<dek> {
      private static final MapCodec<dek> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  ddh.e.fieldOf("category").orElse(ddh.d).forGetter($$0x -> $$0x.d),
                  czd.d.fieldOf("result").forGetter($$0x -> $$0x.e),
                  ddq.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dek::new)
      );
      public static final yw<wj, dek> w = yw.a(yu.o, $$0 -> $$0.c, ddh.g, $$0 -> $$0.d, czd.i, $$0 -> $$0.e, ddq.a.a(yu.a()), $$0 -> $$0.f, dek::new);

      @Override
      public MapCodec<dek> a() {
         return x;
      }

      @Override
      public yw<wj, dek> b() {
         return w;
      }
   }
}
