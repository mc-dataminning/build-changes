import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record egv(List<egv.a> c, ehm d) {
   public static final Codec<egv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egv.a.a.listOf().fieldOf("structures").forGetter(egv::a), ehm.b.fieldOf("placement").forGetter(egv::b)).apply($$0, egv::new)
   );
   public static final Codec<iw<egv>> b = akd.a(le.aL, a);

   public egv(iw<egp> $$0, ehm $$1) {
      this(List.of(new egv.a($$0, 1)), $$1);
   }

   public static egv.a a(iw<egp> $$0, int $$1) {
      return new egv.a($$0, $$1);
   }

   public static egv.a a(iw<egp> $$0) {
      return new egv.a($$0, 1);
   }

   public List<egv.a> a() {
      return this.c;
   }

   public ehm b() {
      return this.d;
   }

   public static record a(iw<egp> b, int c) {
      public static final Codec<egv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(egp.b.fieldOf("structure").forGetter(egv.a::a), axh.j.fieldOf("weight").forGetter(egv.a::b)).apply($$0, egv.a::new)
      );

      public iw<egp> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
