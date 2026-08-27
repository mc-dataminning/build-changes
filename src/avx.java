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

public class avx {
   private static final BiFunction<Integer, Schema, Schema> b = Schema::new;
   private static final BiFunction<Integer, Schema, Schema> c = bde::new;
   private static final DataFixer d = a(aa.aX);
   public static final int a = 3441;

   private avx() {
   }

   public static DataFixer a() {
      return d;
   }

   private static synchronized DataFixer a(Set<TypeReference> $$0) {
      DataFixerBuilder $$1 = new DataFixerBuilder(aa.b().d().c());
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
      $$0.addSchema(99, bgc::new);
      Schema $$1 = $$0.addSchema(100, bdf::new);
      $$0.addFixer(new ayf($$1, true));
      Schema $$2 = $$0.addSchema(101, b);
      $$0.addFixer(new awv($$2, false));
      Schema $$3 = $$0.addSchema(102, bdg::new);
      $$0.addFixer(new azu($$3, true));
      $$0.addFixer(new azw($$3, false));
      Schema $$4 = $$0.addSchema(105, b);
      $$0.addFixer(new baa($$4, true));
      Schema $$5 = $$0.addSchema(106, bdi::new);
      $$0.addFixer(new bav($$5, true));
      Schema $$6 = $$0.addSchema(107, bdj::new);
      $$0.addFixer(new aym($$6, true));
      Schema $$7 = $$0.addSchema(108, b);
      $$0.addFixer(new ayz($$7, true));
      Schema $$8 = $$0.addSchema(109, b);
      $$0.addFixer(new ayh($$8, true));
      Schema $$9 = $$0.addSchema(110, b);
      $$0.addFixer(new ayi($$9, true));
      Schema $$10 = $$0.addSchema(111, b);
      $$0.addFixer(new ayo($$10, true));
      Schema $$11 = $$0.addSchema(113, b);
      $$0.addFixer(new ayt($$11, true));
      Schema $$12 = $$0.addSchema(135, bdl::new);
      $$0.addFixer(new ayv($$12, true));
      Schema $$13 = $$0.addSchema(143, bdm::new);
      $$0.addFixer(new azb($$13, true));
      Schema $$14 = $$0.addSchema(147, b);
      $$0.addFixer(new axy($$14, true));
      Schema $$15 = $$0.addSchema(165, b);
      $$0.addFixer(new bai($$15, true));
      Schema $$16 = $$0.addSchema(501, bfu::new);
      $$0.addFixer(new awd($$16, "Add 1.10 entities fix", bbw.x));
      Schema $$17 = $$0.addSchema(502, b);
      $$0.addFixer(azy.a($$17, "cooked_fished item renamer", $$0x -> Objects.equals(bde.a($$0x), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : $$0x));
      $$0.addFixer(new azg($$17, false));
      Schema $$18 = $$0.addSchema(505, b);
      $$0.addFixer(new bbh($$18, false));
      Schema $$19 = $$0.addSchema(700, bfv::new);
      $$0.addFixer(new aye($$19, true));
      Schema $$20 = $$0.addSchema(701, bfw::new);
      $$0.addFixer(new ayy($$20, true));
      Schema $$21 = $$0.addSchema(702, bfx::new);
      $$0.addFixer(new azf($$21, true));
      Schema $$22 = $$0.addSchema(703, bfy::new);
      $$0.addFixer(new ayj($$22, true));
      Schema $$23 = $$0.addSchema(704, bfz::new);
      $$0.addFixer(new awp($$23, true));
      Schema $$24 = $$0.addSchema(705, bga::new);
      $$0.addFixer(new ayk($$24, true));
      Schema $$25 = $$0.addSchema(804, c);
      $$0.addFixer(new azs($$25, true));
      Schema $$26 = $$0.addSchema(806, c);
      $$0.addFixer(new bah($$26, false));
      Schema $$27 = $$0.addSchema(808, bgb::new);
      $$0.addFixer(new awd($$27, "added shulker box", bbw.s));
      Schema $$28 = $$0.addSchema(808, 1, c);
      $$0.addFixer(new ayw($$28, false));
      Schema $$29 = $$0.addSchema(813, c);
      $$0.addFixer(new azz($$29, false));
      $$0.addFixer(new awt($$29, false));
      Schema $$30 = $$0.addSchema(816, c);
      $$0.addFixer(new bbk($$30, false));
      Schema $$31 = $$0.addSchema(820, c);
      $$0.addFixer(azy.a($$31, "totem item renamer", a("minecraft:totem", "minecraft:totem_of_undying")));
      Schema $$32 = $$0.addSchema(1022, bdh::new);
      $$0.addFixer(new bda($$32, "added shoulder entities to players", bbw.b));
      Schema $$33 = $$0.addSchema(1125, bdk::new);
      $$0.addFixer(new axf($$33, true));
      $$0.addFixer(new awh($$33, false));
      Schema $$34 = $$0.addSchema(1344, c);
      $$0.addFixer(new bbi($$34, false));
      Schema $$35 = $$0.addSchema(1446, c);
      $$0.addFixer(new bbj($$35, false));
      Schema $$36 = $$0.addSchema(1450, c);
      $$0.addFixer(new axb($$36, false));
      Schema $$37 = $$0.addSchema(1451, bdn::new);
      $$0.addFixer(new awd($$37, "AddTrappedChestFix", bbw.s));
      Schema $$38 = $$0.addSchema(1451, 1, bdo::new);
      $$0.addFixer(new axl($$38, true));
      Schema $$39 = $$0.addSchema(1451, 2, bdp::new);
      $$0.addFixer(new awn($$39, true));
      Schema $$40 = $$0.addSchema(1451, 3, bdq::new);
      $$0.addFixer(new axz($$40, true));
      $$0.addFixer(new bac($$40, false));
      Schema $$41 = $$0.addSchema(1451, 4, bdr::new);
      $$0.addFixer(new awx($$41, true));
      $$0.addFixer(new baf($$41, false));
      Schema $$42 = $$0.addSchema(1451, 5, bds::new);
      $$0.addFixer(
         new azx(
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
      $$0.addFixer(new awd($$42, "RemoveNoteBlockFlowerPotFix", bbw.s));
      $$0.addFixer(new bad($$42, false, "minecraft:spawn_egg"));
      $$0.addFixer(new aze($$42, false));
      $$0.addFixer(new awm($$42, false));
      $$0.addFixer(new bao($$42, false));
      Schema $$43 = $$0.addSchema(1451, 6, bdt::new);
      $$0.addFixer(new bci($$43, true));
      $$0.addFixer(new awq($$43, false));
      Schema $$44 = $$0.addSchema(1451, 7, c);
      $$0.addFixer(new bcu($$44, false));
      Schema $$45 = $$0.addSchema(1456, c);
      $$0.addFixer(new ayl($$45, false));
      Schema $$46 = $$0.addSchema(1458, c);
      $$0.addFixer(new ayd($$46, false));
      $$0.addFixer(new azt($$46, false));
      $$0.addFixer(new awo($$46, false));
      Schema $$47 = $$0.addSchema(1460, bdu::new);
      $$0.addFixer(new ayp($$47, false));
      Schema $$48 = $$0.addSchema(1466, bdv::new);
      $$0.addFixer(new awd($$48, "Add DUMMY block entity", bbw.s));
      $$0.addFixer(new axr($$48, true));
      Schema $$49 = $$0.addSchema(1470, bdw::new);
      $$0.addFixer(new awd($$49, "Add 1.13 entities fix", bbw.x));
      Schema $$50 = $$0.addSchema(1474, c);
      $$0.addFixer(new axs($$50, false));
      $$0.addFixer(
         awy.a($$50, "Colorless shulker block fixer", $$0x -> Objects.equals(bde.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      $$0.addFixer(
         azy.a($$50, "Colorless shulker item fixer", $$0x -> Objects.equals(bde.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      Schema $$51 = $$0.addSchema(1475, c);
      $$0.addFixer(awy.a($$51, "Flowing fixer", a(ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava"))));
      Schema $$52 = $$0.addSchema(1480, c);
      $$0.addFixer(awy.a($$52, "Rename coral blocks", a(bca.a)));
      $$0.addFixer(azy.a($$52, "Rename coral items", a(bca.a)));
      Schema $$53 = $$0.addSchema(1481, bdx::new);
      $$0.addFixer(new awd($$53, "Add conduit", bbw.s));
      Schema $$54 = $$0.addSchema(1483, bdy::new);
      $$0.addFixer(new ayr($$54, true));
      $$0.addFixer(azy.a($$54, "Rename pufferfish egg item", a(ayr.a)));
      Schema $$55 = $$0.addSchema(1484, c);
      $$0.addFixer(
         azy.a(
            $$55,
            "Rename seagrass items",
            a(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(
         awy.a(
            $$55,
            "Rename seagrass blocks",
            a(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(new azq($$55, false));
      Schema $$56 = $$0.addSchema(1486, bdz::new);
      $$0.addFixer(new ayc($$56, true));
      $$0.addFixer(azy.a($$56, "Rename cod/salmon egg items", a(ayc.b)));
      Schema $$57 = $$0.addSchema(1487, c);
      $$0.addFixer(
         azy.a(
            $$57,
            "Rename prismarine_brick(s)_* blocks",
            a(
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
         awy.a(
            $$57,
            "Rename prismarine_brick(s)_* items",
            a(
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
      $$0.addFixer(awy.a($$58, "Rename kelp/kelptop", a(ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant"))));
      $$0.addFixer(azy.a($$58, "Rename kelptop", a("minecraft:kelp_top", "minecraft:kelp")));
      $$0.addFixer(new baw($$58, false, "Command block block entity custom name fix", bbw.s, "minecraft:command_block") {
         @Override
         protected Typed<?> a(Typed<?> $$0) {
            return $$0.update(DSL.remainderFinder(), ayd::a);
         }
      });
      $$0.addFixer(new baw($$58, false, "Command block minecart custom name fix", bbw.x, "minecraft:commandblock_minecart") {
         @Override
         protected Typed<?> a(Typed<?> $$0) {
            return $$0.update(DSL.remainderFinder(), ayd::a);
         }
      });
      $$0.addFixer(new azr($$58, false));
      Schema $$59 = $$0.addSchema(1490, c);
      $$0.addFixer(awy.a($$59, "Rename melon_block", a("minecraft:melon_block", "minecraft:melon")));
      $$0.addFixer(
         azy.a(
            $$59,
            "Rename melon_block/melon/speckled_melon",
            a(
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
      $$0.addFixer(new axq($$60, false));
      Schema $$61 = $$0.addSchema(1494, c);
      $$0.addFixer(new bab($$61, false));
      Schema $$62 = $$0.addSchema(1496, c);
      $$0.addFixer(new bal($$62, false));
      Schema $$63 = $$0.addSchema(1500, c);
      $$0.addFixer(new awr($$63, false));
      Schema $$64 = $$0.addSchema(1501, c);
      $$0.addFixer(new awe($$64, false));
      Schema $$65 = $$0.addSchema(1502, c);
      $$0.addFixer(new bay($$65, "Recipes fix", bbw.F, a(bbt.a)));
      Schema $$66 = $$0.addSchema(1506, c);
      $$0.addFixer(new ban($$66, false));
      Schema $$67 = $$0.addSchema(1510, bea::new);
      $$0.addFixer(awy.a($$67, "Block renamening fix", a(aza.b)));
      $$0.addFixer(azy.a($$67, "Item renamening fix", a(aza.c)));
      $$0.addFixer(new bay($$67, "Recipes renamening fix", bbw.F, a(bbu.a)));
      $$0.addFixer(new aza($$67, true));
      $$0.addFixer(
         new bcj(
            $$67,
            "SwimStatsRenameFix",
            ImmutableMap.of("minecraft:swim_one_cm", "minecraft:walk_on_water_one_cm", "minecraft:dive_one_cm", "minecraft:walk_under_water_one_cm")
         )
      );
      Schema $$68 = $$0.addSchema(1514, c);
      $$0.addFixer(new bba($$68, false));
      $$0.addFixer(new bco($$68, false));
      $$0.addFixer(new bbb($$68, false));
      Schema $$69 = $$0.addSchema(1515, c);
      $$0.addFixer(awy.a($$69, "Rename coral fan blocks", a(bbz.a)));
      Schema $$70 = $$0.addSchema(1624, c);
      $$0.addFixer(new bcp($$70, false));
      Schema $$71 = $$0.addSchema(1800, beb::new);
      $$0.addFixer(new awd($$71, "Added 1.14 mobs fix", bbw.x));
      $$0.addFixer(azy.a($$71, "Rename dye items", a(axw.a)));
      Schema $$72 = $$0.addSchema(1801, bec::new);
      $$0.addFixer(new awd($$72, "Added Illager Beast", bbw.x));
      Schema $$73 = $$0.addSchema(1802, c);
      $$0.addFixer(
         awy.a(
            $$73,
            "Rename sign blocks & stone slabs",
            a(
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
         azy.a(
            $$73,
            "Rename sign item & stone slabs",
            a(ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))
         )
      );
      Schema $$74 = $$0.addSchema(1803, c);
      $$0.addFixer(new azv($$74, false));
      Schema $$75 = $$0.addSchema(1904, bed::new);
      $$0.addFixer(new awd($$75, "Added Cats", bbw.x));
      $$0.addFixer(new ayb($$75, false));
      Schema $$76 = $$0.addSchema(1905, c);
      $$0.addFixer(new axo($$76, false));
      Schema $$77 = $$0.addSchema(1906, bee::new);
      $$0.addFixer(new awd($$77, "Add POI Blocks", bbw.s));
      Schema $$78 = $$0.addSchema(1909, bef::new);
      $$0.addFixer(new awd($$78, "Add jigsaw", bbw.s));
      Schema $$79 = $$0.addSchema(1911, c);
      $$0.addFixer(new axp($$79, false));
      Schema $$80 = $$0.addSchema(1914, c);
      $$0.addFixer(new bcw($$80, false));
      Schema $$81 = $$0.addSchema(1917, c);
      $$0.addFixer(new axc($$81, false));
      Schema $$82 = $$0.addSchema(1918, c);
      $$0.addFixer(new bcr($$82, "minecraft:villager"));
      $$0.addFixer(new bcr($$82, "minecraft:zombie_villager"));
      Schema $$83 = $$0.addSchema(1920, beg::new);
      $$0.addFixer(new baz($$83, false));
      $$0.addFixer(new awd($$83, "Add campfire", bbw.s));
      Schema $$84 = $$0.addSchema(1925, c);
      $$0.addFixer(new bar($$84, false));
      Schema $$85 = $$0.addSchema(1928, beh::new);
      $$0.addFixer(new ays($$85, true));
      $$0.addFixer(azy.a($$85, "Rename ravager egg item", a(ays.a)));
      Schema $$86 = $$0.addSchema(1929, bei::new);
      $$0.addFixer(new awd($$86, "Add Wandering Trader and Trader Llama", bbw.x));
      Schema $$87 = $$0.addSchema(1931, bej::new);
      $$0.addFixer(new awd($$87, "Added Fox", bbw.x));
      Schema $$88 = $$0.addSchema(1936, c);
      $$0.addFixer(new bbf($$88, false));
      Schema $$89 = $$0.addSchema(1946, c);
      $$0.addFixer(new bcb($$89, false));
      Schema $$90 = $$0.addSchema(1948, c);
      $$0.addFixer(new bbd($$90));
      Schema $$91 = $$0.addSchema(1953, c);
      $$0.addFixer(new bbc($$91, false));
      Schema $$92 = $$0.addSchema(1955, c);
      $$0.addFixer(new bct($$92, false));
      $$0.addFixer(new bdb($$92, false));
      Schema $$93 = $$0.addSchema(1961, c);
      $$0.addFixer(new axk($$93, false));
      Schema $$94 = $$0.addSchema(1963, c);
      $$0.addFixer(new bby($$94, false));
      Schema $$95 = $$0.addSchema(2100, bek::new);
      $$0.addFixer(new awd($$95, "Added Bee and Bee Stinger", bbw.x));
      $$0.addFixer(new awd($$95, "Add beehive", bbw.s));
      $$0.addFixer(new bay($$95, "Rename sugar recipe", bbw.F, a("minecraft:sugar", "sugar_from_sugar_cane")));
      $$0.addFixer(new awf($$95, false, "Rename sugar recipe advancement", a("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane")));
      Schema $$96 = $$0.addSchema(2202, c);
      $$0.addFixer(new axg($$96, false));
      Schema $$97 = $$0.addSchema(2209, c);
      UnaryOperator<String> $$98 = a("minecraft:bee_hive", "minecraft:beehive");
      $$0.addFixer(azy.a($$97, "Rename bee_hive item to beehive", $$98));
      $$0.addFixer(new bbq($$97, "Rename bee_hive poi to beehive", $$98));
      $$0.addFixer(awy.a($$97, "Rename bee_hive block to beehive", $$98));
      Schema $$99 = $$0.addSchema(2211, c);
      $$0.addFixer(new bcl($$99, false));
      Schema $$100 = $$0.addSchema(2218, c);
      $$0.addFixer(new azm($$100, false));
      Schema $$101 = $$0.addSchema(2501, bel::new);
      $$0.addFixer(new azn($$101, true));
      Schema $$102 = $$0.addSchema(2502, bem::new);
      $$0.addFixer(new awd($$102, "Added Hoglin", bbw.x));
      Schema $$103 = $$0.addSchema(2503, c);
      $$0.addFixer(new bcv($$103, false));
      $$0.addFixer(new awf($$103, false, "Composter category change", a("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter")));
      Schema $$104 = $$0.addSchema(2505, ben::new);
      $$0.addFixer(new awd($$104, "Added Piglin", bbw.x));
      $$0.addFixer(new bas($$104, "minecraft:villager"));
      Schema $$105 = $$0.addSchema(2508, c);
      $$0.addFixer(
         azy.a(
            $$105,
            "Renamed fungi items to fungus",
            a(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      $$0.addFixer(
         awy.a(
            $$105,
            "Renamed fungi blocks to fungus",
            a(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      Schema $$106 = $$0.addSchema(2509, beo::new);
      $$0.addFixer(new azh($$106));
      $$0.addFixer(azy.a($$106, "Rename zombie pigman egg item", a(azh.a)));
      Schema $$107 = $$0.addSchema(2511, c);
      $$0.addFixer(new ayq($$107));
      Schema $$108 = $$0.addSchema(2514, c);
      $$0.addFixer(new azc($$108));
      $$0.addFixer(new aww($$108));
      $$0.addFixer(new bbo($$108));
      $$0.addFixer(new baq($$108));
      $$0.addFixer(new bcd($$108));
      $$0.addFixer(new bag($$108));
      Schema $$109 = $$0.addSchema(2516, c);
      $$0.addFixer(new azp($$109, "minecraft:villager"));
      $$0.addFixer(new azp($$109, "minecraft:zombie_villager"));
      Schema $$110 = $$0.addSchema(2518, c);
      $$0.addFixer(new baj($$110, false));
      $$0.addFixer(new bak($$110, false));
      Schema $$111 = $$0.addSchema(2519, bep::new);
      $$0.addFixer(new awd($$111, "Added Strider", bbw.x));
      Schema $$112 = $$0.addSchema(2522, beq::new);
      $$0.addFixer(new awd($$112, "Added Zoglin", bbw.x));
      Schema $$113 = $$0.addSchema(2523, c);
      $$0.addFixer(new awg($$113));
      Schema $$114 = $$0.addSchema(2527, c);
      $$0.addFixer(new awj($$114));
      Schema $$115 = $$0.addSchema(2528, c);
      $$0.addFixer(
         azy.a(
            $$115,
            "Rename soul fire torch and soul fire lantern",
            a(ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))
         )
      );
      $$0.addFixer(
         awy.a(
            $$115,
            "Rename soul fire torch and soul fire lantern",
            a(
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
      $$0.addFixer(new bck($$116, false));
      Schema $$117 = $$0.addSchema(2531, c);
      $$0.addFixer(new bbv($$117));
      Schema $$118 = $$0.addSchema(2533, c);
      $$0.addFixer(new bcs($$118));
      Schema $$119 = $$0.addSchema(2535, c);
      $$0.addFixer(new ayx($$119));
      Schema $$120 = $$0.addSchema(2538, c);
      $$0.addFixer(new bap($$120));
      Schema $$121 = $$0.addSchema(2550, c);
      $$0.addFixer(new bcy($$121));
      Schema $$122 = $$0.addSchema(2551, ber::new);
      $$0.addFixer(new bda($$122, "add types to WorldGenData", bbw.I));
      Schema $$123 = $$0.addSchema(2552, c);
      $$0.addFixer(new bay($$123, "Nether biome rename", bbw.G, a("minecraft:nether", "minecraft:nether_wastes")));
      Schema $$124 = $$0.addSchema(2553, c);
      $$0.addFixer(new bay($$124, "Biomes fix", bbw.G, a(awi.a)));
      Schema $$125 = $$0.addSchema(2558, c);
      $$0.addFixer(new bat($$125, false));
      $$0.addFixer(new bbm($$125, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
      Schema $$126 = $$0.addSchema(2568, bes::new);
      $$0.addFixer(new awd($$126, "Added Piglin Brute", bbw.x));
      Schema $$127 = $$0.addSchema(2571, bet::new);
      $$0.addFixer(new awd($$127, "Added Goat", bbw.x));
      Schema $$128 = $$0.addSchema(2679, c);
      $$0.addFixer(new axd($$128, false));
      Schema $$129 = $$0.addSchema(2680, c);
      $$0.addFixer(azy.a($$129, "Renamed grass path item to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      $$0.addFixer(awz.b($$129, "Renamed grass path block to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      Schema $$130 = $$0.addSchema(2684, beu::new);
      $$0.addFixer(new awd($$130, "Added Sculk Sensor", bbw.s));
      Schema $$131 = $$0.addSchema(2686, bev::new);
      $$0.addFixer(new awd($$131, "Added Axolotl", bbw.x));
      Schema $$132 = $$0.addSchema(2688, bew::new);
      $$0.addFixer(new awd($$132, "Added Glow Squid", bbw.x));
      $$0.addFixer(new awd($$132, "Added Glow Item Frame", bbw.x));
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
      $$0.addFixer(azy.a($$133, "Renamed copper block items to new oxidized terms", a($$134)));
      $$0.addFixer(awz.b($$133, "Renamed copper blocks to new oxidized terms", a($$134)));
      Schema $$135 = $$0.addSchema(2691, c);
      ImmutableMap<String, String> $$136 = ImmutableMap.builder()
         .put("minecraft:waxed_copper", "minecraft:waxed_copper_block")
         .put("minecraft:oxidized_copper_block", "minecraft:oxidized_copper")
         .put("minecraft:weathered_copper_block", "minecraft:weathered_copper")
         .put("minecraft:exposed_copper_block", "minecraft:exposed_copper")
         .build();
      $$0.addFixer(azy.a($$135, "Rename copper item suffixes", a($$136)));
      $$0.addFixer(awz.b($$135, "Rename copper blocks suffixes", a($$136)));
      Schema $$137 = $$0.addSchema(2693, c);
      $$0.addFixer(new awc($$137, bbw.I, "has_increased_height_already", false));
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
      $$0.addFixer(azy.a($$138, "Renamed grimstone block items to deepslate", a($$139)));
      $$0.addFixer(awz.b($$138, "Renamed grimstone blocks to deepslate", a($$139)));
      Schema $$140 = $$0.addSchema(2700, c);
      $$0.addFixer(
         awz.b(
            $$140,
            "Renamed cave vines blocks",
            a(ImmutableMap.of("minecraft:cave_vines_head", "minecraft:cave_vines", "minecraft:cave_vines_body", "minecraft:cave_vines_plant"))
         )
      );
      Schema $$141 = $$0.addSchema(2701, c);
      $$0.addFixer(new bcc($$141));
      Schema $$142 = $$0.addSchema(2702, c);
      $$0.addFixer(new avz($$142));
      Schema $$143 = $$0.addSchema(2704, bex::new);
      $$0.addFixer(new awd($$143, "Added Goat", bbw.x));
      Schema $$144 = $$0.addSchema(2707, bey::new);
      $$0.addFixer(new awd($$144, "Added Marker", bbw.x));
      $$0.addFixer(new awc($$144, bbw.I, "has_increased_height_already", true));
      Schema $$145 = $$0.addSchema(2710, c);
      $$0.addFixer(new bcj($$145, "Renamed play_one_minute stat to play_time", ImmutableMap.of("minecraft:play_one_minute", "minecraft:play_time")));
      Schema $$146 = $$0.addSchema(2717, c);
      $$0.addFixer(azy.a($$146, "Rename azalea_leaves_flowers", a(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves"))));
      $$0.addFixer(
         awy.a($$146, "Rename azalea_leaves_flowers items", a(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves")))
      );
      Schema $$147 = $$0.addSchema(2825, c);
      $$0.addFixer(new awc($$147, bbw.I, "has_increased_height_already", false));
      Schema $$148 = $$0.addSchema(2831, bez::new);
      $$0.addFixer(new bch($$148));
      Schema $$149 = $$0.addSchema(2832, bfa::new);
      $$0.addFixer(new bcz($$149));
      $$0.addFixer(new axj($$149));
      Schema $$150 = $$0.addSchema(2833, c);
      $$0.addFixer(new bcx($$150));
      Schema $$151 = $$0.addSchema(2838, c);
      $$0.addFixer(new bay($$151, "Caves and Cliffs biome renames", bbw.G, a(axe.a)));
      Schema $$152 = $$0.addSchema(2841, c);
      $$0.addFixer(new axm($$152));
      Schema $$153 = $$0.addSchema(2842, bfb::new);
      $$0.addFixer(new axn($$153));
      Schema $$154 = $$0.addSchema(2843, c);
      $$0.addFixer(new bbn($$154));
      $$0.addFixer(new bay($$154, "Remove Deep Warm Ocean", bbw.G, a("minecraft:deep_warm_ocean", "minecraft:warm_ocean")));
      Schema $$155 = $$0.addSchema(2846, c);
      $$0.addFixer(
         new awf(
            $$155,
            false,
            "Rename some C&C part 2 advancements",
            a(
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
      $$0.addFixer(new bcx($$156));
      Schema $$157 = $$0.addSchema(2967, c);
      $$0.addFixer(new bcm($$157));
      Schema $$158 = $$0.addSchema(2970, c);
      $$0.addFixer(new bcn($$158));
      Schema $$159 = $$0.addSchema(3076, bfc::new);
      $$0.addFixer(new awd($$159, "Added Sculk Catalyst", bbw.s));
      Schema $$160 = $$0.addSchema(3077, c);
      $$0.addFixer(new axh($$160));
      Schema $$161 = $$0.addSchema(3078, bfd::new);
      $$0.addFixer(new awd($$161, "Added Frog", bbw.x));
      $$0.addFixer(new awd($$161, "Added Tadpole", bbw.x));
      $$0.addFixer(new awd($$161, "Added Sculk Shrieker", bbw.s));
      Schema $$162 = $$0.addSchema(3081, bfe::new);
      $$0.addFixer(new awd($$162, "Added Warden", bbw.x));
      Schema $$163 = $$0.addSchema(3082, bff::new);
      $$0.addFixer(new awd($$163, "Added Chest Boat", bbw.x));
      Schema $$164 = $$0.addSchema(3083, bfg::new);
      $$0.addFixer(new awd($$164, "Added Allay", bbw.x));
      Schema $$165 = $$0.addSchema(3084, c);
      $$0.addFixer(
         new bay(
            $$165,
            "game_event_renames_3084",
            bbw.A,
            a(
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
      $$0.addFixer(new azd($$166, "Change cat variant type", bbw.x, "minecraft:cat", "CatType", ac.a(new Int2ObjectOpenHashMap(), $$0x -> {
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
      $$0.addFixer(new axt($$166, "Migrate cat variant advancement", "minecraft:husbandry/complete_catalogue", $$1x -> (String)$$167.getOrDefault($$1x, $$1x)));
      Schema $$168 = $$0.addSchema(3087, c);
      $$0.addFixer(new azd($$168, "Change frog variant type", bbw.x, "minecraft:frog", "Variant", ac.a(new Int2ObjectOpenHashMap(), $$0x -> {
         $$0x.put(0, "minecraft:temperate");
         $$0x.put(1, "minecraft:warm");
         $$0x.put(2, "minecraft:cold");
      })::get));
      Schema $$169 = $$0.addSchema(3090, c);
      $$0.addFixer(new ayn($$169));
      Schema $$170 = $$0.addSchema(3093, c);
      $$0.addFixer(new ayg($$170));
      Schema $$171 = $$0.addSchema(3094, c);
      $$0.addFixer(new azo($$171));
      Schema $$172 = $$0.addSchema(3097, c);
      $$0.addFixer(new azj($$172));
      $$0.addFixer(new azk($$172));
      Map<String, String> $$173 = Map.of("minecraft:british", "minecraft:british_shorthair");
      $$0.addFixer(new bcq($$172, "Rename british shorthair", bbw.x, "minecraft:cat", $$173));
      $$0.addFixer(
         new axt(
            $$172, "Migrate cat variant advancement for british shorthair", "minecraft:husbandry/complete_catalogue", $$1x -> $$173.getOrDefault($$1x, $$1x)
         )
      );
      $$0.addFixer(new bbp($$172, "Remove unpopulated villager PoI types", Set.of("minecraft:unemployed", "minecraft:nitwit")::contains));
      Schema $$174 = $$0.addSchema(3108, c);
      $$0.addFixer(new awl($$174));
      Schema $$175 = $$0.addSchema(3201, c);
      $$0.addFixer(new bbl($$175));
      Schema $$176 = $$0.addSchema(3202, bfh::new);
      $$0.addFixer(new awd($$176, "Added Hanging Sign", bbw.s));
      Schema $$177 = $$0.addSchema(3203, bfi::new);
      $$0.addFixer(new awd($$177, "Added Camel", bbw.x));
      Schema $$178 = $$0.addSchema(3204, bfj::new);
      $$0.addFixer(new awd($$178, "Added Chiseled Bookshelf", bbw.s));
      Schema $$179 = $$0.addSchema(3209, c);
      $$0.addFixer(new bad($$179, false, "minecraft:pig_spawn_egg"));
      Schema $$180 = $$0.addSchema(3214, c);
      $$0.addFixer(new bbg($$180));
      Schema $$181 = $$0.addSchema(3319, c);
      $$0.addFixer(new bbe($$181));
      Schema $$182 = $$0.addSchema(3322, c);
      $$0.addFixer(new axx($$182));
      Schema $$183 = $$0.addSchema(3325, bfk::new);
      $$0.addFixer(new awd($$183, "Added displays", bbw.x));
      Schema $$184 = $$0.addSchema(3326, bfl::new);
      $$0.addFixer(new awd($$184, "Added Sniffer", bbw.x));
      Schema $$185 = $$0.addSchema(3327, bfm::new);
      $$0.addFixer(new awd($$185, "Archaeology", bbw.s));
      Schema $$186 = $$0.addSchema(3328, bfn::new);
      $$0.addFixer(new awd($$186, "Added interaction", bbw.x));
      Schema $$187 = $$0.addSchema(3438, bfo::new);
      $$0.addFixer(aws.a($$187, "Rename Suspicious Sand to Brushable Block", a("minecraft:suspicious_sand", "minecraft:brushable_block")));
      $$0.addFixer(new aya($$187));
      $$0.addFixer(
         azy.a(
            $$187,
            "Pottery shard renaming",
            a(
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
      $$0.addFixer(new awd($$187, "Added calibrated sculk sensor", bbw.s));
      Schema $$188 = $$0.addSchema(3439, c);
      $$0.addFixer(new awu($$188, "Updated sign text format for Signs", "minecraft:sign"));
      $$0.addFixer(new awu($$188, "Updated sign text format for Hanging Signs", "minecraft:hanging_sign"));
      Schema $$189 = $$0.addSchema(3440, c);
      $$0.addFixer(new bay($$189, "Replace experimental 1.20 overworld", bbw.H, a("minecraft:overworld_update_1_20", "minecraft:overworld")));
      $$0.addFixer(new azi($$189, "Remove 1.20 feature toggle", Set.of("minecraft:update_1_20")));
      Schema $$190 = $$0.addSchema(3441, c);
      $$0.addFixer(new awk($$190));
      Schema $$191 = $$0.addSchema(3447, c);
      $$0.addFixer(
         azy.a(
            $$191,
            "Pottery shard item renaming to Pottery sherd",
            a(
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
      Schema $$192 = $$0.addSchema(3448, bfp::new);
      $$0.addFixer(new axu($$192));
      Schema $$193 = $$0.addSchema(3450, c);
      $$0.addFixer(
         new bbx(
            $$193,
            "Remove liquid_carvers and heightmap chunk statuses",
            a(Map.of("minecraft:liquid_carvers", "minecraft:carvers", "minecraft:heightmaps", "minecraft:spawn"))
         )
      );
      Schema $$194 = $$0.addSchema(3451, c);
      $$0.addFixer(new axi($$194));
      Schema $$195 = $$0.addSchema(3459, c);
      $$0.addFixer(new bam($$195));
      Schema $$196 = $$0.addSchema(3564, c);
      $$0.addFixer(new axv($$196, "Drop invalid sign datafix data", "minecraft:sign"));
      $$0.addFixer(new axv($$196, "Drop invalid hanging sign datafix data", "minecraft:hanging_sign"));
      Schema $$197 = $$0.addSchema(3565, c);
      $$0.addFixer(new bbs($$197));
      Schema $$198 = $$0.addSchema(3566, c);
      $$0.addFixer(new bce($$198));
      Schema $$199 = $$0.addSchema(3568, c);
      $$0.addFixer(new bau($$199));
      Schema $$200 = $$0.addSchema(3682, bfq::new);
      $$0.addFixer(new awd($$200, "Added Crafter", bbw.s));
      Schema $$201 = $$0.addSchema(3683, bfr::new);
      $$0.addFixer(new bbr($$201));
      Schema $$202 = $$0.addSchema(3685, bfs::new);
      $$0.addFixer(new azl($$202));
      Schema $$203 = $$0.addSchema(3689, bft::new);
      $$0.addFixer(new awd($$203, "Added Breeze", bbw.x));
      $$0.addFixer(new awd($$203, "Added Trial Spawner", bbw.s));
      Schema $$204 = $$0.addSchema(3692, c);
      UnaryOperator<String> $$205 = a(Map.of("minecraft:grass", "minecraft:short_grass"));
      $$0.addFixer(awz.b($$204, "Rename grass block to short_grass", $$205));
      $$0.addFixer(azy.a($$204, "Rename grass item to short_grass", $$205));
   }

   private static UnaryOperator<String> a(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault($$1, $$1);
   }

   private static UnaryOperator<String> a(String $$0, String $$1) {
      return $$2 -> Objects.equals($$2, $$0) ? $$1 : $$2;
   }
}
