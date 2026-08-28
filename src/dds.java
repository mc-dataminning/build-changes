import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dds {
   Codec<ku<?>> a = Codec.lazyInitialized(() -> mb.as.q());
   Codec<kr> b = kr.a(a);
   ku<List<ddo<dek>>> c = a("damage_protection", $$0 -> $$0.a(ddo.a(dek.b, ezh.t).listOf()));
   ku<List<ddo<deg>>> d = a("damage_immunity", $$0 -> $$0.a(ddo.a(deg.b, ezh.t).listOf()));
   ku<List<ddo<dek>>> e = a("damage", $$0 -> $$0.a(ddo.a(dek.b, ezh.t).listOf()));
   ku<List<ddo<dek>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(ddo.a(dek.b, ezh.t).listOf()));
   ku<List<ddo<dek>>> g = a("knockback", $$0 -> $$0.a(ddo.a(dek.b, ezh.t).listOf()));
   ku<List<ddo<dek>>> h = a("armor_effectiveness", $$0 -> $$0.a(ddo.a(dek.b, ezh.t).listOf()));
   ku<List<dea<dei>>> i = a("post_attack", $$0 -> $$0.a(dea.a(dei.b, ezh.t).listOf()));
   ku<List<ddo<dei>>> j = a("hit_block", $$0 -> $$0.a(ddo.a(dei.b, ezh.x).listOf()));
   ku<List<ddo<dek>>> k = a("item_damage", $$0 -> $$0.a(ddo.a(dek.b, ezh.u).listOf()));
   ku<List<deh>> l = a("attributes", $$0 -> $$0.a(deh.a.codec().listOf()));
   ku<List<dea<dek>>> m = a("equipment_drops", $$0 -> $$0.a(dea.b(dek.b, ezh.t).listOf()));
   ku<List<ddo<dej>>> n = a("location_changed", $$0 -> $$0.a(ddo.a(dej.c, ezh.v).listOf()));
   ku<List<ddo<dei>>> o = a("tick", $$0 -> $$0.a(ddo.a(dei.b, ezh.w).listOf()));
   ku<List<ddo<dek>>> p = a("ammo_use", $$0 -> $$0.a(ddo.a(dek.b, ezh.u).listOf()));
   ku<List<ddo<dek>>> q = a("projectile_piercing", $$0 -> $$0.a(ddo.a(dek.b, ezh.u).listOf()));
   ku<List<ddo<dei>>> r = a("projectile_spawned", $$0 -> $$0.a(ddo.a(dei.b, ezh.w).listOf()));
   ku<List<ddo<dek>>> s = a("projectile_spread", $$0 -> $$0.a(ddo.a(dek.b, ezh.w).listOf()));
   ku<List<ddo<dek>>> t = a("projectile_count", $$0 -> $$0.a(ddo.a(dek.b, ezh.w).listOf()));
   ku<List<ddo<dek>>> u = a("trident_return_acceleration", $$0 -> $$0.a(ddo.a(dek.b, ezh.w).listOf()));
   ku<List<ddo<dek>>> v = a("fishing_time_reduction", $$0 -> $$0.a(ddo.a(dek.b, ezh.w).listOf()));
   ku<List<ddo<dek>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(ddo.a(dek.b, ezh.w).listOf()));
   ku<List<ddo<dek>>> x = a("block_experience", $$0 -> $$0.a(ddo.a(dek.b, ezh.u).listOf()));
   ku<List<ddo<dek>>> y = a("mob_experience", $$0 -> $$0.a(ddo.a(dek.b, ezh.w).listOf()));
   ku<List<ddo<dek>>> z = a("repair_with_xp", $$0 -> $$0.a(ddo.a(dek.b, ezh.u).listOf()));
   ku<dek> A = a("crossbow_charge_time", $$0 -> $$0.a(dek.b));
   ku<List<cvz.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cvz.b.a.listOf()));
   ku<List<jr<avz>>> C = a("trident_sound", $$0 -> $$0.a(avz.b.listOf()));
   ku<baf> D = a("prevent_equipment_drop", $$0 -> $$0.a(baf.b));
   ku<baf> E = a("prevent_armor_change", $$0 -> $$0.a(baf.b));
   ku<dek> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dek.b));

   static ku<?> a(ke<ku<?>> $$0) {
      return c;
   }

   private static <T> ku<T> a(String $$0, UnaryOperator<ku.a<T>> $$1) {
      return ke.a(mb.as, $$0, $$1.apply(ku.a()).b());
   }
}
