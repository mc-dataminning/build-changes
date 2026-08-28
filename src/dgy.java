import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dgy {
   Codec<kk<?>> a = Codec.lazyInitialized(() -> mh.aq.q());
   Codec<ki> b = ki.a(a);
   kk<List<dgu<dhq>>> c = a("damage_protection", $$0 -> $$0.a(dgu.a(dhq.b, fdm.t).listOf()));
   kk<List<dgu<dhm>>> d = a("damage_immunity", $$0 -> $$0.a(dgu.a(dhm.b, fdm.t).listOf()));
   kk<List<dgu<dhq>>> e = a("damage", $$0 -> $$0.a(dgu.a(dhq.b, fdm.t).listOf()));
   kk<List<dgu<dhq>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dgu.a(dhq.b, fdm.t).listOf()));
   kk<List<dgu<dhq>>> g = a("knockback", $$0 -> $$0.a(dgu.a(dhq.b, fdm.t).listOf()));
   kk<List<dgu<dhq>>> h = a("armor_effectiveness", $$0 -> $$0.a(dgu.a(dhq.b, fdm.t).listOf()));
   kk<List<dhg<dho>>> i = a("post_attack", $$0 -> $$0.a(dhg.a(dho.b, fdm.t).listOf()));
   kk<List<dgu<dho>>> j = a("hit_block", $$0 -> $$0.a(dgu.a(dho.b, fdm.x).listOf()));
   kk<List<dgu<dhq>>> k = a("item_damage", $$0 -> $$0.a(dgu.a(dhq.b, fdm.u).listOf()));
   kk<List<dhn>> l = a("attributes", $$0 -> $$0.a(dhn.a.codec().listOf()));
   kk<List<dhg<dhq>>> m = a("equipment_drops", $$0 -> $$0.a(dhg.b(dhq.b, fdm.t).listOf()));
   kk<List<dgu<dhp>>> n = a("location_changed", $$0 -> $$0.a(dgu.a(dhp.c, fdm.v).listOf()));
   kk<List<dgu<dho>>> o = a("tick", $$0 -> $$0.a(dgu.a(dho.b, fdm.w).listOf()));
   kk<List<dgu<dhq>>> p = a("ammo_use", $$0 -> $$0.a(dgu.a(dhq.b, fdm.u).listOf()));
   kk<List<dgu<dhq>>> q = a("projectile_piercing", $$0 -> $$0.a(dgu.a(dhq.b, fdm.u).listOf()));
   kk<List<dgu<dho>>> r = a("projectile_spawned", $$0 -> $$0.a(dgu.a(dho.b, fdm.w).listOf()));
   kk<List<dgu<dhq>>> s = a("projectile_spread", $$0 -> $$0.a(dgu.a(dhq.b, fdm.w).listOf()));
   kk<List<dgu<dhq>>> t = a("projectile_count", $$0 -> $$0.a(dgu.a(dhq.b, fdm.w).listOf()));
   kk<List<dgu<dhq>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dgu.a(dhq.b, fdm.w).listOf()));
   kk<List<dgu<dhq>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dgu.a(dhq.b, fdm.w).listOf()));
   kk<List<dgu<dhq>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dgu.a(dhq.b, fdm.w).listOf()));
   kk<List<dgu<dhq>>> x = a("block_experience", $$0 -> $$0.a(dgu.a(dhq.b, fdm.u).listOf()));
   kk<List<dgu<dhq>>> y = a("mob_experience", $$0 -> $$0.a(dgu.a(dhq.b, fdm.w).listOf()));
   kk<List<dgu<dhq>>> z = a("repair_with_xp", $$0 -> $$0.a(dgu.a(dhq.b, fdm.u).listOf()));
   kk<dhq> A = a("crossbow_charge_time", $$0 -> $$0.a(dhq.b));
   kk<List<czd.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(czd.b.a.listOf()));
   kk<List<jg<awx>>> C = a("trident_sound", $$0 -> $$0.a(awx.b.listOf()));
   kk<bbh> D = a("prevent_equipment_drop", $$0 -> $$0.a(bbh.b));
   kk<bbh> E = a("prevent_armor_change", $$0 -> $$0.a(bbh.b));
   kk<dhq> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dhq.b));

   static kk<?> a(jt<kk<?>> $$0) {
      return c;
   }

   private static <T> kk<T> a(String $$0, UnaryOperator<kk.a<T>> $$1) {
      return jt.a(mh.aq, $$0, $$1.apply(kk.a()).b());
   }
}
