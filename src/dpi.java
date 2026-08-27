import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dpi(List<dpi.a> b, ha c, dlq d, boolean e) implements dpr {
   public static final Codec<dpi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpi.a.a.listOf().fieldOf("layers").forGetter(dpi::a),
               ha.g.fieldOf("direction").forGetter(dpi::b),
               dlq.b.fieldOf("allowed_placement").forGetter(dpi::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dpi::d)
            )
            .apply($$0, dpi::new)
   );

   public static dpi.a a(bfv $$0, drs $$1) {
      return new dpi.a($$0, $$1);
   }

   public static dpi b(bfv $$0, drs $$1) {
      return new dpi(List.of(a($$0, $$1)), ha.b, dlq.c, false);
   }

   public List<dpi.a> a() {
      return this.b;
   }

   public ha b() {
      return this.c;
   }

   public dlq c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bfv b, drs c) {
      public static final Codec<dpi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bfv.d.fieldOf("height").forGetter(dpi.a::a), drs.a.fieldOf("provider").forGetter(dpi.a::b)).apply($$0, dpi.a::new)
      );

      public bfv a() {
         return this.b;
      }

      public drs b() {
         return this.c;
      }
   }
}
