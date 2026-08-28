import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record esh(List<esh.a> c, esy d) {
   public static final Codec<esh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(esh.a.a.listOf().fieldOf("structures").forGetter(esh::a), esy.b.fieldOf("placement").forGetter(esh::b)).apply($$0, esh::new)
   );
   public static final Codec<jf<esh>> b = ale.a(mh.bd, a);

   public esh(jf<esb> $$0, esy $$1) {
      this(List.of(new esh.a($$0, 1)), $$1);
   }

   public static esh.a a(jf<esb> $$0, int $$1) {
      return new esh.a($$0, $$1);
   }

   public static esh.a a(jf<esb> $$0) {
      return new esh.a($$0, 1);
   }

   public List<esh.a> a() {
      return this.c;
   }

   public esy b() {
      return this.d;
   }

   public static record a(jf<esb> b, int c) {
      public static final Codec<esh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(esb.b.fieldOf("structure").forGetter(esh.a::a), ayw.m.fieldOf("weight").forGetter(esh.a::b)).apply($$0, esh.a::new)
      );

      public jf<esb> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
