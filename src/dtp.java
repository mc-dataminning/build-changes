import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dtp(List<dtp.a> b, ic c, dpx d, boolean e) implements dty {
   public static final Codec<dtp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dtp.a.a.listOf().fieldOf("layers").forGetter(dtp::a),
               ic.g.fieldOf("direction").forGetter(dtp::b),
               dpx.b.fieldOf("allowed_placement").forGetter(dtp::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dtp::d)
            )
            .apply($$0, dtp::new)
   );

   public static dtp.a a(bjg $$0, dvz $$1) {
      return new dtp.a($$0, $$1);
   }

   public static dtp b(bjg $$0, dvz $$1) {
      return new dtp(List.of(a($$0, $$1)), ic.b, dpx.c, false);
   }

   public List<dtp.a> a() {
      return this.b;
   }

   public ic b() {
      return this.c;
   }

   public dpx c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bjg b, dvz c) {
      public static final Codec<dtp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bjg.d.fieldOf("height").forGetter(dtp.a::a), dvz.a.fieldOf("provider").forGetter(dtp.a::b)).apply($$0, dtp.a::new)
      );

      public bjg a() {
         return this.b;
      }

      public dvz b() {
         return this.c;
      }
   }
}
