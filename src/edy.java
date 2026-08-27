import java.util.function.BiFunction;

public class edy {
   public static final BiFunction<ciw, ech, ciw> a = ($$0, $$1) -> $$0;
   public static final edx b = a("set_count", new eeg.a());
   public static final edx c = a("enchant_with_levels", new edp.b());
   public static final edx d = a("enchant_randomly", new edo.b());
   public static final edx e = a("set_enchantments", new eee.b());
   public static final edx f = a("set_nbt", new eek.a());
   public static final edx g = a("furnace_smelt", new een.a());
   public static final edx h = a("looting_enchant", new edz.b());
   public static final edx i = a("set_damage", new eeh.a());
   public static final edx j = a("set_attributes", new eea.d());
   public static final edx k = a("set_name", new eej.a());
   public static final edx l = a("exploration_map", new edq.b());
   public static final edx m = a("set_stew_effect", new eem.b());
   public static final edx n = a("copy_name", new edm.b());
   public static final edx o = a("set_contents", new eec.b());
   public static final edx p = a("limit_count", new edu.a());
   public static final edx q = a("apply_bonus", new edj.e());
   public static final edx r = a("set_loot_table", new eed.a());
   public static final edx s = a("explosion_decay", new edk.a());
   public static final edx t = a("set_lore", new eei.b());
   public static final edx u = a("fill_player_head", new edr.a());
   public static final edx v = a("copy_nbt", new edn.d());
   public static final edx w = a("copy_state", new edl.b());
   public static final edx x = a("set_banner_pattern", new eeb.b());
   public static final edx y = a("set_potion", new eel.a());
   public static final edx z = a("set_instrument", new eef.a());
   public static final edx A = a("reference", new eds.a());

   private static edx a(String $$0, ecq<? extends edw> $$1) {
      return hs.a(jc.H, new aep($$0), new edx($$1));
   }

   public static Object a() {
      return ecf.a(jc.H, "function", "function", edw::b).a();
   }

   public static BiFunction<ciw, ech, ciw> a(BiFunction<ciw, ech, ciw>[] $$0) {
      switch ($$0.length) {
         case 0:
            return a;
         case 1:
            return $$0[0];
         case 2:
            BiFunction<ciw, ech, ciw> $$1 = $$0[0];
            BiFunction<ciw, ech, ciw> $$2 = $$0[1];
            return ($$2x, $$3) -> $$2.apply($$1.apply($$2x, $$3), $$3);
         default:
            return ($$1x, $$2x) -> {
               for (BiFunction<ciw, ech, ciw> $$3 : $$0) {
                  $$1x = $$3.apply($$1x, $$2x);
               }

               return $$1x;
            };
      }
   }
}
