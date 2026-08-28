import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbx(axr<buz> c) {
   public static final Codec<dbx> a = RecordCodecBuilder.create($$0 -> $$0.group(axr.b(mh.aN).fieldOf("types").forGetter(dbx::a)).apply($$0, dbx::new));
   public static final yw<wj, dbx> b = yw.a(axr.c(mh.aN), dbx::a, dbx::new);

   public boolean a(bux $$0) {
      return $$0.a(this.c);
   }

   public axr<buz> a() {
      return this.c;
   }
}
