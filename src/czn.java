import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface czn {
   Codec<km<?>> a = Codec.lazyInitialized(() -> lq.au.r());
   Codec<kj> b = kj.a(a);
   km<List<czk<dae>>> c = a("damage_protection", $$0 -> $$0.a(czk.a(dae.b, etr.t).listOf()));
   km<List<czk<czz>>> d = a("damage_immunity", $$0 -> $$0.a(czk.a(czz.b, etr.t).listOf()));
   km<List<czk<dae>>> e = a("damage", $$0 -> $$0.a(czk.a(dae.b, etr.t).listOf()));
   km<List<czk<dae>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(czk.a(dae.b, etr.t).listOf()));
   km<List<czk<dae>>> g = a("knockback", $$0 -> $$0.a(czk.a(dae.b, etr.t).listOf()));
   km<List<czk<dae>>> h = a("armor_effectiveness", $$0 -> $$0.a(czk.a(dae.b, etr.t).listOf()));
   km<List<czu<dac>>> i = a("post_attack", $$0 -> $$0.a(czu.a(dac.b, etr.t).listOf()));
   km<List<czk<dac>>> j = a("hit_block", $$0 -> $$0.a(czk.a(dac.b, etr.w).listOf()));
   km<List<czk<dae>>> k = a("item_damage", $$0 -> $$0.a(czk.a(dae.b, etr.u).listOf()));
   km<List<dab>> l = a("attributes", $$0 -> $$0.a(dab.a.codec().listOf()));
   km<List<czu<dae>>> m = a("equipment_drops", $$0 -> $$0.a(czu.b(dae.b, etr.t).listOf()));
   km<List<czk<dad>>> n = a("location_changed", $$0 -> $$0.a(czk.a(dad.c, etr.v).listOf()));
   km<List<czk<dac>>> o = a("tick", $$0 -> $$0.a(czk.a(dac.b, etr.w).listOf()));
   km<List<czk<dae>>> p = a("ammo_use", $$0 -> $$0.a(czk.a(dae.b, etr.u).listOf()));
   km<List<czk<dae>>> q = a("projectile_piercing", $$0 -> $$0.a(czk.a(dae.b, etr.u).listOf()));
   km<List<czk<dac>>> r = a("projectile_spawned", $$0 -> $$0.a(czk.a(dac.b, etr.w).listOf()));
   km<List<czk<dae>>> s = a("projectile_spread", $$0 -> $$0.a(czk.a(dae.b, etr.w).listOf()));
   km<List<czk<dae>>> t = a("projectile_count", $$0 -> $$0.a(czk.a(dae.b, etr.w).listOf()));
   km<List<czk<dae>>> u = a("trident_return_acceleration", $$0 -> $$0.a(czk.a(dae.b, etr.w).listOf()));
   km<List<czk<dae>>> v = a("fishing_time_reduction", $$0 -> $$0.a(czk.a(dae.b, etr.w).listOf()));
   km<List<czk<dae>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(czk.a(dae.b, etr.w).listOf()));
   km<List<czk<dae>>> x = a("block_experience", $$0 -> $$0.a(czk.a(dae.b, etr.u).listOf()));
   km<List<czk<dae>>> y = a("mob_experience", $$0 -> $$0.a(czk.a(dae.b, etr.w).listOf()));
   km<List<czk<dae>>> z = a("repair_with_xp", $$0 -> $$0.a(czk.a(dae.b, etr.u).listOf()));
   km<dae> A = a("crossbow_charge_time", $$0 -> $$0.a(dae.b));
   km<List<csq.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(csq.a.a.listOf()));
   km<List<jj<avg>>> C = a("trident_sound", $$0 -> $$0.a(avg.b.listOf()));
   km<azk> D = a("prevent_equipment_drop", $$0 -> $$0.a(azk.b));
   km<azk> E = a("prevent_armor_change", $$0 -> $$0.a(azk.b));
   km<dae> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dae.b));

   static km<?> a(jw<km<?>> $$0) {
      return c;
   }

   private static <T> km<T> a(String $$0, UnaryOperator<km.a<T>> $$1) {
      return jw.a(lq.au, $$0, $$1.apply(km.a()).b());
   }
}
