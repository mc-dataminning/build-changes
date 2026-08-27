import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record drv(List<drv.a> b, ib c, dod d, boolean e) implements dse {
   public static final Codec<drv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drv.a.a.listOf().fieldOf("layers").forGetter(drv::a),
               ib.g.fieldOf("direction").forGetter(drv::b),
               dod.b.fieldOf("allowed_placement").forGetter(drv::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(drv::d)
            )
            .apply($$0, drv::new)
   );

   public static drv.a a(big $$0, duf $$1) {
      return new drv.a($$0, $$1);
   }

   public static drv b(big $$0, duf $$1) {
      return new drv(List.of(a($$0, $$1)), ib.b, dod.c, false);
   }

   public List<drv.a> a() {
      return this.b;
   }

   public ib b() {
      return this.c;
   }

   public dod c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(big b, duf c) {
      public static final Codec<drv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(big.d.fieldOf("height").forGetter(drv.a::a), duf.a.fieldOf("provider").forGetter(drv.a::b)).apply($$0, drv.a::new)
      );

      public big a() {
         return this.b;
      }

      public duf b() {
         return this.c;
      }
   }
}
