import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbv(js<cvn> c) {
   public static final Codec<dbv> a = RecordCodecBuilder.create($$0 -> $$0.group(kd.a(lw.K).fieldOf("items").forGetter(dbv::a)).apply($$0, dbv::new));
   public static final zc<wp, dbv> b = zc.a(za.c(lw.K), dbv::a, dbv::new);

   public boolean a(cvs $$0) {
      return $$0.a(this.c);
   }

   public js<cvn> a() {
      return this.c;
   }
}
