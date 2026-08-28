import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ekv(ekv.a b, bpy<dff.c> c) {
   public static final Codec<ekv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekv.a.c.fieldOf("bounding_box").forGetter(ekv::a), bpy.c(dff.c.a).fieldOf("spawns").forGetter(ekv::b)).apply($$0, ekv::new)
   );

   public ekv.a a() {
      return this.b;
   }

   public bpy<dff.c> b() {
      return this.c;
   }

   public static enum a implements azy {
      a("piece"),
      b("full");

      public static final Codec<ekv.a> c = azy.a(ekv.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
