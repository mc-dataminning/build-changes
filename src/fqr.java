import java.util.Optional;
import java.util.stream.IntStream;

public class fqr {
   public static final fqq a = a("cube", fqt.c, fqt.j, fqt.k, fqt.l, fqt.m, fqt.n, fqt.o);
   public static final fqq b = a("cube_directional", fqt.c, fqt.j, fqt.k, fqt.l, fqt.m, fqt.n, fqt.o);
   public static final fqq c = a("cube_all", fqt.a);
   public static final fqq d = a("cube_all_inner_faces", fqt.a);
   public static final fqq e = b("cube_mirrored_all", "_mirrored", fqt.a);
   public static final fqq f = b("cube_north_west_mirrored_all", "_north_west_mirrored", fqt.a);
   public static final fqq g = b("cube_column_uv_locked_x", "_x", fqt.d, fqt.i);
   public static final fqq h = b("cube_column_uv_locked_y", "_y", fqt.d, fqt.i);
   public static final fqq i = b("cube_column_uv_locked_z", "_z", fqt.d, fqt.i);
   public static final fqq j = a("cube_column", fqt.d, fqt.i);
   public static final fqq k = b("cube_column_horizontal", "_horizontal", fqt.d, fqt.i);
   public static final fqq l = b("cube_column_mirrored", "_mirrored", fqt.d, fqt.i);
   public static final fqq m = a("cube_top", fqt.f, fqt.i);
   public static final fqq n = a("cube_bottom_top", fqt.f, fqt.e, fqt.i);
   public static final fqq o = a("cube_bottom_top_inner_faces", fqt.f, fqt.e, fqt.i);
   public static final fqq p = a("orientable", fqt.f, fqt.g, fqt.i);
   public static final fqq q = a("orientable_with_bottom", fqt.f, fqt.e, fqt.i, fqt.g);
   public static final fqq r = b("orientable_vertical", "_vertical", fqt.g, fqt.i);
   public static final fqq s = a("button", fqt.b);
   public static final fqq t = b("button_pressed", "_pressed", fqt.b);
   public static final fqq u = b("button_inventory", "_inventory", fqt.b);
   public static final fqq v = b("door_bottom_left", "_bottom_left", fqt.f, fqt.e);
   public static final fqq w = b("door_bottom_left_open", "_bottom_left_open", fqt.f, fqt.e);
   public static final fqq x = b("door_bottom_right", "_bottom_right", fqt.f, fqt.e);
   public static final fqq y = b("door_bottom_right_open", "_bottom_right_open", fqt.f, fqt.e);
   public static final fqq z = b("door_top_left", "_top_left", fqt.f, fqt.e);
   public static final fqq A = b("door_top_left_open", "_top_left_open", fqt.f, fqt.e);
   public static final fqq B = b("door_top_right", "_top_right", fqt.f, fqt.e);
   public static final fqq C = b("door_top_right_open", "_top_right_open", fqt.f, fqt.e);
   public static final fqq D = b("custom_fence_post", "_post", fqt.b, fqt.c);
   public static final fqq E = b("custom_fence_side_north", "_side_north", fqt.b);
   public static final fqq F = b("custom_fence_side_east", "_side_east", fqt.b);
   public static final fqq G = b("custom_fence_side_south", "_side_south", fqt.b);
   public static final fqq H = b("custom_fence_side_west", "_side_west", fqt.b);
   public static final fqq I = b("custom_fence_inventory", "_inventory", fqt.b);
   public static final fqq J = b("fence_post", "_post", fqt.b);
   public static final fqq K = b("fence_side", "_side", fqt.b);
   public static final fqq L = b("fence_inventory", "_inventory", fqt.b);
   public static final fqq M = b("template_wall_post", "_post", fqt.s);
   public static final fqq N = b("template_wall_side", "_side", fqt.s);
   public static final fqq O = b("template_wall_side_tall", "_side_tall", fqt.s);
   public static final fqq P = b("wall_inventory", "_inventory", fqt.s);
   public static final fqq Q = a("template_custom_fence_gate", fqt.b, fqt.c);
   public static final fqq R = b("template_custom_fence_gate_open", "_open", fqt.b, fqt.c);
   public static final fqq S = b("template_custom_fence_gate_wall", "_wall", fqt.b, fqt.c);
   public static final fqq T = b("template_custom_fence_gate_wall_open", "_wall_open", fqt.b, fqt.c);
   public static final fqq U = a("template_fence_gate", fqt.b);
   public static final fqq V = b("template_fence_gate_open", "_open", fqt.b);
   public static final fqq W = b("template_fence_gate_wall", "_wall", fqt.b);
   public static final fqq X = b("template_fence_gate_wall_open", "_wall_open", fqt.b);
   public static final fqq Y = a("pressure_plate_up", fqt.b);
   public static final fqq Z = b("pressure_plate_down", "_down", fqt.b);
   public static final fqq aa = a(fqt.c);
   public static final fqq ab = a("slab", fqt.e, fqt.f, fqt.i);
   public static final fqq ac = b("slab_top", "_top", fqt.e, fqt.f, fqt.i);
   public static final fqq ad = a("leaves", fqt.a);
   public static final fqq ae = a("stairs", fqt.e, fqt.f, fqt.i);
   public static final fqq af = b("inner_stairs", "_inner", fqt.e, fqt.f, fqt.i);
   public static final fqq ag = b("outer_stairs", "_outer", fqt.e, fqt.f, fqt.i);
   public static final fqq ah = b("template_trapdoor_top", "_top", fqt.b);
   public static final fqq ai = b("template_trapdoor_bottom", "_bottom", fqt.b);
   public static final fqq aj = b("template_trapdoor_open", "_open", fqt.b);
   public static final fqq ak = b("template_orientable_trapdoor_top", "_top", fqt.b);
   public static final fqq al = b("template_orientable_trapdoor_bottom", "_bottom", fqt.b);
   public static final fqq am = b("template_orientable_trapdoor_open", "_open", fqt.b);
   public static final fqq an = a("pointed_dripstone", fqt.p);
   public static final fqq ao = a("cross", fqt.p);
   public static final fqq ap = a("tinted_cross", fqt.p);
   public static final fqq aq = a("cross_emissive", fqt.p, fqt.q);
   public static final fqq ar = a("flower_pot_cross", fqt.r);
   public static final fqq as = a("tinted_flower_pot_cross", fqt.r);
   public static final fqq at = a("flower_pot_cross_emissive", fqt.r, fqt.q);
   public static final fqq au = a("rail_flat", fqt.t);
   public static final fqq av = b("rail_curved", "_corner", fqt.t);
   public static final fqq aw = b("template_rail_raised_ne", "_raised_ne", fqt.t);
   public static final fqq ax = b("template_rail_raised_sw", "_raised_sw", fqt.t);
   public static final fqq ay = a("carpet", fqt.u);
   public static final fqq az = a("mossy_carpet_side", fqt.i);
   public static final fqq aA = b("flowerbed_1", "_1", fqt.Q, fqt.z);
   public static final fqq aB = b("flowerbed_2", "_2", fqt.Q, fqt.z);
   public static final fqq aC = b("flowerbed_3", "_3", fqt.Q, fqt.z);
   public static final fqq aD = b("flowerbed_4", "_4", fqt.Q, fqt.z);
   public static final fqq aE = b("template_leaf_litter_1", "_1", fqt.b);
   public static final fqq aF = b("template_leaf_litter_2", "_2", fqt.b);
   public static final fqq aG = b("template_leaf_litter_3", "_3", fqt.b);
   public static final fqq aH = b("template_leaf_litter_4", "_4", fqt.b);
   public static final fqq aI = a("coral_fan", fqt.y);
   public static final fqq aJ = a("coral_wall_fan", fqt.y);
   public static final fqq aK = a("template_glazed_terracotta", fqt.v);
   public static final fqq aL = a("template_chorus_flower", fqt.b);
   public static final fqq aM = a("template_daylight_detector", fqt.f, fqt.i);
   public static final fqq aN = b("template_glass_pane_noside", "_noside", fqt.w);
   public static final fqq aO = b("template_glass_pane_noside_alt", "_noside_alt", fqt.w);
   public static final fqq aP = b("template_glass_pane_post", "_post", fqt.w, fqt.x);
   public static final fqq aQ = b("template_glass_pane_side", "_side", fqt.w, fqt.x);
   public static final fqq aR = b("template_glass_pane_side_alt", "_side_alt", fqt.w, fqt.x);
   public static final fqq aS = a("template_command_block", fqt.g, fqt.h, fqt.i);
   public static final fqq aT = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", fqt.b);
   public static final fqq aU = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", fqt.b);
   public static final fqq aV = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", fqt.b);
   public static final fqq aW = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", fqt.b);
   public static final fqq aX = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", fqt.b);
   public static final fqq aY = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", fqt.b);
   public static final fqq aZ = a("template_anvil", fqt.f);
   public static final fqq[] ba = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, fqt.z)).toArray(fqq[]::new);
   public static final fqq bb = a("stem_fruit", fqt.z, fqt.A);
   public static final fqq bc = a("crop", fqt.B);
   public static final fqq bd = a("template_farmland", fqt.C, fqt.f);
   public static final fqq be = a("template_fire_floor", fqt.D);
   public static final fqq bf = a("template_fire_side", fqt.D);
   public static final fqq bg = a("template_fire_side_alt", fqt.D);
   public static final fqq bh = a("template_fire_up", fqt.D);
   public static final fqq bi = a("template_fire_up_alt", fqt.D);
   public static final fqq bj = a("template_campfire", fqt.D, fqt.L);
   public static final fqq bk = a("template_lantern", fqt.E);
   public static final fqq bl = b("template_hanging_lantern", "_hanging", fqt.E);
   public static final fqq bm = a("template_torch", fqt.H);
   public static final fqq bn = a("template_torch_unlit", fqt.H);
   public static final fqq bo = a("template_torch_wall", fqt.H);
   public static final fqq bp = a("template_torch_wall_unlit", fqt.H);
   public static final fqq bq = a("template_redstone_torch", fqt.H);
   public static final fqq br = a("template_redstone_torch_wall", fqt.H);
   public static final fqq bs = a("template_piston", fqt.F, fqt.e, fqt.i);
   public static final fqq bt = a("template_piston_head", fqt.F, fqt.i, fqt.G);
   public static final fqq bu = a("template_piston_head_short", fqt.F, fqt.i, fqt.G);
   public static final fqq bv = a("template_seagrass", fqt.b);
   public static final fqq bw = a("template_turtle_egg", fqt.a);
   public static final fqq bx = a("template_two_turtle_eggs", fqt.a);
   public static final fqq by = a("template_three_turtle_eggs", fqt.a);
   public static final fqq bz = a("template_four_turtle_eggs", fqt.a);
   public static final fqq bA = a("template_single_face", fqt.b);
   public static final fqq bB = a("template_cauldron_level1", fqt.O, fqt.N, fqt.c, fqt.f, fqt.e, fqt.i);
   public static final fqq bC = a("template_cauldron_level2", fqt.O, fqt.N, fqt.c, fqt.f, fqt.e, fqt.i);
   public static final fqq bD = a("template_cauldron_full", fqt.O, fqt.N, fqt.c, fqt.f, fqt.e, fqt.i);
   public static final fqq bE = a("template_azalea", fqt.f, fqt.i);
   public static final fqq bF = a("template_potted_azalea_bush", fqt.r, fqt.f, fqt.i);
   public static final fqq bG = a("template_potted_azalea_bush", fqt.r, fqt.f, fqt.i);
   public static final fqq bH = a("sniffer_egg", fqt.f, fqt.e, fqt.j, fqt.k, fqt.l, fqt.m);
   public static final fqq bI = b("generated", fqt.I);
   public static final fqq bJ = b("template_music_disc", fqt.I);
   public static final fqq bK = b("handheld", fqt.I);
   public static final fqq bL = b("handheld_rod", fqt.I);
   public static final fqq bM = b("generated", fqt.I, fqt.J);
   public static final fqq bN = b("generated", fqt.I, fqt.J, fqt.K);
   public static final fqq bO = b("template_shulker_box", fqt.c);
   public static final fqq bP = b("template_bed", fqt.c);
   public static final fqq bQ = b("template_chest", fqt.c);
   public static final fqq bR = a("template_bundle_open_front", "_open_front", fqt.I);
   public static final fqq bS = a("template_bundle_open_back", "_open_back", fqt.I);
   public static final fqq bT = b("bow", fqt.I);
   public static final fqq bU = b("crossbow", fqt.I);
   public static final fqq bV = a("template_candle", fqt.a, fqt.c);
   public static final fqq bW = a("template_two_candles", fqt.a, fqt.c);
   public static final fqq bX = a("template_three_candles", fqt.a, fqt.c);
   public static final fqq bY = a("template_four_candles", fqt.a, fqt.c);
   public static final fqq bZ = a("template_cake_with_candle", fqt.M, fqt.e, fqt.i, fqt.f, fqt.c);
   public static final fqq ca = a("template_sculk_shrieker", fqt.e, fqt.i, fqt.f, fqt.c, fqt.P);
   public static final fqq cb = a("template_vault", fqt.f, fqt.e, fqt.i, fqt.g);
   public static final fqq cc = b("handheld_mace", fqt.I);

   private static fqq a(fqt... $$0) {
      return new fqq(Optional.empty(), Optional.empty(), $$0);
   }

   private static fqq a(String $$0, fqt... $$1) {
      return new fqq(Optional.of(ale.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static fqq b(String $$0, fqt... $$1) {
      return new fqq(Optional.of(ale.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static fqq a(String $$0, String $$1, fqt... $$2) {
      return new fqq(Optional.of(ale.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static fqq b(String $$0, String $$1, fqt... $$2) {
      return new fqq(Optional.of(ale.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
