import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dcm {
   Codec<dcm> d = mf.aw.q().dispatch(dcm::a, dcm.a::a);
   yw<wj, dcm> e = yu.a(mg.n).b(dcm::a, dcm.a::b);

   dcm.a<? extends dcm> a();

   boolean a(div var1, cyy var2, bxc var3);

   public static record a<T extends dcm>(MapCodec<T> f, yw<wj, T> g) {
      public static final dcm.a<dck> a = a("apply_effects", dck.a, dck.b);
      public static final dcm.a<dco> b = a("remove_effects", dco.a, dco.b);
      public static final dcm.a<dcl> c = a("clear_all_effects", dcl.b, dcl.c);
      public static final dcm.a<dcp> d = a("teleport_randomly", dcp.a, dcp.b);
      public static final dcm.a<dcn> e = a("play_sound", dcn.a, dcn.b);

      private static <T extends dcm> dcm.a<T> a(String $$0, MapCodec<T> $$1, yw<wj, T> $$2) {
         return jr.a(mf.aw, $$0, new dcm.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public yw<wj, T> b() {
         return this.g;
      }
   }
}
