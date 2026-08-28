import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dei {
   Codec<kw<?>> a = Codec.lazyInitialized(() -> md.as.q());
   Codec<kt> b = kt.a(a);
   kw<List<dee<dfa>>> c = a("damage_protection", $$0 -> $$0.a(dee.a(dfa.b, fae.t).listOf()));
   kw<List<dee<dew>>> d = a("damage_immunity", $$0 -> $$0.a(dee.a(dew.b, fae.t).listOf()));
   kw<List<dee<dfa>>> e = a("damage", $$0 -> $$0.a(dee.a(dfa.b, fae.t).listOf()));
   kw<List<dee<dfa>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dee.a(dfa.b, fae.t).listOf()));
   kw<List<dee<dfa>>> g = a("knockback", $$0 -> $$0.a(dee.a(dfa.b, fae.t).listOf()));
   kw<List<dee<dfa>>> h = a("armor_effectiveness", $$0 -> $$0.a(dee.a(dfa.b, fae.t).listOf()));
   kw<List<deq<dey>>> i = a("post_attack", $$0 -> $$0.a(deq.a(dey.b, fae.t).listOf()));
   kw<List<dee<dey>>> j = a("hit_block", $$0 -> $$0.a(dee.a(dey.b, fae.x).listOf()));
   kw<List<dee<dfa>>> k = a("item_damage", $$0 -> $$0.a(dee.a(dfa.b, fae.u).listOf()));
   kw<List<dex>> l = a("attributes", $$0 -> $$0.a(dex.a.codec().listOf()));
   kw<List<deq<dfa>>> m = a("equipment_drops", $$0 -> $$0.a(deq.b(dfa.b, fae.t).listOf()));
   kw<List<dee<dez>>> n = a("location_changed", $$0 -> $$0.a(dee.a(dez.c, fae.v).listOf()));
   kw<List<dee<dey>>> o = a("tick", $$0 -> $$0.a(dee.a(dey.b, fae.w).listOf()));
   kw<List<dee<dfa>>> p = a("ammo_use", $$0 -> $$0.a(dee.a(dfa.b, fae.u).listOf()));
   kw<List<dee<dfa>>> q = a("projectile_piercing", $$0 -> $$0.a(dee.a(dfa.b, fae.u).listOf()));
   kw<List<dee<dey>>> r = a("projectile_spawned", $$0 -> $$0.a(dee.a(dey.b, fae.w).listOf()));
   kw<List<dee<dfa>>> s = a("projectile_spread", $$0 -> $$0.a(dee.a(dfa.b, fae.w).listOf()));
   kw<List<dee<dfa>>> t = a("projectile_count", $$0 -> $$0.a(dee.a(dfa.b, fae.w).listOf()));
   kw<List<dee<dfa>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dee.a(dfa.b, fae.w).listOf()));
   kw<List<dee<dfa>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dee.a(dfa.b, fae.w).listOf()));
   kw<List<dee<dfa>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dee.a(dfa.b, fae.w).listOf()));
   kw<List<dee<dfa>>> x = a("block_experience", $$0 -> $$0.a(dee.a(dfa.b, fae.u).listOf()));
   kw<List<dee<dfa>>> y = a("mob_experience", $$0 -> $$0.a(dee.a(dfa.b, fae.w).listOf()));
   kw<List<dee<dfa>>> z = a("repair_with_xp", $$0 -> $$0.a(dee.a(dfa.b, fae.u).listOf()));
   kw<dfa> A = a("crossbow_charge_time", $$0 -> $$0.a(dfa.b));
   kw<List<cwq.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cwq.b.a.listOf()));
   kw<List<js<awj>>> C = a("trident_sound", $$0 -> $$0.a(awj.b.listOf()));
   kw<baq> D = a("prevent_equipment_drop", $$0 -> $$0.a(baq.b));
   kw<baq> E = a("prevent_armor_change", $$0 -> $$0.a(baq.b));
   kw<dfa> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dfa.b));

   static kw<?> a(kf<kw<?>> $$0) {
      return c;
   }

   private static <T> kw<T> a(String $$0, UnaryOperator<kw.a<T>> $$1) {
      return kf.a(md.as, $$0, $$1.apply(kw.a()).b());
   }
}
