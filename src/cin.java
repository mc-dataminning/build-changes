import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cin(int c, int d, akk e) {
   public static final Codec<cin> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axm.a(1, 16).fieldOf("width").forGetter(cin::b), axm.a(1, 16).fieldOf("height").forGetter(cin::c), akk.a.fieldOf("asset_id").forGetter(cin::d)
            )
            .apply($$0, cin::new)
   );
   public static final Codec<jj<cin>> b = akg.a(lr.W, a);

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
