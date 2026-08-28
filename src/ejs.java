import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ejs(List<ejs.a> c, ekj d) {
   public static final Codec<ejs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejs.a.a.listOf().fieldOf("structures").forGetter(ejs::a), ekj.b.fieldOf("placement").forGetter(ejs::b)).apply($$0, ejs::new)
   );
   public static final Codec<jm<ejs>> b = akm.a(lu.aT, a);

   public ejs(jm<ejm> $$0, ekj $$1) {
      this(List.of(new ejs.a($$0, 1)), $$1);
   }

   public static ejs.a a(jm<ejm> $$0, int $$1) {
      return new ejs.a($$0, $$1);
   }

   public static ejs.a a(jm<ejm> $$0) {
      return new ejs.a($$0, 1);
   }

   public List<ejs.a> a() {
      return this.c;
   }

   public ekj b() {
      return this.d;
   }

   public static record a(jm<ejm> b, int c) {
      public static final Codec<ejs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ejm.b.fieldOf("structure").forGetter(ejs.a::a), axv.l.fieldOf("weight").forGetter(ejs.a::b)).apply($$0, ejs.a::new)
      );

      public jm<ejm> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
