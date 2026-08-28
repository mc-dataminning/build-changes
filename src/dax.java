import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dax {
   Codec<kq<?>> a = Codec.lazyInitialized(() -> lu.at.q());
   Codec<kn> b = kn.a(a);
   kq<List<dat<dbp>>> c = a("damage_protection", $$0 -> $$0.a(dat.a(dbp.b, evo.t).listOf()));
   kq<List<dat<dbk>>> d = a("damage_immunity", $$0 -> $$0.a(dat.a(dbk.b, evo.t).listOf()));
   kq<List<dat<dbp>>> e = a("damage", $$0 -> $$0.a(dat.a(dbp.b, evo.t).listOf()));
   kq<List<dat<dbp>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dat.a(dbp.b, evo.t).listOf()));
   kq<List<dat<dbp>>> g = a("knockback", $$0 -> $$0.a(dat.a(dbp.b, evo.t).listOf()));
   kq<List<dat<dbp>>> h = a("armor_effectiveness", $$0 -> $$0.a(dat.a(dbp.b, evo.t).listOf()));
   kq<List<dbf<dbn>>> i = a("post_attack", $$0 -> $$0.a(dbf.a(dbn.b, evo.t).listOf()));
   kq<List<dat<dbn>>> j = a("hit_block", $$0 -> $$0.a(dat.a(dbn.b, evo.x).listOf()));
   kq<List<dat<dbp>>> k = a("item_damage", $$0 -> $$0.a(dat.a(dbp.b, evo.u).listOf()));
   kq<List<dbm>> l = a("attributes", $$0 -> $$0.a(dbm.a.codec().listOf()));
   kq<List<dbf<dbp>>> m = a("equipment_drops", $$0 -> $$0.a(dbf.b(dbp.b, evo.t).listOf()));
   kq<List<dat<dbo>>> n = a("location_changed", $$0 -> $$0.a(dat.a(dbo.c, evo.v).listOf()));
   kq<List<dat<dbn>>> o = a("tick", $$0 -> $$0.a(dat.a(dbn.b, evo.w).listOf()));
   kq<List<dat<dbp>>> p = a("ammo_use", $$0 -> $$0.a(dat.a(dbp.b, evo.u).listOf()));
   kq<List<dat<dbp>>> q = a("projectile_piercing", $$0 -> $$0.a(dat.a(dbp.b, evo.u).listOf()));
   kq<List<dat<dbn>>> r = a("projectile_spawned", $$0 -> $$0.a(dat.a(dbn.b, evo.w).listOf()));
   kq<List<dat<dbp>>> s = a("projectile_spread", $$0 -> $$0.a(dat.a(dbp.b, evo.w).listOf()));
   kq<List<dat<dbp>>> t = a("projectile_count", $$0 -> $$0.a(dat.a(dbp.b, evo.w).listOf()));
   kq<List<dat<dbp>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dat.a(dbp.b, evo.w).listOf()));
   kq<List<dat<dbp>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dat.a(dbp.b, evo.w).listOf()));
   kq<List<dat<dbp>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dat.a(dbp.b, evo.w).listOf()));
   kq<List<dat<dbp>>> x = a("block_experience", $$0 -> $$0.a(dat.a(dbp.b, evo.u).listOf()));
   kq<List<dat<dbp>>> y = a("mob_experience", $$0 -> $$0.a(dat.a(dbp.b, evo.w).listOf()));
   kq<List<dat<dbp>>> z = a("repair_with_xp", $$0 -> $$0.a(dat.a(dbp.b, evo.u).listOf()));
   kq<dbp> A = a("crossbow_charge_time", $$0 -> $$0.a(dbp.b));
   kq<List<cty.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cty.a.a.listOf()));
   kq<List<jn<awc>>> C = a("trident_sound", $$0 -> $$0.a(awc.b.listOf()));
   kq<bah> D = a("prevent_equipment_drop", $$0 -> $$0.a(bah.b));
   kq<bah> E = a("prevent_armor_change", $$0 -> $$0.a(bah.b));
   kq<dbp> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dbp.b));

   static kq<?> a(ka<kq<?>> $$0) {
      return c;
   }

   private static <T> kq<T> a(String $$0, UnaryOperator<kq.a<T>> $$1) {
      return ka.a(lu.at, $$0, $$1.apply(kq.a()).b());
   }
}
