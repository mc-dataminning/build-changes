import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dbi {
   Codec<dbi> d = md.ay.q().dispatch(dbi::a, dbi.a::a);
   yt<wg, dbi> e = yr.a(me.aE).b(dbi::a, dbi.a::b);

   dbi.a<? extends dbi> a();

   boolean a(dhp var1, cxy var2, bwr var3);

   public static record a<T extends dbi>(MapCodec<T> f, yt<wg, T> g) {
      public static final dbi.a<dbg> a = a("apply_effects", dbg.a, dbg.b);
      public static final dbi.a<dbk> b = a("remove_effects", dbk.a, dbk.b);
      public static final dbi.a<dbh> c = a("clear_all_effects", dbh.b, dbh.c);
      public static final dbi.a<dbl> d = a("teleport_randomly", dbl.a, dbl.b);
      public static final dbi.a<dbj> e = a("play_sound", dbj.a, dbj.b);

      private static <T extends dbi> dbi.a<T> a(String $$0, MapCodec<T> $$1, yt<wg, T> $$2) {
         return kf.a(md.ay, $$0, new dbi.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public yt<wg, T> b() {
         return this.g;
      }
   }
}
