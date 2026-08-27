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

public class axt {
   private static final BiFunction<Integer, Schema, Schema> b = Schema::new;
   private static final BiFunction<Integer, Schema, Schema> c = bfc::new;
   private static final DataFixer d = a(aa.aW);
   public static final int a = 3441;

   private axt() {
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
      $$0.addSchema(99, bie::new);
      Schema $$1 = $$0.addSchema(100, bfd::new);
      $$0.addFixer(new bab($$1, true));
      Schema $$2 = $$0.addSchema(101, b);
      $$0.addFixer(new ayr($$2, false));
      Schema $$3 = $$0.addSchema(102, bfe::new);
      $$0.addFixer(new bbr($$3, true));
      $$0.addFixer(new bbt($$3, false));
      Schema $$4 = $$0.addSchema(105, b);
      $$0.addFixer(new bbx($$4, true));
      Schema $$5 = $$0.addSchema(106, bfg::new);
      $$0.addFixer(new bcs($$5, true));
      Schema $$6 = $$0.addSchema(107, bfh::new);
      $$0.addFixer(new bai($$6, true));
      Schema $$7 = $$0.addSchema(108, b);
      $$0.addFixer(new bav($$7, true));
      Schema $$8 = $$0.addSchema(109, b);
      $$0.addFixer(new bad($$8, true));
      Schema $$9 = $$0.addSchema(110, b);
      $$0.addFixer(new bae($$9, true));
      Schema $$10 = $$0.addSchema(111, b);
      $$0.addFixer(new bak($$10, true));
      Schema $$11 = $$0.addSchema(113, b);
      $$0.addFixer(new bap($$11, true));
      Schema $$12 = $$0.addSchema(135, bfj::new);
      $$0.addFixer(new bar($$12, true));
      Schema $$13 = $$0.addSchema(143, bfk::new);
      $$0.addFixer(new bax($$13, true));
      Schema $$14 = $$0.addSchema(147, b);
      $$0.addFixer(new azu($$14, true));
      Schema $$15 = $$0.addSchema(165, b);
      $$0.addFixer(new bcf($$15, true));
      Schema $$16 = $$0.addSchema(501, bhw::new);
      $$0.addFixer(new axz($$16, "Add 1.10 entities fix", bdt.y));
      Schema $$17 = $$0.addSchema(502, b);
      $$0.addFixer(bbv.a($$17, "cooked_fished item renamer", $$0x -> Objects.equals(bfc.a($$0x), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : $$0x));
      $$0.addFixer(new bbc($$17, false));
      Schema $$18 = $$0.addSchema(505, b);
      $$0.addFixer(new bde($$18, false));
      Schema $$19 = $$0.addSchema(700, bhx::new);
      $$0.addFixer(new baa($$19, true));
      Schema $$20 = $$0.addSchema(701, bhy::new);
      $$0.addFixer(new bau($$20, true));
      Schema $$21 = $$0.addSchema(702, bhz::new);
      $$0.addFixer(new bbb($$21, true));
      Schema $$22 = $$0.addSchema(703, bia::new);
      $$0.addFixer(new baf($$22, true));
      Schema $$23 = $$0.addSchema(704, bib::new);
      $$0.addFixer(new ayl($$23, true));
      Schema $$24 = $$0.addSchema(705, bic::new);
      $$0.addFixer(new bag($$24, true));
      Schema $$25 = $$0.addSchema(804, c);
      $$0.addFixer(new bbp($$25, true));
      Schema $$26 = $$0.addSchema(806, c);
      $$0.addFixer(new bce($$26, false));
      Schema $$27 = $$0.addSchema(808, bid::new);
      $$0.addFixer(new axz($$27, "added shulker box", bdt.s));
      Schema $$28 = $$0.addSchema(808, 1, c);
      $$0.addFixer(new bas($$28, false));
      Schema $$29 = $$0.addSchema(813, c);
      $$0.addFixer(new bbw($$29, false));
      $$0.addFixer(new ayp($$29, false));
      Schema $$30 = $$0.addSchema(816, c);
      $$0.addFixer(new bdh($$30, false));
      Schema $$31 = $$0.addSchema(820, c);
      $$0.addFixer(bbv.a($$31, "totem item renamer", a("minecraft:totem", "minecraft:totem_of_undying")));
      Schema $$32 = $$0.addSchema(1022, bff::new);
      $$0.addFixer(new bey($$32, "added shoulder entities to players", bdt.b));
      Schema $$33 = $$0.addSchema(1125, bfi::new);
      $$0.addFixer(new azb($$33, true));
      $$0.addFixer(new ayd($$33, false));
      Schema $$34 = $$0.addSchema(1344, c);
      $$0.addFixer(new bdf($$34, false));
      Schema $$35 = $$0.addSchema(1446, c);
      $$0.addFixer(new bdg($$35, false));
      Schema $$36 = $$0.addSchema(1450, c);
      $$0.addFixer(new ayw($$36, false));
      Schema $$37 = $$0.addSchema(1451, bfl::new);
      $$0.addFixer(new axz($$37, "AddTrappedChestFix", bdt.s));
      Schema $$38 = $$0.addSchema(1451, 1, bfm::new);
      $$0.addFixer(new azh($$38, true));
      Schema $$39 = $$0.addSchema(1451, 2, bfn::new);
      $$0.addFixer(new ayj($$39, true));
      Schema $$40 = $$0.addSchema(1451, 3, bfo::new);
      $$0.addFixer(new azv($$40, true));
      $$0.addFixer(new bbz($$40, false));
      Schema $$41 = $$0.addSchema(1451, 4, bfp::new);
      $$0.addFixer(new ayt($$41, true));
      $$0.addFixer(new bcc($$41, false));
      Schema $$42 = $$0.addSchema(1451, 5, bfq::new);
      $$0.addFixer(
         new bbu(
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
      $$0.addFixer(new axz($$42, "RemoveNoteBlockFlowerPotFix", bdt.s));
      $$0.addFixer(new bca($$42, false, "minecraft:spawn_egg"));
      $$0.addFixer(new bba($$42, false));
      $$0.addFixer(new ayi($$42, false));
      $$0.addFixer(new bcl($$42, false));
      Schema $$43 = $$0.addSchema(1451, 6, bfr::new);
      $$0.addFixer(new beg($$43, true));
      $$0.addFixer(new aym($$43, false));
      Schema $$44 = $$0.addSchema(1451, 7, c);
      $$0.addFixer(new bes($$44, false));
      Schema $$45 = $$0.addSchema(1456, c);
      $$0.addFixer(new bah($$45, false));
      Schema $$46 = $$0.addSchema(1458, c);
      $$0.addFixer(new azz($$46, false));
      $$0.addFixer(new bbq($$46, false));
      $$0.addFixer(new ayk($$46, false));
      Schema $$47 = $$0.addSchema(1460, bfs::new);
      $$0.addFixer(new bal($$47, false));
      Schema $$48 = $$0.addSchema(1466, bft::new);
      $$0.addFixer(new axz($$48, "Add DUMMY block entity", bdt.s));
      $$0.addFixer(new azn($$48, true));
      Schema $$49 = $$0.addSchema(1470, bfu::new);
      $$0.addFixer(new axz($$49, "Add 1.13 entities fix", bdt.y));
      Schema $$50 = $$0.addSchema(1474, c);
      $$0.addFixer(new azo($$50, false));
      $$0.addFixer(
         ayu.a($$50, "Colorless shulker block fixer", $$0x -> Objects.equals(bfc.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      $$0.addFixer(
         bbv.a($$50, "Colorless shulker item fixer", $$0x -> Objects.equals(bfc.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      Schema $$51 = $$0.addSchema(1475, c);
      $$0.addFixer(ayu.a($$51, "Flowing fixer", a(ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava"))));
      Schema $$52 = $$0.addSchema(1480, c);
      $$0.addFixer(ayu.a($$52, "Rename coral blocks", a(bdy.a)));
      $$0.addFixer(bbv.a($$52, "Rename coral items", a(bdy.a)));
      Schema $$53 = $$0.addSchema(1481, bfv::new);
      $$0.addFixer(new axz($$53, "Add conduit", bdt.s));
      Schema $$54 = $$0.addSchema(1483, bfw::new);
      $$0.addFixer(new ban($$54, true));
      $$0.addFixer(bbv.a($$54, "Rename pufferfish egg item", a(ban.a)));
      Schema $$55 = $$0.addSchema(1484, c);
      $$0.addFixer(
         bbv.a(
            $$55,
            "Rename seagrass items",
            a(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(
         ayu.a(
            $$55,
            "Rename seagrass blocks",
            a(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(new bbm($$55, false));
      Schema $$56 = $$0.addSchema(1486, bfx::new);
      $$0.addFixer(new azy($$56, true));
      $$0.addFixer(bbv.a($$56, "Rename cod/salmon egg items", a(azy.b)));
      Schema $$57 = $$0.addSchema(1487, c);
      $$0.addFixer(
         bbv.a(
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
         ayu.a(
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
      $$0.addFixer(ayu.a($$58, "Rename kelp/kelptop", a(ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant"))));
      $$0.addFixer(bbv.a($$58, "Rename kelptop", a("minecraft:kelp_top", "minecraft:kelp")));
      $$0.addFixer(new bct($$58, false, "Command block block entity custom name fix", bdt.s, "minecraft:command_block") {
         @Override
         protected Typed<?> a(Typed<?> $$0) {
            return $$0.update(DSL.remainderFinder(), azz::a);
         }
      });
      $$0.addFixer(new bct($$58, false, "Command block minecart custom name fix", bdt.y, "minecraft:commandblock_minecart") {
         @Override
         protected Typed<?> a(Typed<?> $$0) {
            return $$0.update(DSL.remainderFinder(), azz::a);
         }
      });
      $$0.addFixer(new bbo($$58, false));
      Schema $$59 = $$0.addSchema(1490, c);
      $$0.addFixer(ayu.a($$59, "Rename melon_block", a("minecraft:melon_block", "minecraft:melon")));
      $$0.addFixer(
         bbv.a(
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
      $$0.addFixer(new azm($$60, false));
      Schema $$61 = $$0.addSchema(1494, c);
      $$0.addFixer(new bby($$61, false));
      Schema $$62 = $$0.addSchema(1496, c);
      $$0.addFixer(new bci($$62, false));
      Schema $$63 = $$0.addSchema(1500, c);
      $$0.addFixer(new ayn($$63, false));
      Schema $$64 = $$0.addSchema(1501, c);
      $$0.addFixer(new aya($$64, false));
      Schema $$65 = $$0.addSchema(1502, c);
      $$0.addFixer(new bcv($$65, "Recipes fix", bdt.G, a(bdq.a)));
      Schema $$66 = $$0.addSchema(1506, c);
      $$0.addFixer(new bck($$66, false));
      Schema $$67 = $$0.addSchema(1510, bfy::new);
      $$0.addFixer(ayu.a($$67, "Block renamening fix", a(baw.b)));
      $$0.addFixer(bbv.a($$67, "Item renamening fix", a(baw.c)));
      $$0.addFixer(new bcv($$67, "Recipes renamening fix", bdt.G, a(bdr.a)));
      $$0.addFixer(new baw($$67, true));
      $$0.addFixer(
         new beh(
            $$67,
            "SwimStatsRenameFix",
            ImmutableMap.of("minecraft:swim_one_cm", "minecraft:walk_on_water_one_cm", "minecraft:dive_one_cm", "minecraft:walk_under_water_one_cm")
         )
      );
      Schema $$68 = $$0.addSchema(1514, c);
      $$0.addFixer(new bcx($$68, false));
      $$0.addFixer(new bem($$68, false));
      $$0.addFixer(new bcy($$68, false));
      Schema $$69 = $$0.addSchema(1515, c);
      $$0.addFixer(ayu.a($$69, "Rename coral fan blocks", a(bdx.a)));
      Schema $$70 = $$0.addSchema(1624, c);
      $$0.addFixer(new ben($$70, false));
      Schema $$71 = $$0.addSchema(1800, bfz::new);
      $$0.addFixer(new axz($$71, "Added 1.14 mobs fix", bdt.y));
      $$0.addFixer(bbv.a($$71, "Rename dye items", a(azs.a)));
      Schema $$72 = $$0.addSchema(1801, bga::new);
      $$0.addFixer(new axz($$72, "Added Illager Beast", bdt.y));
      Schema $$73 = $$0.addSchema(1802, c);
      $$0.addFixer(
         ayu.a(
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
         bbv.a(
            $$73,
            "Rename sign item & stone slabs",
            a(ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))
         )
      );
      Schema $$74 = $$0.addSchema(1803, c);
      $$0.addFixer(new bbs($$74, false));
      Schema $$75 = $$0.addSchema(1904, bgb::new);
      $$0.addFixer(new axz($$75, "Added Cats", bdt.y));
      $$0.addFixer(new azx($$75, false));
      Schema $$76 = $$0.addSchema(1905, c);
      $$0.addFixer(new azk($$76, false));
      Schema $$77 = $$0.addSchema(1906, bgc::new);
      $$0.addFixer(new axz($$77, "Add POI Blocks", bdt.s));
      Schema $$78 = $$0.addSchema(1909, bgd::new);
      $$0.addFixer(new axz($$78, "Add jigsaw", bdt.s));
      Schema $$79 = $$0.addSchema(1911, c);
      $$0.addFixer(new azl($$79, false));
      Schema $$80 = $$0.addSchema(1914, c);
      $$0.addFixer(new beu($$80, false));
      Schema $$81 = $$0.addSchema(1917, c);
      $$0.addFixer(new ayx($$81, false));
      Schema $$82 = $$0.addSchema(1918, c);
      $$0.addFixer(new bep($$82, "minecraft:villager"));
      $$0.addFixer(new bep($$82, "minecraft:zombie_villager"));
      Schema $$83 = $$0.addSchema(1920, bge::new);
      $$0.addFixer(new bcw($$83, false));
      $$0.addFixer(new axz($$83, "Add campfire", bdt.s));
      Schema $$84 = $$0.addSchema(1925, c);
      $$0.addFixer(new bco($$84, false));
      Schema $$85 = $$0.addSchema(1928, bgf::new);
      $$0.addFixer(new bao($$85, true));
      $$0.addFixer(bbv.a($$85, "Rename ravager egg item", a(bao.a)));
      Schema $$86 = $$0.addSchema(1929, bgg::new);
      $$0.addFixer(new axz($$86, "Add Wandering Trader and Trader Llama", bdt.y));
      Schema $$87 = $$0.addSchema(1931, bgh::new);
      $$0.addFixer(new axz($$87, "Added Fox", bdt.y));
      Schema $$88 = $$0.addSchema(1936, c);
      $$0.addFixer(new bdc($$88, false));
      Schema $$89 = $$0.addSchema(1946, c);
      $$0.addFixer(new bdz($$89, false));
      Schema $$90 = $$0.addSchema(1948, c);
      $$0.addFixer(new bda($$90));
      Schema $$91 = $$0.addSchema(1953, c);
      $$0.addFixer(new bcz($$91, false));
      Schema $$92 = $$0.addSchema(1955, c);
      $$0.addFixer(new ber($$92, false));
      $$0.addFixer(new bez($$92, false));
      Schema $$93 = $$0.addSchema(1961, c);
      $$0.addFixer(new azg($$93, false));
      Schema $$94 = $$0.addSchema(1963, c);
      $$0.addFixer(new bdv($$94, false));
      Schema $$95 = $$0.addSchema(2100, bgi::new);
      $$0.addFixer(new axz($$95, "Added Bee and Bee Stinger", bdt.y));
      $$0.addFixer(new axz($$95, "Add beehive", bdt.s));
      $$0.addFixer(new bcv($$95, "Rename sugar recipe", bdt.G, a("minecraft:sugar", "sugar_from_sugar_cane")));
      $$0.addFixer(new ayb($$95, false, "Rename sugar recipe advancement", a("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane")));
      Schema $$96 = $$0.addSchema(2202, c);
      $$0.addFixer(new azc($$96, false));
      Schema $$97 = $$0.addSchema(2209, c);
      UnaryOperator<String> $$98 = a("minecraft:bee_hive", "minecraft:beehive");
      $$0.addFixer(bbv.a($$97, "Rename bee_hive item to beehive", $$98));
      $$0.addFixer(new bdn($$97, "Rename bee_hive poi to beehive", $$98));
      $$0.addFixer(ayu.a($$97, "Rename bee_hive block to beehive", $$98));
      Schema $$99 = $$0.addSchema(2211, c);
      $$0.addFixer(new bej($$99, false));
      Schema $$100 = $$0.addSchema(2218, c);
      $$0.addFixer(new bbi($$100, false));
      Schema $$101 = $$0.addSchema(2501, bgj::new);
      $$0.addFixer(new bbj($$101, true));
      Schema $$102 = $$0.addSchema(2502, bgk::new);
      $$0.addFixer(new axz($$102, "Added Hoglin", bdt.y));
      Schema $$103 = $$0.addSchema(2503, c);
      $$0.addFixer(new bet($$103, false));
      $$0.addFixer(new ayb($$103, false, "Composter category change", a("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter")));
      Schema $$104 = $$0.addSchema(2505, bgl::new);
      $$0.addFixer(new axz($$104, "Added Piglin", bdt.y));
      $$0.addFixer(new bcp($$104, "minecraft:villager"));
      Schema $$105 = $$0.addSchema(2508, c);
      $$0.addFixer(
         bbv.a(
            $$105,
            "Renamed fungi items to fungus",
            a(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      $$0.addFixer(
         ayu.a(
            $$105,
            "Renamed fungi blocks to fungus",
            a(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      Schema $$106 = $$0.addSchema(2509, bgm::new);
      $$0.addFixer(new bbd($$106));
      $$0.addFixer(bbv.a($$106, "Rename zombie pigman egg item", a(bbd.a)));
      Schema $$107 = $$0.addSchema(2511, c);
      $$0.addFixer(new bam($$107));
      Schema $$108 = $$0.addSchema(2514, c);
      $$0.addFixer(new bay($$108));
      $$0.addFixer(new ays($$108));
      $$0.addFixer(new bdl($$108));
      $$0.addFixer(new bcn($$108));
      $$0.addFixer(new beb($$108));
      $$0.addFixer(new bcd($$108));
      Schema $$109 = $$0.addSchema(2516, c);
      $$0.addFixer(new bbl($$109, "minecraft:villager"));
      $$0.addFixer(new bbl($$109, "minecraft:zombie_villager"));
      Schema $$110 = $$0.addSchema(2518, c);
      $$0.addFixer(new bcg($$110, false));
      $$0.addFixer(new bch($$110, false));
      Schema $$111 = $$0.addSchema(2519, bgn::new);
      $$0.addFixer(new axz($$111, "Added Strider", bdt.y));
      Schema $$112 = $$0.addSchema(2522, bgo::new);
      $$0.addFixer(new axz($$112, "Added Zoglin", bdt.y));
      Schema $$113 = $$0.addSchema(2523, c);
      $$0.addFixer(new ayc($$113));
      Schema $$114 = $$0.addSchema(2527, c);
      $$0.addFixer(new ayf($$114));
      Schema $$115 = $$0.addSchema(2528, c);
      $$0.addFixer(
         bbv.a(
            $$115,
            "Rename soul fire torch and soul fire lantern",
            a(ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))
         )
      );
      $$0.addFixer(
         ayu.a(
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
      $$0.addFixer(new bei($$116, false));
      Schema $$117 = $$0.addSchema(2531, c);
      $$0.addFixer(new bds($$117));
      Schema $$118 = $$0.addSchema(2533, c);
      $$0.addFixer(new beq($$118));
      Schema $$119 = $$0.addSchema(2535, c);
      $$0.addFixer(new bat($$119));
      Schema $$120 = $$0.addSchema(2538, c);
      $$0.addFixer(new bcm($$120));
      Schema $$121 = $$0.addSchema(2550, c);
      $$0.addFixer(new bew($$121));
      Schema $$122 = $$0.addSchema(2551, bgp::new);
      $$0.addFixer(new bey($$122, "add types to WorldGenData", bdt.J));
      Schema $$123 = $$0.addSchema(2552, c);
      $$0.addFixer(new bcv($$123, "Nether biome rename", bdt.H, a("minecraft:nether", "minecraft:nether_wastes")));
      Schema $$124 = $$0.addSchema(2553, c);
      $$0.addFixer(new bcv($$124, "Biomes fix", bdt.H, a(aye.a)));
      Schema $$125 = $$0.addSchema(2558, c);
      $$0.addFixer(new bcq($$125, false));
      $$0.addFixer(new bdj($$125, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
      Schema $$126 = $$0.addSchema(2568, bgq::new);
      $$0.addFixer(new axz($$126, "Added Piglin Brute", bdt.y));
      Schema $$127 = $$0.addSchema(2571, bgr::new);
      $$0.addFixer(new axz($$127, "Added Goat", bdt.y));
      Schema $$128 = $$0.addSchema(2679, c);
      $$0.addFixer(new ayy($$128, false));
      Schema $$129 = $$0.addSchema(2680, c);
      $$0.addFixer(bbv.a($$129, "Renamed grass path item to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      $$0.addFixer(ayu.a($$129, "Renamed grass path block to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      Schema $$130 = $$0.addSchema(2684, bgs::new);
      $$0.addFixer(new axz($$130, "Added Sculk Sensor", bdt.s));
      Schema $$131 = $$0.addSchema(2686, bgt::new);
      $$0.addFixer(new axz($$131, "Added Axolotl", bdt.y));
      Schema $$132 = $$0.addSchema(2688, bgu::new);
      $$0.addFixer(new axz($$132, "Added Glow Squid", bdt.y));
      $$0.addFixer(new axz($$132, "Added Glow Item Frame", bdt.y));
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
      $$0.addFixer(bbv.a($$133, "Renamed copper block items to new oxidized terms", a($$134)));
      $$0.addFixer(ayu.a($$133, "Renamed copper blocks to new oxidized terms", a($$134)));
      Schema $$135 = $$0.addSchema(2691, c);
      ImmutableMap<String, String> $$136 = ImmutableMap.builder()
         .put("minecraft:waxed_copper", "minecraft:waxed_copper_block")
         .put("minecraft:oxidized_copper_block", "minecraft:oxidized_copper")
         .put("minecraft:weathered_copper_block", "minecraft:weathered_copper")
         .put("minecraft:exposed_copper_block", "minecraft:exposed_copper")
         .build();
      $$0.addFixer(bbv.a($$135, "Rename copper item suffixes", a($$136)));
      $$0.addFixer(ayu.a($$135, "Rename copper blocks suffixes", a($$136)));
      Schema $$137 = $$0.addSchema(2693, c);
      $$0.addFixer(new axy($$137, bdt.J, "has_increased_height_already", false));
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
      $$0.addFixer(bbv.a($$138, "Renamed grimstone block items to deepslate", a($$139)));
      $$0.addFixer(ayu.a($$138, "Renamed grimstone blocks to deepslate", a($$139)));
      Schema $$140 = $$0.addSchema(2700, c);
      $$0.addFixer(
         ayu.a(
            $$140,
            "Renamed cave vines blocks",
            a(ImmutableMap.of("minecraft:cave_vines_head", "minecraft:cave_vines", "minecraft:cave_vines_body", "minecraft:cave_vines_plant"))
         )
      );
      Schema $$141 = $$0.addSchema(2701, c);
      $$0.addFixer(new bea($$141));
      Schema $$142 = $$0.addSchema(2702, c);
      $$0.addFixer(new axv($$142));
      Schema $$143 = $$0.addSchema(2704, bgv::new);
      $$0.addFixer(new axz($$143, "Added Goat", bdt.y));
      Schema $$144 = $$0.addSchema(2707, bgw::new);
      $$0.addFixer(new axz($$144, "Added Marker", bdt.y));
      $$0.addFixer(new axy($$144, bdt.J, "has_increased_height_already", true));
      Schema $$145 = $$0.addSchema(2710, c);
      $$0.addFixer(new beh($$145, "Renamed play_one_minute stat to play_time", ImmutableMap.of("minecraft:play_one_minute", "minecraft:play_time")));
      Schema $$146 = $$0.addSchema(2717, c);
      $$0.addFixer(bbv.a($$146, "Rename azalea_leaves_flowers", a(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves"))));
      $$0.addFixer(
         ayu.a($$146, "Rename azalea_leaves_flowers items", a(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves")))
      );
      Schema $$147 = $$0.addSchema(2825, c);
      $$0.addFixer(new axy($$147, bdt.J, "has_increased_height_already", false));
      Schema $$148 = $$0.addSchema(2831, bgx::new);
      $$0.addFixer(new bef($$148));
      Schema $$149 = $$0.addSchema(2832, bgy::new);
      $$0.addFixer(new bex($$149));
      $$0.addFixer(new azf($$149));
      Schema $$150 = $$0.addSchema(2833, c);
      $$0.addFixer(new bev($$150));
      Schema $$151 = $$0.addSchema(2838, c);
      $$0.addFixer(new bcv($$151, "Caves and Cliffs biome renames", bdt.H, a(ayz.a)));
      Schema $$152 = $$0.addSchema(2841, c);
      $$0.addFixer(new azi($$152));
      Schema $$153 = $$0.addSchema(2842, bgz::new);
      $$0.addFixer(new azj($$153));
      Schema $$154 = $$0.addSchema(2843, c);
      $$0.addFixer(new bdk($$154));
      $$0.addFixer(new bcv($$154, "Remove Deep Warm Ocean", bdt.H, a("minecraft:deep_warm_ocean", "minecraft:warm_ocean")));
      Schema $$155 = $$0.addSchema(2846, c);
      $$0.addFixer(
         new ayb(
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
      $$0.addFixer(new bev($$156));
      Schema $$157 = $$0.addSchema(2967, c);
      $$0.addFixer(new bek($$157));
      Schema $$158 = $$0.addSchema(2970, c);
      $$0.addFixer(new bel($$158));
      Schema $$159 = $$0.addSchema(3076, bha::new);
      $$0.addFixer(new axz($$159, "Added Sculk Catalyst", bdt.s));
      Schema $$160 = $$0.addSchema(3077, c);
      $$0.addFixer(new azd($$160));
      Schema $$161 = $$0.addSchema(3078, bhb::new);
      $$0.addFixer(new axz($$161, "Added Frog", bdt.y));
      $$0.addFixer(new axz($$161, "Added Tadpole", bdt.y));
      $$0.addFixer(new axz($$161, "Added Sculk Shrieker", bdt.s));
      Schema $$162 = $$0.addSchema(3081, bhc::new);
      $$0.addFixer(new axz($$162, "Added Warden", bdt.y));
      Schema $$163 = $$0.addSchema(3082, bhd::new);
      $$0.addFixer(new axz($$163, "Added Chest Boat", bdt.y));
      Schema $$164 = $$0.addSchema(3083, bhe::new);
      $$0.addFixer(new axz($$164, "Added Allay", bdt.y));
      Schema $$165 = $$0.addSchema(3084, c);
      $$0.addFixer(
         new bcv(
            $$165,
            "game_event_renames_3084",
            bdt.B,
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
      $$0.addFixer(new baz($$166, "Change cat variant type", bdt.y, "minecraft:cat", "CatType", ac.a(new Int2ObjectOpenHashMap(), $$0x -> {
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
      $$0.addFixer(new azp($$166, "Migrate cat variant advancement", "minecraft:husbandry/complete_catalogue", $$1x -> (String)$$167.getOrDefault($$1x, $$1x)));
      Schema $$168 = $$0.addSchema(3087, c);
      $$0.addFixer(new baz($$168, "Change frog variant type", bdt.y, "minecraft:frog", "Variant", ac.a(new Int2ObjectOpenHashMap(), $$0x -> {
         $$0x.put(0, "minecraft:temperate");
         $$0x.put(1, "minecraft:warm");
         $$0x.put(2, "minecraft:cold");
      })::get));
      Schema $$169 = $$0.addSchema(3090, c);
      $$0.addFixer(new baj($$169));
      Schema $$170 = $$0.addSchema(3093, c);
      $$0.addFixer(new bac($$170));
      Schema $$171 = $$0.addSchema(3094, c);
      $$0.addFixer(new bbk($$171));
      Schema $$172 = $$0.addSchema(3097, c);
      $$0.addFixer(new bbf($$172));
      $$0.addFixer(new bbg($$172));
      Map<String, String> $$173 = Map.of("minecraft:british", "minecraft:british_shorthair");
      $$0.addFixer(new beo($$172, "Rename british shorthair", bdt.y, "minecraft:cat", $$173));
      $$0.addFixer(
         new azp(
            $$172, "Migrate cat variant advancement for british shorthair", "minecraft:husbandry/complete_catalogue", $$1x -> $$173.getOrDefault($$1x, $$1x)
         )
      );
      $$0.addFixer(new bdm($$172, "Remove unpopulated villager PoI types", Set.of("minecraft:unemployed", "minecraft:nitwit")::contains));
      Schema $$174 = $$0.addSchema(3108, c);
      $$0.addFixer(new ayh($$174));
      Schema $$175 = $$0.addSchema(3201, c);
      $$0.addFixer(new bdi($$175));
      Schema $$176 = $$0.addSchema(3202, bhf::new);
      $$0.addFixer(new axz($$176, "Added Hanging Sign", bdt.s));
      Schema $$177 = $$0.addSchema(3203, bhg::new);
      $$0.addFixer(new axz($$177, "Added Camel", bdt.y));
      Schema $$178 = $$0.addSchema(3204, bhh::new);
      $$0.addFixer(new axz($$178, "Added Chiseled Bookshelf", bdt.s));
      Schema $$179 = $$0.addSchema(3209, c);
      $$0.addFixer(new bca($$179, false, "minecraft:pig_spawn_egg"));
      Schema $$180 = $$0.addSchema(3214, c);
      $$0.addFixer(new bdd($$180));
      Schema $$181 = $$0.addSchema(3319, c);
      $$0.addFixer(new bdb($$181));
      Schema $$182 = $$0.addSchema(3322, c);
      $$0.addFixer(new azt($$182));
      Schema $$183 = $$0.addSchema(3325, bhi::new);
      $$0.addFixer(new axz($$183, "Added displays", bdt.y));
      Schema $$184 = $$0.addSchema(3326, bhj::new);
      $$0.addFixer(new axz($$184, "Added Sniffer", bdt.y));
      Schema $$185 = $$0.addSchema(3327, bhk::new);
      $$0.addFixer(new axz($$185, "Archaeology", bdt.s));
      Schema $$186 = $$0.addSchema(3328, bhl::new);
      $$0.addFixer(new axz($$186, "Added interaction", bdt.y));
      Schema $$187 = $$0.addSchema(3438, bhm::new);
      $$0.addFixer(ayo.a($$187, "Rename Suspicious Sand to Brushable Block", a("minecraft:suspicious_sand", "minecraft:brushable_block")));
      $$0.addFixer(new azw($$187));
      $$0.addFixer(
         bbv.a(
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
      $$0.addFixer(new axz($$187, "Added calibrated sculk sensor", bdt.s));
      Schema $$188 = $$0.addSchema(3439, c);
      $$0.addFixer(new ayq($$188, "Updated sign text format for Signs", "minecraft:sign"));
      $$0.addFixer(new ayq($$188, "Updated sign text format for Hanging Signs", "minecraft:hanging_sign"));
      Schema $$189 = $$0.addSchema(3440, c);
      $$0.addFixer(new bcv($$189, "Replace experimental 1.20 overworld", bdt.I, a("minecraft:overworld_update_1_20", "minecraft:overworld")));
      $$0.addFixer(new bbe($$189, "Remove 1.20 feature toggle", Set.of("minecraft:update_1_20")));
      Schema $$190 = $$0.addSchema(3441, c);
      $$0.addFixer(new ayg($$190));
      Schema $$191 = $$0.addSchema(3447, c);
      $$0.addFixer(
         bbv.a(
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
      Schema $$192 = $$0.addSchema(3448, bhn::new);
      $$0.addFixer(new azq($$192));
      Schema $$193 = $$0.addSchema(3450, c);
      $$0.addFixer(
         new bdu(
            $$193,
            "Remove liquid_carvers and heightmap chunk statuses",
            a(Map.of("minecraft:liquid_carvers", "minecraft:carvers", "minecraft:heightmaps", "minecraft:spawn"))
         )
      );
      Schema $$194 = $$0.addSchema(3451, c);
      $$0.addFixer(new aze($$194));
      Schema $$195 = $$0.addSchema(3459, c);
      $$0.addFixer(new bcj($$195));
      Schema $$196 = $$0.addSchema(3564, c);
      $$0.addFixer(new azr($$196, "Drop invalid sign datafix data", "minecraft:sign"));
      $$0.addFixer(new azr($$196, "Drop invalid hanging sign datafix data", "minecraft:hanging_sign"));
      Schema $$197 = $$0.addSchema(3565, c);
      $$0.addFixer(new bdp($$197));
      Schema $$198 = $$0.addSchema(3566, c);
      $$0.addFixer(new bec($$198));
      Schema $$199 = $$0.addSchema(3568, c);
      $$0.addFixer(new bcr($$199));
      Schema $$200 = $$0.addSchema(3682, bho::new);
      $$0.addFixer(new axz($$200, "Added Crafter", bdt.s));
      Schema $$201 = $$0.addSchema(3683, bhp::new);
      $$0.addFixer(new bdo($$201));
      Schema $$202 = $$0.addSchema(3685, bhq::new);
      $$0.addFixer(new bbh($$202));
      Schema $$203 = $$0.addSchema(3689, bhr::new);
      $$0.addFixer(new axz($$203, "Added Breeze", bdt.y));
      $$0.addFixer(new axz($$203, "Added Trial Spawner", bdt.s));
      Schema $$204 = $$0.addSchema(3692, c);
      UnaryOperator<String> $$205 = a(Map.of("minecraft:grass", "minecraft:short_grass"));
      $$0.addFixer(ayu.a($$204, "Rename grass block to short_grass", $$205));
      $$0.addFixer(bbv.a($$204, "Rename grass item to short_grass", $$205));
      Schema $$206 = $$0.addSchema(3799, bhs::new);
      $$0.addFixer(new axz($$206, "Added Armadillo", bdt.y));
      Schema $$207 = $$0.addSchema(3800, c);
      UnaryOperator<String> $$208 = a(Map.of("minecraft:scute", "minecraft:turtle_scute"));
      $$0.addFixer(bbv.a($$207, "Rename scute item to turtle_scute", $$208));
      Schema $$209 = $$0.addSchema(3803, c);
      $$0.addFixer(new bdw($$209, "Rename sweeping enchant to sweeping_edge", Map.of("minecraft:sweeping", "minecraft:sweeping_edge")));
      Schema $$210 = $$0.addSchema(3807, bht::new);
      $$0.addFixer(new axz($$210, "Added Vault", bdt.s));
      Schema $$211 = $$0.addSchema(3808, bhu::new);
      $$0.addFixer(new bbn($$211, "minecraft:horse", "ArmorItem"));
      Schema $$212 = $$0.addSchema(3808, 1, bhv::new);
      $$0.addFixer(new bbn($$212, "minecraft:llama", "DecorItem"));
      Schema $$213 = $$0.addSchema(3809, c);
      $$0.addFixer(new aza($$213));
   }

   private static UnaryOperator<String> a(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault($$1, $$1);
   }

   private static UnaryOperator<String> a(String $$0, String $$1) {
      return $$2 -> Objects.equals($$2, $$0) ? $$1 : $$2;
   }
}
