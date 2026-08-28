import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record emo(List<emo.a> c, enf d) {
   public static final Codec<emo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emo.a.a.listOf().fieldOf("structures").forGetter(emo::a), enf.b.fieldOf("placement").forGetter(emo::b)).apply($$0, emo::new)
   );
   public static final Codec<jq<emo>> b = alf.a(ma.aU, a);

   public emo(jq<emi> $$0, enf $$1) {
      this(List.of(new emo.a($$0, 1)), $$1);
   }

   public static emo.a a(jq<emi> $$0, int $$1) {
      return new emo.a($$0, $$1);
   }

   public static emo.a a(jq<emi> $$0) {
      return new emo.a($$0, 1);
   }

   public List<emo.a> a() {
      return this.c;
   }

   public enf b() {
      return this.d;
   }

   public static record a(jq<emi> b, int c) {
      public static final Codec<emo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(emi.b.fieldOf("structure").forGetter(emo.a::a), ayv.m.fieldOf("weight").forGetter(emo.a::b)).apply($$0, emo.a::new)
      );

      public jq<emi> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
