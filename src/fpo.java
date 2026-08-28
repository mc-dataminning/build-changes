import java.util.Optional;
import java.util.stream.IntStream;

public class fpo {
   public static final fpn a = a("cube", fpq.c, fpq.j, fpq.k, fpq.l, fpq.m, fpq.n, fpq.o);
   public static final fpn b = a("cube_directional", fpq.c, fpq.j, fpq.k, fpq.l, fpq.m, fpq.n, fpq.o);
   public static final fpn c = a("cube_all", fpq.a);
   public static final fpn d = a("cube_all_inner_faces", fpq.a);
   public static final fpn e = b("cube_mirrored_all", "_mirrored", fpq.a);
   public static final fpn f = b("cube_north_west_mirrored_all", "_north_west_mirrored", fpq.a);
   public static final fpn g = b("cube_column_uv_locked_x", "_x", fpq.d, fpq.i);
   public static final fpn h = b("cube_column_uv_locked_y", "_y", fpq.d, fpq.i);
   public static final fpn i = b("cube_column_uv_locked_z", "_z", fpq.d, fpq.i);
   public static final fpn j = a("cube_column", fpq.d, fpq.i);
   public static final fpn k = b("cube_column_horizontal", "_horizontal", fpq.d, fpq.i);
   public static final fpn l = b("cube_column_mirrored", "_mirrored", fpq.d, fpq.i);
   public static final fpn m = a("cube_top", fpq.f, fpq.i);
   public static final fpn n = a("cube_bottom_top", fpq.f, fpq.e, fpq.i);
   public static final fpn o = a("cube_bottom_top_inner_faces", fpq.f, fpq.e, fpq.i);
   public static final fpn p = a("orientable", fpq.f, fpq.g, fpq.i);
   public static final fpn q = a("orientable_with_bottom", fpq.f, fpq.e, fpq.i, fpq.g);
   public static final fpn r = b("orientable_vertical", "_vertical", fpq.g, fpq.i);
   public static final fpn s = a("button", fpq.b);
   public static final fpn t = b("button_pressed", "_pressed", fpq.b);
   public static final fpn u = b("button_inventory", "_inventory", fpq.b);
   public static final fpn v = b("door_bottom_left", "_bottom_left", fpq.f, fpq.e);
   public static final fpn w = b("door_bottom_left_open", "_bottom_left_open", fpq.f, fpq.e);
   public static final fpn x = b("door_bottom_right", "_bottom_right", fpq.f, fpq.e);
   public static final fpn y = b("door_bottom_right_open", "_bottom_right_open", fpq.f, fpq.e);
   public static final fpn z = b("door_top_left", "_top_left", fpq.f, fpq.e);
   public static final fpn A = b("door_top_left_open", "_top_left_open", fpq.f, fpq.e);
   public static final fpn B = b("door_top_right", "_top_right", fpq.f, fpq.e);
   public static final fpn C = b("door_top_right_open", "_top_right_open", fpq.f, fpq.e);
   public static final fpn D = b("custom_fence_post", "_post", fpq.b, fpq.c);
   public static final fpn E = b("custom_fence_side_north", "_side_north", fpq.b);
   public static final fpn F = b("custom_fence_side_east", "_side_east", fpq.b);
   public static final fpn G = b("custom_fence_side_south", "_side_south", fpq.b);
   public static final fpn H = b("custom_fence_side_west", "_side_west", fpq.b);
   public static final fpn I = b("custom_fence_inventory", "_inventory", fpq.b);
   public static final fpn J = b("fence_post", "_post", fpq.b);
   public static final fpn K = b("fence_side", "_side", fpq.b);
   public static final fpn L = b("fence_inventory", "_inventory", fpq.b);
   public static final fpn M = b("template_wall_post", "_post", fpq.s);
   public static final fpn N = b("template_wall_side", "_side", fpq.s);
   public static final fpn O = b("template_wall_side_tall", "_side_tall", fpq.s);
   public static final fpn P = b("wall_inventory", "_inventory", fpq.s);
   public static final fpn Q = a("template_custom_fence_gate", fpq.b, fpq.c);
   public static final fpn R = b("template_custom_fence_gate_open", "_open", fpq.b, fpq.c);
   public static final fpn S = b("template_custom_fence_gate_wall", "_wall", fpq.b, fpq.c);
   public static final fpn T = b("template_custom_fence_gate_wall_open", "_wall_open", fpq.b, fpq.c);
   public static final fpn U = a("template_fence_gate", fpq.b);
   public static final fpn V = b("template_fence_gate_open", "_open", fpq.b);
   public static final fpn W = b("template_fence_gate_wall", "_wall", fpq.b);
   public static final fpn X = b("template_fence_gate_wall_open", "_wall_open", fpq.b);
   public static final fpn Y = a("pressure_plate_up", fpq.b);
   public static final fpn Z = b("pressure_plate_down", "_down", fpq.b);
   public static final fpn aa = a(fpq.c);
   public static final fpn ab = a("slab", fpq.e, fpq.f, fpq.i);
   public static final fpn ac = b("slab_top", "_top", fpq.e, fpq.f, fpq.i);
   public static final fpn ad = a("leaves", fpq.a);
   public static final fpn ae = a("stairs", fpq.e, fpq.f, fpq.i);
   public static final fpn af = b("inner_stairs", "_inner", fpq.e, fpq.f, fpq.i);
   public static final fpn ag = b("outer_stairs", "_outer", fpq.e, fpq.f, fpq.i);
   public static final fpn ah = b("template_trapdoor_top", "_top", fpq.b);
   public static final fpn ai = b("template_trapdoor_bottom", "_bottom", fpq.b);
   public static final fpn aj = b("template_trapdoor_open", "_open", fpq.b);
   public static final fpn ak = b("template_orientable_trapdoor_top", "_top", fpq.b);
   public static final fpn al = b("template_orientable_trapdoor_bottom", "_bottom", fpq.b);
   public static final fpn am = b("template_orientable_trapdoor_open", "_open", fpq.b);
   public static final fpn an = a("pointed_dripstone", fpq.p);
   public static final fpn ao = a("cross", fpq.p);
   public static final fpn ap = a("tinted_cross", fpq.p);
   public static final fpn aq = a("cross_emissive", fpq.p, fpq.q);
   public static final fpn ar = a("flower_pot_cross", fpq.r);
   public static final fpn as = a("tinted_flower_pot_cross", fpq.r);
   public static final fpn at = a("flower_pot_cross_emissive", fpq.r, fpq.q);
   public static final fpn au = a("rail_flat", fpq.t);
   public static final fpn av = b("rail_curved", "_corner", fpq.t);
   public static final fpn aw = b("template_rail_raised_ne", "_raised_ne", fpq.t);
   public static final fpn ax = b("template_rail_raised_sw", "_raised_sw", fpq.t);
   public static final fpn ay = a("carpet", fpq.u);
   public static final fpn az = a("mossy_carpet_side", fpq.i);
   public static final fpn aA = b("flowerbed_1", "_1", fpq.Q, fpq.z);
   public static final fpn aB = b("flowerbed_2", "_2", fpq.Q, fpq.z);
   public static final fpn aC = b("flowerbed_3", "_3", fpq.Q, fpq.z);
   public static final fpn aD = b("flowerbed_4", "_4", fpq.Q, fpq.z);
   public static final fpn aE = b("template_leaf_litter_1", "_1", fpq.b);
   public static final fpn aF = b("template_leaf_litter_2", "_2", fpq.b);
   public static final fpn aG = b("template_leaf_litter_3", "_3", fpq.b);
   public static final fpn aH = b("template_leaf_litter_4", "_4", fpq.b);
   public static final fpn aI = a("coral_fan", fpq.y);
   public static final fpn aJ = a("coral_wall_fan", fpq.y);
   public static final fpn aK = a("template_glazed_terracotta", fpq.v);
   public static final fpn aL = a("template_chorus_flower", fpq.b);
   public static final fpn aM = a("template_daylight_detector", fpq.f, fpq.i);
   public static final fpn aN = b("template_glass_pane_noside", "_noside", fpq.w);
   public static final fpn aO = b("template_glass_pane_noside_alt", "_noside_alt", fpq.w);
   public static final fpn aP = b("template_glass_pane_post", "_post", fpq.w, fpq.x);
   public static final fpn aQ = b("template_glass_pane_side", "_side", fpq.w, fpq.x);
   public static final fpn aR = b("template_glass_pane_side_alt", "_side_alt", fpq.w, fpq.x);
   public static final fpn aS = a("template_command_block", fpq.g, fpq.h, fpq.i);
   public static final fpn aT = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", fpq.b);
   public static final fpn aU = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", fpq.b);
   public static final fpn aV = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", fpq.b);
   public static final fpn aW = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", fpq.b);
   public static final fpn aX = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", fpq.b);
   public static final fpn aY = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", fpq.b);
   public static final fpn aZ = a("template_anvil", fpq.f);
   public static final fpn[] ba = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, fpq.z)).toArray(fpn[]::new);
   public static final fpn bb = a("stem_fruit", fpq.z, fpq.A);
   public static final fpn bc = a("crop", fpq.B);
   public static final fpn bd = a("template_farmland", fpq.C, fpq.f);
   public static final fpn be = a("template_fire_floor", fpq.D);
   public static final fpn bf = a("template_fire_side", fpq.D);
   public static final fpn bg = a("template_fire_side_alt", fpq.D);
   public static final fpn bh = a("template_fire_up", fpq.D);
   public static final fpn bi = a("template_fire_up_alt", fpq.D);
   public static final fpn bj = a("template_campfire", fpq.D, fpq.L);
   public static final fpn bk = a("template_lantern", fpq.E);
   public static final fpn bl = b("template_hanging_lantern", "_hanging", fpq.E);
   public static final fpn bm = a("template_torch", fpq.H);
   public static final fpn bn = a("template_torch_unlit", fpq.H);
   public static final fpn bo = a("template_torch_wall", fpq.H);
   public static final fpn bp = a("template_torch_wall_unlit", fpq.H);
   public static final fpn bq = a("template_redstone_torch", fpq.H);
   public static final fpn br = a("template_redstone_torch_wall", fpq.H);
   public static final fpn bs = a("template_piston", fpq.F, fpq.e, fpq.i);
   public static final fpn bt = a("template_piston_head", fpq.F, fpq.i, fpq.G);
   public static final fpn bu = a("template_piston_head_short", fpq.F, fpq.i, fpq.G);
   public static final fpn bv = a("template_seagrass", fpq.b);
   public static final fpn bw = a("template_turtle_egg", fpq.a);
   public static final fpn bx = a("template_two_turtle_eggs", fpq.a);
   public static final fpn by = a("template_three_turtle_eggs", fpq.a);
   public static final fpn bz = a("template_four_turtle_eggs", fpq.a);
   public static final fpn bA = a("template_single_face", fpq.b);
   public static final fpn bB = a("template_cauldron_level1", fpq.O, fpq.N, fpq.c, fpq.f, fpq.e, fpq.i);
   public static final fpn bC = a("template_cauldron_level2", fpq.O, fpq.N, fpq.c, fpq.f, fpq.e, fpq.i);
   public static final fpn bD = a("template_cauldron_full", fpq.O, fpq.N, fpq.c, fpq.f, fpq.e, fpq.i);
   public static final fpn bE = a("template_azalea", fpq.f, fpq.i);
   public static final fpn bF = a("template_potted_azalea_bush", fpq.r, fpq.f, fpq.i);
   public static final fpn bG = a("template_potted_azalea_bush", fpq.r, fpq.f, fpq.i);
   public static final fpn bH = a("sniffer_egg", fpq.f, fpq.e, fpq.j, fpq.k, fpq.l, fpq.m);
   public static final fpn bI = b("generated", fpq.I);
   public static final fpn bJ = b("template_music_disc", fpq.I);
   public static final fpn bK = b("handheld", fpq.I);
   public static final fpn bL = b("handheld_rod", fpq.I);
   public static final fpn bM = b("generated", fpq.I, fpq.J);
   public static final fpn bN = b("generated", fpq.I, fpq.J, fpq.K);
   public static final fpn bO = b("template_shulker_box", fpq.c);
   public static final fpn bP = b("template_bed", fpq.c);
   public static final fpn bQ = b("template_chest", fpq.c);
   public static final fpn bR = a("template_bundle_open_front", "_open_front", fpq.I);
   public static final fpn bS = a("template_bundle_open_back", "_open_back", fpq.I);
   public static final fpn bT = b("bow", fpq.I);
   public static final fpn bU = b("crossbow", fpq.I);
   public static final fpn bV = a("template_candle", fpq.a, fpq.c);
   public static final fpn bW = a("template_two_candles", fpq.a, fpq.c);
   public static final fpn bX = a("template_three_candles", fpq.a, fpq.c);
   public static final fpn bY = a("template_four_candles", fpq.a, fpq.c);
   public static final fpn bZ = a("template_cake_with_candle", fpq.M, fpq.e, fpq.i, fpq.f, fpq.c);
   public static final fpn ca = a("template_sculk_shrieker", fpq.e, fpq.i, fpq.f, fpq.c, fpq.P);
   public static final fpn cb = a("template_vault", fpq.f, fpq.e, fpq.i, fpq.g);
   public static final fpn cc = b("handheld_mace", fpq.I);

   private static fpn a(fpq... $$0) {
      return new fpn(Optional.empty(), Optional.empty(), $$0);
   }

   private static fpn a(String $$0, fpq... $$1) {
      return new fpn(Optional.of(ald.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static fpn b(String $$0, fpq... $$1) {
      return new fpn(Optional.of(ald.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static fpn a(String $$0, String $$1, fpq... $$2) {
      return new fpn(Optional.of(ald.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static fpn b(String $$0, String $$1, fpq... $$2) {
      return new fpn(Optional.of(ald.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
