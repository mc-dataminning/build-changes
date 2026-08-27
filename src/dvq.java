import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dvq(List<dvq.a> c, dwh d) {
   public static final Codec<dvq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvq.a.a.listOf().fieldOf("structures").forGetter(dvq::a), dwh.b.fieldOf("placement").forGetter(dvq::b)).apply($$0, dvq::new)
   );
   public static final Codec<hg<dvq>> b = aeu.a(je.aB, a);

   public dvq(hg<dvk> $$0, dwh $$1) {
      this(List.of(new dvq.a($$0, 1)), $$1);
   }

   public static dvq.a a(hg<dvk> $$0, int $$1) {
      return new dvq.a($$0, $$1);
   }

   public static dvq.a a(hg<dvk> $$0) {
      return new dvq.a($$0, 1);
   }

   public List<dvq.a> a() {
      return this.c;
   }

   public dwh b() {
      return this.d;
   }

   public static record a(hg<dvk> b, int c) {
      public static final Codec<dvq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dvk.b.fieldOf("structure").forGetter(dvq.a::a), arh.j.fieldOf("weight").forGetter(dvq.a::b)).apply($$0, dvq.a::new)
      );

      public hg<dvk> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
