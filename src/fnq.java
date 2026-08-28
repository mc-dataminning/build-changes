import java.util.Optional;
import java.util.stream.IntStream;

public class fnq {
   public static final fnp a = a("cube", fns.c, fns.j, fns.k, fns.l, fns.m, fns.n, fns.o);
   public static final fnp b = a("cube_directional", fns.c, fns.j, fns.k, fns.l, fns.m, fns.n, fns.o);
   public static final fnp c = a("cube_all", fns.a);
   public static final fnp d = a("cube_all_inner_faces", fns.a);
   public static final fnp e = b("cube_mirrored_all", "_mirrored", fns.a);
   public static final fnp f = b("cube_north_west_mirrored_all", "_north_west_mirrored", fns.a);
   public static final fnp g = b("cube_column_uv_locked_x", "_x", fns.d, fns.i);
   public static final fnp h = b("cube_column_uv_locked_y", "_y", fns.d, fns.i);
   public static final fnp i = b("cube_column_uv_locked_z", "_z", fns.d, fns.i);
   public static final fnp j = a("cube_column", fns.d, fns.i);
   public static final fnp k = b("cube_column_horizontal", "_horizontal", fns.d, fns.i);
   public static final fnp l = b("cube_column_mirrored", "_mirrored", fns.d, fns.i);
   public static final fnp m = a("cube_top", fns.f, fns.i);
   public static final fnp n = a("cube_bottom_top", fns.f, fns.e, fns.i);
   public static final fnp o = a("cube_bottom_top_inner_faces", fns.f, fns.e, fns.i);
   public static final fnp p = a("orientable", fns.f, fns.g, fns.i);
   public static final fnp q = a("orientable_with_bottom", fns.f, fns.e, fns.i, fns.g);
   public static final fnp r = b("orientable_vertical", "_vertical", fns.g, fns.i);
   public static final fnp s = a("button", fns.b);
   public static final fnp t = b("button_pressed", "_pressed", fns.b);
   public static final fnp u = b("button_inventory", "_inventory", fns.b);
   public static final fnp v = b("door_bottom_left", "_bottom_left", fns.f, fns.e);
   public static final fnp w = b("door_bottom_left_open", "_bottom_left_open", fns.f, fns.e);
   public static final fnp x = b("door_bottom_right", "_bottom_right", fns.f, fns.e);
   public static final fnp y = b("door_bottom_right_open", "_bottom_right_open", fns.f, fns.e);
   public static final fnp z = b("door_top_left", "_top_left", fns.f, fns.e);
   public static final fnp A = b("door_top_left_open", "_top_left_open", fns.f, fns.e);
   public static final fnp B = b("door_top_right", "_top_right", fns.f, fns.e);
   public static final fnp C = b("door_top_right_open", "_top_right_open", fns.f, fns.e);
   public static final fnp D = b("custom_fence_post", "_post", fns.b, fns.c);
   public static final fnp E = b("custom_fence_side_north", "_side_north", fns.b);
   public static final fnp F = b("custom_fence_side_east", "_side_east", fns.b);
   public static final fnp G = b("custom_fence_side_south", "_side_south", fns.b);
   public static final fnp H = b("custom_fence_side_west", "_side_west", fns.b);
   public static final fnp I = b("custom_fence_inventory", "_inventory", fns.b);
   public static final fnp J = b("fence_post", "_post", fns.b);
   public static final fnp K = b("fence_side", "_side", fns.b);
   public static final fnp L = b("fence_inventory", "_inventory", fns.b);
   public static final fnp M = b("template_wall_post", "_post", fns.s);
   public static final fnp N = b("template_wall_side", "_side", fns.s);
   public static final fnp O = b("template_wall_side_tall", "_side_tall", fns.s);
   public static final fnp P = b("wall_inventory", "_inventory", fns.s);
   public static final fnp Q = a("template_custom_fence_gate", fns.b, fns.c);
   public static final fnp R = b("template_custom_fence_gate_open", "_open", fns.b, fns.c);
   public static final fnp S = b("template_custom_fence_gate_wall", "_wall", fns.b, fns.c);
   public static final fnp T = b("template_custom_fence_gate_wall_open", "_wall_open", fns.b, fns.c);
   public static final fnp U = a("template_fence_gate", fns.b);
   public static final fnp V = b("template_fence_gate_open", "_open", fns.b);
   public static final fnp W = b("template_fence_gate_wall", "_wall", fns.b);
   public static final fnp X = b("template_fence_gate_wall_open", "_wall_open", fns.b);
   public static final fnp Y = a("pressure_plate_up", fns.b);
   public static final fnp Z = b("pressure_plate_down", "_down", fns.b);
   public static final fnp aa = a(fns.c);
   public static final fnp ab = a("slab", fns.e, fns.f, fns.i);
   public static final fnp ac = b("slab_top", "_top", fns.e, fns.f, fns.i);
   public static final fnp ad = a("leaves", fns.a);
   public static final fnp ae = a("stairs", fns.e, fns.f, fns.i);
   public static final fnp af = b("inner_stairs", "_inner", fns.e, fns.f, fns.i);
   public static final fnp ag = b("outer_stairs", "_outer", fns.e, fns.f, fns.i);
   public static final fnp ah = b("template_trapdoor_top", "_top", fns.b);
   public static final fnp ai = b("template_trapdoor_bottom", "_bottom", fns.b);
   public static final fnp aj = b("template_trapdoor_open", "_open", fns.b);
   public static final fnp ak = b("template_orientable_trapdoor_top", "_top", fns.b);
   public static final fnp al = b("template_orientable_trapdoor_bottom", "_bottom", fns.b);
   public static final fnp am = b("template_orientable_trapdoor_open", "_open", fns.b);
   public static final fnp an = a("pointed_dripstone", fns.p);
   public static final fnp ao = a("cross", fns.p);
   public static final fnp ap = a("tinted_cross", fns.p);
   public static final fnp aq = a("cross_emissive", fns.p, fns.q);
   public static final fnp ar = a("flower_pot_cross", fns.r);
   public static final fnp as = a("tinted_flower_pot_cross", fns.r);
   public static final fnp at = a("flower_pot_cross_emissive", fns.r, fns.q);
   public static final fnp au = a("rail_flat", fns.t);
   public static final fnp av = b("rail_curved", "_corner", fns.t);
   public static final fnp aw = b("template_rail_raised_ne", "_raised_ne", fns.t);
   public static final fnp ax = b("template_rail_raised_sw", "_raised_sw", fns.t);
   public static final fnp ay = a("carpet", fns.u);
   public static final fnp az = a("mossy_carpet_side", fns.i);
   public static final fnp aA = b("flowerbed_1", "_1", fns.Q, fns.z);
   public static final fnp aB = b("flowerbed_2", "_2", fns.Q, fns.z);
   public static final fnp aC = b("flowerbed_3", "_3", fns.Q, fns.z);
   public static final fnp aD = b("flowerbed_4", "_4", fns.Q, fns.z);
   public static final fnp aE = a("coral_fan", fns.y);
   public static final fnp aF = a("coral_wall_fan", fns.y);
   public static final fnp aG = a("template_glazed_terracotta", fns.v);
   public static final fnp aH = a("template_chorus_flower", fns.b);
   public static final fnp aI = a("template_daylight_detector", fns.f, fns.i);
   public static final fnp aJ = b("template_glass_pane_noside", "_noside", fns.w);
   public static final fnp aK = b("template_glass_pane_noside_alt", "_noside_alt", fns.w);
   public static final fnp aL = b("template_glass_pane_post", "_post", fns.w, fns.x);
   public static final fnp aM = b("template_glass_pane_side", "_side", fns.w, fns.x);
   public static final fnp aN = b("template_glass_pane_side_alt", "_side_alt", fns.w, fns.x);
   public static final fnp aO = a("template_command_block", fns.g, fns.h, fns.i);
   public static final fnp aP = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", fns.b);
   public static final fnp aQ = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", fns.b);
   public static final fnp aR = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", fns.b);
   public static final fnp aS = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", fns.b);
   public static final fnp aT = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", fns.b);
   public static final fnp aU = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", fns.b);
   public static final fnp aV = a("template_anvil", fns.f);
   public static final fnp[] aW = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, fns.z)).toArray(fnp[]::new);
   public static final fnp aX = a("stem_fruit", fns.z, fns.A);
   public static final fnp aY = a("crop", fns.B);
   public static final fnp aZ = a("template_farmland", fns.C, fns.f);
   public static final fnp ba = a("template_fire_floor", fns.D);
   public static final fnp bb = a("template_fire_side", fns.D);
   public static final fnp bc = a("template_fire_side_alt", fns.D);
   public static final fnp bd = a("template_fire_up", fns.D);
   public static final fnp be = a("template_fire_up_alt", fns.D);
   public static final fnp bf = a("template_campfire", fns.D, fns.L);
   public static final fnp bg = a("template_lantern", fns.E);
   public static final fnp bh = b("template_hanging_lantern", "_hanging", fns.E);
   public static final fnp bi = a("template_torch", fns.H);
   public static final fnp bj = a("template_torch_unlit", fns.H);
   public static final fnp bk = a("template_torch_wall", fns.H);
   public static final fnp bl = a("template_torch_wall_unlit", fns.H);
   public static final fnp bm = a("template_redstone_torch", fns.H);
   public static final fnp bn = a("template_redstone_torch_wall", fns.H);
   public static final fnp bo = a("template_piston", fns.F, fns.e, fns.i);
   public static final fnp bp = a("template_piston_head", fns.F, fns.i, fns.G);
   public static final fnp bq = a("template_piston_head_short", fns.F, fns.i, fns.G);
   public static final fnp br = a("template_seagrass", fns.b);
   public static final fnp bs = a("template_turtle_egg", fns.a);
   public static final fnp bt = a("template_two_turtle_eggs", fns.a);
   public static final fnp bu = a("template_three_turtle_eggs", fns.a);
   public static final fnp bv = a("template_four_turtle_eggs", fns.a);
   public static final fnp bw = a("template_single_face", fns.b);
   public static final fnp bx = a("template_cauldron_level1", fns.O, fns.N, fns.c, fns.f, fns.e, fns.i);
   public static final fnp by = a("template_cauldron_level2", fns.O, fns.N, fns.c, fns.f, fns.e, fns.i);
   public static final fnp bz = a("template_cauldron_full", fns.O, fns.N, fns.c, fns.f, fns.e, fns.i);
   public static final fnp bA = a("template_azalea", fns.f, fns.i);
   public static final fnp bB = a("template_potted_azalea_bush", fns.r, fns.f, fns.i);
   public static final fnp bC = a("template_potted_azalea_bush", fns.r, fns.f, fns.i);
   public static final fnp bD = a("sniffer_egg", fns.f, fns.e, fns.j, fns.k, fns.l, fns.m);
   public static final fnp bE = b("generated", fns.I);
   public static final fnp bF = b("template_music_disc", fns.I);
   public static final fnp bG = b("handheld", fns.I);
   public static final fnp bH = b("handheld_rod", fns.I);
   public static final fnp bI = b("generated", fns.I, fns.J);
   public static final fnp bJ = b("generated", fns.I, fns.J, fns.K);
   public static final fnp bK = b("template_shulker_box", fns.c);
   public static final fnp bL = b("template_bed", fns.c);
   public static final fnp bM = b("template_chest", fns.c);
   public static final fnp bN = a("template_bundle_open_front", "_open_front", fns.I);
   public static final fnp bO = a("template_bundle_open_back", "_open_back", fns.I);
   public static final fnp bP = b("bow", fns.I);
   public static final fnp bQ = b("crossbow", fns.I);
   public static final fnp bR = a("template_candle", fns.a, fns.c);
   public static final fnp bS = a("template_two_candles", fns.a, fns.c);
   public static final fnp bT = a("template_three_candles", fns.a, fns.c);
   public static final fnp bU = a("template_four_candles", fns.a, fns.c);
   public static final fnp bV = a("template_cake_with_candle", fns.M, fns.e, fns.i, fns.f, fns.c);
   public static final fnp bW = a("template_sculk_shrieker", fns.e, fns.i, fns.f, fns.c, fns.P);
   public static final fnp bX = a("template_vault", fns.f, fns.e, fns.i, fns.g);
   public static final fnp bY = b("handheld_mace", fns.I);

   private static fnp a(fns... $$0) {
      return new fnp(Optional.empty(), Optional.empty(), $$0);
   }

   private static fnp a(String $$0, fns... $$1) {
      return new fnp(Optional.of(aku.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static fnp b(String $$0, fns... $$1) {
      return new fnp(Optional.of(aku.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static fnp a(String $$0, String $$1, fns... $$2) {
      return new fnp(Optional.of(aku.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static fnp b(String $$0, String $$1, fns... $$2) {
      return new fnp(Optional.of(aku.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
