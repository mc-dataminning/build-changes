import java.util.function.BiFunction;

public class ebb {
   public static final BiFunction<cfz, dzk, cfz> a = ($$0, $$1) -> $$0;
   public static final eba b = a("set_count", new ebj.a());
   public static final eba c = a("enchant_with_levels", new eas.b());
   public static final eba d = a("enchant_randomly", new ear.b());
   public static final eba e = a("set_enchantments", new ebh.b());
   public static final eba f = a("set_nbt", new ebn.a());
   public static final eba g = a("furnace_smelt", new ebq.a());
   public static final eba h = a("looting_enchant", new ebc.b());
   public static final eba i = a("set_damage", new ebk.a());
   public static final eba j = a("set_attributes", new ebd.d());
   public static final eba k = a("set_name", new ebm.a());
   public static final eba l = a("exploration_map", new eat.b());
   public static final eba m = a("set_stew_effect", new ebp.b());
   public static final eba n = a("copy_name", new eap.b());
   public static final eba o = a("set_contents", new ebf.b());
   public static final eba p = a("limit_count", new eax.a());
   public static final eba q = a("apply_bonus", new eam.e());
   public static final eba r = a("set_loot_table", new ebg.a());
   public static final eba s = a("explosion_decay", new ean.a());
   public static final eba t = a("set_lore", new ebl.b());
   public static final eba u = a("fill_player_head", new eau.a());
   public static final eba v = a("copy_nbt", new eaq.d());
   public static final eba w = a("copy_state", new eao.b());
   public static final eba x = a("set_banner_pattern", new ebe.b());
   public static final eba y = a("set_potion", new ebo.a());
   public static final eba z = a("set_instrument", new ebi.a());
   public static final eba A = a("reference", new eav.a());

   private static eba a(String $$0, dzt<? extends eaz> $$1) {
      return hr.a(jb.H, new acq($$0), new eba($$1));
   }

   public static Object a() {
      return dzi.a(jb.H, "function", "function", eaz::b).a();
   }

   public static BiFunction<cfz, dzk, cfz> a(BiFunction<cfz, dzk, cfz>[] $$0) {
      switch ($$0.length) {
         case 0:
            return a;
         case 1:
            return $$0[0];
         case 2:
            BiFunction<cfz, dzk, cfz> $$1 = $$0[0];
            BiFunction<cfz, dzk, cfz> $$2 = $$0[1];
            return ($$2x, $$3) -> $$2.apply($$1.apply($$2x, $$3), $$3);
         default:
            return ($$1x, $$2x) -> {
               for (BiFunction<cfz, dzk, cfz> $$3 : $$0) {
                  $$1x = $$3.apply($$1x, $$2x);
               }

               return $$1x;
            };
      }
   }
}
