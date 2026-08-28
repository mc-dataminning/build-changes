import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record elt(List<elt.a> b, jb c, ehz d, boolean e) implements emc {
   public static final Codec<elt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elt.a.a.listOf().fieldOf("layers").forGetter(elt::a),
               jb.g.fieldOf("direction").forGetter(elt::b),
               ehz.b.fieldOf("allowed_placement").forGetter(elt::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(elt::d)
            )
            .apply($$0, elt::new)
   );

   public static elt.a a(btl $$0, eod $$1) {
      return new elt.a($$0, $$1);
   }

   public static elt b(btl $$0, eod $$1) {
      return new elt(List.of(a($$0, $$1)), jb.b, ehz.c, false);
   }

   public List<elt.a> a() {
      return this.b;
   }

   public jb b() {
      return this.c;
   }

   public ehz c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(btl b, eod c) {
      public static final Codec<elt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btl.d.fieldOf("height").forGetter(elt.a::a), eod.a.fieldOf("provider").forGetter(elt.a::b)).apply($$0, elt.a::new)
      );

      public btl a() {
         return this.b;
      }

      public eod b() {
         return this.c;
      }
   }
}
