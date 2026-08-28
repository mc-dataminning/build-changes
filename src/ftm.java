import java.util.Optional;
import java.util.stream.IntStream;

public class ftm {
   public static final ftl a = a("cube", fto.c, fto.j, fto.k, fto.l, fto.m, fto.n, fto.o);
   public static final ftl b = a("cube_directional", fto.c, fto.j, fto.k, fto.l, fto.m, fto.n, fto.o);
   public static final ftl c = a("cube_all", fto.a);
   public static final ftl d = a("cube_all_inner_faces", fto.a);
   public static final ftl e = b("cube_mirrored_all", "_mirrored", fto.a);
   public static final ftl f = b("cube_north_west_mirrored_all", "_north_west_mirrored", fto.a);
   public static final ftl g = b("cube_column_uv_locked_x", "_x", fto.d, fto.i);
   public static final ftl h = b("cube_column_uv_locked_y", "_y", fto.d, fto.i);
   public static final ftl i = b("cube_column_uv_locked_z", "_z", fto.d, fto.i);
   public static final ftl j = a("cube_column", fto.d, fto.i);
   public static final ftl k = b("cube_column_horizontal", "_horizontal", fto.d, fto.i);
   public static final ftl l = b("cube_column_mirrored", "_mirrored", fto.d, fto.i);
   public static final ftl m = a("cube_top", fto.f, fto.i);
   public static final ftl n = a("cube_bottom_top", fto.f, fto.e, fto.i);
   public static final ftl o = a("cube_bottom_top_inner_faces", fto.f, fto.e, fto.i);
   public static final ftl p = a("orientable", fto.f, fto.g, fto.i);
   public static final ftl q = a("orientable_with_bottom", fto.f, fto.e, fto.i, fto.g);
   public static final ftl r = b("orientable_vertical", "_vertical", fto.g, fto.i);
   public static final ftl s = a("button", fto.b);
   public static final ftl t = b("button_pressed", "_pressed", fto.b);
   public static final ftl u = b("button_inventory", "_inventory", fto.b);
   public static final ftl v = b("door_bottom_left", "_bottom_left", fto.f, fto.e);
   public static final ftl w = b("door_bottom_left_open", "_bottom_left_open", fto.f, fto.e);
   public static final ftl x = b("door_bottom_right", "_bottom_right", fto.f, fto.e);
   public static final ftl y = b("door_bottom_right_open", "_bottom_right_open", fto.f, fto.e);
   public static final ftl z = b("door_top_left", "_top_left", fto.f, fto.e);
   public static final ftl A = b("door_top_left_open", "_top_left_open", fto.f, fto.e);
   public static final ftl B = b("door_top_right", "_top_right", fto.f, fto.e);
   public static final ftl C = b("door_top_right_open", "_top_right_open", fto.f, fto.e);
   public static final ftl D = b("custom_fence_post", "_post", fto.b, fto.c);
   public static final ftl E = b("custom_fence_side_north", "_side_north", fto.b);
   public static final ftl F = b("custom_fence_side_east", "_side_east", fto.b);
   public static final ftl G = b("custom_fence_side_south", "_side_south", fto.b);
   public static final ftl H = b("custom_fence_side_west", "_side_west", fto.b);
   public static final ftl I = b("custom_fence_inventory", "_inventory", fto.b);
   public static final ftl J = b("fence_post", "_post", fto.b);
   public static final ftl K = b("fence_side", "_side", fto.b);
   public static final ftl L = b("fence_inventory", "_inventory", fto.b);
   public static final ftl M = b("template_wall_post", "_post", fto.s);
   public static final ftl N = b("template_wall_side", "_side", fto.s);
   public static final ftl O = b("template_wall_side_tall", "_side_tall", fto.s);
   public static final ftl P = b("wall_inventory", "_inventory", fto.s);
   public static final ftl Q = a("template_custom_fence_gate", fto.b, fto.c);
   public static final ftl R = b("template_custom_fence_gate_open", "_open", fto.b, fto.c);
   public static final ftl S = b("template_custom_fence_gate_wall", "_wall", fto.b, fto.c);
   public static final ftl T = b("template_custom_fence_gate_wall_open", "_wall_open", fto.b, fto.c);
   public static final ftl U = a("template_fence_gate", fto.b);
   public static final ftl V = b("template_fence_gate_open", "_open", fto.b);
   public static final ftl W = b("template_fence_gate_wall", "_wall", fto.b);
   public static final ftl X = b("template_fence_gate_wall_open", "_wall_open", fto.b);
   public static final ftl Y = a("pressure_plate_up", fto.b);
   public static final ftl Z = b("pressure_plate_down", "_down", fto.b);
   public static final ftl aa = a(fto.c);
   public static final ftl ab = a("slab", fto.e, fto.f, fto.i);
   public static final ftl ac = b("slab_top", "_top", fto.e, fto.f, fto.i);
   public static final ftl ad = a("leaves", fto.a);
   public static final ftl ae = a("stairs", fto.e, fto.f, fto.i);
   public static final ftl af = b("inner_stairs", "_inner", fto.e, fto.f, fto.i);
   public static final ftl ag = b("outer_stairs", "_outer", fto.e, fto.f, fto.i);
   public static final ftl ah = b("template_trapdoor_top", "_top", fto.b);
   public static final ftl ai = b("template_trapdoor_bottom", "_bottom", fto.b);
   public static final ftl aj = b("template_trapdoor_open", "_open", fto.b);
   public static final ftl ak = b("template_orientable_trapdoor_top", "_top", fto.b);
   public static final ftl al = b("template_orientable_trapdoor_bottom", "_bottom", fto.b);
   public static final ftl am = b("template_orientable_trapdoor_open", "_open", fto.b);
   public static final ftl an = a("pointed_dripstone", fto.p);
   public static final ftl ao = a("cross", fto.p);
   public static final ftl ap = a("tinted_cross", fto.p);
   public static final ftl aq = a("cross_emissive", fto.p, fto.q);
   public static final ftl ar = a("flower_pot_cross", fto.r);
   public static final ftl as = a("tinted_flower_pot_cross", fto.r);
   public static final ftl at = a("flower_pot_cross_emissive", fto.r, fto.q);
   public static final ftl au = a("rail_flat", fto.t);
   public static final ftl av = b("rail_curved", "_corner", fto.t);
   public static final ftl aw = b("template_rail_raised_ne", "_raised_ne", fto.t);
   public static final ftl ax = b("template_rail_raised_sw", "_raised_sw", fto.t);
   public static final ftl ay = a("carpet", fto.u);
   public static final ftl az = a("mossy_carpet_side", fto.i);
   public static final ftl aA = b("flowerbed_1", "_1", fto.Q, fto.z);
   public static final ftl aB = b("flowerbed_2", "_2", fto.Q, fto.z);
   public static final ftl aC = b("flowerbed_3", "_3", fto.Q, fto.z);
   public static final ftl aD = b("flowerbed_4", "_4", fto.Q, fto.z);
   public static final ftl aE = b("template_leaf_litter_1", "_1", fto.b);
   public static final ftl aF = b("template_leaf_litter_2", "_2", fto.b);
   public static final ftl aG = b("template_leaf_litter_3", "_3", fto.b);
   public static final ftl aH = b("template_leaf_litter_4", "_4", fto.b);
   public static final ftl aI = a("coral_fan", fto.y);
   public static final ftl aJ = a("coral_wall_fan", fto.y);
   public static final ftl aK = a("template_glazed_terracotta", fto.v);
   public static final ftl aL = a("template_chorus_flower", fto.b);
   public static final ftl aM = a("template_daylight_detector", fto.f, fto.i);
   public static final ftl aN = b("template_glass_pane_noside", "_noside", fto.w);
   public static final ftl aO = b("template_glass_pane_noside_alt", "_noside_alt", fto.w);
   public static final ftl aP = b("template_glass_pane_post", "_post", fto.w, fto.x);
   public static final ftl aQ = b("template_glass_pane_side", "_side", fto.w, fto.x);
   public static final ftl aR = b("template_glass_pane_side_alt", "_side_alt", fto.w, fto.x);
   public static final ftl aS = a("template_command_block", fto.g, fto.h, fto.i);
   public static final ftl aT = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", fto.b);
   public static final ftl aU = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", fto.b);
   public static final ftl aV = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", fto.b);
   public static final ftl aW = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", fto.b);
   public static final ftl aX = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", fto.b);
   public static final ftl aY = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", fto.b);
   public static final ftl aZ = a("template_anvil", fto.f);
   public static final ftl[] ba = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, fto.z)).toArray(ftl[]::new);
   public static final ftl bb = a("stem_fruit", fto.z, fto.A);
   public static final ftl bc = a("crop", fto.B);
   public static final ftl bd = a("template_farmland", fto.C, fto.f);
   public static final ftl be = a("template_fire_floor", fto.D);
   public static final ftl bf = a("template_fire_side", fto.D);
   public static final ftl bg = a("template_fire_side_alt", fto.D);
   public static final ftl bh = a("template_fire_up", fto.D);
   public static final ftl bi = a("template_fire_up_alt", fto.D);
   public static final ftl bj = a("template_campfire", fto.D, fto.L);
   public static final ftl bk = a("template_lantern", fto.E);
   public static final ftl bl = b("template_hanging_lantern", "_hanging", fto.E);
   public static final ftl bm = a("template_torch", fto.H);
   public static final ftl bn = a("template_torch_unlit", fto.H);
   public static final ftl bo = a("template_torch_wall", fto.H);
   public static final ftl bp = a("template_torch_wall_unlit", fto.H);
   public static final ftl bq = a("template_redstone_torch", fto.H);
   public static final ftl br = a("template_redstone_torch_wall", fto.H);
   public static final ftl bs = a("template_piston", fto.F, fto.e, fto.i);
   public static final ftl bt = a("template_piston_head", fto.F, fto.i, fto.G);
   public static final ftl bu = a("template_piston_head_short", fto.F, fto.i, fto.G);
   public static final ftl bv = a("template_seagrass", fto.b);
   public static final ftl bw = a("template_turtle_egg", fto.a);
   public static final ftl bx = a("template_two_turtle_eggs", fto.a);
   public static final ftl by = a("template_three_turtle_eggs", fto.a);
   public static final ftl bz = a("template_four_turtle_eggs", fto.a);
   public static final ftl bA = a("template_single_face", fto.b);
   public static final ftl bB = a("template_cauldron_level1", fto.O, fto.N, fto.c, fto.f, fto.e, fto.i);
   public static final ftl bC = a("template_cauldron_level2", fto.O, fto.N, fto.c, fto.f, fto.e, fto.i);
   public static final ftl bD = a("template_cauldron_full", fto.O, fto.N, fto.c, fto.f, fto.e, fto.i);
   public static final ftl bE = a("template_azalea", fto.f, fto.i);
   public static final ftl bF = a("template_potted_azalea_bush", fto.r, fto.f, fto.i);
   public static final ftl bG = a("template_potted_azalea_bush", fto.r, fto.f, fto.i);
   public static final ftl bH = a("sniffer_egg", fto.f, fto.e, fto.j, fto.k, fto.l, fto.m);
   public static final ftl bI = b("generated", fto.I);
   public static final ftl bJ = b("template_music_disc", fto.I);
   public static final ftl bK = b("handheld", fto.I);
   public static final ftl bL = b("handheld_rod", fto.I);
   public static final ftl bM = b("generated", fto.I, fto.J);
   public static final ftl bN = b("generated", fto.I, fto.J, fto.K);
   public static final ftl bO = b("template_shulker_box", fto.c);
   public static final ftl bP = b("template_bed", fto.c);
   public static final ftl bQ = b("template_chest", fto.c);
   public static final ftl bR = a("template_bundle_open_front", "_open_front", fto.I);
   public static final ftl bS = a("template_bundle_open_back", "_open_back", fto.I);
   public static final ftl bT = b("bow", fto.I);
   public static final ftl bU = b("crossbow", fto.I);
   public static final ftl bV = a("template_candle", fto.a, fto.c);
   public static final ftl bW = a("template_two_candles", fto.a, fto.c);
   public static final ftl bX = a("template_three_candles", fto.a, fto.c);
   public static final ftl bY = a("template_four_candles", fto.a, fto.c);
   public static final ftl bZ = a("template_cake_with_candle", fto.M, fto.e, fto.i, fto.f, fto.c);
   public static final ftl ca = a("template_sculk_shrieker", fto.e, fto.i, fto.f, fto.c, fto.P);
   public static final ftl cb = a("template_vault", fto.f, fto.e, fto.i, fto.g);
   public static final ftl cc = b("handheld_mace", fto.I);

   private static ftl a(fto... $$0) {
      return new ftl(Optional.empty(), Optional.empty(), $$0);
   }

   private static ftl a(String $$0, fto... $$1) {
      return new ftl(Optional.of(ali.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static ftl b(String $$0, fto... $$1) {
      return new ftl(Optional.of(ali.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static ftl a(String $$0, String $$1, fto... $$2) {
      return new ftl(Optional.of(ali.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static ftl b(String $$0, String $$1, fto... $$2) {
      return new ftl(Optional.of(ali.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
