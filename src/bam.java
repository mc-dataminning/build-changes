import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.DataFixerBuilder.Result;
import com.mojang.datafixers.schemas.Schema;
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

public class bam {
   private static final BiFunction<Integer, Schema, Schema> b = Schema::new;
   private static final BiFunction<Integer, Schema, Schema> c = biw::new;
   private static final Result d = b();
   public static final int a = 3441;

   private bam() {
   }

   public static DataFixer a() {
      return d.fixer();
   }

   private static Result b() {
      DataFixerBuilder $$0 = new DataFixerBuilder(ab.b().d().c());
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
      $$0.addSchema(99, bmg::new);
      Schema $$1 = $$0.addSchema(100, bix::new);
      $$0.addFixer(new bdh($$1, true));
      Schema $$2 = $$0.addSchema(101, b);
      $$0.addFixer(new bbt($$2, false));
      Schema $$3 = $$0.addSchema(102, biy::new);
      $$0.addFixer(new bex($$3, true));
      $$0.addFixer(new bez($$3, false));
      Schema $$4 = $$0.addSchema(105, b);
      $$0.addFixer(new bfd($$4, true));
      Schema $$5 = $$0.addSchema(106, bja::new);
      $$0.addFixer(new bge($$5, true));
      Schema $$6 = $$0.addSchema(107, bjb::new);
      $$0.addFixer(new bdo($$6));
      Schema $$7 = $$0.addSchema(108, b);
      $$0.addFixer(new beb($$7, true));
      Schema $$8 = $$0.addSchema(109, b);
      $$0.addFixer(new bdj($$8, true));
      Schema $$9 = $$0.addSchema(110, b);
      $$0.addFixer(new bdk($$9, true));
      Schema $$10 = $$0.addSchema(111, b);
      $$0.addFixer(new bdq($$10, true));
      Schema $$11 = $$0.addSchema(113, b);
      $$0.addFixer(new bdv($$11, true));
      Schema $$12 = $$0.addSchema(135, bjd::new);
      $$0.addFixer(new bdx($$12, true));
      Schema $$13 = $$0.addSchema(143, bje::new);
      $$0.addFixer(new bed($$13, true));
      Schema $$14 = $$0.addSchema(147, b);
      $$0.addFixer(new bda($$14, true));
      Schema $$15 = $$0.addSchema(165, b);
      $$0.addFixer(new bfo($$15, true));
      Schema $$16 = $$0.addSchema(501, bly::new);
      $$0.addFixer(new bau($$16, "Add 1.10 entities fix", bhk.B));
      Schema $$17 = $$0.addSchema(502, b);
      $$0.addFixer(bfb.a($$17, "cooked_fished item renamer", $$0x -> Objects.equals(biw.a($$0x), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : $$0x));
      $$0.addFixer(new bei($$17, false));
      Schema $$18 = $$0.addSchema(505, b);
      $$0.addFixer(new bgr($$18, false));
      Schema $$19 = $$0.addSchema(700, blz::new);
      $$0.addFixer(new bdg($$19, true));
      Schema $$20 = $$0.addSchema(701, bma::new);
      $$0.addFixer(new bea($$20, true));
      Schema $$21 = $$0.addSchema(702, bmb::new);
      $$0.addFixer(new beh($$21));
      Schema $$22 = $$0.addSchema(703, bmc::new);
      $$0.addFixer(new bdl($$22, true));
      Schema $$23 = $$0.addSchema(704, bmd::new);
      $$0.addFixer(new bbn($$23, true));
      Schema $$24 = $$0.addSchema(705, bme::new);
      $$0.addFixer(new bdm($$24, true));
      Schema $$25 = $$0.addSchema(804, c);
      $$0.addFixer(new bev($$25, true));
      Schema $$26 = $$0.addSchema(806, c);
      $$0.addFixer(new bfn($$26, false));
      Schema $$27 = $$0.addSchema(808, bmf::new);
      $$0.addFixer(new bau($$27, "added shulker box", bhk.s));
      Schema $$28 = $$0.addSchema(808, 1, c);
      $$0.addFixer(new bdy($$28, false));
      Schema $$29 = $$0.addSchema(813, c);
      $$0.addFixer(new bfc($$29, false));
      $$0.addFixer(new bbr($$29, false));
      Schema $$30 = $$0.addSchema(816, c);
      $$0.addFixer(new bgu($$30, false));
      Schema $$31 = $$0.addSchema(820, c);
      $$0.addFixer(bfb.a($$31, "totem item renamer", a("minecraft:totem", "minecraft:totem_of_undying")));
      Schema $$32 = $$0.addSchema(1022, biz::new);
      $$0.addFixer(new bis($$32, "added shoulder entities to players", bhk.b));
      Schema $$33 = $$0.addSchema(1125, bjc::new);
      $$0.addFixer(new bcf($$33, true));
      $$0.addFixer(new bbe($$33, false));
      Schema $$34 = $$0.addSchema(1344, c);
      $$0.addFixer(new bgs($$34, false));
      Schema $$35 = $$0.addSchema(1446, c);
      $$0.addFixer(new bgt($$35, false));
      Schema $$36 = $$0.addSchema(1450, c);
      $$0.addFixer(new bbz($$36, false));
      Schema $$37 = $$0.addSchema(1451, bjf::new);
      $$0.addFixer(new bau($$37, "AddTrappedChestFix", bhk.s));
      Schema $$38 = $$0.addSchema(1451, 1, bjg::new);
      $$0.addFixer(new bcl($$38, true));
      Schema $$39 = $$0.addSchema(1451, 2, bjh::new);
      $$0.addFixer(new bbl($$39, true));
      Schema $$40 = $$0.addSchema(1451, 3, bji::new);
      $$0.addFixer(new bdb($$40, true));
      $$0.addFixer(new bfi($$40, false));
      Schema $$41 = $$0.addSchema(1451, 4, bjj::new);
      $$0.addFixer(new bbv($$41, true));
      $$0.addFixer(new bfl($$41, false));
      Schema $$42 = $$0.addSchema(1451, 5, bjk::new);
      $$0.addFixer(
         new bfa(
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
      $$0.addFixer(new bau($$42, "RemoveNoteBlockFlowerPotFix", bhk.s));
      $$0.addFixer(new bfj($$42, false, "minecraft:spawn_egg"));
      $$0.addFixer(new beg($$42, false));
      $$0.addFixer(new bbk($$42, false));
      $$0.addFixer(new bfv($$42, false));
      Schema $$43 = $$0.addSchema(1451, 6, bjl::new);
      $$0.addFixer(new bhy($$43, true));
      $$0.addFixer(new bbo($$43, false));
      Schema $$44 = $$0.addSchema(1451, 7, c);
      $$0.addFixer(new bim($$44));
      Schema $$45 = $$0.addSchema(1456, c);
      $$0.addFixer(new bdn($$45, false));
      Schema $$46 = $$0.addSchema(1458, c);
      $$0.addFixer(new bdf($$46, false));
      $$0.addFixer(new bew($$46, false));
      $$0.addFixer(new bbm($$46, false));
      Schema $$47 = $$0.addSchema(1460, bjm::new);
      $$0.addFixer(new bdr($$47, false));
      Schema $$48 = $$0.addSchema(1466, bjn::new);
      $$0.addFixer(new bau($$48, "Add DUMMY block entity", bhk.s));
      $$0.addFixer(new bcr($$48, true));
      Schema $$49 = $$0.addSchema(1470, bjo::new);
      $$0.addFixer(new bau($$49, "Add 1.13 entities fix", bhk.B));
      Schema $$50 = $$0.addSchema(1474, c);
      $$0.addFixer(new bcs($$50, false));
      $$0.addFixer(
         bbx.a($$50, "Colorless shulker block fixer", $$0x -> Objects.equals(biw.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      $$0.addFixer(
         bfb.a($$50, "Colorless shulker item fixer", $$0x -> Objects.equals(biw.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      Schema $$51 = $$0.addSchema(1475, c);
      $$0.addFixer(bbx.a($$51, "Flowing fixer", b(ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava"))));
      Schema $$52 = $$0.addSchema(1480, c);
      $$0.addFixer(bbx.a($$52, "Rename coral blocks", b(bhq.a)));
      $$0.addFixer(bfb.a($$52, "Rename coral items", b(bhq.a)));
      Schema $$53 = $$0.addSchema(1481, bjp::new);
      $$0.addFixer(new bau($$53, "Add conduit", bhk.s));
      Schema $$54 = $$0.addSchema(1483, bjq::new);
      $$0.addFixer(new bdt($$54, true));
      $$0.addFixer(bfb.a($$54, "Rename pufferfish egg item", b(bdt.a)));
      Schema $$55 = $$0.addSchema(1484, c);
      $$0.addFixer(
         bfb.a(
            $$55,
            "Rename seagrass items",
            b(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(
         bbx.a(
            $$55,
            "Rename seagrass blocks",
            b(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(new bes($$55, false));
      Schema $$56 = $$0.addSchema(1486, bjr::new);
      $$0.addFixer(new bde($$56, true));
      $$0.addFixer(bfb.a($$56, "Rename cod/salmon egg items", b(bde.b)));
      Schema $$57 = $$0.addSchema(1487, c);
      $$0.addFixer(
         bfb.a(
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
         bbx.a(
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
      $$0.addFixer(bbx.a($$58, "Rename kelp/kelptop", b(ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant"))));
      $$0.addFixer(bfb.a($$58, "Rename kelptop", a("minecraft:kelp_top", "minecraft:kelp")));
      $$0.addFixer(new bgf($$58, false, "Command block block entity custom name fix", bhk.s, "minecraft:command_block") {
         @Override
         protected Typed<?> a(Typed<?> $$0) {
            return $$0.update(DSL.remainderFinder(), bdf::a);
         }
      });
      $$0.addFixer(new bgf($$58, false, "Command block minecart custom name fix", bhk.B, "minecraft:commandblock_minecart") {
         @Override
         protected Typed<?> a(Typed<?> $$0) {
            return $$0.update(DSL.remainderFinder(), bdf::a);
         }
      });
      $$0.addFixer(new beu($$58, false));
      Schema $$59 = $$0.addSchema(1490, c);
      $$0.addFixer(bbx.a($$59, "Rename melon_block", a("minecraft:melon_block", "minecraft:melon")));
      $$0.addFixer(
         bfb.a(
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
      $$0.addFixer(new bcq($$60, false));
      Schema $$61 = $$0.addSchema(1494, c);
      $$0.addFixer(new bfh($$61, false));
      Schema $$62 = $$0.addSchema(1496, c);
      $$0.addFixer(new bfs($$62, false));
      Schema $$63 = $$0.addSchema(1500, c);
      $$0.addFixer(new bbp($$63, false));
      Schema $$64 = $$0.addSchema(1501, c);
      $$0.addFixer(new bav($$64, false));
      Schema $$65 = $$0.addSchema(1502, c);
      $$0.addFixer(new bgh($$65, "Recipes fix", bhk.J, b(bhh.a)));
      Schema $$66 = $$0.addSchema(1506, c);
      $$0.addFixer(new bfu($$66, false));
      Schema $$67 = $$0.addSchema(1510, bjs::new);
      $$0.addFixer(bbx.a($$67, "Block renamening fix", b(bec.b)));
      $$0.addFixer(bfb.a($$67, "Item renamening fix", b(bec.c)));
      $$0.addFixer(new bgh($$67, "Recipes renamening fix", bhk.J, b(bhi.a)));
      $$0.addFixer(new bec($$67, true));
      $$0.addFixer(
         new bhz(
            $$67,
            "SwimStatsRenameFix",
            ImmutableMap.of("minecraft:swim_one_cm", "minecraft:walk_on_water_one_cm", "minecraft:dive_one_cm", "minecraft:walk_under_water_one_cm")
         )
      );
      Schema $$68 = $$0.addSchema(1514, c);
      $$0.addFixer(new bgj($$68, false));
      $$0.addFixer(new bie($$68, false));
      $$0.addFixer(new bgk($$68, false));
      Schema $$69 = $$0.addSchema(1515, c);
      $$0.addFixer(bbx.a($$69, "Rename coral fan blocks", b(bhp.a)));
      Schema $$70 = $$0.addSchema(1624, c);
      $$0.addFixer(new big($$70, false));
      Schema $$71 = $$0.addSchema(1800, bjt::new);
      $$0.addFixer(new bau($$71, "Added 1.14 mobs fix", bhk.B));
      $$0.addFixer(bfb.a($$71, "Rename dye items", b(bcw.a)));
      Schema $$72 = $$0.addSchema(1801, bju::new);
      $$0.addFixer(new bau($$72, "Added Illager Beast", bhk.B));
      Schema $$73 = $$0.addSchema(1802, c);
      $$0.addFixer(
         bbx.a(
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
         bfb.a(
            $$73,
            "Rename sign item & stone slabs",
            b(ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))
         )
      );
      Schema $$74 = $$0.addSchema(1803, c);
      $$0.addFixer(new bey($$74, false));
      Schema $$75 = $$0.addSchema(1904, bjv::new);
      $$0.addFixer(new bau($$75, "Added Cats", bhk.B));
      $$0.addFixer(new bdd($$75, false));
      Schema $$76 = $$0.addSchema(1905, c);
      $$0.addFixer(new bco($$76, false));
      Schema $$77 = $$0.addSchema(1906, bjw::new);
      $$0.addFixer(new bau($$77, "Add POI Blocks", bhk.s));
      Schema $$78 = $$0.addSchema(1909, bjx::new);
      $$0.addFixer(new bau($$78, "Add jigsaw", bhk.s));
      Schema $$79 = $$0.addSchema(1911, c);
      $$0.addFixer(new bcp($$79, false));
      Schema $$80 = $$0.addSchema(1914, c);
      $$0.addFixer(new bio($$80, false));
      Schema $$81 = $$0.addSchema(1917, c);
      $$0.addFixer(new bcb($$81, false));
      Schema $$82 = $$0.addSchema(1918, c);
      $$0.addFixer(new bij($$82, "minecraft:villager"));
      $$0.addFixer(new bij($$82, "minecraft:zombie_villager"));
      Schema $$83 = $$0.addSchema(1920, bjy::new);
      $$0.addFixer(new bgi($$83, false));
      $$0.addFixer(new bau($$83, "Add campfire", bhk.s));
      Schema $$84 = $$0.addSchema(1925, c);
      $$0.addFixer(new bga($$84, false));
      Schema $$85 = $$0.addSchema(1928, bjz::new);
      $$0.addFixer(new bdu($$85, true));
      $$0.addFixer(bfb.a($$85, "Rename ravager egg item", b(bdu.a)));
      Schema $$86 = $$0.addSchema(1929, bka::new);
      $$0.addFixer(new bau($$86, "Add Wandering Trader and Trader Llama", bhk.B));
      Schema $$87 = $$0.addSchema(1931, bkb::new);
      $$0.addFixer(new bau($$87, "Added Fox", bhk.B));
      Schema $$88 = $$0.addSchema(1936, c);
      $$0.addFixer(new bgp($$88, false));
      Schema $$89 = $$0.addSchema(1946, c);
      $$0.addFixer(new bhr($$89, false));
      Schema $$90 = $$0.addSchema(1948, c);
      $$0.addFixer(new bgn($$90));
      Schema $$91 = $$0.addSchema(1953, c);
      $$0.addFixer(new bgl($$91, false));
      Schema $$92 = $$0.addSchema(1955, c);
      $$0.addFixer(new bil($$92, false));
      $$0.addFixer(new bit($$92, false));
      Schema $$93 = $$0.addSchema(1961, c);
      $$0.addFixer(new bck($$93, false));
      Schema $$94 = $$0.addSchema(1963, c);
      $$0.addFixer(new bhn($$94, false));
      Schema $$95 = $$0.addSchema(2100, bkc::new);
      $$0.addFixer(new bau($$95, "Added Bee and Bee Stinger", bhk.B));
      $$0.addFixer(new bau($$95, "Add beehive", bhk.s));
      $$0.addFixer(new bgh($$95, "Rename sugar recipe", bhk.J, a("minecraft:sugar", "minecraft:sugar_from_sugar_cane")));
      $$0.addFixer(new baw($$95, false, "Rename sugar recipe advancement", a("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane")));
      Schema $$96 = $$0.addSchema(2202, c);
      $$0.addFixer(new bcg($$96, false));
      Schema $$97 = $$0.addSchema(2209, c);
      UnaryOperator<String> $$98 = a("minecraft:bee_hive", "minecraft:beehive");
      $$0.addFixer(bfb.a($$97, "Rename bee_hive item to beehive", $$98));
      $$0.addFixer(new bhd($$97, "Rename bee_hive poi to beehive", $$98));
      $$0.addFixer(bbx.a($$97, "Rename bee_hive block to beehive", $$98));
      Schema $$99 = $$0.addSchema(2211, c);
      $$0.addFixer(new bib($$99, false));
      Schema $$100 = $$0.addSchema(2218, c);
      $$0.addFixer(new beo($$100, false));
      Schema $$101 = $$0.addSchema(2501, bkd::new);
      $$0.addFixer(new bep($$101, true));
      Schema $$102 = $$0.addSchema(2502, bke::new);
      $$0.addFixer(new bau($$102, "Added Hoglin", bhk.B));
      Schema $$103 = $$0.addSchema(2503, c);
      $$0.addFixer(new bin($$103, false));
      $$0.addFixer(new baw($$103, false, "Composter category change", a("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter")));
      Schema $$104 = $$0.addSchema(2505, bkf::new);
      $$0.addFixer(new bau($$104, "Added Piglin", bhk.B));
      $$0.addFixer(new bgb($$104, "minecraft:villager"));
      Schema $$105 = $$0.addSchema(2508, c);
      $$0.addFixer(
         bfb.a(
            $$105,
            "Renamed fungi items to fungus",
            b(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      $$0.addFixer(
         bbx.a(
            $$105,
            "Renamed fungi blocks to fungus",
            b(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      Schema $$106 = $$0.addSchema(2509, bkg::new);
      $$0.addFixer(new bej($$106));
      $$0.addFixer(bfb.a($$106, "Rename zombie pigman egg item", b(bej.a)));
      Schema $$107 = $$0.addSchema(2511, c);
      $$0.addFixer(new bds($$107));
      Schema $$108 = $$0.addSchema(2514, c);
      $$0.addFixer(new bee($$108));
      $$0.addFixer(new bbu($$108));
      $$0.addFixer(new bhb($$108));
      $$0.addFixer(new bfx($$108));
      $$0.addFixer(new bht($$108));
      $$0.addFixer(new bfm($$108));
      Schema $$109 = $$0.addSchema(2516, c);
      $$0.addFixer(new ber($$109, "minecraft:villager"));
      $$0.addFixer(new ber($$109, "minecraft:zombie_villager"));
      Schema $$110 = $$0.addSchema(2518, c);
      $$0.addFixer(new bfp($$110, false));
      $$0.addFixer(new bfq($$110, false));
      Schema $$111 = $$0.addSchema(2519, bkh::new);
      $$0.addFixer(new bau($$111, "Added Strider", bhk.B));
      Schema $$112 = $$0.addSchema(2522, bki::new);
      $$0.addFixer(new bau($$112, "Added Zoglin", bhk.B));
      Schema $$113 = $$0.addSchema(2523, c);
      $$0.addFixer(
         new bbb(
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
      $$0.addFixer(new bbh($$114));
      Schema $$115 = $$0.addSchema(2528, c);
      $$0.addFixer(
         bfb.a(
            $$115,
            "Rename soul fire torch and soul fire lantern",
            b(ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))
         )
      );
      $$0.addFixer(
         bbx.a(
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
      $$0.addFixer(new bia($$116, false));
      Schema $$117 = $$0.addSchema(2531, c);
      $$0.addFixer(new bhj($$117));
      Schema $$118 = $$0.addSchema(2533, c);
      $$0.addFixer(new bik($$118));
      Schema $$119 = $$0.addSchema(2535, c);
      $$0.addFixer(new bdz($$119));
      Schema $$120 = $$0.addSchema(2538, c);
      $$0.addFixer(new bfw($$120));
      Schema $$121 = $$0.addSchema(2550, c);
      $$0.addFixer(new biq($$121));
      Schema $$122 = $$0.addSchema(2551, bkj::new);
      $$0.addFixer(new bis($$122, "add types to WorldGenData", bhk.M));
      Schema $$123 = $$0.addSchema(2552, c);
      $$0.addFixer(new bgh($$123, "Nether biome rename", bhk.K, a("minecraft:nether", "minecraft:nether_wastes")));
      Schema $$124 = $$0.addSchema(2553, c);
      $$0.addFixer(new bgh($$124, "Biomes fix", bhk.K, b(bbg.a)));
      Schema $$125 = $$0.addSchema(2558, c);
      $$0.addFixer(new bgc($$125, false));
      $$0.addFixer(new bgx($$125, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
      Schema $$126 = $$0.addSchema(2568, bkk::new);
      $$0.addFixer(new bau($$126, "Added Piglin Brute", bhk.B));
      Schema $$127 = $$0.addSchema(2571, bkl::new);
      $$0.addFixer(new bau($$127, "Added Goat", bhk.B));
      Schema $$128 = $$0.addSchema(2679, c);
      $$0.addFixer(new bcc($$128, false));
      Schema $$129 = $$0.addSchema(2680, c);
      $$0.addFixer(bfb.a($$129, "Renamed grass path item to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      $$0.addFixer(bbx.a($$129, "Renamed grass path block to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      Schema $$130 = $$0.addSchema(2684, bkm::new);
      $$0.addFixer(new bau($$130, "Added Sculk Sensor", bhk.s));
      Schema $$131 = $$0.addSchema(2686, bkn::new);
      $$0.addFixer(new bau($$131, "Added Axolotl", bhk.B));
      Schema $$132 = $$0.addSchema(2688, bko::new);
      $$0.addFixer(new bau($$132, "Added Glow Squid", bhk.B));
      $$0.addFixer(new bau($$132, "Added Glow Item Frame", bhk.B));
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
      $$0.addFixer(bfb.a($$133, "Renamed copper block items to new oxidized terms", b($$134)));
      $$0.addFixer(bbx.a($$133, "Renamed copper blocks to new oxidized terms", b($$134)));
      Schema $$135 = $$0.addSchema(2691, c);
      ImmutableMap<String, String> $$136 = ImmutableMap.builder()
         .put("minecraft:waxed_copper", "minecraft:waxed_copper_block")
         .put("minecraft:oxidized_copper_block", "minecraft:oxidized_copper")
         .put("minecraft:weathered_copper_block", "minecraft:weathered_copper")
         .put("minecraft:exposed_copper_block", "minecraft:exposed_copper")
         .build();
      $$0.addFixer(bfb.a($$135, "Rename copper item suffixes", b($$136)));
      $$0.addFixer(bbx.a($$135, "Rename copper blocks suffixes", b($$136)));
      Schema $$137 = $$0.addSchema(2693, c);
      $$0.addFixer(new bat($$137, bhk.M, "has_increased_height_already", false));
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
      $$0.addFixer(bfb.a($$138, "Renamed grimstone block items to deepslate", b($$139)));
      $$0.addFixer(bbx.a($$138, "Renamed grimstone blocks to deepslate", b($$139)));
      Schema $$140 = $$0.addSchema(2700, c);
      $$0.addFixer(
         bbx.a(
            $$140,
            "Renamed cave vines blocks",
            b(ImmutableMap.of("minecraft:cave_vines_head", "minecraft:cave_vines", "minecraft:cave_vines_body", "minecraft:cave_vines_plant"))
         )
      );
      Schema $$141 = $$0.addSchema(2701, c);
      $$0.addFixer(new bhs($$141));
      Schema $$142 = $$0.addSchema(2702, c);
      $$0.addFixer(new baq($$142));
      Schema $$143 = $$0.addSchema(2704, bkp::new);
      $$0.addFixer(new bau($$143, "Added Goat", bhk.B));
      Schema $$144 = $$0.addSchema(2707, bkq::new);
      $$0.addFixer(new bau($$144, "Added Marker", bhk.B));
      $$0.addFixer(new bat($$144, bhk.M, "has_increased_height_already", true));
      Schema $$145 = $$0.addSchema(2710, c);
      $$0.addFixer(new bhz($$145, "Renamed play_one_minute stat to play_time", ImmutableMap.of("minecraft:play_one_minute", "minecraft:play_time")));
      Schema $$146 = $$0.addSchema(2717, c);
      $$0.addFixer(bfb.a($$146, "Rename azalea_leaves_flowers", b(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves"))));
      $$0.addFixer(
         bbx.a($$146, "Rename azalea_leaves_flowers items", b(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves")))
      );
      Schema $$147 = $$0.addSchema(2825, c);
      $$0.addFixer(new bat($$147, bhk.M, "has_increased_height_already", false));
      Schema $$148 = $$0.addSchema(2831, bkr::new);
      $$0.addFixer(new bhx($$148));
      Schema $$149 = $$0.addSchema(2832, bks::new);
      $$0.addFixer(new bir($$149));
      $$0.addFixer(new bcj($$149));
      Schema $$150 = $$0.addSchema(2833, c);
      $$0.addFixer(new bip($$150));
      Schema $$151 = $$0.addSchema(2838, c);
      $$0.addFixer(new bgh($$151, "Caves and Cliffs biome renames", bhk.K, b(bcd.a)));
      Schema $$152 = $$0.addSchema(2841, c);
      $$0.addFixer(new bcm($$152));
      Schema $$153 = $$0.addSchema(2842, bkt::new);
      $$0.addFixer(new bcn($$153));
      Schema $$154 = $$0.addSchema(2843, c);
      $$0.addFixer(new bgy($$154));
      $$0.addFixer(new bgh($$154, "Remove Deep Warm Ocean", bhk.K, a("minecraft:deep_warm_ocean", "minecraft:warm_ocean")));
      Schema $$155 = $$0.addSchema(2846, c);
      $$0.addFixer(
         new baw(
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
      $$0.addFixer(new bip($$156));
      Schema $$157 = $$0.addSchema(2967, c);
      $$0.addFixer(new bic($$157));
      Schema $$158 = $$0.addSchema(2970, c);
      $$0.addFixer(new bid($$158));
      Schema $$159 = $$0.addSchema(3076, bku::new);
      $$0.addFixer(new bau($$159, "Added Sculk Catalyst", bhk.s));
      Schema $$160 = $$0.addSchema(3077, c);
      $$0.addFixer(new bch($$160));
      Schema $$161 = $$0.addSchema(3078, bkv::new);
      $$0.addFixer(new bau($$161, "Added Frog", bhk.B));
      $$0.addFixer(new bau($$161, "Added Tadpole", bhk.B));
      $$0.addFixer(new bau($$161, "Added Sculk Shrieker", bhk.s));
      Schema $$162 = $$0.addSchema(3081, bkw::new);
      $$0.addFixer(new bau($$162, "Added Warden", bhk.B));
      Schema $$163 = $$0.addSchema(3082, bkx::new);
      $$0.addFixer(new bau($$163, "Added Chest Boat", bhk.B));
      Schema $$164 = $$0.addSchema(3083, bky::new);
      $$0.addFixer(new bau($$164, "Added Allay", bhk.B));
      Schema $$165 = $$0.addSchema(3084, c);
      $$0.addFixer(
         new bgh(
            $$165,
            "game_event_renames_3084",
            bhk.E,
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
      $$0.addFixer(new bef($$166, "Change cat variant type", bhk.B, "minecraft:cat", "CatType", ad.a(new Int2ObjectOpenHashMap(), $$0x -> {
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
      $$0.addFixer(new bct($$166, "Migrate cat variant advancement", "minecraft:husbandry/complete_catalogue", $$1x -> (String)$$167.getOrDefault($$1x, $$1x)));
      Schema $$168 = $$0.addSchema(3087, c);
      $$0.addFixer(new bef($$168, "Change frog variant type", bhk.B, "minecraft:frog", "Variant", ad.a(new Int2ObjectOpenHashMap(), $$0x -> {
         $$0x.put(0, "minecraft:temperate");
         $$0x.put(1, "minecraft:warm");
         $$0x.put(2, "minecraft:cold");
      })::get));
      Schema $$169 = $$0.addSchema(3090, c);
      $$0.addFixer(new bdp($$169));
      Schema $$170 = $$0.addSchema(3093, c);
      $$0.addFixer(new bdi($$170));
      Schema $$171 = $$0.addSchema(3094, c);
      $$0.addFixer(new beq($$171));
      Schema $$172 = $$0.addSchema(3097, c);
      $$0.addFixer(new bel($$172));
      $$0.addFixer(new bem($$172));
      Map<String, String> $$173 = Map.of("minecraft:british", "minecraft:british_shorthair");
      $$0.addFixer(new bii($$172, "Rename british shorthair", bhk.B, "minecraft:cat", $$173));
      $$0.addFixer(
         new bct(
            $$172, "Migrate cat variant advancement for british shorthair", "minecraft:husbandry/complete_catalogue", $$1x -> $$173.getOrDefault($$1x, $$1x)
         )
      );
      $$0.addFixer(new bhc($$172, "Remove unpopulated villager PoI types", Set.of("minecraft:unemployed", "minecraft:nitwit")::contains));
      Schema $$174 = $$0.addSchema(3108, c);
      $$0.addFixer(new bbj($$174));
      Schema $$175 = $$0.addSchema(3201, c);
      $$0.addFixer(new bgw($$175));
      Schema $$176 = $$0.addSchema(3202, bkz::new);
      $$0.addFixer(new bau($$176, "Added Hanging Sign", bhk.s));
      Schema $$177 = $$0.addSchema(3203, bla::new);
      $$0.addFixer(new bau($$177, "Added Camel", bhk.B));
      Schema $$178 = $$0.addSchema(3204, blb::new);
      $$0.addFixer(new bau($$178, "Added Chiseled Bookshelf", bhk.s));
      Schema $$179 = $$0.addSchema(3209, c);
      $$0.addFixer(new bfj($$179, false, "minecraft:pig_spawn_egg"));
      Schema $$180 = $$0.addSchema(3214, c);
      $$0.addFixer(new bgq($$180));
      Schema $$181 = $$0.addSchema(3319, c);
      $$0.addFixer(new bgo($$181));
      Schema $$182 = $$0.addSchema(3322, c);
      $$0.addFixer(new bcx($$182));
      Schema $$183 = $$0.addSchema(3325, blc::new);
      $$0.addFixer(new bau($$183, "Added displays", bhk.B));
      Schema $$184 = $$0.addSchema(3326, bld::new);
      $$0.addFixer(new bau($$184, "Added Sniffer", bhk.B));
      Schema $$185 = $$0.addSchema(3327, ble::new);
      $$0.addFixer(new bau($$185, "Archaeology", bhk.s));
      Schema $$186 = $$0.addSchema(3328, blf::new);
      $$0.addFixer(new bau($$186, "Added interaction", bhk.B));
      Schema $$187 = $$0.addSchema(3438, blg::new);
      $$0.addFixer(bbq.a($$187, "Rename Suspicious Sand to Brushable Block", a("minecraft:suspicious_sand", "minecraft:brushable_block")));
      $$0.addFixer(new bdc($$187));
      $$0.addFixer(
         bfb.a(
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
      $$0.addFixer(new bau($$187, "Added calibrated sculk sensor", bhk.s));
      Schema $$188 = $$0.addSchema(3439, c);
      $$0.addFixer(new bbs($$188, "Updated sign text format for Signs", "minecraft:sign"));
      $$0.addFixer(new bbs($$188, "Updated sign text format for Hanging Signs", "minecraft:hanging_sign"));
      Schema $$189 = $$0.addSchema(3440, c);
      $$0.addFixer(new bgh($$189, "Replace experimental 1.20 overworld", bhk.L, a("minecraft:overworld_update_1_20", "minecraft:overworld")));
      $$0.addFixer(new bek($$189, "Remove 1.20 feature toggle", Set.of("minecraft:update_1_20")));
      Schema $$190 = $$0.addSchema(3441, c);
      $$0.addFixer(new bbi($$190));
      Schema $$191 = $$0.addSchema(3447, c);
      $$0.addFixer(
         bfb.a(
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
      Schema $$192 = $$0.addSchema(3448, blh::new);
      $$0.addFixer(new bcu($$192));
      Schema $$193 = $$0.addSchema(3450, c);
      $$0.addFixer(
         new bhl(
            $$193,
            "Remove liquid_carvers and heightmap chunk statuses",
            b(Map.of("minecraft:liquid_carvers", "minecraft:carvers", "minecraft:heightmaps", "minecraft:spawn"))
         )
      );
      Schema $$194 = $$0.addSchema(3451, c);
      $$0.addFixer(new bci($$194));
      Schema $$195 = $$0.addSchema(3459, c);
      $$0.addFixer(new bft($$195));
      Schema $$196 = $$0.addSchema(3564, c);
      $$0.addFixer(new bcv($$196, "Drop invalid sign datafix data", "minecraft:sign"));
      $$0.addFixer(new bcv($$196, "Drop invalid hanging sign datafix data", "minecraft:hanging_sign"));
      Schema $$197 = $$0.addSchema(3565, c);
      $$0.addFixer(new bhg($$197));
      Schema $$198 = $$0.addSchema(3566, c);
      $$0.addFixer(new bhu($$198));
      Schema $$199 = $$0.addSchema(3568, c);
      $$0.addFixer(new bgd($$199));
      Schema $$200 = $$0.addSchema(3682, bli::new);
      $$0.addFixer(new bau($$200, "Added Crafter", bhk.s));
      Schema $$201 = $$0.addSchema(3683, blj::new);
      $$0.addFixer(new bhe($$201));
      Schema $$202 = $$0.addSchema(3685, blk::new);
      $$0.addFixer(new ben($$202));
      Schema $$203 = $$0.addSchema(3689, bll::new);
      $$0.addFixer(new bau($$203, "Added Breeze", bhk.B));
      $$0.addFixer(new bau($$203, "Added Trial Spawner", bhk.s));
      Schema $$204 = $$0.addSchema(3692, c);
      UnaryOperator<String> $$205 = b(Map.of("minecraft:grass", "minecraft:short_grass"));
      $$0.addFixer(bbx.a($$204, "Rename grass block to short_grass", $$205));
      $$0.addFixer(bfb.a($$204, "Rename grass item to short_grass", $$205));
      Schema $$206 = $$0.addSchema(3799, blm::new);
      $$0.addFixer(new bau($$206, "Added Armadillo", bhk.B));
      Schema $$207 = $$0.addSchema(3800, c);
      UnaryOperator<String> $$208 = b(Map.of("minecraft:scute", "minecraft:turtle_scute"));
      $$0.addFixer(bfb.a($$207, "Rename scute item to turtle_scute", $$208));
      Schema $$209 = $$0.addSchema(3803, c);
      $$0.addFixer(new bho($$209, "Rename sweeping enchant to sweeping_edge", Map.of("minecraft:sweeping", "minecraft:sweeping_edge")));
      Schema $$210 = $$0.addSchema(3807, bln::new);
      $$0.addFixer(new bau($$210, "Added Vault", bhk.s));
      Schema $$211 = $$0.addSchema(3807, 1, c);
      $$0.addFixer(new bfz($$211));
      Schema $$212 = $$0.addSchema(3808, blo::new);
      $$0.addFixer(new bet($$212, "minecraft:horse", "ArmorItem", true));
      Schema $$213 = $$0.addSchema(3808, 1, blp::new);
      $$0.addFixer(new bet($$213, "minecraft:llama", "DecorItem", false));
      Schema $$214 = $$0.addSchema(3808, 2, blq::new);
      $$0.addFixer(new bet($$214, "minecraft:trader_llama", "DecorItem", false));
      Schema $$215 = $$0.addSchema(3809, c);
      $$0.addFixer(new bce($$215));
      Schema $$216 = $$0.addSchema(3812, c);
      $$0.addFixer(new bao($$216));
      Schema $$217 = $$0.addSchema(3813, c);
      $$0.addFixer(new bbw($$217));
      Schema $$218 = $$0.addSchema(3814, c);
      $$0.addFixer(new bbb($$218, "Rename jump strength attribute", a("minecraft:horse.jump_strength", "minecraft:generic.jump_strength")));
      Schema $$219 = $$0.addSchema(3816, blr::new);
      $$0.addFixer(new bau($$219, "Added Bogged", bhk.B));
      Schema $$220 = $$0.addSchema(3818, bls::new);
      $$0.addFixer(new bbf($$220));
      $$0.addFixer(new bcy($$220));
      Schema $$221 = $$0.addSchema(3818, 1, c);
      $$0.addFixer(new bbd($$221));
      Schema $$222 = $$0.addSchema(3818, 2, c);
      $$0.addFixer(new bif($$222));
      Schema $$223 = $$0.addSchema(3818, 3, blt::new);
      $$0.addFixer(new bis($$223, "Inject data component types", bhk.w));
      Schema $$224 = $$0.addSchema(3818, 4, blu::new);
      $$0.addFixer(new bgz($$224));
      Schema $$225 = $$0.addSchema(3818, 5, blv::new);
      $$0.addFixer(new bff($$225));
      Schema $$226 = $$0.addSchema(3818, 6, c);
      $$0.addFixer(new bax($$226));
      Schema $$227 = $$0.addSchema(3820, c);
      $$0.addFixer(new bha($$227));
      $$0.addFixer(new bfy($$227));
      Schema $$228 = $$0.addSchema(3825, blw::new);
      $$0.addFixer(new bfg($$228));
      $$0.addFixer(new bbc($$228));
      $$0.addFixer(new bih($$228));
      $$0.addFixer(new bau($$228, "Added Ominous Item Spawner", bhk.B));
      Schema $$229 = $$0.addSchema(3828, c);
      $$0.addFixer(new bcz($$229));
      Schema $$230 = $$0.addSchema(3833, c);
      $$0.addFixer(new bhm($$230));
      Schema $$231 = $$0.addSchema(3938, blx::new);
      $$0.addFixer(new bhf($$231));
      Schema $$232 = $$0.addSchema(3939, c);
      $$0.addFixer(new bek($$232, "Remove 1.21 feature toggle", Set.of("minecraft:update_1_21")));
      Schema $$233 = $$0.addSchema(3943, c);
      $$0.addFixer(new bgv($$233));
      Schema $$234 = $$0.addSchema(3945, c);
      $$0.addFixer(new baz($$234));
      $$0.addFixer(new bfr($$234));
      Schema $$235 = $$0.addSchema(4054, c);
      $$0.addFixer(new bgm($$235));
      Schema $$236 = $$0.addSchema(4055, c);
      $$0.addFixer(new bay($$236));
      Schema $$237 = $$0.addSchema(4057, c);
      $$0.addFixer(new bca($$237));
   }

   private static UnaryOperator<String> a(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault($$1, $$1);
   }

   private static UnaryOperator<String> b(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault(biw.a($$1), $$1);
   }

   private static UnaryOperator<String> a(String $$0, String $$1) {
      return $$2 -> Objects.equals(biw.a($$2), $$0) ? $$1 : $$2;
   }
}
