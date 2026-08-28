import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class euj {
   public static final BiFunction<cvl, est, cvl> a = ($$0, $$1) -> $$0;
   public static final Codec<euh> b = lu.E.q().dispatch("function", euh::b, eui::a);
   public static final Codec<euh> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, eul.b));
   public static final Codec<jn<euh>> d = akx.a(lv.bd, c);
   public static final eui<euy> e = a("set_count", euy.a);
   public static final eui<eva> f = a("set_item", eva.a);
   public static final eui<etx> g = a("enchant_with_levels", etx.a);
   public static final eui<etw> h = a("enchant_randomly", etw.a);
   public static final eui<euu> i = a("set_enchantments", euu.a);
   public static final eui<eus> j = a("set_custom_data", eus.a);
   public static final eui<eup> k = a("set_components", eup.a);
   public static final eui<evi> l = a("furnace_smelt", evi.a);
   public static final eui<ety> m = a("enchanted_count_increase", ety.b);
   public static final eui<euz> n = a("set_damage", euz.a);
   public static final eui<eum> o = a("set_attributes", eum.a);
   public static final eui<evc> p = a("set_name", evc.a);
   public static final eui<etz> q = a("exploration_map", etz.f);
   public static final eui<evf> r = a("set_stew_effect", evf.a);
   public static final eui<etv> s = a("copy_name", etv.a);
   public static final eui<euq> t = a("set_contents", euq.a);
   public static final eui<euk> u = a("modify_contents", euk.a);
   public static final eui<eub> v = a("filtered", eub.a);
   public static final eui<eue> w = a("limit_count", eue.a);
   public static final eui<etq> x = a("apply_bonus", etq.a);
   public static final eui<eur> y = a("set_loot_table", eur.a);
   public static final eui<etr> z = a("explosion_decay", etr.a);
   public static final eui<evb> A = a("set_lore", evb.a);
   public static final eui<eua> B = a("fill_player_head", eua.a);
   public static final eui<etu> C = a("copy_custom_data", etu.a);
   public static final eui<ets> D = a("copy_state", ets.a);
   public static final eui<eun> E = a("set_banner_pattern", eun.a);
   public static final eui<eve> F = a("set_potion", eve.a);
   public static final eui<eux> G = a("set_instrument", eux.a);
   public static final eui<euc> H = a("reference", euc.a);
   public static final eui<eul> I = a("sequence", eul.a);
   public static final eui<ett> J = a("copy_components", ett.a);
   public static final eui<euw> K = a("set_fireworks", euw.a);
   public static final eui<euv> L = a("set_firework_explosion", euv.a);
   public static final eui<euo> M = a("set_book_cover", euo.a);
   public static final eui<evh> N = a("set_written_book_pages", evh.b);
   public static final eui<evg> O = a("set_writable_book_pages", evg.a);
   public static final eui<evj> P = a("toggle_tooltips", evj.a);
   public static final eui<evd> Q = a("set_ominous_bottle_amplifier", evd.a);
   public static final eui<eut> R = a("set_custom_model_data", eut.a);

   private static <T extends euh> eui<T> a(String $$0, MapCodec<T> $$1) {
      return ka.a(lu.E, alb.b($$0), new eui<>($$1));
   }

   public static BiFunction<cvl, est, cvl> a(List<? extends BiFunction<cvl, est, cvl>> $$0) {
      List<BiFunction<cvl, est, cvl>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cvl, est, cvl> $$2 = $$1.get(0);
            BiFunction<cvl, est, cvl> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cvl, est, cvl> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}
