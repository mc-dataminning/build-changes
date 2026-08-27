import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dph(List<dph.a> b, ha c, dlp d, boolean e) implements dpq {
   public static final Codec<dph> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dph.a.a.listOf().fieldOf("layers").forGetter(dph::a),
               ha.g.fieldOf("direction").forGetter(dph::b),
               dlp.b.fieldOf("allowed_placement").forGetter(dph::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dph::d)
            )
            .apply($$0, dph::new)
   );

   public static dph.a a(bfv $$0, drr $$1) {
      return new dph.a($$0, $$1);
   }

   public static dph b(bfv $$0, drr $$1) {
      return new dph(List.of(a($$0, $$1)), ha.b, dlp.c, false);
   }

   public List<dph.a> a() {
      return this.b;
   }

   public ha b() {
      return this.c;
   }

   public dlp c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bfv b, drr c) {
      public static final Codec<dph.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bfv.d.fieldOf("height").forGetter(dph.a::a), drr.a.fieldOf("provider").forGetter(dph.a::b)).apply($$0, dph.a::new)
      );

      public bfv a() {
         return this.b;
      }

      public drr b() {
         return this.c;
      }
   }
}
