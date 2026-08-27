public class bkf {
   public static final bka a = a("generic.max_health", new bkh("attribute.name.generic.max_health", 20.0, 1.0, 1024.0).a(true));
   public static final bka b = a("generic.follow_range", new bkh("attribute.name.generic.follow_range", 32.0, 0.0, 2048.0));
   public static final bka c = a("generic.knockback_resistance", new bkh("attribute.name.generic.knockback_resistance", 0.0, 0.0, 1.0));
   public static final bka d = a("generic.movement_speed", new bkh("attribute.name.generic.movement_speed", 0.7F, 0.0, 1024.0).a(true));
   public static final bka e = a("generic.flying_speed", new bkh("attribute.name.generic.flying_speed", 0.4F, 0.0, 1024.0).a(true));
   public static final bka f = a("generic.attack_damage", new bkh("attribute.name.generic.attack_damage", 2.0, 0.0, 2048.0));
   public static final bka g = a("generic.attack_knockback", new bkh("attribute.name.generic.attack_knockback", 0.0, 0.0, 5.0));
   public static final bka h = a("generic.attack_speed", new bkh("attribute.name.generic.attack_speed", 4.0, 0.0, 1024.0).a(true));
   public static final bka i = a("generic.armor", new bkh("attribute.name.generic.armor", 0.0, 0.0, 30.0).a(true));
   public static final bka j = a("generic.armor_toughness", new bkh("attribute.name.generic.armor_toughness", 0.0, 0.0, 20.0).a(true));
   public static final bka k = a("generic.luck", new bkh("attribute.name.generic.luck", 0.0, -1024.0, 1024.0).a(true));
   public static final bka l = a("generic.max_absorption", new bkh("attribute.name.generic.max_absorption", 0.0, 0.0, 2048.0)).a(true);
   public static final bka m = a("zombie.spawn_reinforcements", new bkh("attribute.name.zombie.spawn_reinforcements", 0.0, 0.0, 1.0));
   public static final bka n = a("horse.jump_strength", new bkh("attribute.name.horse.jump_strength", 0.7, 0.0, 2.0).a(true));

   private static bka a(String $$0, bka $$1) {
      return hr.a(jb.v, $$0, $$1);
   }
}
