public class bvm {
   public static final jn<bvh> a = a("armor", new bvo("attribute.name.armor", 0.0, 0.0, 30.0).a(true));
   public static final jn<bvh> b = a("armor_toughness", new bvo("attribute.name.armor_toughness", 0.0, 0.0, 20.0).a(true));
   public static final jn<bvh> c = a("attack_damage", new bvo("attribute.name.attack_damage", 2.0, 0.0, 2048.0));
   public static final jn<bvh> d = a("attack_knockback", new bvo("attribute.name.attack_knockback", 0.0, 0.0, 5.0));
   public static final jn<bvh> e = a("attack_speed", new bvo("attribute.name.attack_speed", 4.0, 0.0, 1024.0).a(true));
   public static final jn<bvh> f = a("block_break_speed", new bvo("attribute.name.block_break_speed", 1.0, 0.0, 1024.0).a(true));
   public static final jn<bvh> g = a("block_interaction_range", new bvo("attribute.name.block_interaction_range", 4.5, 0.0, 64.0).a(true));
   public static final jn<bvh> h = a("burning_time", new bvo("attribute.name.burning_time", 1.0, 0.0, 1024.0).a(true).a(bvh.a.c));
   public static final jn<bvh> i = a("explosion_knockback_resistance", new bvo("attribute.name.explosion_knockback_resistance", 0.0, 0.0, 1.0).a(true));
   public static final jn<bvh> j = a("entity_interaction_range", new bvo("attribute.name.entity_interaction_range", 3.0, 0.0, 64.0).a(true));
   public static final jn<bvh> k = a("fall_damage_multiplier", new bvo("attribute.name.fall_damage_multiplier", 1.0, 0.0, 100.0).a(true).a(bvh.a.c));
   public static final jn<bvh> l = a("flying_speed", new bvo("attribute.name.flying_speed", 0.4, 0.0, 1024.0).a(true));
   public static final jn<bvh> m = a("follow_range", new bvo("attribute.name.follow_range", 32.0, 0.0, 2048.0));
   public static final jn<bvh> n = a("gravity", new bvo("attribute.name.gravity", 0.08, -1.0, 1.0).a(true).a(bvh.a.b));
   public static final jn<bvh> o = a("jump_strength", new bvo("attribute.name.jump_strength", 0.42F, 0.0, 32.0).a(true));
   public static final jn<bvh> p = a("knockback_resistance", new bvo("attribute.name.knockback_resistance", 0.0, 0.0, 1.0));
   public static final jn<bvh> q = a("luck", new bvo("attribute.name.luck", 0.0, -1024.0, 1024.0).a(true));
   public static final jn<bvh> r = a("max_absorption", new bvo("attribute.name.max_absorption", 0.0, 0.0, 2048.0).a(true));
   public static final jn<bvh> s = a("max_health", new bvo("attribute.name.max_health", 20.0, 1.0, 1024.0).a(true));
   public static final jn<bvh> t = a("mining_efficiency", new bvo("attribute.name.mining_efficiency", 0.0, 0.0, 1024.0).a(true));
   public static final jn<bvh> u = a("movement_efficiency", new bvo("attribute.name.movement_efficiency", 0.0, 0.0, 1.0).a(true));
   public static final jn<bvh> v = a("movement_speed", new bvo("attribute.name.movement_speed", 0.7, 0.0, 1024.0).a(true));
   public static final jn<bvh> w = a("oxygen_bonus", new bvo("attribute.name.oxygen_bonus", 0.0, 0.0, 1024.0).a(true));
   public static final jn<bvh> x = a("safe_fall_distance", new bvo("attribute.name.safe_fall_distance", 3.0, -1024.0, 1024.0).a(true));
   public static final jn<bvh> y = a("scale", new bvo("attribute.name.scale", 1.0, 0.0625, 16.0).a(true).a(bvh.a.b));
   public static final jn<bvh> z = a("sneaking_speed", new bvo("attribute.name.sneaking_speed", 0.3, 0.0, 1.0).a(true));
   public static final jn<bvh> A = a("spawn_reinforcements", new bvo("attribute.name.spawn_reinforcements", 0.0, 0.0, 1.0));
   public static final jn<bvh> B = a("step_height", new bvo("attribute.name.step_height", 0.6, 0.0, 10.0).a(true));
   public static final jn<bvh> C = a("submerged_mining_speed", new bvo("attribute.name.submerged_mining_speed", 0.2, 0.0, 20.0).a(true));
   public static final jn<bvh> D = a("sweeping_damage_ratio", new bvo("attribute.name.sweeping_damage_ratio", 0.0, 0.0, 1.0).a(true));
   public static final jn<bvh> E = a("tempt_range", new bvo("attribute.name.tempt_range", 10.0, 0.0, 2048.0));
   public static final jn<bvh> F = a("water_movement_efficiency", new bvo("attribute.name.water_movement_efficiency", 0.0, 0.0, 1.0).a(true));

   private static jn<bvh> a(String $$0, bvh $$1) {
      return ka.b(lu.s, alb.b($$0), $$1);
   }

   public static jn<bvh> a(ka<bvh> $$0) {
      return s;
   }
}
