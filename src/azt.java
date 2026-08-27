import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class azt {
   private static final BiFunction<Integer, Schema, Schema> b = Schema::new;
   private static final BiFunction<Integer, Schema, Schema> c = bhp::new;
   private static final DataFixer d = a(ab.aY);
   public static final int a = 3441;

   private azt() {
   }

   public static DataFixer a() {
      return d;
   }

   private static synchronized DataFixer a(Set<TypeReference> $$0) {
      DataFixerBuilder $$1 = new DataFixerBuilder(ab.b().d().c());
      a($$1);
      if ($$0.isEmpty()) {
         return $$1.buildUnoptimized();
      } else {
         Executor $$2 = Executors.newSingleThreadExecutor(
            new ThreadFactoryBuilder().setNameFormat("Datafixer Bootstrap").setDaemon(true).setPriority(1).build()
         );
         return $$1.buildOptimized($$0, $$2);
      }
   }

   private static void a(DataFixerBuilder $$0) {
      $$0.addSchema(99, bkw::new);
      Schema $$1 = $$0.addSchema(100, bhq::new);
      $$0.addFixer(new bci($$1, true));
      Schema $$2 = $$0.addSchema(101, b);
      $$0.addFixer(new baw($$2, false));
      Schema $$3 = $$0.addSchema(102, bhr::new);
      $$0.addFixer(new bdy($$3, true));
      $$0.addFixer(new bea($$3, false));
      Schema $$4 = $$0.addSchema(105, b);
      $$0.addFixer(new bee($$4, true));
      Schema $$5 = $$0.addSchema(106, bht::new);
      $$0.addFixer(new bfd($$5, true));
      Schema $$6 = $$0.addSchema(107, bhu::new);
      $$0.addFixer(new bcp($$6, true));
      Schema $$7 = $$0.addSchema(108, b);
      $$0.addFixer(new bdc($$7, true));
      Schema $$8 = $$0.addSchema(109, b);
      $$0.addFixer(new bck($$8, true));
      Schema $$9 = $$0.addSchema(110, b);
      $$0.addFixer(new bcl($$9, true));
      Schema $$10 = $$0.addSchema(111, b);
      $$0.addFixer(new bcr($$10, true));
      Schema $$11 = $$0.addSchema(113, b);
      $$0.addFixer(new bcw($$11, true));
      Schema $$12 = $$0.addSchema(135, bhw::new);
      $$0.addFixer(new bcy($$12, true));
      Schema $$13 = $$0.addSchema(143, bhx::new);
      $$0.addFixer(new bde($$13, true));
      Schema $$14 = $$0.addSchema(147, b);
      $$0.addFixer(new bcb($$14, true));
      Schema $$15 = $$0.addSchema(165, b);
      $$0.addFixer(new beo($$15, true));
      Schema $$16 = $$0.addSchema(501, bko::new);
      $$0.addFixer(new bab($$16, "Add 1.10 entities fix", bgf.z));
      Schema $$17 = $$0.addSchema(502, b);
      $$0.addFixer(bec.a($$17, "cooked_fished item renamer", $$0x -> Objects.equals(bhp.a($$0x), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : $$0x));
      $$0.addFixer(new bdj($$17, false));
      Schema $$18 = $$0.addSchema(505, b);
      $$0.addFixer(new bfp($$18, false));
      Schema $$19 = $$0.addSchema(700, bkp::new);
      $$0.addFixer(new bch($$19, true));
      Schema $$20 = $$0.addSchema(701, bkq::new);
      $$0.addFixer(new bdb($$20, true));
      Schema $$21 = $$0.addSchema(702, bkr::new);
      $$0.addFixer(new bdi($$21, true));
      Schema $$22 = $$0.addSchema(703, bks::new);
      $$0.addFixer(new bcm($$22, true));
      Schema $$23 = $$0.addSchema(704, bkt::new);
      $$0.addFixer(new baq($$23, true));
      Schema $$24 = $$0.addSchema(705, bku::new);
      $$0.addFixer(new bcn($$24, true));
      Schema $$25 = $$0.addSchema(804, c);
      $$0.addFixer(new bdw($$25, true));
      Schema $$26 = $$0.addSchema(806, c);
      $$0.addFixer(new ben($$26, false));
      Schema $$27 = $$0.addSchema(808, bkv::new);
      $$0.addFixer(new bab($$27, "added shulker box", bgf.s));
      Schema $$28 = $$0.addSchema(808, 1, c);
      $$0.addFixer(new bcz($$28, false));
      Schema $$29 = $$0.addSchema(813, c);
      $$0.addFixer(new bed($$29, false));
      $$0.addFixer(new bau($$29, false));
      Schema $$30 = $$0.addSchema(816, c);
      $$0.addFixer(new bfs($$30, false));
      Schema $$31 = $$0.addSchema(820, c);
      $$0.addFixer(bec.a($$31, "totem item renamer", a("minecraft:totem", "minecraft:totem_of_undying")));
      Schema $$32 = $$0.addSchema(1022, bhs::new);
      $$0.addFixer(new bhl($$32, "added shoulder entities to players", bgf.b));
      Schema $$33 = $$0.addSchema(1125, bhv::new);
      $$0.addFixer(new bbh($$33, true));
      $$0.addFixer(new bah($$33, false));
      Schema $$34 = $$0.addSchema(1344, c);
      $$0.addFixer(new bfq($$34, false));
      Schema $$35 = $$0.addSchema(1446, c);
      $$0.addFixer(new bfr($$35, false));
      Schema $$36 = $$0.addSchema(1450, c);
      $$0.addFixer(new bbc($$36, false));
      Schema $$37 = $$0.addSchema(1451, bhy::new);
      $$0.addFixer(new bab($$37, "AddTrappedChestFix", bgf.s));
      Schema $$38 = $$0.addSchema(1451, 1, bhz::new);
      $$0.addFixer(new bbn($$38, true));
      Schema $$39 = $$0.addSchema(1451, 2, bia::new);
      $$0.addFixer(new bao($$39, true));
      Schema $$40 = $$0.addSchema(1451, 3, bib::new);
      $$0.addFixer(new bcc($$40, true));
      $$0.addFixer(new bei($$40, false));
      Schema $$41 = $$0.addSchema(1451, 4, bic::new);
      $$0.addFixer(new bay($$41, true));
      $$0.addFixer(new bel($$41, false));
      Schema $$42 = $$0.addSchema(1451, 5, bid::new);
      $$0.addFixer(
         new beb(
            $$42,
            false,
            Set.of(
               "minecraft:note_block",
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
      $$0.addFixer(new bab($$42, "RemoveNoteBlockFlowerPotFix", bgf.s));
      $$0.addFixer(new bej($$42, false, "minecraft:spawn_egg"));
      $$0.addFixer(new bdh($$42, false));
      $$0.addFixer(new ban($$42, false));
      $$0.addFixer(new beu($$42, false));
      Schema $$43 = $$0.addSchema(1451, 6, bie::new);
      $$0.addFixer(new bgs($$43, true));
      $$0.addFixer(new bar($$43, false));
      Schema $$44 = $$0.addSchema(1451, 7, c);
      $$0.addFixer(new bhf($$44, false));
      Schema $$45 = $$0.addSchema(1456, c);
      $$0.addFixer(new bco($$45, false));
      Schema $$46 = $$0.addSchema(1458, c);
      $$0.addFixer(new bcg($$46, false));
      $$0.addFixer(new bdx($$46, false));
      $$0.addFixer(new bap($$46, false));
      Schema $$47 = $$0.addSchema(1460, bif::new);
      $$0.addFixer(new bcs($$47, false));
      Schema $$48 = $$0.addSchema(1466, big::new);
      $$0.addFixer(new bab($$48, "Add DUMMY block entity", bgf.s));
      $$0.addFixer(new bbt($$48, true));
      Schema $$49 = $$0.addSchema(1470, bih::new);
      $$0.addFixer(new bab($$49, "Add 1.13 entities fix", bgf.z));
      Schema $$50 = $$0.addSchema(1474, c);
      $$0.addFixer(new bbu($$50, false));
      $$0.addFixer(
         bba.a($$50, "Colorless shulker block fixer", $$0x -> Objects.equals(bhp.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      $$0.addFixer(
         bec.a($$50, "Colorless shulker item fixer", $$0x -> Objects.equals(bhp.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      Schema $$51 = $$0.addSchema(1475, c);
      $$0.addFixer(bba.a($$51, "Flowing fixer", b(ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava"))));
      Schema $$52 = $$0.addSchema(1480, c);
      $$0.addFixer(bba.a($$52, "Rename coral blocks", b(bgk.a)));
      $$0.addFixer(bec.a($$52, "Rename coral items", b(bgk.a)));
      Schema $$53 = $$0.addSchema(1481, bii::new);
      $$0.addFixer(new bab($$53, "Add conduit", bgf.s));
      Schema $$54 = $$0.addSchema(1483, bij::new);
      $$0.addFixer(new bcu($$54, true));
      $$0.addFixer(bec.a($$54, "Rename pufferfish egg item", b(bcu.a)));
      Schema $$55 = $$0.addSchema(1484, c);
      $$0.addFixer(
         bec.a(
            $$55,
            "Rename seagrass items",
            b(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(
         bba.a(
            $$55,
            "Rename seagrass blocks",
            b(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(new bdt($$55, false));
      Schema $$56 = $$0.addSchema(1486, bik::new);
      $$0.addFixer(new bcf($$56, true));
      $$0.addFixer(bec.a($$56, "Rename cod/salmon egg items", b(bcf.b)));
      Schema $$57 = $$0.addSchema(1487, c);
      $$0.addFixer(
         bec.a(
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
         bba.a(
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
      Schema $$58 = $$0.addSchema(1488, c);
      $$0.addFixer(bba.a($$58, "Rename kelp/kelptop", b(ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant"))));
      $$0.addFixer(bec.a($$58, "Rename kelptop", a("minecraft:kelp_top", "minecraft:kelp")));
      $$0.addFixer(new bfe($$58, false, "Command block block entity custom name fix", bgf.s, "minecraft:command_block") {
         @Override
         protected Typed<?> a(Typed<?> $$0) {
            return $$0.update(DSL.remainderFinder(), bcg::a);
         }
      });
      $$0.addFixer(new bfe($$58, false, "Command block minecart custom name fix", bgf.z, "minecraft:commandblock_minecart") {
         @Override
         protected Typed<?> a(Typed<?> $$0) {
            return $$0.update(DSL.remainderFinder(), bcg::a);
         }
      });
      $$0.addFixer(new bdv($$58, false));
      Schema $$59 = $$0.addSchema(1490, c);
      $$0.addFixer(bba.a($$59, "Rename melon_block", a("minecraft:melon_block", "minecraft:melon")));
      $$0.addFixer(
         bec.a(
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
      $$0.addFixer(new bbs($$60, false));
      Schema $$61 = $$0.addSchema(1494, c);
      $$0.addFixer(new beh($$61, false));
      Schema $$62 = $$0.addSchema(1496, c);
      $$0.addFixer(new ber($$62, false));
      Schema $$63 = $$0.addSchema(1500, c);
      $$0.addFixer(new bas($$63, false));
      Schema $$64 = $$0.addSchema(1501, c);
      $$0.addFixer(new bac($$64, false));
      Schema $$65 = $$0.addSchema(1502, c);
      $$0.addFixer(new bfg($$65, "Recipes fix", bgf.H, b(bgc.a)));
      Schema $$66 = $$0.addSchema(1506, c);
      $$0.addFixer(new bet($$66, false));
      Schema $$67 = $$0.addSchema(1510, bil::new);
      $$0.addFixer(bba.a($$67, "Block renamening fix", b(bdd.b)));
      $$0.addFixer(bec.a($$67, "Item renamening fix", b(bdd.c)));
      $$0.addFixer(new bfg($$67, "Recipes renamening fix", bgf.H, b(bgd.a)));
      $$0.addFixer(new bdd($$67, true));
      $$0.addFixer(
         new bgt(
            $$67,
            "SwimStatsRenameFix",
            ImmutableMap.of("minecraft:swim_one_cm", "minecraft:walk_on_water_one_cm", "minecraft:dive_one_cm", "minecraft:walk_under_water_one_cm")
         )
      );
      Schema $$68 = $$0.addSchema(1514, c);
      $$0.addFixer(new bfi($$68, false));
      $$0.addFixer(new bgy($$68, false));
      $$0.addFixer(new bfj($$68, false));
      Schema $$69 = $$0.addSchema(1515, c);
      $$0.addFixer(bba.a($$69, "Rename coral fan blocks", b(bgj.a)));
      Schema $$70 = $$0.addSchema(1624, c);
      $$0.addFixer(new bha($$70, false));
      Schema $$71 = $$0.addSchema(1800, bim::new);
      $$0.addFixer(new bab($$71, "Added 1.14 mobs fix", bgf.z));
      $$0.addFixer(bec.a($$71, "Rename dye items", b(bby.a)));
      Schema $$72 = $$0.addSchema(1801, bin::new);
      $$0.addFixer(new bab($$72, "Added Illager Beast", bgf.z));
      Schema $$73 = $$0.addSchema(1802, c);
      $$0.addFixer(
         bba.a(
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
         bec.a(
            $$73,
            "Rename sign item & stone slabs",
            b(ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))
         )
      );
      Schema $$74 = $$0.addSchema(1803, c);
      $$0.addFixer(new bdz($$74, false));
      Schema $$75 = $$0.addSchema(1904, bio::new);
      $$0.addFixer(new bab($$75, "Added Cats", bgf.z));
      $$0.addFixer(new bce($$75, false));
      Schema $$76 = $$0.addSchema(1905, c);
      $$0.addFixer(new bbq($$76, false));
      Schema $$77 = $$0.addSchema(1906, bip::new);
      $$0.addFixer(new bab($$77, "Add POI Blocks", bgf.s));
      Schema $$78 = $$0.addSchema(1909, biq::new);
      $$0.addFixer(new bab($$78, "Add jigsaw", bgf.s));
      Schema $$79 = $$0.addSchema(1911, c);
      $$0.addFixer(new bbr($$79, false));
      Schema $$80 = $$0.addSchema(1914, c);
      $$0.addFixer(new bhh($$80, false));
      Schema $$81 = $$0.addSchema(1917, c);
      $$0.addFixer(new bbd($$81, false));
      Schema $$82 = $$0.addSchema(1918, c);
      $$0.addFixer(new bhc($$82, "minecraft:villager"));
      $$0.addFixer(new bhc($$82, "minecraft:zombie_villager"));
      Schema $$83 = $$0.addSchema(1920, bir::new);
      $$0.addFixer(new bfh($$83, false));
      $$0.addFixer(new bab($$83, "Add campfire", bgf.s));
      Schema $$84 = $$0.addSchema(1925, c);
      $$0.addFixer(new bez($$84, false));
      Schema $$85 = $$0.addSchema(1928, bis::new);
      $$0.addFixer(new bcv($$85, true));
      $$0.addFixer(bec.a($$85, "Rename ravager egg item", b(bcv.a)));
      Schema $$86 = $$0.addSchema(1929, bit::new);
      $$0.addFixer(new bab($$86, "Add Wandering Trader and Trader Llama", bgf.z));
      Schema $$87 = $$0.addSchema(1931, biu::new);
      $$0.addFixer(new bab($$87, "Added Fox", bgf.z));
      Schema $$88 = $$0.addSchema(1936, c);
      $$0.addFixer(new bfn($$88, false));
      Schema $$89 = $$0.addSchema(1946, c);
      $$0.addFixer(new bgl($$89, false));
      Schema $$90 = $$0.addSchema(1948, c);
      $$0.addFixer(new bfl($$90));
      Schema $$91 = $$0.addSchema(1953, c);
      $$0.addFixer(new bfk($$91, false));
      Schema $$92 = $$0.addSchema(1955, c);
      $$0.addFixer(new bhe($$92, false));
      $$0.addFixer(new bhm($$92, false));
      Schema $$93 = $$0.addSchema(1961, c);
      $$0.addFixer(new bbm($$93, false));
      Schema $$94 = $$0.addSchema(1963, c);
      $$0.addFixer(new bgh($$94, false));
      Schema $$95 = $$0.addSchema(2100, biv::new);
      $$0.addFixer(new bab($$95, "Added Bee and Bee Stinger", bgf.z));
      $$0.addFixer(new bab($$95, "Add beehive", bgf.s));
      $$0.addFixer(new bfg($$95, "Rename sugar recipe", bgf.H, a("minecraft:sugar", "minecraft:sugar_from_sugar_cane")));
      $$0.addFixer(new bad($$95, false, "Rename sugar recipe advancement", a("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane")));
      Schema $$96 = $$0.addSchema(2202, c);
      $$0.addFixer(new bbi($$96, false));
      Schema $$97 = $$0.addSchema(2209, c);
      UnaryOperator<String> $$98 = a("minecraft:bee_hive", "minecraft:beehive");
      $$0.addFixer(bec.a($$97, "Rename bee_hive item to beehive", $$98));
      $$0.addFixer(new bfz($$97, "Rename bee_hive poi to beehive", $$98));
      $$0.addFixer(bba.a($$97, "Rename bee_hive block to beehive", $$98));
      Schema $$99 = $$0.addSchema(2211, c);
      $$0.addFixer(new bgv($$99, false));
      Schema $$100 = $$0.addSchema(2218, c);
      $$0.addFixer(new bdp($$100, false));
      Schema $$101 = $$0.addSchema(2501, biw::new);
      $$0.addFixer(new bdq($$101, true));
      Schema $$102 = $$0.addSchema(2502, bix::new);
      $$0.addFixer(new bab($$102, "Added Hoglin", bgf.z));
      Schema $$103 = $$0.addSchema(2503, c);
      $$0.addFixer(new bhg($$103, false));
      $$0.addFixer(new bad($$103, false, "Composter category change", a("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter")));
      Schema $$104 = $$0.addSchema(2505, biy::new);
      $$0.addFixer(new bab($$104, "Added Piglin", bgf.z));
      $$0.addFixer(new bfa($$104, "minecraft:villager"));
      Schema $$105 = $$0.addSchema(2508, c);
      $$0.addFixer(
         bec.a(
            $$105,
            "Renamed fungi items to fungus",
            b(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      $$0.addFixer(
         bba.a(
            $$105,
            "Renamed fungi blocks to fungus",
            b(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      Schema $$106 = $$0.addSchema(2509, biz::new);
      $$0.addFixer(new bdk($$106));
      $$0.addFixer(bec.a($$106, "Rename zombie pigman egg item", b(bdk.a)));
      Schema $$107 = $$0.addSchema(2511, c);
      $$0.addFixer(new bct($$107));
      Schema $$108 = $$0.addSchema(2514, c);
      $$0.addFixer(new bdf($$108));
      $$0.addFixer(new bax($$108));
      $$0.addFixer(new bfx($$108));
      $$0.addFixer(new bew($$108));
      $$0.addFixer(new bgn($$108));
      $$0.addFixer(new bem($$108));
      Schema $$109 = $$0.addSchema(2516, c);
      $$0.addFixer(new bds($$109, "minecraft:villager"));
      $$0.addFixer(new bds($$109, "minecraft:zombie_villager"));
      Schema $$110 = $$0.addSchema(2518, c);
      $$0.addFixer(new bep($$110, false));
      $$0.addFixer(new beq($$110, false));
      Schema $$111 = $$0.addSchema(2519, bja::new);
      $$0.addFixer(new bab($$111, "Added Strider", bgf.z));
      Schema $$112 = $$0.addSchema(2522, bjb::new);
      $$0.addFixer(new bab($$112, "Added Zoglin", bgf.z));
      Schema $$113 = $$0.addSchema(2523, c);
      $$0.addFixer(
         new baf(
            $$113,
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
      Schema $$114 = $$0.addSchema(2527, c);
      $$0.addFixer(new bak($$114));
      Schema $$115 = $$0.addSchema(2528, c);
      $$0.addFixer(
         bec.a(
            $$115,
            "Rename soul fire torch and soul fire lantern",
            b(ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))
         )
      );
      $$0.addFixer(
         bba.a(
            $$115,
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
      Schema $$116 = $$0.addSchema(2529, c);
      $$0.addFixer(new bgu($$116, false));
      Schema $$117 = $$0.addSchema(2531, c);
      $$0.addFixer(new bge($$117));
      Schema $$118 = $$0.addSchema(2533, c);
      $$0.addFixer(new bhd($$118));
      Schema $$119 = $$0.addSchema(2535, c);
      $$0.addFixer(new bda($$119));
      Schema $$120 = $$0.addSchema(2538, c);
      $$0.addFixer(new bev($$120));
      Schema $$121 = $$0.addSchema(2550, c);
      $$0.addFixer(new bhj($$121));
      Schema $$122 = $$0.addSchema(2551, bjc::new);
      $$0.addFixer(new bhl($$122, "add types to WorldGenData", bgf.K));
      Schema $$123 = $$0.addSchema(2552, c);
      $$0.addFixer(new bfg($$123, "Nether biome rename", bgf.I, a("minecraft:nether", "minecraft:nether_wastes")));
      Schema $$124 = $$0.addSchema(2553, c);
      $$0.addFixer(new bfg($$124, "Biomes fix", bgf.I, b(baj.a)));
      Schema $$125 = $$0.addSchema(2558, c);
      $$0.addFixer(new bfb($$125, false));
      $$0.addFixer(new bfu($$125, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
      Schema $$126 = $$0.addSchema(2568, bjd::new);
      $$0.addFixer(new bab($$126, "Added Piglin Brute", bgf.z));
      Schema $$127 = $$0.addSchema(2571, bje::new);
      $$0.addFixer(new bab($$127, "Added Goat", bgf.z));
      Schema $$128 = $$0.addSchema(2679, c);
      $$0.addFixer(new bbe($$128, false));
      Schema $$129 = $$0.addSchema(2680, c);
      $$0.addFixer(bec.a($$129, "Renamed grass path item to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      $$0.addFixer(bba.a($$129, "Renamed grass path block to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      Schema $$130 = $$0.addSchema(2684, bjf::new);
      $$0.addFixer(new bab($$130, "Added Sculk Sensor", bgf.s));
      Schema $$131 = $$0.addSchema(2686, bjg::new);
      $$0.addFixer(new bab($$131, "Added Axolotl", bgf.z));
      Schema $$132 = $$0.addSchema(2688, bjh::new);
      $$0.addFixer(new bab($$132, "Added Glow Squid", bgf.z));
      $$0.addFixer(new bab($$132, "Added Glow Item Frame", bgf.z));
      Schema $$133 = $$0.addSchema(2690, c);
      ImmutableMap<String, String> $$134 = ImmutableMap.builder()
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
      $$0.addFixer(bec.a($$133, "Renamed copper block items to new oxidized terms", b($$134)));
      $$0.addFixer(bba.a($$133, "Renamed copper blocks to new oxidized terms", b($$134)));
      Schema $$135 = $$0.addSchema(2691, c);
      ImmutableMap<String, String> $$136 = ImmutableMap.builder()
         .put("minecraft:waxed_copper", "minecraft:waxed_copper_block")
         .put("minecraft:oxidized_copper_block", "minecraft:oxidized_copper")
         .put("minecraft:weathered_copper_block", "minecraft:weathered_copper")
         .put("minecraft:exposed_copper_block", "minecraft:exposed_copper")
         .build();
      $$0.addFixer(bec.a($$135, "Rename copper item suffixes", b($$136)));
      $$0.addFixer(bba.a($$135, "Rename copper blocks suffixes", b($$136)));
      Schema $$137 = $$0.addSchema(2693, c);
      $$0.addFixer(new baa($$137, bgf.K, "has_increased_height_already", false));
      Schema $$138 = $$0.addSchema(2696, c);
      ImmutableMap<String, String> $$139 = ImmutableMap.builder()
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
      $$0.addFixer(bec.a($$138, "Renamed grimstone block items to deepslate", b($$139)));
      $$0.addFixer(bba.a($$138, "Renamed grimstone blocks to deepslate", b($$139)));
      Schema $$140 = $$0.addSchema(2700, c);
      $$0.addFixer(
         bba.a(
            $$140,
            "Renamed cave vines blocks",
            b(ImmutableMap.of("minecraft:cave_vines_head", "minecraft:cave_vines", "minecraft:cave_vines_body", "minecraft:cave_vines_plant"))
         )
      );
      Schema $$141 = $$0.addSchema(2701, c);
      $$0.addFixer(new bgm($$141));
      Schema $$142 = $$0.addSchema(2702, c);
      $$0.addFixer(new azx($$142));
      Schema $$143 = $$0.addSchema(2704, bji::new);
      $$0.addFixer(new bab($$143, "Added Goat", bgf.z));
      Schema $$144 = $$0.addSchema(2707, bjj::new);
      $$0.addFixer(new bab($$144, "Added Marker", bgf.z));
      $$0.addFixer(new baa($$144, bgf.K, "has_increased_height_already", true));
      Schema $$145 = $$0.addSchema(2710, c);
      $$0.addFixer(new bgt($$145, "Renamed play_one_minute stat to play_time", ImmutableMap.of("minecraft:play_one_minute", "minecraft:play_time")));
      Schema $$146 = $$0.addSchema(2717, c);
      $$0.addFixer(bec.a($$146, "Rename azalea_leaves_flowers", b(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves"))));
      $$0.addFixer(
         bba.a($$146, "Rename azalea_leaves_flowers items", b(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves")))
      );
      Schema $$147 = $$0.addSchema(2825, c);
      $$0.addFixer(new baa($$147, bgf.K, "has_increased_height_already", false));
      Schema $$148 = $$0.addSchema(2831, bjk::new);
      $$0.addFixer(new bgr($$148));
      Schema $$149 = $$0.addSchema(2832, bjl::new);
      $$0.addFixer(new bhk($$149));
      $$0.addFixer(new bbl($$149));
      Schema $$150 = $$0.addSchema(2833, c);
      $$0.addFixer(new bhi($$150));
      Schema $$151 = $$0.addSchema(2838, c);
      $$0.addFixer(new bfg($$151, "Caves and Cliffs biome renames", bgf.I, b(bbf.a)));
      Schema $$152 = $$0.addSchema(2841, c);
      $$0.addFixer(new bbo($$152));
      Schema $$153 = $$0.addSchema(2842, bjm::new);
      $$0.addFixer(new bbp($$153));
      Schema $$154 = $$0.addSchema(2843, c);
      $$0.addFixer(new bfv($$154));
      $$0.addFixer(new bfg($$154, "Remove Deep Warm Ocean", bgf.I, a("minecraft:deep_warm_ocean", "minecraft:warm_ocean")));
      Schema $$155 = $$0.addSchema(2846, c);
      $$0.addFixer(
         new bad(
            $$155,
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
      Schema $$156 = $$0.addSchema(2852, c);
      $$0.addFixer(new bhi($$156));
      Schema $$157 = $$0.addSchema(2967, c);
      $$0.addFixer(new bgw($$157));
      Schema $$158 = $$0.addSchema(2970, c);
      $$0.addFixer(new bgx($$158));
      Schema $$159 = $$0.addSchema(3076, bjn::new);
      $$0.addFixer(new bab($$159, "Added Sculk Catalyst", bgf.s));
      Schema $$160 = $$0.addSchema(3077, c);
      $$0.addFixer(new bbj($$160));
      Schema $$161 = $$0.addSchema(3078, bjo::new);
      $$0.addFixer(new bab($$161, "Added Frog", bgf.z));
      $$0.addFixer(new bab($$161, "Added Tadpole", bgf.z));
      $$0.addFixer(new bab($$161, "Added Sculk Shrieker", bgf.s));
      Schema $$162 = $$0.addSchema(3081, bjp::new);
      $$0.addFixer(new bab($$162, "Added Warden", bgf.z));
      Schema $$163 = $$0.addSchema(3082, bjq::new);
      $$0.addFixer(new bab($$163, "Added Chest Boat", bgf.z));
      Schema $$164 = $$0.addSchema(3083, bjr::new);
      $$0.addFixer(new bab($$164, "Added Allay", bgf.z));
      Schema $$165 = $$0.addSchema(3084, c);
      $$0.addFixer(
         new bfg(
            $$165,
            "game_event_renames_3084",
            bgf.C,
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
      Schema $$166 = $$0.addSchema(3086, c);
      $$0.addFixer(new bdg($$166, "Change cat variant type", bgf.z, "minecraft:cat", "CatType", ad.a(new Int2ObjectOpenHashMap(), $$0x -> {
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
      ImmutableMap<String, String> $$167 = ImmutableMap.builder()
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
      $$0.addFixer(new bbv($$166, "Migrate cat variant advancement", "minecraft:husbandry/complete_catalogue", $$1x -> (String)$$167.getOrDefault($$1x, $$1x)));
      Schema $$168 = $$0.addSchema(3087, c);
      $$0.addFixer(new bdg($$168, "Change frog variant type", bgf.z, "minecraft:frog", "Variant", ad.a(new Int2ObjectOpenHashMap(), $$0x -> {
         $$0x.put(0, "minecraft:temperate");
         $$0x.put(1, "minecraft:warm");
         $$0x.put(2, "minecraft:cold");
      })::get));
      Schema $$169 = $$0.addSchema(3090, c);
      $$0.addFixer(new bcq($$169));
      Schema $$170 = $$0.addSchema(3093, c);
      $$0.addFixer(new bcj($$170));
      Schema $$171 = $$0.addSchema(3094, c);
      $$0.addFixer(new bdr($$171));
      Schema $$172 = $$0.addSchema(3097, c);
      $$0.addFixer(new bdm($$172));
      $$0.addFixer(new bdn($$172));
      Map<String, String> $$173 = Map.of("minecraft:british", "minecraft:british_shorthair");
      $$0.addFixer(new bhb($$172, "Rename british shorthair", bgf.z, "minecraft:cat", $$173));
      $$0.addFixer(
         new bbv(
            $$172, "Migrate cat variant advancement for british shorthair", "minecraft:husbandry/complete_catalogue", $$1x -> $$173.getOrDefault($$1x, $$1x)
         )
      );
      $$0.addFixer(new bfy($$172, "Remove unpopulated villager PoI types", Set.of("minecraft:unemployed", "minecraft:nitwit")::contains));
      Schema $$174 = $$0.addSchema(3108, c);
      $$0.addFixer(new bam($$174));
      Schema $$175 = $$0.addSchema(3201, c);
      $$0.addFixer(new bft($$175));
      Schema $$176 = $$0.addSchema(3202, bjs::new);
      $$0.addFixer(new bab($$176, "Added Hanging Sign", bgf.s));
      Schema $$177 = $$0.addSchema(3203, bjt::new);
      $$0.addFixer(new bab($$177, "Added Camel", bgf.z));
      Schema $$178 = $$0.addSchema(3204, bju::new);
      $$0.addFixer(new bab($$178, "Added Chiseled Bookshelf", bgf.s));
      Schema $$179 = $$0.addSchema(3209, c);
      $$0.addFixer(new bej($$179, false, "minecraft:pig_spawn_egg"));
      Schema $$180 = $$0.addSchema(3214, c);
      $$0.addFixer(new bfo($$180));
      Schema $$181 = $$0.addSchema(3319, c);
      $$0.addFixer(new bfm($$181));
      Schema $$182 = $$0.addSchema(3322, c);
      $$0.addFixer(new bbz($$182));
      Schema $$183 = $$0.addSchema(3325, bjv::new);
      $$0.addFixer(new bab($$183, "Added displays", bgf.z));
      Schema $$184 = $$0.addSchema(3326, bjw::new);
      $$0.addFixer(new bab($$184, "Added Sniffer", bgf.z));
      Schema $$185 = $$0.addSchema(3327, bjx::new);
      $$0.addFixer(new bab($$185, "Archaeology", bgf.s));
      Schema $$186 = $$0.addSchema(3328, bjy::new);
      $$0.addFixer(new bab($$186, "Added interaction", bgf.z));
      Schema $$187 = $$0.addSchema(3438, bjz::new);
      $$0.addFixer(bat.a($$187, "Rename Suspicious Sand to Brushable Block", a("minecraft:suspicious_sand", "minecraft:brushable_block")));
      $$0.addFixer(new bcd($$187));
      $$0.addFixer(
         bec.a(
            $$187,
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
      $$0.addFixer(new bab($$187, "Added calibrated sculk sensor", bgf.s));
      Schema $$188 = $$0.addSchema(3439, c);
      $$0.addFixer(new bav($$188, "Updated sign text format for Signs", "minecraft:sign"));
      $$0.addFixer(new bav($$188, "Updated sign text format for Hanging Signs", "minecraft:hanging_sign"));
      Schema $$189 = $$0.addSchema(3440, c);
      $$0.addFixer(new bfg($$189, "Replace experimental 1.20 overworld", bgf.J, a("minecraft:overworld_update_1_20", "minecraft:overworld")));
      $$0.addFixer(new bdl($$189, "Remove 1.20 feature toggle", Set.of("minecraft:update_1_20")));
      Schema $$190 = $$0.addSchema(3441, c);
      $$0.addFixer(new bal($$190));
      Schema $$191 = $$0.addSchema(3447, c);
      $$0.addFixer(
         bec.a(
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
      Schema $$192 = $$0.addSchema(3448, bka::new);
      $$0.addFixer(new bbw($$192));
      Schema $$193 = $$0.addSchema(3450, c);
      $$0.addFixer(
         new bgg(
            $$193,
            "Remove liquid_carvers and heightmap chunk statuses",
            b(Map.of("minecraft:liquid_carvers", "minecraft:carvers", "minecraft:heightmaps", "minecraft:spawn"))
         )
      );
      Schema $$194 = $$0.addSchema(3451, c);
      $$0.addFixer(new bbk($$194));
      Schema $$195 = $$0.addSchema(3459, c);
      $$0.addFixer(new bes($$195));
      Schema $$196 = $$0.addSchema(3564, c);
      $$0.addFixer(new bbx($$196, "Drop invalid sign datafix data", "minecraft:sign"));
      $$0.addFixer(new bbx($$196, "Drop invalid hanging sign datafix data", "minecraft:hanging_sign"));
      Schema $$197 = $$0.addSchema(3565, c);
      $$0.addFixer(new bgb($$197));
      Schema $$198 = $$0.addSchema(3566, c);
      $$0.addFixer(new bgo($$198));
      Schema $$199 = $$0.addSchema(3568, c);
      $$0.addFixer(new bfc($$199));
      Schema $$200 = $$0.addSchema(3682, bkb::new);
      $$0.addFixer(new bab($$200, "Added Crafter", bgf.s));
      Schema $$201 = $$0.addSchema(3683, bkc::new);
      $$0.addFixer(new bga($$201));
      Schema $$202 = $$0.addSchema(3685, bkd::new);
      $$0.addFixer(new bdo($$202));
      Schema $$203 = $$0.addSchema(3689, bke::new);
      $$0.addFixer(new bab($$203, "Added Breeze", bgf.z));
      $$0.addFixer(new bab($$203, "Added Trial Spawner", bgf.s));
      Schema $$204 = $$0.addSchema(3692, c);
      UnaryOperator<String> $$205 = b(Map.of("minecraft:grass", "minecraft:short_grass"));
      $$0.addFixer(bba.a($$204, "Rename grass block to short_grass", $$205));
      $$0.addFixer(bec.a($$204, "Rename grass item to short_grass", $$205));
      Schema $$206 = $$0.addSchema(3799, bkf::new);
      $$0.addFixer(new bab($$206, "Added Armadillo", bgf.z));
      Schema $$207 = $$0.addSchema(3800, c);
      UnaryOperator<String> $$208 = b(Map.of("minecraft:scute", "minecraft:turtle_scute"));
      $$0.addFixer(bec.a($$207, "Rename scute item to turtle_scute", $$208));
      Schema $$209 = $$0.addSchema(3803, c);
      $$0.addFixer(new bgi($$209, "Rename sweeping enchant to sweeping_edge", Map.of("minecraft:sweeping", "minecraft:sweeping_edge")));
      Schema $$210 = $$0.addSchema(3807, bkg::new);
      $$0.addFixer(new bab($$210, "Added Vault", bgf.s));
      Schema $$211 = $$0.addSchema(3807, 1, c);
      $$0.addFixer(new bey($$211));
      Schema $$212 = $$0.addSchema(3808, bkh::new);
      $$0.addFixer(new bdu($$212, "minecraft:horse", "ArmorItem"));
      Schema $$213 = $$0.addSchema(3808, 1, bki::new);
      $$0.addFixer(new bdu($$213, "minecraft:llama", "DecorItem"));
      Schema $$214 = $$0.addSchema(3809, c);
      $$0.addFixer(new bbg($$214));
      Schema $$215 = $$0.addSchema(3812, c);
      $$0.addFixer(new azv($$215));
      Schema $$216 = $$0.addSchema(3813, c);
      $$0.addFixer(new baz($$216));
      Schema $$217 = $$0.addSchema(3814, c);
      $$0.addFixer(new baf($$217, "Rename jump strength attribute", a("minecraft:horse.jump_strength", "minecraft:generic.jump_strength")));
      Schema $$218 = $$0.addSchema(3816, bkj::new);
      $$0.addFixer(new bab($$218, "Added Bogged", bgf.z));
      Schema $$219 = $$0.addSchema(3818, bkk::new);
      $$0.addFixer(new bai($$219));
      $$0.addFixer(new bca($$219));
      Schema $$220 = $$0.addSchema(3818, 1, c);
      $$0.addFixer(new bag($$220));
      Schema $$221 = $$0.addSchema(3818, 2, c);
      $$0.addFixer(new bgz($$221));
      Schema $$222 = $$0.addSchema(3818, 3, bkl::new);
      $$0.addFixer(new bhl($$222, "Inject data component types", bgf.w));
      Schema $$223 = $$0.addSchema(3818, 4, bkm::new);
      $$0.addFixer(new beg($$223));
      Schema $$224 = $$0.addSchema(3818, 5, c);
      $$0.addFixer(new bae($$224));
      Schema $$225 = $$0.addSchema(3819, bkn::new);
      $$0.addFixer(new bab($$225, "Added April Fools Block Entity", bgf.s));
      $$0.addFixer(new bab($$225, "Added April Fools Entity", bgf.z));
      Schema $$226 = $$0.addSchema(3820, c);
      $$0.addFixer(new bfw($$226));
      $$0.addFixer(new bex($$226));
   }

   private static UnaryOperator<String> a(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault($$1, $$1);
   }

   private static UnaryOperator<String> b(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault(bhp.a($$1), $$1);
   }

   private static UnaryOperator<String> a(String $$0, String $$1) {
      return $$2 -> Objects.equals(bhp.a($$2), $$0) ? $$1 : $$2;
   }
}
