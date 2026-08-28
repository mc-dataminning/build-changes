import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dcy {
   Codec<dcy> d = mg.aw.q().dispatch(dcy::a, dcy.a::a);
   yw<wj, dcy> e = yu.a(mh.n).b(dcy::a, dcy.a::b);

   dcy.a<? extends dcy> a();

   boolean a(djh var1, czk var2, bxj var3);

   public static record a<T extends dcy>(MapCodec<T> f, yw<wj, T> g) {
      public static final dcy.a<dcw> a = a("apply_effects", dcw.a, dcw.b);
      public static final dcy.a<dda> b = a("remove_effects", dda.a, dda.b);
      public static final dcy.a<dcx> c = a("clear_all_effects", dcx.b, dcx.c);
      public static final dcy.a<ddb> d = a("teleport_randomly", ddb.a, ddb.b);
      public static final dcy.a<dcz> e = a("play_sound", dcz.a, dcz.b);

      private static <T extends dcy> dcy.a<T> a(String $$0, MapCodec<T> $$1, yw<wj, T> $$2) {
         return js.a(mg.aw, $$0, new dcy.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public yw<wj, T> b() {
         return this.g;
      }
   }
}
