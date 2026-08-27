import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dxn(List<dxn.a> c, dye d) {
   public static final Codec<dxn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxn.a.a.listOf().fieldOf("structures").forGetter(dxn::a), dye.b.fieldOf("placement").forGetter(dxn::b)).apply($$0, dxn::new)
   );
   public static final Codec<ib<dxn>> b = age.a(jz.aD, a);

   public dxn(ib<dxh> $$0, dye $$1) {
      this(List.of(new dxn.a($$0, 1)), $$1);
   }

   public static dxn.a a(ib<dxh> $$0, int $$1) {
      return new dxn.a($$0, $$1);
   }

   public static dxn.a a(ib<dxh> $$0) {
      return new dxn.a($$0, 1);
   }

   public List<dxn.a> a() {
      return this.c;
   }

   public dye b() {
      return this.d;
   }

   public static record a(ib<dxh> b, int c) {
      public static final Codec<dxn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dxh.b.fieldOf("structure").forGetter(dxn.a::a), asu.j.fieldOf("weight").forGetter(dxn.a::b)).apply($$0, dxn.a::new)
      );

      public ib<dxh> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
