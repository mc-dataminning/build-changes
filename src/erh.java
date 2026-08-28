import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record erh(List<erh.a> c, ery d) {
   public static final Codec<erh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(erh.a.a.listOf().fieldOf("structures").forGetter(erh::a), ery.b.fieldOf("placement").forGetter(erh::b)).apply($$0, erh::new)
   );
   public static final Codec<je<erh>> b = alc.a(mg.bd, a);

   public erh(je<erb> $$0, ery $$1) {
      this(List.of(new erh.a($$0, 1)), $$1);
   }

   public static erh.a a(je<erb> $$0, int $$1) {
      return new erh.a($$0, $$1);
   }

   public static erh.a a(je<erb> $$0) {
      return new erh.a($$0, 1);
   }

   public List<erh.a> a() {
      return this.c;
   }

   public ery b() {
      return this.d;
   }

   public static record a(je<erb> b, int c) {
      public static final Codec<erh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(erb.b.fieldOf("structure").forGetter(erh.a::a), ayu.m.fieldOf("weight").forGetter(erh.a::b)).apply($$0, erh.a::new)
      );

      public je<erb> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
