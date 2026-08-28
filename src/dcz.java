import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dcz {
   Codec<ku<?>> a = Codec.lazyInitialized(() -> mb.as.q());
   Codec<kr> b = kr.a(a);
   ku<List<dcv<ddr>>> c = a("damage_protection", $$0 -> $$0.a(dcv.a(ddr.b, eyj.t).listOf()));
   ku<List<dcv<ddn>>> d = a("damage_immunity", $$0 -> $$0.a(dcv.a(ddn.b, eyj.t).listOf()));
   ku<List<dcv<ddr>>> e = a("damage", $$0 -> $$0.a(dcv.a(ddr.b, eyj.t).listOf()));
   ku<List<dcv<ddr>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dcv.a(ddr.b, eyj.t).listOf()));
   ku<List<dcv<ddr>>> g = a("knockback", $$0 -> $$0.a(dcv.a(ddr.b, eyj.t).listOf()));
   ku<List<dcv<ddr>>> h = a("armor_effectiveness", $$0 -> $$0.a(dcv.a(ddr.b, eyj.t).listOf()));
   ku<List<ddh<ddp>>> i = a("post_attack", $$0 -> $$0.a(ddh.a(ddp.b, eyj.t).listOf()));
   ku<List<dcv<ddp>>> j = a("hit_block", $$0 -> $$0.a(dcv.a(ddp.b, eyj.x).listOf()));
   ku<List<dcv<ddr>>> k = a("item_damage", $$0 -> $$0.a(dcv.a(ddr.b, eyj.u).listOf()));
   ku<List<ddo>> l = a("attributes", $$0 -> $$0.a(ddo.a.codec().listOf()));
   ku<List<ddh<ddr>>> m = a("equipment_drops", $$0 -> $$0.a(ddh.b(ddr.b, eyj.t).listOf()));
   ku<List<dcv<ddq>>> n = a("location_changed", $$0 -> $$0.a(dcv.a(ddq.c, eyj.v).listOf()));
   ku<List<dcv<ddp>>> o = a("tick", $$0 -> $$0.a(dcv.a(ddp.b, eyj.w).listOf()));
   ku<List<dcv<ddr>>> p = a("ammo_use", $$0 -> $$0.a(dcv.a(ddr.b, eyj.u).listOf()));
   ku<List<dcv<ddr>>> q = a("projectile_piercing", $$0 -> $$0.a(dcv.a(ddr.b, eyj.u).listOf()));
   ku<List<dcv<ddp>>> r = a("projectile_spawned", $$0 -> $$0.a(dcv.a(ddp.b, eyj.w).listOf()));
   ku<List<dcv<ddr>>> s = a("projectile_spread", $$0 -> $$0.a(dcv.a(ddr.b, eyj.w).listOf()));
   ku<List<dcv<ddr>>> t = a("projectile_count", $$0 -> $$0.a(dcv.a(ddr.b, eyj.w).listOf()));
   ku<List<dcv<ddr>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dcv.a(ddr.b, eyj.w).listOf()));
   ku<List<dcv<ddr>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dcv.a(ddr.b, eyj.w).listOf()));
   ku<List<dcv<ddr>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dcv.a(ddr.b, eyj.w).listOf()));
   ku<List<dcv<ddr>>> x = a("block_experience", $$0 -> $$0.a(dcv.a(ddr.b, eyj.u).listOf()));
   ku<List<dcv<ddr>>> y = a("mob_experience", $$0 -> $$0.a(dcv.a(ddr.b, eyj.w).listOf()));
   ku<List<dcv<ddr>>> z = a("repair_with_xp", $$0 -> $$0.a(dcv.a(ddr.b, eyj.u).listOf()));
   ku<ddr> A = a("crossbow_charge_time", $$0 -> $$0.a(ddr.b));
   ku<List<cvf.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cvf.b.a.listOf()));
   ku<List<jr<avz>>> C = a("trident_sound", $$0 -> $$0.a(avz.b.listOf()));
   ku<baf> D = a("prevent_equipment_drop", $$0 -> $$0.a(baf.b));
   ku<baf> E = a("prevent_armor_change", $$0 -> $$0.a(baf.b));
   ku<ddr> F = a("trident_spin_attack_strength", $$0 -> $$0.a(ddr.b));

   static ku<?> a(ke<ku<?>> $$0) {
      return c;
   }

   private static <T> ku<T> a(String $$0, UnaryOperator<ku.a<T>> $$1) {
      return ke.a(mb.as, $$0, $$1.apply(ku.a()).b());
   }
}
