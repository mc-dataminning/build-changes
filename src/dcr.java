import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dcr {
   Codec<dcr> d = mf.aw.q().dispatch(dcr::a, dcr.a::a);
   yw<wj, dcr> e = yu.a(mg.n).b(dcr::a, dcr.a::b);

   dcr.a<? extends dcr> a();

   boolean a(dja var1, czd var2, bxe var3);

   public static record a<T extends dcr>(MapCodec<T> f, yw<wj, T> g) {
      public static final dcr.a<dcp> a = a("apply_effects", dcp.a, dcp.b);
      public static final dcr.a<dct> b = a("remove_effects", dct.a, dct.b);
      public static final dcr.a<dcq> c = a("clear_all_effects", dcq.b, dcq.c);
      public static final dcr.a<dcu> d = a("teleport_randomly", dcu.a, dcu.b);
      public static final dcr.a<dcs> e = a("play_sound", dcs.a, dcs.b);

      private static <T extends dcr> dcr.a<T> a(String $$0, MapCodec<T> $$1, yw<wj, T> $$2) {
         return jr.a(mf.aw, $$0, new dcr.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public yw<wj, T> b() {
         return this.g;
      }
   }
}
