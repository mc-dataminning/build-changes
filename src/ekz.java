import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ekz(List<ekz.a> b, ja c, ehf d, boolean e) implements eli {
   public static final Codec<ekz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekz.a.a.listOf().fieldOf("layers").forGetter(ekz::a),
               ja.g.fieldOf("direction").forGetter(ekz::b),
               ehf.b.fieldOf("allowed_placement").forGetter(ekz::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(ekz::d)
            )
            .apply($$0, ekz::new)
   );

   public static ekz.a a(btg $$0, enj $$1) {
      return new ekz.a($$0, $$1);
   }

   public static ekz b(btg $$0, enj $$1) {
      return new ekz(List.of(a($$0, $$1)), ja.b, ehf.c, false);
   }

   public List<ekz.a> a() {
      return this.b;
   }

   public ja b() {
      return this.c;
   }

   public ehf c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(btg b, enj c) {
      public static final Codec<ekz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btg.d.fieldOf("height").forGetter(ekz.a::a), enj.a.fieldOf("provider").forGetter(ekz.a::b)).apply($$0, ekz.a::new)
      );

      public btg a() {
         return this.b;
      }

      public enj b() {
         return this.c;
      }
   }
}
