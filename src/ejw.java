import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejw(ejw.a b, bpf<dei.c> c) {
   public static final Codec<ejw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejw.a.c.fieldOf("bounding_box").forGetter(ejw::a), bpf.c(dei.c.a).fieldOf("spawns").forGetter(ejw::b)).apply($$0, ejw::new)
   );

   public ejw.a a() {
      return this.b;
   }

   public bpf<dei.c> b() {
      return this.c;
   }

   public static enum a implements azk {
      a("piece"),
      b("full");

      public static final Codec<ejw.a> c = azk.a(ejw.a::values);
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
