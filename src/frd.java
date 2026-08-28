import java.util.Optional;
import java.util.stream.IntStream;

public class frd {
   public static final frc a = a("cube", frf.c, frf.j, frf.k, frf.l, frf.m, frf.n, frf.o);
   public static final frc b = a("cube_directional", frf.c, frf.j, frf.k, frf.l, frf.m, frf.n, frf.o);
   public static final frc c = a("cube_all", frf.a);
   public static final frc d = a("cube_all_inner_faces", frf.a);
   public static final frc e = b("cube_mirrored_all", "_mirrored", frf.a);
   public static final frc f = b("cube_north_west_mirrored_all", "_north_west_mirrored", frf.a);
   public static final frc g = b("cube_column_uv_locked_x", "_x", frf.d, frf.i);
   public static final frc h = b("cube_column_uv_locked_y", "_y", frf.d, frf.i);
   public static final frc i = b("cube_column_uv_locked_z", "_z", frf.d, frf.i);
   public static final frc j = a("cube_column", frf.d, frf.i);
   public static final frc k = b("cube_column_horizontal", "_horizontal", frf.d, frf.i);
   public static final frc l = b("cube_column_mirrored", "_mirrored", frf.d, frf.i);
   public static final frc m = a("cube_top", frf.f, frf.i);
   public static final frc n = a("cube_bottom_top", frf.f, frf.e, frf.i);
   public static final frc o = a("cube_bottom_top_inner_faces", frf.f, frf.e, frf.i);
   public static final frc p = a("orientable", frf.f, frf.g, frf.i);
   public static final frc q = a("orientable_with_bottom", frf.f, frf.e, frf.i, frf.g);
   public static final frc r = b("orientable_vertical", "_vertical", frf.g, frf.i);
   public static final frc s = a("button", frf.b);
   public static final frc t = b("button_pressed", "_pressed", frf.b);
   public static final frc u = b("button_inventory", "_inventory", frf.b);
   public static final frc v = b("door_bottom_left", "_bottom_left", frf.f, frf.e);
   public static final frc w = b("door_bottom_left_open", "_bottom_left_open", frf.f, frf.e);
   public static final frc x = b("door_bottom_right", "_bottom_right", frf.f, frf.e);
   public static final frc y = b("door_bottom_right_open", "_bottom_right_open", frf.f, frf.e);
   public static final frc z = b("door_top_left", "_top_left", frf.f, frf.e);
   public static final frc A = b("door_top_left_open", "_top_left_open", frf.f, frf.e);
   public static final frc B = b("door_top_right", "_top_right", frf.f, frf.e);
   public static final frc C = b("door_top_right_open", "_top_right_open", frf.f, frf.e);
   public static final frc D = b("custom_fence_post", "_post", frf.b, frf.c);
   public static final frc E = b("custom_fence_side_north", "_side_north", frf.b);
   public static final frc F = b("custom_fence_side_east", "_side_east", frf.b);
   public static final frc G = b("custom_fence_side_south", "_side_south", frf.b);
   public static final frc H = b("custom_fence_side_west", "_side_west", frf.b);
   public static final frc I = b("custom_fence_inventory", "_inventory", frf.b);
   public static final frc J = b("fence_post", "_post", frf.b);
   public static final frc K = b("fence_side", "_side", frf.b);
   public static final frc L = b("fence_inventory", "_inventory", frf.b);
   public static final frc M = b("template_wall_post", "_post", frf.s);
   public static final frc N = b("template_wall_side", "_side", frf.s);
   public static final frc O = b("template_wall_side_tall", "_side_tall", frf.s);
   public static final frc P = b("wall_inventory", "_inventory", frf.s);
   public static final frc Q = a("template_custom_fence_gate", frf.b, frf.c);
   public static final frc R = b("template_custom_fence_gate_open", "_open", frf.b, frf.c);
   public static final frc S = b("template_custom_fence_gate_wall", "_wall", frf.b, frf.c);
   public static final frc T = b("template_custom_fence_gate_wall_open", "_wall_open", frf.b, frf.c);
   public static final frc U = a("template_fence_gate", frf.b);
   public static final frc V = b("template_fence_gate_open", "_open", frf.b);
   public static final frc W = b("template_fence_gate_wall", "_wall", frf.b);
   public static final frc X = b("template_fence_gate_wall_open", "_wall_open", frf.b);
   public static final frc Y = a("pressure_plate_up", frf.b);
   public static final frc Z = b("pressure_plate_down", "_down", frf.b);
   public static final frc aa = a(frf.c);
   public static final frc ab = a("slab", frf.e, frf.f, frf.i);
   public static final frc ac = b("slab_top", "_top", frf.e, frf.f, frf.i);
   public static final frc ad = a("leaves", frf.a);
   public static final frc ae = a("stairs", frf.e, frf.f, frf.i);
   public static final frc af = b("inner_stairs", "_inner", frf.e, frf.f, frf.i);
   public static final frc ag = b("outer_stairs", "_outer", frf.e, frf.f, frf.i);
   public static final frc ah = b("template_trapdoor_top", "_top", frf.b);
   public static final frc ai = b("template_trapdoor_bottom", "_bottom", frf.b);
   public static final frc aj = b("template_trapdoor_open", "_open", frf.b);
   public static final frc ak = b("template_orientable_trapdoor_top", "_top", frf.b);
   public static final frc al = b("template_orientable_trapdoor_bottom", "_bottom", frf.b);
   public static final frc am = b("template_orientable_trapdoor_open", "_open", frf.b);
   public static final frc an = a("pointed_dripstone", frf.p);
   public static final frc ao = a("cross", frf.p);
   public static final frc ap = a("tinted_cross", frf.p);
   public static final frc aq = a("cross_emissive", frf.p, frf.q);
   public static final frc ar = a("flower_pot_cross", frf.r);
   public static final frc as = a("tinted_flower_pot_cross", frf.r);
   public static final frc at = a("flower_pot_cross_emissive", frf.r, frf.q);
   public static final frc au = a("rail_flat", frf.t);
   public static final frc av = b("rail_curved", "_corner", frf.t);
   public static final frc aw = b("template_rail_raised_ne", "_raised_ne", frf.t);
   public static final frc ax = b("template_rail_raised_sw", "_raised_sw", frf.t);
   public static final frc ay = a("carpet", frf.u);
   public static final frc az = a("mossy_carpet_side", frf.i);
   public static final frc aA = b("flowerbed_1", "_1", frf.Q, frf.z);
   public static final frc aB = b("flowerbed_2", "_2", frf.Q, frf.z);
   public static final frc aC = b("flowerbed_3", "_3", frf.Q, frf.z);
   public static final frc aD = b("flowerbed_4", "_4", frf.Q, frf.z);
   public static final frc aE = b("template_leaf_litter_1", "_1", frf.b);
   public static final frc aF = b("template_leaf_litter_2", "_2", frf.b);
   public static final frc aG = b("template_leaf_litter_3", "_3", frf.b);
   public static final frc aH = b("template_leaf_litter_4", "_4", frf.b);
   public static final frc aI = a("coral_fan", frf.y);
   public static final frc aJ = a("coral_wall_fan", frf.y);
   public static final frc aK = a("template_glazed_terracotta", frf.v);
   public static final frc aL = a("template_chorus_flower", frf.b);
   public static final frc aM = a("template_daylight_detector", frf.f, frf.i);
   public static final frc aN = b("template_glass_pane_noside", "_noside", frf.w);
   public static final frc aO = b("template_glass_pane_noside_alt", "_noside_alt", frf.w);
   public static final frc aP = b("template_glass_pane_post", "_post", frf.w, frf.x);
   public static final frc aQ = b("template_glass_pane_side", "_side", frf.w, frf.x);
   public static final frc aR = b("template_glass_pane_side_alt", "_side_alt", frf.w, frf.x);
   public static final frc aS = a("template_command_block", frf.g, frf.h, frf.i);
   public static final frc aT = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", frf.b);
   public static final frc aU = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", frf.b);
   public static final frc aV = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", frf.b);
   public static final frc aW = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", frf.b);
   public static final frc aX = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", frf.b);
   public static final frc aY = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", frf.b);
   public static final frc aZ = a("template_anvil", frf.f);
   public static final frc[] ba = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, frf.z)).toArray(frc[]::new);
   public static final frc bb = a("stem_fruit", frf.z, frf.A);
   public static final frc bc = a("crop", frf.B);
   public static final frc bd = a("template_farmland", frf.C, frf.f);
   public static final frc be = a("template_fire_floor", frf.D);
   public static final frc bf = a("template_fire_side", frf.D);
   public static final frc bg = a("template_fire_side_alt", frf.D);
   public static final frc bh = a("template_fire_up", frf.D);
   public static final frc bi = a("template_fire_up_alt", frf.D);
   public static final frc bj = a("template_campfire", frf.D, frf.L);
   public static final frc bk = a("template_lantern", frf.E);
   public static final frc bl = b("template_hanging_lantern", "_hanging", frf.E);
   public static final frc bm = a("template_torch", frf.H);
   public static final frc bn = a("template_torch_unlit", frf.H);
   public static final frc bo = a("template_torch_wall", frf.H);
   public static final frc bp = a("template_torch_wall_unlit", frf.H);
   public static final frc bq = a("template_redstone_torch", frf.H);
   public static final frc br = a("template_redstone_torch_wall", frf.H);
   public static final frc bs = a("template_piston", frf.F, frf.e, frf.i);
   public static final frc bt = a("template_piston_head", frf.F, frf.i, frf.G);
   public static final frc bu = a("template_piston_head_short", frf.F, frf.i, frf.G);
   public static final frc bv = a("template_seagrass", frf.b);
   public static final frc bw = a("template_turtle_egg", frf.a);
   public static final frc bx = a("template_two_turtle_eggs", frf.a);
   public static final frc by = a("template_three_turtle_eggs", frf.a);
   public static final frc bz = a("template_four_turtle_eggs", frf.a);
   public static final frc bA = a("template_single_face", frf.b);
   public static final frc bB = a("template_cauldron_level1", frf.O, frf.N, frf.c, frf.f, frf.e, frf.i);
   public static final frc bC = a("template_cauldron_level2", frf.O, frf.N, frf.c, frf.f, frf.e, frf.i);
   public static final frc bD = a("template_cauldron_full", frf.O, frf.N, frf.c, frf.f, frf.e, frf.i);
   public static final frc bE = a("template_azalea", frf.f, frf.i);
   public static final frc bF = a("template_potted_azalea_bush", frf.r, frf.f, frf.i);
   public static final frc bG = a("template_potted_azalea_bush", frf.r, frf.f, frf.i);
   public static final frc bH = a("sniffer_egg", frf.f, frf.e, frf.j, frf.k, frf.l, frf.m);
   public static final frc bI = b("generated", frf.I);
   public static final frc bJ = b("template_music_disc", frf.I);
   public static final frc bK = b("handheld", frf.I);
   public static final frc bL = b("handheld_rod", frf.I);
   public static final frc bM = b("generated", frf.I, frf.J);
   public static final frc bN = b("generated", frf.I, frf.J, frf.K);
   public static final frc bO = b("template_shulker_box", frf.c);
   public static final frc bP = b("template_bed", frf.c);
   public static final frc bQ = b("template_chest", frf.c);
   public static final frc bR = a("template_bundle_open_front", "_open_front", frf.I);
   public static final frc bS = a("template_bundle_open_back", "_open_back", frf.I);
   public static final frc bT = b("bow", frf.I);
   public static final frc bU = b("crossbow", frf.I);
   public static final frc bV = a("template_candle", frf.a, frf.c);
   public static final frc bW = a("template_two_candles", frf.a, frf.c);
   public static final frc bX = a("template_three_candles", frf.a, frf.c);
   public static final frc bY = a("template_four_candles", frf.a, frf.c);
   public static final frc bZ = a("template_cake_with_candle", frf.M, frf.e, frf.i, frf.f, frf.c);
   public static final frc ca = a("template_sculk_shrieker", frf.e, frf.i, frf.f, frf.c, frf.P);
   public static final frc cb = a("template_vault", frf.f, frf.e, frf.i, frf.g);
   public static final frc cc = b("handheld_mace", frf.I);

   private static frc a(frf... $$0) {
      return new frc(Optional.empty(), Optional.empty(), $$0);
   }

   private static frc a(String $$0, frf... $$1) {
      return new frc(Optional.of(alg.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static frc b(String $$0, frf... $$1) {
      return new frc(Optional.of(alg.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static frc a(String $$0, String $$1, frf... $$2) {
      return new frc(Optional.of(alg.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static frc b(String $$0, String $$1, frf... $$2) {
      return new frc(Optional.of(alg.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
