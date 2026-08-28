import java.util.Optional;
import java.util.stream.IntStream;

public class fns {
   public static final fnr a = a("cube", fnu.c, fnu.j, fnu.k, fnu.l, fnu.m, fnu.n, fnu.o);
   public static final fnr b = a("cube_directional", fnu.c, fnu.j, fnu.k, fnu.l, fnu.m, fnu.n, fnu.o);
   public static final fnr c = a("cube_all", fnu.a);
   public static final fnr d = a("cube_all_inner_faces", fnu.a);
   public static final fnr e = b("cube_mirrored_all", "_mirrored", fnu.a);
   public static final fnr f = b("cube_north_west_mirrored_all", "_north_west_mirrored", fnu.a);
   public static final fnr g = b("cube_column_uv_locked_x", "_x", fnu.d, fnu.i);
   public static final fnr h = b("cube_column_uv_locked_y", "_y", fnu.d, fnu.i);
   public static final fnr i = b("cube_column_uv_locked_z", "_z", fnu.d, fnu.i);
   public static final fnr j = a("cube_column", fnu.d, fnu.i);
   public static final fnr k = b("cube_column_horizontal", "_horizontal", fnu.d, fnu.i);
   public static final fnr l = b("cube_column_mirrored", "_mirrored", fnu.d, fnu.i);
   public static final fnr m = a("cube_top", fnu.f, fnu.i);
   public static final fnr n = a("cube_bottom_top", fnu.f, fnu.e, fnu.i);
   public static final fnr o = a("cube_bottom_top_inner_faces", fnu.f, fnu.e, fnu.i);
   public static final fnr p = a("orientable", fnu.f, fnu.g, fnu.i);
   public static final fnr q = a("orientable_with_bottom", fnu.f, fnu.e, fnu.i, fnu.g);
   public static final fnr r = b("orientable_vertical", "_vertical", fnu.g, fnu.i);
   public static final fnr s = a("button", fnu.b);
   public static final fnr t = b("button_pressed", "_pressed", fnu.b);
   public static final fnr u = b("button_inventory", "_inventory", fnu.b);
   public static final fnr v = b("door_bottom_left", "_bottom_left", fnu.f, fnu.e);
   public static final fnr w = b("door_bottom_left_open", "_bottom_left_open", fnu.f, fnu.e);
   public static final fnr x = b("door_bottom_right", "_bottom_right", fnu.f, fnu.e);
   public static final fnr y = b("door_bottom_right_open", "_bottom_right_open", fnu.f, fnu.e);
   public static final fnr z = b("door_top_left", "_top_left", fnu.f, fnu.e);
   public static final fnr A = b("door_top_left_open", "_top_left_open", fnu.f, fnu.e);
   public static final fnr B = b("door_top_right", "_top_right", fnu.f, fnu.e);
   public static final fnr C = b("door_top_right_open", "_top_right_open", fnu.f, fnu.e);
   public static final fnr D = b("custom_fence_post", "_post", fnu.b, fnu.c);
   public static final fnr E = b("custom_fence_side_north", "_side_north", fnu.b);
   public static final fnr F = b("custom_fence_side_east", "_side_east", fnu.b);
   public static final fnr G = b("custom_fence_side_south", "_side_south", fnu.b);
   public static final fnr H = b("custom_fence_side_west", "_side_west", fnu.b);
   public static final fnr I = b("custom_fence_inventory", "_inventory", fnu.b);
   public static final fnr J = b("fence_post", "_post", fnu.b);
   public static final fnr K = b("fence_side", "_side", fnu.b);
   public static final fnr L = b("fence_inventory", "_inventory", fnu.b);
   public static final fnr M = b("template_wall_post", "_post", fnu.s);
   public static final fnr N = b("template_wall_side", "_side", fnu.s);
   public static final fnr O = b("template_wall_side_tall", "_side_tall", fnu.s);
   public static final fnr P = b("wall_inventory", "_inventory", fnu.s);
   public static final fnr Q = a("template_custom_fence_gate", fnu.b, fnu.c);
   public static final fnr R = b("template_custom_fence_gate_open", "_open", fnu.b, fnu.c);
   public static final fnr S = b("template_custom_fence_gate_wall", "_wall", fnu.b, fnu.c);
   public static final fnr T = b("template_custom_fence_gate_wall_open", "_wall_open", fnu.b, fnu.c);
   public static final fnr U = a("template_fence_gate", fnu.b);
   public static final fnr V = b("template_fence_gate_open", "_open", fnu.b);
   public static final fnr W = b("template_fence_gate_wall", "_wall", fnu.b);
   public static final fnr X = b("template_fence_gate_wall_open", "_wall_open", fnu.b);
   public static final fnr Y = a("pressure_plate_up", fnu.b);
   public static final fnr Z = b("pressure_plate_down", "_down", fnu.b);
   public static final fnr aa = a(fnu.c);
   public static final fnr ab = a("slab", fnu.e, fnu.f, fnu.i);
   public static final fnr ac = b("slab_top", "_top", fnu.e, fnu.f, fnu.i);
   public static final fnr ad = a("leaves", fnu.a);
   public static final fnr ae = a("stairs", fnu.e, fnu.f, fnu.i);
   public static final fnr af = b("inner_stairs", "_inner", fnu.e, fnu.f, fnu.i);
   public static final fnr ag = b("outer_stairs", "_outer", fnu.e, fnu.f, fnu.i);
   public static final fnr ah = b("template_trapdoor_top", "_top", fnu.b);
   public static final fnr ai = b("template_trapdoor_bottom", "_bottom", fnu.b);
   public static final fnr aj = b("template_trapdoor_open", "_open", fnu.b);
   public static final fnr ak = b("template_orientable_trapdoor_top", "_top", fnu.b);
   public static final fnr al = b("template_orientable_trapdoor_bottom", "_bottom", fnu.b);
   public static final fnr am = b("template_orientable_trapdoor_open", "_open", fnu.b);
   public static final fnr an = a("pointed_dripstone", fnu.p);
   public static final fnr ao = a("cross", fnu.p);
   public static final fnr ap = a("tinted_cross", fnu.p);
   public static final fnr aq = a("cross_emissive", fnu.p, fnu.q);
   public static final fnr ar = a("flower_pot_cross", fnu.r);
   public static final fnr as = a("tinted_flower_pot_cross", fnu.r);
   public static final fnr at = a("flower_pot_cross_emissive", fnu.r, fnu.q);
   public static final fnr au = a("rail_flat", fnu.t);
   public static final fnr av = b("rail_curved", "_corner", fnu.t);
   public static final fnr aw = b("template_rail_raised_ne", "_raised_ne", fnu.t);
   public static final fnr ax = b("template_rail_raised_sw", "_raised_sw", fnu.t);
   public static final fnr ay = a("carpet", fnu.u);
   public static final fnr az = a("mossy_carpet_side", fnu.i);
   public static final fnr aA = b("flowerbed_1", "_1", fnu.Q, fnu.z);
   public static final fnr aB = b("flowerbed_2", "_2", fnu.Q, fnu.z);
   public static final fnr aC = b("flowerbed_3", "_3", fnu.Q, fnu.z);
   public static final fnr aD = b("flowerbed_4", "_4", fnu.Q, fnu.z);
   public static final fnr aE = a("coral_fan", fnu.y);
   public static final fnr aF = a("coral_wall_fan", fnu.y);
   public static final fnr aG = a("template_glazed_terracotta", fnu.v);
   public static final fnr aH = a("template_chorus_flower", fnu.b);
   public static final fnr aI = a("template_daylight_detector", fnu.f, fnu.i);
   public static final fnr aJ = b("template_glass_pane_noside", "_noside", fnu.w);
   public static final fnr aK = b("template_glass_pane_noside_alt", "_noside_alt", fnu.w);
   public static final fnr aL = b("template_glass_pane_post", "_post", fnu.w, fnu.x);
   public static final fnr aM = b("template_glass_pane_side", "_side", fnu.w, fnu.x);
   public static final fnr aN = b("template_glass_pane_side_alt", "_side_alt", fnu.w, fnu.x);
   public static final fnr aO = a("template_command_block", fnu.g, fnu.h, fnu.i);
   public static final fnr aP = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", fnu.b);
   public static final fnr aQ = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", fnu.b);
   public static final fnr aR = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", fnu.b);
   public static final fnr aS = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", fnu.b);
   public static final fnr aT = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", fnu.b);
   public static final fnr aU = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", fnu.b);
   public static final fnr aV = a("template_anvil", fnu.f);
   public static final fnr[] aW = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, fnu.z)).toArray(fnr[]::new);
   public static final fnr aX = a("stem_fruit", fnu.z, fnu.A);
   public static final fnr aY = a("crop", fnu.B);
   public static final fnr aZ = a("template_farmland", fnu.C, fnu.f);
   public static final fnr ba = a("template_fire_floor", fnu.D);
   public static final fnr bb = a("template_fire_side", fnu.D);
   public static final fnr bc = a("template_fire_side_alt", fnu.D);
   public static final fnr bd = a("template_fire_up", fnu.D);
   public static final fnr be = a("template_fire_up_alt", fnu.D);
   public static final fnr bf = a("template_campfire", fnu.D, fnu.L);
   public static final fnr bg = a("template_lantern", fnu.E);
   public static final fnr bh = b("template_hanging_lantern", "_hanging", fnu.E);
   public static final fnr bi = a("template_torch", fnu.H);
   public static final fnr bj = a("template_torch_unlit", fnu.H);
   public static final fnr bk = a("template_torch_wall", fnu.H);
   public static final fnr bl = a("template_torch_wall_unlit", fnu.H);
   public static final fnr bm = a("template_redstone_torch", fnu.H);
   public static final fnr bn = a("template_redstone_torch_wall", fnu.H);
   public static final fnr bo = a("template_piston", fnu.F, fnu.e, fnu.i);
   public static final fnr bp = a("template_piston_head", fnu.F, fnu.i, fnu.G);
   public static final fnr bq = a("template_piston_head_short", fnu.F, fnu.i, fnu.G);
   public static final fnr br = a("template_seagrass", fnu.b);
   public static final fnr bs = a("template_turtle_egg", fnu.a);
   public static final fnr bt = a("template_two_turtle_eggs", fnu.a);
   public static final fnr bu = a("template_three_turtle_eggs", fnu.a);
   public static final fnr bv = a("template_four_turtle_eggs", fnu.a);
   public static final fnr bw = a("template_single_face", fnu.b);
   public static final fnr bx = a("template_cauldron_level1", fnu.O, fnu.N, fnu.c, fnu.f, fnu.e, fnu.i);
   public static final fnr by = a("template_cauldron_level2", fnu.O, fnu.N, fnu.c, fnu.f, fnu.e, fnu.i);
   public static final fnr bz = a("template_cauldron_full", fnu.O, fnu.N, fnu.c, fnu.f, fnu.e, fnu.i);
   public static final fnr bA = a("template_azalea", fnu.f, fnu.i);
   public static final fnr bB = a("template_potted_azalea_bush", fnu.r, fnu.f, fnu.i);
   public static final fnr bC = a("template_potted_azalea_bush", fnu.r, fnu.f, fnu.i);
   public static final fnr bD = a("sniffer_egg", fnu.f, fnu.e, fnu.j, fnu.k, fnu.l, fnu.m);
   public static final fnr bE = b("generated", fnu.I);
   public static final fnr bF = b("template_music_disc", fnu.I);
   public static final fnr bG = b("handheld", fnu.I);
   public static final fnr bH = b("handheld_rod", fnu.I);
   public static final fnr bI = b("generated", fnu.I, fnu.J);
   public static final fnr bJ = b("generated", fnu.I, fnu.J, fnu.K);
   public static final fnr bK = b("template_shulker_box", fnu.c);
   public static final fnr bL = b("template_bed", fnu.c);
   public static final fnr bM = b("template_chest", fnu.c);
   public static final fnr bN = a("template_bundle_open_front", "_open_front", fnu.I);
   public static final fnr bO = a("template_bundle_open_back", "_open_back", fnu.I);
   public static final fnr bP = b("bow", fnu.I);
   public static final fnr bQ = b("crossbow", fnu.I);
   public static final fnr bR = a("template_candle", fnu.a, fnu.c);
   public static final fnr bS = a("template_two_candles", fnu.a, fnu.c);
   public static final fnr bT = a("template_three_candles", fnu.a, fnu.c);
   public static final fnr bU = a("template_four_candles", fnu.a, fnu.c);
   public static final fnr bV = a("template_cake_with_candle", fnu.M, fnu.e, fnu.i, fnu.f, fnu.c);
   public static final fnr bW = a("template_sculk_shrieker", fnu.e, fnu.i, fnu.f, fnu.c, fnu.P);
   public static final fnr bX = a("template_vault", fnu.f, fnu.e, fnu.i, fnu.g);
   public static final fnr bY = b("handheld_mace", fnu.I);

   private static fnr a(fnu... $$0) {
      return new fnr(Optional.empty(), Optional.empty(), $$0);
   }

   private static fnr a(String $$0, fnu... $$1) {
      return new fnr(Optional.of(akv.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static fnr b(String $$0, fnu... $$1) {
      return new fnr(Optional.of(akv.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static fnr a(String $$0, String $$1, fnu... $$2) {
      return new fnr(Optional.of(akv.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static fnr b(String $$0, String $$1, fnu... $$2) {
      return new fnr(Optional.of(akv.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
