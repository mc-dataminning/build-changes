import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dzm(List<dzm.a> c, ead d) {
   public static final Codec<dzm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzm.a.a.listOf().fieldOf("structures").forGetter(dzm::a), ead.b.fieldOf("placement").forGetter(dzm::b)).apply($$0, dzm::new)
   );
   public static final Codec<ih<dzm>> b = ahc.a(ke.aF, a);

   public dzm(ih<dzg> $$0, ead $$1) {
      this(List.of(new dzm.a($$0, 1)), $$1);
   }

   public static dzm.a a(ih<dzg> $$0, int $$1) {
      return new dzm.a($$0, $$1);
   }

   public static dzm.a a(ih<dzg> $$0) {
      return new dzm.a($$0, 1);
   }

   public List<dzm.a> a() {
      return this.c;
   }

   public ead b() {
      return this.d;
   }

   public static record a(ih<dzg> b, int c) {
      public static final Codec<dzm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dzg.b.fieldOf("structure").forGetter(dzm.a::a), atw.j.fieldOf("weight").forGetter(dzm.a::b)).apply($$0, dzm.a::new)
      );

      public ih<dzg> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
