import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dvn(List<dvn.a> b, ie c, drv d, boolean e) implements dvw {
   public static final Codec<dvn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvn.a.a.listOf().fieldOf("layers").forGetter(dvn::a),
               ie.g.fieldOf("direction").forGetter(dvn::b),
               drv.b.fieldOf("allowed_placement").forGetter(dvn::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dvn::d)
            )
            .apply($$0, dvn::new)
   );

   public static dvn.a a(bkz $$0, dxx $$1) {
      return new dvn.a($$0, $$1);
   }

   public static dvn b(bkz $$0, dxx $$1) {
      return new dvn(List.of(a($$0, $$1)), ie.b, drv.c, false);
   }

   public List<dvn.a> a() {
      return this.b;
   }

   public ie b() {
      return this.c;
   }

   public drv c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bkz b, dxx c) {
      public static final Codec<dvn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bkz.d.fieldOf("height").forGetter(dvn.a::a), dxx.a.fieldOf("provider").forGetter(dvn.a::b)).apply($$0, dvn.a::new)
      );

      public bkz a() {
         return this.b;
      }

      public dxx b() {
         return this.c;
      }
   }
}
