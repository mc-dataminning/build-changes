import java.util.Optional;
import java.util.stream.IntStream;

public class frk {
   public static final frj a = a("cube", frm.c, frm.j, frm.k, frm.l, frm.m, frm.n, frm.o);
   public static final frj b = a("cube_directional", frm.c, frm.j, frm.k, frm.l, frm.m, frm.n, frm.o);
   public static final frj c = a("cube_all", frm.a);
   public static final frj d = a("cube_all_inner_faces", frm.a);
   public static final frj e = b("cube_mirrored_all", "_mirrored", frm.a);
   public static final frj f = b("cube_north_west_mirrored_all", "_north_west_mirrored", frm.a);
   public static final frj g = b("cube_column_uv_locked_x", "_x", frm.d, frm.i);
   public static final frj h = b("cube_column_uv_locked_y", "_y", frm.d, frm.i);
   public static final frj i = b("cube_column_uv_locked_z", "_z", frm.d, frm.i);
   public static final frj j = a("cube_column", frm.d, frm.i);
   public static final frj k = b("cube_column_horizontal", "_horizontal", frm.d, frm.i);
   public static final frj l = b("cube_column_mirrored", "_mirrored", frm.d, frm.i);
   public static final frj m = a("cube_top", frm.f, frm.i);
   public static final frj n = a("cube_bottom_top", frm.f, frm.e, frm.i);
   public static final frj o = a("cube_bottom_top_inner_faces", frm.f, frm.e, frm.i);
   public static final frj p = a("orientable", frm.f, frm.g, frm.i);
   public static final frj q = a("orientable_with_bottom", frm.f, frm.e, frm.i, frm.g);
   public static final frj r = b("orientable_vertical", "_vertical", frm.g, frm.i);
   public static final frj s = a("button", frm.b);
   public static final frj t = b("button_pressed", "_pressed", frm.b);
   public static final frj u = b("button_inventory", "_inventory", frm.b);
   public static final frj v = b("door_bottom_left", "_bottom_left", frm.f, frm.e);
   public static final frj w = b("door_bottom_left_open", "_bottom_left_open", frm.f, frm.e);
   public static final frj x = b("door_bottom_right", "_bottom_right", frm.f, frm.e);
   public static final frj y = b("door_bottom_right_open", "_bottom_right_open", frm.f, frm.e);
   public static final frj z = b("door_top_left", "_top_left", frm.f, frm.e);
   public static final frj A = b("door_top_left_open", "_top_left_open", frm.f, frm.e);
   public static final frj B = b("door_top_right", "_top_right", frm.f, frm.e);
   public static final frj C = b("door_top_right_open", "_top_right_open", frm.f, frm.e);
   public static final frj D = b("custom_fence_post", "_post", frm.b, frm.c);
   public static final frj E = b("custom_fence_side_north", "_side_north", frm.b);
   public static final frj F = b("custom_fence_side_east", "_side_east", frm.b);
   public static final frj G = b("custom_fence_side_south", "_side_south", frm.b);
   public static final frj H = b("custom_fence_side_west", "_side_west", frm.b);
   public static final frj I = b("custom_fence_inventory", "_inventory", frm.b);
   public static final frj J = b("fence_post", "_post", frm.b);
   public static final frj K = b("fence_side", "_side", frm.b);
   public static final frj L = b("fence_inventory", "_inventory", frm.b);
   public static final frj M = b("template_wall_post", "_post", frm.s);
   public static final frj N = b("template_wall_side", "_side", frm.s);
   public static final frj O = b("template_wall_side_tall", "_side_tall", frm.s);
   public static final frj P = b("wall_inventory", "_inventory", frm.s);
   public static final frj Q = a("template_custom_fence_gate", frm.b, frm.c);
   public static final frj R = b("template_custom_fence_gate_open", "_open", frm.b, frm.c);
   public static final frj S = b("template_custom_fence_gate_wall", "_wall", frm.b, frm.c);
   public static final frj T = b("template_custom_fence_gate_wall_open", "_wall_open", frm.b, frm.c);
   public static final frj U = a("template_fence_gate", frm.b);
   public static final frj V = b("template_fence_gate_open", "_open", frm.b);
   public static final frj W = b("template_fence_gate_wall", "_wall", frm.b);
   public static final frj X = b("template_fence_gate_wall_open", "_wall_open", frm.b);
   public static final frj Y = a("pressure_plate_up", frm.b);
   public static final frj Z = b("pressure_plate_down", "_down", frm.b);
   public static final frj aa = a(frm.c);
   public static final frj ab = a("slab", frm.e, frm.f, frm.i);
   public static final frj ac = b("slab_top", "_top", frm.e, frm.f, frm.i);
   public static final frj ad = a("leaves", frm.a);
   public static final frj ae = a("stairs", frm.e, frm.f, frm.i);
   public static final frj af = b("inner_stairs", "_inner", frm.e, frm.f, frm.i);
   public static final frj ag = b("outer_stairs", "_outer", frm.e, frm.f, frm.i);
   public static final frj ah = b("template_trapdoor_top", "_top", frm.b);
   public static final frj ai = b("template_trapdoor_bottom", "_bottom", frm.b);
   public static final frj aj = b("template_trapdoor_open", "_open", frm.b);
   public static final frj ak = b("template_orientable_trapdoor_top", "_top", frm.b);
   public static final frj al = b("template_orientable_trapdoor_bottom", "_bottom", frm.b);
   public static final frj am = b("template_orientable_trapdoor_open", "_open", frm.b);
   public static final frj an = a("pointed_dripstone", frm.p);
   public static final frj ao = a("cross", frm.p);
   public static final frj ap = a("tinted_cross", frm.p);
   public static final frj aq = a("cross_emissive", frm.p, frm.q);
   public static final frj ar = a("flower_pot_cross", frm.r);
   public static final frj as = a("tinted_flower_pot_cross", frm.r);
   public static final frj at = a("flower_pot_cross_emissive", frm.r, frm.q);
   public static final frj au = a("rail_flat", frm.t);
   public static final frj av = b("rail_curved", "_corner", frm.t);
   public static final frj aw = b("template_rail_raised_ne", "_raised_ne", frm.t);
   public static final frj ax = b("template_rail_raised_sw", "_raised_sw", frm.t);
   public static final frj ay = a("carpet", frm.u);
   public static final frj az = a("mossy_carpet_side", frm.i);
   public static final frj aA = b("flowerbed_1", "_1", frm.Q, frm.z);
   public static final frj aB = b("flowerbed_2", "_2", frm.Q, frm.z);
   public static final frj aC = b("flowerbed_3", "_3", frm.Q, frm.z);
   public static final frj aD = b("flowerbed_4", "_4", frm.Q, frm.z);
   public static final frj aE = b("template_leaf_litter_1", "_1", frm.b);
   public static final frj aF = b("template_leaf_litter_2", "_2", frm.b);
   public static final frj aG = b("template_leaf_litter_3", "_3", frm.b);
   public static final frj aH = b("template_leaf_litter_4", "_4", frm.b);
   public static final frj aI = a("coral_fan", frm.y);
   public static final frj aJ = a("coral_wall_fan", frm.y);
   public static final frj aK = a("template_glazed_terracotta", frm.v);
   public static final frj aL = a("template_chorus_flower", frm.b);
   public static final frj aM = a("template_daylight_detector", frm.f, frm.i);
   public static final frj aN = b("template_glass_pane_noside", "_noside", frm.w);
   public static final frj aO = b("template_glass_pane_noside_alt", "_noside_alt", frm.w);
   public static final frj aP = b("template_glass_pane_post", "_post", frm.w, frm.x);
   public static final frj aQ = b("template_glass_pane_side", "_side", frm.w, frm.x);
   public static final frj aR = b("template_glass_pane_side_alt", "_side_alt", frm.w, frm.x);
   public static final frj aS = a("template_command_block", frm.g, frm.h, frm.i);
   public static final frj aT = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", frm.b);
   public static final frj aU = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", frm.b);
   public static final frj aV = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", frm.b);
   public static final frj aW = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", frm.b);
   public static final frj aX = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", frm.b);
   public static final frj aY = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", frm.b);
   public static final frj aZ = a("template_anvil", frm.f);
   public static final frj[] ba = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, frm.z)).toArray(frj[]::new);
   public static final frj bb = a("stem_fruit", frm.z, frm.A);
   public static final frj bc = a("crop", frm.B);
   public static final frj bd = a("template_farmland", frm.C, frm.f);
   public static final frj be = a("template_fire_floor", frm.D);
   public static final frj bf = a("template_fire_side", frm.D);
   public static final frj bg = a("template_fire_side_alt", frm.D);
   public static final frj bh = a("template_fire_up", frm.D);
   public static final frj bi = a("template_fire_up_alt", frm.D);
   public static final frj bj = a("template_campfire", frm.D, frm.L);
   public static final frj bk = a("template_lantern", frm.E);
   public static final frj bl = b("template_hanging_lantern", "_hanging", frm.E);
   public static final frj bm = a("template_torch", frm.H);
   public static final frj bn = a("template_torch_unlit", frm.H);
   public static final frj bo = a("template_torch_wall", frm.H);
   public static final frj bp = a("template_torch_wall_unlit", frm.H);
   public static final frj bq = a("template_redstone_torch", frm.H);
   public static final frj br = a("template_redstone_torch_wall", frm.H);
   public static final frj bs = a("template_piston", frm.F, frm.e, frm.i);
   public static final frj bt = a("template_piston_head", frm.F, frm.i, frm.G);
   public static final frj bu = a("template_piston_head_short", frm.F, frm.i, frm.G);
   public static final frj bv = a("template_seagrass", frm.b);
   public static final frj bw = a("template_turtle_egg", frm.a);
   public static final frj bx = a("template_two_turtle_eggs", frm.a);
   public static final frj by = a("template_three_turtle_eggs", frm.a);
   public static final frj bz = a("template_four_turtle_eggs", frm.a);
   public static final frj bA = a("template_single_face", frm.b);
   public static final frj bB = a("template_cauldron_level1", frm.O, frm.N, frm.c, frm.f, frm.e, frm.i);
   public static final frj bC = a("template_cauldron_level2", frm.O, frm.N, frm.c, frm.f, frm.e, frm.i);
   public static final frj bD = a("template_cauldron_full", frm.O, frm.N, frm.c, frm.f, frm.e, frm.i);
   public static final frj bE = a("template_azalea", frm.f, frm.i);
   public static final frj bF = a("template_potted_azalea_bush", frm.r, frm.f, frm.i);
   public static final frj bG = a("template_potted_azalea_bush", frm.r, frm.f, frm.i);
   public static final frj bH = a("sniffer_egg", frm.f, frm.e, frm.j, frm.k, frm.l, frm.m);
   public static final frj bI = b("generated", frm.I);
   public static final frj bJ = b("template_music_disc", frm.I);
   public static final frj bK = b("handheld", frm.I);
   public static final frj bL = b("handheld_rod", frm.I);
   public static final frj bM = b("generated", frm.I, frm.J);
   public static final frj bN = b("generated", frm.I, frm.J, frm.K);
   public static final frj bO = b("template_shulker_box", frm.c);
   public static final frj bP = b("template_bed", frm.c);
   public static final frj bQ = b("template_chest", frm.c);
   public static final frj bR = a("template_bundle_open_front", "_open_front", frm.I);
   public static final frj bS = a("template_bundle_open_back", "_open_back", frm.I);
   public static final frj bT = b("bow", frm.I);
   public static final frj bU = b("crossbow", frm.I);
   public static final frj bV = a("template_candle", frm.a, frm.c);
   public static final frj bW = a("template_two_candles", frm.a, frm.c);
   public static final frj bX = a("template_three_candles", frm.a, frm.c);
   public static final frj bY = a("template_four_candles", frm.a, frm.c);
   public static final frj bZ = a("template_cake_with_candle", frm.M, frm.e, frm.i, frm.f, frm.c);
   public static final frj ca = a("template_sculk_shrieker", frm.e, frm.i, frm.f, frm.c, frm.P);
   public static final frj cb = a("template_vault", frm.f, frm.e, frm.i, frm.g);
   public static final frj cc = b("handheld_mace", frm.I);

   private static frj a(frm... $$0) {
      return new frj(Optional.empty(), Optional.empty(), $$0);
   }

   private static frj a(String $$0, frm... $$1) {
      return new frj(Optional.of(alg.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static frj b(String $$0, frm... $$1) {
      return new frj(Optional.of(alg.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static frj a(String $$0, String $$1, frm... $$2) {
      return new frj(Optional.of(alg.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static frj b(String $$0, String $$1, frm... $$2) {
      return new frj(Optional.of(alg.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
