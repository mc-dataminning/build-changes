import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dbn {
   Codec<ks<?>> a = Codec.lazyInitialized(() -> lx.as.q());
   Codec<kp> b = kp.a(a);
   ks<List<dbj<dcf>>> c = a("damage_protection", $$0 -> $$0.a(dbj.a(dcf.b, ewr.t).listOf()));
   ks<List<dbj<dca>>> d = a("damage_immunity", $$0 -> $$0.a(dbj.a(dca.b, ewr.t).listOf()));
   ks<List<dbj<dcf>>> e = a("damage", $$0 -> $$0.a(dbj.a(dcf.b, ewr.t).listOf()));
   ks<List<dbj<dcf>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dbj.a(dcf.b, ewr.t).listOf()));
   ks<List<dbj<dcf>>> g = a("knockback", $$0 -> $$0.a(dbj.a(dcf.b, ewr.t).listOf()));
   ks<List<dbj<dcf>>> h = a("armor_effectiveness", $$0 -> $$0.a(dbj.a(dcf.b, ewr.t).listOf()));
   ks<List<dbv<dcd>>> i = a("post_attack", $$0 -> $$0.a(dbv.a(dcd.b, ewr.t).listOf()));
   ks<List<dbj<dcd>>> j = a("hit_block", $$0 -> $$0.a(dbj.a(dcd.b, ewr.x).listOf()));
   ks<List<dbj<dcf>>> k = a("item_damage", $$0 -> $$0.a(dbj.a(dcf.b, ewr.u).listOf()));
   ks<List<dcc>> l = a("attributes", $$0 -> $$0.a(dcc.a.codec().listOf()));
   ks<List<dbv<dcf>>> m = a("equipment_drops", $$0 -> $$0.a(dbv.b(dcf.b, ewr.t).listOf()));
   ks<List<dbj<dce>>> n = a("location_changed", $$0 -> $$0.a(dbj.a(dce.c, ewr.v).listOf()));
   ks<List<dbj<dcd>>> o = a("tick", $$0 -> $$0.a(dbj.a(dcd.b, ewr.w).listOf()));
   ks<List<dbj<dcf>>> p = a("ammo_use", $$0 -> $$0.a(dbj.a(dcf.b, ewr.u).listOf()));
   ks<List<dbj<dcf>>> q = a("projectile_piercing", $$0 -> $$0.a(dbj.a(dcf.b, ewr.u).listOf()));
   ks<List<dbj<dcd>>> r = a("projectile_spawned", $$0 -> $$0.a(dbj.a(dcd.b, ewr.w).listOf()));
   ks<List<dbj<dcf>>> s = a("projectile_spread", $$0 -> $$0.a(dbj.a(dcf.b, ewr.w).listOf()));
   ks<List<dbj<dcf>>> t = a("projectile_count", $$0 -> $$0.a(dbj.a(dcf.b, ewr.w).listOf()));
   ks<List<dbj<dcf>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dbj.a(dcf.b, ewr.w).listOf()));
   ks<List<dbj<dcf>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dbj.a(dcf.b, ewr.w).listOf()));
   ks<List<dbj<dcf>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dbj.a(dcf.b, ewr.w).listOf()));
   ks<List<dbj<dcf>>> x = a("block_experience", $$0 -> $$0.a(dbj.a(dcf.b, ewr.u).listOf()));
   ks<List<dbj<dcf>>> y = a("mob_experience", $$0 -> $$0.a(dbj.a(dcf.b, ewr.w).listOf()));
   ks<List<dbj<dcf>>> z = a("repair_with_xp", $$0 -> $$0.a(dbj.a(dcf.b, ewr.u).listOf()));
   ks<dcf> A = a("crossbow_charge_time", $$0 -> $$0.a(dcf.b));
   ks<List<cuo.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cuo.a.a.listOf()));
   ks<List<jp<awj>>> C = a("trident_sound", $$0 -> $$0.a(awj.b.listOf()));
   ks<bao> D = a("prevent_equipment_drop", $$0 -> $$0.a(bao.b));
   ks<bao> E = a("prevent_armor_change", $$0 -> $$0.a(bao.b));
   ks<dcf> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dcf.b));

   static ks<?> a(kc<ks<?>> $$0) {
      return c;
   }

   private static <T> ks<T> a(String $$0, UnaryOperator<ks.a<T>> $$1) {
      return kc.a(lx.as, $$0, $$1.apply(ks.a()).b());
   }
}
