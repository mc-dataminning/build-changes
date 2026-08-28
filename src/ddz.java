import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface ddz {
   Codec<kt<?>> a = Codec.lazyInitialized(() -> ma.as.q());
   Codec<kq> b = kq.a(a);
   kt<List<ddv<der>>> c = a("damage_protection", $$0 -> $$0.a(ddv.a(der.b, ezh.t).listOf()));
   kt<List<ddv<den>>> d = a("damage_immunity", $$0 -> $$0.a(ddv.a(den.b, ezh.t).listOf()));
   kt<List<ddv<der>>> e = a("damage", $$0 -> $$0.a(ddv.a(der.b, ezh.t).listOf()));
   kt<List<ddv<der>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(ddv.a(der.b, ezh.t).listOf()));
   kt<List<ddv<der>>> g = a("knockback", $$0 -> $$0.a(ddv.a(der.b, ezh.t).listOf()));
   kt<List<ddv<der>>> h = a("armor_effectiveness", $$0 -> $$0.a(ddv.a(der.b, ezh.t).listOf()));
   kt<List<deh<dep>>> i = a("post_attack", $$0 -> $$0.a(deh.a(dep.b, ezh.t).listOf()));
   kt<List<ddv<dep>>> j = a("hit_block", $$0 -> $$0.a(ddv.a(dep.b, ezh.x).listOf()));
   kt<List<ddv<der>>> k = a("item_damage", $$0 -> $$0.a(ddv.a(der.b, ezh.u).listOf()));
   kt<List<deo>> l = a("attributes", $$0 -> $$0.a(deo.a.codec().listOf()));
   kt<List<deh<der>>> m = a("equipment_drops", $$0 -> $$0.a(deh.b(der.b, ezh.t).listOf()));
   kt<List<ddv<deq>>> n = a("location_changed", $$0 -> $$0.a(ddv.a(deq.c, ezh.v).listOf()));
   kt<List<ddv<dep>>> o = a("tick", $$0 -> $$0.a(ddv.a(dep.b, ezh.w).listOf()));
   kt<List<ddv<der>>> p = a("ammo_use", $$0 -> $$0.a(ddv.a(der.b, ezh.u).listOf()));
   kt<List<ddv<der>>> q = a("projectile_piercing", $$0 -> $$0.a(ddv.a(der.b, ezh.u).listOf()));
   kt<List<ddv<dep>>> r = a("projectile_spawned", $$0 -> $$0.a(ddv.a(dep.b, ezh.w).listOf()));
   kt<List<ddv<der>>> s = a("projectile_spread", $$0 -> $$0.a(ddv.a(der.b, ezh.w).listOf()));
   kt<List<ddv<der>>> t = a("projectile_count", $$0 -> $$0.a(ddv.a(der.b, ezh.w).listOf()));
   kt<List<ddv<der>>> u = a("trident_return_acceleration", $$0 -> $$0.a(ddv.a(der.b, ezh.w).listOf()));
   kt<List<ddv<der>>> v = a("fishing_time_reduction", $$0 -> $$0.a(ddv.a(der.b, ezh.w).listOf()));
   kt<List<ddv<der>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(ddv.a(der.b, ezh.w).listOf()));
   kt<List<ddv<der>>> x = a("block_experience", $$0 -> $$0.a(ddv.a(der.b, ezh.u).listOf()));
   kt<List<ddv<der>>> y = a("mob_experience", $$0 -> $$0.a(ddv.a(der.b, ezh.w).listOf()));
   kt<List<ddv<der>>> z = a("repair_with_xp", $$0 -> $$0.a(ddv.a(der.b, ezh.u).listOf()));
   kt<der> A = a("crossbow_charge_time", $$0 -> $$0.a(der.b));
   kt<List<cwf.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cwf.a.a.listOf()));
   kt<List<jq<axe>>> C = a("trident_sound", $$0 -> $$0.a(axe.b.listOf()));
   kt<bbk> D = a("prevent_equipment_drop", $$0 -> $$0.a(bbk.b));
   kt<bbk> E = a("prevent_armor_change", $$0 -> $$0.a(bbk.b));
   kt<der> F = a("trident_spin_attack_strength", $$0 -> $$0.a(der.b));

   static kt<?> a(kd<kt<?>> $$0) {
      return c;
   }

   private static <T> kt<T> a(String $$0, UnaryOperator<kt.a<T>> $$1) {
      return kd.a(ma.as, $$0, $$1.apply(kt.a()).b());
   }
}
