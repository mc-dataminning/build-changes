import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dgo {
   Codec<kk<?>> a = Codec.lazyInitialized(() -> mh.aq.q());
   Codec<ki> b = ki.a(a);
   kk<List<dgk<dhg>>> c = a("damage_protection", $$0 -> $$0.a(dgk.a(dhg.b, fdc.t).listOf()));
   kk<List<dgk<dhc>>> d = a("damage_immunity", $$0 -> $$0.a(dgk.a(dhc.b, fdc.t).listOf()));
   kk<List<dgk<dhg>>> e = a("damage", $$0 -> $$0.a(dgk.a(dhg.b, fdc.t).listOf()));
   kk<List<dgk<dhg>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dgk.a(dhg.b, fdc.t).listOf()));
   kk<List<dgk<dhg>>> g = a("knockback", $$0 -> $$0.a(dgk.a(dhg.b, fdc.t).listOf()));
   kk<List<dgk<dhg>>> h = a("armor_effectiveness", $$0 -> $$0.a(dgk.a(dhg.b, fdc.t).listOf()));
   kk<List<dgw<dhe>>> i = a("post_attack", $$0 -> $$0.a(dgw.a(dhe.b, fdc.t).listOf()));
   kk<List<dgk<dhe>>> j = a("hit_block", $$0 -> $$0.a(dgk.a(dhe.b, fdc.x).listOf()));
   kk<List<dgk<dhg>>> k = a("item_damage", $$0 -> $$0.a(dgk.a(dhg.b, fdc.u).listOf()));
   kk<List<dhd>> l = a("attributes", $$0 -> $$0.a(dhd.a.codec().listOf()));
   kk<List<dgw<dhg>>> m = a("equipment_drops", $$0 -> $$0.a(dgw.b(dhg.b, fdc.t).listOf()));
   kk<List<dgk<dhf>>> n = a("location_changed", $$0 -> $$0.a(dgk.a(dhf.c, fdc.v).listOf()));
   kk<List<dgk<dhe>>> o = a("tick", $$0 -> $$0.a(dgk.a(dhe.b, fdc.w).listOf()));
   kk<List<dgk<dhg>>> p = a("ammo_use", $$0 -> $$0.a(dgk.a(dhg.b, fdc.u).listOf()));
   kk<List<dgk<dhg>>> q = a("projectile_piercing", $$0 -> $$0.a(dgk.a(dhg.b, fdc.u).listOf()));
   kk<List<dgk<dhe>>> r = a("projectile_spawned", $$0 -> $$0.a(dgk.a(dhe.b, fdc.w).listOf()));
   kk<List<dgk<dhg>>> s = a("projectile_spread", $$0 -> $$0.a(dgk.a(dhg.b, fdc.w).listOf()));
   kk<List<dgk<dhg>>> t = a("projectile_count", $$0 -> $$0.a(dgk.a(dhg.b, fdc.w).listOf()));
   kk<List<dgk<dhg>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dgk.a(dhg.b, fdc.w).listOf()));
   kk<List<dgk<dhg>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dgk.a(dhg.b, fdc.w).listOf()));
   kk<List<dgk<dhg>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dgk.a(dhg.b, fdc.w).listOf()));
   kk<List<dgk<dhg>>> x = a("block_experience", $$0 -> $$0.a(dgk.a(dhg.b, fdc.u).listOf()));
   kk<List<dgk<dhg>>> y = a("mob_experience", $$0 -> $$0.a(dgk.a(dhg.b, fdc.w).listOf()));
   kk<List<dgk<dhg>>> z = a("repair_with_xp", $$0 -> $$0.a(dgk.a(dhg.b, fdc.u).listOf()));
   kk<dhg> A = a("crossbow_charge_time", $$0 -> $$0.a(dhg.b));
   kk<List<cyt.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cyt.b.a.listOf()));
   kk<List<jg<awq>>> C = a("trident_sound", $$0 -> $$0.a(awq.b.listOf()));
   kk<bay> D = a("prevent_equipment_drop", $$0 -> $$0.a(bay.b));
   kk<bay> E = a("prevent_armor_change", $$0 -> $$0.a(bay.b));
   kk<dhg> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dhg.b));

   static kk<?> a(jt<kk<?>> $$0) {
      return c;
   }

   private static <T> kk<T> a(String $$0, UnaryOperator<kk.a<T>> $$1) {
      return jt.a(mh.aq, $$0, $$1.apply(kk.a()).b());
   }
}
