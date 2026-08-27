import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record efw(List<efw.a> c, egn d) {
   public static final Codec<efw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efw.a.a.listOf().fieldOf("structures").forGetter(efw::a), egn.b.fieldOf("placement").forGetter(efw::b)).apply($$0, efw::new)
   );
   public static final Codec<in<efw>> b = ajr.a(ku.aI, a);

   public efw(in<efq> $$0, egn $$1) {
      this(List.of(new efw.a($$0, 1)), $$1);
   }

   public static efw.a a(in<efq> $$0, int $$1) {
      return new efw.a($$0, $$1);
   }

   public static efw.a a(in<efq> $$0) {
      return new efw.a($$0, 1);
   }

   public List<efw.a> a() {
      return this.c;
   }

   public egn b() {
      return this.d;
   }

   public static record a(in<efq> b, int c) {
      public static final Codec<efw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(efq.b.fieldOf("structure").forGetter(efw.a::a), awu.j.fieldOf("weight").forGetter(efw.a::b)).apply($$0, efw.a::new)
      );

      public in<efq> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
