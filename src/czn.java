import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface czn {
   Codec<czn> d = ly.ay.q().dispatch(czn::a, czn.a::a);
   zg<wt, czn> e = ze.a(lz.aE).b(czn::a, czn.a::b);

   czn.a<? extends czn> a();

   boolean a(dfb var1, cwb var2, bva var3);

   public static record a<T extends czn>(MapCodec<T> f, zg<wt, T> g) {
      public static final czn.a<czl> a = a("apply_effects", czl.a, czl.b);
      public static final czn.a<czp> b = a("remove_effects", czp.a, czp.b);
      public static final czn.a<czm> c = a("clear_all_effects", czm.b, czm.c);
      public static final czn.a<czq> d = a("teleport_randomly", czq.a, czq.b);
      public static final czn.a<czo> e = a("play_sound", czo.a, czo.b);

      private static <T extends czn> czn.a<T> a(String $$0, MapCodec<T> $$1, zg<wt, T> $$2) {
         return kd.a(ly.ay, $$0, new czn.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public zg<wt, T> b() {
         return this.g;
      }
   }
}
