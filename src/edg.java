import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record edg(List<edg.a> b, jf c, dzn d, boolean e) implements edp {
   public static final Codec<edg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edg.a.a.listOf().fieldOf("layers").forGetter(edg::a),
               jf.g.fieldOf("direction").forGetter(edg::b),
               dzn.b.fieldOf("allowed_placement").forGetter(edg::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(edg::d)
            )
            .apply($$0, edg::new)
   );

   public static edg.a a(bpm $$0, efq $$1) {
      return new edg.a($$0, $$1);
   }

   public static edg b(bpm $$0, efq $$1) {
      return new edg(List.of(a($$0, $$1)), jf.b, dzn.c, false);
   }

   public List<edg.a> a() {
      return this.b;
   }

   public jf b() {
      return this.c;
   }

   public dzn c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bpm b, efq c) {
      public static final Codec<edg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bpm.d.fieldOf("height").forGetter(edg.a::a), efq.a.fieldOf("provider").forGetter(edg.a::b)).apply($$0, edg.a::new)
      );

      public bpm a() {
         return this.b;
      }

      public efq b() {
         return this.c;
      }
   }
}
