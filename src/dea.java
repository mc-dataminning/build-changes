import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dea {
   Codec<kt<?>> a = Codec.lazyInitialized(() -> ma.as.q());
   Codec<kq> b = kq.a(a);
   kt<List<ddw<des>>> c = a("damage_protection", $$0 -> $$0.a(ddw.a(des.b, ezi.t).listOf()));
   kt<List<ddw<deo>>> d = a("damage_immunity", $$0 -> $$0.a(ddw.a(deo.b, ezi.t).listOf()));
   kt<List<ddw<des>>> e = a("damage", $$0 -> $$0.a(ddw.a(des.b, ezi.t).listOf()));
   kt<List<ddw<des>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(ddw.a(des.b, ezi.t).listOf()));
   kt<List<ddw<des>>> g = a("knockback", $$0 -> $$0.a(ddw.a(des.b, ezi.t).listOf()));
   kt<List<ddw<des>>> h = a("armor_effectiveness", $$0 -> $$0.a(ddw.a(des.b, ezi.t).listOf()));
   kt<List<dei<deq>>> i = a("post_attack", $$0 -> $$0.a(dei.a(deq.b, ezi.t).listOf()));
   kt<List<ddw<deq>>> j = a("hit_block", $$0 -> $$0.a(ddw.a(deq.b, ezi.x).listOf()));
   kt<List<ddw<des>>> k = a("item_damage", $$0 -> $$0.a(ddw.a(des.b, ezi.u).listOf()));
   kt<List<dep>> l = a("attributes", $$0 -> $$0.a(dep.a.codec().listOf()));
   kt<List<dei<des>>> m = a("equipment_drops", $$0 -> $$0.a(dei.b(des.b, ezi.t).listOf()));
   kt<List<ddw<der>>> n = a("location_changed", $$0 -> $$0.a(ddw.a(der.c, ezi.v).listOf()));
   kt<List<ddw<deq>>> o = a("tick", $$0 -> $$0.a(ddw.a(deq.b, ezi.w).listOf()));
   kt<List<ddw<des>>> p = a("ammo_use", $$0 -> $$0.a(ddw.a(des.b, ezi.u).listOf()));
   kt<List<ddw<des>>> q = a("projectile_piercing", $$0 -> $$0.a(ddw.a(des.b, ezi.u).listOf()));
   kt<List<ddw<deq>>> r = a("projectile_spawned", $$0 -> $$0.a(ddw.a(deq.b, ezi.w).listOf()));
   kt<List<ddw<des>>> s = a("projectile_spread", $$0 -> $$0.a(ddw.a(des.b, ezi.w).listOf()));
   kt<List<ddw<des>>> t = a("projectile_count", $$0 -> $$0.a(ddw.a(des.b, ezi.w).listOf()));
   kt<List<ddw<des>>> u = a("trident_return_acceleration", $$0 -> $$0.a(ddw.a(des.b, ezi.w).listOf()));
   kt<List<ddw<des>>> v = a("fishing_time_reduction", $$0 -> $$0.a(ddw.a(des.b, ezi.w).listOf()));
   kt<List<ddw<des>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(ddw.a(des.b, ezi.w).listOf()));
   kt<List<ddw<des>>> x = a("block_experience", $$0 -> $$0.a(ddw.a(des.b, ezi.u).listOf()));
   kt<List<ddw<des>>> y = a("mob_experience", $$0 -> $$0.a(ddw.a(des.b, ezi.w).listOf()));
   kt<List<ddw<des>>> z = a("repair_with_xp", $$0 -> $$0.a(ddw.a(des.b, ezi.u).listOf()));
   kt<des> A = a("crossbow_charge_time", $$0 -> $$0.a(des.b));
   kt<List<cwg.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cwg.a.a.listOf()));
   kt<List<jq<axe>>> C = a("trident_sound", $$0 -> $$0.a(axe.b.listOf()));
   kt<bbk> D = a("prevent_equipment_drop", $$0 -> $$0.a(bbk.b));
   kt<bbk> E = a("prevent_armor_change", $$0 -> $$0.a(bbk.b));
   kt<des> F = a("trident_spin_attack_strength", $$0 -> $$0.a(des.b));

   static kt<?> a(kd<kt<?>> $$0) {
      return c;
   }

   private static <T> kt<T> a(String $$0, UnaryOperator<kt.a<T>> $$1) {
      return kd.a(ma.as, $$0, $$1.apply(kt.a()).b());
   }
}
