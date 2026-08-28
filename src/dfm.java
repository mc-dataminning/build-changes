import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dfm {
   Codec<ki<?>> a = Codec.lazyInitialized(() -> mf.aq.q());
   Codec<kg> b = kg.a(a);
   ki<List<dfi<dge>>> c = a("damage_protection", $$0 -> $$0.a(dfi.a(dge.b, fbs.t).listOf()));
   ki<List<dfi<dga>>> d = a("damage_immunity", $$0 -> $$0.a(dfi.a(dga.b, fbs.t).listOf()));
   ki<List<dfi<dge>>> e = a("damage", $$0 -> $$0.a(dfi.a(dge.b, fbs.t).listOf()));
   ki<List<dfi<dge>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dfi.a(dge.b, fbs.t).listOf()));
   ki<List<dfi<dge>>> g = a("knockback", $$0 -> $$0.a(dfi.a(dge.b, fbs.t).listOf()));
   ki<List<dfi<dge>>> h = a("armor_effectiveness", $$0 -> $$0.a(dfi.a(dge.b, fbs.t).listOf()));
   ki<List<dfu<dgc>>> i = a("post_attack", $$0 -> $$0.a(dfu.a(dgc.b, fbs.t).listOf()));
   ki<List<dfi<dgc>>> j = a("hit_block", $$0 -> $$0.a(dfi.a(dgc.b, fbs.x).listOf()));
   ki<List<dfi<dge>>> k = a("item_damage", $$0 -> $$0.a(dfi.a(dge.b, fbs.u).listOf()));
   ki<List<dgb>> l = a("attributes", $$0 -> $$0.a(dgb.a.codec().listOf()));
   ki<List<dfu<dge>>> m = a("equipment_drops", $$0 -> $$0.a(dfu.b(dge.b, fbs.t).listOf()));
   ki<List<dfi<dgd>>> n = a("location_changed", $$0 -> $$0.a(dfi.a(dgd.c, fbs.v).listOf()));
   ki<List<dfi<dgc>>> o = a("tick", $$0 -> $$0.a(dfi.a(dgc.b, fbs.w).listOf()));
   ki<List<dfi<dge>>> p = a("ammo_use", $$0 -> $$0.a(dfi.a(dge.b, fbs.u).listOf()));
   ki<List<dfi<dge>>> q = a("projectile_piercing", $$0 -> $$0.a(dfi.a(dge.b, fbs.u).listOf()));
   ki<List<dfi<dgc>>> r = a("projectile_spawned", $$0 -> $$0.a(dfi.a(dgc.b, fbs.w).listOf()));
   ki<List<dfi<dge>>> s = a("projectile_spread", $$0 -> $$0.a(dfi.a(dge.b, fbs.w).listOf()));
   ki<List<dfi<dge>>> t = a("projectile_count", $$0 -> $$0.a(dfi.a(dge.b, fbs.w).listOf()));
   ki<List<dfi<dge>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dfi.a(dge.b, fbs.w).listOf()));
   ki<List<dfi<dge>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dfi.a(dge.b, fbs.w).listOf()));
   ki<List<dfi<dge>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dfi.a(dge.b, fbs.w).listOf()));
   ki<List<dfi<dge>>> x = a("block_experience", $$0 -> $$0.a(dfi.a(dge.b, fbs.u).listOf()));
   ki<List<dfi<dge>>> y = a("mob_experience", $$0 -> $$0.a(dfi.a(dge.b, fbs.w).listOf()));
   ki<List<dfi<dge>>> z = a("repair_with_xp", $$0 -> $$0.a(dfi.a(dge.b, fbs.u).listOf()));
   ki<dge> A = a("crossbow_charge_time", $$0 -> $$0.a(dge.b));
   ki<List<cxr.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cxr.b.a.listOf()));
   ki<List<je<awm>>> C = a("trident_sound", $$0 -> $$0.a(awm.b.listOf()));
   ki<bau> D = a("prevent_equipment_drop", $$0 -> $$0.a(bau.b));
   ki<bau> E = a("prevent_armor_change", $$0 -> $$0.a(bau.b));
   ki<dge> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dge.b));

   static ki<?> a(jr<ki<?>> $$0) {
      return c;
   }

   private static <T> ki<T> a(String $$0, UnaryOperator<ki.a<T>> $$1) {
      return jr.a(mf.aq, $$0, $$1.apply(ki.a()).b());
   }
}
