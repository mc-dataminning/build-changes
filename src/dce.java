import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dce {
   Codec<kt<?>> a = Codec.lazyInitialized(() -> lz.as.q());
   Codec<kq> b = kq.a(a);
   kt<List<dca<dcw>>> c = a("damage_protection", $$0 -> $$0.a(dca.a(dcw.b, exi.t).listOf()));
   kt<List<dca<dcr>>> d = a("damage_immunity", $$0 -> $$0.a(dca.a(dcr.b, exi.t).listOf()));
   kt<List<dca<dcw>>> e = a("damage", $$0 -> $$0.a(dca.a(dcw.b, exi.t).listOf()));
   kt<List<dca<dcw>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dca.a(dcw.b, exi.t).listOf()));
   kt<List<dca<dcw>>> g = a("knockback", $$0 -> $$0.a(dca.a(dcw.b, exi.t).listOf()));
   kt<List<dca<dcw>>> h = a("armor_effectiveness", $$0 -> $$0.a(dca.a(dcw.b, exi.t).listOf()));
   kt<List<dcm<dcu>>> i = a("post_attack", $$0 -> $$0.a(dcm.a(dcu.b, exi.t).listOf()));
   kt<List<dca<dcu>>> j = a("hit_block", $$0 -> $$0.a(dca.a(dcu.b, exi.x).listOf()));
   kt<List<dca<dcw>>> k = a("item_damage", $$0 -> $$0.a(dca.a(dcw.b, exi.u).listOf()));
   kt<List<dct>> l = a("attributes", $$0 -> $$0.a(dct.a.codec().listOf()));
   kt<List<dcm<dcw>>> m = a("equipment_drops", $$0 -> $$0.a(dcm.b(dcw.b, exi.t).listOf()));
   kt<List<dca<dcv>>> n = a("location_changed", $$0 -> $$0.a(dca.a(dcv.c, exi.v).listOf()));
   kt<List<dca<dcu>>> o = a("tick", $$0 -> $$0.a(dca.a(dcu.b, exi.w).listOf()));
   kt<List<dca<dcw>>> p = a("ammo_use", $$0 -> $$0.a(dca.a(dcw.b, exi.u).listOf()));
   kt<List<dca<dcw>>> q = a("projectile_piercing", $$0 -> $$0.a(dca.a(dcw.b, exi.u).listOf()));
   kt<List<dca<dcu>>> r = a("projectile_spawned", $$0 -> $$0.a(dca.a(dcu.b, exi.w).listOf()));
   kt<List<dca<dcw>>> s = a("projectile_spread", $$0 -> $$0.a(dca.a(dcw.b, exi.w).listOf()));
   kt<List<dca<dcw>>> t = a("projectile_count", $$0 -> $$0.a(dca.a(dcw.b, exi.w).listOf()));
   kt<List<dca<dcw>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dca.a(dcw.b, exi.w).listOf()));
   kt<List<dca<dcw>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dca.a(dcw.b, exi.w).listOf()));
   kt<List<dca<dcw>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dca.a(dcw.b, exi.w).listOf()));
   kt<List<dca<dcw>>> x = a("block_experience", $$0 -> $$0.a(dca.a(dcw.b, exi.u).listOf()));
   kt<List<dca<dcw>>> y = a("mob_experience", $$0 -> $$0.a(dca.a(dcw.b, exi.w).listOf()));
   kt<List<dca<dcw>>> z = a("repair_with_xp", $$0 -> $$0.a(dca.a(dcw.b, exi.u).listOf()));
   kt<dcw> A = a("crossbow_charge_time", $$0 -> $$0.a(dcw.b));
   kt<List<cvd.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cvd.a.a.listOf()));
   kt<List<jq<awm>>> C = a("trident_sound", $$0 -> $$0.a(awm.b.listOf()));
   kt<bas> D = a("prevent_equipment_drop", $$0 -> $$0.a(bas.b));
   kt<bas> E = a("prevent_armor_change", $$0 -> $$0.a(bas.b));
   kt<dcw> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dcw.b));

   static kt<?> a(kd<kt<?>> $$0) {
      return c;
   }

   private static <T> kt<T> a(String $$0, UnaryOperator<kt.a<T>> $$1) {
      return kd.a(lz.as, $$0, $$1.apply(kt.a()).b());
   }
}
