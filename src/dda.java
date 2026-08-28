import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dda {
   Codec<ku<?>> a = Codec.lazyInitialized(() -> mb.as.q());
   Codec<kr> b = kr.a(a);
   ku<List<dcw<dds>>> c = a("damage_protection", $$0 -> $$0.a(dcw.a(dds.b, eyk.t).listOf()));
   ku<List<dcw<ddo>>> d = a("damage_immunity", $$0 -> $$0.a(dcw.a(ddo.b, eyk.t).listOf()));
   ku<List<dcw<dds>>> e = a("damage", $$0 -> $$0.a(dcw.a(dds.b, eyk.t).listOf()));
   ku<List<dcw<dds>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dcw.a(dds.b, eyk.t).listOf()));
   ku<List<dcw<dds>>> g = a("knockback", $$0 -> $$0.a(dcw.a(dds.b, eyk.t).listOf()));
   ku<List<dcw<dds>>> h = a("armor_effectiveness", $$0 -> $$0.a(dcw.a(dds.b, eyk.t).listOf()));
   ku<List<ddi<ddq>>> i = a("post_attack", $$0 -> $$0.a(ddi.a(ddq.b, eyk.t).listOf()));
   ku<List<dcw<ddq>>> j = a("hit_block", $$0 -> $$0.a(dcw.a(ddq.b, eyk.x).listOf()));
   ku<List<dcw<dds>>> k = a("item_damage", $$0 -> $$0.a(dcw.a(dds.b, eyk.u).listOf()));
   ku<List<ddp>> l = a("attributes", $$0 -> $$0.a(ddp.a.codec().listOf()));
   ku<List<ddi<dds>>> m = a("equipment_drops", $$0 -> $$0.a(ddi.b(dds.b, eyk.t).listOf()));
   ku<List<dcw<ddr>>> n = a("location_changed", $$0 -> $$0.a(dcw.a(ddr.c, eyk.v).listOf()));
   ku<List<dcw<ddq>>> o = a("tick", $$0 -> $$0.a(dcw.a(ddq.b, eyk.w).listOf()));
   ku<List<dcw<dds>>> p = a("ammo_use", $$0 -> $$0.a(dcw.a(dds.b, eyk.u).listOf()));
   ku<List<dcw<dds>>> q = a("projectile_piercing", $$0 -> $$0.a(dcw.a(dds.b, eyk.u).listOf()));
   ku<List<dcw<ddq>>> r = a("projectile_spawned", $$0 -> $$0.a(dcw.a(ddq.b, eyk.w).listOf()));
   ku<List<dcw<dds>>> s = a("projectile_spread", $$0 -> $$0.a(dcw.a(dds.b, eyk.w).listOf()));
   ku<List<dcw<dds>>> t = a("projectile_count", $$0 -> $$0.a(dcw.a(dds.b, eyk.w).listOf()));
   ku<List<dcw<dds>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dcw.a(dds.b, eyk.w).listOf()));
   ku<List<dcw<dds>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dcw.a(dds.b, eyk.w).listOf()));
   ku<List<dcw<dds>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dcw.a(dds.b, eyk.w).listOf()));
   ku<List<dcw<dds>>> x = a("block_experience", $$0 -> $$0.a(dcw.a(dds.b, eyk.u).listOf()));
   ku<List<dcw<dds>>> y = a("mob_experience", $$0 -> $$0.a(dcw.a(dds.b, eyk.w).listOf()));
   ku<List<dcw<dds>>> z = a("repair_with_xp", $$0 -> $$0.a(dcw.a(dds.b, eyk.u).listOf()));
   ku<dds> A = a("crossbow_charge_time", $$0 -> $$0.a(dds.b));
   ku<List<cvg.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cvg.b.a.listOf()));
   ku<List<jr<avz>>> C = a("trident_sound", $$0 -> $$0.a(avz.b.listOf()));
   ku<baf> D = a("prevent_equipment_drop", $$0 -> $$0.a(baf.b));
   ku<baf> E = a("prevent_armor_change", $$0 -> $$0.a(baf.b));
   ku<dds> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dds.b));

   static ku<?> a(ke<ku<?>> $$0) {
      return c;
   }

   private static <T> ku<T> a(String $$0, UnaryOperator<ku.a<T>> $$1) {
      return ke.a(mb.as, $$0, $$1.apply(ku.a()).b());
   }
}
