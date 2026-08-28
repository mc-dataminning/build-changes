import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dgm {
   Codec<kj<?>> a = Codec.lazyInitialized(() -> mg.aq.q());
   Codec<kh> b = kh.a(a);
   kj<List<dgi<dhe>>> c = a("damage_protection", $$0 -> $$0.a(dgi.a(dhe.b, fda.t).listOf()));
   kj<List<dgi<dha>>> d = a("damage_immunity", $$0 -> $$0.a(dgi.a(dha.b, fda.t).listOf()));
   kj<List<dgi<dhe>>> e = a("damage", $$0 -> $$0.a(dgi.a(dhe.b, fda.t).listOf()));
   kj<List<dgi<dhe>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dgi.a(dhe.b, fda.t).listOf()));
   kj<List<dgi<dhe>>> g = a("knockback", $$0 -> $$0.a(dgi.a(dhe.b, fda.t).listOf()));
   kj<List<dgi<dhe>>> h = a("armor_effectiveness", $$0 -> $$0.a(dgi.a(dhe.b, fda.t).listOf()));
   kj<List<dgu<dhc>>> i = a("post_attack", $$0 -> $$0.a(dgu.a(dhc.b, fda.t).listOf()));
   kj<List<dgi<dhc>>> j = a("hit_block", $$0 -> $$0.a(dgi.a(dhc.b, fda.x).listOf()));
   kj<List<dgi<dhe>>> k = a("item_damage", $$0 -> $$0.a(dgi.a(dhe.b, fda.u).listOf()));
   kj<List<dhb>> l = a("attributes", $$0 -> $$0.a(dhb.a.codec().listOf()));
   kj<List<dgu<dhe>>> m = a("equipment_drops", $$0 -> $$0.a(dgu.b(dhe.b, fda.t).listOf()));
   kj<List<dgi<dhd>>> n = a("location_changed", $$0 -> $$0.a(dgi.a(dhd.c, fda.v).listOf()));
   kj<List<dgi<dhc>>> o = a("tick", $$0 -> $$0.a(dgi.a(dhc.b, fda.w).listOf()));
   kj<List<dgi<dhe>>> p = a("ammo_use", $$0 -> $$0.a(dgi.a(dhe.b, fda.u).listOf()));
   kj<List<dgi<dhe>>> q = a("projectile_piercing", $$0 -> $$0.a(dgi.a(dhe.b, fda.u).listOf()));
   kj<List<dgi<dhc>>> r = a("projectile_spawned", $$0 -> $$0.a(dgi.a(dhc.b, fda.w).listOf()));
   kj<List<dgi<dhe>>> s = a("projectile_spread", $$0 -> $$0.a(dgi.a(dhe.b, fda.w).listOf()));
   kj<List<dgi<dhe>>> t = a("projectile_count", $$0 -> $$0.a(dgi.a(dhe.b, fda.w).listOf()));
   kj<List<dgi<dhe>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dgi.a(dhe.b, fda.w).listOf()));
   kj<List<dgi<dhe>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dgi.a(dhe.b, fda.w).listOf()));
   kj<List<dgi<dhe>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dgi.a(dhe.b, fda.w).listOf()));
   kj<List<dgi<dhe>>> x = a("block_experience", $$0 -> $$0.a(dgi.a(dhe.b, fda.u).listOf()));
   kj<List<dgi<dhe>>> y = a("mob_experience", $$0 -> $$0.a(dgi.a(dhe.b, fda.w).listOf()));
   kj<List<dgi<dhe>>> z = a("repair_with_xp", $$0 -> $$0.a(dgi.a(dhe.b, fda.u).listOf()));
   kj<dhe> A = a("crossbow_charge_time", $$0 -> $$0.a(dhe.b));
   kj<List<cyr.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cyr.b.a.listOf()));
   kj<List<jf<awo>>> C = a("trident_sound", $$0 -> $$0.a(awo.b.listOf()));
   kj<baw> D = a("prevent_equipment_drop", $$0 -> $$0.a(baw.b));
   kj<baw> E = a("prevent_armor_change", $$0 -> $$0.a(baw.b));
   kj<dhe> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dhe.b));

   static kj<?> a(js<kj<?>> $$0) {
      return c;
   }

   private static <T> kj<T> a(String $$0, UnaryOperator<kj.a<T>> $$1) {
      return js.a(mg.aq, $$0, $$1.apply(kj.a()).b());
   }
}
