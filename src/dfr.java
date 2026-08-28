import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dfr {
   Codec<ki<?>> a = Codec.lazyInitialized(() -> mf.aq.q());
   Codec<kg> b = kg.a(a);
   ki<List<dfn<dgj>>> c = a("damage_protection", $$0 -> $$0.a(dfn.a(dgj.b, fca.t).listOf()));
   ki<List<dfn<dgf>>> d = a("damage_immunity", $$0 -> $$0.a(dfn.a(dgf.b, fca.t).listOf()));
   ki<List<dfn<dgj>>> e = a("damage", $$0 -> $$0.a(dfn.a(dgj.b, fca.t).listOf()));
   ki<List<dfn<dgj>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dfn.a(dgj.b, fca.t).listOf()));
   ki<List<dfn<dgj>>> g = a("knockback", $$0 -> $$0.a(dfn.a(dgj.b, fca.t).listOf()));
   ki<List<dfn<dgj>>> h = a("armor_effectiveness", $$0 -> $$0.a(dfn.a(dgj.b, fca.t).listOf()));
   ki<List<dfz<dgh>>> i = a("post_attack", $$0 -> $$0.a(dfz.a(dgh.b, fca.t).listOf()));
   ki<List<dfn<dgh>>> j = a("hit_block", $$0 -> $$0.a(dfn.a(dgh.b, fca.x).listOf()));
   ki<List<dfn<dgj>>> k = a("item_damage", $$0 -> $$0.a(dfn.a(dgj.b, fca.u).listOf()));
   ki<List<dgg>> l = a("attributes", $$0 -> $$0.a(dgg.a.codec().listOf()));
   ki<List<dfz<dgj>>> m = a("equipment_drops", $$0 -> $$0.a(dfz.b(dgj.b, fca.t).listOf()));
   ki<List<dfn<dgi>>> n = a("location_changed", $$0 -> $$0.a(dfn.a(dgi.c, fca.v).listOf()));
   ki<List<dfn<dgh>>> o = a("tick", $$0 -> $$0.a(dfn.a(dgh.b, fca.w).listOf()));
   ki<List<dfn<dgj>>> p = a("ammo_use", $$0 -> $$0.a(dfn.a(dgj.b, fca.u).listOf()));
   ki<List<dfn<dgj>>> q = a("projectile_piercing", $$0 -> $$0.a(dfn.a(dgj.b, fca.u).listOf()));
   ki<List<dfn<dgh>>> r = a("projectile_spawned", $$0 -> $$0.a(dfn.a(dgh.b, fca.w).listOf()));
   ki<List<dfn<dgj>>> s = a("projectile_spread", $$0 -> $$0.a(dfn.a(dgj.b, fca.w).listOf()));
   ki<List<dfn<dgj>>> t = a("projectile_count", $$0 -> $$0.a(dfn.a(dgj.b, fca.w).listOf()));
   ki<List<dfn<dgj>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dfn.a(dgj.b, fca.w).listOf()));
   ki<List<dfn<dgj>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dfn.a(dgj.b, fca.w).listOf()));
   ki<List<dfn<dgj>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dfn.a(dgj.b, fca.w).listOf()));
   ki<List<dfn<dgj>>> x = a("block_experience", $$0 -> $$0.a(dfn.a(dgj.b, fca.u).listOf()));
   ki<List<dfn<dgj>>> y = a("mob_experience", $$0 -> $$0.a(dfn.a(dgj.b, fca.w).listOf()));
   ki<List<dfn<dgj>>> z = a("repair_with_xp", $$0 -> $$0.a(dfn.a(dgj.b, fca.u).listOf()));
   ki<dgj> A = a("crossbow_charge_time", $$0 -> $$0.a(dgj.b));
   ki<List<cxw.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cxw.b.a.listOf()));
   ki<List<je<awm>>> C = a("trident_sound", $$0 -> $$0.a(awm.b.listOf()));
   ki<bau> D = a("prevent_equipment_drop", $$0 -> $$0.a(bau.b));
   ki<bau> E = a("prevent_armor_change", $$0 -> $$0.a(bau.b));
   ki<dgj> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dgj.b));

   static ki<?> a(jr<ki<?>> $$0) {
      return c;
   }

   private static <T> ki<T> a(String $$0, UnaryOperator<ki.a<T>> $$1) {
      return jr.a(mf.aq, $$0, $$1.apply(ki.a()).b());
   }
}
