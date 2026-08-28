import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dcy {
   Codec<ku<?>> a = Codec.lazyInitialized(() -> mb.as.q());
   Codec<kr> b = kr.a(a);
   ku<List<dcu<ddq>>> c = a("damage_protection", $$0 -> $$0.a(dcu.a(ddq.b, eyi.t).listOf()));
   ku<List<dcu<ddm>>> d = a("damage_immunity", $$0 -> $$0.a(dcu.a(ddm.b, eyi.t).listOf()));
   ku<List<dcu<ddq>>> e = a("damage", $$0 -> $$0.a(dcu.a(ddq.b, eyi.t).listOf()));
   ku<List<dcu<ddq>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dcu.a(ddq.b, eyi.t).listOf()));
   ku<List<dcu<ddq>>> g = a("knockback", $$0 -> $$0.a(dcu.a(ddq.b, eyi.t).listOf()));
   ku<List<dcu<ddq>>> h = a("armor_effectiveness", $$0 -> $$0.a(dcu.a(ddq.b, eyi.t).listOf()));
   ku<List<ddg<ddo>>> i = a("post_attack", $$0 -> $$0.a(ddg.a(ddo.b, eyi.t).listOf()));
   ku<List<dcu<ddo>>> j = a("hit_block", $$0 -> $$0.a(dcu.a(ddo.b, eyi.x).listOf()));
   ku<List<dcu<ddq>>> k = a("item_damage", $$0 -> $$0.a(dcu.a(ddq.b, eyi.u).listOf()));
   ku<List<ddn>> l = a("attributes", $$0 -> $$0.a(ddn.a.codec().listOf()));
   ku<List<ddg<ddq>>> m = a("equipment_drops", $$0 -> $$0.a(ddg.b(ddq.b, eyi.t).listOf()));
   ku<List<dcu<ddp>>> n = a("location_changed", $$0 -> $$0.a(dcu.a(ddp.c, eyi.v).listOf()));
   ku<List<dcu<ddo>>> o = a("tick", $$0 -> $$0.a(dcu.a(ddo.b, eyi.w).listOf()));
   ku<List<dcu<ddq>>> p = a("ammo_use", $$0 -> $$0.a(dcu.a(ddq.b, eyi.u).listOf()));
   ku<List<dcu<ddq>>> q = a("projectile_piercing", $$0 -> $$0.a(dcu.a(ddq.b, eyi.u).listOf()));
   ku<List<dcu<ddo>>> r = a("projectile_spawned", $$0 -> $$0.a(dcu.a(ddo.b, eyi.w).listOf()));
   ku<List<dcu<ddq>>> s = a("projectile_spread", $$0 -> $$0.a(dcu.a(ddq.b, eyi.w).listOf()));
   ku<List<dcu<ddq>>> t = a("projectile_count", $$0 -> $$0.a(dcu.a(ddq.b, eyi.w).listOf()));
   ku<List<dcu<ddq>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dcu.a(ddq.b, eyi.w).listOf()));
   ku<List<dcu<ddq>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dcu.a(ddq.b, eyi.w).listOf()));
   ku<List<dcu<ddq>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dcu.a(ddq.b, eyi.w).listOf()));
   ku<List<dcu<ddq>>> x = a("block_experience", $$0 -> $$0.a(dcu.a(ddq.b, eyi.u).listOf()));
   ku<List<dcu<ddq>>> y = a("mob_experience", $$0 -> $$0.a(dcu.a(ddq.b, eyi.w).listOf()));
   ku<List<dcu<ddq>>> z = a("repair_with_xp", $$0 -> $$0.a(dcu.a(ddq.b, eyi.u).listOf()));
   ku<ddq> A = a("crossbow_charge_time", $$0 -> $$0.a(ddq.b));
   ku<List<cve.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cve.b.a.listOf()));
   ku<List<jr<avy>>> C = a("trident_sound", $$0 -> $$0.a(avy.b.listOf()));
   ku<bae> D = a("prevent_equipment_drop", $$0 -> $$0.a(bae.b));
   ku<bae> E = a("prevent_armor_change", $$0 -> $$0.a(bae.b));
   ku<ddq> F = a("trident_spin_attack_strength", $$0 -> $$0.a(ddq.b));

   static ku<?> a(ke<ku<?>> $$0) {
      return c;
   }

   private static <T> ku<T> a(String $$0, UnaryOperator<ku.a<T>> $$1) {
      return ke.a(mb.as, $$0, $$1.apply(ku.a()).b());
   }
}
