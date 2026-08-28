import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dbx {
   Codec<kt<?>> a = Codec.lazyInitialized(() -> lz.as.q());
   Codec<kq> b = kq.a(a);
   kt<List<dbt<dcp>>> c = a("damage_protection", $$0 -> $$0.a(dbt.a(dcp.b, exb.t).listOf()));
   kt<List<dbt<dck>>> d = a("damage_immunity", $$0 -> $$0.a(dbt.a(dck.b, exb.t).listOf()));
   kt<List<dbt<dcp>>> e = a("damage", $$0 -> $$0.a(dbt.a(dcp.b, exb.t).listOf()));
   kt<List<dbt<dcp>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dbt.a(dcp.b, exb.t).listOf()));
   kt<List<dbt<dcp>>> g = a("knockback", $$0 -> $$0.a(dbt.a(dcp.b, exb.t).listOf()));
   kt<List<dbt<dcp>>> h = a("armor_effectiveness", $$0 -> $$0.a(dbt.a(dcp.b, exb.t).listOf()));
   kt<List<dcf<dcn>>> i = a("post_attack", $$0 -> $$0.a(dcf.a(dcn.b, exb.t).listOf()));
   kt<List<dbt<dcn>>> j = a("hit_block", $$0 -> $$0.a(dbt.a(dcn.b, exb.x).listOf()));
   kt<List<dbt<dcp>>> k = a("item_damage", $$0 -> $$0.a(dbt.a(dcp.b, exb.u).listOf()));
   kt<List<dcm>> l = a("attributes", $$0 -> $$0.a(dcm.a.codec().listOf()));
   kt<List<dcf<dcp>>> m = a("equipment_drops", $$0 -> $$0.a(dcf.b(dcp.b, exb.t).listOf()));
   kt<List<dbt<dco>>> n = a("location_changed", $$0 -> $$0.a(dbt.a(dco.c, exb.v).listOf()));
   kt<List<dbt<dcn>>> o = a("tick", $$0 -> $$0.a(dbt.a(dcn.b, exb.w).listOf()));
   kt<List<dbt<dcp>>> p = a("ammo_use", $$0 -> $$0.a(dbt.a(dcp.b, exb.u).listOf()));
   kt<List<dbt<dcp>>> q = a("projectile_piercing", $$0 -> $$0.a(dbt.a(dcp.b, exb.u).listOf()));
   kt<List<dbt<dcn>>> r = a("projectile_spawned", $$0 -> $$0.a(dbt.a(dcn.b, exb.w).listOf()));
   kt<List<dbt<dcp>>> s = a("projectile_spread", $$0 -> $$0.a(dbt.a(dcp.b, exb.w).listOf()));
   kt<List<dbt<dcp>>> t = a("projectile_count", $$0 -> $$0.a(dbt.a(dcp.b, exb.w).listOf()));
   kt<List<dbt<dcp>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dbt.a(dcp.b, exb.w).listOf()));
   kt<List<dbt<dcp>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dbt.a(dcp.b, exb.w).listOf()));
   kt<List<dbt<dcp>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dbt.a(dcp.b, exb.w).listOf()));
   kt<List<dbt<dcp>>> x = a("block_experience", $$0 -> $$0.a(dbt.a(dcp.b, exb.u).listOf()));
   kt<List<dbt<dcp>>> y = a("mob_experience", $$0 -> $$0.a(dbt.a(dcp.b, exb.w).listOf()));
   kt<List<dbt<dcp>>> z = a("repair_with_xp", $$0 -> $$0.a(dbt.a(dcp.b, exb.u).listOf()));
   kt<dcp> A = a("crossbow_charge_time", $$0 -> $$0.a(dcp.b));
   kt<List<cuw.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cuw.a.a.listOf()));
   kt<List<jq<awn>>> C = a("trident_sound", $$0 -> $$0.a(awn.b.listOf()));
   kt<bat> D = a("prevent_equipment_drop", $$0 -> $$0.a(bat.b));
   kt<bat> E = a("prevent_armor_change", $$0 -> $$0.a(bat.b));
   kt<dcp> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dcp.b));

   static kt<?> a(kd<kt<?>> $$0) {
      return c;
   }

   private static <T> kt<T> a(String $$0, UnaryOperator<kt.a<T>> $$1) {
      return kd.a(lz.as, $$0, $$1.apply(kt.a()).b());
   }
}
