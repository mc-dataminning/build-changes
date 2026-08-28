import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record esk(esk.a b, btd<dlo.c> c) {
   public static final Codec<esk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(esk.a.c.fieldOf("bounding_box").forGetter(esk::a), btd.a(dlo.c.a).fieldOf("spawns").forGetter(esk::b)).apply($$0, esk::new)
   );

   public esk.a a() {
      return this.b;
   }

   public btd<dlo.c> b() {
      return this.c;
   }

   public static enum a implements bao {
      a("piece"),
      b("full");

      public static final Codec<esk.a> c = bao.a(esk.a::values);
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
