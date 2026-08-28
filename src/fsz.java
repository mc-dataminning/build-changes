import java.util.Optional;
import java.util.stream.IntStream;

public class fsz {
   public static final fsy a = a("cube", ftb.c, ftb.j, ftb.k, ftb.l, ftb.m, ftb.n, ftb.o);
   public static final fsy b = a("cube_directional", ftb.c, ftb.j, ftb.k, ftb.l, ftb.m, ftb.n, ftb.o);
   public static final fsy c = a("cube_all", ftb.a);
   public static final fsy d = a("cube_all_inner_faces", ftb.a);
   public static final fsy e = b("cube_mirrored_all", "_mirrored", ftb.a);
   public static final fsy f = b("cube_north_west_mirrored_all", "_north_west_mirrored", ftb.a);
   public static final fsy g = b("cube_column_uv_locked_x", "_x", ftb.d, ftb.i);
   public static final fsy h = b("cube_column_uv_locked_y", "_y", ftb.d, ftb.i);
   public static final fsy i = b("cube_column_uv_locked_z", "_z", ftb.d, ftb.i);
   public static final fsy j = a("cube_column", ftb.d, ftb.i);
   public static final fsy k = b("cube_column_horizontal", "_horizontal", ftb.d, ftb.i);
   public static final fsy l = b("cube_column_mirrored", "_mirrored", ftb.d, ftb.i);
   public static final fsy m = a("cube_top", ftb.f, ftb.i);
   public static final fsy n = a("cube_bottom_top", ftb.f, ftb.e, ftb.i);
   public static final fsy o = a("cube_bottom_top_inner_faces", ftb.f, ftb.e, ftb.i);
   public static final fsy p = a("orientable", ftb.f, ftb.g, ftb.i);
   public static final fsy q = a("orientable_with_bottom", ftb.f, ftb.e, ftb.i, ftb.g);
   public static final fsy r = b("orientable_vertical", "_vertical", ftb.g, ftb.i);
   public static final fsy s = a("button", ftb.b);
   public static final fsy t = b("button_pressed", "_pressed", ftb.b);
   public static final fsy u = b("button_inventory", "_inventory", ftb.b);
   public static final fsy v = b("door_bottom_left", "_bottom_left", ftb.f, ftb.e);
   public static final fsy w = b("door_bottom_left_open", "_bottom_left_open", ftb.f, ftb.e);
   public static final fsy x = b("door_bottom_right", "_bottom_right", ftb.f, ftb.e);
   public static final fsy y = b("door_bottom_right_open", "_bottom_right_open", ftb.f, ftb.e);
   public static final fsy z = b("door_top_left", "_top_left", ftb.f, ftb.e);
   public static final fsy A = b("door_top_left_open", "_top_left_open", ftb.f, ftb.e);
   public static final fsy B = b("door_top_right", "_top_right", ftb.f, ftb.e);
   public static final fsy C = b("door_top_right_open", "_top_right_open", ftb.f, ftb.e);
   public static final fsy D = b("custom_fence_post", "_post", ftb.b, ftb.c);
   public static final fsy E = b("custom_fence_side_north", "_side_north", ftb.b);
   public static final fsy F = b("custom_fence_side_east", "_side_east", ftb.b);
   public static final fsy G = b("custom_fence_side_south", "_side_south", ftb.b);
   public static final fsy H = b("custom_fence_side_west", "_side_west", ftb.b);
   public static final fsy I = b("custom_fence_inventory", "_inventory", ftb.b);
   public static final fsy J = b("fence_post", "_post", ftb.b);
   public static final fsy K = b("fence_side", "_side", ftb.b);
   public static final fsy L = b("fence_inventory", "_inventory", ftb.b);
   public static final fsy M = b("template_wall_post", "_post", ftb.s);
   public static final fsy N = b("template_wall_side", "_side", ftb.s);
   public static final fsy O = b("template_wall_side_tall", "_side_tall", ftb.s);
   public static final fsy P = b("wall_inventory", "_inventory", ftb.s);
   public static final fsy Q = a("template_custom_fence_gate", ftb.b, ftb.c);
   public static final fsy R = b("template_custom_fence_gate_open", "_open", ftb.b, ftb.c);
   public static final fsy S = b("template_custom_fence_gate_wall", "_wall", ftb.b, ftb.c);
   public static final fsy T = b("template_custom_fence_gate_wall_open", "_wall_open", ftb.b, ftb.c);
   public static final fsy U = a("template_fence_gate", ftb.b);
   public static final fsy V = b("template_fence_gate_open", "_open", ftb.b);
   public static final fsy W = b("template_fence_gate_wall", "_wall", ftb.b);
   public static final fsy X = b("template_fence_gate_wall_open", "_wall_open", ftb.b);
   public static final fsy Y = a("pressure_plate_up", ftb.b);
   public static final fsy Z = b("pressure_plate_down", "_down", ftb.b);
   public static final fsy aa = a(ftb.c);
   public static final fsy ab = a("slab", ftb.e, ftb.f, ftb.i);
   public static final fsy ac = b("slab_top", "_top", ftb.e, ftb.f, ftb.i);
   public static final fsy ad = a("leaves", ftb.a);
   public static final fsy ae = a("stairs", ftb.e, ftb.f, ftb.i);
   public static final fsy af = b("inner_stairs", "_inner", ftb.e, ftb.f, ftb.i);
   public static final fsy ag = b("outer_stairs", "_outer", ftb.e, ftb.f, ftb.i);
   public static final fsy ah = b("template_trapdoor_top", "_top", ftb.b);
   public static final fsy ai = b("template_trapdoor_bottom", "_bottom", ftb.b);
   public static final fsy aj = b("template_trapdoor_open", "_open", ftb.b);
   public static final fsy ak = b("template_orientable_trapdoor_top", "_top", ftb.b);
   public static final fsy al = b("template_orientable_trapdoor_bottom", "_bottom", ftb.b);
   public static final fsy am = b("template_orientable_trapdoor_open", "_open", ftb.b);
   public static final fsy an = a("pointed_dripstone", ftb.p);
   public static final fsy ao = a("cross", ftb.p);
   public static final fsy ap = a("tinted_cross", ftb.p);
   public static final fsy aq = a("cross_emissive", ftb.p, ftb.q);
   public static final fsy ar = a("flower_pot_cross", ftb.r);
   public static final fsy as = a("tinted_flower_pot_cross", ftb.r);
   public static final fsy at = a("flower_pot_cross_emissive", ftb.r, ftb.q);
   public static final fsy au = a("rail_flat", ftb.t);
   public static final fsy av = b("rail_curved", "_corner", ftb.t);
   public static final fsy aw = b("template_rail_raised_ne", "_raised_ne", ftb.t);
   public static final fsy ax = b("template_rail_raised_sw", "_raised_sw", ftb.t);
   public static final fsy ay = a("carpet", ftb.u);
   public static final fsy az = a("mossy_carpet_side", ftb.i);
   public static final fsy aA = b("flowerbed_1", "_1", ftb.Q, ftb.z);
   public static final fsy aB = b("flowerbed_2", "_2", ftb.Q, ftb.z);
   public static final fsy aC = b("flowerbed_3", "_3", ftb.Q, ftb.z);
   public static final fsy aD = b("flowerbed_4", "_4", ftb.Q, ftb.z);
   public static final fsy aE = b("template_leaf_litter_1", "_1", ftb.b);
   public static final fsy aF = b("template_leaf_litter_2", "_2", ftb.b);
   public static final fsy aG = b("template_leaf_litter_3", "_3", ftb.b);
   public static final fsy aH = b("template_leaf_litter_4", "_4", ftb.b);
   public static final fsy aI = a("coral_fan", ftb.y);
   public static final fsy aJ = a("coral_wall_fan", ftb.y);
   public static final fsy aK = a("template_glazed_terracotta", ftb.v);
   public static final fsy aL = a("template_chorus_flower", ftb.b);
   public static final fsy aM = a("template_daylight_detector", ftb.f, ftb.i);
   public static final fsy aN = b("template_glass_pane_noside", "_noside", ftb.w);
   public static final fsy aO = b("template_glass_pane_noside_alt", "_noside_alt", ftb.w);
   public static final fsy aP = b("template_glass_pane_post", "_post", ftb.w, ftb.x);
   public static final fsy aQ = b("template_glass_pane_side", "_side", ftb.w, ftb.x);
   public static final fsy aR = b("template_glass_pane_side_alt", "_side_alt", ftb.w, ftb.x);
   public static final fsy aS = a("template_command_block", ftb.g, ftb.h, ftb.i);
   public static final fsy aT = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", ftb.b);
   public static final fsy aU = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", ftb.b);
   public static final fsy aV = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", ftb.b);
   public static final fsy aW = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", ftb.b);
   public static final fsy aX = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", ftb.b);
   public static final fsy aY = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", ftb.b);
   public static final fsy aZ = a("template_anvil", ftb.f);
   public static final fsy[] ba = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, ftb.z)).toArray(fsy[]::new);
   public static final fsy bb = a("stem_fruit", ftb.z, ftb.A);
   public static final fsy bc = a("crop", ftb.B);
   public static final fsy bd = a("template_farmland", ftb.C, ftb.f);
   public static final fsy be = a("template_fire_floor", ftb.D);
   public static final fsy bf = a("template_fire_side", ftb.D);
   public static final fsy bg = a("template_fire_side_alt", ftb.D);
   public static final fsy bh = a("template_fire_up", ftb.D);
   public static final fsy bi = a("template_fire_up_alt", ftb.D);
   public static final fsy bj = a("template_campfire", ftb.D, ftb.L);
   public static final fsy bk = a("template_lantern", ftb.E);
   public static final fsy bl = b("template_hanging_lantern", "_hanging", ftb.E);
   public static final fsy bm = a("template_torch", ftb.H);
   public static final fsy bn = a("template_torch_unlit", ftb.H);
   public static final fsy bo = a("template_torch_wall", ftb.H);
   public static final fsy bp = a("template_torch_wall_unlit", ftb.H);
   public static final fsy bq = a("template_redstone_torch", ftb.H);
   public static final fsy br = a("template_redstone_torch_wall", ftb.H);
   public static final fsy bs = a("template_piston", ftb.F, ftb.e, ftb.i);
   public static final fsy bt = a("template_piston_head", ftb.F, ftb.i, ftb.G);
   public static final fsy bu = a("template_piston_head_short", ftb.F, ftb.i, ftb.G);
   public static final fsy bv = a("template_seagrass", ftb.b);
   public static final fsy bw = a("template_turtle_egg", ftb.a);
   public static final fsy bx = a("template_two_turtle_eggs", ftb.a);
   public static final fsy by = a("template_three_turtle_eggs", ftb.a);
   public static final fsy bz = a("template_four_turtle_eggs", ftb.a);
   public static final fsy bA = a("template_single_face", ftb.b);
   public static final fsy bB = a("template_cauldron_level1", ftb.O, ftb.N, ftb.c, ftb.f, ftb.e, ftb.i);
   public static final fsy bC = a("template_cauldron_level2", ftb.O, ftb.N, ftb.c, ftb.f, ftb.e, ftb.i);
   public static final fsy bD = a("template_cauldron_full", ftb.O, ftb.N, ftb.c, ftb.f, ftb.e, ftb.i);
   public static final fsy bE = a("template_azalea", ftb.f, ftb.i);
   public static final fsy bF = a("template_potted_azalea_bush", ftb.r, ftb.f, ftb.i);
   public static final fsy bG = a("template_potted_azalea_bush", ftb.r, ftb.f, ftb.i);
   public static final fsy bH = a("sniffer_egg", ftb.f, ftb.e, ftb.j, ftb.k, ftb.l, ftb.m);
   public static final fsy bI = b("generated", ftb.I);
   public static final fsy bJ = b("template_music_disc", ftb.I);
   public static final fsy bK = b("handheld", ftb.I);
   public static final fsy bL = b("handheld_rod", ftb.I);
   public static final fsy bM = b("generated", ftb.I, ftb.J);
   public static final fsy bN = b("generated", ftb.I, ftb.J, ftb.K);
   public static final fsy bO = b("template_shulker_box", ftb.c);
   public static final fsy bP = b("template_bed", ftb.c);
   public static final fsy bQ = b("template_chest", ftb.c);
   public static final fsy bR = a("template_bundle_open_front", "_open_front", ftb.I);
   public static final fsy bS = a("template_bundle_open_back", "_open_back", ftb.I);
   public static final fsy bT = b("bow", ftb.I);
   public static final fsy bU = b("crossbow", ftb.I);
   public static final fsy bV = a("template_candle", ftb.a, ftb.c);
   public static final fsy bW = a("template_two_candles", ftb.a, ftb.c);
   public static final fsy bX = a("template_three_candles", ftb.a, ftb.c);
   public static final fsy bY = a("template_four_candles", ftb.a, ftb.c);
   public static final fsy bZ = a("template_cake_with_candle", ftb.M, ftb.e, ftb.i, ftb.f, ftb.c);
   public static final fsy ca = a("template_sculk_shrieker", ftb.e, ftb.i, ftb.f, ftb.c, ftb.P);
   public static final fsy cb = a("template_vault", ftb.f, ftb.e, ftb.i, ftb.g);
   public static final fsy cc = b("handheld_mace", ftb.I);

   private static fsy a(ftb... $$0) {
      return new fsy(Optional.empty(), Optional.empty(), $$0);
   }

   private static fsy a(String $$0, ftb... $$1) {
      return new fsy(Optional.of(alr.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static fsy b(String $$0, ftb... $$1) {
      return new fsy(Optional.of(alr.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static fsy a(String $$0, String $$1, ftb... $$2) {
      return new fsy(Optional.of(alr.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static fsy b(String $$0, String $$1, ftb... $$2) {
      return new fsy(Optional.of(alr.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
