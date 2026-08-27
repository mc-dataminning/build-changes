import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dvu(List<dvu.a> b, ie c, dsc d, boolean e) implements dwd {
   public static final Codec<dvu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvu.a.a.listOf().fieldOf("layers").forGetter(dvu::a),
               ie.g.fieldOf("direction").forGetter(dvu::b),
               dsc.b.fieldOf("allowed_placement").forGetter(dvu::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dvu::d)
            )
            .apply($$0, dvu::new)
   );

   public static dvu.a a(blb $$0, dye $$1) {
      return new dvu.a($$0, $$1);
   }

   public static dvu b(blb $$0, dye $$1) {
      return new dvu(List.of(a($$0, $$1)), ie.b, dsc.c, false);
   }

   public List<dvu.a> a() {
      return this.b;
   }

   public ie b() {
      return this.c;
   }

   public dsc c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(blb b, dye c) {
      public static final Codec<dvu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(blb.d.fieldOf("height").forGetter(dvu.a::a), dye.a.fieldOf("provider").forGetter(dvu.a::b)).apply($$0, dvu.a::new)
      );

      public blb a() {
         return this.b;
      }

      public dye b() {
         return this.c;
      }
   }
}
