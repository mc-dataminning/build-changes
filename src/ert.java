import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ert(List<ert.a> c, esk d) {
   public static final Codec<ert> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ert.a.a.listOf().fieldOf("structures").forGetter(ert::a), esk.b.fieldOf("placement").forGetter(ert::b)).apply($$0, ert::new)
   );
   public static final Codec<jf<ert>> b = alc.a(mh.bd, a);

   public ert(jf<ern> $$0, esk $$1) {
      this(List.of(new ert.a($$0, 1)), $$1);
   }

   public static ert.a a(jf<ern> $$0, int $$1) {
      return new ert.a($$0, $$1);
   }

   public static ert.a a(jf<ern> $$0) {
      return new ert.a($$0, 1);
   }

   public List<ert.a> a() {
      return this.c;
   }

   public esk b() {
      return this.d;
   }

   public static record a(jf<ern> b, int c) {
      public static final Codec<ert.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ern.b.fieldOf("structure").forGetter(ert.a::a), ayu.m.fieldOf("weight").forGetter(ert.a::b)).apply($$0, ert.a::new)
      );

      public jf<ern> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
