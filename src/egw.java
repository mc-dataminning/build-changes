import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egw(egw.a b, boa<dbo.c> c) {
   public static final Codec<egw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egw.a.c.fieldOf("bounding_box").forGetter(egw::a), boa.c(dbo.c.a).fieldOf("spawns").forGetter(egw::b)).apply($$0, egw::new)
   );

   public egw.a a() {
      return this.b;
   }

   public boa<dbo.c> b() {
      return this.c;
   }

   public static enum a implements ayt {
      a("piece"),
      b("full");

      public static final Codec<egw.a> c = ayt.a(egw.a::values);
      private final String d;

      private a(String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
