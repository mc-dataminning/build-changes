import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record egm(List<egm.a> c, ehd d) {
   public static final Codec<egm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egm.a.a.listOf().fieldOf("structures").forGetter(egm::a), ehd.b.fieldOf("placement").forGetter(egm::b)).apply($$0, egm::new)
   );
   public static final Codec<iv<egm>> b = akb.a(ld.aK, a);

   public egm(iv<egg> $$0, ehd $$1) {
      this(List.of(new egm.a($$0, 1)), $$1);
   }

   public static egm.a a(iv<egg> $$0, int $$1) {
      return new egm.a($$0, $$1);
   }

   public static egm.a a(iv<egg> $$0) {
      return new egm.a($$0, 1);
   }

   public List<egm.a> a() {
      return this.c;
   }

   public ehd b() {
      return this.d;
   }

   public static record a(iv<egg> b, int c) {
      public static final Codec<egm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(egg.b.fieldOf("structure").forGetter(egm.a::a), axe.j.fieldOf("weight").forGetter(egm.a::b)).apply($$0, egm.a::new)
      );

      public iv<egg> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
