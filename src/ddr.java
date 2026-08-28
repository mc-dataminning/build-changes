import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface ddr {
   Codec<kt<?>> a = Codec.lazyInitialized(() -> ma.as.q());
   Codec<kq> b = kq.a(a);
   kt<List<ddn<dej>>> c = a("damage_protection", $$0 -> $$0.a(ddn.a(dej.b, ezb.t).listOf()));
   kt<List<ddn<def>>> d = a("damage_immunity", $$0 -> $$0.a(ddn.a(def.b, ezb.t).listOf()));
   kt<List<ddn<dej>>> e = a("damage", $$0 -> $$0.a(ddn.a(dej.b, ezb.t).listOf()));
   kt<List<ddn<dej>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(ddn.a(dej.b, ezb.t).listOf()));
   kt<List<ddn<dej>>> g = a("knockback", $$0 -> $$0.a(ddn.a(dej.b, ezb.t).listOf()));
   kt<List<ddn<dej>>> h = a("armor_effectiveness", $$0 -> $$0.a(ddn.a(dej.b, ezb.t).listOf()));
   kt<List<ddz<deh>>> i = a("post_attack", $$0 -> $$0.a(ddz.a(deh.b, ezb.t).listOf()));
   kt<List<ddn<deh>>> j = a("hit_block", $$0 -> $$0.a(ddn.a(deh.b, ezb.x).listOf()));
   kt<List<ddn<dej>>> k = a("item_damage", $$0 -> $$0.a(ddn.a(dej.b, ezb.u).listOf()));
   kt<List<deg>> l = a("attributes", $$0 -> $$0.a(deg.a.codec().listOf()));
   kt<List<ddz<dej>>> m = a("equipment_drops", $$0 -> $$0.a(ddz.b(dej.b, ezb.t).listOf()));
   kt<List<ddn<dei>>> n = a("location_changed", $$0 -> $$0.a(ddn.a(dei.c, ezb.v).listOf()));
   kt<List<ddn<deh>>> o = a("tick", $$0 -> $$0.a(ddn.a(deh.b, ezb.w).listOf()));
   kt<List<ddn<dej>>> p = a("ammo_use", $$0 -> $$0.a(ddn.a(dej.b, ezb.u).listOf()));
   kt<List<ddn<dej>>> q = a("projectile_piercing", $$0 -> $$0.a(ddn.a(dej.b, ezb.u).listOf()));
   kt<List<ddn<deh>>> r = a("projectile_spawned", $$0 -> $$0.a(ddn.a(deh.b, ezb.w).listOf()));
   kt<List<ddn<dej>>> s = a("projectile_spread", $$0 -> $$0.a(ddn.a(dej.b, ezb.w).listOf()));
   kt<List<ddn<dej>>> t = a("projectile_count", $$0 -> $$0.a(ddn.a(dej.b, ezb.w).listOf()));
   kt<List<ddn<dej>>> u = a("trident_return_acceleration", $$0 -> $$0.a(ddn.a(dej.b, ezb.w).listOf()));
   kt<List<ddn<dej>>> v = a("fishing_time_reduction", $$0 -> $$0.a(ddn.a(dej.b, ezb.w).listOf()));
   kt<List<ddn<dej>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(ddn.a(dej.b, ezb.w).listOf()));
   kt<List<ddn<dej>>> x = a("block_experience", $$0 -> $$0.a(ddn.a(dej.b, ezb.u).listOf()));
   kt<List<ddn<dej>>> y = a("mob_experience", $$0 -> $$0.a(ddn.a(dej.b, ezb.w).listOf()));
   kt<List<ddn<dej>>> z = a("repair_with_xp", $$0 -> $$0.a(ddn.a(dej.b, ezb.u).listOf()));
   kt<dej> A = a("crossbow_charge_time", $$0 -> $$0.a(dej.b));
   kt<List<cvx.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cvx.a.a.listOf()));
   kt<List<jq<awu>>> C = a("trident_sound", $$0 -> $$0.a(awu.b.listOf()));
   kt<bba> D = a("prevent_equipment_drop", $$0 -> $$0.a(bba.b));
   kt<bba> E = a("prevent_armor_change", $$0 -> $$0.a(bba.b));
   kt<dej> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dej.b));

   static kt<?> a(kd<kt<?>> $$0) {
      return c;
   }

   private static <T> kt<T> a(String $$0, UnaryOperator<kt.a<T>> $$1) {
      return kd.a(ma.as, $$0, $$1.apply(kt.a()).b());
   }
}
