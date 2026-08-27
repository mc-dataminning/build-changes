import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dpg(List<dpg.a> b, hb c, dlo d, boolean e) implements dpp {
   public static final Codec<dpg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpg.a.a.listOf().fieldOf("layers").forGetter(dpg::a),
               hb.g.fieldOf("direction").forGetter(dpg::b),
               dlo.b.fieldOf("allowed_placement").forGetter(dpg::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dpg::d)
            )
            .apply($$0, dpg::new)
   );

   public static dpg.a a(bft $$0, drq $$1) {
      return new dpg.a($$0, $$1);
   }

   public static dpg b(bft $$0, drq $$1) {
      return new dpg(List.of(a($$0, $$1)), hb.b, dlo.c, false);
   }

   public List<dpg.a> a() {
      return this.b;
   }

   public hb b() {
      return this.c;
   }

   public dlo c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bft b, drq c) {
      public static final Codec<dpg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bft.d.fieldOf("height").forGetter(dpg.a::a), drq.a.fieldOf("provider").forGetter(dpg.a::b)).apply($$0, dpg.a::new)
      );

      public bft a() {
         return this.b;
      }

      public drq b() {
         return this.c;
      }
   }
}
