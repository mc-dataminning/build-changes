import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ciq(int c, int d, akk e) {
   public static final Codec<ciq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.a(1, 16).fieldOf("width").forGetter(ciq::b), axo.a(1, 16).fieldOf("height").forGetter(ciq::c), akk.a.fieldOf("asset_id").forGetter(ciq::d)
            )
            .apply($$0, ciq::new)
   );
   public static final Codec<jj<ciq>> b = akg.a(lr.W, a);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public akk d() {
      return this.e;
   }
}
