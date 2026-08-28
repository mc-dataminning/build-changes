import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eio(List<eio.a> c, ejf d) {
   public static final Codec<eio> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eio.a.a.listOf().fieldOf("structures").forGetter(eio::a), ejf.b.fieldOf("placement").forGetter(eio::b)).apply($$0, eio::new)
   );
   public static final Codec<ji<eio>> b = ala.a(lq.aL, a);

   public eio(ji<eii> $$0, ejf $$1) {
      this(List.of(new eio.a($$0, 1)), $$1);
   }

   public static eio.a a(ji<eii> $$0, int $$1) {
      return new eio.a($$0, $$1);
   }

   public static eio.a a(ji<eii> $$0) {
      return new eio.a($$0, 1);
   }

   public List<eio.a> a() {
      return this.c;
   }

   public ejf b() {
      return this.d;
   }

   public static record a(ji<eii> b, int c) {
      public static final Codec<eio.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eii.b.fieldOf("structure").forGetter(eio.a::a), ayf.l.fieldOf("weight").forGetter(eio.a::b)).apply($$0, eio.a::new)
      );

      public ji<eii> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
