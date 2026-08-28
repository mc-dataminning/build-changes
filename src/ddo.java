import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ddo {
   Codec<ddo> d = mh.aw.q().dispatch(ddo::a, ddo.a::a);
   za<wn, ddo> e = yy.a(mi.n).b(ddo::a, ddo.a::b);

   ddo.a<? extends ddo> a();

   boolean a(djz var1, daa var2, bxw var3);

   public static record a<T extends ddo>(MapCodec<T> f, za<wn, T> g) {
      public static final ddo.a<ddm> a = a("apply_effects", ddm.a, ddm.b);
      public static final ddo.a<ddq> b = a("remove_effects", ddq.a, ddq.b);
      public static final ddo.a<ddn> c = a("clear_all_effects", ddn.b, ddn.c);
      public static final ddo.a<ddr> d = a("teleport_randomly", ddr.a, ddr.b);
      public static final ddo.a<ddp> e = a("play_sound", ddp.a, ddp.b);

      private static <T extends ddo> ddo.a<T> a(String $$0, MapCodec<T> $$1, za<wn, T> $$2) {
         return jt.a(mh.aw, $$0, new ddo.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public za<wn, T> b() {
         return this.g;
      }
   }
}
