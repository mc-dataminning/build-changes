import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ejd(List<ejd.a> c, eju d) {
   public static final Codec<ejd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejd.a.a.listOf().fieldOf("structures").forGetter(ejd::a), eju.b.fieldOf("placement").forGetter(ejd::b)).apply($$0, ejd::new)
   );
   public static final Codec<jj<ejd>> b = akg.a(lr.aS, a);

   public ejd(jj<eix> $$0, eju $$1) {
      this(List.of(new ejd.a($$0, 1)), $$1);
   }

   public static ejd.a a(jj<eix> $$0, int $$1) {
      return new ejd.a($$0, $$1);
   }

   public static ejd.a a(jj<eix> $$0) {
      return new ejd.a($$0, 1);
   }

   public List<ejd.a> a() {
      return this.c;
   }

   public eju b() {
      return this.d;
   }

   public static record a(jj<eix> b, int c) {
      public static final Codec<ejd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eix.b.fieldOf("structure").forGetter(ejd.a::a), axo.l.fieldOf("weight").forGetter(ejd.a::b)).apply($$0, ejd.a::new)
      );

      public jj<eix> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
