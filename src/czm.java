import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface czm {
   Codec<km<?>> a = Codec.lazyInitialized(() -> lq.au.r());
   Codec<kj> b = kj.a(a);
   km<List<czj<dad>>> c = a("damage_protection", $$0 -> $$0.a(czj.a(dad.b, etp.t).listOf()));
   km<List<czj<czy>>> d = a("damage_immunity", $$0 -> $$0.a(czj.a(czy.b, etp.t).listOf()));
   km<List<czj<dad>>> e = a("damage", $$0 -> $$0.a(czj.a(dad.b, etp.t).listOf()));
   km<List<czj<dad>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(czj.a(dad.b, etp.t).listOf()));
   km<List<czj<dad>>> g = a("knockback", $$0 -> $$0.a(czj.a(dad.b, etp.t).listOf()));
   km<List<czj<dad>>> h = a("armor_effectiveness", $$0 -> $$0.a(czj.a(dad.b, etp.t).listOf()));
   km<List<czt<dab>>> i = a("post_attack", $$0 -> $$0.a(czt.a(dab.b, etp.t).listOf()));
   km<List<czj<dab>>> j = a("hit_block", $$0 -> $$0.a(czj.a(dab.b, etp.w).listOf()));
   km<List<czj<dad>>> k = a("item_damage", $$0 -> $$0.a(czj.a(dad.b, etp.u).listOf()));
   km<List<daa>> l = a("attributes", $$0 -> $$0.a(daa.a.codec().listOf()));
   km<List<czt<dad>>> m = a("equipment_drops", $$0 -> $$0.a(czt.b(dad.b, etp.t).listOf()));
   km<List<czj<dac>>> n = a("location_changed", $$0 -> $$0.a(czj.a(dac.c, etp.v).listOf()));
   km<List<czj<dab>>> o = a("tick", $$0 -> $$0.a(czj.a(dab.b, etp.w).listOf()));
   km<List<czj<dad>>> p = a("ammo_use", $$0 -> $$0.a(czj.a(dad.b, etp.u).listOf()));
   km<List<czj<dad>>> q = a("projectile_piercing", $$0 -> $$0.a(czj.a(dad.b, etp.u).listOf()));
   km<List<czj<dab>>> r = a("projectile_spawned", $$0 -> $$0.a(czj.a(dab.b, etp.w).listOf()));
   km<List<czj<dad>>> s = a("projectile_spread", $$0 -> $$0.a(czj.a(dad.b, etp.w).listOf()));
   km<List<czj<dad>>> t = a("projectile_count", $$0 -> $$0.a(czj.a(dad.b, etp.w).listOf()));
   km<List<czj<dad>>> u = a("trident_return_acceleration", $$0 -> $$0.a(czj.a(dad.b, etp.w).listOf()));
   km<List<czj<dad>>> v = a("fishing_time_reduction", $$0 -> $$0.a(czj.a(dad.b, etp.w).listOf()));
   km<List<czj<dad>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(czj.a(dad.b, etp.w).listOf()));
   km<List<czj<dad>>> x = a("block_experience", $$0 -> $$0.a(czj.a(dad.b, etp.u).listOf()));
   km<List<czj<dad>>> y = a("mob_experience", $$0 -> $$0.a(czj.a(dad.b, etp.w).listOf()));
   km<List<czj<dad>>> z = a("repair_with_xp", $$0 -> $$0.a(czj.a(dad.b, etp.u).listOf()));
   km<dad> A = a("crossbow_charge_time", $$0 -> $$0.a(dad.b));
   km<List<csp.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(csp.a.a.listOf()));
   km<List<jj<avg>>> C = a("trident_sound", $$0 -> $$0.a(avg.b.listOf()));
   km<azk> D = a("prevent_equipment_drop", $$0 -> $$0.a(azk.b));
   km<azk> E = a("prevent_armor_change", $$0 -> $$0.a(azk.b));
   km<dad> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dad.b));

   static km<?> a(jw<km<?>> $$0) {
      return c;
   }

   private static <T> km<T> a(String $$0, UnaryOperator<km.a<T>> $$1) {
      return jw.a(lq.au, $$0, $$1.apply(km.a()).b());
   }
}
