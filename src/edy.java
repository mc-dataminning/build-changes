import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record edy(List<edy.a> b, ji c, eaf d, boolean e) implements eeh {
   public static final Codec<edy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edy.a.a.listOf().fieldOf("layers").forGetter(edy::a),
               ji.g.fieldOf("direction").forGetter(edy::b),
               eaf.b.fieldOf("allowed_placement").forGetter(edy::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(edy::d)
            )
            .apply($$0, edy::new)
   );

   public static edy.a a(bpw $$0, egi $$1) {
      return new edy.a($$0, $$1);
   }

   public static edy b(bpw $$0, egi $$1) {
      return new edy(List.of(a($$0, $$1)), ji.b, eaf.c, false);
   }

   public List<edy.a> a() {
      return this.b;
   }

   public ji b() {
      return this.c;
   }

   public eaf c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bpw b, egi c) {
      public static final Codec<edy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bpw.d.fieldOf("height").forGetter(edy.a::a), egi.a.fieldOf("provider").forGetter(edy.a::b)).apply($$0, edy.a::new)
      );

      public bpw a() {
         return this.b;
      }

      public egi b() {
         return this.c;
      }
   }
}
