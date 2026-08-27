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

public class auy {
   private static final BiFunction<Integer, Schema, Schema> b = Schema::new;
   private static final BiFunction<Integer, Schema, Schema> c = bcf::new;
   private static final DataFixer d = a(aa.aU);
   public static final int a = 3441;

   private auy() {
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
      $$0.addSchema(99, bfc::new);
      Schema $$1 = $$0.addSchema(100, bcg::new);
      $$0.addFixer(new axg($$1, true));
      Schema $$2 = $$0.addSchema(101, b);
      $$0.addFixer(new avw($$2, false));
      Schema $$3 = $$0.addSchema(102, bch::new);
      $$0.addFixer(new ayv($$3, true));
      $$0.addFixer(new ayx($$3, false));
      Schema $$4 = $$0.addSchema(105, b);
      $$0.addFixer(new azb($$4, true));
      Schema $$5 = $$0.addSchema(106, bcj::new);
      $$0.addFixer(new azw($$5, true));
      Schema $$6 = $$0.addSchema(107, bck::new);
      $$0.addFixer(new axn($$6, true));
      Schema $$7 = $$0.addSchema(108, b);
      $$0.addFixer(new aya($$7, true));
      Schema $$8 = $$0.addSchema(109, b);
      $$0.addFixer(new axi($$8, true));
      Schema $$9 = $$0.addSchema(110, b);
      $$0.addFixer(new axj($$9, true));
      Schema $$10 = $$0.addSchema(111, b);
      $$0.addFixer(new axp($$10, true));
      Schema $$11 = $$0.addSchema(113, b);
      $$0.addFixer(new axu($$11, true));
      Schema $$12 = $$0.addSchema(135, bcm::new);
      $$0.addFixer(new axw($$12, true));
      Schema $$13 = $$0.addSchema(143, bcn::new);
      $$0.addFixer(new ayc($$13, true));
      Schema $$14 = $$0.addSchema(147, b);
      $$0.addFixer(new awz($$14, true));
      Schema $$15 = $$0.addSchema(165, b);
      $$0.addFixer(new azj($$15, true));
      Schema $$16 = $$0.addSchema(501, beu::new);
      $$0.addFixer(new ave($$16, "Add 1.10 entities fix", bax.x));
      Schema $$17 = $$0.addSchema(502, b);
      $$0.addFixer(ayz.a($$17, "cooked_fished item renamer", $$0x -> Objects.equals(bcf.a($$0x), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : $$0x));
      $$0.addFixer(new ayh($$17, false));
      Schema $$18 = $$0.addSchema(505, b);
      $$0.addFixer(new bai($$18, false));
      Schema $$19 = $$0.addSchema(700, bev::new);
      $$0.addFixer(new axf($$19, true));
      Schema $$20 = $$0.addSchema(701, bew::new);
      $$0.addFixer(new axz($$20, true));
      Schema $$21 = $$0.addSchema(702, bex::new);
      $$0.addFixer(new ayg($$21, true));
      Schema $$22 = $$0.addSchema(703, bey::new);
      $$0.addFixer(new axk($$22, true));
      Schema $$23 = $$0.addSchema(704, bez::new);
      $$0.addFixer(new avq($$23, true));
      Schema $$24 = $$0.addSchema(705, bfa::new);
      $$0.addFixer(new axl($$24, true));
      Schema $$25 = $$0.addSchema(804, c);
      $$0.addFixer(new ayt($$25, true));
      Schema $$26 = $$0.addSchema(806, c);
      $$0.addFixer(new azi($$26, false));
      Schema $$27 = $$0.addSchema(808, bfb::new);
      $$0.addFixer(new ave($$27, "added shulker box", bax.s));
      Schema $$28 = $$0.addSchema(808, 1, c);
      $$0.addFixer(new axx($$28, false));
      Schema $$29 = $$0.addSchema(813, c);
      $$0.addFixer(new aza($$29, false));
      $$0.addFixer(new avu($$29, false));
      Schema $$30 = $$0.addSchema(816, c);
      $$0.addFixer(new bal($$30, false));
      Schema $$31 = $$0.addSchema(820, c);
      $$0.addFixer(ayz.a($$31, "totem item renamer", a("minecraft:totem", "minecraft:totem_of_undying")));
      Schema $$32 = $$0.addSchema(1022, bci::new);
      $$0.addFixer(new bcb($$32, "added shoulder entities to players", bax.b));
      Schema $$33 = $$0.addSchema(1125, bcl::new);
      $$0.addFixer(new awg($$33, true));
      $$0.addFixer(new avi($$33, false));
      Schema $$34 = $$0.addSchema(1344, c);
      $$0.addFixer(new baj($$34, false));
      Schema $$35 = $$0.addSchema(1446, c);
      $$0.addFixer(new bak($$35, false));
      Schema $$36 = $$0.addSchema(1450, c);
      $$0.addFixer(new awc($$36, false));
      Schema $$37 = $$0.addSchema(1451, bco::new);
      $$0.addFixer(new ave($$37, "AddTrappedChestFix", bax.s));
      Schema $$38 = $$0.addSchema(1451, 1, bcp::new);
      $$0.addFixer(new awm($$38, true));
      Schema $$39 = $$0.addSchema(1451, 2, bcq::new);
      $$0.addFixer(new avo($$39, true));
      Schema $$40 = $$0.addSchema(1451, 3, bcr::new);
      $$0.addFixer(new axa($$40, true));
      $$0.addFixer(new azd($$40, false));
      Schema $$41 = $$0.addSchema(1451, 4, bcs::new);
      $$0.addFixer(new avy($$41, true));
      $$0.addFixer(new azg($$41, false));
      Schema $$42 = $$0.addSchema(1451, 5, bct::new);
      $$0.addFixer(
         new ayy(
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
      $$0.addFixer(new ave($$42, "RemoveNoteBlockFlowerPotFix", bax.s));
      $$0.addFixer(new aze($$42, false, "minecraft:spawn_egg"));
      $$0.addFixer(new ayf($$42, false));
      $$0.addFixer(new avn($$42, false));
      $$0.addFixer(new azp($$42, false));
      Schema $$43 = $$0.addSchema(1451, 6, bcu::new);
      $$0.addFixer(new bbj($$43, true));
      $$0.addFixer(new avr($$43, false));
      Schema $$44 = $$0.addSchema(1451, 7, c);
      $$0.addFixer(new bbv($$44, false));
      Schema $$45 = $$0.addSchema(1456, c);
      $$0.addFixer(new axm($$45, false));
      Schema $$46 = $$0.addSchema(1458, c);
      $$0.addFixer(new axe($$46, false));
      $$0.addFixer(new ayu($$46, false));
      $$0.addFixer(new avp($$46, false));
      Schema $$47 = $$0.addSchema(1460, bcv::new);
      $$0.addFixer(new axq($$47, false));
      Schema $$48 = $$0.addSchema(1466, bcw::new);
      $$0.addFixer(new ave($$48, "Add DUMMY block entity", bax.s));
      $$0.addFixer(new aws($$48, true));
      Schema $$49 = $$0.addSchema(1470, bcx::new);
      $$0.addFixer(new ave($$49, "Add 1.13 entities fix", bax.x));
      Schema $$50 = $$0.addSchema(1474, c);
      $$0.addFixer(new awt($$50, false));
      $$0.addFixer(
         avz.a($$50, "Colorless shulker block fixer", $$0x -> Objects.equals(bcf.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      $$0.addFixer(
         ayz.a($$50, "Colorless shulker item fixer", $$0x -> Objects.equals(bcf.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      Schema $$51 = $$0.addSchema(1475, c);
      $$0.addFixer(avz.a($$51, "Flowing fixer", a(ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava"))));
      Schema $$52 = $$0.addSchema(1480, c);
      $$0.addFixer(avz.a($$52, "Rename coral blocks", a(bbb.a)));
      $$0.addFixer(ayz.a($$52, "Rename coral items", a(bbb.a)));
      Schema $$53 = $$0.addSchema(1481, bcy::new);
      $$0.addFixer(new ave($$53, "Add conduit", bax.s));
      Schema $$54 = $$0.addSchema(1483, bcz::new);
      $$0.addFixer(new axs($$54, true));
      $$0.addFixer(ayz.a($$54, "Rename pufferfish egg item", a(axs.a)));
      Schema $$55 = $$0.addSchema(1484, c);
      $$0.addFixer(
         ayz.a(
            $$55,
            "Rename seagrass items",
            a(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(
         avz.a(
            $$55,
            "Rename seagrass blocks",
            a(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(new ayr($$55, false));
      Schema $$56 = $$0.addSchema(1486, bda::new);
      $$0.addFixer(new axd($$56, true));
      $$0.addFixer(ayz.a($$56, "Rename cod/salmon egg items", a(axd.b)));
      Schema $$57 = $$0.addSchema(1487, c);
      $$0.addFixer(
         ayz.a(
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
         avz.a(
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
      $$0.addFixer(avz.a($$58, "Rename kelp/kelptop", a(ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant"))));
      $$0.addFixer(ayz.a($$58, "Rename kelptop", a("minecraft:kelp_top", "minecraft:kelp")));
      $$0.addFixer(new azx($$58, false, "Command block block entity custom name fix", bax.s, "minecraft:command_block") {
         @Override
         protected Typed<?> a(Typed<?> $$0) {
            return $$0.update(DSL.remainderFinder(), axe::a);
         }
      });
      $$0.addFixer(new azx($$58, false, "Command block minecart custom name fix", bax.x, "minecraft:commandblock_minecart") {
         @Override
         protected Typed<?> a(Typed<?> $$0) {
            return $$0.update(DSL.remainderFinder(), axe::a);
         }
      });
      $$0.addFixer(new ays($$58, false));
      Schema $$59 = $$0.addSchema(1490, c);
      $$0.addFixer(avz.a($$59, "Rename melon_block", a("minecraft:melon_block", "minecraft:melon")));
      $$0.addFixer(
         ayz.a(
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
      $$0.addFixer(new awr($$60, false));
      Schema $$61 = $$0.addSchema(1494, c);
      $$0.addFixer(new azc($$61, false));
      Schema $$62 = $$0.addSchema(1496, c);
      $$0.addFixer(new azm($$62, false));
      Schema $$63 = $$0.addSchema(1500, c);
      $$0.addFixer(new avs($$63, false));
      Schema $$64 = $$0.addSchema(1501, c);
      $$0.addFixer(new avf($$64, false));
      Schema $$65 = $$0.addSchema(1502, c);
      $$0.addFixer(new azz($$65, "Recipes fix", bax.F, a(bau.a)));
      Schema $$66 = $$0.addSchema(1506, c);
      $$0.addFixer(new azo($$66, false));
      Schema $$67 = $$0.addSchema(1510, bdb::new);
      $$0.addFixer(avz.a($$67, "Block renamening fix", a(ayb.b)));
      $$0.addFixer(ayz.a($$67, "Item renamening fix", a(ayb.c)));
      $$0.addFixer(new azz($$67, "Recipes renamening fix", bax.F, a(bav.a)));
      $$0.addFixer(new ayb($$67, true));
      $$0.addFixer(
         new bbk(
            $$67,
            "SwimStatsRenameFix",
            ImmutableMap.of("minecraft:swim_one_cm", "minecraft:walk_on_water_one_cm", "minecraft:dive_one_cm", "minecraft:walk_under_water_one_cm")
         )
      );
      Schema $$68 = $$0.addSchema(1514, c);
      $$0.addFixer(new bab($$68, false));
      $$0.addFixer(new bbp($$68, false));
      $$0.addFixer(new bac($$68, false));
      Schema $$69 = $$0.addSchema(1515, c);
      $$0.addFixer(avz.a($$69, "Rename coral fan blocks", a(bba.a)));
      Schema $$70 = $$0.addSchema(1624, c);
      $$0.addFixer(new bbq($$70, false));
      Schema $$71 = $$0.addSchema(1800, bdc::new);
      $$0.addFixer(new ave($$71, "Added 1.14 mobs fix", bax.x));
      $$0.addFixer(ayz.a($$71, "Rename dye items", a(awx.a)));
      Schema $$72 = $$0.addSchema(1801, bdd::new);
      $$0.addFixer(new ave($$72, "Added Illager Beast", bax.x));
      Schema $$73 = $$0.addSchema(1802, c);
      $$0.addFixer(
         avz.a(
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
         ayz.a(
            $$73,
            "Rename sign item & stone slabs",
            a(ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))
         )
      );
      Schema $$74 = $$0.addSchema(1803, c);
      $$0.addFixer(new ayw($$74, false));
      Schema $$75 = $$0.addSchema(1904, bde::new);
      $$0.addFixer(new ave($$75, "Added Cats", bax.x));
      $$0.addFixer(new axc($$75, false));
      Schema $$76 = $$0.addSchema(1905, c);
      $$0.addFixer(new awp($$76, false));
      Schema $$77 = $$0.addSchema(1906, bdf::new);
      $$0.addFixer(new ave($$77, "Add POI Blocks", bax.s));
      Schema $$78 = $$0.addSchema(1909, bdg::new);
      $$0.addFixer(new ave($$78, "Add jigsaw", bax.s));
      Schema $$79 = $$0.addSchema(1911, c);
      $$0.addFixer(new awq($$79, false));
      Schema $$80 = $$0.addSchema(1914, c);
      $$0.addFixer(new bbx($$80, false));
      Schema $$81 = $$0.addSchema(1917, c);
      $$0.addFixer(new awd($$81, false));
      Schema $$82 = $$0.addSchema(1918, c);
      $$0.addFixer(new bbs($$82, "minecraft:villager"));
      $$0.addFixer(new bbs($$82, "minecraft:zombie_villager"));
      Schema $$83 = $$0.addSchema(1920, bdh::new);
      $$0.addFixer(new baa($$83, false));
      $$0.addFixer(new ave($$83, "Add campfire", bax.s));
      Schema $$84 = $$0.addSchema(1925, c);
      $$0.addFixer(new azs($$84, false));
      Schema $$85 = $$0.addSchema(1928, bdi::new);
      $$0.addFixer(new axt($$85, true));
      $$0.addFixer(ayz.a($$85, "Rename ravager egg item", a(axt.a)));
      Schema $$86 = $$0.addSchema(1929, bdj::new);
      $$0.addFixer(new ave($$86, "Add Wandering Trader and Trader Llama", bax.x));
      Schema $$87 = $$0.addSchema(1931, bdk::new);
      $$0.addFixer(new ave($$87, "Added Fox", bax.x));
      Schema $$88 = $$0.addSchema(1936, c);
      $$0.addFixer(new bag($$88, false));
      Schema $$89 = $$0.addSchema(1946, c);
      $$0.addFixer(new bbc($$89, false));
      Schema $$90 = $$0.addSchema(1948, c);
      $$0.addFixer(new bae($$90));
      Schema $$91 = $$0.addSchema(1953, c);
      $$0.addFixer(new bad($$91, false));
      Schema $$92 = $$0.addSchema(1955, c);
      $$0.addFixer(new bbu($$92, false));
      $$0.addFixer(new bcc($$92, false));
      Schema $$93 = $$0.addSchema(1961, c);
      $$0.addFixer(new awl($$93, false));
      Schema $$94 = $$0.addSchema(1963, c);
      $$0.addFixer(new baz($$94, false));
      Schema $$95 = $$0.addSchema(2100, bdl::new);
      $$0.addFixer(new ave($$95, "Added Bee and Bee Stinger", bax.x));
      $$0.addFixer(new ave($$95, "Add beehive", bax.s));
      $$0.addFixer(new azz($$95, "Rename sugar recipe", bax.F, a("minecraft:sugar", "sugar_from_sugar_cane")));
      $$0.addFixer(new avg($$95, false, "Rename sugar recipe advancement", a("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane")));
      Schema $$96 = $$0.addSchema(2202, c);
      $$0.addFixer(new awh($$96, false));
      Schema $$97 = $$0.addSchema(2209, c);
      UnaryOperator<String> $$98 = a("minecraft:bee_hive", "minecraft:beehive");
      $$0.addFixer(ayz.a($$97, "Rename bee_hive item to beehive", $$98));
      $$0.addFixer(new bar($$97, "Rename bee_hive poi to beehive", $$98));
      $$0.addFixer(avz.a($$97, "Rename bee_hive block to beehive", $$98));
      Schema $$99 = $$0.addSchema(2211, c);
      $$0.addFixer(new bbm($$99, false));
      Schema $$100 = $$0.addSchema(2218, c);
      $$0.addFixer(new ayn($$100, false));
      Schema $$101 = $$0.addSchema(2501, bdm::new);
      $$0.addFixer(new ayo($$101, true));
      Schema $$102 = $$0.addSchema(2502, bdn::new);
      $$0.addFixer(new ave($$102, "Added Hoglin", bax.x));
      Schema $$103 = $$0.addSchema(2503, c);
      $$0.addFixer(new bbw($$103, false));
      $$0.addFixer(new avg($$103, false, "Composter category change", a("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter")));
      Schema $$104 = $$0.addSchema(2505, bdo::new);
      $$0.addFixer(new ave($$104, "Added Piglin", bax.x));
      $$0.addFixer(new azt($$104, "minecraft:villager"));
      Schema $$105 = $$0.addSchema(2508, c);
      $$0.addFixer(
         ayz.a(
            $$105,
            "Renamed fungi items to fungus",
            a(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      $$0.addFixer(
         avz.a(
            $$105,
            "Renamed fungi blocks to fungus",
            a(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      Schema $$106 = $$0.addSchema(2509, bdp::new);
      $$0.addFixer(new ayi($$106));
      $$0.addFixer(ayz.a($$106, "Rename zombie pigman egg item", a(ayi.a)));
      Schema $$107 = $$0.addSchema(2511, c);
      $$0.addFixer(new axr($$107));
      Schema $$108 = $$0.addSchema(2514, c);
      $$0.addFixer(new ayd($$108));
      $$0.addFixer(new avx($$108));
      $$0.addFixer(new bap($$108));
      $$0.addFixer(new azr($$108));
      $$0.addFixer(new bbe($$108));
      $$0.addFixer(new azh($$108));
      Schema $$109 = $$0.addSchema(2516, c);
      $$0.addFixer(new ayq($$109, "minecraft:villager"));
      $$0.addFixer(new ayq($$109, "minecraft:zombie_villager"));
      Schema $$110 = $$0.addSchema(2518, c);
      $$0.addFixer(new azk($$110, false));
      $$0.addFixer(new azl($$110, false));
      Schema $$111 = $$0.addSchema(2519, bdq::new);
      $$0.addFixer(new ave($$111, "Added Strider", bax.x));
      Schema $$112 = $$0.addSchema(2522, bdr::new);
      $$0.addFixer(new ave($$112, "Added Zoglin", bax.x));
      Schema $$113 = $$0.addSchema(2523, c);
      $$0.addFixer(new avh($$113));
      Schema $$114 = $$0.addSchema(2527, c);
      $$0.addFixer(new avk($$114));
      Schema $$115 = $$0.addSchema(2528, c);
      $$0.addFixer(
         ayz.a(
            $$115,
            "Rename soul fire torch and soul fire lantern",
            a(ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))
         )
      );
      $$0.addFixer(
         avz.a(
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
      $$0.addFixer(new bbl($$116, false));
      Schema $$117 = $$0.addSchema(2531, c);
      $$0.addFixer(new baw($$117));
      Schema $$118 = $$0.addSchema(2533, c);
      $$0.addFixer(new bbt($$118));
      Schema $$119 = $$0.addSchema(2535, c);
      $$0.addFixer(new axy($$119));
      Schema $$120 = $$0.addSchema(2538, c);
      $$0.addFixer(new azq($$120));
      Schema $$121 = $$0.addSchema(2550, c);
      $$0.addFixer(new bbz($$121));
      Schema $$122 = $$0.addSchema(2551, bds::new);
      $$0.addFixer(new bcb($$122, "add types to WorldGenData", bax.I));
      Schema $$123 = $$0.addSchema(2552, c);
      $$0.addFixer(new azz($$123, "Nether biome rename", bax.G, a("minecraft:nether", "minecraft:nether_wastes")));
      Schema $$124 = $$0.addSchema(2553, c);
      $$0.addFixer(new azz($$124, "Biomes fix", bax.G, a(avj.a)));
      Schema $$125 = $$0.addSchema(2558, c);
      $$0.addFixer(new azu($$125, false));
      $$0.addFixer(new ban($$125, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
      Schema $$126 = $$0.addSchema(2568, bdt::new);
      $$0.addFixer(new ave($$126, "Added Piglin Brute", bax.x));
      Schema $$127 = $$0.addSchema(2571, bdu::new);
      $$0.addFixer(new ave($$127, "Added Goat", bax.x));
      Schema $$128 = $$0.addSchema(2679, c);
      $$0.addFixer(new awe($$128, false));
      Schema $$129 = $$0.addSchema(2680, c);
      $$0.addFixer(ayz.a($$129, "Renamed grass path item to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      $$0.addFixer(awa.b($$129, "Renamed grass path block to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      Schema $$130 = $$0.addSchema(2684, bdv::new);
      $$0.addFixer(new ave($$130, "Added Sculk Sensor", bax.s));
      Schema $$131 = $$0.addSchema(2686, bdw::new);
      $$0.addFixer(new ave($$131, "Added Axolotl", bax.x));
      Schema $$132 = $$0.addSchema(2688, bdx::new);
      $$0.addFixer(new ave($$132, "Added Glow Squid", bax.x));
      $$0.addFixer(new ave($$132, "Added Glow Item Frame", bax.x));
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
      $$0.addFixer(ayz.a($$133, "Renamed copper block items to new oxidized terms", a($$134)));
      $$0.addFixer(awa.b($$133, "Renamed copper blocks to new oxidized terms", a($$134)));
      Schema $$135 = $$0.addSchema(2691, c);
      ImmutableMap<String, String> $$136 = ImmutableMap.builder()
         .put("minecraft:waxed_copper", "minecraft:waxed_copper_block")
         .put("minecraft:oxidized_copper_block", "minecraft:oxidized_copper")
         .put("minecraft:weathered_copper_block", "minecraft:weathered_copper")
         .put("minecraft:exposed_copper_block", "minecraft:exposed_copper")
         .build();
      $$0.addFixer(ayz.a($$135, "Rename copper item suffixes", a($$136)));
      $$0.addFixer(awa.b($$135, "Rename copper blocks suffixes", a($$136)));
      Schema $$137 = $$0.addSchema(2693, c);
      $$0.addFixer(new avd($$137, bax.I, "has_increased_height_already", false));
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
      $$0.addFixer(ayz.a($$138, "Renamed grimstone block items to deepslate", a($$139)));
      $$0.addFixer(awa.b($$138, "Renamed grimstone blocks to deepslate", a($$139)));
      Schema $$140 = $$0.addSchema(2700, c);
      $$0.addFixer(
         awa.b(
            $$140,
            "Renamed cave vines blocks",
            a(ImmutableMap.of("minecraft:cave_vines_head", "minecraft:cave_vines", "minecraft:cave_vines_body", "minecraft:cave_vines_plant"))
         )
      );
      Schema $$141 = $$0.addSchema(2701, c);
      $$0.addFixer(new bbd($$141));
      Schema $$142 = $$0.addSchema(2702, c);
      $$0.addFixer(new ava($$142));
      Schema $$143 = $$0.addSchema(2704, bdy::new);
      $$0.addFixer(new ave($$143, "Added Goat", bax.x));
      Schema $$144 = $$0.addSchema(2707, bdz::new);
      $$0.addFixer(new ave($$144, "Added Marker", bax.x));
      $$0.addFixer(new avd($$144, bax.I, "has_increased_height_already", true));
      Schema $$145 = $$0.addSchema(2710, c);
      $$0.addFixer(new bbk($$145, "Renamed play_one_minute stat to play_time", ImmutableMap.of("minecraft:play_one_minute", "minecraft:play_time")));
      Schema $$146 = $$0.addSchema(2717, c);
      $$0.addFixer(ayz.a($$146, "Rename azalea_leaves_flowers", a(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves"))));
      $$0.addFixer(
         avz.a($$146, "Rename azalea_leaves_flowers items", a(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves")))
      );
      Schema $$147 = $$0.addSchema(2825, c);
      $$0.addFixer(new avd($$147, bax.I, "has_increased_height_already", false));
      Schema $$148 = $$0.addSchema(2831, bea::new);
      $$0.addFixer(new bbi($$148));
      Schema $$149 = $$0.addSchema(2832, beb::new);
      $$0.addFixer(new bca($$149));
      $$0.addFixer(new awk($$149));
      Schema $$150 = $$0.addSchema(2833, c);
      $$0.addFixer(new bby($$150));
      Schema $$151 = $$0.addSchema(2838, c);
      $$0.addFixer(new azz($$151, "Caves and Cliffs biome renames", bax.G, a(awf.a)));
      Schema $$152 = $$0.addSchema(2841, c);
      $$0.addFixer(new awn($$152));
      Schema $$153 = $$0.addSchema(2842, bec::new);
      $$0.addFixer(new awo($$153));
      Schema $$154 = $$0.addSchema(2843, c);
      $$0.addFixer(new bao($$154));
      $$0.addFixer(new azz($$154, "Remove Deep Warm Ocean", bax.G, a("minecraft:deep_warm_ocean", "minecraft:warm_ocean")));
      Schema $$155 = $$0.addSchema(2846, c);
      $$0.addFixer(
         new avg(
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
      $$0.addFixer(new bby($$156));
      Schema $$157 = $$0.addSchema(2967, c);
      $$0.addFixer(new bbn($$157));
      Schema $$158 = $$0.addSchema(2970, c);
      $$0.addFixer(new bbo($$158));
      Schema $$159 = $$0.addSchema(3076, bed::new);
      $$0.addFixer(new ave($$159, "Added Sculk Catalyst", bax.s));
      Schema $$160 = $$0.addSchema(3077, c);
      $$0.addFixer(new awi($$160));
      Schema $$161 = $$0.addSchema(3078, bee::new);
      $$0.addFixer(new ave($$161, "Added Frog", bax.x));
      $$0.addFixer(new ave($$161, "Added Tadpole", bax.x));
      $$0.addFixer(new ave($$161, "Added Sculk Shrieker", bax.s));
      Schema $$162 = $$0.addSchema(3081, bef::new);
      $$0.addFixer(new ave($$162, "Added Warden", bax.x));
      Schema $$163 = $$0.addSchema(3082, beg::new);
      $$0.addFixer(new ave($$163, "Added Chest Boat", bax.x));
      Schema $$164 = $$0.addSchema(3083, beh::new);
      $$0.addFixer(new ave($$164, "Added Allay", bax.x));
      Schema $$165 = $$0.addSchema(3084, c);
      $$0.addFixer(
         new azz(
            $$165,
            "game_event_renames_3084",
            bax.A,
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
      $$0.addFixer(new aye($$166, "Change cat variant type", bax.x, "minecraft:cat", "CatType", ac.a(new Int2ObjectOpenHashMap(), $$0x -> {
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
      $$0.addFixer(new awu($$166, "Migrate cat variant advancement", "minecraft:husbandry/complete_catalogue", $$1x -> (String)$$167.getOrDefault($$1x, $$1x)));
      Schema $$168 = $$0.addSchema(3087, c);
      $$0.addFixer(new aye($$168, "Change frog variant type", bax.x, "minecraft:frog", "Variant", ac.a(new Int2ObjectOpenHashMap(), $$0x -> {
         $$0x.put(0, "minecraft:temperate");
         $$0x.put(1, "minecraft:warm");
         $$0x.put(2, "minecraft:cold");
      })::get));
      Schema $$169 = $$0.addSchema(3090, c);
      $$0.addFixer(new axo($$169));
      Schema $$170 = $$0.addSchema(3093, c);
      $$0.addFixer(new axh($$170));
      Schema $$171 = $$0.addSchema(3094, c);
      $$0.addFixer(new ayp($$171));
      Schema $$172 = $$0.addSchema(3097, c);
      $$0.addFixer(new ayk($$172));
      $$0.addFixer(new ayl($$172));
      Map<String, String> $$173 = Map.of("minecraft:british", "minecraft:british_shorthair");
      $$0.addFixer(new bbr($$172, "Rename british shorthair", bax.x, "minecraft:cat", $$173));
      $$0.addFixer(
         new awu(
            $$172, "Migrate cat variant advancement for british shorthair", "minecraft:husbandry/complete_catalogue", $$1x -> $$173.getOrDefault($$1x, $$1x)
         )
      );
      $$0.addFixer(new baq($$172, "Remove unpopulated villager PoI types", Set.of("minecraft:unemployed", "minecraft:nitwit")::contains));
      Schema $$174 = $$0.addSchema(3108, c);
      $$0.addFixer(new avm($$174));
      Schema $$175 = $$0.addSchema(3201, c);
      $$0.addFixer(new bam($$175));
      Schema $$176 = $$0.addSchema(3202, bei::new);
      $$0.addFixer(new ave($$176, "Added Hanging Sign", bax.s));
      Schema $$177 = $$0.addSchema(3203, bej::new);
      $$0.addFixer(new ave($$177, "Added Camel", bax.x));
      Schema $$178 = $$0.addSchema(3204, bek::new);
      $$0.addFixer(new ave($$178, "Added Chiseled Bookshelf", bax.s));
      Schema $$179 = $$0.addSchema(3209, c);
      $$0.addFixer(new aze($$179, false, "minecraft:pig_spawn_egg"));
      Schema $$180 = $$0.addSchema(3214, c);
      $$0.addFixer(new bah($$180));
      Schema $$181 = $$0.addSchema(3319, c);
      $$0.addFixer(new baf($$181));
      Schema $$182 = $$0.addSchema(3322, c);
      $$0.addFixer(new awy($$182));
      Schema $$183 = $$0.addSchema(3325, bel::new);
      $$0.addFixer(new ave($$183, "Added displays", bax.x));
      Schema $$184 = $$0.addSchema(3326, bem::new);
      $$0.addFixer(new ave($$184, "Added Sniffer", bax.x));
      Schema $$185 = $$0.addSchema(3327, ben::new);
      $$0.addFixer(new ave($$185, "Archaeology", bax.s));
      Schema $$186 = $$0.addSchema(3328, beo::new);
      $$0.addFixer(new ave($$186, "Added interaction", bax.x));
      Schema $$187 = $$0.addSchema(3438, bep::new);
      $$0.addFixer(avt.a($$187, "Rename Suspicious Sand to Brushable Block", a("minecraft:suspicious_sand", "minecraft:brushable_block")));
      $$0.addFixer(new axb($$187));
      $$0.addFixer(
         ayz.a(
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
      $$0.addFixer(new ave($$187, "Added calibrated sculk sensor", bax.s));
      Schema $$188 = $$0.addSchema(3439, c);
      $$0.addFixer(new avv($$188, "Updated sign text format for Signs", "minecraft:sign"));
      $$0.addFixer(new avv($$188, "Updated sign text format for Hanging Signs", "minecraft:hanging_sign"));
      Schema $$189 = $$0.addSchema(3440, c);
      $$0.addFixer(new azz($$189, "Replace experimental 1.20 overworld", bax.H, a("minecraft:overworld_update_1_20", "minecraft:overworld")));
      $$0.addFixer(new ayj($$189, "Remove 1.20 feature toggle", Set.of("minecraft:update_1_20")));
      Schema $$190 = $$0.addSchema(3441, c);
      $$0.addFixer(new avl($$190));
      Schema $$191 = $$0.addSchema(3447, c);
      $$0.addFixer(
         ayz.a(
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
      Schema $$192 = $$0.addSchema(3448, beq::new);
      $$0.addFixer(new awv($$192));
      Schema $$193 = $$0.addSchema(3450, c);
      $$0.addFixer(
         new bay(
            $$193,
            "Remove liquid_carvers and heightmap chunk statuses",
            a(Map.of("minecraft:liquid_carvers", "minecraft:carvers", "minecraft:heightmaps", "minecraft:spawn"))
         )
      );
      Schema $$194 = $$0.addSchema(3451, c);
      $$0.addFixer(new awj($$194));
      Schema $$195 = $$0.addSchema(3459, c);
      $$0.addFixer(new azn($$195));
      Schema $$196 = $$0.addSchema(3564, c);
      $$0.addFixer(new aww($$196, "Drop invalid sign datafix data", "minecraft:sign"));
      $$0.addFixer(new aww($$196, "Drop invalid hanging sign datafix data", "minecraft:hanging_sign"));
      Schema $$197 = $$0.addSchema(3565, c);
      $$0.addFixer(new bat($$197));
      Schema $$198 = $$0.addSchema(3566, c);
      $$0.addFixer(new bbf($$198));
      Schema $$199 = $$0.addSchema(3568, c);
      $$0.addFixer(new azv($$199));
      Schema $$200 = $$0.addSchema(3682, ber::new);
      $$0.addFixer(new ave($$200, "Added Crafter", bax.s));
      Schema $$201 = $$0.addSchema(3683, bes::new);
      $$0.addFixer(new bas($$201));
      Schema $$202 = $$0.addSchema(3685, bet::new);
      $$0.addFixer(new aym($$202));
   }

   private static UnaryOperator<String> a(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault($$1, $$1);
   }

   private static UnaryOperator<String> a(String $$0, String $$1) {
      return $$2 -> Objects.equals($$2, $$0) ? $$1 : $$2;
   }
}
