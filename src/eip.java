import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eip(List<eip.a> c, ejg d) {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eip.a.a.listOf().fieldOf("structures").forGetter(eip::a), ejg.b.fieldOf("placement").forGetter(eip::b)).apply($$0, eip::new)
   );
   public static final Codec<ji<eip>> b = ala.a(lq.aL, a);

   public eip(ji<eij> $$0, ejg $$1) {
      this(List.of(new eip.a($$0, 1)), $$1);
   }

   public static eip.a a(ji<eij> $$0, int $$1) {
      return new eip.a($$0, $$1);
   }

   public static eip.a a(ji<eij> $$0) {
      return new eip.a($$0, 1);
   }

   public List<eip.a> a() {
      return this.c;
   }

   public ejg b() {
      return this.d;
   }

   public static record a(ji<eij> b, int c) {
      public static final Codec<eip.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eij.b.fieldOf("structure").forGetter(eip.a::a), ayg.l.fieldOf("weight").forGetter(eip.a::b)).apply($$0, eip.a::new)
      );

      public ji<eij> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
