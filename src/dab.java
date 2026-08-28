import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dab {
   Codec<kp<?>> a = Codec.lazyInitialized(() -> lt.au.r());
   Codec<km> b = km.a(a);
   kp<List<czy<das>>> c = a("damage_protection", $$0 -> $$0.a(czy.a(das.b, eug.t).listOf()));
   kp<List<czy<dan>>> d = a("damage_immunity", $$0 -> $$0.a(czy.a(dan.b, eug.t).listOf()));
   kp<List<czy<das>>> e = a("damage", $$0 -> $$0.a(czy.a(das.b, eug.t).listOf()));
   kp<List<czy<das>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(czy.a(das.b, eug.t).listOf()));
   kp<List<czy<das>>> g = a("knockback", $$0 -> $$0.a(czy.a(das.b, eug.t).listOf()));
   kp<List<czy<das>>> h = a("armor_effectiveness", $$0 -> $$0.a(czy.a(das.b, eug.t).listOf()));
   kp<List<dai<daq>>> i = a("post_attack", $$0 -> $$0.a(dai.a(daq.b, eug.t).listOf()));
   kp<List<czy<daq>>> j = a("hit_block", $$0 -> $$0.a(czy.a(daq.b, eug.x).listOf()));
   kp<List<czy<das>>> k = a("item_damage", $$0 -> $$0.a(czy.a(das.b, eug.u).listOf()));
   kp<List<dap>> l = a("attributes", $$0 -> $$0.a(dap.a.codec().listOf()));
   kp<List<dai<das>>> m = a("equipment_drops", $$0 -> $$0.a(dai.b(das.b, eug.t).listOf()));
   kp<List<czy<dar>>> n = a("location_changed", $$0 -> $$0.a(czy.a(dar.c, eug.v).listOf()));
   kp<List<czy<daq>>> o = a("tick", $$0 -> $$0.a(czy.a(daq.b, eug.w).listOf()));
   kp<List<czy<das>>> p = a("ammo_use", $$0 -> $$0.a(czy.a(das.b, eug.u).listOf()));
   kp<List<czy<das>>> q = a("projectile_piercing", $$0 -> $$0.a(czy.a(das.b, eug.u).listOf()));
   kp<List<czy<daq>>> r = a("projectile_spawned", $$0 -> $$0.a(czy.a(daq.b, eug.w).listOf()));
   kp<List<czy<das>>> s = a("projectile_spread", $$0 -> $$0.a(czy.a(das.b, eug.w).listOf()));
   kp<List<czy<das>>> t = a("projectile_count", $$0 -> $$0.a(czy.a(das.b, eug.w).listOf()));
   kp<List<czy<das>>> u = a("trident_return_acceleration", $$0 -> $$0.a(czy.a(das.b, eug.w).listOf()));
   kp<List<czy<das>>> v = a("fishing_time_reduction", $$0 -> $$0.a(czy.a(das.b, eug.w).listOf()));
   kp<List<czy<das>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(czy.a(das.b, eug.w).listOf()));
   kp<List<czy<das>>> x = a("block_experience", $$0 -> $$0.a(czy.a(das.b, eug.u).listOf()));
   kp<List<czy<das>>> y = a("mob_experience", $$0 -> $$0.a(czy.a(das.b, eug.w).listOf()));
   kp<List<czy<das>>> z = a("repair_with_xp", $$0 -> $$0.a(czy.a(das.b, eug.u).listOf()));
   kp<das> A = a("crossbow_charge_time", $$0 -> $$0.a(das.b));
   kp<List<cta.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cta.a.a.listOf()));
   kp<List<jm<avn>>> C = a("trident_sound", $$0 -> $$0.a(avn.b.listOf()));
   kp<azr> D = a("prevent_equipment_drop", $$0 -> $$0.a(azr.b));
   kp<azr> E = a("prevent_armor_change", $$0 -> $$0.a(azr.b));
   kp<das> F = a("trident_spin_attack_strength", $$0 -> $$0.a(das.b));

   static kp<?> a(jz<kp<?>> $$0) {
      return c;
   }

   private static <T> kp<T> a(String $$0, UnaryOperator<kp.a<T>> $$1) {
      return jz.a(lt.au, $$0, $$1.apply(kp.a()).b());
   }
}
