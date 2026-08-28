import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record elm(List<elm.a> c, emd d) {
   public static final Codec<elm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(elm.a.a.listOf().fieldOf("structures").forGetter(elm::a), emd.b.fieldOf("placement").forGetter(elm::b)).apply($$0, elm::new)
   );
   public static final Codec<jo<elm>> b = ala.a(lw.aV, a);

   public elm(jo<elg> $$0, emd $$1) {
      this(List.of(new elm.a($$0, 1)), $$1);
   }

   public static elm.a a(jo<elg> $$0, int $$1) {
      return new elm.a($$0, $$1);
   }

   public static elm.a a(jo<elg> $$0) {
      return new elm.a($$0, 1);
   }

   public List<elm.a> a() {
      return this.c;
   }

   public emd b() {
      return this.d;
   }

   public static record a(jo<elg> b, int c) {
      public static final Codec<elm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(elg.b.fieldOf("structure").forGetter(elm.a::a), ayo.l.fieldOf("weight").forGetter(elm.a::b)).apply($$0, elm.a::new)
      );

      public jo<elg> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
