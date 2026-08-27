import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dxs(List<dxs.a> c, dyj d) {
   public static final Codec<dxs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxs.a.a.listOf().fieldOf("structures").forGetter(dxs::a), dyj.b.fieldOf("placement").forGetter(dxs::b)).apply($$0, dxs::new)
   );
   public static final Codec<ig<dxs>> b = agi.a(kd.aD, a);

   public dxs(ig<dxm> $$0, dyj $$1) {
      this(List.of(new dxs.a($$0, 1)), $$1);
   }

   public static dxs.a a(ig<dxm> $$0, int $$1) {
      return new dxs.a($$0, $$1);
   }

   public static dxs.a a(ig<dxm> $$0) {
      return new dxs.a($$0, 1);
   }

   public List<dxs.a> a() {
      return this.c;
   }

   public dyj b() {
      return this.d;
   }

   public static record a(ig<dxm> b, int c) {
      public static final Codec<dxs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dxm.b.fieldOf("structure").forGetter(dxs.a::a), asy.j.fieldOf("weight").forGetter(dxs.a::b)).apply($$0, dxs.a::new)
      );

      public ig<dxm> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
