import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum ftr implements bag {
   a("bitmap", fto.a.a),
   b("ttf", ftt.a),
   c("space", ffp.a.a),
   d("unihex", ftu.b.a),
   e("reference", fts.a);

   public static final Codec<ftr> f = bag.a(ftr::values);
   private final String g;
   private final MapCodec<? extends ftq> h;

   private ftr(final String $$0, final MapCodec<? extends ftq> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends ftq> a() {
      return this.h;
   }
}
