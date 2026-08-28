import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dbt {
   Codec<kt<?>> a = Codec.lazyInitialized(() -> ly.as.q());
   Codec<kq> b = kq.a(a);
   kt<List<dbp<dcl>>> c = a("damage_protection", $$0 -> $$0.a(dbp.a(dcl.b, ewx.t).listOf()));
   kt<List<dbp<dcg>>> d = a("damage_immunity", $$0 -> $$0.a(dbp.a(dcg.b, ewx.t).listOf()));
   kt<List<dbp<dcl>>> e = a("damage", $$0 -> $$0.a(dbp.a(dcl.b, ewx.t).listOf()));
   kt<List<dbp<dcl>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dbp.a(dcl.b, ewx.t).listOf()));
   kt<List<dbp<dcl>>> g = a("knockback", $$0 -> $$0.a(dbp.a(dcl.b, ewx.t).listOf()));
   kt<List<dbp<dcl>>> h = a("armor_effectiveness", $$0 -> $$0.a(dbp.a(dcl.b, ewx.t).listOf()));
   kt<List<dcb<dcj>>> i = a("post_attack", $$0 -> $$0.a(dcb.a(dcj.b, ewx.t).listOf()));
   kt<List<dbp<dcj>>> j = a("hit_block", $$0 -> $$0.a(dbp.a(dcj.b, ewx.x).listOf()));
   kt<List<dbp<dcl>>> k = a("item_damage", $$0 -> $$0.a(dbp.a(dcl.b, ewx.u).listOf()));
   kt<List<dci>> l = a("attributes", $$0 -> $$0.a(dci.a.codec().listOf()));
   kt<List<dcb<dcl>>> m = a("equipment_drops", $$0 -> $$0.a(dcb.b(dcl.b, ewx.t).listOf()));
   kt<List<dbp<dck>>> n = a("location_changed", $$0 -> $$0.a(dbp.a(dck.c, ewx.v).listOf()));
   kt<List<dbp<dcj>>> o = a("tick", $$0 -> $$0.a(dbp.a(dcj.b, ewx.w).listOf()));
   kt<List<dbp<dcl>>> p = a("ammo_use", $$0 -> $$0.a(dbp.a(dcl.b, ewx.u).listOf()));
   kt<List<dbp<dcl>>> q = a("projectile_piercing", $$0 -> $$0.a(dbp.a(dcl.b, ewx.u).listOf()));
   kt<List<dbp<dcj>>> r = a("projectile_spawned", $$0 -> $$0.a(dbp.a(dcj.b, ewx.w).listOf()));
   kt<List<dbp<dcl>>> s = a("projectile_spread", $$0 -> $$0.a(dbp.a(dcl.b, ewx.w).listOf()));
   kt<List<dbp<dcl>>> t = a("projectile_count", $$0 -> $$0.a(dbp.a(dcl.b, ewx.w).listOf()));
   kt<List<dbp<dcl>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dbp.a(dcl.b, ewx.w).listOf()));
   kt<List<dbp<dcl>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dbp.a(dcl.b, ewx.w).listOf()));
   kt<List<dbp<dcl>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dbp.a(dcl.b, ewx.w).listOf()));
   kt<List<dbp<dcl>>> x = a("block_experience", $$0 -> $$0.a(dbp.a(dcl.b, ewx.u).listOf()));
   kt<List<dbp<dcl>>> y = a("mob_experience", $$0 -> $$0.a(dbp.a(dcl.b, ewx.w).listOf()));
   kt<List<dbp<dcl>>> z = a("repair_with_xp", $$0 -> $$0.a(dbp.a(dcl.b, ewx.u).listOf()));
   kt<dcl> A = a("crossbow_charge_time", $$0 -> $$0.a(dcl.b));
   kt<List<cus.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cus.a.a.listOf()));
   kt<List<jq<awk>>> C = a("trident_sound", $$0 -> $$0.a(awk.b.listOf()));
   kt<bap> D = a("prevent_equipment_drop", $$0 -> $$0.a(bap.b));
   kt<bap> E = a("prevent_armor_change", $$0 -> $$0.a(bap.b));
   kt<dcl> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dcl.b));

   static kt<?> a(kd<kt<?>> $$0) {
      return c;
   }

   private static <T> kt<T> a(String $$0, UnaryOperator<kt.a<T>> $$1) {
      return kd.a(ly.as, $$0, $$1.apply(kt.a()).b());
   }
}
