import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dfy {
   Codec<kj<?>> a = Codec.lazyInitialized(() -> mg.aq.q());
   Codec<kh> b = kh.a(a);
   kj<List<dfu<dgq>>> c = a("damage_protection", $$0 -> $$0.a(dfu.a(dgq.b, fch.t).listOf()));
   kj<List<dfu<dgm>>> d = a("damage_immunity", $$0 -> $$0.a(dfu.a(dgm.b, fch.t).listOf()));
   kj<List<dfu<dgq>>> e = a("damage", $$0 -> $$0.a(dfu.a(dgq.b, fch.t).listOf()));
   kj<List<dfu<dgq>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dfu.a(dgq.b, fch.t).listOf()));
   kj<List<dfu<dgq>>> g = a("knockback", $$0 -> $$0.a(dfu.a(dgq.b, fch.t).listOf()));
   kj<List<dfu<dgq>>> h = a("armor_effectiveness", $$0 -> $$0.a(dfu.a(dgq.b, fch.t).listOf()));
   kj<List<dgg<dgo>>> i = a("post_attack", $$0 -> $$0.a(dgg.a(dgo.b, fch.t).listOf()));
   kj<List<dfu<dgo>>> j = a("hit_block", $$0 -> $$0.a(dfu.a(dgo.b, fch.x).listOf()));
   kj<List<dfu<dgq>>> k = a("item_damage", $$0 -> $$0.a(dfu.a(dgq.b, fch.u).listOf()));
   kj<List<dgn>> l = a("attributes", $$0 -> $$0.a(dgn.a.codec().listOf()));
   kj<List<dgg<dgq>>> m = a("equipment_drops", $$0 -> $$0.a(dgg.b(dgq.b, fch.t).listOf()));
   kj<List<dfu<dgp>>> n = a("location_changed", $$0 -> $$0.a(dfu.a(dgp.c, fch.v).listOf()));
   kj<List<dfu<dgo>>> o = a("tick", $$0 -> $$0.a(dfu.a(dgo.b, fch.w).listOf()));
   kj<List<dfu<dgq>>> p = a("ammo_use", $$0 -> $$0.a(dfu.a(dgq.b, fch.u).listOf()));
   kj<List<dfu<dgq>>> q = a("projectile_piercing", $$0 -> $$0.a(dfu.a(dgq.b, fch.u).listOf()));
   kj<List<dfu<dgo>>> r = a("projectile_spawned", $$0 -> $$0.a(dfu.a(dgo.b, fch.w).listOf()));
   kj<List<dfu<dgq>>> s = a("projectile_spread", $$0 -> $$0.a(dfu.a(dgq.b, fch.w).listOf()));
   kj<List<dfu<dgq>>> t = a("projectile_count", $$0 -> $$0.a(dfu.a(dgq.b, fch.w).listOf()));
   kj<List<dfu<dgq>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dfu.a(dgq.b, fch.w).listOf()));
   kj<List<dfu<dgq>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dfu.a(dgq.b, fch.w).listOf()));
   kj<List<dfu<dgq>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dfu.a(dgq.b, fch.w).listOf()));
   kj<List<dfu<dgq>>> x = a("block_experience", $$0 -> $$0.a(dfu.a(dgq.b, fch.u).listOf()));
   kj<List<dfu<dgq>>> y = a("mob_experience", $$0 -> $$0.a(dfu.a(dgq.b, fch.w).listOf()));
   kj<List<dfu<dgq>>> z = a("repair_with_xp", $$0 -> $$0.a(dfu.a(dgq.b, fch.u).listOf()));
   kj<dgq> A = a("crossbow_charge_time", $$0 -> $$0.a(dgq.b));
   kj<List<cyd.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cyd.b.a.listOf()));
   kj<List<jf<awm>>> C = a("trident_sound", $$0 -> $$0.a(awm.b.listOf()));
   kj<bau> D = a("prevent_equipment_drop", $$0 -> $$0.a(bau.b));
   kj<bau> E = a("prevent_armor_change", $$0 -> $$0.a(bau.b));
   kj<dgq> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dgq.b));

   static kj<?> a(js<kj<?>> $$0) {
      return c;
   }

   private static <T> kj<T> a(String $$0, UnaryOperator<kj.a<T>> $$1) {
      return js.a(mg.aq, $$0, $$1.apply(kj.a()).b());
   }
}
