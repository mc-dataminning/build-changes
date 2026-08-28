import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ecu(List<ecu.a> b, je c, dzc d, boolean e) implements edd {
   public static final Codec<ecu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecu.a.a.listOf().fieldOf("layers").forGetter(ecu::a),
               je.g.fieldOf("direction").forGetter(ecu::b),
               dzc.b.fieldOf("allowed_placement").forGetter(ecu::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(ecu::d)
            )
            .apply($$0, ecu::new)
   );

   public static ecu.a a(bqa $$0, efe $$1) {
      return new ecu.a($$0, $$1);
   }

   public static ecu b(bqa $$0, efe $$1) {
      return new ecu(List.of(a($$0, $$1)), je.b, dzc.c, false);
   }

   public List<ecu.a> a() {
      return this.b;
   }

   public je b() {
      return this.c;
   }

   public dzc c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bqa b, efe c) {
      public static final Codec<ecu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bqa.d.fieldOf("height").forGetter(ecu.a::a), efe.a.fieldOf("provider").forGetter(ecu.a::b)).apply($$0, ecu.a::new)
      );

      public bqa a() {
         return this.b;
      }

      public efe b() {
         return this.c;
      }
   }
}
