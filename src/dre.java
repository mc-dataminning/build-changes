import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dre(List<dre.a> b, hx c, dnm d, boolean e) implements drn {
   public static final Codec<dre> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dre.a.a.listOf().fieldOf("layers").forGetter(dre::a),
               hx.g.fieldOf("direction").forGetter(dre::b),
               dnm.b.fieldOf("allowed_placement").forGetter(dre::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dre::d)
            )
            .apply($$0, dre::new)
   );

   public static dre.a a(bhv $$0, dto $$1) {
      return new dre.a($$0, $$1);
   }

   public static dre b(bhv $$0, dto $$1) {
      return new dre(List.of(a($$0, $$1)), hx.b, dnm.c, false);
   }

   public List<dre.a> a() {
      return this.b;
   }

   public hx b() {
      return this.c;
   }

   public dnm c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bhv b, dto c) {
      public static final Codec<dre.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bhv.d.fieldOf("height").forGetter(dre.a::a), dto.a.fieldOf("provider").forGetter(dre.a::b)).apply($$0, dre.a::new)
      );

      public bhv a() {
         return this.b;
      }

      public dto b() {
         return this.c;
      }
   }
}
