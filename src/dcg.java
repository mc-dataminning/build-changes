import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dcg {
   Codec<dcg> d = mf.aw.q().dispatch(dcg::a, dcg.a::a);
   yu<wh, dcg> e = ys.a(mg.n).b(dcg::a, dcg.a::b);

   dcg.a<? extends dcg> a();

   boolean a(dip var1, cys var2, bwz var3);

   public static record a<T extends dcg>(MapCodec<T> f, yu<wh, T> g) {
      public static final dcg.a<dce> a = a("apply_effects", dce.a, dce.b);
      public static final dcg.a<dci> b = a("remove_effects", dci.a, dci.b);
      public static final dcg.a<dcf> c = a("clear_all_effects", dcf.b, dcf.c);
      public static final dcg.a<dcj> d = a("teleport_randomly", dcj.a, dcj.b);
      public static final dcg.a<dch> e = a("play_sound", dch.a, dch.b);

      private static <T extends dcg> dcg.a<T> a(String $$0, MapCodec<T> $$1, yu<wh, T> $$2) {
         return jr.a(mf.aw, $$0, new dcg.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public yu<wh, T> b() {
         return this.g;
      }
   }
}
