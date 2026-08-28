import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class evb {
   public static final BiFunction<cvs, etl, cvs> a = ($$0, $$1) -> $$0;
   public static final Codec<euz> b = lv.E.q().dispatch("function", euz::b, eva::a);
   public static final Codec<euz> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, evd.b));
   public static final Codec<jo<euz>> d = ala.a(lw.bf, c);
   public static final eva<evq> e = a("set_count", evq.a);
   public static final eva<evs> f = a("set_item", evs.a);
   public static final eva<eup> g = a("enchant_with_levels", eup.a);
   public static final eva<euo> h = a("enchant_randomly", euo.a);
   public static final eva<evm> i = a("set_enchantments", evm.a);
   public static final eva<evk> j = a("set_custom_data", evk.a);
   public static final eva<evh> k = a("set_components", evh.a);
   public static final eva<ewa> l = a("furnace_smelt", ewa.a);
   public static final eva<euq> m = a("enchanted_count_increase", euq.b);
   public static final eva<evr> n = a("set_damage", evr.a);
   public static final eva<eve> o = a("set_attributes", eve.a);
   public static final eva<evu> p = a("set_name", evu.a);
   public static final eva<eur> q = a("exploration_map", eur.f);
   public static final eva<evx> r = a("set_stew_effect", evx.a);
   public static final eva<eun> s = a("copy_name", eun.a);
   public static final eva<evi> t = a("set_contents", evi.a);
   public static final eva<evc> u = a("modify_contents", evc.a);
   public static final eva<eut> v = a("filtered", eut.a);
   public static final eva<euw> w = a("limit_count", euw.a);
   public static final eva<eui> x = a("apply_bonus", eui.a);
   public static final eva<evj> y = a("set_loot_table", evj.a);
   public static final eva<euj> z = a("explosion_decay", euj.a);
   public static final eva<evt> A = a("set_lore", evt.a);
   public static final eva<eus> B = a("fill_player_head", eus.a);
   public static final eva<eum> C = a("copy_custom_data", eum.a);
   public static final eva<euk> D = a("copy_state", euk.a);
   public static final eva<evf> E = a("set_banner_pattern", evf.a);
   public static final eva<evw> F = a("set_potion", evw.a);
   public static final eva<evp> G = a("set_instrument", evp.a);
   public static final eva<euu> H = a("reference", euu.a);
   public static final eva<evd> I = a("sequence", evd.a);
   public static final eva<eul> J = a("copy_components", eul.a);
   public static final eva<evo> K = a("set_fireworks", evo.a);
   public static final eva<evn> L = a("set_firework_explosion", evn.a);
   public static final eva<evg> M = a("set_book_cover", evg.a);
   public static final eva<evz> N = a("set_written_book_pages", evz.b);
   public static final eva<evy> O = a("set_writable_book_pages", evy.a);
   public static final eva<ewb> P = a("toggle_tooltips", ewb.a);
   public static final eva<evv> Q = a("set_ominous_bottle_amplifier", evv.a);
   public static final eva<evl> R = a("set_custom_model_data", evl.a);

   private static <T extends euz> eva<T> a(String $$0, MapCodec<T> $$1) {
      return kb.a(lv.E, ale.b($$0), new eva<>($$1));
   }

   public static BiFunction<cvs, etl, cvs> a(List<? extends BiFunction<cvs, etl, cvs>> $$0) {
      List<BiFunction<cvs, etl, cvs>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cvs, etl, cvs> $$2 = $$1.get(0);
            BiFunction<cvs, etl, cvs> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cvs, etl, cvs> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}
