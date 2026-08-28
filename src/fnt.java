import java.util.Optional;
import java.util.stream.IntStream;

public class fnt {
   public static final fns a = a("cube", fnv.c, fnv.j, fnv.k, fnv.l, fnv.m, fnv.n, fnv.o);
   public static final fns b = a("cube_directional", fnv.c, fnv.j, fnv.k, fnv.l, fnv.m, fnv.n, fnv.o);
   public static final fns c = a("cube_all", fnv.a);
   public static final fns d = a("cube_all_inner_faces", fnv.a);
   public static final fns e = b("cube_mirrored_all", "_mirrored", fnv.a);
   public static final fns f = b("cube_north_west_mirrored_all", "_north_west_mirrored", fnv.a);
   public static final fns g = b("cube_column_uv_locked_x", "_x", fnv.d, fnv.i);
   public static final fns h = b("cube_column_uv_locked_y", "_y", fnv.d, fnv.i);
   public static final fns i = b("cube_column_uv_locked_z", "_z", fnv.d, fnv.i);
   public static final fns j = a("cube_column", fnv.d, fnv.i);
   public static final fns k = b("cube_column_horizontal", "_horizontal", fnv.d, fnv.i);
   public static final fns l = b("cube_column_mirrored", "_mirrored", fnv.d, fnv.i);
   public static final fns m = a("cube_top", fnv.f, fnv.i);
   public static final fns n = a("cube_bottom_top", fnv.f, fnv.e, fnv.i);
   public static final fns o = a("cube_bottom_top_inner_faces", fnv.f, fnv.e, fnv.i);
   public static final fns p = a("orientable", fnv.f, fnv.g, fnv.i);
   public static final fns q = a("orientable_with_bottom", fnv.f, fnv.e, fnv.i, fnv.g);
   public static final fns r = b("orientable_vertical", "_vertical", fnv.g, fnv.i);
   public static final fns s = a("button", fnv.b);
   public static final fns t = b("button_pressed", "_pressed", fnv.b);
   public static final fns u = b("button_inventory", "_inventory", fnv.b);
   public static final fns v = b("door_bottom_left", "_bottom_left", fnv.f, fnv.e);
   public static final fns w = b("door_bottom_left_open", "_bottom_left_open", fnv.f, fnv.e);
   public static final fns x = b("door_bottom_right", "_bottom_right", fnv.f, fnv.e);
   public static final fns y = b("door_bottom_right_open", "_bottom_right_open", fnv.f, fnv.e);
   public static final fns z = b("door_top_left", "_top_left", fnv.f, fnv.e);
   public static final fns A = b("door_top_left_open", "_top_left_open", fnv.f, fnv.e);
   public static final fns B = b("door_top_right", "_top_right", fnv.f, fnv.e);
   public static final fns C = b("door_top_right_open", "_top_right_open", fnv.f, fnv.e);
   public static final fns D = b("custom_fence_post", "_post", fnv.b, fnv.c);
   public static final fns E = b("custom_fence_side_north", "_side_north", fnv.b);
   public static final fns F = b("custom_fence_side_east", "_side_east", fnv.b);
   public static final fns G = b("custom_fence_side_south", "_side_south", fnv.b);
   public static final fns H = b("custom_fence_side_west", "_side_west", fnv.b);
   public static final fns I = b("custom_fence_inventory", "_inventory", fnv.b);
   public static final fns J = b("fence_post", "_post", fnv.b);
   public static final fns K = b("fence_side", "_side", fnv.b);
   public static final fns L = b("fence_inventory", "_inventory", fnv.b);
   public static final fns M = b("template_wall_post", "_post", fnv.s);
   public static final fns N = b("template_wall_side", "_side", fnv.s);
   public static final fns O = b("template_wall_side_tall", "_side_tall", fnv.s);
   public static final fns P = b("wall_inventory", "_inventory", fnv.s);
   public static final fns Q = a("template_custom_fence_gate", fnv.b, fnv.c);
   public static final fns R = b("template_custom_fence_gate_open", "_open", fnv.b, fnv.c);
   public static final fns S = b("template_custom_fence_gate_wall", "_wall", fnv.b, fnv.c);
   public static final fns T = b("template_custom_fence_gate_wall_open", "_wall_open", fnv.b, fnv.c);
   public static final fns U = a("template_fence_gate", fnv.b);
   public static final fns V = b("template_fence_gate_open", "_open", fnv.b);
   public static final fns W = b("template_fence_gate_wall", "_wall", fnv.b);
   public static final fns X = b("template_fence_gate_wall_open", "_wall_open", fnv.b);
   public static final fns Y = a("pressure_plate_up", fnv.b);
   public static final fns Z = b("pressure_plate_down", "_down", fnv.b);
   public static final fns aa = a(fnv.c);
   public static final fns ab = a("slab", fnv.e, fnv.f, fnv.i);
   public static final fns ac = b("slab_top", "_top", fnv.e, fnv.f, fnv.i);
   public static final fns ad = a("leaves", fnv.a);
   public static final fns ae = a("stairs", fnv.e, fnv.f, fnv.i);
   public static final fns af = b("inner_stairs", "_inner", fnv.e, fnv.f, fnv.i);
   public static final fns ag = b("outer_stairs", "_outer", fnv.e, fnv.f, fnv.i);
   public static final fns ah = b("template_trapdoor_top", "_top", fnv.b);
   public static final fns ai = b("template_trapdoor_bottom", "_bottom", fnv.b);
   public static final fns aj = b("template_trapdoor_open", "_open", fnv.b);
   public static final fns ak = b("template_orientable_trapdoor_top", "_top", fnv.b);
   public static final fns al = b("template_orientable_trapdoor_bottom", "_bottom", fnv.b);
   public static final fns am = b("template_orientable_trapdoor_open", "_open", fnv.b);
   public static final fns an = a("pointed_dripstone", fnv.p);
   public static final fns ao = a("cross", fnv.p);
   public static final fns ap = a("tinted_cross", fnv.p);
   public static final fns aq = a("cross_emissive", fnv.p, fnv.q);
   public static final fns ar = a("flower_pot_cross", fnv.r);
   public static final fns as = a("tinted_flower_pot_cross", fnv.r);
   public static final fns at = a("flower_pot_cross_emissive", fnv.r, fnv.q);
   public static final fns au = a("rail_flat", fnv.t);
   public static final fns av = b("rail_curved", "_corner", fnv.t);
   public static final fns aw = b("template_rail_raised_ne", "_raised_ne", fnv.t);
   public static final fns ax = b("template_rail_raised_sw", "_raised_sw", fnv.t);
   public static final fns ay = a("carpet", fnv.u);
   public static final fns az = a("mossy_carpet_side", fnv.i);
   public static final fns aA = b("flowerbed_1", "_1", fnv.Q, fnv.z);
   public static final fns aB = b("flowerbed_2", "_2", fnv.Q, fnv.z);
   public static final fns aC = b("flowerbed_3", "_3", fnv.Q, fnv.z);
   public static final fns aD = b("flowerbed_4", "_4", fnv.Q, fnv.z);
   public static final fns aE = a("coral_fan", fnv.y);
   public static final fns aF = a("coral_wall_fan", fnv.y);
   public static final fns aG = a("template_glazed_terracotta", fnv.v);
   public static final fns aH = a("template_chorus_flower", fnv.b);
   public static final fns aI = a("template_daylight_detector", fnv.f, fnv.i);
   public static final fns aJ = b("template_glass_pane_noside", "_noside", fnv.w);
   public static final fns aK = b("template_glass_pane_noside_alt", "_noside_alt", fnv.w);
   public static final fns aL = b("template_glass_pane_post", "_post", fnv.w, fnv.x);
   public static final fns aM = b("template_glass_pane_side", "_side", fnv.w, fnv.x);
   public static final fns aN = b("template_glass_pane_side_alt", "_side_alt", fnv.w, fnv.x);
   public static final fns aO = a("template_command_block", fnv.g, fnv.h, fnv.i);
   public static final fns aP = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", fnv.b);
   public static final fns aQ = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", fnv.b);
   public static final fns aR = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", fnv.b);
   public static final fns aS = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", fnv.b);
   public static final fns aT = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", fnv.b);
   public static final fns aU = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", fnv.b);
   public static final fns aV = a("template_anvil", fnv.f);
   public static final fns[] aW = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, fnv.z)).toArray(fns[]::new);
   public static final fns aX = a("stem_fruit", fnv.z, fnv.A);
   public static final fns aY = a("crop", fnv.B);
   public static final fns aZ = a("template_farmland", fnv.C, fnv.f);
   public static final fns ba = a("template_fire_floor", fnv.D);
   public static final fns bb = a("template_fire_side", fnv.D);
   public static final fns bc = a("template_fire_side_alt", fnv.D);
   public static final fns bd = a("template_fire_up", fnv.D);
   public static final fns be = a("template_fire_up_alt", fnv.D);
   public static final fns bf = a("template_campfire", fnv.D, fnv.L);
   public static final fns bg = a("template_lantern", fnv.E);
   public static final fns bh = b("template_hanging_lantern", "_hanging", fnv.E);
   public static final fns bi = a("template_torch", fnv.H);
   public static final fns bj = a("template_torch_unlit", fnv.H);
   public static final fns bk = a("template_torch_wall", fnv.H);
   public static final fns bl = a("template_torch_wall_unlit", fnv.H);
   public static final fns bm = a("template_redstone_torch", fnv.H);
   public static final fns bn = a("template_redstone_torch_wall", fnv.H);
   public static final fns bo = a("template_piston", fnv.F, fnv.e, fnv.i);
   public static final fns bp = a("template_piston_head", fnv.F, fnv.i, fnv.G);
   public static final fns bq = a("template_piston_head_short", fnv.F, fnv.i, fnv.G);
   public static final fns br = a("template_seagrass", fnv.b);
   public static final fns bs = a("template_turtle_egg", fnv.a);
   public static final fns bt = a("template_two_turtle_eggs", fnv.a);
   public static final fns bu = a("template_three_turtle_eggs", fnv.a);
   public static final fns bv = a("template_four_turtle_eggs", fnv.a);
   public static final fns bw = a("template_single_face", fnv.b);
   public static final fns bx = a("template_cauldron_level1", fnv.O, fnv.N, fnv.c, fnv.f, fnv.e, fnv.i);
   public static final fns by = a("template_cauldron_level2", fnv.O, fnv.N, fnv.c, fnv.f, fnv.e, fnv.i);
   public static final fns bz = a("template_cauldron_full", fnv.O, fnv.N, fnv.c, fnv.f, fnv.e, fnv.i);
   public static final fns bA = a("template_azalea", fnv.f, fnv.i);
   public static final fns bB = a("template_potted_azalea_bush", fnv.r, fnv.f, fnv.i);
   public static final fns bC = a("template_potted_azalea_bush", fnv.r, fnv.f, fnv.i);
   public static final fns bD = a("sniffer_egg", fnv.f, fnv.e, fnv.j, fnv.k, fnv.l, fnv.m);
   public static final fns bE = b("generated", fnv.I);
   public static final fns bF = b("template_music_disc", fnv.I);
   public static final fns bG = b("handheld", fnv.I);
   public static final fns bH = b("handheld_rod", fnv.I);
   public static final fns bI = b("generated", fnv.I, fnv.J);
   public static final fns bJ = b("generated", fnv.I, fnv.J, fnv.K);
   public static final fns bK = b("template_shulker_box", fnv.c);
   public static final fns bL = b("template_bed", fnv.c);
   public static final fns bM = b("template_chest", fnv.c);
   public static final fns bN = a("template_bundle_open_front", "_open_front", fnv.I);
   public static final fns bO = a("template_bundle_open_back", "_open_back", fnv.I);
   public static final fns bP = b("bow", fnv.I);
   public static final fns bQ = b("crossbow", fnv.I);
   public static final fns bR = a("template_candle", fnv.a, fnv.c);
   public static final fns bS = a("template_two_candles", fnv.a, fnv.c);
   public static final fns bT = a("template_three_candles", fnv.a, fnv.c);
   public static final fns bU = a("template_four_candles", fnv.a, fnv.c);
   public static final fns bV = a("template_cake_with_candle", fnv.M, fnv.e, fnv.i, fnv.f, fnv.c);
   public static final fns bW = a("template_sculk_shrieker", fnv.e, fnv.i, fnv.f, fnv.c, fnv.P);
   public static final fns bX = a("template_vault", fnv.f, fnv.e, fnv.i, fnv.g);
   public static final fns bY = b("handheld_mace", fnv.I);

   private static fns a(fnv... $$0) {
      return new fns(Optional.empty(), Optional.empty(), $$0);
   }

   private static fns a(String $$0, fnv... $$1) {
      return new fns(Optional.of(akv.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static fns b(String $$0, fnv... $$1) {
      return new fns(Optional.of(akv.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static fns a(String $$0, String $$1, fnv... $$2) {
      return new fns(Optional.of(akv.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static fns b(String $$0, String $$1, fnv... $$2) {
      return new fns(Optional.of(akv.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
