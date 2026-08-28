import java.util.Optional;
import java.util.stream.IntStream;

public class frw {
   public static final frv a = a("cube", fry.c, fry.j, fry.k, fry.l, fry.m, fry.n, fry.o);
   public static final frv b = a("cube_directional", fry.c, fry.j, fry.k, fry.l, fry.m, fry.n, fry.o);
   public static final frv c = a("cube_all", fry.a);
   public static final frv d = a("cube_all_inner_faces", fry.a);
   public static final frv e = b("cube_mirrored_all", "_mirrored", fry.a);
   public static final frv f = b("cube_north_west_mirrored_all", "_north_west_mirrored", fry.a);
   public static final frv g = b("cube_column_uv_locked_x", "_x", fry.d, fry.i);
   public static final frv h = b("cube_column_uv_locked_y", "_y", fry.d, fry.i);
   public static final frv i = b("cube_column_uv_locked_z", "_z", fry.d, fry.i);
   public static final frv j = a("cube_column", fry.d, fry.i);
   public static final frv k = b("cube_column_horizontal", "_horizontal", fry.d, fry.i);
   public static final frv l = b("cube_column_mirrored", "_mirrored", fry.d, fry.i);
   public static final frv m = a("cube_top", fry.f, fry.i);
   public static final frv n = a("cube_bottom_top", fry.f, fry.e, fry.i);
   public static final frv o = a("cube_bottom_top_inner_faces", fry.f, fry.e, fry.i);
   public static final frv p = a("orientable", fry.f, fry.g, fry.i);
   public static final frv q = a("orientable_with_bottom", fry.f, fry.e, fry.i, fry.g);
   public static final frv r = b("orientable_vertical", "_vertical", fry.g, fry.i);
   public static final frv s = a("button", fry.b);
   public static final frv t = b("button_pressed", "_pressed", fry.b);
   public static final frv u = b("button_inventory", "_inventory", fry.b);
   public static final frv v = b("door_bottom_left", "_bottom_left", fry.f, fry.e);
   public static final frv w = b("door_bottom_left_open", "_bottom_left_open", fry.f, fry.e);
   public static final frv x = b("door_bottom_right", "_bottom_right", fry.f, fry.e);
   public static final frv y = b("door_bottom_right_open", "_bottom_right_open", fry.f, fry.e);
   public static final frv z = b("door_top_left", "_top_left", fry.f, fry.e);
   public static final frv A = b("door_top_left_open", "_top_left_open", fry.f, fry.e);
   public static final frv B = b("door_top_right", "_top_right", fry.f, fry.e);
   public static final frv C = b("door_top_right_open", "_top_right_open", fry.f, fry.e);
   public static final frv D = b("custom_fence_post", "_post", fry.b, fry.c);
   public static final frv E = b("custom_fence_side_north", "_side_north", fry.b);
   public static final frv F = b("custom_fence_side_east", "_side_east", fry.b);
   public static final frv G = b("custom_fence_side_south", "_side_south", fry.b);
   public static final frv H = b("custom_fence_side_west", "_side_west", fry.b);
   public static final frv I = b("custom_fence_inventory", "_inventory", fry.b);
   public static final frv J = b("fence_post", "_post", fry.b);
   public static final frv K = b("fence_side", "_side", fry.b);
   public static final frv L = b("fence_inventory", "_inventory", fry.b);
   public static final frv M = b("template_wall_post", "_post", fry.s);
   public static final frv N = b("template_wall_side", "_side", fry.s);
   public static final frv O = b("template_wall_side_tall", "_side_tall", fry.s);
   public static final frv P = b("wall_inventory", "_inventory", fry.s);
   public static final frv Q = a("template_custom_fence_gate", fry.b, fry.c);
   public static final frv R = b("template_custom_fence_gate_open", "_open", fry.b, fry.c);
   public static final frv S = b("template_custom_fence_gate_wall", "_wall", fry.b, fry.c);
   public static final frv T = b("template_custom_fence_gate_wall_open", "_wall_open", fry.b, fry.c);
   public static final frv U = a("template_fence_gate", fry.b);
   public static final frv V = b("template_fence_gate_open", "_open", fry.b);
   public static final frv W = b("template_fence_gate_wall", "_wall", fry.b);
   public static final frv X = b("template_fence_gate_wall_open", "_wall_open", fry.b);
   public static final frv Y = a("pressure_plate_up", fry.b);
   public static final frv Z = b("pressure_plate_down", "_down", fry.b);
   public static final frv aa = a(fry.c);
   public static final frv ab = a("slab", fry.e, fry.f, fry.i);
   public static final frv ac = b("slab_top", "_top", fry.e, fry.f, fry.i);
   public static final frv ad = a("leaves", fry.a);
   public static final frv ae = a("stairs", fry.e, fry.f, fry.i);
   public static final frv af = b("inner_stairs", "_inner", fry.e, fry.f, fry.i);
   public static final frv ag = b("outer_stairs", "_outer", fry.e, fry.f, fry.i);
   public static final frv ah = b("template_trapdoor_top", "_top", fry.b);
   public static final frv ai = b("template_trapdoor_bottom", "_bottom", fry.b);
   public static final frv aj = b("template_trapdoor_open", "_open", fry.b);
   public static final frv ak = b("template_orientable_trapdoor_top", "_top", fry.b);
   public static final frv al = b("template_orientable_trapdoor_bottom", "_bottom", fry.b);
   public static final frv am = b("template_orientable_trapdoor_open", "_open", fry.b);
   public static final frv an = a("pointed_dripstone", fry.p);
   public static final frv ao = a("cross", fry.p);
   public static final frv ap = a("tinted_cross", fry.p);
   public static final frv aq = a("cross_emissive", fry.p, fry.q);
   public static final frv ar = a("flower_pot_cross", fry.r);
   public static final frv as = a("tinted_flower_pot_cross", fry.r);
   public static final frv at = a("flower_pot_cross_emissive", fry.r, fry.q);
   public static final frv au = a("rail_flat", fry.t);
   public static final frv av = b("rail_curved", "_corner", fry.t);
   public static final frv aw = b("template_rail_raised_ne", "_raised_ne", fry.t);
   public static final frv ax = b("template_rail_raised_sw", "_raised_sw", fry.t);
   public static final frv ay = a("carpet", fry.u);
   public static final frv az = a("mossy_carpet_side", fry.i);
   public static final frv aA = b("flowerbed_1", "_1", fry.Q, fry.z);
   public static final frv aB = b("flowerbed_2", "_2", fry.Q, fry.z);
   public static final frv aC = b("flowerbed_3", "_3", fry.Q, fry.z);
   public static final frv aD = b("flowerbed_4", "_4", fry.Q, fry.z);
   public static final frv aE = b("template_leaf_litter_1", "_1", fry.b);
   public static final frv aF = b("template_leaf_litter_2", "_2", fry.b);
   public static final frv aG = b("template_leaf_litter_3", "_3", fry.b);
   public static final frv aH = b("template_leaf_litter_4", "_4", fry.b);
   public static final frv aI = a("coral_fan", fry.y);
   public static final frv aJ = a("coral_wall_fan", fry.y);
   public static final frv aK = a("template_glazed_terracotta", fry.v);
   public static final frv aL = a("template_chorus_flower", fry.b);
   public static final frv aM = a("template_daylight_detector", fry.f, fry.i);
   public static final frv aN = b("template_glass_pane_noside", "_noside", fry.w);
   public static final frv aO = b("template_glass_pane_noside_alt", "_noside_alt", fry.w);
   public static final frv aP = b("template_glass_pane_post", "_post", fry.w, fry.x);
   public static final frv aQ = b("template_glass_pane_side", "_side", fry.w, fry.x);
   public static final frv aR = b("template_glass_pane_side_alt", "_side_alt", fry.w, fry.x);
   public static final frv aS = a("template_command_block", fry.g, fry.h, fry.i);
   public static final frv aT = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", fry.b);
   public static final frv aU = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", fry.b);
   public static final frv aV = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", fry.b);
   public static final frv aW = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", fry.b);
   public static final frv aX = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", fry.b);
   public static final frv aY = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", fry.b);
   public static final frv aZ = a("template_anvil", fry.f);
   public static final frv[] ba = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, fry.z)).toArray(frv[]::new);
   public static final frv bb = a("stem_fruit", fry.z, fry.A);
   public static final frv bc = a("crop", fry.B);
   public static final frv bd = a("template_farmland", fry.C, fry.f);
   public static final frv be = a("template_fire_floor", fry.D);
   public static final frv bf = a("template_fire_side", fry.D);
   public static final frv bg = a("template_fire_side_alt", fry.D);
   public static final frv bh = a("template_fire_up", fry.D);
   public static final frv bi = a("template_fire_up_alt", fry.D);
   public static final frv bj = a("template_campfire", fry.D, fry.L);
   public static final frv bk = a("template_lantern", fry.E);
   public static final frv bl = b("template_hanging_lantern", "_hanging", fry.E);
   public static final frv bm = a("template_torch", fry.H);
   public static final frv bn = a("template_torch_unlit", fry.H);
   public static final frv bo = a("template_torch_wall", fry.H);
   public static final frv bp = a("template_torch_wall_unlit", fry.H);
   public static final frv bq = a("template_redstone_torch", fry.H);
   public static final frv br = a("template_redstone_torch_wall", fry.H);
   public static final frv bs = a("template_piston", fry.F, fry.e, fry.i);
   public static final frv bt = a("template_piston_head", fry.F, fry.i, fry.G);
   public static final frv bu = a("template_piston_head_short", fry.F, fry.i, fry.G);
   public static final frv bv = a("template_seagrass", fry.b);
   public static final frv bw = a("template_turtle_egg", fry.a);
   public static final frv bx = a("template_two_turtle_eggs", fry.a);
   public static final frv by = a("template_three_turtle_eggs", fry.a);
   public static final frv bz = a("template_four_turtle_eggs", fry.a);
   public static final frv bA = a("template_single_face", fry.b);
   public static final frv bB = a("template_cauldron_level1", fry.O, fry.N, fry.c, fry.f, fry.e, fry.i);
   public static final frv bC = a("template_cauldron_level2", fry.O, fry.N, fry.c, fry.f, fry.e, fry.i);
   public static final frv bD = a("template_cauldron_full", fry.O, fry.N, fry.c, fry.f, fry.e, fry.i);
   public static final frv bE = a("template_azalea", fry.f, fry.i);
   public static final frv bF = a("template_potted_azalea_bush", fry.r, fry.f, fry.i);
   public static final frv bG = a("template_potted_azalea_bush", fry.r, fry.f, fry.i);
   public static final frv bH = a("sniffer_egg", fry.f, fry.e, fry.j, fry.k, fry.l, fry.m);
   public static final frv bI = b("generated", fry.I);
   public static final frv bJ = b("template_music_disc", fry.I);
   public static final frv bK = b("handheld", fry.I);
   public static final frv bL = b("handheld_rod", fry.I);
   public static final frv bM = b("generated", fry.I, fry.J);
   public static final frv bN = b("generated", fry.I, fry.J, fry.K);
   public static final frv bO = b("template_shulker_box", fry.c);
   public static final frv bP = b("template_bed", fry.c);
   public static final frv bQ = b("template_chest", fry.c);
   public static final frv bR = a("template_bundle_open_front", "_open_front", fry.I);
   public static final frv bS = a("template_bundle_open_back", "_open_back", fry.I);
   public static final frv bT = b("bow", fry.I);
   public static final frv bU = b("crossbow", fry.I);
   public static final frv bV = a("template_candle", fry.a, fry.c);
   public static final frv bW = a("template_two_candles", fry.a, fry.c);
   public static final frv bX = a("template_three_candles", fry.a, fry.c);
   public static final frv bY = a("template_four_candles", fry.a, fry.c);
   public static final frv bZ = a("template_cake_with_candle", fry.M, fry.e, fry.i, fry.f, fry.c);
   public static final frv ca = a("template_sculk_shrieker", fry.e, fry.i, fry.f, fry.c, fry.P);
   public static final frv cb = a("template_vault", fry.f, fry.e, fry.i, fry.g);
   public static final frv cc = b("handheld_mace", fry.I);

   private static frv a(fry... $$0) {
      return new frv(Optional.empty(), Optional.empty(), $$0);
   }

   private static frv a(String $$0, fry... $$1) {
      return new frv(Optional.of(alg.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static frv b(String $$0, fry... $$1) {
      return new frv(Optional.of(alg.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static frv a(String $$0, String $$1, fry... $$2) {
      return new frv(Optional.of(alg.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static frv b(String $$0, String $$1, fry... $$2) {
      return new frv(Optional.of(alg.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
