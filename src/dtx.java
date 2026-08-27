import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dtx(List<dtx.a> b, ic c, dqf d, boolean e) implements dug {
   public static final Codec<dtx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dtx.a.a.listOf().fieldOf("layers").forGetter(dtx::a),
               ic.g.fieldOf("direction").forGetter(dtx::b),
               dqf.b.fieldOf("allowed_placement").forGetter(dtx::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dtx::d)
            )
            .apply($$0, dtx::new)
   );

   public static dtx.a a(bjh $$0, dwh $$1) {
      return new dtx.a($$0, $$1);
   }

   public static dtx b(bjh $$0, dwh $$1) {
      return new dtx(List.of(a($$0, $$1)), ic.b, dqf.c, false);
   }

   public List<dtx.a> a() {
      return this.b;
   }

   public ic b() {
      return this.c;
   }

   public dqf c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bjh b, dwh c) {
      public static final Codec<dtx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bjh.d.fieldOf("height").forGetter(dtx.a::a), dwh.a.fieldOf("provider").forGetter(dtx.a::b)).apply($$0, dtx.a::new)
      );

      public bjh a() {
         return this.b;
      }

      public dwh b() {
         return this.c;
      }
   }
}
