import java.util.Optional;
import java.util.stream.IntStream;

public class fto {
   public static final ftn a = a("cube", ftq.c, ftq.j, ftq.k, ftq.l, ftq.m, ftq.n, ftq.o);
   public static final ftn b = a("cube_directional", ftq.c, ftq.j, ftq.k, ftq.l, ftq.m, ftq.n, ftq.o);
   public static final ftn c = a("cube_all", ftq.a);
   public static final ftn d = a("cube_all_inner_faces", ftq.a);
   public static final ftn e = b("cube_mirrored_all", "_mirrored", ftq.a);
   public static final ftn f = b("cube_north_west_mirrored_all", "_north_west_mirrored", ftq.a);
   public static final ftn g = b("cube_column_uv_locked_x", "_x", ftq.d, ftq.i);
   public static final ftn h = b("cube_column_uv_locked_y", "_y", ftq.d, ftq.i);
   public static final ftn i = b("cube_column_uv_locked_z", "_z", ftq.d, ftq.i);
   public static final ftn j = a("cube_column", ftq.d, ftq.i);
   public static final ftn k = b("cube_column_horizontal", "_horizontal", ftq.d, ftq.i);
   public static final ftn l = b("cube_column_mirrored", "_mirrored", ftq.d, ftq.i);
   public static final ftn m = a("cube_top", ftq.f, ftq.i);
   public static final ftn n = a("cube_bottom_top", ftq.f, ftq.e, ftq.i);
   public static final ftn o = a("cube_bottom_top_inner_faces", ftq.f, ftq.e, ftq.i);
   public static final ftn p = a("orientable", ftq.f, ftq.g, ftq.i);
   public static final ftn q = a("orientable_with_bottom", ftq.f, ftq.e, ftq.i, ftq.g);
   public static final ftn r = b("orientable_vertical", "_vertical", ftq.g, ftq.i);
   public static final ftn s = a("button", ftq.b);
   public static final ftn t = b("button_pressed", "_pressed", ftq.b);
   public static final ftn u = b("button_inventory", "_inventory", ftq.b);
   public static final ftn v = b("door_bottom_left", "_bottom_left", ftq.f, ftq.e);
   public static final ftn w = b("door_bottom_left_open", "_bottom_left_open", ftq.f, ftq.e);
   public static final ftn x = b("door_bottom_right", "_bottom_right", ftq.f, ftq.e);
   public static final ftn y = b("door_bottom_right_open", "_bottom_right_open", ftq.f, ftq.e);
   public static final ftn z = b("door_top_left", "_top_left", ftq.f, ftq.e);
   public static final ftn A = b("door_top_left_open", "_top_left_open", ftq.f, ftq.e);
   public static final ftn B = b("door_top_right", "_top_right", ftq.f, ftq.e);
   public static final ftn C = b("door_top_right_open", "_top_right_open", ftq.f, ftq.e);
   public static final ftn D = b("custom_fence_post", "_post", ftq.b, ftq.c);
   public static final ftn E = b("custom_fence_side_north", "_side_north", ftq.b);
   public static final ftn F = b("custom_fence_side_east", "_side_east", ftq.b);
   public static final ftn G = b("custom_fence_side_south", "_side_south", ftq.b);
   public static final ftn H = b("custom_fence_side_west", "_side_west", ftq.b);
   public static final ftn I = b("custom_fence_inventory", "_inventory", ftq.b);
   public static final ftn J = b("fence_post", "_post", ftq.b);
   public static final ftn K = b("fence_side", "_side", ftq.b);
   public static final ftn L = b("fence_inventory", "_inventory", ftq.b);
   public static final ftn M = b("template_wall_post", "_post", ftq.s);
   public static final ftn N = b("template_wall_side", "_side", ftq.s);
   public static final ftn O = b("template_wall_side_tall", "_side_tall", ftq.s);
   public static final ftn P = b("wall_inventory", "_inventory", ftq.s);
   public static final ftn Q = a("template_custom_fence_gate", ftq.b, ftq.c);
   public static final ftn R = b("template_custom_fence_gate_open", "_open", ftq.b, ftq.c);
   public static final ftn S = b("template_custom_fence_gate_wall", "_wall", ftq.b, ftq.c);
   public static final ftn T = b("template_custom_fence_gate_wall_open", "_wall_open", ftq.b, ftq.c);
   public static final ftn U = a("template_fence_gate", ftq.b);
   public static final ftn V = b("template_fence_gate_open", "_open", ftq.b);
   public static final ftn W = b("template_fence_gate_wall", "_wall", ftq.b);
   public static final ftn X = b("template_fence_gate_wall_open", "_wall_open", ftq.b);
   public static final ftn Y = a("pressure_plate_up", ftq.b);
   public static final ftn Z = b("pressure_plate_down", "_down", ftq.b);
   public static final ftn aa = a(ftq.c);
   public static final ftn ab = a("slab", ftq.e, ftq.f, ftq.i);
   public static final ftn ac = b("slab_top", "_top", ftq.e, ftq.f, ftq.i);
   public static final ftn ad = a("leaves", ftq.a);
   public static final ftn ae = a("stairs", ftq.e, ftq.f, ftq.i);
   public static final ftn af = b("inner_stairs", "_inner", ftq.e, ftq.f, ftq.i);
   public static final ftn ag = b("outer_stairs", "_outer", ftq.e, ftq.f, ftq.i);
   public static final ftn ah = b("template_trapdoor_top", "_top", ftq.b);
   public static final ftn ai = b("template_trapdoor_bottom", "_bottom", ftq.b);
   public static final ftn aj = b("template_trapdoor_open", "_open", ftq.b);
   public static final ftn ak = b("template_orientable_trapdoor_top", "_top", ftq.b);
   public static final ftn al = b("template_orientable_trapdoor_bottom", "_bottom", ftq.b);
   public static final ftn am = b("template_orientable_trapdoor_open", "_open", ftq.b);
   public static final ftn an = a("pointed_dripstone", ftq.p);
   public static final ftn ao = a("cross", ftq.p);
   public static final ftn ap = a("tinted_cross", ftq.p);
   public static final ftn aq = a("cross_emissive", ftq.p, ftq.q);
   public static final ftn ar = a("flower_pot_cross", ftq.r);
   public static final ftn as = a("tinted_flower_pot_cross", ftq.r);
   public static final ftn at = a("flower_pot_cross_emissive", ftq.r, ftq.q);
   public static final ftn au = a("rail_flat", ftq.t);
   public static final ftn av = b("rail_curved", "_corner", ftq.t);
   public static final ftn aw = b("template_rail_raised_ne", "_raised_ne", ftq.t);
   public static final ftn ax = b("template_rail_raised_sw", "_raised_sw", ftq.t);
   public static final ftn ay = a("carpet", ftq.u);
   public static final ftn az = a("mossy_carpet_side", ftq.i);
   public static final ftn aA = b("flowerbed_1", "_1", ftq.Q, ftq.z);
   public static final ftn aB = b("flowerbed_2", "_2", ftq.Q, ftq.z);
   public static final ftn aC = b("flowerbed_3", "_3", ftq.Q, ftq.z);
   public static final ftn aD = b("flowerbed_4", "_4", ftq.Q, ftq.z);
   public static final ftn aE = b("template_leaf_litter_1", "_1", ftq.b);
   public static final ftn aF = b("template_leaf_litter_2", "_2", ftq.b);
   public static final ftn aG = b("template_leaf_litter_3", "_3", ftq.b);
   public static final ftn aH = b("template_leaf_litter_4", "_4", ftq.b);
   public static final ftn aI = a("coral_fan", ftq.y);
   public static final ftn aJ = a("coral_wall_fan", ftq.y);
   public static final ftn aK = a("template_glazed_terracotta", ftq.v);
   public static final ftn aL = a("template_chorus_flower", ftq.b);
   public static final ftn aM = a("template_daylight_detector", ftq.f, ftq.i);
   public static final ftn aN = b("template_glass_pane_noside", "_noside", ftq.w);
   public static final ftn aO = b("template_glass_pane_noside_alt", "_noside_alt", ftq.w);
   public static final ftn aP = b("template_glass_pane_post", "_post", ftq.w, ftq.x);
   public static final ftn aQ = b("template_glass_pane_side", "_side", ftq.w, ftq.x);
   public static final ftn aR = b("template_glass_pane_side_alt", "_side_alt", ftq.w, ftq.x);
   public static final ftn aS = a("template_command_block", ftq.g, ftq.h, ftq.i);
   public static final ftn aT = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", ftq.b);
   public static final ftn aU = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", ftq.b);
   public static final ftn aV = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", ftq.b);
   public static final ftn aW = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", ftq.b);
   public static final ftn aX = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", ftq.b);
   public static final ftn aY = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", ftq.b);
   public static final ftn aZ = a("template_anvil", ftq.f);
   public static final ftn[] ba = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, ftq.z)).toArray(ftn[]::new);
   public static final ftn bb = a("stem_fruit", ftq.z, ftq.A);
   public static final ftn bc = a("crop", ftq.B);
   public static final ftn bd = a("template_farmland", ftq.C, ftq.f);
   public static final ftn be = a("template_fire_floor", ftq.D);
   public static final ftn bf = a("template_fire_side", ftq.D);
   public static final ftn bg = a("template_fire_side_alt", ftq.D);
   public static final ftn bh = a("template_fire_up", ftq.D);
   public static final ftn bi = a("template_fire_up_alt", ftq.D);
   public static final ftn bj = a("template_campfire", ftq.D, ftq.L);
   public static final ftn bk = a("template_lantern", ftq.E);
   public static final ftn bl = b("template_hanging_lantern", "_hanging", ftq.E);
   public static final ftn bm = a("template_torch", ftq.H);
   public static final ftn bn = a("template_torch_unlit", ftq.H);
   public static final ftn bo = a("template_torch_wall", ftq.H);
   public static final ftn bp = a("template_torch_wall_unlit", ftq.H);
   public static final ftn bq = a("template_redstone_torch", ftq.H);
   public static final ftn br = a("template_redstone_torch_wall", ftq.H);
   public static final ftn bs = a("template_piston", ftq.F, ftq.e, ftq.i);
   public static final ftn bt = a("template_piston_head", ftq.F, ftq.i, ftq.G);
   public static final ftn bu = a("template_piston_head_short", ftq.F, ftq.i, ftq.G);
   public static final ftn bv = a("template_seagrass", ftq.b);
   public static final ftn bw = a("template_turtle_egg", ftq.a);
   public static final ftn bx = a("template_two_turtle_eggs", ftq.a);
   public static final ftn by = a("template_three_turtle_eggs", ftq.a);
   public static final ftn bz = a("template_four_turtle_eggs", ftq.a);
   public static final ftn bA = a("template_single_face", ftq.b);
   public static final ftn bB = a("template_cauldron_level1", ftq.O, ftq.N, ftq.c, ftq.f, ftq.e, ftq.i);
   public static final ftn bC = a("template_cauldron_level2", ftq.O, ftq.N, ftq.c, ftq.f, ftq.e, ftq.i);
   public static final ftn bD = a("template_cauldron_full", ftq.O, ftq.N, ftq.c, ftq.f, ftq.e, ftq.i);
   public static final ftn bE = a("template_azalea", ftq.f, ftq.i);
   public static final ftn bF = a("template_potted_azalea_bush", ftq.r, ftq.f, ftq.i);
   public static final ftn bG = a("template_potted_azalea_bush", ftq.r, ftq.f, ftq.i);
   public static final ftn bH = a("sniffer_egg", ftq.f, ftq.e, ftq.j, ftq.k, ftq.l, ftq.m);
   public static final ftn bI = b("generated", ftq.I);
   public static final ftn bJ = b("template_music_disc", ftq.I);
   public static final ftn bK = b("handheld", ftq.I);
   public static final ftn bL = b("handheld_rod", ftq.I);
   public static final ftn bM = b("generated", ftq.I, ftq.J);
   public static final ftn bN = b("generated", ftq.I, ftq.J, ftq.K);
   public static final ftn bO = b("template_shulker_box", ftq.c);
   public static final ftn bP = b("template_bed", ftq.c);
   public static final ftn bQ = b("template_chest", ftq.c);
   public static final ftn bR = a("template_bundle_open_front", "_open_front", ftq.I);
   public static final ftn bS = a("template_bundle_open_back", "_open_back", ftq.I);
   public static final ftn bT = b("bow", ftq.I);
   public static final ftn bU = b("crossbow", ftq.I);
   public static final ftn bV = a("template_candle", ftq.a, ftq.c);
   public static final ftn bW = a("template_two_candles", ftq.a, ftq.c);
   public static final ftn bX = a("template_three_candles", ftq.a, ftq.c);
   public static final ftn bY = a("template_four_candles", ftq.a, ftq.c);
   public static final ftn bZ = a("template_cake_with_candle", ftq.M, ftq.e, ftq.i, ftq.f, ftq.c);
   public static final ftn ca = a("template_sculk_shrieker", ftq.e, ftq.i, ftq.f, ftq.c, ftq.P);
   public static final ftn cb = a("template_vault", ftq.f, ftq.e, ftq.i, ftq.g);
   public static final ftn cc = b("handheld_mace", ftq.I);

   private static ftn a(ftq... $$0) {
      return new ftn(Optional.empty(), Optional.empty(), $$0);
   }

   private static ftn a(String $$0, ftq... $$1) {
      return new ftn(Optional.of(alk.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static ftn b(String $$0, ftq... $$1) {
      return new ftn(Optional.of(alk.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static ftn a(String $$0, String $$1, ftq... $$2) {
      return new ftn(Optional.of(alk.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static ftn b(String $$0, String $$1, ftq... $$2) {
      return new ftn(Optional.of(alk.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
