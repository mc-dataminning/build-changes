import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dds {
   Codec<kt<?>> a = Codec.lazyInitialized(() -> ma.as.q());
   Codec<kq> b = kq.a(a);
   kt<List<ddo<dek>>> c = a("damage_protection", $$0 -> $$0.a(ddo.a(dek.b, ezc.t).listOf()));
   kt<List<ddo<deg>>> d = a("damage_immunity", $$0 -> $$0.a(ddo.a(deg.b, ezc.t).listOf()));
   kt<List<ddo<dek>>> e = a("damage", $$0 -> $$0.a(ddo.a(dek.b, ezc.t).listOf()));
   kt<List<ddo<dek>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(ddo.a(dek.b, ezc.t).listOf()));
   kt<List<ddo<dek>>> g = a("knockback", $$0 -> $$0.a(ddo.a(dek.b, ezc.t).listOf()));
   kt<List<ddo<dek>>> h = a("armor_effectiveness", $$0 -> $$0.a(ddo.a(dek.b, ezc.t).listOf()));
   kt<List<dea<dei>>> i = a("post_attack", $$0 -> $$0.a(dea.a(dei.b, ezc.t).listOf()));
   kt<List<ddo<dei>>> j = a("hit_block", $$0 -> $$0.a(ddo.a(dei.b, ezc.x).listOf()));
   kt<List<ddo<dek>>> k = a("item_damage", $$0 -> $$0.a(ddo.a(dek.b, ezc.u).listOf()));
   kt<List<deh>> l = a("attributes", $$0 -> $$0.a(deh.a.codec().listOf()));
   kt<List<dea<dek>>> m = a("equipment_drops", $$0 -> $$0.a(dea.b(dek.b, ezc.t).listOf()));
   kt<List<ddo<dej>>> n = a("location_changed", $$0 -> $$0.a(ddo.a(dej.c, ezc.v).listOf()));
   kt<List<ddo<dei>>> o = a("tick", $$0 -> $$0.a(ddo.a(dei.b, ezc.w).listOf()));
   kt<List<ddo<dek>>> p = a("ammo_use", $$0 -> $$0.a(ddo.a(dek.b, ezc.u).listOf()));
   kt<List<ddo<dek>>> q = a("projectile_piercing", $$0 -> $$0.a(ddo.a(dek.b, ezc.u).listOf()));
   kt<List<ddo<dei>>> r = a("projectile_spawned", $$0 -> $$0.a(ddo.a(dei.b, ezc.w).listOf()));
   kt<List<ddo<dek>>> s = a("projectile_spread", $$0 -> $$0.a(ddo.a(dek.b, ezc.w).listOf()));
   kt<List<ddo<dek>>> t = a("projectile_count", $$0 -> $$0.a(ddo.a(dek.b, ezc.w).listOf()));
   kt<List<ddo<dek>>> u = a("trident_return_acceleration", $$0 -> $$0.a(ddo.a(dek.b, ezc.w).listOf()));
   kt<List<ddo<dek>>> v = a("fishing_time_reduction", $$0 -> $$0.a(ddo.a(dek.b, ezc.w).listOf()));
   kt<List<ddo<dek>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(ddo.a(dek.b, ezc.w).listOf()));
   kt<List<ddo<dek>>> x = a("block_experience", $$0 -> $$0.a(ddo.a(dek.b, ezc.u).listOf()));
   kt<List<ddo<dek>>> y = a("mob_experience", $$0 -> $$0.a(ddo.a(dek.b, ezc.w).listOf()));
   kt<List<ddo<dek>>> z = a("repair_with_xp", $$0 -> $$0.a(ddo.a(dek.b, ezc.u).listOf()));
   kt<dek> A = a("crossbow_charge_time", $$0 -> $$0.a(dek.b));
   kt<List<cwb.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cwb.a.a.listOf()));
   kt<List<jq<axe>>> C = a("trident_sound", $$0 -> $$0.a(axe.b.listOf()));
   kt<bbk> D = a("prevent_equipment_drop", $$0 -> $$0.a(bbk.b));
   kt<bbk> E = a("prevent_armor_change", $$0 -> $$0.a(bbk.b));
   kt<dek> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dek.b));

   static kt<?> a(kd<kt<?>> $$0) {
      return c;
   }

   private static <T> kt<T> a(String $$0, UnaryOperator<kt.a<T>> $$1) {
      return kd.a(ma.as, $$0, $$1.apply(kt.a()).b());
   }
}
