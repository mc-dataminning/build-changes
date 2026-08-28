import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dbo {
   Codec<kr<?>> a = Codec.lazyInitialized(() -> lv.at.q());
   Codec<ko> b = ko.a(a);
   kr<List<dbk<dcg>>> c = a("damage_protection", $$0 -> $$0.a(dbk.a(dcg.b, ewg.t).listOf()));
   kr<List<dbk<dcb>>> d = a("damage_immunity", $$0 -> $$0.a(dbk.a(dcb.b, ewg.t).listOf()));
   kr<List<dbk<dcg>>> e = a("damage", $$0 -> $$0.a(dbk.a(dcg.b, ewg.t).listOf()));
   kr<List<dbk<dcg>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(dbk.a(dcg.b, ewg.t).listOf()));
   kr<List<dbk<dcg>>> g = a("knockback", $$0 -> $$0.a(dbk.a(dcg.b, ewg.t).listOf()));
   kr<List<dbk<dcg>>> h = a("armor_effectiveness", $$0 -> $$0.a(dbk.a(dcg.b, ewg.t).listOf()));
   kr<List<dbw<dce>>> i = a("post_attack", $$0 -> $$0.a(dbw.a(dce.b, ewg.t).listOf()));
   kr<List<dbk<dce>>> j = a("hit_block", $$0 -> $$0.a(dbk.a(dce.b, ewg.x).listOf()));
   kr<List<dbk<dcg>>> k = a("item_damage", $$0 -> $$0.a(dbk.a(dcg.b, ewg.u).listOf()));
   kr<List<dcd>> l = a("attributes", $$0 -> $$0.a(dcd.a.codec().listOf()));
   kr<List<dbw<dcg>>> m = a("equipment_drops", $$0 -> $$0.a(dbw.b(dcg.b, ewg.t).listOf()));
   kr<List<dbk<dcf>>> n = a("location_changed", $$0 -> $$0.a(dbk.a(dcf.c, ewg.v).listOf()));
   kr<List<dbk<dce>>> o = a("tick", $$0 -> $$0.a(dbk.a(dce.b, ewg.w).listOf()));
   kr<List<dbk<dcg>>> p = a("ammo_use", $$0 -> $$0.a(dbk.a(dcg.b, ewg.u).listOf()));
   kr<List<dbk<dcg>>> q = a("projectile_piercing", $$0 -> $$0.a(dbk.a(dcg.b, ewg.u).listOf()));
   kr<List<dbk<dce>>> r = a("projectile_spawned", $$0 -> $$0.a(dbk.a(dce.b, ewg.w).listOf()));
   kr<List<dbk<dcg>>> s = a("projectile_spread", $$0 -> $$0.a(dbk.a(dcg.b, ewg.w).listOf()));
   kr<List<dbk<dcg>>> t = a("projectile_count", $$0 -> $$0.a(dbk.a(dcg.b, ewg.w).listOf()));
   kr<List<dbk<dcg>>> u = a("trident_return_acceleration", $$0 -> $$0.a(dbk.a(dcg.b, ewg.w).listOf()));
   kr<List<dbk<dcg>>> v = a("fishing_time_reduction", $$0 -> $$0.a(dbk.a(dcg.b, ewg.w).listOf()));
   kr<List<dbk<dcg>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(dbk.a(dcg.b, ewg.w).listOf()));
   kr<List<dbk<dcg>>> x = a("block_experience", $$0 -> $$0.a(dbk.a(dcg.b, ewg.u).listOf()));
   kr<List<dbk<dcg>>> y = a("mob_experience", $$0 -> $$0.a(dbk.a(dcg.b, ewg.w).listOf()));
   kr<List<dbk<dcg>>> z = a("repair_with_xp", $$0 -> $$0.a(dbk.a(dcg.b, ewg.u).listOf()));
   kr<dcg> A = a("crossbow_charge_time", $$0 -> $$0.a(dcg.b));
   kr<List<cug.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(cug.a.a.listOf()));
   kr<List<jo<awf>>> C = a("trident_sound", $$0 -> $$0.a(awf.b.listOf()));
   kr<bak> D = a("prevent_equipment_drop", $$0 -> $$0.a(bak.b));
   kr<bak> E = a("prevent_armor_change", $$0 -> $$0.a(bak.b));
   kr<dcg> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dcg.b));

   static kr<?> a(kb<kr<?>> $$0) {
      return c;
   }

   private static <T> kr<T> a(String $$0, UnaryOperator<kr.a<T>> $$1) {
      return kb.a(lv.at, $$0, $$1.apply(kr.a()).b());
   }
}
