import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eqz(List<eqz.a> c, erq d) {
   public static final Codec<eqz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eqz.a.a.listOf().fieldOf("structures").forGetter(eqz::a), erq.b.fieldOf("placement").forGetter(eqz::b)).apply($$0, eqz::new)
   );
   public static final Codec<je<eqz>> b = alc.a(mg.bc, a);

   public eqz(je<eqt> $$0, erq $$1) {
      this(List.of(new eqz.a($$0, 1)), $$1);
   }

   public static eqz.a a(je<eqt> $$0, int $$1) {
      return new eqz.a($$0, $$1);
   }

   public static eqz.a a(je<eqt> $$0) {
      return new eqz.a($$0, 1);
   }

   public List<eqz.a> a() {
      return this.c;
   }

   public erq b() {
      return this.d;
   }

   public static record a(je<eqt> b, int c) {
      public static final Codec<eqz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eqt.b.fieldOf("structure").forGetter(eqz.a::a), ayu.m.fieldOf("weight").forGetter(eqz.a::b)).apply($$0, eqz.a::new)
      );

      public je<eqt> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
