import java.util.Optional;
import java.util.stream.IntStream;

public class fsb {
   public static final fsa a = a("cube", fsd.c, fsd.j, fsd.k, fsd.l, fsd.m, fsd.n, fsd.o);
   public static final fsa b = a("cube_directional", fsd.c, fsd.j, fsd.k, fsd.l, fsd.m, fsd.n, fsd.o);
   public static final fsa c = a("cube_all", fsd.a);
   public static final fsa d = a("cube_all_inner_faces", fsd.a);
   public static final fsa e = b("cube_mirrored_all", "_mirrored", fsd.a);
   public static final fsa f = b("cube_north_west_mirrored_all", "_north_west_mirrored", fsd.a);
   public static final fsa g = b("cube_column_uv_locked_x", "_x", fsd.d, fsd.i);
   public static final fsa h = b("cube_column_uv_locked_y", "_y", fsd.d, fsd.i);
   public static final fsa i = b("cube_column_uv_locked_z", "_z", fsd.d, fsd.i);
   public static final fsa j = a("cube_column", fsd.d, fsd.i);
   public static final fsa k = b("cube_column_horizontal", "_horizontal", fsd.d, fsd.i);
   public static final fsa l = b("cube_column_mirrored", "_mirrored", fsd.d, fsd.i);
   public static final fsa m = a("cube_top", fsd.f, fsd.i);
   public static final fsa n = a("cube_bottom_top", fsd.f, fsd.e, fsd.i);
   public static final fsa o = a("cube_bottom_top_inner_faces", fsd.f, fsd.e, fsd.i);
   public static final fsa p = a("orientable", fsd.f, fsd.g, fsd.i);
   public static final fsa q = a("orientable_with_bottom", fsd.f, fsd.e, fsd.i, fsd.g);
   public static final fsa r = b("orientable_vertical", "_vertical", fsd.g, fsd.i);
   public static final fsa s = a("button", fsd.b);
   public static final fsa t = b("button_pressed", "_pressed", fsd.b);
   public static final fsa u = b("button_inventory", "_inventory", fsd.b);
   public static final fsa v = b("door_bottom_left", "_bottom_left", fsd.f, fsd.e);
   public static final fsa w = b("door_bottom_left_open", "_bottom_left_open", fsd.f, fsd.e);
   public static final fsa x = b("door_bottom_right", "_bottom_right", fsd.f, fsd.e);
   public static final fsa y = b("door_bottom_right_open", "_bottom_right_open", fsd.f, fsd.e);
   public static final fsa z = b("door_top_left", "_top_left", fsd.f, fsd.e);
   public static final fsa A = b("door_top_left_open", "_top_left_open", fsd.f, fsd.e);
   public static final fsa B = b("door_top_right", "_top_right", fsd.f, fsd.e);
   public static final fsa C = b("door_top_right_open", "_top_right_open", fsd.f, fsd.e);
   public static final fsa D = b("custom_fence_post", "_post", fsd.b, fsd.c);
   public static final fsa E = b("custom_fence_side_north", "_side_north", fsd.b);
   public static final fsa F = b("custom_fence_side_east", "_side_east", fsd.b);
   public static final fsa G = b("custom_fence_side_south", "_side_south", fsd.b);
   public static final fsa H = b("custom_fence_side_west", "_side_west", fsd.b);
   public static final fsa I = b("custom_fence_inventory", "_inventory", fsd.b);
   public static final fsa J = b("fence_post", "_post", fsd.b);
   public static final fsa K = b("fence_side", "_side", fsd.b);
   public static final fsa L = b("fence_inventory", "_inventory", fsd.b);
   public static final fsa M = b("template_wall_post", "_post", fsd.s);
   public static final fsa N = b("template_wall_side", "_side", fsd.s);
   public static final fsa O = b("template_wall_side_tall", "_side_tall", fsd.s);
   public static final fsa P = b("wall_inventory", "_inventory", fsd.s);
   public static final fsa Q = a("template_custom_fence_gate", fsd.b, fsd.c);
   public static final fsa R = b("template_custom_fence_gate_open", "_open", fsd.b, fsd.c);
   public static final fsa S = b("template_custom_fence_gate_wall", "_wall", fsd.b, fsd.c);
   public static final fsa T = b("template_custom_fence_gate_wall_open", "_wall_open", fsd.b, fsd.c);
   public static final fsa U = a("template_fence_gate", fsd.b);
   public static final fsa V = b("template_fence_gate_open", "_open", fsd.b);
   public static final fsa W = b("template_fence_gate_wall", "_wall", fsd.b);
   public static final fsa X = b("template_fence_gate_wall_open", "_wall_open", fsd.b);
   public static final fsa Y = a("pressure_plate_up", fsd.b);
   public static final fsa Z = b("pressure_plate_down", "_down", fsd.b);
   public static final fsa aa = a(fsd.c);
   public static final fsa ab = a("slab", fsd.e, fsd.f, fsd.i);
   public static final fsa ac = b("slab_top", "_top", fsd.e, fsd.f, fsd.i);
   public static final fsa ad = a("leaves", fsd.a);
   public static final fsa ae = a("stairs", fsd.e, fsd.f, fsd.i);
   public static final fsa af = b("inner_stairs", "_inner", fsd.e, fsd.f, fsd.i);
   public static final fsa ag = b("outer_stairs", "_outer", fsd.e, fsd.f, fsd.i);
   public static final fsa ah = b("template_trapdoor_top", "_top", fsd.b);
   public static final fsa ai = b("template_trapdoor_bottom", "_bottom", fsd.b);
   public static final fsa aj = b("template_trapdoor_open", "_open", fsd.b);
   public static final fsa ak = b("template_orientable_trapdoor_top", "_top", fsd.b);
   public static final fsa al = b("template_orientable_trapdoor_bottom", "_bottom", fsd.b);
   public static final fsa am = b("template_orientable_trapdoor_open", "_open", fsd.b);
   public static final fsa an = a("pointed_dripstone", fsd.p);
   public static final fsa ao = a("cross", fsd.p);
   public static final fsa ap = a("tinted_cross", fsd.p);
   public static final fsa aq = a("cross_emissive", fsd.p, fsd.q);
   public static final fsa ar = a("flower_pot_cross", fsd.r);
   public static final fsa as = a("tinted_flower_pot_cross", fsd.r);
   public static final fsa at = a("flower_pot_cross_emissive", fsd.r, fsd.q);
   public static final fsa au = a("rail_flat", fsd.t);
   public static final fsa av = b("rail_curved", "_corner", fsd.t);
   public static final fsa aw = b("template_rail_raised_ne", "_raised_ne", fsd.t);
   public static final fsa ax = b("template_rail_raised_sw", "_raised_sw", fsd.t);
   public static final fsa ay = a("carpet", fsd.u);
   public static final fsa az = a("mossy_carpet_side", fsd.i);
   public static final fsa aA = b("flowerbed_1", "_1", fsd.Q, fsd.z);
   public static final fsa aB = b("flowerbed_2", "_2", fsd.Q, fsd.z);
   public static final fsa aC = b("flowerbed_3", "_3", fsd.Q, fsd.z);
   public static final fsa aD = b("flowerbed_4", "_4", fsd.Q, fsd.z);
   public static final fsa aE = b("template_leaf_litter_1", "_1", fsd.b);
   public static final fsa aF = b("template_leaf_litter_2", "_2", fsd.b);
   public static final fsa aG = b("template_leaf_litter_3", "_3", fsd.b);
   public static final fsa aH = b("template_leaf_litter_4", "_4", fsd.b);
   public static final fsa aI = a("coral_fan", fsd.y);
   public static final fsa aJ = a("coral_wall_fan", fsd.y);
   public static final fsa aK = a("template_glazed_terracotta", fsd.v);
   public static final fsa aL = a("template_chorus_flower", fsd.b);
   public static final fsa aM = a("template_daylight_detector", fsd.f, fsd.i);
   public static final fsa aN = b("template_glass_pane_noside", "_noside", fsd.w);
   public static final fsa aO = b("template_glass_pane_noside_alt", "_noside_alt", fsd.w);
   public static final fsa aP = b("template_glass_pane_post", "_post", fsd.w, fsd.x);
   public static final fsa aQ = b("template_glass_pane_side", "_side", fsd.w, fsd.x);
   public static final fsa aR = b("template_glass_pane_side_alt", "_side_alt", fsd.w, fsd.x);
   public static final fsa aS = a("template_command_block", fsd.g, fsd.h, fsd.i);
   public static final fsa aT = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", fsd.b);
   public static final fsa aU = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", fsd.b);
   public static final fsa aV = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", fsd.b);
   public static final fsa aW = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", fsd.b);
   public static final fsa aX = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", fsd.b);
   public static final fsa aY = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", fsd.b);
   public static final fsa aZ = a("template_anvil", fsd.f);
   public static final fsa[] ba = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, fsd.z)).toArray(fsa[]::new);
   public static final fsa bb = a("stem_fruit", fsd.z, fsd.A);
   public static final fsa bc = a("crop", fsd.B);
   public static final fsa bd = a("template_farmland", fsd.C, fsd.f);
   public static final fsa be = a("template_fire_floor", fsd.D);
   public static final fsa bf = a("template_fire_side", fsd.D);
   public static final fsa bg = a("template_fire_side_alt", fsd.D);
   public static final fsa bh = a("template_fire_up", fsd.D);
   public static final fsa bi = a("template_fire_up_alt", fsd.D);
   public static final fsa bj = a("template_campfire", fsd.D, fsd.L);
   public static final fsa bk = a("template_lantern", fsd.E);
   public static final fsa bl = b("template_hanging_lantern", "_hanging", fsd.E);
   public static final fsa bm = a("template_torch", fsd.H);
   public static final fsa bn = a("template_torch_unlit", fsd.H);
   public static final fsa bo = a("template_torch_wall", fsd.H);
   public static final fsa bp = a("template_torch_wall_unlit", fsd.H);
   public static final fsa bq = a("template_redstone_torch", fsd.H);
   public static final fsa br = a("template_redstone_torch_wall", fsd.H);
   public static final fsa bs = a("template_piston", fsd.F, fsd.e, fsd.i);
   public static final fsa bt = a("template_piston_head", fsd.F, fsd.i, fsd.G);
   public static final fsa bu = a("template_piston_head_short", fsd.F, fsd.i, fsd.G);
   public static final fsa bv = a("template_seagrass", fsd.b);
   public static final fsa bw = a("template_turtle_egg", fsd.a);
   public static final fsa bx = a("template_two_turtle_eggs", fsd.a);
   public static final fsa by = a("template_three_turtle_eggs", fsd.a);
   public static final fsa bz = a("template_four_turtle_eggs", fsd.a);
   public static final fsa bA = a("template_single_face", fsd.b);
   public static final fsa bB = a("template_cauldron_level1", fsd.O, fsd.N, fsd.c, fsd.f, fsd.e, fsd.i);
   public static final fsa bC = a("template_cauldron_level2", fsd.O, fsd.N, fsd.c, fsd.f, fsd.e, fsd.i);
   public static final fsa bD = a("template_cauldron_full", fsd.O, fsd.N, fsd.c, fsd.f, fsd.e, fsd.i);
   public static final fsa bE = a("template_azalea", fsd.f, fsd.i);
   public static final fsa bF = a("template_potted_azalea_bush", fsd.r, fsd.f, fsd.i);
   public static final fsa bG = a("template_potted_azalea_bush", fsd.r, fsd.f, fsd.i);
   public static final fsa bH = a("sniffer_egg", fsd.f, fsd.e, fsd.j, fsd.k, fsd.l, fsd.m);
   public static final fsa bI = b("generated", fsd.I);
   public static final fsa bJ = b("template_music_disc", fsd.I);
   public static final fsa bK = b("handheld", fsd.I);
   public static final fsa bL = b("handheld_rod", fsd.I);
   public static final fsa bM = b("generated", fsd.I, fsd.J);
   public static final fsa bN = b("generated", fsd.I, fsd.J, fsd.K);
   public static final fsa bO = b("template_shulker_box", fsd.c);
   public static final fsa bP = b("template_bed", fsd.c);
   public static final fsa bQ = b("template_chest", fsd.c);
   public static final fsa bR = a("template_bundle_open_front", "_open_front", fsd.I);
   public static final fsa bS = a("template_bundle_open_back", "_open_back", fsd.I);
   public static final fsa bT = b("bow", fsd.I);
   public static final fsa bU = b("crossbow", fsd.I);
   public static final fsa bV = a("template_candle", fsd.a, fsd.c);
   public static final fsa bW = a("template_two_candles", fsd.a, fsd.c);
   public static final fsa bX = a("template_three_candles", fsd.a, fsd.c);
   public static final fsa bY = a("template_four_candles", fsd.a, fsd.c);
   public static final fsa bZ = a("template_cake_with_candle", fsd.M, fsd.e, fsd.i, fsd.f, fsd.c);
   public static final fsa ca = a("template_sculk_shrieker", fsd.e, fsd.i, fsd.f, fsd.c, fsd.P);
   public static final fsa cb = a("template_vault", fsd.f, fsd.e, fsd.i, fsd.g);
   public static final fsa cc = b("handheld_mace", fsd.I);

   private static fsa a(fsd... $$0) {
      return new fsa(Optional.empty(), Optional.empty(), $$0);
   }

   private static fsa a(String $$0, fsd... $$1) {
      return new fsa(Optional.of(alg.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static fsa b(String $$0, fsd... $$1) {
      return new fsa(Optional.of(alg.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static fsa a(String $$0, String $$1, fsd... $$2) {
      return new fsa(Optional.of(alg.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static fsa b(String $$0, String $$1, fsd... $$2) {
      return new fsa(Optional.of(alg.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
