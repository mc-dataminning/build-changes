import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ebu(List<ebu.a> b, it c, dyc d, boolean e) implements ecd {
   public static final Codec<ebu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebu.a.a.listOf().fieldOf("layers").forGetter(ebu::a),
               it.g.fieldOf("direction").forGetter(ebu::b),
               dyc.b.fieldOf("allowed_placement").forGetter(ebu::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(ebu::d)
            )
            .apply($$0, ebu::new)
   );

   public static ebu.a a(bpb $$0, eee $$1) {
      return new ebu.a($$0, $$1);
   }

   public static ebu b(bpb $$0, eee $$1) {
      return new ebu(List.of(a($$0, $$1)), it.b, dyc.c, false);
   }

   public List<ebu.a> a() {
      return this.b;
   }

   public it b() {
      return this.c;
   }

   public dyc c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bpb b, eee c) {
      public static final Codec<ebu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bpb.d.fieldOf("height").forGetter(ebu.a::a), eee.a.fieldOf("provider").forGetter(ebu.a::b)).apply($$0, ebu.a::new)
      );

      public bpb a() {
         return this.b;
      }

      public eee b() {
         return this.c;
      }
   }
}
