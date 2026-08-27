import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dxb(List<dxb.a> c, dxs d) {
   public static final Codec<dxb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxb.a.a.listOf().fieldOf("structures").forGetter(dxb::a), dxs.b.fieldOf("placement").forGetter(dxb::b)).apply($$0, dxb::new)
   );
   public static final Codec<ib<dxb>> b = agc.a(jz.aD, a);

   public dxb(ib<dwv> $$0, dxs $$1) {
      this(List.of(new dxb.a($$0, 1)), $$1);
   }

   public static dxb.a a(ib<dwv> $$0, int $$1) {
      return new dxb.a($$0, $$1);
   }

   public static dxb.a a(ib<dwv> $$0) {
      return new dxb.a($$0, 1);
   }

   public List<dxb.a> a() {
      return this.c;
   }

   public dxs b() {
      return this.d;
   }

   public static record a(ib<dwv> b, int c) {
      public static final Codec<dxb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dwv.b.fieldOf("structure").forGetter(dxb.a::a), asq.j.fieldOf("weight").forGetter(dxb.a::b)).apply($$0, dxb.a::new)
      );

      public ib<dwv> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
