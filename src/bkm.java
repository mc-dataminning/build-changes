public class bkm {
   public static final bkh a = a("generic.max_health", new bko("attribute.name.generic.max_health", 20.0, 1.0, 1024.0).a(true));
   public static final bkh b = a("generic.follow_range", new bko("attribute.name.generic.follow_range", 32.0, 0.0, 2048.0));
   public static final bkh c = a("generic.knockback_resistance", new bko("attribute.name.generic.knockback_resistance", 0.0, 0.0, 1.0));
   public static final bkh d = a("generic.movement_speed", new bko("attribute.name.generic.movement_speed", 0.7F, 0.0, 1024.0).a(true));
   public static final bkh e = a("generic.flying_speed", new bko("attribute.name.generic.flying_speed", 0.4F, 0.0, 1024.0).a(true));
   public static final bkh f = a("generic.attack_damage", new bko("attribute.name.generic.attack_damage", 2.0, 0.0, 2048.0));
   public static final bkh g = a("generic.attack_knockback", new bko("attribute.name.generic.attack_knockback", 0.0, 0.0, 5.0));
   public static final bkh h = a("generic.attack_speed", new bko("attribute.name.generic.attack_speed", 4.0, 0.0, 1024.0).a(true));
   public static final bkh i = a("generic.armor", new bko("attribute.name.generic.armor", 0.0, 0.0, 30.0).a(true));
   public static final bkh j = a("generic.armor_toughness", new bko("attribute.name.generic.armor_toughness", 0.0, 0.0, 20.0).a(true));
   public static final bkh k = a("generic.luck", new bko("attribute.name.generic.luck", 0.0, -1024.0, 1024.0).a(true));
   public static final bkh l = a("generic.max_absorption", new bko("attribute.name.generic.max_absorption", 0.0, 0.0, 2048.0)).a(true);
   public static final bkh m = a("zombie.spawn_reinforcements", new bko("attribute.name.zombie.spawn_reinforcements", 0.0, 0.0, 1.0));
   public static final bkh n = a("horse.jump_strength", new bko("attribute.name.horse.jump_strength", 0.7, 0.0, 2.0).a(true));

   private static bkh a(String $$0, bkh $$1) {
      return ht.a(jd.v, $$0, $$1);
   }
}
