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

public class bbj {
   private static final BiFunction<Integer, Schema, Schema> b = Schema::new;
   private static final BiFunction<Integer, Schema, Schema> c = bkb::new;
   private static final Result d = b();
   public static final int a = 3441;

   private bbj() {
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
      $$0.addSchema(99, bnp::new);
      Schema $$1 = $$0.addSchema(100, bkc::new);
      $$0.addFixer(new beg($$1, true));
      Schema $$2 = $$0.addSchema(101, b);
      $$0.addFixer(new bcq($$2, false));
      $$0.addFixer(new bjq($$2));
      Schema $$3 = $$0.addSchema(102, bkd::new);
      $$0.addFixer(new bfz($$3, true));
      $$0.addFixer(new bgb($$3, false));
      Schema $$4 = $$0.addSchema(105, b);
      $$0.addFixer(new bgf($$4, true));
      Schema $$5 = $$0.addSchema(106, bkf::new);
      $$0.addFixer(new bhh($$5, true));
      Schema $$6 = $$0.addSchema(107, bkg::new);
      $$0.addFixer(new beo($$6));
      Schema $$7 = $$0.addSchema(108, b);
      $$0.addFixer(new bfb($$7, true));
      Schema $$8 = $$0.addSchema(109, b);
      $$0.addFixer(new bej($$8, true));
      Schema $$9 = $$0.addSchema(110, b);
      $$0.addFixer(new bek($$9, true));
      Schema $$10 = $$0.addSchema(111, b);
      $$0.addFixer(new bep($$10, true));
      Schema $$11 = $$0.addSchema(113, b);
      $$0.addFixer(new beu($$11, true));
      Schema $$12 = $$0.addSchema(135, bki::new);
      $$0.addFixer(new bew($$12, true));
      Schema $$13 = $$0.addSchema(143, bkj::new);
      $$0.addFixer(new bfd($$13, true));
      Schema $$14 = $$0.addSchema(147, b);
      $$0.addFixer(new bdz($$14, true));
      Schema $$15 = $$0.addSchema(165, b);
      $$0.addFixer(new bgq($$15, true));
      Schema $$16 = $$0.addSchema(501, bnh::new);
      $$0.addFixer(new bbr($$16, "Add 1.10 entities fix", bin.B));
      Schema $$17 = $$0.addSchema(502, b);
      $$0.addFixer(bgd.a($$17, "cooked_fished item renamer", $$0x -> Objects.equals(bkb.a($$0x), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : $$0x));
      $$0.addFixer(new bfi($$17, false));
      Schema $$18 = $$0.addSchema(505, b);
      $$0.addFixer(new bhu($$18, false));
      Schema $$19 = $$0.addSchema(700, bni::new);
      $$0.addFixer(new bef($$19, true));
      Schema $$20 = $$0.addSchema(701, bnj::new);
      $$0.addFixer(new bfa($$20, true));
      Schema $$21 = $$0.addSchema(702, bnk::new);
      $$0.addFixer(new bfh($$21));
      Schema $$22 = $$0.addSchema(703, bnl::new);
      $$0.addFixer(new bel($$22, true));
      Schema $$23 = $$0.addSchema(704, bnm::new);
      $$0.addFixer(new bck($$23, true));
      Schema $$24 = $$0.addSchema(705, bnn::new);
      $$0.addFixer(new bem($$24, true));
      Schema $$25 = $$0.addSchema(804, c);
      $$0.addFixer(new bfx($$25, true));
      Schema $$26 = $$0.addSchema(806, c);
      $$0.addFixer(new bgp($$26, false));
      Schema $$27 = $$0.addSchema(808, bno::new);
      $$0.addFixer(new bbr($$27, "added shulker box", bin.s));
      Schema $$28 = $$0.addSchema(808, 1, c);
      $$0.addFixer(new bey($$28, false));
      Schema $$29 = $$0.addSchema(813, c);
      $$0.addFixer(new bge($$29, false));
      $$0.addFixer(new bco($$29, false));
      Schema $$30 = $$0.addSchema(816, c);
      $$0.addFixer(new bhx($$30, false));
      Schema $$31 = $$0.addSchema(820, c);
      $$0.addFixer(bgd.a($$31, "totem item renamer", a("minecraft:totem", "minecraft:totem_of_undying")));
      Schema $$32 = $$0.addSchema(1022, bke::new);
      $$0.addFixer(new bjx($$32, "added shoulder entities to players", bin.b));
      Schema $$33 = $$0.addSchema(1125, bkh::new);
      $$0.addFixer(new bdd($$33, true));
      $$0.addFixer(new bcb($$33, false));
      Schema $$34 = $$0.addSchema(1344, c);
      $$0.addFixer(new bhv($$34, false));
      Schema $$35 = $$0.addSchema(1446, c);
      $$0.addFixer(new bhw($$35, false));
      Schema $$36 = $$0.addSchema(1450, c);
      $$0.addFixer(new bcw($$36, false));
      Schema $$37 = $$0.addSchema(1451, bkk::new);
      $$0.addFixer(new bbr($$37, "AddTrappedChestFix", bin.s));
      Schema $$38 = $$0.addSchema(1451, 1, bkl::new);
      $$0.addFixer(new bdj($$38, true));
      Schema $$39 = $$0.addSchema(1451, 2, bkm::new);
      $$0.addFixer(new bci($$39, true));
      Schema $$40 = $$0.addSchema(1451, 3, bkn::new);
      $$0.addFixer(new bea($$40, true));
      $$0.addFixer(new bgk($$40, false));
      Schema $$41 = $$0.addSchema(1451, 4, bko::new);
      $$0.addFixer(new bcs($$41, true));
      $$0.addFixer(new bgn($$41, false));
      Schema $$42 = $$0.addSchema(1451, 5, bkp::new);
      $$0.addFixer(
         new bgc(
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
      $$0.addFixer(new bbr($$42, "RemoveNoteBlockFlowerPotFix", bin.s));
      $$0.addFixer(new bgl($$42, false, "minecraft:spawn_egg"));
      $$0.addFixer(new bfg($$42, false));
      $$0.addFixer(new bch($$42, false));
      $$0.addFixer(new bgx($$42, false));
      Schema $$43 = $$0.addSchema(1451, 6, bkq::new);
      $$0.addFixer(new bjb($$43, true));
      $$0.addFixer(new bcl($$43, false));
      Schema $$44 = $$0.addSchema(1451, 7, c);
      $$0.addFixer(new bjr($$44));
      Schema $$45 = $$0.addSchema(1456, c);
      $$0.addFixer(new ben($$45, false));
      Schema $$46 = $$0.addSchema(1458, c);
      $$0.addFixer(new bee($$46, false));
      $$0.addFixer(new bfy($$46, false));
      $$0.addFixer(new bcj($$46, false));
      Schema $$47 = $$0.addSchema(1460, bkr::new);
      $$0.addFixer(new beq($$47, false));
      Schema $$48 = $$0.addSchema(1466, bks::new);
      $$0.addFixer(new bbr($$48, "Add DUMMY block entity", bin.s));
      $$0.addFixer(new bdp($$48, true));
      Schema $$49 = $$0.addSchema(1470, bkt::new);
      $$0.addFixer(new bbr($$49, "Add 1.13 entities fix", bin.B));
      Schema $$50 = $$0.addSchema(1474, c);
      $$0.addFixer(new bdq($$50, false));
      $$0.addFixer(
         bcu.a($$50, "Colorless shulker block fixer", $$0x -> Objects.equals(bkb.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      $$0.addFixer(
         bgd.a($$50, "Colorless shulker item fixer", $$0x -> Objects.equals(bkb.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      Schema $$51 = $$0.addSchema(1475, c);
      $$0.addFixer(bcu.a($$51, "Flowing fixer", b(ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava"))));
      Schema $$52 = $$0.addSchema(1480, c);
      $$0.addFixer(bcu.a($$52, "Rename coral blocks", b(bit.a)));
      $$0.addFixer(bgd.a($$52, "Rename coral items", b(bit.a)));
      Schema $$53 = $$0.addSchema(1481, bku::new);
      $$0.addFixer(new bbr($$53, "Add conduit", bin.s));
      Schema $$54 = $$0.addSchema(1483, bkv::new);
      $$0.addFixer(new bes($$54, true));
      $$0.addFixer(bgd.a($$54, "Rename pufferfish egg item", b(bes.a)));
      Schema $$55 = $$0.addSchema(1484, c);
      $$0.addFixer(
         bgd.a(
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
      $$0.addFixer(new bfu($$55, false));
      Schema $$56 = $$0.addSchema(1486, bkw::new);
      $$0.addFixer(new bed($$56, true));
      $$0.addFixer(bgd.a($$56, "Rename cod/salmon egg items", b(bed.b)));
      Schema $$57 = $$0.addSchema(1487, c);
      $$0.addFixer(
         bgd.a(
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
      Schema $$58 = $$0.addSchema(1488, c);
      $$0.addFixer(bcu.a($$58, "Rename kelp/kelptop", b(ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant"))));
      $$0.addFixer(bgd.a($$58, "Rename kelptop", a("minecraft:kelp_top", "minecraft:kelp")));
      $$0.addFixer(new bhi($$58, false, "Command block block entity custom name fix", bin.s, "minecraft:command_block") {
         @Override
         protected Typed<?> a(Typed<?> $$0) {
            return $$0.update(DSL.remainderFinder(), bee::a);
         }
      });
      $$0.addFixer(new bhi($$58, false, "Command block minecart custom name fix", bin.B, "minecraft:commandblock_minecart") {
         @Override
         protected Typed<?> a(Typed<?> $$0) {
            return $$0.update(DSL.remainderFinder(), bee::a);
         }
      });
      $$0.addFixer(new bfw($$58, false));
      Schema $$59 = $$0.addSchema(1490, c);
      $$0.addFixer(bcu.a($$59, "Rename melon_block", a("minecraft:melon_block", "minecraft:melon")));
      $$0.addFixer(
         bgd.a(
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
      $$0.addFixer(new bgj($$61, false));
      Schema $$62 = $$0.addSchema(1496, c);
      $$0.addFixer(new bgu($$62, false));
      Schema $$63 = $$0.addSchema(1500, c);
      $$0.addFixer(new bcm($$63, false));
      Schema $$64 = $$0.addSchema(1501, c);
      $$0.addFixer(new bbs($$64, false));
      Schema $$65 = $$0.addSchema(1502, c);
      $$0.addFixer(new bhk($$65, "Recipes fix", bin.J, b(bik.a)));
      Schema $$66 = $$0.addSchema(1506, c);
      $$0.addFixer(new bgw($$66, false));
      Schema $$67 = $$0.addSchema(1510, bkx::new);
      $$0.addFixer(bcu.a($$67, "Block renamening fix", b(bfc.b)));
      $$0.addFixer(bgd.a($$67, "Item renamening fix", b(bfc.c)));
      $$0.addFixer(new bhk($$67, "Recipes renamening fix", bin.J, b(bil.a)));
      $$0.addFixer(new bfc($$67, true));
      $$0.addFixer(
         new bjc(
            $$67,
            "SwimStatsRenameFix",
            ImmutableMap.of("minecraft:swim_one_cm", "minecraft:walk_on_water_one_cm", "minecraft:dive_one_cm", "minecraft:walk_under_water_one_cm")
         )
      );
      Schema $$68 = $$0.addSchema(1514, c);
      $$0.addFixer(new bhm($$68, false));
      $$0.addFixer(new bjh($$68, false));
      $$0.addFixer(new bhn($$68, false));
      Schema $$69 = $$0.addSchema(1515, c);
      $$0.addFixer(bcu.a($$69, "Rename coral fan blocks", b(bis.a)));
      Schema $$70 = $$0.addSchema(1624, c);
      $$0.addFixer(new bjj($$70, false));
      Schema $$71 = $$0.addSchema(1800, bky::new);
      $$0.addFixer(new bbr($$71, "Added 1.14 mobs fix", bin.B));
      $$0.addFixer(bgd.a($$71, "Rename dye items", b(bdv.a)));
      Schema $$72 = $$0.addSchema(1801, bkz::new);
      $$0.addFixer(new bbr($$72, "Added Illager Beast", bin.B));
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
         bgd.a(
            $$73,
            "Rename sign item & stone slabs",
            b(ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))
         )
      );
      Schema $$74 = $$0.addSchema(1803, c);
      $$0.addFixer(new bga($$74, false));
      Schema $$75 = $$0.addSchema(1904, bla::new);
      $$0.addFixer(new bbr($$75, "Added Cats", bin.B));
      $$0.addFixer(new bec($$75, false));
      Schema $$76 = $$0.addSchema(1905, c);
      $$0.addFixer(new bdm($$76, false));
      Schema $$77 = $$0.addSchema(1906, blb::new);
      $$0.addFixer(new bbr($$77, "Add POI Blocks", bin.s));
      Schema $$78 = $$0.addSchema(1909, blc::new);
      $$0.addFixer(new bbr($$78, "Add jigsaw", bin.s));
      Schema $$79 = $$0.addSchema(1911, c);
      $$0.addFixer(new bdn($$79, false));
      Schema $$80 = $$0.addSchema(1914, c);
      $$0.addFixer(new bjt($$80, false));
      Schema $$81 = $$0.addSchema(1917, c);
      $$0.addFixer(new bcz($$81, false));
      Schema $$82 = $$0.addSchema(1918, c);
      $$0.addFixer(new bjn($$82, "minecraft:villager"));
      $$0.addFixer(new bjn($$82, "minecraft:zombie_villager"));
      Schema $$83 = $$0.addSchema(1920, bld::new);
      $$0.addFixer(new bhl($$83, false));
      $$0.addFixer(new bbr($$83, "Add campfire", bin.s));
      Schema $$84 = $$0.addSchema(1925, c);
      $$0.addFixer(new bhd($$84, false));
      Schema $$85 = $$0.addSchema(1928, ble::new);
      $$0.addFixer(new bet($$85, true));
      $$0.addFixer(bgd.a($$85, "Rename ravager egg item", b(bet.a)));
      Schema $$86 = $$0.addSchema(1929, blf::new);
      $$0.addFixer(new bbr($$86, "Add Wandering Trader and Trader Llama", bin.B));
      Schema $$87 = $$0.addSchema(1931, blg::new);
      $$0.addFixer(new bbr($$87, "Added Fox", bin.B));
      Schema $$88 = $$0.addSchema(1936, c);
      $$0.addFixer(new bhs($$88, false));
      Schema $$89 = $$0.addSchema(1946, c);
      $$0.addFixer(new biu($$89, false));
      Schema $$90 = $$0.addSchema(1948, c);
      $$0.addFixer(new bhq($$90));
      Schema $$91 = $$0.addSchema(1953, c);
      $$0.addFixer(new bho($$91, false));
      Schema $$92 = $$0.addSchema(1955, c);
      $$0.addFixer(new bjp($$92, false));
      $$0.addFixer(new bjy($$92, false));
      Schema $$93 = $$0.addSchema(1961, c);
      $$0.addFixer(new bdi($$93, false));
      Schema $$94 = $$0.addSchema(1963, c);
      $$0.addFixer(new biq($$94, false));
      Schema $$95 = $$0.addSchema(2100, blh::new);
      $$0.addFixer(new bbr($$95, "Added Bee and Bee Stinger", bin.B));
      $$0.addFixer(new bbr($$95, "Add beehive", bin.s));
      $$0.addFixer(new bhk($$95, "Rename sugar recipe", bin.J, a("minecraft:sugar", "minecraft:sugar_from_sugar_cane")));
      $$0.addFixer(new bbt($$95, false, "Rename sugar recipe advancement", a("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane")));
      Schema $$96 = $$0.addSchema(2202, c);
      $$0.addFixer(new bde($$96, false));
      Schema $$97 = $$0.addSchema(2209, c);
      UnaryOperator<String> $$98 = a("minecraft:bee_hive", "minecraft:beehive");
      $$0.addFixer(bgd.a($$97, "Rename bee_hive item to beehive", $$98));
      $$0.addFixer(new big($$97, "Rename bee_hive poi to beehive", $$98));
      $$0.addFixer(bcu.a($$97, "Rename bee_hive block to beehive", $$98));
      Schema $$99 = $$0.addSchema(2211, c);
      $$0.addFixer(new bje($$99, false));
      Schema $$100 = $$0.addSchema(2218, c);
      $$0.addFixer(new bfq($$100, false));
      Schema $$101 = $$0.addSchema(2501, bli::new);
      $$0.addFixer(new bfr($$101, true));
      Schema $$102 = $$0.addSchema(2502, blj::new);
      $$0.addFixer(new bbr($$102, "Added Hoglin", bin.B));
      Schema $$103 = $$0.addSchema(2503, c);
      $$0.addFixer(new bjs($$103, false));
      $$0.addFixer(new bbt($$103, false, "Composter category change", a("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter")));
      Schema $$104 = $$0.addSchema(2505, blk::new);
      $$0.addFixer(new bbr($$104, "Added Piglin", bin.B));
      $$0.addFixer(new bhe($$104, "minecraft:villager"));
      Schema $$105 = $$0.addSchema(2508, c);
      $$0.addFixer(
         bgd.a(
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
      Schema $$106 = $$0.addSchema(2509, bll::new);
      $$0.addFixer(new bfj($$106));
      $$0.addFixer(bgd.a($$106, "Rename zombie pigman egg item", b(bfj.a)));
      Schema $$107 = $$0.addSchema(2511, c);
      $$0.addFixer(new ber($$107));
      Schema $$108 = $$0.addSchema(2514, c);
      $$0.addFixer(new bfe($$108));
      $$0.addFixer(new bcr($$108));
      $$0.addFixer(new bie($$108));
      $$0.addFixer(new bgz($$108));
      $$0.addFixer(new biw($$108));
      $$0.addFixer(new bgo($$108));
      Schema $$109 = $$0.addSchema(2516, c);
      $$0.addFixer(new bft($$109, "minecraft:villager"));
      $$0.addFixer(new bft($$109, "minecraft:zombie_villager"));
      Schema $$110 = $$0.addSchema(2518, c);
      $$0.addFixer(new bgr($$110, false));
      $$0.addFixer(new bgs($$110, false));
      Schema $$111 = $$0.addSchema(2519, blm::new);
      $$0.addFixer(new bbr($$111, "Added Strider", bin.B));
      Schema $$112 = $$0.addSchema(2522, bln::new);
      $$0.addFixer(new bbr($$112, "Added Zoglin", bin.B));
      Schema $$113 = $$0.addSchema(2523, c);
      $$0.addFixer(
         new bby(
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
      $$0.addFixer(new bce($$114));
      Schema $$115 = $$0.addSchema(2528, c);
      $$0.addFixer(
         bgd.a(
            $$115,
            "Rename soul fire torch and soul fire lantern",
            b(ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))
         )
      );
      $$0.addFixer(
         bcu.a(
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
      $$0.addFixer(new bjd($$116, false));
      Schema $$117 = $$0.addSchema(2531, c);
      $$0.addFixer(new bim($$117));
      Schema $$118 = $$0.addSchema(2533, c);
      $$0.addFixer(new bjo($$118));
      Schema $$119 = $$0.addSchema(2535, c);
      $$0.addFixer(new bez($$119));
      Schema $$120 = $$0.addSchema(2538, c);
      $$0.addFixer(new bgy($$120));
      Schema $$121 = $$0.addSchema(2550, c);
      $$0.addFixer(new bjv($$121));
      Schema $$122 = $$0.addSchema(2551, blo::new);
      $$0.addFixer(new bjx($$122, "add types to WorldGenData", bin.M));
      Schema $$123 = $$0.addSchema(2552, c);
      $$0.addFixer(new bhk($$123, "Nether biome rename", bin.K, a("minecraft:nether", "minecraft:nether_wastes")));
      Schema $$124 = $$0.addSchema(2553, c);
      $$0.addFixer(new bhk($$124, "Biomes fix", bin.K, b(bcd.a)));
      Schema $$125 = $$0.addSchema(2558, c);
      $$0.addFixer(new bhf($$125, false));
      $$0.addFixer(new bia($$125, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
      Schema $$126 = $$0.addSchema(2568, blp::new);
      $$0.addFixer(new bbr($$126, "Added Piglin Brute", bin.B));
      Schema $$127 = $$0.addSchema(2571, blq::new);
      $$0.addFixer(new bbr($$127, "Added Goat", bin.B));
      Schema $$128 = $$0.addSchema(2679, c);
      $$0.addFixer(new bda($$128, false));
      Schema $$129 = $$0.addSchema(2680, c);
      $$0.addFixer(bgd.a($$129, "Renamed grass path item to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      $$0.addFixer(bcu.a($$129, "Renamed grass path block to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      Schema $$130 = $$0.addSchema(2684, blr::new);
      $$0.addFixer(new bbr($$130, "Added Sculk Sensor", bin.s));
      Schema $$131 = $$0.addSchema(2686, bls::new);
      $$0.addFixer(new bbr($$131, "Added Axolotl", bin.B));
      Schema $$132 = $$0.addSchema(2688, blt::new);
      $$0.addFixer(new bbr($$132, "Added Glow Squid", bin.B));
      $$0.addFixer(new bbr($$132, "Added Glow Item Frame", bin.B));
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
      $$0.addFixer(bgd.a($$133, "Renamed copper block items to new oxidized terms", b($$134)));
      $$0.addFixer(bcu.a($$133, "Renamed copper blocks to new oxidized terms", b($$134)));
      Schema $$135 = $$0.addSchema(2691, c);
      ImmutableMap<String, String> $$136 = ImmutableMap.builder()
         .put("minecraft:waxed_copper", "minecraft:waxed_copper_block")
         .put("minecraft:oxidized_copper_block", "minecraft:oxidized_copper")
         .put("minecraft:weathered_copper_block", "minecraft:weathered_copper")
         .put("minecraft:exposed_copper_block", "minecraft:exposed_copper")
         .build();
      $$0.addFixer(bgd.a($$135, "Rename copper item suffixes", b($$136)));
      $$0.addFixer(bcu.a($$135, "Rename copper blocks suffixes", b($$136)));
      Schema $$137 = $$0.addSchema(2693, c);
      $$0.addFixer(new bbq($$137, bin.M, "has_increased_height_already", false));
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
      $$0.addFixer(bgd.a($$138, "Renamed grimstone block items to deepslate", b($$139)));
      $$0.addFixer(bcu.a($$138, "Renamed grimstone blocks to deepslate", b($$139)));
      Schema $$140 = $$0.addSchema(2700, c);
      $$0.addFixer(
         bcu.a(
            $$140,
            "Renamed cave vines blocks",
            b(ImmutableMap.of("minecraft:cave_vines_head", "minecraft:cave_vines", "minecraft:cave_vines_body", "minecraft:cave_vines_plant"))
         )
      );
      Schema $$141 = $$0.addSchema(2701, c);
      $$0.addFixer(new biv($$141));
      Schema $$142 = $$0.addSchema(2702, c);
      $$0.addFixer(new bbn($$142));
      Schema $$143 = $$0.addSchema(2704, blu::new);
      $$0.addFixer(new bbr($$143, "Added Goat", bin.B));
      Schema $$144 = $$0.addSchema(2707, blv::new);
      $$0.addFixer(new bbr($$144, "Added Marker", bin.B));
      $$0.addFixer(new bbq($$144, bin.M, "has_increased_height_already", true));
      Schema $$145 = $$0.addSchema(2710, c);
      $$0.addFixer(new bjc($$145, "Renamed play_one_minute stat to play_time", ImmutableMap.of("minecraft:play_one_minute", "minecraft:play_time")));
      Schema $$146 = $$0.addSchema(2717, c);
      $$0.addFixer(bgd.a($$146, "Rename azalea_leaves_flowers", b(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves"))));
      $$0.addFixer(
         bcu.a($$146, "Rename azalea_leaves_flowers items", b(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves")))
      );
      Schema $$147 = $$0.addSchema(2825, c);
      $$0.addFixer(new bbq($$147, bin.M, "has_increased_height_already", false));
      Schema $$148 = $$0.addSchema(2831, blw::new);
      $$0.addFixer(new bja($$148));
      Schema $$149 = $$0.addSchema(2832, blx::new);
      $$0.addFixer(new bjw($$149));
      $$0.addFixer(new bdh($$149));
      Schema $$150 = $$0.addSchema(2833, c);
      $$0.addFixer(new bju($$150));
      Schema $$151 = $$0.addSchema(2838, c);
      $$0.addFixer(new bhk($$151, "Caves and Cliffs biome renames", bin.K, b(bdb.a)));
      Schema $$152 = $$0.addSchema(2841, c);
      $$0.addFixer(new bdk($$152));
      Schema $$153 = $$0.addSchema(2842, bly::new);
      $$0.addFixer(new bdl($$153));
      Schema $$154 = $$0.addSchema(2843, c);
      $$0.addFixer(new bib($$154));
      $$0.addFixer(new bhk($$154, "Remove Deep Warm Ocean", bin.K, a("minecraft:deep_warm_ocean", "minecraft:warm_ocean")));
      Schema $$155 = $$0.addSchema(2846, c);
      $$0.addFixer(
         new bbt(
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
      $$0.addFixer(new bju($$156));
      Schema $$157 = $$0.addSchema(2967, c);
      $$0.addFixer(new bjf($$157));
      Schema $$158 = $$0.addSchema(2970, c);
      $$0.addFixer(new bjg($$158));
      Schema $$159 = $$0.addSchema(3076, blz::new);
      $$0.addFixer(new bbr($$159, "Added Sculk Catalyst", bin.s));
      Schema $$160 = $$0.addSchema(3077, c);
      $$0.addFixer(new bdf($$160));
      Schema $$161 = $$0.addSchema(3078, bma::new);
      $$0.addFixer(new bbr($$161, "Added Frog", bin.B));
      $$0.addFixer(new bbr($$161, "Added Tadpole", bin.B));
      $$0.addFixer(new bbr($$161, "Added Sculk Shrieker", bin.s));
      Schema $$162 = $$0.addSchema(3081, bmb::new);
      $$0.addFixer(new bbr($$162, "Added Warden", bin.B));
      Schema $$163 = $$0.addSchema(3082, bmc::new);
      $$0.addFixer(new bbr($$163, "Added Chest Boat", bin.B));
      Schema $$164 = $$0.addSchema(3083, bmd::new);
      $$0.addFixer(new bbr($$164, "Added Allay", bin.B));
      Schema $$165 = $$0.addSchema(3084, c);
      $$0.addFixer(
         new bhk(
            $$165,
            "game_event_renames_3084",
            bin.E,
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
      $$0.addFixer(new bff($$166, "Change cat variant type", bin.B, "minecraft:cat", "CatType", ae.a(new Int2ObjectOpenHashMap(), $$0x -> {
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
      $$0.addFixer(new bds($$166, "Migrate cat variant advancement", "minecraft:husbandry/complete_catalogue", $$1x -> (String)$$167.getOrDefault($$1x, $$1x)));
      Schema $$168 = $$0.addSchema(3087, c);
      $$0.addFixer(new bff($$168, "Change frog variant type", bin.B, "minecraft:frog", "Variant", ae.a(new Int2ObjectOpenHashMap(), $$0x -> {
         $$0x.put(0, "minecraft:temperate");
         $$0x.put(1, "minecraft:warm");
         $$0x.put(2, "minecraft:cold");
      })::get));
      Schema $$169 = $$0.addSchema(3090, c);
      $$0.addFixer(new beh($$169, "EntityPaintingFieldsRenameFix", "minecraft:painting", Map.of("Motive", "variant", "Facing", "facing")));
      Schema $$170 = $$0.addSchema(3093, c);
      $$0.addFixer(new bei($$170));
      Schema $$171 = $$0.addSchema(3094, c);
      $$0.addFixer(new bfs($$171));
      Schema $$172 = $$0.addSchema(3097, c);
      $$0.addFixer(new bfl($$172));
      $$0.addFixer(new bfm($$172));
      Map<String, String> $$173 = Map.of("minecraft:british", "minecraft:british_shorthair");
      $$0.addFixer(new bjm($$172, "Rename british shorthair", bin.B, "minecraft:cat", $$173));
      $$0.addFixer(
         new bds(
            $$172, "Migrate cat variant advancement for british shorthair", "minecraft:husbandry/complete_catalogue", $$1x -> $$173.getOrDefault($$1x, $$1x)
         )
      );
      $$0.addFixer(new bif($$172, "Remove unpopulated villager PoI types", Set.of("minecraft:unemployed", "minecraft:nitwit")::contains));
      Schema $$174 = $$0.addSchema(3108, c);
      $$0.addFixer(new bcg($$174));
      Schema $$175 = $$0.addSchema(3201, c);
      $$0.addFixer(new bhz($$175));
      Schema $$176 = $$0.addSchema(3202, bme::new);
      $$0.addFixer(new bbr($$176, "Added Hanging Sign", bin.s));
      Schema $$177 = $$0.addSchema(3203, bmf::new);
      $$0.addFixer(new bbr($$177, "Added Camel", bin.B));
      Schema $$178 = $$0.addSchema(3204, bmg::new);
      $$0.addFixer(new bbr($$178, "Added Chiseled Bookshelf", bin.s));
      Schema $$179 = $$0.addSchema(3209, c);
      $$0.addFixer(new bgl($$179, false, "minecraft:pig_spawn_egg"));
      Schema $$180 = $$0.addSchema(3214, c);
      $$0.addFixer(new bht($$180));
      Schema $$181 = $$0.addSchema(3319, c);
      $$0.addFixer(new bhr($$181));
      Schema $$182 = $$0.addSchema(3322, c);
      $$0.addFixer(new bdw($$182));
      Schema $$183 = $$0.addSchema(3325, bmh::new);
      $$0.addFixer(new bbr($$183, "Added displays", bin.B));
      Schema $$184 = $$0.addSchema(3326, bmi::new);
      $$0.addFixer(new bbr($$184, "Added Sniffer", bin.B));
      Schema $$185 = $$0.addSchema(3327, bmj::new);
      $$0.addFixer(new bbr($$185, "Archaeology", bin.s));
      Schema $$186 = $$0.addSchema(3328, bmk::new);
      $$0.addFixer(new bbr($$186, "Added interaction", bin.B));
      Schema $$187 = $$0.addSchema(3438, bml::new);
      $$0.addFixer(bcn.a($$187, "Rename Suspicious Sand to Brushable Block", a("minecraft:suspicious_sand", "minecraft:brushable_block")));
      $$0.addFixer(new beb($$187));
      $$0.addFixer(
         bgd.a(
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
      $$0.addFixer(new bbr($$187, "Added calibrated sculk sensor", bin.s));
      Schema $$188 = $$0.addSchema(3439, c);
      $$0.addFixer(new bcp($$188, "Updated sign text format for Signs", "minecraft:sign"));
      $$0.addFixer(new bcp($$188, "Updated sign text format for Hanging Signs", "minecraft:hanging_sign"));
      Schema $$189 = $$0.addSchema(3440, c);
      $$0.addFixer(new bhk($$189, "Replace experimental 1.20 overworld", bin.L, a("minecraft:overworld_update_1_20", "minecraft:overworld")));
      $$0.addFixer(new bfk($$189, "Remove 1.20 feature toggle", Set.of("minecraft:update_1_20")));
      Schema $$190 = $$0.addSchema(3441, c);
      $$0.addFixer(new bcf($$190));
      Schema $$191 = $$0.addSchema(3447, c);
      $$0.addFixer(
         bgd.a(
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
      Schema $$192 = $$0.addSchema(3448, bmm::new);
      $$0.addFixer(new bdt($$192));
      Schema $$193 = $$0.addSchema(3450, c);
      $$0.addFixer(
         new bio(
            $$193,
            "Remove liquid_carvers and heightmap chunk statuses",
            b(Map.of("minecraft:liquid_carvers", "minecraft:carvers", "minecraft:heightmaps", "minecraft:spawn"))
         )
      );
      Schema $$194 = $$0.addSchema(3451, c);
      $$0.addFixer(new bdg($$194));
      Schema $$195 = $$0.addSchema(3459, c);
      $$0.addFixer(new bgv($$195));
      Schema $$196 = $$0.addSchema(3564, c);
      $$0.addFixer(new bdu($$196, "Drop invalid sign datafix data", "minecraft:sign"));
      $$0.addFixer(new bdu($$196, "Drop invalid hanging sign datafix data", "minecraft:hanging_sign"));
      Schema $$197 = $$0.addSchema(3565, c);
      $$0.addFixer(new bij($$197));
      Schema $$198 = $$0.addSchema(3566, c);
      $$0.addFixer(new bix($$198));
      Schema $$199 = $$0.addSchema(3568, c);
      $$0.addFixer(new bhg($$199));
      Schema $$200 = $$0.addSchema(3682, bmn::new);
      $$0.addFixer(new bbr($$200, "Added Crafter", bin.s));
      Schema $$201 = $$0.addSchema(3683, bmo::new);
      $$0.addFixer(new bih($$201));
      Schema $$202 = $$0.addSchema(3685, bmp::new);
      $$0.addFixer(new bfo($$202));
      Schema $$203 = $$0.addSchema(3689, bmq::new);
      $$0.addFixer(new bbr($$203, "Added Breeze", bin.B));
      $$0.addFixer(new bbr($$203, "Added Trial Spawner", bin.s));
      Schema $$204 = $$0.addSchema(3692, c);
      UnaryOperator<String> $$205 = b(Map.of("minecraft:grass", "minecraft:short_grass"));
      $$0.addFixer(bcu.a($$204, "Rename grass block to short_grass", $$205));
      $$0.addFixer(bgd.a($$204, "Rename grass item to short_grass", $$205));
      Schema $$206 = $$0.addSchema(3799, bmr::new);
      $$0.addFixer(new bbr($$206, "Added Armadillo", bin.B));
      Schema $$207 = $$0.addSchema(3800, c);
      UnaryOperator<String> $$208 = b(Map.of("minecraft:scute", "minecraft:turtle_scute"));
      $$0.addFixer(bgd.a($$207, "Rename scute item to turtle_scute", $$208));
      Schema $$209 = $$0.addSchema(3803, c);
      $$0.addFixer(new bir($$209, "Rename sweeping enchant to sweeping_edge", Map.of("minecraft:sweeping", "minecraft:sweeping_edge")));
      Schema $$210 = $$0.addSchema(3807, bms::new);
      $$0.addFixer(new bbr($$210, "Added Vault", bin.s));
      Schema $$211 = $$0.addSchema(3807, 1, c);
      $$0.addFixer(new bhc($$211));
      Schema $$212 = $$0.addSchema(3808, bmt::new);
      $$0.addFixer(new bfv($$212, "minecraft:horse", "ArmorItem", true));
      Schema $$213 = $$0.addSchema(3808, 1, bmu::new);
      $$0.addFixer(new bfv($$213, "minecraft:llama", "DecorItem", false));
      Schema $$214 = $$0.addSchema(3808, 2, bmv::new);
      $$0.addFixer(new bfv($$214, "minecraft:trader_llama", "DecorItem", false));
      Schema $$215 = $$0.addSchema(3809, c);
      $$0.addFixer(new bdc($$215));
      Schema $$216 = $$0.addSchema(3812, c);
      $$0.addFixer(new bbl($$216));
      Schema $$217 = $$0.addSchema(3813, c);
      $$0.addFixer(new bct($$217));
      Schema $$218 = $$0.addSchema(3814, c);
      $$0.addFixer(new bby($$218, "Rename jump strength attribute", a("minecraft:horse.jump_strength", "minecraft:generic.jump_strength")));
      Schema $$219 = $$0.addSchema(3816, bmw::new);
      $$0.addFixer(new bbr($$219, "Added Bogged", bin.B));
      Schema $$220 = $$0.addSchema(3818, bmx::new);
      $$0.addFixer(new bcc($$220));
      $$0.addFixer(new bdx($$220));
      Schema $$221 = $$0.addSchema(3818, 1, c);
      $$0.addFixer(new bca($$221));
      Schema $$222 = $$0.addSchema(3818, 2, c);
      $$0.addFixer(new bji($$222));
      Schema $$223 = $$0.addSchema(3818, 3, bmy::new);
      $$0.addFixer(new bjx($$223, "Inject data component types", bin.w));
      Schema $$224 = $$0.addSchema(3818, 4, bmz::new);
      $$0.addFixer(new bic($$224));
      Schema $$225 = $$0.addSchema(3818, 5, bna::new);
      $$0.addFixer(new bgh($$225));
      Schema $$226 = $$0.addSchema(3818, 6, c);
      $$0.addFixer(new bbu($$226));
      Schema $$227 = $$0.addSchema(3820, c);
      $$0.addFixer(new bid($$227));
      $$0.addFixer(new bhb($$227));
      Schema $$228 = $$0.addSchema(3825, bnb::new);
      $$0.addFixer(new bgi($$228));
      $$0.addFixer(new bbz($$228));
      $$0.addFixer(new bjk($$228));
      $$0.addFixer(new bbr($$228, "Added Ominous Item Spawner", bin.B));
      Schema $$229 = $$0.addSchema(3828, c);
      $$0.addFixer(new bdy($$229));
      Schema $$230 = $$0.addSchema(3833, c);
      $$0.addFixer(new bip($$230));
      Schema $$231 = $$0.addSchema(3938, bnc::new);
      $$0.addFixer(new bii($$231));
      Schema $$232 = $$0.addSchema(3939, c);
      $$0.addFixer(new bfk($$232, "Remove 1.21 feature toggle", Set.of("minecraft:update_1_21")));
      Schema $$233 = $$0.addSchema(3943, c);
      $$0.addFixer(new bhy($$233));
      Schema $$234 = $$0.addSchema(3945, c);
      $$0.addFixer(new bbw($$234));
      $$0.addFixer(new bgt($$234));
      Schema $$235 = $$0.addSchema(4054, c);
      $$0.addFixer(new bhp($$235));
      Schema $$236 = $$0.addSchema(4055, c);
      $$0.addFixer(new bbv($$236));
      Schema $$237 = $$0.addSchema(4057, c);
      $$0.addFixer(new bcy($$237));
      Schema $$238 = $$0.addSchema(4059, bnd::new);
      $$0.addFixer(new bfp($$238));
      Schema $$239 = $$0.addSchema(4061, c);
      $$0.addFixer(new bjl($$239));
      Schema $$240 = $$0.addSchema(4064, c);
      $$0.addFixer(new bfn($$240));
      Schema $$241 = $$0.addSchema(4067, bne::new);
      $$0.addFixer(new bcx($$241));
      $$0.addFixer(new bfk($$241, "Remove Bundle experimental feature flag", Set.of("minecraft:bundle")));
      Schema $$242 = $$0.addSchema(4068, c);
      $$0.addFixer(new bha($$242));
      $$0.addFixer(new bdr($$242));
      Schema $$243 = $$0.addSchema(4070, bnf::new);
      $$0.addFixer(new bbr($$243, "Added Pale Oak Boat and Pale Oak Chest Boat", bin.B));
      Schema $$244 = $$0.addSchema(4071, bng::new);
      $$0.addFixer(new bbr($$244, "Added Creaking", bin.B));
      $$0.addFixer(new bbr($$244, "Added Creaking Heart", bin.s));
      Schema $$245 = $$0.addSchema(4081, c);
      $$0.addFixer(new bex($$245));
      Schema $$246 = $$0.addSchema(4173, c);
      $$0.addFixer(new beh($$246, "Rename TNT Minecart fuse", "minecraft:tnt_minecart", Map.of("TNTFuse", "fuse")));
   }

   private static UnaryOperator<String> a(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault($$1, $$1);
   }

   private static UnaryOperator<String> b(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault(bkb.a($$1), $$1);
   }

   private static UnaryOperator<String> a(String $$0, String $$1) {
      return $$2 -> Objects.equals(bkb.a($$2), $$0) ? $$1 : $$2;
   }
}
