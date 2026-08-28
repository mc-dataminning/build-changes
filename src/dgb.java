import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dgb {
   Codec<kj<?>> a = Codec.lazyInitialized(() -> mg.aq.q());
   Codec<kh> b = kh.a(a);
   kj<List<dfx<dgt>>> c = a("damage_protection", $$0 -> $$0.a(dfx.a(dgt.b, fcm.t).listOf()));
   kj<List<dfx<dgp>>> d = a("damage_immunity", $$0 -> $$0.a(dfx.a(dgp.b, fcm.t).listOf()));
   kj<List<dfx<dgt>>> e = a("damage", $$0 -> $$0.a(dfx.a(dgt.b, fcm.t).listOf()));
   kj<List<dfx<dgt>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dfx.a(dgt.b, fcm.t).listOf()));
   kj<List<dfx<dgt>>> g = a("knockback", $$0 -> $$0.a(dfx.a(dgt.b, fcm.t).listOf()));
   kj<List<dfx<dgt>>> h = a("armor_effectiveness", $$0 -> $$0.a(dfx.a(dgt.b, fcm.t).listOf()));
   kj<List<dgj<dgr>>> i = a("post_attack", $$0 -> $$0.a(dgj.a(dgr.b, fcm.t).listOf()));
   kj<List<dfx<dgr>>> j = a("hit_block", $$0 -> $$0.a(dfx.a(dgr.b, fcm.x).listOf()));
   kj<List<dfx<dgt>>> k = a("item_damage", $$0 -> $$0.a(dfx.a(dgt.b, fcm.u).listOf()));
   kj<List<dgq>> l = a("attributes", $$0 -> $$0.a(dgq.a.codec().listOf()));
   kj<List<dgj<dgt>>> m = a("equipment_drops", $$0 -> $$0.a(dgj.b(dgt.b, fcm.t).listOf()));
   kj<List<dfx<dgs>>> n = a("location_changed", $$0 -> $$0.a(dfx.a(dgs.c, fcm.v).listOf()));
   kj<List<dfx<dgr>>> o = a("tick", $$0 -> $$0.a(dfx.a(dgr.b, fcm.w).listOf()));
   kj<List<dfx<dgt>>> p = a("ammo_use", $$0 -> $$0.a(dfx.a(dgt.b, fcm.u).listOf()));
   kj<List<dfx<dgt>>> q = a("projectile_piercing", $$0 -> $$0.a(dfx.a(dgt.b, fcm.u).listOf()));
   kj<List<dfx<dgr>>> r = a("projectile_spawned", $$0 -> $$0.a(dfx.a(dgr.b, fcm.w).listOf()));
   kj<List<dfx<dgt>>> s = a("projectile_spread", $$0 -> $$0.a(dfx.a(dgt.b, fcm.w).listOf()));
   kj<List<dfx<dgt>>> t = a("projectile_count", $$0 -> $$0.a(dfx.a(dgt.b, fcm.w).listOf()));
   kj<List<dfx<dgt>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dfx.a(dgt.b, fcm.w).listOf()));
   kj<List<dfx<dgt>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dfx.a(dgt.b, fcm.w).listOf()));
   kj<List<dfx<dgt>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dfx.a(dgt.b, fcm.w).listOf()));
   kj<List<dfx<dgt>>> x = a("block_experience", $$0 -> $$0.a(dfx.a(dgt.b, fcm.u).listOf()));
   kj<List<dfx<dgt>>> y = a("mob_experience", $$0 -> $$0.a(dfx.a(dgt.b, fcm.w).listOf()));
   kj<List<dfx<dgt>>> z = a("repair_with_xp", $$0 -> $$0.a(dfx.a(dgt.b, fcm.u).listOf()));
   kj<dgt> A = a("crossbow_charge_time", $$0 -> $$0.a(dgt.b));
   kj<List<cyg.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cyg.b.a.listOf()));
   kj<List<jf<awm>>> C = a("trident_sound", $$0 -> $$0.a(awm.b.listOf()));
   kj<bau> D = a("prevent_equipment_drop", $$0 -> $$0.a(bau.b));
   kj<bau> E = a("prevent_armor_change", $$0 -> $$0.a(bau.b));
   kj<dgt> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dgt.b));

   static kj<?> a(js<kj<?>> $$0) {
      return c;
   }

   private static <T> kj<T> a(String $$0, UnaryOperator<kj.a<T>> $$1) {
      return js.a(mg.aq, $$0, $$1.apply(kj.a()).b());
   }
}
