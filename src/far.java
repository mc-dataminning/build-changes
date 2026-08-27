import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum far implements avl {
   a("bitmap", fap.a.a),
   b("ttf", fat.a),
   c("space", eop.a.a),
   d("unihex", fau.b.a),
   e("reference", fas.a);

   public static final Codec<far> f = avl.a(far::values);
   private final String g;
   private final MapCodec<? extends faq> h;

   private far(String $$0, MapCodec<? extends faq> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends faq> a() {
      return this.h;
   }
}
