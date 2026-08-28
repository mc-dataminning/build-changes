import java.util.Optional;
import java.util.stream.IntStream;

public class fnu {
   public static final fnt a = a("cube", fnw.c, fnw.j, fnw.k, fnw.l, fnw.m, fnw.n, fnw.o);
   public static final fnt b = a("cube_directional", fnw.c, fnw.j, fnw.k, fnw.l, fnw.m, fnw.n, fnw.o);
   public static final fnt c = a("cube_all", fnw.a);
   public static final fnt d = a("cube_all_inner_faces", fnw.a);
   public static final fnt e = b("cube_mirrored_all", "_mirrored", fnw.a);
   public static final fnt f = b("cube_north_west_mirrored_all", "_north_west_mirrored", fnw.a);
   public static final fnt g = b("cube_column_uv_locked_x", "_x", fnw.d, fnw.i);
   public static final fnt h = b("cube_column_uv_locked_y", "_y", fnw.d, fnw.i);
   public static final fnt i = b("cube_column_uv_locked_z", "_z", fnw.d, fnw.i);
   public static final fnt j = a("cube_column", fnw.d, fnw.i);
   public static final fnt k = b("cube_column_horizontal", "_horizontal", fnw.d, fnw.i);
   public static final fnt l = b("cube_column_mirrored", "_mirrored", fnw.d, fnw.i);
   public static final fnt m = a("cube_top", fnw.f, fnw.i);
   public static final fnt n = a("cube_bottom_top", fnw.f, fnw.e, fnw.i);
   public static final fnt o = a("cube_bottom_top_inner_faces", fnw.f, fnw.e, fnw.i);
   public static final fnt p = a("orientable", fnw.f, fnw.g, fnw.i);
   public static final fnt q = a("orientable_with_bottom", fnw.f, fnw.e, fnw.i, fnw.g);
   public static final fnt r = b("orientable_vertical", "_vertical", fnw.g, fnw.i);
   public static final fnt s = a("button", fnw.b);
   public static final fnt t = b("button_pressed", "_pressed", fnw.b);
   public static final fnt u = b("button_inventory", "_inventory", fnw.b);
   public static final fnt v = b("door_bottom_left", "_bottom_left", fnw.f, fnw.e);
   public static final fnt w = b("door_bottom_left_open", "_bottom_left_open", fnw.f, fnw.e);
   public static final fnt x = b("door_bottom_right", "_bottom_right", fnw.f, fnw.e);
   public static final fnt y = b("door_bottom_right_open", "_bottom_right_open", fnw.f, fnw.e);
   public static final fnt z = b("door_top_left", "_top_left", fnw.f, fnw.e);
   public static final fnt A = b("door_top_left_open", "_top_left_open", fnw.f, fnw.e);
   public static final fnt B = b("door_top_right", "_top_right", fnw.f, fnw.e);
   public static final fnt C = b("door_top_right_open", "_top_right_open", fnw.f, fnw.e);
   public static final fnt D = b("custom_fence_post", "_post", fnw.b, fnw.c);
   public static final fnt E = b("custom_fence_side_north", "_side_north", fnw.b);
   public static final fnt F = b("custom_fence_side_east", "_side_east", fnw.b);
   public static final fnt G = b("custom_fence_side_south", "_side_south", fnw.b);
   public static final fnt H = b("custom_fence_side_west", "_side_west", fnw.b);
   public static final fnt I = b("custom_fence_inventory", "_inventory", fnw.b);
   public static final fnt J = b("fence_post", "_post", fnw.b);
   public static final fnt K = b("fence_side", "_side", fnw.b);
   public static final fnt L = b("fence_inventory", "_inventory", fnw.b);
   public static final fnt M = b("template_wall_post", "_post", fnw.s);
   public static final fnt N = b("template_wall_side", "_side", fnw.s);
   public static final fnt O = b("template_wall_side_tall", "_side_tall", fnw.s);
   public static final fnt P = b("wall_inventory", "_inventory", fnw.s);
   public static final fnt Q = a("template_custom_fence_gate", fnw.b, fnw.c);
   public static final fnt R = b("template_custom_fence_gate_open", "_open", fnw.b, fnw.c);
   public static final fnt S = b("template_custom_fence_gate_wall", "_wall", fnw.b, fnw.c);
   public static final fnt T = b("template_custom_fence_gate_wall_open", "_wall_open", fnw.b, fnw.c);
   public static final fnt U = a("template_fence_gate", fnw.b);
   public static final fnt V = b("template_fence_gate_open", "_open", fnw.b);
   public static final fnt W = b("template_fence_gate_wall", "_wall", fnw.b);
   public static final fnt X = b("template_fence_gate_wall_open", "_wall_open", fnw.b);
   public static final fnt Y = a("pressure_plate_up", fnw.b);
   public static final fnt Z = b("pressure_plate_down", "_down", fnw.b);
   public static final fnt aa = a(fnw.c);
   public static final fnt ab = a("slab", fnw.e, fnw.f, fnw.i);
   public static final fnt ac = b("slab_top", "_top", fnw.e, fnw.f, fnw.i);
   public static final fnt ad = a("leaves", fnw.a);
   public static final fnt ae = a("stairs", fnw.e, fnw.f, fnw.i);
   public static final fnt af = b("inner_stairs", "_inner", fnw.e, fnw.f, fnw.i);
   public static final fnt ag = b("outer_stairs", "_outer", fnw.e, fnw.f, fnw.i);
   public static final fnt ah = b("template_trapdoor_top", "_top", fnw.b);
   public static final fnt ai = b("template_trapdoor_bottom", "_bottom", fnw.b);
   public static final fnt aj = b("template_trapdoor_open", "_open", fnw.b);
   public static final fnt ak = b("template_orientable_trapdoor_top", "_top", fnw.b);
   public static final fnt al = b("template_orientable_trapdoor_bottom", "_bottom", fnw.b);
   public static final fnt am = b("template_orientable_trapdoor_open", "_open", fnw.b);
   public static final fnt an = a("pointed_dripstone", fnw.p);
   public static final fnt ao = a("cross", fnw.p);
   public static final fnt ap = a("tinted_cross", fnw.p);
   public static final fnt aq = a("cross_emissive", fnw.p, fnw.q);
   public static final fnt ar = a("flower_pot_cross", fnw.r);
   public static final fnt as = a("tinted_flower_pot_cross", fnw.r);
   public static final fnt at = a("flower_pot_cross_emissive", fnw.r, fnw.q);
   public static final fnt au = a("rail_flat", fnw.t);
   public static final fnt av = b("rail_curved", "_corner", fnw.t);
   public static final fnt aw = b("template_rail_raised_ne", "_raised_ne", fnw.t);
   public static final fnt ax = b("template_rail_raised_sw", "_raised_sw", fnw.t);
   public static final fnt ay = a("carpet", fnw.u);
   public static final fnt az = a("mossy_carpet_side", fnw.i);
   public static final fnt aA = b("flowerbed_1", "_1", fnw.Q, fnw.z);
   public static final fnt aB = b("flowerbed_2", "_2", fnw.Q, fnw.z);
   public static final fnt aC = b("flowerbed_3", "_3", fnw.Q, fnw.z);
   public static final fnt aD = b("flowerbed_4", "_4", fnw.Q, fnw.z);
   public static final fnt aE = a("coral_fan", fnw.y);
   public static final fnt aF = a("coral_wall_fan", fnw.y);
   public static final fnt aG = a("template_glazed_terracotta", fnw.v);
   public static final fnt aH = a("template_chorus_flower", fnw.b);
   public static final fnt aI = a("template_daylight_detector", fnw.f, fnw.i);
   public static final fnt aJ = b("template_glass_pane_noside", "_noside", fnw.w);
   public static final fnt aK = b("template_glass_pane_noside_alt", "_noside_alt", fnw.w);
   public static final fnt aL = b("template_glass_pane_post", "_post", fnw.w, fnw.x);
   public static final fnt aM = b("template_glass_pane_side", "_side", fnw.w, fnw.x);
   public static final fnt aN = b("template_glass_pane_side_alt", "_side_alt", fnw.w, fnw.x);
   public static final fnt aO = a("template_command_block", fnw.g, fnw.h, fnw.i);
   public static final fnt aP = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", fnw.b);
   public static final fnt aQ = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", fnw.b);
   public static final fnt aR = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", fnw.b);
   public static final fnt aS = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", fnw.b);
   public static final fnt aT = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", fnw.b);
   public static final fnt aU = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", fnw.b);
   public static final fnt aV = a("template_anvil", fnw.f);
   public static final fnt[] aW = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, fnw.z)).toArray(fnt[]::new);
   public static final fnt aX = a("stem_fruit", fnw.z, fnw.A);
   public static final fnt aY = a("crop", fnw.B);
   public static final fnt aZ = a("template_farmland", fnw.C, fnw.f);
   public static final fnt ba = a("template_fire_floor", fnw.D);
   public static final fnt bb = a("template_fire_side", fnw.D);
   public static final fnt bc = a("template_fire_side_alt", fnw.D);
   public static final fnt bd = a("template_fire_up", fnw.D);
   public static final fnt be = a("template_fire_up_alt", fnw.D);
   public static final fnt bf = a("template_campfire", fnw.D, fnw.L);
   public static final fnt bg = a("template_lantern", fnw.E);
   public static final fnt bh = b("template_hanging_lantern", "_hanging", fnw.E);
   public static final fnt bi = a("template_torch", fnw.H);
   public static final fnt bj = a("template_torch_unlit", fnw.H);
   public static final fnt bk = a("template_torch_wall", fnw.H);
   public static final fnt bl = a("template_torch_wall_unlit", fnw.H);
   public static final fnt bm = a("template_redstone_torch", fnw.H);
   public static final fnt bn = a("template_redstone_torch_wall", fnw.H);
   public static final fnt bo = a("template_piston", fnw.F, fnw.e, fnw.i);
   public static final fnt bp = a("template_piston_head", fnw.F, fnw.i, fnw.G);
   public static final fnt bq = a("template_piston_head_short", fnw.F, fnw.i, fnw.G);
   public static final fnt br = a("template_seagrass", fnw.b);
   public static final fnt bs = a("template_turtle_egg", fnw.a);
   public static final fnt bt = a("template_two_turtle_eggs", fnw.a);
   public static final fnt bu = a("template_three_turtle_eggs", fnw.a);
   public static final fnt bv = a("template_four_turtle_eggs", fnw.a);
   public static final fnt bw = a("template_single_face", fnw.b);
   public static final fnt bx = a("template_cauldron_level1", fnw.O, fnw.N, fnw.c, fnw.f, fnw.e, fnw.i);
   public static final fnt by = a("template_cauldron_level2", fnw.O, fnw.N, fnw.c, fnw.f, fnw.e, fnw.i);
   public static final fnt bz = a("template_cauldron_full", fnw.O, fnw.N, fnw.c, fnw.f, fnw.e, fnw.i);
   public static final fnt bA = a("template_azalea", fnw.f, fnw.i);
   public static final fnt bB = a("template_potted_azalea_bush", fnw.r, fnw.f, fnw.i);
   public static final fnt bC = a("template_potted_azalea_bush", fnw.r, fnw.f, fnw.i);
   public static final fnt bD = a("sniffer_egg", fnw.f, fnw.e, fnw.j, fnw.k, fnw.l, fnw.m);
   public static final fnt bE = b("generated", fnw.I);
   public static final fnt bF = b("template_music_disc", fnw.I);
   public static final fnt bG = b("handheld", fnw.I);
   public static final fnt bH = b("handheld_rod", fnw.I);
   public static final fnt bI = b("generated", fnw.I, fnw.J);
   public static final fnt bJ = b("generated", fnw.I, fnw.J, fnw.K);
   public static final fnt bK = b("template_shulker_box", fnw.c);
   public static final fnt bL = b("template_bed", fnw.c);
   public static final fnt bM = b("template_chest", fnw.c);
   public static final fnt bN = a("template_bundle_open_front", "_open_front", fnw.I);
   public static final fnt bO = a("template_bundle_open_back", "_open_back", fnw.I);
   public static final fnt bP = b("bow", fnw.I);
   public static final fnt bQ = b("crossbow", fnw.I);
   public static final fnt bR = a("template_candle", fnw.a, fnw.c);
   public static final fnt bS = a("template_two_candles", fnw.a, fnw.c);
   public static final fnt bT = a("template_three_candles", fnw.a, fnw.c);
   public static final fnt bU = a("template_four_candles", fnw.a, fnw.c);
   public static final fnt bV = a("template_cake_with_candle", fnw.M, fnw.e, fnw.i, fnw.f, fnw.c);
   public static final fnt bW = a("template_sculk_shrieker", fnw.e, fnw.i, fnw.f, fnw.c, fnw.P);
   public static final fnt bX = a("template_vault", fnw.f, fnw.e, fnw.i, fnw.g);
   public static final fnt bY = b("handheld_mace", fnw.I);

   private static fnt a(fnw... $$0) {
      return new fnt(Optional.empty(), Optional.empty(), $$0);
   }

   private static fnt a(String $$0, fnw... $$1) {
      return new fnt(Optional.of(akv.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static fnt b(String $$0, fnw... $$1) {
      return new fnt(Optional.of(akv.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static fnt a(String $$0, String $$1, fnw... $$2) {
      return new fnt(Optional.of(akv.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static fnt b(String $$0, String $$1, fnw... $$2) {
      return new fnt(Optional.of(akv.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
