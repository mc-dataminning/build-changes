import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ddb {
   Codec<ddb> d = mg.aw.q().dispatch(ddb::a, ddb.a::a);
   yw<wj, ddb> e = yu.a(mh.n).b(ddb::a, ddb.a::b);

   ddb.a<? extends ddb> a();

   boolean a(djm var1, czn var2, bxj var3);

   public static record a<T extends ddb>(MapCodec<T> f, yw<wj, T> g) {
      public static final ddb.a<dcz> a = a("apply_effects", dcz.a, dcz.b);
      public static final ddb.a<ddd> b = a("remove_effects", ddd.a, ddd.b);
      public static final ddb.a<dda> c = a("clear_all_effects", dda.b, dda.c);
      public static final ddb.a<dde> d = a("teleport_randomly", dde.a, dde.b);
      public static final ddb.a<ddc> e = a("play_sound", ddc.a, ddc.b);

      private static <T extends ddb> ddb.a<T> a(String $$0, MapCodec<T> $$1, yw<wj, T> $$2) {
         return js.a(mg.aw, $$0, new ddb.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public yw<wj, T> b() {
         return this.g;
      }
   }
}
