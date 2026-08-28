import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record elx(List<elx.a> c, emo d) {
   public static final Codec<elx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(elx.a.a.listOf().fieldOf("structures").forGetter(elx::a), emo.b.fieldOf("placement").forGetter(elx::b)).apply($$0, elx::new)
   );
   public static final Codec<jp<elx>> b = ald.a(ly.aU, a);

   public elx(jp<elr> $$0, emo $$1) {
      this(List.of(new elx.a($$0, 1)), $$1);
   }

   public static elx.a a(jp<elr> $$0, int $$1) {
      return new elx.a($$0, $$1);
   }

   public static elx.a a(jp<elr> $$0) {
      return new elx.a($$0, 1);
   }

   public List<elx.a> a() {
      return this.c;
   }

   public emo b() {
      return this.d;
   }

   public static record a(jp<elr> b, int c) {
      public static final Codec<elx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(elr.b.fieldOf("structure").forGetter(elx.a::a), ays.m.fieldOf("weight").forGetter(elx.a::b)).apply($$0, elx.a::new)
      );

      public jp<elr> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
