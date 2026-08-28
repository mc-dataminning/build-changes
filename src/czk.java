import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface czk {
   Codec<km<?>> a = Codec.lazyInitialized(() -> lq.au.r());
   Codec<kj> b = kj.a(a);
   km<List<czh<dab>>> c = a("damage_protection", $$0 -> $$0.a(czh.a(dab.b, etj.t).listOf()));
   km<List<czh<czw>>> d = a("damage_immunity", $$0 -> $$0.a(czh.a(czw.b, etj.t).listOf()));
   km<List<czh<dab>>> e = a("damage", $$0 -> $$0.a(czh.a(dab.b, etj.t).listOf()));
   km<List<czh<dab>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(czh.a(dab.b, etj.t).listOf()));
   km<List<czh<dab>>> g = a("knockback", $$0 -> $$0.a(czh.a(dab.b, etj.t).listOf()));
   km<List<czh<dab>>> h = a("armor_effectiveness", $$0 -> $$0.a(czh.a(dab.b, etj.t).listOf()));
   km<List<czr<czz>>> i = a("post_attack", $$0 -> $$0.a(czr.a(czz.b, etj.t).listOf()));
   km<List<czh<czz>>> j = a("hit_block", $$0 -> $$0.a(czh.a(czz.b, etj.w).listOf()));
   km<List<czh<dab>>> k = a("item_damage", $$0 -> $$0.a(czh.a(dab.b, etj.u).listOf()));
   km<List<czy>> l = a("attributes", $$0 -> $$0.a(czy.a.codec().listOf()));
   km<List<czr<dab>>> m = a("equipment_drops", $$0 -> $$0.a(czr.b(dab.b, etj.t).listOf()));
   km<List<czh<daa>>> n = a("location_changed", $$0 -> $$0.a(czh.a(daa.c, etj.v).listOf()));
   km<List<czh<czz>>> o = a("tick", $$0 -> $$0.a(czh.a(czz.b, etj.w).listOf()));
   km<List<czh<dab>>> p = a("ammo_use", $$0 -> $$0.a(czh.a(dab.b, etj.u).listOf()));
   km<List<czh<dab>>> q = a("projectile_piercing", $$0 -> $$0.a(czh.a(dab.b, etj.u).listOf()));
   km<List<czh<czz>>> r = a("projectile_spawned", $$0 -> $$0.a(czh.a(czz.b, etj.w).listOf()));
   km<List<czh<dab>>> s = a("projectile_spread", $$0 -> $$0.a(czh.a(dab.b, etj.w).listOf()));
   km<List<czh<dab>>> t = a("projectile_count", $$0 -> $$0.a(czh.a(dab.b, etj.w).listOf()));
   km<List<czh<dab>>> u = a("crossbow_charge_time", $$0 -> $$0.a(czh.a(dab.b, etj.u).listOf()));
   km<List<czh<dab>>> v = a("trident_return_acceleration", $$0 -> $$0.a(czh.a(dab.b, etj.w).listOf()));
   km<List<czh<dab>>> w = a("fishing_time_reduction", $$0 -> $$0.a(czh.a(dab.b, etj.w).listOf()));
   km<List<czh<dab>>> x = a("fishing_luck_bonus", $$0 -> $$0.a(czh.a(dab.b, etj.w).listOf()));
   km<List<czh<dab>>> y = a("block_experience", $$0 -> $$0.a(czh.a(dab.b, etj.u).listOf()));
   km<List<czh<dab>>> z = a("mob_experience", $$0 -> $$0.a(czh.a(dab.b, etj.w).listOf()));
   km<List<czh<dab>>> A = a("trident_spin_attack_strength", $$0 -> $$0.a(czh.a(dab.b, etj.w).listOf()));
   km<List<czh<dab>>> B = a("repair_with_xp", $$0 -> $$0.a(czh.a(dab.b, etj.u).listOf()));
   km<List<csn.a>> C = a("crossbow_charging_sounds", $$0 -> $$0.a(csn.a.a.listOf()));
   km<List<jj<ave>>> D = a("trident_sound", $$0 -> $$0.a(ave.b.listOf()));
   km<azh> E = a("prevent_equipment_drop", $$0 -> $$0.a(azh.b));
   km<azh> F = a("prevent_armor_change", $$0 -> $$0.a(azh.b));

   static km<?> a(jw<km<?>> $$0) {
      return c;
   }

   private static <T> km<T> a(String $$0, UnaryOperator<km.a<T>> $$1) {
      return jw.a(lq.au, $$0, $$1.apply(km.a()).b());
   }
}
