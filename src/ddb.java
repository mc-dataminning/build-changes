import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface ddb {
   Codec<ku<?>> a = Codec.lazyInitialized(() -> mb.as.q());
   Codec<kr> b = kr.a(a);
   ku<List<dcx<ddt>>> c = a("damage_protection", $$0 -> $$0.a(dcx.a(ddt.b, eyl.t).listOf()));
   ku<List<dcx<ddp>>> d = a("damage_immunity", $$0 -> $$0.a(dcx.a(ddp.b, eyl.t).listOf()));
   ku<List<dcx<ddt>>> e = a("damage", $$0 -> $$0.a(dcx.a(ddt.b, eyl.t).listOf()));
   ku<List<dcx<ddt>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dcx.a(ddt.b, eyl.t).listOf()));
   ku<List<dcx<ddt>>> g = a("knockback", $$0 -> $$0.a(dcx.a(ddt.b, eyl.t).listOf()));
   ku<List<dcx<ddt>>> h = a("armor_effectiveness", $$0 -> $$0.a(dcx.a(ddt.b, eyl.t).listOf()));
   ku<List<ddj<ddr>>> i = a("post_attack", $$0 -> $$0.a(ddj.a(ddr.b, eyl.t).listOf()));
   ku<List<dcx<ddr>>> j = a("hit_block", $$0 -> $$0.a(dcx.a(ddr.b, eyl.x).listOf()));
   ku<List<dcx<ddt>>> k = a("item_damage", $$0 -> $$0.a(dcx.a(ddt.b, eyl.u).listOf()));
   ku<List<ddq>> l = a("attributes", $$0 -> $$0.a(ddq.a.codec().listOf()));
   ku<List<ddj<ddt>>> m = a("equipment_drops", $$0 -> $$0.a(ddj.b(ddt.b, eyl.t).listOf()));
   ku<List<dcx<dds>>> n = a("location_changed", $$0 -> $$0.a(dcx.a(dds.c, eyl.v).listOf()));
   ku<List<dcx<ddr>>> o = a("tick", $$0 -> $$0.a(dcx.a(ddr.b, eyl.w).listOf()));
   ku<List<dcx<ddt>>> p = a("ammo_use", $$0 -> $$0.a(dcx.a(ddt.b, eyl.u).listOf()));
   ku<List<dcx<ddt>>> q = a("projectile_piercing", $$0 -> $$0.a(dcx.a(ddt.b, eyl.u).listOf()));
   ku<List<dcx<ddr>>> r = a("projectile_spawned", $$0 -> $$0.a(dcx.a(ddr.b, eyl.w).listOf()));
   ku<List<dcx<ddt>>> s = a("projectile_spread", $$0 -> $$0.a(dcx.a(ddt.b, eyl.w).listOf()));
   ku<List<dcx<ddt>>> t = a("projectile_count", $$0 -> $$0.a(dcx.a(ddt.b, eyl.w).listOf()));
   ku<List<dcx<ddt>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dcx.a(ddt.b, eyl.w).listOf()));
   ku<List<dcx<ddt>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dcx.a(ddt.b, eyl.w).listOf()));
   ku<List<dcx<ddt>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dcx.a(ddt.b, eyl.w).listOf()));
   ku<List<dcx<ddt>>> x = a("block_experience", $$0 -> $$0.a(dcx.a(ddt.b, eyl.u).listOf()));
   ku<List<dcx<ddt>>> y = a("mob_experience", $$0 -> $$0.a(dcx.a(ddt.b, eyl.w).listOf()));
   ku<List<dcx<ddt>>> z = a("repair_with_xp", $$0 -> $$0.a(dcx.a(ddt.b, eyl.u).listOf()));
   ku<ddt> A = a("crossbow_charge_time", $$0 -> $$0.a(ddt.b));
   ku<List<cvh.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cvh.b.a.listOf()));
   ku<List<jr<avz>>> C = a("trident_sound", $$0 -> $$0.a(avz.b.listOf()));
   ku<baf> D = a("prevent_equipment_drop", $$0 -> $$0.a(baf.b));
   ku<baf> E = a("prevent_armor_change", $$0 -> $$0.a(baf.b));
   ku<ddt> F = a("trident_spin_attack_strength", $$0 -> $$0.a(ddt.b));

   static ku<?> a(ke<ku<?>> $$0) {
      return c;
   }

   private static <T> ku<T> a(String $$0, UnaryOperator<ku.a<T>> $$1) {
      return ke.a(mb.as, $$0, $$1.apply(ku.a()).b());
   }
}
