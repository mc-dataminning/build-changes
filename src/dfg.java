import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dfg {
   Codec<ki<?>> a = Codec.lazyInitialized(() -> mf.aq.q());
   Codec<kg> b = kg.a(a);
   ki<List<dfc<dfy>>> c = a("damage_protection", $$0 -> $$0.a(dfc.a(dfy.b, fbg.t).listOf()));
   ki<List<dfc<dfu>>> d = a("damage_immunity", $$0 -> $$0.a(dfc.a(dfu.b, fbg.t).listOf()));
   ki<List<dfc<dfy>>> e = a("damage", $$0 -> $$0.a(dfc.a(dfy.b, fbg.t).listOf()));
   ki<List<dfc<dfy>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dfc.a(dfy.b, fbg.t).listOf()));
   ki<List<dfc<dfy>>> g = a("knockback", $$0 -> $$0.a(dfc.a(dfy.b, fbg.t).listOf()));
   ki<List<dfc<dfy>>> h = a("armor_effectiveness", $$0 -> $$0.a(dfc.a(dfy.b, fbg.t).listOf()));
   ki<List<dfo<dfw>>> i = a("post_attack", $$0 -> $$0.a(dfo.a(dfw.b, fbg.t).listOf()));
   ki<List<dfc<dfw>>> j = a("hit_block", $$0 -> $$0.a(dfc.a(dfw.b, fbg.x).listOf()));
   ki<List<dfc<dfy>>> k = a("item_damage", $$0 -> $$0.a(dfc.a(dfy.b, fbg.u).listOf()));
   ki<List<dfv>> l = a("attributes", $$0 -> $$0.a(dfv.a.codec().listOf()));
   ki<List<dfo<dfy>>> m = a("equipment_drops", $$0 -> $$0.a(dfo.b(dfy.b, fbg.t).listOf()));
   ki<List<dfc<dfx>>> n = a("location_changed", $$0 -> $$0.a(dfc.a(dfx.c, fbg.v).listOf()));
   ki<List<dfc<dfw>>> o = a("tick", $$0 -> $$0.a(dfc.a(dfw.b, fbg.w).listOf()));
   ki<List<dfc<dfy>>> p = a("ammo_use", $$0 -> $$0.a(dfc.a(dfy.b, fbg.u).listOf()));
   ki<List<dfc<dfy>>> q = a("projectile_piercing", $$0 -> $$0.a(dfc.a(dfy.b, fbg.u).listOf()));
   ki<List<dfc<dfw>>> r = a("projectile_spawned", $$0 -> $$0.a(dfc.a(dfw.b, fbg.w).listOf()));
   ki<List<dfc<dfy>>> s = a("projectile_spread", $$0 -> $$0.a(dfc.a(dfy.b, fbg.w).listOf()));
   ki<List<dfc<dfy>>> t = a("projectile_count", $$0 -> $$0.a(dfc.a(dfy.b, fbg.w).listOf()));
   ki<List<dfc<dfy>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dfc.a(dfy.b, fbg.w).listOf()));
   ki<List<dfc<dfy>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dfc.a(dfy.b, fbg.w).listOf()));
   ki<List<dfc<dfy>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dfc.a(dfy.b, fbg.w).listOf()));
   ki<List<dfc<dfy>>> x = a("block_experience", $$0 -> $$0.a(dfc.a(dfy.b, fbg.u).listOf()));
   ki<List<dfc<dfy>>> y = a("mob_experience", $$0 -> $$0.a(dfc.a(dfy.b, fbg.w).listOf()));
   ki<List<dfc<dfy>>> z = a("repair_with_xp", $$0 -> $$0.a(dfc.a(dfy.b, fbg.u).listOf()));
   ki<dfy> A = a("crossbow_charge_time", $$0 -> $$0.a(dfy.b));
   ki<List<cxl.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cxl.b.a.listOf()));
   ki<List<je<awk>>> C = a("trident_sound", $$0 -> $$0.a(awk.b.listOf()));
   ki<bas> D = a("prevent_equipment_drop", $$0 -> $$0.a(bas.b));
   ki<bas> E = a("prevent_armor_change", $$0 -> $$0.a(bas.b));
   ki<dfy> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dfy.b));

   static ki<?> a(jr<ki<?>> $$0) {
      return c;
   }

   private static <T> ki<T> a(String $$0, UnaryOperator<ki.a<T>> $$1) {
      return jr.a(mf.aq, $$0, $$1.apply(ki.a()).b());
   }
}
