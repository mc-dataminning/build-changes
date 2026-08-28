import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface dad {
   Codec<kp<?>> a = Codec.lazyInitialized(() -> lt.au.r());
   Codec<km> b = km.a(a);
   kp<List<daa<dau>>> c = a("damage_protection", $$0 -> $$0.a(daa.a(dau.b, euk.t).listOf()));
   kp<List<daa<dap>>> d = a("damage_immunity", $$0 -> $$0.a(daa.a(dap.b, euk.t).listOf()));
   kp<List<daa<dau>>> e = a("damage", $$0 -> $$0.a(daa.a(dau.b, euk.t).listOf()));
   kp<List<daa<dau>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(daa.a(dau.b, euk.t).listOf()));
   kp<List<daa<dau>>> g = a("knockback", $$0 -> $$0.a(daa.a(dau.b, euk.t).listOf()));
   kp<List<daa<dau>>> h = a("armor_effectiveness", $$0 -> $$0.a(daa.a(dau.b, euk.t).listOf()));
   kp<List<dak<das>>> i = a("post_attack", $$0 -> $$0.a(dak.a(das.b, euk.t).listOf()));
   kp<List<daa<das>>> j = a("hit_block", $$0 -> $$0.a(daa.a(das.b, euk.x).listOf()));
   kp<List<daa<dau>>> k = a("item_damage", $$0 -> $$0.a(daa.a(dau.b, euk.u).listOf()));
   kp<List<dar>> l = a("attributes", $$0 -> $$0.a(dar.a.codec().listOf()));
   kp<List<dak<dau>>> m = a("equipment_drops", $$0 -> $$0.a(dak.b(dau.b, euk.t).listOf()));
   kp<List<daa<dat>>> n = a("location_changed", $$0 -> $$0.a(daa.a(dat.c, euk.v).listOf()));
   kp<List<daa<das>>> o = a("tick", $$0 -> $$0.a(daa.a(das.b, euk.w).listOf()));
   kp<List<daa<dau>>> p = a("ammo_use", $$0 -> $$0.a(daa.a(dau.b, euk.u).listOf()));
   kp<List<daa<dau>>> q = a("projectile_piercing", $$0 -> $$0.a(daa.a(dau.b, euk.u).listOf()));
   kp<List<daa<das>>> r = a("projectile_spawned", $$0 -> $$0.a(daa.a(das.b, euk.w).listOf()));
   kp<List<daa<dau>>> s = a("projectile_spread", $$0 -> $$0.a(daa.a(dau.b, euk.w).listOf()));
   kp<List<daa<dau>>> t = a("projectile_count", $$0 -> $$0.a(daa.a(dau.b, euk.w).listOf()));
   kp<List<daa<dau>>> u = a("trident_return_acceleration", $$0 -> $$0.a(daa.a(dau.b, euk.w).listOf()));
   kp<List<daa<dau>>> v = a("fishing_time_reduction", $$0 -> $$0.a(daa.a(dau.b, euk.w).listOf()));
   kp<List<daa<dau>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(daa.a(dau.b, euk.w).listOf()));
   kp<List<daa<dau>>> x = a("block_experience", $$0 -> $$0.a(daa.a(dau.b, euk.u).listOf()));
   kp<List<daa<dau>>> y = a("mob_experience", $$0 -> $$0.a(daa.a(dau.b, euk.w).listOf()));
   kp<List<daa<dau>>> z = a("repair_with_xp", $$0 -> $$0.a(daa.a(dau.b, euk.u).listOf()));
   kp<dau> A = a("crossbow_charge_time", $$0 -> $$0.a(dau.b));
   kp<List<ctc.a>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(ctc.a.a.listOf()));
   kp<List<jm<avo>>> C = a("trident_sound", $$0 -> $$0.a(avo.b.listOf()));
   kp<azs> D = a("prevent_equipment_drop", $$0 -> $$0.a(azs.b));
   kp<azs> E = a("prevent_armor_change", $$0 -> $$0.a(azs.b));
   kp<dau> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dau.b));

   static kp<?> a(jz<kp<?>> $$0) {
      return c;
   }

   private static <T> kp<T> a(String $$0, UnaryOperator<kp.a<T>> $$1) {
      return jz.a(lt.au, $$0, $$1.apply(kp.a()).b());
   }
}
