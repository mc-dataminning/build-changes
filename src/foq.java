import java.util.Optional;
import java.util.stream.IntStream;

public class foq {
   public static final fop a = a("cube", fot.c, fot.j, fot.k, fot.l, fot.m, fot.n, fot.o);
   public static final fop b = a("cube_directional", fot.c, fot.j, fot.k, fot.l, fot.m, fot.n, fot.o);
   public static final fop c = a("cube_all", fot.a);
   public static final fop d = a("cube_all_inner_faces", fot.a);
   public static final fop e = b("cube_mirrored_all", "_mirrored", fot.a);
   public static final fop f = b("cube_north_west_mirrored_all", "_north_west_mirrored", fot.a);
   public static final fop g = b("cube_column_uv_locked_x", "_x", fot.d, fot.i);
   public static final fop h = b("cube_column_uv_locked_y", "_y", fot.d, fot.i);
   public static final fop i = b("cube_column_uv_locked_z", "_z", fot.d, fot.i);
   public static final fop j = a("cube_column", fot.d, fot.i);
   public static final fop k = b("cube_column_horizontal", "_horizontal", fot.d, fot.i);
   public static final fop l = b("cube_column_mirrored", "_mirrored", fot.d, fot.i);
   public static final fop m = a("cube_top", fot.f, fot.i);
   public static final fop n = a("cube_bottom_top", fot.f, fot.e, fot.i);
   public static final fop o = a("cube_bottom_top_inner_faces", fot.f, fot.e, fot.i);
   public static final fop p = a("orientable", fot.f, fot.g, fot.i);
   public static final fop q = a("orientable_with_bottom", fot.f, fot.e, fot.i, fot.g);
   public static final fop r = b("orientable_vertical", "_vertical", fot.g, fot.i);
   public static final fop s = a("button", fot.b);
   public static final fop t = b("button_pressed", "_pressed", fot.b);
   public static final fop u = b("button_inventory", "_inventory", fot.b);
   public static final fop v = b("door_bottom_left", "_bottom_left", fot.f, fot.e);
   public static final fop w = b("door_bottom_left_open", "_bottom_left_open", fot.f, fot.e);
   public static final fop x = b("door_bottom_right", "_bottom_right", fot.f, fot.e);
   public static final fop y = b("door_bottom_right_open", "_bottom_right_open", fot.f, fot.e);
   public static final fop z = b("door_top_left", "_top_left", fot.f, fot.e);
   public static final fop A = b("door_top_left_open", "_top_left_open", fot.f, fot.e);
   public static final fop B = b("door_top_right", "_top_right", fot.f, fot.e);
   public static final fop C = b("door_top_right_open", "_top_right_open", fot.f, fot.e);
   public static final fop D = b("custom_fence_post", "_post", fot.b, fot.c);
   public static final fop E = b("custom_fence_side_north", "_side_north", fot.b);
   public static final fop F = b("custom_fence_side_east", "_side_east", fot.b);
   public static final fop G = b("custom_fence_side_south", "_side_south", fot.b);
   public static final fop H = b("custom_fence_side_west", "_side_west", fot.b);
   public static final fop I = b("custom_fence_inventory", "_inventory", fot.b);
   public static final fop J = b("fence_post", "_post", fot.b);
   public static final fop K = b("fence_side", "_side", fot.b);
   public static final fop L = b("fence_inventory", "_inventory", fot.b);
   public static final fop M = b("template_wall_post", "_post", fot.s);
   public static final fop N = b("template_wall_side", "_side", fot.s);
   public static final fop O = b("template_wall_side_tall", "_side_tall", fot.s);
   public static final fop P = b("wall_inventory", "_inventory", fot.s);
   public static final fop Q = a("template_custom_fence_gate", fot.b, fot.c);
   public static final fop R = b("template_custom_fence_gate_open", "_open", fot.b, fot.c);
   public static final fop S = b("template_custom_fence_gate_wall", "_wall", fot.b, fot.c);
   public static final fop T = b("template_custom_fence_gate_wall_open", "_wall_open", fot.b, fot.c);
   public static final fop U = a("template_fence_gate", fot.b);
   public static final fop V = b("template_fence_gate_open", "_open", fot.b);
   public static final fop W = b("template_fence_gate_wall", "_wall", fot.b);
   public static final fop X = b("template_fence_gate_wall_open", "_wall_open", fot.b);
   public static final fop Y = a("pressure_plate_up", fot.b);
   public static final fop Z = b("pressure_plate_down", "_down", fot.b);
   public static final fop aa = a(fot.c);
   public static final fop ab = a("slab", fot.e, fot.f, fot.i);
   public static final fop ac = b("slab_top", "_top", fot.e, fot.f, fot.i);
   public static final fop ad = a("leaves", fot.a);
   public static final fop ae = a("stairs", fot.e, fot.f, fot.i);
   public static final fop af = b("inner_stairs", "_inner", fot.e, fot.f, fot.i);
   public static final fop ag = b("outer_stairs", "_outer", fot.e, fot.f, fot.i);
   public static final fop ah = b("template_trapdoor_top", "_top", fot.b);
   public static final fop ai = b("template_trapdoor_bottom", "_bottom", fot.b);
   public static final fop aj = b("template_trapdoor_open", "_open", fot.b);
   public static final fop ak = b("template_orientable_trapdoor_top", "_top", fot.b);
   public static final fop al = b("template_orientable_trapdoor_bottom", "_bottom", fot.b);
   public static final fop am = b("template_orientable_trapdoor_open", "_open", fot.b);
   public static final fop an = a("pointed_dripstone", fot.p);
   public static final fop ao = a("cross", fot.p);
   public static final fop ap = a("tinted_cross", fot.p);
   public static final fop aq = a("cross_emissive", fot.p, fot.q);
   public static final fop ar = a("flower_pot_cross", fot.r);
   public static final fop as = a("tinted_flower_pot_cross", fot.r);
   public static final fop at = a("flower_pot_cross_emissive", fot.r, fot.q);
   public static final fop au = a("rail_flat", fot.t);
   public static final fop av = b("rail_curved", "_corner", fot.t);
   public static final fop aw = b("template_rail_raised_ne", "_raised_ne", fot.t);
   public static final fop ax = b("template_rail_raised_sw", "_raised_sw", fot.t);
   public static final fop ay = a("carpet", fot.u);
   public static final fop az = a("mossy_carpet_side", fot.i);
   public static final fop aA = b("flowerbed_1", "_1", fot.Q, fot.z);
   public static final fop aB = b("flowerbed_2", "_2", fot.Q, fot.z);
   public static final fop aC = b("flowerbed_3", "_3", fot.Q, fot.z);
   public static final fop aD = b("flowerbed_4", "_4", fot.Q, fot.z);
   public static final fop aE = b("template_leaf_litter_1", "_1", fot.b);
   public static final fop aF = b("template_leaf_litter_2", "_2", fot.b);
   public static final fop aG = b("template_leaf_litter_3", "_3", fot.b);
   public static final fop aH = b("template_leaf_litter_4", "_4", fot.b);
   public static final fop aI = a("coral_fan", fot.y);
   public static final fop aJ = a("coral_wall_fan", fot.y);
   public static final fop aK = a("template_glazed_terracotta", fot.v);
   public static final fop aL = a("template_chorus_flower", fot.b);
   public static final fop aM = a("template_daylight_detector", fot.f, fot.i);
   public static final fop aN = b("template_glass_pane_noside", "_noside", fot.w);
   public static final fop aO = b("template_glass_pane_noside_alt", "_noside_alt", fot.w);
   public static final fop aP = b("template_glass_pane_post", "_post", fot.w, fot.x);
   public static final fop aQ = b("template_glass_pane_side", "_side", fot.w, fot.x);
   public static final fop aR = b("template_glass_pane_side_alt", "_side_alt", fot.w, fot.x);
   public static final fop aS = a("template_command_block", fot.g, fot.h, fot.i);
   public static final fop aT = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", fot.b);
   public static final fop aU = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", fot.b);
   public static final fop aV = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", fot.b);
   public static final fop aW = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", fot.b);
   public static final fop aX = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", fot.b);
   public static final fop aY = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", fot.b);
   public static final fop aZ = a("template_anvil", fot.f);
   public static final fop[] ba = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, fot.z)).toArray(fop[]::new);
   public static final fop bb = a("stem_fruit", fot.z, fot.A);
   public static final fop bc = a("crop", fot.B);
   public static final fop bd = a("template_farmland", fot.C, fot.f);
   public static final fop be = a("template_fire_floor", fot.D);
   public static final fop bf = a("template_fire_side", fot.D);
   public static final fop bg = a("template_fire_side_alt", fot.D);
   public static final fop bh = a("template_fire_up", fot.D);
   public static final fop bi = a("template_fire_up_alt", fot.D);
   public static final fop bj = a("template_campfire", fot.D, fot.L);
   public static final fop bk = a("template_lantern", fot.E);
   public static final fop bl = b("template_hanging_lantern", "_hanging", fot.E);
   public static final fop bm = a("template_torch", fot.H);
   public static final fop bn = a("template_torch_unlit", fot.H);
   public static final fop bo = a("template_torch_wall", fot.H);
   public static final fop bp = a("template_torch_wall_unlit", fot.H);
   public static final fop bq = a("template_redstone_torch", fot.H);
   public static final fop br = a("template_redstone_torch_wall", fot.H);
   public static final fop bs = a("template_piston", fot.F, fot.e, fot.i);
   public static final fop bt = a("template_piston_head", fot.F, fot.i, fot.G);
   public static final fop bu = a("template_piston_head_short", fot.F, fot.i, fot.G);
   public static final fop bv = a("template_seagrass", fot.b);
   public static final fop bw = a("template_turtle_egg", fot.a);
   public static final fop bx = a("template_two_turtle_eggs", fot.a);
   public static final fop by = a("template_three_turtle_eggs", fot.a);
   public static final fop bz = a("template_four_turtle_eggs", fot.a);
   public static final fop bA = a("template_single_face", fot.b);
   public static final fop bB = a("template_cauldron_level1", fot.O, fot.N, fot.c, fot.f, fot.e, fot.i);
   public static final fop bC = a("template_cauldron_level2", fot.O, fot.N, fot.c, fot.f, fot.e, fot.i);
   public static final fop bD = a("template_cauldron_full", fot.O, fot.N, fot.c, fot.f, fot.e, fot.i);
   public static final fop bE = a("template_azalea", fot.f, fot.i);
   public static final fop bF = a("template_potted_azalea_bush", fot.r, fot.f, fot.i);
   public static final fop bG = a("template_potted_azalea_bush", fot.r, fot.f, fot.i);
   public static final fop bH = a("sniffer_egg", fot.f, fot.e, fot.j, fot.k, fot.l, fot.m);
   public static final fop bI = b("generated", fot.I);
   public static final fop bJ = b("template_music_disc", fot.I);
   public static final fop bK = b("handheld", fot.I);
   public static final fop bL = b("handheld_rod", fot.I);
   public static final fop bM = b("generated", fot.I, fot.J);
   public static final fop bN = b("generated", fot.I, fot.J, fot.K);
   public static final fop bO = b("template_shulker_box", fot.c);
   public static final fop bP = b("template_bed", fot.c);
   public static final fop bQ = b("template_chest", fot.c);
   public static final fop bR = a("template_bundle_open_front", "_open_front", fot.I);
   public static final fop bS = a("template_bundle_open_back", "_open_back", fot.I);
   public static final fop bT = b("bow", fot.I);
   public static final fop bU = b("crossbow", fot.I);
   public static final fop bV = a("template_candle", fot.a, fot.c);
   public static final fop bW = a("template_two_candles", fot.a, fot.c);
   public static final fop bX = a("template_three_candles", fot.a, fot.c);
   public static final fop bY = a("template_four_candles", fot.a, fot.c);
   public static final fop bZ = a("template_cake_with_candle", fot.M, fot.e, fot.i, fot.f, fot.c);
   public static final fop ca = a("template_sculk_shrieker", fot.e, fot.i, fot.f, fot.c, fot.P);
   public static final fop cb = a("template_vault", fot.f, fot.e, fot.i, fot.g);
   public static final fop cc = b("handheld_mace", fot.I);

   private static fop a(fot... $$0) {
      return new fop(Optional.empty(), Optional.empty(), $$0);
   }

   private static fop a(String $$0, fot... $$1) {
      return new fop(Optional.of(aku.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static fop b(String $$0, fot... $$1) {
      return new fop(Optional.of(aku.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static fop a(String $$0, String $$1, fot... $$2) {
      return new fop(Optional.of(aku.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static fop b(String $$0, String $$1, fot... $$2) {
      return new fop(Optional.of(aku.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
