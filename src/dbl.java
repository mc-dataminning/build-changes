import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dbl {
   Codec<kq<?>> a = Codec.lazyInitialized(() -> lu.at.q());
   Codec<kn> b = kn.a(a);
   kq<List<dbh<dcd>>> c = a("damage_protection", $$0 -> $$0.a(dbh.a(dcd.b, ewc.t).listOf()));
   kq<List<dbh<dby>>> d = a("damage_immunity", $$0 -> $$0.a(dbh.a(dby.b, ewc.t).listOf()));
   kq<List<dbh<dcd>>> e = a("damage", $$0 -> $$0.a(dbh.a(dcd.b, ewc.t).listOf()));
   kq<List<dbh<dcd>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dbh.a(dcd.b, ewc.t).listOf()));
   kq<List<dbh<dcd>>> g = a("knockback", $$0 -> $$0.a(dbh.a(dcd.b, ewc.t).listOf()));
   kq<List<dbh<dcd>>> h = a("armor_effectiveness", $$0 -> $$0.a(dbh.a(dcd.b, ewc.t).listOf()));
   kq<List<dbt<dcb>>> i = a("post_attack", $$0 -> $$0.a(dbt.a(dcb.b, ewc.t).listOf()));
   kq<List<dbh<dcb>>> j = a("hit_block", $$0 -> $$0.a(dbh.a(dcb.b, ewc.x).listOf()));
   kq<List<dbh<dcd>>> k = a("item_damage", $$0 -> $$0.a(dbh.a(dcd.b, ewc.u).listOf()));
   kq<List<dca>> l = a("attributes", $$0 -> $$0.a(dca.a.codec().listOf()));
   kq<List<dbt<dcd>>> m = a("equipment_drops", $$0 -> $$0.a(dbt.b(dcd.b, ewc.t).listOf()));
   kq<List<dbh<dcc>>> n = a("location_changed", $$0 -> $$0.a(dbh.a(dcc.c, ewc.v).listOf()));
   kq<List<dbh<dcb>>> o = a("tick", $$0 -> $$0.a(dbh.a(dcb.b, ewc.w).listOf()));
   kq<List<dbh<dcd>>> p = a("ammo_use", $$0 -> $$0.a(dbh.a(dcd.b, ewc.u).listOf()));
   kq<List<dbh<dcd>>> q = a("projectile_piercing", $$0 -> $$0.a(dbh.a(dcd.b, ewc.u).listOf()));
   kq<List<dbh<dcb>>> r = a("projectile_spawned", $$0 -> $$0.a(dbh.a(dcb.b, ewc.w).listOf()));
   kq<List<dbh<dcd>>> s = a("projectile_spread", $$0 -> $$0.a(dbh.a(dcd.b, ewc.w).listOf()));
   kq<List<dbh<dcd>>> t = a("projectile_count", $$0 -> $$0.a(dbh.a(dcd.b, ewc.w).listOf()));
   kq<List<dbh<dcd>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dbh.a(dcd.b, ewc.w).listOf()));
   kq<List<dbh<dcd>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dbh.a(dcd.b, ewc.w).listOf()));
   kq<List<dbh<dcd>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dbh.a(dcd.b, ewc.w).listOf()));
   kq<List<dbh<dcd>>> x = a("block_experience", $$0 -> $$0.a(dbh.a(dcd.b, ewc.u).listOf()));
   kq<List<dbh<dcd>>> y = a("mob_experience", $$0 -> $$0.a(dbh.a(dcd.b, ewc.w).listOf()));
   kq<List<dbh<dcd>>> z = a("repair_with_xp", $$0 -> $$0.a(dbh.a(dcd.b, ewc.u).listOf()));
   kq<dcd> A = a("crossbow_charge_time", $$0 -> $$0.a(dcd.b));
   kq<List<cud.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cud.a.a.listOf()));
   kq<List<jn<awd>>> C = a("trident_sound", $$0 -> $$0.a(awd.b.listOf()));
   kq<bai> D = a("prevent_equipment_drop", $$0 -> $$0.a(bai.b));
   kq<bai> E = a("prevent_armor_change", $$0 -> $$0.a(bai.b));
   kq<dcd> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dcd.b));

   static kq<?> a(ka<kq<?>> $$0) {
      return c;
   }

   private static <T> kq<T> a(String $$0, UnaryOperator<kq.a<T>> $$1) {
      return ka.a(lu.at, $$0, $$1.apply(kq.a()).b());
   }
}
