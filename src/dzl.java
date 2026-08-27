import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dzl(List<dzl.a> c, eac d) {
   public static final Codec<dzl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzl.a.a.listOf().fieldOf("structures").forGetter(dzl::a), eac.b.fieldOf("placement").forGetter(dzl::b)).apply($$0, dzl::new)
   );
   public static final Codec<ih<dzl>> b = ahc.a(ke.aF, a);

   public dzl(ih<dzf> $$0, eac $$1) {
      this(List.of(new dzl.a($$0, 1)), $$1);
   }

   public static dzl.a a(ih<dzf> $$0, int $$1) {
      return new dzl.a($$0, $$1);
   }

   public static dzl.a a(ih<dzf> $$0) {
      return new dzl.a($$0, 1);
   }

   public List<dzl.a> a() {
      return this.c;
   }

   public eac b() {
      return this.d;
   }

   public static record a(ih<dzf> b, int c) {
      public static final Codec<dzl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dzf.b.fieldOf("structure").forGetter(dzl.a::a), atv.j.fieldOf("weight").forGetter(dzl.a::b)).apply($$0, dzl.a::new)
      );

      public ih<dzf> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
