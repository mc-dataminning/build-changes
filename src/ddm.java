import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ddm {
   Codec<ddm> d = mg.aw.q().dispatch(ddm::a, ddm.a::a);
   yy<wl, ddm> e = yw.a(mh.n).b(ddm::a, ddm.a::b);

   ddm.a<? extends ddm> a();

   boolean a(djx var1, czy var2, bxu var3);

   public static record a<T extends ddm>(MapCodec<T> f, yy<wl, T> g) {
      public static final ddm.a<ddk> a = a("apply_effects", ddk.a, ddk.b);
      public static final ddm.a<ddo> b = a("remove_effects", ddo.a, ddo.b);
      public static final ddm.a<ddl> c = a("clear_all_effects", ddl.b, ddl.c);
      public static final ddm.a<ddp> d = a("teleport_randomly", ddp.a, ddp.b);
      public static final ddm.a<ddn> e = a("play_sound", ddn.a, ddn.b);

      private static <T extends ddm> ddm.a<T> a(String $$0, MapCodec<T> $$1, yy<wl, T> $$2) {
         return js.a(mg.aw, $$0, new ddm.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public yy<wl, T> b() {
         return this.g;
      }
   }
}
