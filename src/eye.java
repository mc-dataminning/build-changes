import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum eye implements auk {
   a("bitmap", eyc.a.a),
   b("ttf", eyg.a),
   c("space", emg.a.a),
   d("unihex", eyh.b.a),
   e("reference", eyf.a);

   public static final Codec<eye> f = auk.a(eye::values);
   private final String g;
   private final MapCodec<? extends eyd> h;

   private eye(String $$0, MapCodec<? extends eyd> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends eyd> a() {
      return this.h;
   }
}
