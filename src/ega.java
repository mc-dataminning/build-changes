import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ega(List<ega.a> b, jl c, ecg d, boolean e) implements egj {
   public static final Codec<ega> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ega.a.a.listOf().fieldOf("layers").forGetter(ega::a),
               jl.g.fieldOf("direction").forGetter(ega::b),
               ecg.b.fieldOf("allowed_placement").forGetter(ega::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(ega::d)
            )
            .apply($$0, ega::new)
   );

   public static ega.a a(brd $$0, eik $$1) {
      return new ega.a($$0, $$1);
   }

   public static ega b(brd $$0, eik $$1) {
      return new ega(List.of(a($$0, $$1)), jl.b, ecg.c, false);
   }

   public List<ega.a> a() {
      return this.b;
   }

   public jl b() {
      return this.c;
   }

   public ecg c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(brd b, eik c) {
      public static final Codec<ega.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brd.d.fieldOf("height").forGetter(ega.a::a), eik.a.fieldOf("provider").forGetter(ega.a::b)).apply($$0, ega.a::new)
      );

      public brd a() {
         return this.b;
      }

      public eik b() {
         return this.c;
      }
   }
}
