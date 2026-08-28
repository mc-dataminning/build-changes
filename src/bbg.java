import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.DataFixerBuilder.Result;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bbg {
   private static final BiFunction<Integer, Schema, Schema> b = Schema::new;
   private static final BiFunction<Integer, Schema, Schema> c = bky::new;
   private static final Result d = b();
   public static final int a = 4295;

   private bbg() {
   }

   public static DataFixer a() {
      return d.fixer();
   }

   private static Result b() {
      DataFixerBuilder $$0 = new DataFixerBuilder(ac.b().d().c());
      a($$0);
      return $$0.build();
   }

   public static CompletableFuture<?> a(Set<TypeReference> $$0) {
      if ($$0.isEmpty()) {
         return CompletableFuture.completedFuture(null);
      } else {
         Executor $$1 = Executors.newSingleThreadExecutor(
            new ThreadFactoryBuilder().setNameFormat("Datafixer Bootstrap").setDaemon(true).setPriority(1).build()
         );
         return d.optimize($$0, $$1);
      }
   }

   private static void a(DataFixerBuilder $$0) {
      $$0.addSchema(99, bpa::new);
      Schema $$1 = $$0.addSchema(100, bkz::new);
      $$0.addFixer(new bel($$1));
      Schema $$2 = $$0.addSchema(101, b);
      $$0.addFixer(new bkn($$2));
      Schema $$3 = $$0.addSchema(102, bla::new);
      $$0.addFixer(new bgn($$3, true));
      $$0.addFixer(new bgp($$3, false));
      Schema $$4 = $$0.addSchema(105, b);
      $$0.addFixer(new bgt($$4, true));
      Schema $$5 = $$0.addSchema(106, blc::new);
      $$0.addFixer(new bhv($$5, true));
      Schema $$6 = $$0.addSchema(107, bld::new);
      $$0.addFixer(new beu($$6));
      Schema $$7 = $$0.addSchema(108, b);
      $$0.addFixer(new bfi($$7, true));
      Schema $$8 = $$0.addSchema(109, b);
      $$0.addFixer(new bep($$8, true));
      Schema $$9 = $$0.addSchema(110, b);
      $$0.addFixer(new beq($$9, true));
      Schema $$10 = $$0.addSchema(111, b);
      $$0.addFixer(new bev($$10, true));
      Schema $$11 = $$0.addSchema(113, b);
      $$0.addFixer(new bfa($$11, true));
      Schema $$12 = $$0.addSchema(135, blf::new);
      $$0.addFixer(new bfc($$12, true));
      Schema $$13 = $$0.addSchema(143, blg::new);
      $$0.addFixer(new bfk($$13, true));
      Schema $$14 = $$0.addSchema(147, b);
      $$0.addFixer(new bed($$14, true));
      Schema $$15 = $$0.addSchema(165, b);
      $$0.addFixer(new bka($$15));
      Schema $$16 = $$0.addSchema(501, bos::new);
      $$0.addFixer(new bbp($$16, "Add 1.10 entities fix", bjd.D));
      Schema $$17 = $$0.addSchema(502, b);
      $$0.addFixer(bgr.a($$17, "cooked_fished item renamer", $$0x -> Objects.equals(bky.a($$0x), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : $$0x));
      $$0.addFixer(new bfp($$17, false));
      Schema $$18 = $$0.addSchema(505, b);
      $$0.addFixer(new bii($$18, false));
      Schema $$19 = $$0.addSchema(700, bot::new);
      $$0.addFixer(new bek($$19, true));
      Schema $$20 = $$0.addSchema(701, bou::new);
      $$0.addFixer(new bfg($$20, true));
      Schema $$21 = $$0.addSchema(702, bov::new);
      $$0.addFixer(new bfo($$21));
      Schema $$22 = $$0.addSchema(703, bow::new);
      $$0.addFixer(new ber($$22, true));
      Schema $$23 = $$0.addSchema(704, box::new);
      $$0.addFixer(new bck($$23, true));
      Schema $$24 = $$0.addSchema(705, boy::new);
      $$0.addFixer(new bes($$24, true));
      Schema $$25 = $$0.addSchema(804, c);
      $$0.addFixer(new bgl($$25, true));
      Schema $$26 = $$0.addSchema(806, c);
      $$0.addFixer(new bhd($$26, false));
      Schema $$27 = $$0.addSchema(808, boz::new);
      $$0.addFixer(new bbp($$27, "added shulker box", bjd.s));
      Schema $$28 = $$0.addSchema(808, 1, c);
      $$0.addFixer(new bfe($$28, false));
      Schema $$29 = $$0.addSchema(813, c);
      $$0.addFixer(new bgs($$29, false));
      $$0.addFixer(new bco($$29, false));
      Schema $$30 = $$0.addSchema(816, c);
      $$0.addFixer(new bil($$30, false));
      Schema $$31 = $$0.addSchema(820, c);
      $$0.addFixer(bgr.a($$31, "totem item renamer", a("minecraft:totem", "minecraft:totem_of_undying")));
      Schema $$32 = $$0.addSchema(1022, blb::new);
      $$0.addFixer(new bku($$32, "added shoulder entities to players", bjd.b));
      Schema $$33 = $$0.addSchema(1125, ble::new);
      $$0.addFixer(new bdd($$33, true));
      $$0.addFixer(new bca($$33, false));
      Schema $$34 = $$0.addSchema(1344, c);
      $$0.addFixer(new bij($$34, false));
      Schema $$35 = $$0.addSchema(1446, c);
      $$0.addFixer(new bik($$35, false));
      Schema $$36 = $$0.addSchema(1450, c);
      $$0.addFixer(new bcw($$36, false));
      Schema $$37 = $$0.addSchema(1451, blh::new);
      $$0.addFixer(new bbp($$37, "AddTrappedChestFix", bjd.s));
      Schema $$38 = $$0.addSchema(1451, 1, bli::new);
      $$0.addFixer(new bdj($$38, true));
      Schema $$39 = $$0.addSchema(1451, 2, blj::new);
      $$0.addFixer(new bch($$39, true));
      Schema $$40 = $$0.addSchema(1451, 3, blk::new);
      $$0.addFixer(new bef($$40, true));
      $$0.addFixer(new bgx($$40, false));
      Schema $$41 = $$0.addSchema(1451, 4, bll::new);
      $$0.addFixer(new bcr($$41, true));
      $$0.addFixer(new bhb($$41, false));
      Schema $$42 = $$0.addSchema(1451, 5, blm::new);
      $$0.addFixer(
         new bgq(
            $$42,
            false,
            Set.of(
               "minecraft:noteblock",
               "minecraft:flower_pot",
               "minecraft:dandelion",
               "minecraft:poppy",
               "minecraft:blue_orchid",
               "minecraft:allium",
               "minecraft:azure_bluet",
               "minecraft:red_tulip",
               "minecraft:orange_tulip",
               "minecraft:white_tulip",
               "minecraft:pink_tulip",
               "minecraft:oxeye_daisy",
               "minecraft:cactus",
               "minecraft:brown_mushroom",
               "minecraft:red_mushroom",
               "minecraft:oak_sapling",
               "minecraft:spruce_sapling",
               "minecraft:birch_sapling",
               "minecraft:jungle_sapling",
               "minecraft:acacia_sapling",
               "minecraft:dark_oak_sapling",
               "minecraft:dead_bush",
               "minecraft:fern"
            )
         )
      );
      $$0.addFixer(new bbp($$42, "RemoveNoteBlockFlowerPotFix", bjd.s));
      $$0.addFixer(new bgy($$42, false, "minecraft:spawn_egg"));
      $$0.addFixer(new bfn($$42, false));
      $$0.addFixer(new bcg($$42, false));
      $$0.addFixer(new bhl($$42, false));
      Schema $$43 = $$0.addSchema(1451, 6, bln::new);
      $$0.addFixer(new bjt($$43, true));
      $$0.addFixer(new bcl($$43, false));
      Schema $$44 = $$0.addSchema(1451, 7, c);
      $$0.addFixer(new bko($$44));
      Schema $$45 = $$0.addSchema(1456, c);
      $$0.addFixer(new bet($$45, false));
      Schema $$46 = $$0.addSchema(1458, blo::new);
      $$0.addFixer(new bej($$46));
      $$0.addFixer(new bgm($$46));
      $$0.addFixer(new bci($$46));
      Schema $$47 = $$0.addSchema(1460, blp::new);
      $$0.addFixer(new bew($$47, false));
      Schema $$48 = $$0.addSchema(1466, blq::new);
      $$0.addFixer(new bbp($$48, "Add DUMMY block entity", bjd.s));
      $$0.addFixer(new bdq($$48, true));
      Schema $$49 = $$0.addSchema(1470, blr::new);
      $$0.addFixer(new bbp($$49, "Add 1.13 entities fix", bjd.D));
      Schema $$50 = $$0.addSchema(1474, c);
      $$0.addFixer(new bdr($$50, false));
      $$0.addFixer(
         bcu.a($$50, "Colorless shulker block fixer", $$0x -> Objects.equals(bky.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      $$0.addFixer(
         bgr.a($$50, "Colorless shulker item fixer", $$0x -> Objects.equals(bky.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      Schema $$51 = $$0.addSchema(1475, c);
      $$0.addFixer(bcu.a($$51, "Flowing fixer", b(ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava"))));
      Schema $$52 = $$0.addSchema(1480, c);
      $$0.addFixer(bcu.a($$52, "Rename coral blocks", b(bjj.a)));
      $$0.addFixer(bgr.a($$52, "Rename coral items", b(bjj.a)));
      Schema $$53 = $$0.addSchema(1481, bls::new);
      $$0.addFixer(new bbp($$53, "Add conduit", bjd.s));
      Schema $$54 = $$0.addSchema(1483, blt::new);
      $$0.addFixer(new bey($$54, true));
      $$0.addFixer(bgr.a($$54, "Rename pufferfish egg item", b(bey.a)));
      Schema $$55 = $$0.addSchema(1484, c);
      $$0.addFixer(
         bgr.a(
            $$55,
            "Rename seagrass items",
            b(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(
         bcu.a(
            $$55,
            "Rename seagrass blocks",
            b(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(new bgf($$55, false));
      Schema $$56 = $$0.addSchema(1486, blu::new);
      $$0.addFixer(new bei($$56, true));
      $$0.addFixer(bgr.a($$56, "Rename cod/salmon egg items", b(bei.b)));
      Schema $$57 = $$0.addSchema(1487, c);
      $$0.addFixer(
         bgr.a(
            $$57,
            "Rename prismarine_brick(s)_* blocks",
            b(
               ImmutableMap.of(
                  "minecraft:prismarine_bricks_slab",
                  "minecraft:prismarine_brick_slab",
                  "minecraft:prismarine_bricks_stairs",
                  "minecraft:prismarine_brick_stairs"
               )
            )
         )
      );
      $$0.addFixer(
         bcu.a(
            $$57,
            "Rename prismarine_brick(s)_* items",
            b(
               ImmutableMap.of(
                  "minecraft:prismarine_bricks_slab",
                  "minecraft:prismarine_brick_slab",
                  "minecraft:prismarine_bricks_stairs",
                  "minecraft:prismarine_brick_stairs"
               )
            )
         )
      );
      Schema $$58 = $$0.addSchema(1488, blv::new);
      $$0.addFixer(bcu.a($$58, "Rename kelp/kelptop", b(ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant"))));
      $$0.addFixer(bgr.a($$58, "Rename kelptop", a("minecraft:kelp_top", "minecraft:kelp")));
      $$0.addFixer(new bhy($$58, true, "Command block block entity custom name fix", bjd.s, "minecraft:command_block") {
         @Override
         protected <T> Dynamic<T> a(Dynamic<T> $$0) {
            return bci.a($$0);
         }
      });
      $$0.addFixer(
         new DataFix($$58, false) {
            protected TypeRewriteRule makeRule() {
               Type<?> $$0 = this.getInputSchema().getType(bjd.D);
               OpticFinder<String> $$1 = DSL.fieldFinder("id", bky.a());
               OpticFinder<?> $$2 = $$0.findField("CustomName");
               OpticFinder<Pair<String, String>> $$3 = DSL.typeFinder(this.getInputSchema().getType(bjd.z));
               return this.fixTypeEverywhereTyped(
                  "Command block minecart custom name fix",
                  $$0,
                  $$3x -> {
                     String $$4 = $$3x.getOptional($$1).orElse("");
                     return !"minecraft:commandblock_minecart".equals($$4)
                        ? $$3x
                        : $$3x.updateTyped($$2, $$1xx -> $$1xx.update($$3, $$0xxx -> $$0xxx.mapSecond(bbi::a)));
                  }
               );
            }
         }
      );
      $$0.addFixer(new bgh($$58, false));
      Schema $$59 = $$0.addSchema(1490, c);
      $$0.addFixer(bcu.a($$59, "Rename melon_block", a("minecraft:melon_block", "minecraft:melon")));
      $$0.addFixer(
         bgr.a(
            $$59,
            "Rename melon_block/melon/speckled_melon",
            b(
               ImmutableMap.of(
                  "minecraft:melon_block",
                  "minecraft:melon",
                  "minecraft:melon",
                  "minecraft:melon_slice",
                  "minecraft:speckled_melon",
                  "minecraft:glistering_melon_slice"
               )
            )
         )
      );
      Schema $$60 = $$0.addSchema(1492, c);
      $$0.addFixer(new bdo($$60, false));
      Schema $$61 = $$0.addSchema(1494, c);
      $$0.addFixer(new bgw($$61, false));
      Schema $$62 = $$0.addSchema(1496, c);
      $$0.addFixer(new bhh($$62, false));
      Schema $$63 = $$0.addSchema(1500, c);
      $$0.addFixer(new bcm($$63, false));
      Schema $$64 = $$0.addSchema(1501, c);
      $$0.addFixer(new bbq($$64, false));
      Schema $$65 = $$0.addSchema(1502, c);
      $$0.addFixer(new bhz($$65, "Recipes fix", bjd.L, b(bja.a)));
      Schema $$66 = $$0.addSchema(1506, c);
      $$0.addFixer(new bhk($$66, false));
      Schema $$67 = $$0.addSchema(1510, blw::new);
      $$0.addFixer(bcu.a($$67, "Block renamening fix", b(bfj.b)));
      $$0.addFixer(bgr.a($$67, "Item renamening fix", b(bfj.c)));
      $$0.addFixer(new bhz($$67, "Recipes renamening fix", bjd.L, b(bjb.a)));
      $$0.addFixer(new bfj($$67, true));
      $$0.addFixer(
         new bju(
            $$67,
            "SwimStatsRenameFix",
            ImmutableMap.of("minecraft:swim_one_cm", "minecraft:walk_on_water_one_cm", "minecraft:dive_one_cm", "minecraft:walk_under_water_one_cm")
         )
      );
      Schema $$68 = $$0.addSchema(1514, c);
      $$0.addFixer(new bjo($$68, "ObjectiveDisplayNameFix", bjd.J));
      $$0.addFixer(new bjo($$68, "TeamDisplayNameFix", bjd.K));
      $$0.addFixer(new bib($$68));
      Schema $$69 = $$0.addSchema(1515, c);
      $$0.addFixer(bcu.a($$69, "Rename coral fan blocks", b(bji.a)));
      Schema $$70 = $$0.addSchema(1624, c);
      $$0.addFixer(new bkf($$70, false));
      Schema $$71 = $$0.addSchema(1800, blx::new);
      $$0.addFixer(new bbp($$71, "Added 1.14 mobs fix", bjd.D));
      $$0.addFixer(bgr.a($$71, "Rename dye items", b(bdz.a)));
      Schema $$72 = $$0.addSchema(1801, bly::new);
      $$0.addFixer(new bbp($$72, "Added Illager Beast", bjd.D));
      Schema $$73 = $$0.addSchema(1802, c);
      $$0.addFixer(
         bcu.a(
            $$73,
            "Rename sign blocks & stone slabs",
            b(
               ImmutableMap.of(
                  "minecraft:stone_slab",
                  "minecraft:smooth_stone_slab",
                  "minecraft:sign",
                  "minecraft:oak_sign",
                  "minecraft:wall_sign",
                  "minecraft:oak_wall_sign"
               )
            )
         )
      );
      $$0.addFixer(
         bgr.a(
            $$73,
            "Rename sign item & stone slabs",
            b(ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))
         )
      );
      Schema $$74 = $$0.addSchema(1803, c);
      $$0.addFixer(new bgo($$74));
      Schema $$75 = $$0.addSchema(1904, blz::new);
      $$0.addFixer(new bbp($$75, "Added Cats", bjd.D));
      $$0.addFixer(new beh($$75, false));
      Schema $$76 = $$0.addSchema(1905, c);
      $$0.addFixer(new bdm($$76, false));
      Schema $$77 = $$0.addSchema(1906, bma::new);
      $$0.addFixer(new bbp($$77, "Add POI Blocks", bjd.s));
      Schema $$78 = $$0.addSchema(1909, bmb::new);
      $$0.addFixer(new bbp($$78, "Add jigsaw", bjd.s));
      Schema $$79 = $$0.addSchema(1911, c);
      $$0.addFixer(new bdn($$79, false));
      Schema $$80 = $$0.addSchema(1914, c);
      $$0.addFixer(new bkq($$80, false));
      Schema $$81 = $$0.addSchema(1917, c);
      $$0.addFixer(new bcz($$81, false));
      Schema $$82 = $$0.addSchema(1918, c);
      $$0.addFixer(new bkk($$82, "minecraft:villager"));
      $$0.addFixer(new bkk($$82, "minecraft:zombie_villager"));
      Schema $$83 = $$0.addSchema(1920, bmc::new);
      $$0.addFixer(new bia($$83, false));
      $$0.addFixer(new bbp($$83, "Add campfire", bjd.s));
      Schema $$84 = $$0.addSchema(1925, bmd::new);
      $$0.addFixer(new bhr($$84));
      Schema $$85 = $$0.addSchema(1928, bme::new);
      $$0.addFixer(new bez($$85, true));
      $$0.addFixer(bgr.a($$85, "Rename ravager egg item", b(bez.a)));
      Schema $$86 = $$0.addSchema(1929, bmf::new);
      $$0.addFixer(new bbp($$86, "Add Wandering Trader and Trader Llama", bjd.D));
      Schema $$87 = $$0.addSchema(1931, bmg::new);
      $$0.addFixer(new bbp($$87, "Added Fox", bjd.D));
      Schema $$88 = $$0.addSchema(1936, c);
      $$0.addFixer(new big($$88, false));
      Schema $$89 = $$0.addSchema(1946, c);
      $$0.addFixer(new bjk($$89, false));
      Schema $$90 = $$0.addSchema(1948, c);
      $$0.addFixer(new bie($$90));
      Schema $$91 = $$0.addSchema(1953, c);
      $$0.addFixer(new bic($$91, false));
      Schema $$92 = $$0.addSchema(1955, c);
      $$0.addFixer(new bkm($$92, false));
      $$0.addFixer(new bkv($$92, false));
      Schema $$93 = $$0.addSchema(1961, c);
      $$0.addFixer(new bdi($$93, false));
      Schema $$94 = $$0.addSchema(1963, c);
      $$0.addFixer(new bjg($$94, false));
      Schema $$95 = $$0.addSchema(2100, bmh::new);
      $$0.addFixer(new bbp($$95, "Added Bee and Bee Stinger", bjd.D));
      $$0.addFixer(new bbp($$95, "Add beehive", bjd.s));
      $$0.addFixer(new bhz($$95, "Rename sugar recipe", bjd.L, a("minecraft:sugar", "minecraft:sugar_from_sugar_cane")));
      $$0.addFixer(new bbr($$95, false, "Rename sugar recipe advancement", a("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane")));
      Schema $$96 = $$0.addSchema(2202, c);
      $$0.addFixer(new bde($$96, false));
      Schema $$97 = $$0.addSchema(2209, c);
      UnaryOperator<String> $$98 = a("minecraft:bee_hive", "minecraft:beehive");
      $$0.addFixer(bgr.a($$97, "Rename bee_hive item to beehive", $$98));
      $$0.addFixer(new biv($$97, "Rename bee_hive poi to beehive", $$98));
      $$0.addFixer(bcu.a($$97, "Rename bee_hive block to beehive", $$98));
      Schema $$99 = $$0.addSchema(2211, c);
      $$0.addFixer(new bjw($$99, false));
      Schema $$100 = $$0.addSchema(2218, c);
      $$0.addFixer(new bga($$100, false));
      Schema $$101 = $$0.addSchema(2501, bmi::new);
      $$0.addFixer(new bgc($$101, true));
      Schema $$102 = $$0.addSchema(2502, bmj::new);
      $$0.addFixer(new bbp($$102, "Added Hoglin", bjd.D));
      Schema $$103 = $$0.addSchema(2503, c);
      $$0.addFixer(new bkp($$103, false));
      $$0.addFixer(new bbr($$103, false, "Composter category change", a("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter")));
      Schema $$104 = $$0.addSchema(2505, bmk::new);
      $$0.addFixer(new bbp($$104, "Added Piglin", bjd.D));
      $$0.addFixer(new bhs($$104, "minecraft:villager"));
      Schema $$105 = $$0.addSchema(2508, c);
      $$0.addFixer(
         bgr.a(
            $$105,
            "Renamed fungi items to fungus",
            b(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      $$0.addFixer(
         bcu.a(
            $$105,
            "Renamed fungi blocks to fungus",
            b(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      Schema $$106 = $$0.addSchema(2509, bml::new);
      $$0.addFixer(new bfq($$106));
      $$0.addFixer(bgr.a($$106, "Rename zombie pigman egg item", b(bfq.a)));
      Schema $$107 = $$0.addSchema(2511, c);
      $$0.addFixer(new bex($$107));
      Schema $$108 = $$0.addSchema(2511, 1, bmm::new);
      $$0.addFixer(new bhw($$108, "SplashPotionItemFieldRenameFix", bjd.D, "minecraft:potion"));
      Schema $$109 = $$0.addSchema(2514, c);
      $$0.addFixer(new bfl($$109));
      $$0.addFixer(new bcq($$109));
      $$0.addFixer(new bit($$109));
      $$0.addFixer(new bhn($$109));
      $$0.addFixer(new bjn($$109));
      $$0.addFixer(new bhc($$109));
      Schema $$110 = $$0.addSchema(2516, c);
      $$0.addFixer(new bge($$110, "minecraft:villager"));
      $$0.addFixer(new bge($$110, "minecraft:zombie_villager"));
      Schema $$111 = $$0.addSchema(2518, c);
      $$0.addFixer(new bhe($$111, false));
      $$0.addFixer(new bhf($$111));
      Schema $$112 = $$0.addSchema(2519, bmn::new);
      $$0.addFixer(new bbp($$112, "Added Strider", bjd.D));
      Schema $$113 = $$0.addSchema(2522, bmo::new);
      $$0.addFixer(new bbp($$113, "Added Zoglin", bjd.D));
      Schema $$114 = $$0.addSchema(2523, c);
      $$0.addFixer(
         new bbx(
            $$114,
            "Attribute renames",
            a(
               ImmutableMap.builder()
                  .put("generic.maxHealth", "minecraft:generic.max_health")
                  .put("Max Health", "minecraft:generic.max_health")
                  .put("zombie.spawnReinforcements", "minecraft:zombie.spawn_reinforcements")
                  .put("Spawn Reinforcements Chance", "minecraft:zombie.spawn_reinforcements")
                  .put("horse.jumpStrength", "minecraft:horse.jump_strength")
                  .put("Jump Strength", "minecraft:horse.jump_strength")
                  .put("generic.followRange", "minecraft:generic.follow_range")
                  .put("Follow Range", "minecraft:generic.follow_range")
                  .put("generic.knockbackResistance", "minecraft:generic.knockback_resistance")
                  .put("Knockback Resistance", "minecraft:generic.knockback_resistance")
                  .put("generic.movementSpeed", "minecraft:generic.movement_speed")
                  .put("Movement Speed", "minecraft:generic.movement_speed")
                  .put("generic.flyingSpeed", "minecraft:generic.flying_speed")
                  .put("Flying Speed", "minecraft:generic.flying_speed")
                  .put("generic.attackDamage", "minecraft:generic.attack_damage")
                  .put("generic.attackKnockback", "minecraft:generic.attack_knockback")
                  .put("generic.attackSpeed", "minecraft:generic.attack_speed")
                  .put("generic.armorToughness", "minecraft:generic.armor_toughness")
                  .build()
            )
         )
      );
      Schema $$115 = $$0.addSchema(2527, c);
      $$0.addFixer(new bcd($$115));
      Schema $$116 = $$0.addSchema(2528, c);
      $$0.addFixer(
         bgr.a(
            $$116,
            "Rename soul fire torch and soul fire lantern",
            b(ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))
         )
      );
      $$0.addFixer(
         bcu.a(
            $$116,
            "Rename soul fire torch and soul fire lantern",
            b(
               ImmutableMap.of(
                  "minecraft:soul_fire_torch",
                  "minecraft:soul_torch",
                  "minecraft:soul_fire_wall_torch",
                  "minecraft:soul_wall_torch",
                  "minecraft:soul_fire_lantern",
                  "minecraft:soul_lantern"
               )
            )
         )
      );
      Schema $$117 = $$0.addSchema(2529, c);
      $$0.addFixer(new bjv($$117, false));
      Schema $$118 = $$0.addSchema(2531, c);
      $$0.addFixer(new bjc($$118));
      Schema $$119 = $$0.addSchema(2533, c);
      $$0.addFixer(new bkl($$119));
      Schema $$120 = $$0.addSchema(2535, c);
      $$0.addFixer(new bff($$120));
      Schema $$121 = $$0.addSchema(2538, c);
      $$0.addFixer(new bhm($$121));
      Schema $$122 = $$0.addSchema(2550, c);
      $$0.addFixer(new bks($$122));
      Schema $$123 = $$0.addSchema(2551, bmp::new);
      $$0.addFixer(new bku($$123, "add types to WorldGenData", bjd.O));
      Schema $$124 = $$0.addSchema(2552, c);
      $$0.addFixer(new bhz($$124, "Nether biome rename", bjd.M, a("minecraft:nether", "minecraft:nether_wastes")));
      Schema $$125 = $$0.addSchema(2553, c);
      $$0.addFixer(new bhz($$125, "Biomes fix", bjd.M, b(bcc.a)));
      Schema $$126 = $$0.addSchema(2558, c);
      $$0.addFixer(new bht($$126, false));
      $$0.addFixer(new bio($$126, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
      Schema $$127 = $$0.addSchema(2568, bmq::new);
      $$0.addFixer(new bbp($$127, "Added Piglin Brute", bjd.D));
      Schema $$128 = $$0.addSchema(2571, bmr::new);
      $$0.addFixer(new bbp($$128, "Added Goat", bjd.D));
      Schema $$129 = $$0.addSchema(2679, c);
      $$0.addFixer(new bda($$129, false));
      Schema $$130 = $$0.addSchema(2680, c);
      $$0.addFixer(bgr.a($$130, "Renamed grass path item to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      $$0.addFixer(bcu.a($$130, "Renamed grass path block to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      Schema $$131 = $$0.addSchema(2684, bms::new);
      $$0.addFixer(new bbp($$131, "Added Sculk Sensor", bjd.s));
      Schema $$132 = $$0.addSchema(2686, bmt::new);
      $$0.addFixer(new bbp($$132, "Added Axolotl", bjd.D));
      Schema $$133 = $$0.addSchema(2688, bmu::new);
      $$0.addFixer(new bbp($$133, "Added Glow Squid", bjd.D));
      $$0.addFixer(new bbp($$133, "Added Glow Item Frame", bjd.D));
      Schema $$134 = $$0.addSchema(2690, c);
      ImmutableMap<String, String> $$135 = ImmutableMap.builder()
         .put("minecraft:weathered_copper_block", "minecraft:oxidized_copper_block")
         .put("minecraft:semi_weathered_copper_block", "minecraft:weathered_copper_block")
         .put("minecraft:lightly_weathered_copper_block", "minecraft:exposed_copper_block")
         .put("minecraft:weathered_cut_copper", "minecraft:oxidized_cut_copper")
         .put("minecraft:semi_weathered_cut_copper", "minecraft:weathered_cut_copper")
         .put("minecraft:lightly_weathered_cut_copper", "minecraft:exposed_cut_copper")
         .put("minecraft:weathered_cut_copper_stairs", "minecraft:oxidized_cut_copper_stairs")
         .put("minecraft:semi_weathered_cut_copper_stairs", "minecraft:weathered_cut_copper_stairs")
         .put("minecraft:lightly_weathered_cut_copper_stairs", "minecraft:exposed_cut_copper_stairs")
         .put("minecraft:weathered_cut_copper_slab", "minecraft:oxidized_cut_copper_slab")
         .put("minecraft:semi_weathered_cut_copper_slab", "minecraft:weathered_cut_copper_slab")
         .put("minecraft:lightly_weathered_cut_copper_slab", "minecraft:exposed_cut_copper_slab")
         .put("minecraft:waxed_semi_weathered_copper", "minecraft:waxed_weathered_copper")
         .put("minecraft:waxed_lightly_weathered_copper", "minecraft:waxed_exposed_copper")
         .put("minecraft:waxed_semi_weathered_cut_copper", "minecraft:waxed_weathered_cut_copper")
         .put("minecraft:waxed_lightly_weathered_cut_copper", "minecraft:waxed_exposed_cut_copper")
         .put("minecraft:waxed_semi_weathered_cut_copper_stairs", "minecraft:waxed_weathered_cut_copper_stairs")
         .put("minecraft:waxed_lightly_weathered_cut_copper_stairs", "minecraft:waxed_exposed_cut_copper_stairs")
         .put("minecraft:waxed_semi_weathered_cut_copper_slab", "minecraft:waxed_weathered_cut_copper_slab")
         .put("minecraft:waxed_lightly_weathered_cut_copper_slab", "minecraft:waxed_exposed_cut_copper_slab")
         .build();
      $$0.addFixer(bgr.a($$134, "Renamed copper block items to new oxidized terms", b($$135)));
      $$0.addFixer(bcu.a($$134, "Renamed copper blocks to new oxidized terms", b($$135)));
      Schema $$136 = $$0.addSchema(2691, c);
      ImmutableMap<String, String> $$137 = ImmutableMap.builder()
         .put("minecraft:waxed_copper", "minecraft:waxed_copper_block")
         .put("minecraft:oxidized_copper_block", "minecraft:oxidized_copper")
         .put("minecraft:weathered_copper_block", "minecraft:weathered_copper")
         .put("minecraft:exposed_copper_block", "minecraft:exposed_copper")
         .build();
      $$0.addFixer(bgr.a($$136, "Rename copper item suffixes", b($$137)));
      $$0.addFixer(bcu.a($$136, "Rename copper blocks suffixes", b($$137)));
      Schema $$138 = $$0.addSchema(2693, c);
      $$0.addFixer(new bbo($$138, bjd.O, "has_increased_height_already", false));
      Schema $$139 = $$0.addSchema(2696, c);
      ImmutableMap<String, String> $$140 = ImmutableMap.builder()
         .put("minecraft:grimstone", "minecraft:deepslate")
         .put("minecraft:grimstone_slab", "minecraft:cobbled_deepslate_slab")
         .put("minecraft:grimstone_stairs", "minecraft:cobbled_deepslate_stairs")
         .put("minecraft:grimstone_wall", "minecraft:cobbled_deepslate_wall")
         .put("minecraft:polished_grimstone", "minecraft:polished_deepslate")
         .put("minecraft:polished_grimstone_slab", "minecraft:polished_deepslate_slab")
         .put("minecraft:polished_grimstone_stairs", "minecraft:polished_deepslate_stairs")
         .put("minecraft:polished_grimstone_wall", "minecraft:polished_deepslate_wall")
         .put("minecraft:grimstone_tiles", "minecraft:deepslate_tiles")
         .put("minecraft:grimstone_tile_slab", "minecraft:deepslate_tile_slab")
         .put("minecraft:grimstone_tile_stairs", "minecraft:deepslate_tile_stairs")
         .put("minecraft:grimstone_tile_wall", "minecraft:deepslate_tile_wall")
         .put("minecraft:grimstone_bricks", "minecraft:deepslate_bricks")
         .put("minecraft:grimstone_brick_slab", "minecraft:deepslate_brick_slab")
         .put("minecraft:grimstone_brick_stairs", "minecraft:deepslate_brick_stairs")
         .put("minecraft:grimstone_brick_wall", "minecraft:deepslate_brick_wall")
         .put("minecraft:chiseled_grimstone", "minecraft:chiseled_deepslate")
         .build();
      $$0.addFixer(bgr.a($$139, "Renamed grimstone block items to deepslate", b($$140)));
      $$0.addFixer(bcu.a($$139, "Renamed grimstone blocks to deepslate", b($$140)));
      Schema $$141 = $$0.addSchema(2700, c);
      $$0.addFixer(
         bcu.a(
            $$141,
            "Renamed cave vines blocks",
            b(ImmutableMap.of("minecraft:cave_vines_head", "minecraft:cave_vines", "minecraft:cave_vines_body", "minecraft:cave_vines_plant"))
         )
      );
      Schema $$142 = $$0.addSchema(2701, c);
      $$0.addFixer(new bjm($$142));
      Schema $$143 = $$0.addSchema(2702, c);
      $$0.addFixer(new bbk($$143));
      Schema $$144 = $$0.addSchema(2704, bmv::new);
      $$0.addFixer(new bbp($$144, "Added Goat", bjd.D));
      Schema $$145 = $$0.addSchema(2707, bmw::new);
      $$0.addFixer(new bbp($$145, "Added Marker", bjd.D));
      $$0.addFixer(new bbo($$145, bjd.O, "has_increased_height_already", true));
      Schema $$146 = $$0.addSchema(2710, c);
      $$0.addFixer(new bju($$146, "Renamed play_one_minute stat to play_time", ImmutableMap.of("minecraft:play_one_minute", "minecraft:play_time")));
      Schema $$147 = $$0.addSchema(2717, c);
      $$0.addFixer(bgr.a($$147, "Rename azalea_leaves_flowers", b(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves"))));
      $$0.addFixer(
         bcu.a($$147, "Rename azalea_leaves_flowers items", b(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves")))
      );
      Schema $$148 = $$0.addSchema(2825, c);
      $$0.addFixer(new bbo($$148, bjd.O, "has_increased_height_already", false));
      Schema $$149 = $$0.addSchema(2831, bmx::new);
      $$0.addFixer(new bjs($$149));
      Schema $$150 = $$0.addSchema(2832, bmy::new);
      $$0.addFixer(new bkt($$150));
      $$0.addFixer(new bdh($$150));
      Schema $$151 = $$0.addSchema(2833, c);
      $$0.addFixer(new bkr($$151));
      Schema $$152 = $$0.addSchema(2838, c);
      $$0.addFixer(new bhz($$152, "Caves and Cliffs biome renames", bjd.M, b(bdb.a)));
      Schema $$153 = $$0.addSchema(2841, c);
      $$0.addFixer(new bdk($$153));
      Schema $$154 = $$0.addSchema(2842, bmz::new);
      $$0.addFixer(new bdl($$154));
      Schema $$155 = $$0.addSchema(2843, c);
      $$0.addFixer(new bip($$155));
      $$0.addFixer(new bhz($$155, "Remove Deep Warm Ocean", bjd.M, a("minecraft:deep_warm_ocean", "minecraft:warm_ocean")));
      Schema $$156 = $$0.addSchema(2846, c);
      $$0.addFixer(
         new bbr(
            $$156,
            false,
            "Rename some C&C part 2 advancements",
            b(
               ImmutableMap.of(
                  "minecraft:husbandry/play_jukebox_in_meadows",
                  "minecraft:adventure/play_jukebox_in_meadows",
                  "minecraft:adventure/caves_and_cliff",
                  "minecraft:adventure/fall_from_world_height",
                  "minecraft:adventure/ride_strider_in_overworld_lava",
                  "minecraft:nether/ride_strider_in_overworld_lava"
               )
            )
         )
      );
      Schema $$157 = $$0.addSchema(2852, c);
      $$0.addFixer(new bkr($$157));
      Schema $$158 = $$0.addSchema(2967, c);
      $$0.addFixer(new bjx($$158));
      Schema $$159 = $$0.addSchema(2970, c);
      $$0.addFixer(new bjy($$159));
      Schema $$160 = $$0.addSchema(3076, bna::new);
      $$0.addFixer(new bbp($$160, "Added Sculk Catalyst", bjd.s));
      Schema $$161 = $$0.addSchema(3077, c);
      $$0.addFixer(new bdf($$161));
      Schema $$162 = $$0.addSchema(3078, bnb::new);
      $$0.addFixer(new bbp($$162, "Added Frog", bjd.D));
      $$0.addFixer(new bbp($$162, "Added Tadpole", bjd.D));
      $$0.addFixer(new bbp($$162, "Added Sculk Shrieker", bjd.s));
      Schema $$163 = $$0.addSchema(3081, bnc::new);
      $$0.addFixer(new bbp($$163, "Added Warden", bjd.D));
      Schema $$164 = $$0.addSchema(3082, bnd::new);
      $$0.addFixer(new bbp($$164, "Added Chest Boat", bjd.D));
      Schema $$165 = $$0.addSchema(3083, bne::new);
      $$0.addFixer(new bbp($$165, "Added Allay", bjd.D));
      Schema $$166 = $$0.addSchema(3084, c);
      $$0.addFixer(
         new bhz(
            $$166,
            "game_event_renames_3084",
            bjd.G,
            b(
               ImmutableMap.builder()
                  .put("minecraft:block_press", "minecraft:block_activate")
                  .put("minecraft:block_switch", "minecraft:block_activate")
                  .put("minecraft:block_unpress", "minecraft:block_deactivate")
                  .put("minecraft:block_unswitch", "minecraft:block_deactivate")
                  .put("minecraft:drinking_finish", "minecraft:drink")
                  .put("minecraft:elytra_free_fall", "minecraft:elytra_glide")
                  .put("minecraft:entity_damaged", "minecraft:entity_damage")
                  .put("minecraft:entity_dying", "minecraft:entity_die")
                  .put("minecraft:entity_killed", "minecraft:entity_die")
                  .put("minecraft:mob_interact", "minecraft:entity_interact")
                  .put("minecraft:ravager_roar", "minecraft:entity_roar")
                  .put("minecraft:ring_bell", "minecraft:block_change")
                  .put("minecraft:shulker_close", "minecraft:container_close")
                  .put("minecraft:shulker_open", "minecraft:container_open")
                  .put("minecraft:wolf_shaking", "minecraft:entity_shake")
                  .build()
            )
         )
      );
      Schema $$167 = $$0.addSchema(3086, c);
      $$0.addFixer(new bfm($$167, "Change cat variant type", bjd.D, "minecraft:cat", "CatType", ag.a(new Int2ObjectOpenHashMap(), $$0x -> {
         $$0x.defaultReturnValue("minecraft:tabby");
         $$0x.put(0, "minecraft:tabby");
         $$0x.put(1, "minecraft:black");
         $$0x.put(2, "minecraft:red");
         $$0x.put(3, "minecraft:siamese");
         $$0x.put(4, "minecraft:british");
         $$0x.put(5, "minecraft:calico");
         $$0x.put(6, "minecraft:persian");
         $$0x.put(7, "minecraft:ragdoll");
         $$0x.put(8, "minecraft:white");
         $$0x.put(9, "minecraft:jellie");
         $$0x.put(10, "minecraft:all_black");
      })::get));
      ImmutableMap<String, String> $$168 = ImmutableMap.builder()
         .put("textures/entity/cat/tabby.png", "minecraft:tabby")
         .put("textures/entity/cat/black.png", "minecraft:black")
         .put("textures/entity/cat/red.png", "minecraft:red")
         .put("textures/entity/cat/siamese.png", "minecraft:siamese")
         .put("textures/entity/cat/british_shorthair.png", "minecraft:british")
         .put("textures/entity/cat/calico.png", "minecraft:calico")
         .put("textures/entity/cat/persian.png", "minecraft:persian")
         .put("textures/entity/cat/ragdoll.png", "minecraft:ragdoll")
         .put("textures/entity/cat/white.png", "minecraft:white")
         .put("textures/entity/cat/jellie.png", "minecraft:jellie")
         .put("textures/entity/cat/all_black.png", "minecraft:all_black")
         .build();
      $$0.addFixer(new bdt($$167, "Migrate cat variant advancement", "minecraft:husbandry/complete_catalogue", $$1x -> (String)$$168.getOrDefault($$1x, $$1x)));
      Schema $$169 = $$0.addSchema(3087, c);
      $$0.addFixer(new bfm($$169, "Change frog variant type", bjd.D, "minecraft:frog", "Variant", ag.a(new Int2ObjectOpenHashMap(), $$0x -> {
         $$0x.put(0, "minecraft:temperate");
         $$0x.put(1, "minecraft:warm");
         $$0x.put(2, "minecraft:cold");
      })::get));
      Schema $$170 = $$0.addSchema(3090, c);
      $$0.addFixer(new ben($$170, "EntityPaintingFieldsRenameFix", "minecraft:painting", Map.of("Motive", "variant", "Facing", "facing")));
      Schema $$171 = $$0.addSchema(3093, c);
      $$0.addFixer(new beo($$171));
      Schema $$172 = $$0.addSchema(3094, c);
      $$0.addFixer(new bgd($$172));
      Schema $$173 = $$0.addSchema(3097, c);
      $$0.addFixer(new bfu($$173));
      $$0.addFixer(new bfv($$173));
      Map<String, String> $$174 = Map.of("minecraft:british", "minecraft:british_shorthair");
      $$0.addFixer(new bkj($$173, "Rename british shorthair", bjd.D, "minecraft:cat", $$174));
      $$0.addFixer(
         new bdt(
            $$173, "Migrate cat variant advancement for british shorthair", "minecraft:husbandry/complete_catalogue", $$1x -> $$174.getOrDefault($$1x, $$1x)
         )
      );
      $$0.addFixer(new biu($$173, "Remove unpopulated villager PoI types", Set.of("minecraft:unemployed", "minecraft:nitwit")::contains));
      Schema $$175 = $$0.addSchema(3108, c);
      $$0.addFixer(new bcf($$175));
      Schema $$176 = $$0.addSchema(3201, c);
      $$0.addFixer(new bin($$176));
      Schema $$177 = $$0.addSchema(3202, bnf::new);
      $$0.addFixer(new bbp($$177, "Added Hanging Sign", bjd.s));
      Schema $$178 = $$0.addSchema(3203, bng::new);
      $$0.addFixer(new bbp($$178, "Added Camel", bjd.D));
      Schema $$179 = $$0.addSchema(3204, bnh::new);
      $$0.addFixer(new bbp($$179, "Added Chiseled Bookshelf", bjd.s));
      Schema $$180 = $$0.addSchema(3209, c);
      $$0.addFixer(new bgy($$180, false, "minecraft:pig_spawn_egg"));
      Schema $$181 = $$0.addSchema(3214, c);
      $$0.addFixer(new bih($$181));
      Schema $$182 = $$0.addSchema(3319, c);
      $$0.addFixer(new bif($$182));
      Schema $$183 = $$0.addSchema(3322, c);
      $$0.addFixer(new bea($$183));
      Schema $$184 = $$0.addSchema(3325, bni::new);
      $$0.addFixer(new bbp($$184, "Added displays", bjd.D));
      Schema $$185 = $$0.addSchema(3326, bnj::new);
      $$0.addFixer(new bbp($$185, "Added Sniffer", bjd.D));
      Schema $$186 = $$0.addSchema(3327, bnk::new);
      $$0.addFixer(new bbp($$186, "Archaeology", bjd.s));
      Schema $$187 = $$0.addSchema(3328, bnl::new);
      $$0.addFixer(new bbp($$187, "Added interaction", bjd.D));
      Schema $$188 = $$0.addSchema(3438, bnm::new);
      $$0.addFixer(bcn.a($$188, "Rename Suspicious Sand to Brushable Block", a("minecraft:suspicious_sand", "minecraft:brushable_block")));
      $$0.addFixer(new beg($$188));
      $$0.addFixer(
         bgr.a(
            $$188,
            "Pottery shard renaming",
            b(
               ImmutableMap.of(
                  "minecraft:pottery_shard_archer",
                  "minecraft:archer_pottery_shard",
                  "minecraft:pottery_shard_prize",
                  "minecraft:prize_pottery_shard",
                  "minecraft:pottery_shard_arms_up",
                  "minecraft:arms_up_pottery_shard",
                  "minecraft:pottery_shard_skull",
                  "minecraft:skull_pottery_shard"
               )
            )
         )
      );
      $$0.addFixer(new bbp($$188, "Added calibrated sculk sensor", bjd.s));
      Schema $$189 = $$0.addSchema(3439, bnn::new);
      $$0.addFixer(new bcp($$189, "Updated sign text format for Signs", "minecraft:sign"));
      $$0.addFixer(new bcp($$189, "Updated sign text format for Hanging Signs", "minecraft:hanging_sign"));
      Schema $$190 = $$0.addSchema(3440, c);
      $$0.addFixer(new bhz($$190, "Replace experimental 1.20 overworld", bjd.N, a("minecraft:overworld_update_1_20", "minecraft:overworld")));
      $$0.addFixer(new bft($$190, "Remove 1.20 feature toggle", Set.of("minecraft:update_1_20")));
      Schema $$191 = $$0.addSchema(3447, c);
      $$0.addFixer(
         bgr.a(
            $$191,
            "Pottery shard item renaming to Pottery sherd",
            b(
               Stream.of(
                     "minecraft:angler_pottery_shard",
                     "minecraft:archer_pottery_shard",
                     "minecraft:arms_up_pottery_shard",
                     "minecraft:blade_pottery_shard",
                     "minecraft:brewer_pottery_shard",
                     "minecraft:burn_pottery_shard",
                     "minecraft:danger_pottery_shard",
                     "minecraft:explorer_pottery_shard",
                     "minecraft:friend_pottery_shard",
                     "minecraft:heart_pottery_shard",
                     "minecraft:heartbreak_pottery_shard",
                     "minecraft:howl_pottery_shard",
                     "minecraft:miner_pottery_shard",
                     "minecraft:mourner_pottery_shard",
                     "minecraft:plenty_pottery_shard",
                     "minecraft:prize_pottery_shard",
                     "minecraft:sheaf_pottery_shard",
                     "minecraft:shelter_pottery_shard",
                     "minecraft:skull_pottery_shard",
                     "minecraft:snort_pottery_shard"
                  )
                  .collect(Collectors.toMap(Function.identity(), $$0x -> $$0x.replace("_pottery_shard", "_pottery_sherd")))
            )
         )
      );
      Schema $$192 = $$0.addSchema(3448, bno::new);
      $$0.addFixer(new bdw($$192));
      Schema $$193 = $$0.addSchema(3450, c);
      $$0.addFixer(
         new bje(
            $$193,
            "Remove liquid_carvers and heightmap chunk statuses",
            b(Map.of("minecraft:liquid_carvers", "minecraft:carvers", "minecraft:heightmaps", "minecraft:spawn"))
         )
      );
      Schema $$194 = $$0.addSchema(3451, c);
      $$0.addFixer(new bdg($$194));
      Schema $$195 = $$0.addSchema(3459, c);
      $$0.addFixer(new bhi($$195));
      Schema $$196 = $$0.addSchema(3564, c);
      $$0.addFixer(new bdy($$196, "minecraft:sign"));
      $$0.addFixer(new bdy($$196, "minecraft:hanging_sign"));
      Schema $$197 = $$0.addSchema(3565, c);
      $$0.addFixer(new biz($$197));
      Schema $$198 = $$0.addSchema(3566, c);
      $$0.addFixer(new bjp($$198));
      Schema $$199 = $$0.addSchema(3568, c);
      $$0.addFixer(new bhu($$199));
      Schema $$200 = $$0.addSchema(3682, bnp::new);
      $$0.addFixer(new bbp($$200, "Added Crafter", bjd.s));
      Schema $$201 = $$0.addSchema(3683, bnq::new);
      $$0.addFixer(new biw($$201));
      Schema $$202 = $$0.addSchema(3685, bnr::new);
      $$0.addFixer(new bfx($$202));
      Schema $$203 = $$0.addSchema(3689, bns::new);
      $$0.addFixer(new bbp($$203, "Added Breeze", bjd.D));
      $$0.addFixer(new bbp($$203, "Added Trial Spawner", bjd.s));
      Schema $$204 = $$0.addSchema(3692, c);
      UnaryOperator<String> $$205 = b(Map.of("minecraft:grass", "minecraft:short_grass"));
      $$0.addFixer(bcu.a($$204, "Rename grass block to short_grass", $$205));
      $$0.addFixer(bgr.a($$204, "Rename grass item to short_grass", $$205));
      Schema $$206 = $$0.addSchema(3799, bnt::new);
      $$0.addFixer(new bbp($$206, "Added Armadillo", bjd.D));
      Schema $$207 = $$0.addSchema(3800, c);
      UnaryOperator<String> $$208 = b(Map.of("minecraft:scute", "minecraft:turtle_scute"));
      $$0.addFixer(bgr.a($$207, "Rename scute item to turtle_scute", $$208));
      Schema $$209 = $$0.addSchema(3803, c);
      $$0.addFixer(new bjh($$209, "Rename sweeping enchant to sweeping_edge", Map.of("minecraft:sweeping", "minecraft:sweeping_edge")));
      Schema $$210 = $$0.addSchema(3807, bnu::new);
      $$0.addFixer(new bbp($$210, "Added Vault", bjd.s));
      Schema $$211 = $$0.addSchema(3807, 1, c);
      $$0.addFixer(new bhq($$211));
      Schema $$212 = $$0.addSchema(3808, bnv::new);
      $$0.addFixer(new bgg($$212, "minecraft:horse", "ArmorItem", true));
      Schema $$213 = $$0.addSchema(3808, 1, bnw::new);
      $$0.addFixer(new bgg($$213, "minecraft:llama", "DecorItem", false));
      Schema $$214 = $$0.addSchema(3808, 2, bnx::new);
      $$0.addFixer(new bgg($$214, "minecraft:trader_llama", "DecorItem", false));
      Schema $$215 = $$0.addSchema(3809, c);
      $$0.addFixer(new bdc($$215));
      Schema $$216 = $$0.addSchema(3812, c);
      $$0.addFixer(new bfy($$216));
      Schema $$217 = $$0.addSchema(3813, bny::new);
      $$0.addFixer(new bcs($$217));
      Schema $$218 = $$0.addSchema(3814, c);
      $$0.addFixer(new bbx($$218, "Rename jump strength attribute", a("minecraft:horse.jump_strength", "minecraft:generic.jump_strength")));
      Schema $$219 = $$0.addSchema(3816, bnz::new);
      $$0.addFixer(new bbp($$219, "Added Bogged", bjd.D));
      Schema $$220 = $$0.addSchema(3818, boa::new);
      $$0.addFixer(new bcb($$220));
      $$0.addFixer(new beb($$220));
      Schema $$221 = $$0.addSchema(3818, 1, c);
      $$0.addFixer(new bbz($$221));
      Schema $$222 = $$0.addSchema(3818, 2, c);
      $$0.addFixer(new bkd($$222));
      Schema $$223 = $$0.addSchema(3818, 3, bob::new);
      $$0.addFixer(new bku($$223, "Inject data component types", bjd.w));
      Schema $$224 = $$0.addSchema(3818, 4, boc::new);
      $$0.addFixer(new biq($$224));
      Schema $$225 = $$0.addSchema(3818, 5, bod::new);
      $$0.addFixer(new bgu($$225));
      Schema $$226 = $$0.addSchema(3818, 6, c);
      $$0.addFixer(new bbt($$226));
      Schema $$227 = $$0.addSchema(3820, c);
      $$0.addFixer(new bis($$227));
      $$0.addFixer(new bhp($$227));
      Schema $$228 = $$0.addSchema(3825, boe::new);
      $$0.addFixer(new bgv($$228));
      $$0.addFixer(new bby($$228));
      $$0.addFixer(new bkg($$228));
      $$0.addFixer(new bbp($$228, "Added Ominous Item Spawner", bjd.D));
      Schema $$229 = $$0.addSchema(3828, c);
      $$0.addFixer(new bec($$229));
      Schema $$230 = $$0.addSchema(3833, c);
      $$0.addFixer(new bjf($$230));
      Schema $$231 = $$0.addSchema(3938, bof::new);
      $$0.addFixer(new bix($$231));
      Schema $$232 = $$0.addSchema(3939, c);
      $$0.addFixer(new bft($$232, "Remove 1.21 feature toggle", Set.of("minecraft:update_1_21")));
      Schema $$233 = $$0.addSchema(3943, c);
      $$0.addFixer(new bim($$233));
      Schema $$234 = $$0.addSchema(3945, c);
      $$0.addFixer(new bbv($$234));
      $$0.addFixer(new bhg($$234));
      Schema $$235 = $$0.addSchema(4054, c);
      $$0.addFixer(new bid($$235));
      Schema $$236 = $$0.addSchema(4055, c);
      $$0.addFixer(new bbu($$236));
      Schema $$237 = $$0.addSchema(4057, c);
      $$0.addFixer(new bcy($$237));
      Schema $$238 = $$0.addSchema(4059, bog::new);
      $$0.addFixer(new bfz($$238));
      Schema $$239 = $$0.addSchema(4061, c);
      $$0.addFixer(new bkh($$239));
      Schema $$240 = $$0.addSchema(4064, c);
      $$0.addFixer(new bfw($$240));
      Schema $$241 = $$0.addSchema(4067, boh::new);
      $$0.addFixer(new bcx($$241));
      $$0.addFixer(new bft($$241, "Remove Bundle experimental feature flag", Set.of("minecraft:bundle")));
      Schema $$242 = $$0.addSchema(4068, c);
      $$0.addFixer(new bho($$242));
      $$0.addFixer(new bds($$242));
      Schema $$243 = $$0.addSchema(4070, boi::new);
      $$0.addFixer(new bbp($$243, "Added Pale Oak Boat and Pale Oak Chest Boat", bjd.D));
      Schema $$244 = $$0.addSchema(4071, boj::new);
      $$0.addFixer(new bbp($$244, "Added Creaking", bjd.D));
      $$0.addFixer(new bbp($$244, "Added Creaking Heart", bjd.s));
      Schema $$245 = $$0.addSchema(4081, c);
      $$0.addFixer(new bfd($$245));
      Schema $$246 = $$0.addSchema(4173, c);
      $$0.addFixer(new ben($$246, "Rename TNT Minecart fuse", "minecraft:tnt_minecart", Map.of("TNTFuse", "fuse")));
      Schema $$247 = $$0.addSchema(4175, c);
      $$0.addFixer(new bfs($$247));
      $$0.addFixer(new bdu($$247));
      Schema $$248 = $$0.addSchema(4176, c);
      $$0.addFixer(new bgj($$248));
      $$0.addFixer(new bgk($$248));
      Schema $$249 = $$0.addSchema(4180, c);
      $$0.addFixer(new bft($$249, "Remove Winter Drop toggle", Set.of("minecraft:winter_drop")));
      Schema $$250 = $$0.addSchema(4181, c);
      $$0.addFixer(new bcj($$250, "minecraft:furnace"));
      $$0.addFixer(new bcj($$250, "minecraft:smoker"));
      $$0.addFixer(new bcj($$250, "minecraft:blast_furnace"));
      Schema $$251 = $$0.addSchema(4187, c);
      $$0.addFixer(new bee($$251, "Villager follow range fix undo", "minecraft:villager", "minecraft:follow_range", $$0x -> $$0x == 48.0 ? 16.0 : $$0x));
      $$0.addFixer(new bee($$251, "Bee follow range fix", "minecraft:bee", "minecraft:follow_range", $$0x -> $$0x == 48.0 ? 16.0 : $$0x));
      $$0.addFixer(new bee($$251, "Allay follow range fix", "minecraft:allay", "minecraft:follow_range", $$0x -> $$0x == 48.0 ? 16.0 : $$0x));
      $$0.addFixer(new bee($$251, "Llama follow range fix", "minecraft:llama", "minecraft:follow_range", $$0x -> $$0x == 40.0 ? 16.0 : $$0x));
      $$0.addFixer(new bee($$251, "Piglin Brute follow range fix", "minecraft:piglin_brute", "minecraft:follow_range", $$0x -> $$0x == 16.0 ? 12.0 : $$0x));
      $$0.addFixer(new bee($$251, "Warden follow range fix", "minecraft:warden", "minecraft:follow_range", $$0x -> $$0x == 16.0 ? 24.0 : $$0x));
      Schema $$252 = $$0.addSchema(4290, bok::new);
      $$0.addFixer(new bki($$252));
      Schema $$253 = $$0.addSchema(4291, c);
      $$0.addFixer(new bhj($$253));
      $$0.addFixer(new bkb($$253));
      Schema $$254 = $$0.addSchema(4292, bol::new);
      $$0.addFixer(new bjz($$254));
      Schema $$255 = $$0.addSchema(4293, c);
      $$0.addFixer(new bdx($$255));
      Schema $$256 = $$0.addSchema(4294, c);
      $$0.addFixer(
         new bct(
            $$256,
            "CreakingHeartBlockStateFix",
            "minecraft:creaking_heart",
            "active",
            "creaking_heart_state",
            $$0x -> $$0x.equals("true") ? "awake" : "uprooted"
         )
      );
      Schema $$257 = $$0.addSchema(4295, c);
      $$0.addFixer(new bce($$257));
      Schema $$258 = $$0.addSchema(4296, c);
      $$0.addFixer(new bbs($$258));
      Schema $$259 = $$0.addSchema(4297, c);
      $$0.addFixer(new bgb($$259));
      Schema $$260 = $$0.addSchema(4299, c);
      $$0.addFixer(new bfh($$260));
      Schema $$261 = $$0.addSchema(4300, bom::new);
      $$0.addFixer(new bjl($$261));
      Schema $$262 = $$0.addSchema(4301, bon::new);
      $$0.addFixer(new bfr($$262));
      Schema $$263 = $$0.addSchema(4302, boo::new);
      $$0.addFixer(new bbp($$263, "Added Test and Test Instance Block Entities", bjd.s));
      Schema $$264 = $$0.addSchema(4303, c);
      $$0.addFixer(new bem($$264, bjd.D));
      $$0.addFixer(new bem($$264, bjd.b));
      Schema $$265 = $$0.addSchema(4305, c);
      $$0.addFixer(new bct($$265, "rename test block mode", "minecraft:test_block", "test_block_mode", "mode", $$0x -> $$0x));
      Schema $$266 = $$0.addSchema(4306, bop::new);
      $$0.addFixer(new bkc($$266));
      Schema $$267 = $$0.addSchema(4307, boq::new);
      $$0.addFixer(new bke($$267));
      Schema $$268 = $$0.addSchema(4309, c);
      $$0.addFixer(new biy($$268));
      $$0.addFixer(new bdp($$268));
      Schema $$269 = $$0.addSchema(4311, c);
      $$0.addFixer(new bbr($$269, false, "Use lodestone category change", a("minecraft:nether/use_lodestone", "minecraft:adventure/use_lodestone")));
      Schema $$270 = $$0.addSchema(4312, bor::new);
      $$0.addFixer(new bir($$270));
      Schema $$271 = $$0.addSchema(4314, c);
      $$0.addFixer(new bgi($$271));
   }

   private static UnaryOperator<String> a(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault($$1, $$1);
   }

   private static UnaryOperator<String> b(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault(bky.a($$1), $$1);
   }

   private static UnaryOperator<String> a(String $$0, String $$1) {
      return $$2 -> Objects.equals(bky.a($$2), $$0) ? $$1 : $$2;
   }
}
