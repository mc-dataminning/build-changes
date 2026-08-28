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

public class bbc {
   private static final BiFunction<Integer, Schema, Schema> b = Schema::new;
   private static final BiFunction<Integer, Schema, Schema> c = bkr::new;
   private static final Result d = b();
   public static final int a = 4295;

   private bbc() {
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
      $$0.addSchema(99, bos::new);
      Schema $$1 = $$0.addSchema(100, bks::new);
      $$0.addFixer(new beg($$1));
      Schema $$2 = $$0.addSchema(101, b);
      $$0.addFixer(new bkg($$2));
      Schema $$3 = $$0.addSchema(102, bkt::new);
      $$0.addFixer(new bgh($$3, true));
      $$0.addFixer(new bgj($$3, false));
      Schema $$4 = $$0.addSchema(105, b);
      $$0.addFixer(new bgn($$4, true));
      Schema $$5 = $$0.addSchema(106, bkv::new);
      $$0.addFixer(new bhp($$5, true));
      Schema $$6 = $$0.addSchema(107, bkw::new);
      $$0.addFixer(new bep($$6));
      Schema $$7 = $$0.addSchema(108, b);
      $$0.addFixer(new bfd($$7, true));
      Schema $$8 = $$0.addSchema(109, b);
      $$0.addFixer(new bek($$8, true));
      Schema $$9 = $$0.addSchema(110, b);
      $$0.addFixer(new bel($$9, true));
      Schema $$10 = $$0.addSchema(111, b);
      $$0.addFixer(new beq($$10, true));
      Schema $$11 = $$0.addSchema(113, b);
      $$0.addFixer(new bev($$11, true));
      Schema $$12 = $$0.addSchema(135, bky::new);
      $$0.addFixer(new bex($$12, true));
      Schema $$13 = $$0.addSchema(143, bkz::new);
      $$0.addFixer(new bff($$13, true));
      Schema $$14 = $$0.addSchema(147, b);
      $$0.addFixer(new bdy($$14, true));
      Schema $$15 = $$0.addSchema(165, b);
      $$0.addFixer(new bjt($$15));
      Schema $$16 = $$0.addSchema(501, bok::new);
      $$0.addFixer(new bbl($$16, "Add 1.10 entities fix", biw.D));
      Schema $$17 = $$0.addSchema(502, b);
      $$0.addFixer(bgl.a($$17, "cooked_fished item renamer", $$0x -> Objects.equals(bkr.a($$0x), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : $$0x));
      $$0.addFixer(new bfk($$17, false));
      Schema $$18 = $$0.addSchema(505, b);
      $$0.addFixer(new bic($$18, false));
      Schema $$19 = $$0.addSchema(700, bol::new);
      $$0.addFixer(new bef($$19, true));
      Schema $$20 = $$0.addSchema(701, bom::new);
      $$0.addFixer(new bfb($$20, true));
      Schema $$21 = $$0.addSchema(702, bon::new);
      $$0.addFixer(new bfj($$21));
      Schema $$22 = $$0.addSchema(703, boo::new);
      $$0.addFixer(new bem($$22, true));
      Schema $$23 = $$0.addSchema(704, bop::new);
      $$0.addFixer(new bcg($$23, true));
      Schema $$24 = $$0.addSchema(705, boq::new);
      $$0.addFixer(new ben($$24, true));
      Schema $$25 = $$0.addSchema(804, c);
      $$0.addFixer(new bgf($$25, true));
      Schema $$26 = $$0.addSchema(806, c);
      $$0.addFixer(new bgx($$26, false));
      Schema $$27 = $$0.addSchema(808, bor::new);
      $$0.addFixer(new bbl($$27, "added shulker box", biw.s));
      Schema $$28 = $$0.addSchema(808, 1, c);
      $$0.addFixer(new bez($$28, false));
      Schema $$29 = $$0.addSchema(813, c);
      $$0.addFixer(new bgm($$29, false));
      $$0.addFixer(new bck($$29, false));
      Schema $$30 = $$0.addSchema(816, c);
      $$0.addFixer(new bif($$30, false));
      Schema $$31 = $$0.addSchema(820, c);
      $$0.addFixer(bgl.a($$31, "totem item renamer", a("minecraft:totem", "minecraft:totem_of_undying")));
      Schema $$32 = $$0.addSchema(1022, bku::new);
      $$0.addFixer(new bkn($$32, "added shoulder entities to players", biw.b));
      Schema $$33 = $$0.addSchema(1125, bkx::new);
      $$0.addFixer(new bcz($$33, true));
      $$0.addFixer(new bbw($$33, false));
      Schema $$34 = $$0.addSchema(1344, c);
      $$0.addFixer(new bid($$34, false));
      Schema $$35 = $$0.addSchema(1446, c);
      $$0.addFixer(new bie($$35, false));
      Schema $$36 = $$0.addSchema(1450, c);
      $$0.addFixer(new bcs($$36, false));
      Schema $$37 = $$0.addSchema(1451, bla::new);
      $$0.addFixer(new bbl($$37, "AddTrappedChestFix", biw.s));
      Schema $$38 = $$0.addSchema(1451, 1, blb::new);
      $$0.addFixer(new bdf($$38, true));
      Schema $$39 = $$0.addSchema(1451, 2, blc::new);
      $$0.addFixer(new bcd($$39, true));
      Schema $$40 = $$0.addSchema(1451, 3, bld::new);
      $$0.addFixer(new bea($$40, true));
      $$0.addFixer(new bgr($$40, false));
      Schema $$41 = $$0.addSchema(1451, 4, ble::new);
      $$0.addFixer(new bcn($$41, true));
      $$0.addFixer(new bgv($$41, false));
      Schema $$42 = $$0.addSchema(1451, 5, blf::new);
      $$0.addFixer(
         new bgk(
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
      $$0.addFixer(new bbl($$42, "RemoveNoteBlockFlowerPotFix", biw.s));
      $$0.addFixer(new bgs($$42, false, "minecraft:spawn_egg"));
      $$0.addFixer(new bfi($$42, false));
      $$0.addFixer(new bcc($$42, false));
      $$0.addFixer(new bhf($$42, false));
      Schema $$43 = $$0.addSchema(1451, 6, blg::new);
      $$0.addFixer(new bjm($$43, true));
      $$0.addFixer(new bch($$43, false));
      Schema $$44 = $$0.addSchema(1451, 7, c);
      $$0.addFixer(new bkh($$44));
      Schema $$45 = $$0.addSchema(1456, c);
      $$0.addFixer(new beo($$45, false));
      Schema $$46 = $$0.addSchema(1458, blh::new);
      $$0.addFixer(new bee($$46));
      $$0.addFixer(new bgg($$46));
      $$0.addFixer(new bce($$46));
      Schema $$47 = $$0.addSchema(1460, bli::new);
      $$0.addFixer(new ber($$47, false));
      Schema $$48 = $$0.addSchema(1466, blj::new);
      $$0.addFixer(new bbl($$48, "Add DUMMY block entity", biw.s));
      $$0.addFixer(new bdl($$48, true));
      Schema $$49 = $$0.addSchema(1470, blk::new);
      $$0.addFixer(new bbl($$49, "Add 1.13 entities fix", biw.D));
      Schema $$50 = $$0.addSchema(1474, c);
      $$0.addFixer(new bdm($$50, false));
      $$0.addFixer(
         bcq.a($$50, "Colorless shulker block fixer", $$0x -> Objects.equals(bkr.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      $$0.addFixer(
         bgl.a($$50, "Colorless shulker item fixer", $$0x -> Objects.equals(bkr.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      Schema $$51 = $$0.addSchema(1475, c);
      $$0.addFixer(bcq.a($$51, "Flowing fixer", b(ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava"))));
      Schema $$52 = $$0.addSchema(1480, c);
      $$0.addFixer(bcq.a($$52, "Rename coral blocks", b(bjc.a)));
      $$0.addFixer(bgl.a($$52, "Rename coral items", b(bjc.a)));
      Schema $$53 = $$0.addSchema(1481, bll::new);
      $$0.addFixer(new bbl($$53, "Add conduit", biw.s));
      Schema $$54 = $$0.addSchema(1483, blm::new);
      $$0.addFixer(new bet($$54, true));
      $$0.addFixer(bgl.a($$54, "Rename pufferfish egg item", b(bet.a)));
      Schema $$55 = $$0.addSchema(1484, c);
      $$0.addFixer(
         bgl.a(
            $$55,
            "Rename seagrass items",
            b(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(
         bcq.a(
            $$55,
            "Rename seagrass blocks",
            b(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(new bga($$55, false));
      Schema $$56 = $$0.addSchema(1486, bln::new);
      $$0.addFixer(new bed($$56, true));
      $$0.addFixer(bgl.a($$56, "Rename cod/salmon egg items", b(bed.b)));
      Schema $$57 = $$0.addSchema(1487, c);
      $$0.addFixer(
         bgl.a(
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
         bcq.a(
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
      Schema $$58 = $$0.addSchema(1488, blo::new);
      $$0.addFixer(bcq.a($$58, "Rename kelp/kelptop", b(ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant"))));
      $$0.addFixer(bgl.a($$58, "Rename kelptop", a("minecraft:kelp_top", "minecraft:kelp")));
      $$0.addFixer(new bhs($$58, true, "Command block block entity custom name fix", biw.s, "minecraft:command_block") {
         @Override
         protected <T> Dynamic<T> a(Dynamic<T> $$0) {
            return bce.a($$0);
         }
      });
      $$0.addFixer(
         new DataFix($$58, false) {
            protected TypeRewriteRule makeRule() {
               Type<?> $$0 = this.getInputSchema().getType(biw.D);
               OpticFinder<String> $$1 = DSL.fieldFinder("id", bkr.a());
               OpticFinder<?> $$2 = $$0.findField("CustomName");
               OpticFinder<Pair<String, String>> $$3 = DSL.typeFinder(this.getInputSchema().getType(biw.z));
               return this.fixTypeEverywhereTyped(
                  "Command block minecart custom name fix",
                  $$0,
                  $$3x -> {
                     String $$4 = $$3x.getOptional($$1).orElse("");
                     return !"minecraft:commandblock_minecart".equals($$4)
                        ? $$3x
                        : $$3x.updateTyped($$2, $$1xx -> $$1xx.update($$3, $$0xxx -> $$0xxx.mapSecond(bbe::a)));
                  }
               );
            }
         }
      );
      $$0.addFixer(new bgc($$58, false));
      Schema $$59 = $$0.addSchema(1490, c);
      $$0.addFixer(bcq.a($$59, "Rename melon_block", a("minecraft:melon_block", "minecraft:melon")));
      $$0.addFixer(
         bgl.a(
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
      $$0.addFixer(new bdk($$60, false));
      Schema $$61 = $$0.addSchema(1494, c);
      $$0.addFixer(new bgq($$61, false));
      Schema $$62 = $$0.addSchema(1496, c);
      $$0.addFixer(new bhb($$62, false));
      Schema $$63 = $$0.addSchema(1500, c);
      $$0.addFixer(new bci($$63, false));
      Schema $$64 = $$0.addSchema(1501, c);
      $$0.addFixer(new bbm($$64, false));
      Schema $$65 = $$0.addSchema(1502, c);
      $$0.addFixer(new bht($$65, "Recipes fix", biw.L, b(bit.a)));
      Schema $$66 = $$0.addSchema(1506, c);
      $$0.addFixer(new bhe($$66, false));
      Schema $$67 = $$0.addSchema(1510, blp::new);
      $$0.addFixer(bcq.a($$67, "Block renamening fix", b(bfe.b)));
      $$0.addFixer(bgl.a($$67, "Item renamening fix", b(bfe.c)));
      $$0.addFixer(new bht($$67, "Recipes renamening fix", biw.L, b(biu.a)));
      $$0.addFixer(new bfe($$67, true));
      $$0.addFixer(
         new bjn(
            $$67,
            "SwimStatsRenameFix",
            ImmutableMap.of("minecraft:swim_one_cm", "minecraft:walk_on_water_one_cm", "minecraft:dive_one_cm", "minecraft:walk_under_water_one_cm")
         )
      );
      Schema $$68 = $$0.addSchema(1514, c);
      $$0.addFixer(new bjh($$68, "ObjectiveDisplayNameFix", biw.J));
      $$0.addFixer(new bjh($$68, "TeamDisplayNameFix", biw.K));
      $$0.addFixer(new bhv($$68));
      Schema $$69 = $$0.addSchema(1515, c);
      $$0.addFixer(bcq.a($$69, "Rename coral fan blocks", b(bjb.a)));
      Schema $$70 = $$0.addSchema(1624, c);
      $$0.addFixer(new bjy($$70, false));
      Schema $$71 = $$0.addSchema(1800, blq::new);
      $$0.addFixer(new bbl($$71, "Added 1.14 mobs fix", biw.D));
      $$0.addFixer(bgl.a($$71, "Rename dye items", b(bdu.a)));
      Schema $$72 = $$0.addSchema(1801, blr::new);
      $$0.addFixer(new bbl($$72, "Added Illager Beast", biw.D));
      Schema $$73 = $$0.addSchema(1802, c);
      $$0.addFixer(
         bcq.a(
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
         bgl.a(
            $$73,
            "Rename sign item & stone slabs",
            b(ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))
         )
      );
      Schema $$74 = $$0.addSchema(1803, c);
      $$0.addFixer(new bgi($$74));
      Schema $$75 = $$0.addSchema(1904, bls::new);
      $$0.addFixer(new bbl($$75, "Added Cats", biw.D));
      $$0.addFixer(new bec($$75, false));
      Schema $$76 = $$0.addSchema(1905, c);
      $$0.addFixer(new bdi($$76, false));
      Schema $$77 = $$0.addSchema(1906, blt::new);
      $$0.addFixer(new bbl($$77, "Add POI Blocks", biw.s));
      Schema $$78 = $$0.addSchema(1909, blu::new);
      $$0.addFixer(new bbl($$78, "Add jigsaw", biw.s));
      Schema $$79 = $$0.addSchema(1911, c);
      $$0.addFixer(new bdj($$79, false));
      Schema $$80 = $$0.addSchema(1914, c);
      $$0.addFixer(new bkj($$80, false));
      Schema $$81 = $$0.addSchema(1917, c);
      $$0.addFixer(new bcv($$81, false));
      Schema $$82 = $$0.addSchema(1918, c);
      $$0.addFixer(new bkd($$82, "minecraft:villager"));
      $$0.addFixer(new bkd($$82, "minecraft:zombie_villager"));
      Schema $$83 = $$0.addSchema(1920, blv::new);
      $$0.addFixer(new bhu($$83, false));
      $$0.addFixer(new bbl($$83, "Add campfire", biw.s));
      Schema $$84 = $$0.addSchema(1925, blw::new);
      $$0.addFixer(new bhl($$84));
      Schema $$85 = $$0.addSchema(1928, blx::new);
      $$0.addFixer(new beu($$85, true));
      $$0.addFixer(bgl.a($$85, "Rename ravager egg item", b(beu.a)));
      Schema $$86 = $$0.addSchema(1929, bly::new);
      $$0.addFixer(new bbl($$86, "Add Wandering Trader and Trader Llama", biw.D));
      Schema $$87 = $$0.addSchema(1931, blz::new);
      $$0.addFixer(new bbl($$87, "Added Fox", biw.D));
      Schema $$88 = $$0.addSchema(1936, c);
      $$0.addFixer(new bia($$88, false));
      Schema $$89 = $$0.addSchema(1946, c);
      $$0.addFixer(new bjd($$89, false));
      Schema $$90 = $$0.addSchema(1948, c);
      $$0.addFixer(new bhy($$90));
      Schema $$91 = $$0.addSchema(1953, c);
      $$0.addFixer(new bhw($$91, false));
      Schema $$92 = $$0.addSchema(1955, c);
      $$0.addFixer(new bkf($$92, false));
      $$0.addFixer(new bko($$92, false));
      Schema $$93 = $$0.addSchema(1961, c);
      $$0.addFixer(new bde($$93, false));
      Schema $$94 = $$0.addSchema(1963, c);
      $$0.addFixer(new biz($$94, false));
      Schema $$95 = $$0.addSchema(2100, bma::new);
      $$0.addFixer(new bbl($$95, "Added Bee and Bee Stinger", biw.D));
      $$0.addFixer(new bbl($$95, "Add beehive", biw.s));
      $$0.addFixer(new bht($$95, "Rename sugar recipe", biw.L, a("minecraft:sugar", "minecraft:sugar_from_sugar_cane")));
      $$0.addFixer(new bbn($$95, false, "Rename sugar recipe advancement", a("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane")));
      Schema $$96 = $$0.addSchema(2202, c);
      $$0.addFixer(new bda($$96, false));
      Schema $$97 = $$0.addSchema(2209, c);
      UnaryOperator<String> $$98 = a("minecraft:bee_hive", "minecraft:beehive");
      $$0.addFixer(bgl.a($$97, "Rename bee_hive item to beehive", $$98));
      $$0.addFixer(new bio($$97, "Rename bee_hive poi to beehive", $$98));
      $$0.addFixer(bcq.a($$97, "Rename bee_hive block to beehive", $$98));
      Schema $$99 = $$0.addSchema(2211, c);
      $$0.addFixer(new bjp($$99, false));
      Schema $$100 = $$0.addSchema(2218, c);
      $$0.addFixer(new bfv($$100, false));
      Schema $$101 = $$0.addSchema(2501, bmb::new);
      $$0.addFixer(new bfx($$101, true));
      Schema $$102 = $$0.addSchema(2502, bmc::new);
      $$0.addFixer(new bbl($$102, "Added Hoglin", biw.D));
      Schema $$103 = $$0.addSchema(2503, c);
      $$0.addFixer(new bki($$103, false));
      $$0.addFixer(new bbn($$103, false, "Composter category change", a("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter")));
      Schema $$104 = $$0.addSchema(2505, bmd::new);
      $$0.addFixer(new bbl($$104, "Added Piglin", biw.D));
      $$0.addFixer(new bhm($$104, "minecraft:villager"));
      Schema $$105 = $$0.addSchema(2508, c);
      $$0.addFixer(
         bgl.a(
            $$105,
            "Renamed fungi items to fungus",
            b(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      $$0.addFixer(
         bcq.a(
            $$105,
            "Renamed fungi blocks to fungus",
            b(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      Schema $$106 = $$0.addSchema(2509, bme::new);
      $$0.addFixer(new bfl($$106));
      $$0.addFixer(bgl.a($$106, "Rename zombie pigman egg item", b(bfl.a)));
      Schema $$107 = $$0.addSchema(2511, c);
      $$0.addFixer(new bes($$107));
      Schema $$108 = $$0.addSchema(2511, 1, bmf::new);
      $$0.addFixer(new bhq($$108, "SplashPotionItemFieldRenameFix", biw.D, "minecraft:potion"));
      Schema $$109 = $$0.addSchema(2514, c);
      $$0.addFixer(new bfg($$109));
      $$0.addFixer(new bcm($$109));
      $$0.addFixer(new bim($$109));
      $$0.addFixer(new bhh($$109));
      $$0.addFixer(new bjg($$109));
      $$0.addFixer(new bgw($$109));
      Schema $$110 = $$0.addSchema(2516, c);
      $$0.addFixer(new bfz($$110, "minecraft:villager"));
      $$0.addFixer(new bfz($$110, "minecraft:zombie_villager"));
      Schema $$111 = $$0.addSchema(2518, c);
      $$0.addFixer(new bgy($$111, false));
      $$0.addFixer(new bgz($$111));
      Schema $$112 = $$0.addSchema(2519, bmg::new);
      $$0.addFixer(new bbl($$112, "Added Strider", biw.D));
      Schema $$113 = $$0.addSchema(2522, bmh::new);
      $$0.addFixer(new bbl($$113, "Added Zoglin", biw.D));
      Schema $$114 = $$0.addSchema(2523, c);
      $$0.addFixer(
         new bbt(
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
      $$0.addFixer(new bbz($$115));
      Schema $$116 = $$0.addSchema(2528, c);
      $$0.addFixer(
         bgl.a(
            $$116,
            "Rename soul fire torch and soul fire lantern",
            b(ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))
         )
      );
      $$0.addFixer(
         bcq.a(
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
      $$0.addFixer(new bjo($$117, false));
      Schema $$118 = $$0.addSchema(2531, c);
      $$0.addFixer(new biv($$118));
      Schema $$119 = $$0.addSchema(2533, c);
      $$0.addFixer(new bke($$119));
      Schema $$120 = $$0.addSchema(2535, c);
      $$0.addFixer(new bfa($$120));
      Schema $$121 = $$0.addSchema(2538, c);
      $$0.addFixer(new bhg($$121));
      Schema $$122 = $$0.addSchema(2550, c);
      $$0.addFixer(new bkl($$122));
      Schema $$123 = $$0.addSchema(2551, bmi::new);
      $$0.addFixer(new bkn($$123, "add types to WorldGenData", biw.O));
      Schema $$124 = $$0.addSchema(2552, c);
      $$0.addFixer(new bht($$124, "Nether biome rename", biw.M, a("minecraft:nether", "minecraft:nether_wastes")));
      Schema $$125 = $$0.addSchema(2553, c);
      $$0.addFixer(new bht($$125, "Biomes fix", biw.M, b(bby.a)));
      Schema $$126 = $$0.addSchema(2558, c);
      $$0.addFixer(new bhn($$126, false));
      $$0.addFixer(new bii($$126, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
      Schema $$127 = $$0.addSchema(2568, bmj::new);
      $$0.addFixer(new bbl($$127, "Added Piglin Brute", biw.D));
      Schema $$128 = $$0.addSchema(2571, bmk::new);
      $$0.addFixer(new bbl($$128, "Added Goat", biw.D));
      Schema $$129 = $$0.addSchema(2679, c);
      $$0.addFixer(new bcw($$129, false));
      Schema $$130 = $$0.addSchema(2680, c);
      $$0.addFixer(bgl.a($$130, "Renamed grass path item to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      $$0.addFixer(bcq.a($$130, "Renamed grass path block to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      Schema $$131 = $$0.addSchema(2684, bml::new);
      $$0.addFixer(new bbl($$131, "Added Sculk Sensor", biw.s));
      Schema $$132 = $$0.addSchema(2686, bmm::new);
      $$0.addFixer(new bbl($$132, "Added Axolotl", biw.D));
      Schema $$133 = $$0.addSchema(2688, bmn::new);
      $$0.addFixer(new bbl($$133, "Added Glow Squid", biw.D));
      $$0.addFixer(new bbl($$133, "Added Glow Item Frame", biw.D));
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
      $$0.addFixer(bgl.a($$134, "Renamed copper block items to new oxidized terms", b($$135)));
      $$0.addFixer(bcq.a($$134, "Renamed copper blocks to new oxidized terms", b($$135)));
      Schema $$136 = $$0.addSchema(2691, c);
      ImmutableMap<String, String> $$137 = ImmutableMap.builder()
         .put("minecraft:waxed_copper", "minecraft:waxed_copper_block")
         .put("minecraft:oxidized_copper_block", "minecraft:oxidized_copper")
         .put("minecraft:weathered_copper_block", "minecraft:weathered_copper")
         .put("minecraft:exposed_copper_block", "minecraft:exposed_copper")
         .build();
      $$0.addFixer(bgl.a($$136, "Rename copper item suffixes", b($$137)));
      $$0.addFixer(bcq.a($$136, "Rename copper blocks suffixes", b($$137)));
      Schema $$138 = $$0.addSchema(2693, c);
      $$0.addFixer(new bbk($$138, biw.O, "has_increased_height_already", false));
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
      $$0.addFixer(bgl.a($$139, "Renamed grimstone block items to deepslate", b($$140)));
      $$0.addFixer(bcq.a($$139, "Renamed grimstone blocks to deepslate", b($$140)));
      Schema $$141 = $$0.addSchema(2700, c);
      $$0.addFixer(
         bcq.a(
            $$141,
            "Renamed cave vines blocks",
            b(ImmutableMap.of("minecraft:cave_vines_head", "minecraft:cave_vines", "minecraft:cave_vines_body", "minecraft:cave_vines_plant"))
         )
      );
      Schema $$142 = $$0.addSchema(2701, c);
      $$0.addFixer(new bjf($$142));
      Schema $$143 = $$0.addSchema(2702, c);
      $$0.addFixer(new bbg($$143));
      Schema $$144 = $$0.addSchema(2704, bmo::new);
      $$0.addFixer(new bbl($$144, "Added Goat", biw.D));
      Schema $$145 = $$0.addSchema(2707, bmp::new);
      $$0.addFixer(new bbl($$145, "Added Marker", biw.D));
      $$0.addFixer(new bbk($$145, biw.O, "has_increased_height_already", true));
      Schema $$146 = $$0.addSchema(2710, c);
      $$0.addFixer(new bjn($$146, "Renamed play_one_minute stat to play_time", ImmutableMap.of("minecraft:play_one_minute", "minecraft:play_time")));
      Schema $$147 = $$0.addSchema(2717, c);
      $$0.addFixer(bgl.a($$147, "Rename azalea_leaves_flowers", b(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves"))));
      $$0.addFixer(
         bcq.a($$147, "Rename azalea_leaves_flowers items", b(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves")))
      );
      Schema $$148 = $$0.addSchema(2825, c);
      $$0.addFixer(new bbk($$148, biw.O, "has_increased_height_already", false));
      Schema $$149 = $$0.addSchema(2831, bmq::new);
      $$0.addFixer(new bjl($$149));
      Schema $$150 = $$0.addSchema(2832, bmr::new);
      $$0.addFixer(new bkm($$150));
      $$0.addFixer(new bdd($$150));
      Schema $$151 = $$0.addSchema(2833, c);
      $$0.addFixer(new bkk($$151));
      Schema $$152 = $$0.addSchema(2838, c);
      $$0.addFixer(new bht($$152, "Caves and Cliffs biome renames", biw.M, b(bcx.a)));
      Schema $$153 = $$0.addSchema(2841, c);
      $$0.addFixer(new bdg($$153));
      Schema $$154 = $$0.addSchema(2842, bms::new);
      $$0.addFixer(new bdh($$154));
      Schema $$155 = $$0.addSchema(2843, c);
      $$0.addFixer(new bij($$155));
      $$0.addFixer(new bht($$155, "Remove Deep Warm Ocean", biw.M, a("minecraft:deep_warm_ocean", "minecraft:warm_ocean")));
      Schema $$156 = $$0.addSchema(2846, c);
      $$0.addFixer(
         new bbn(
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
      $$0.addFixer(new bkk($$157));
      Schema $$158 = $$0.addSchema(2967, c);
      $$0.addFixer(new bjq($$158));
      Schema $$159 = $$0.addSchema(2970, c);
      $$0.addFixer(new bjr($$159));
      Schema $$160 = $$0.addSchema(3076, bmt::new);
      $$0.addFixer(new bbl($$160, "Added Sculk Catalyst", biw.s));
      Schema $$161 = $$0.addSchema(3077, c);
      $$0.addFixer(new bdb($$161));
      Schema $$162 = $$0.addSchema(3078, bmu::new);
      $$0.addFixer(new bbl($$162, "Added Frog", biw.D));
      $$0.addFixer(new bbl($$162, "Added Tadpole", biw.D));
      $$0.addFixer(new bbl($$162, "Added Sculk Shrieker", biw.s));
      Schema $$163 = $$0.addSchema(3081, bmv::new);
      $$0.addFixer(new bbl($$163, "Added Warden", biw.D));
      Schema $$164 = $$0.addSchema(3082, bmw::new);
      $$0.addFixer(new bbl($$164, "Added Chest Boat", biw.D));
      Schema $$165 = $$0.addSchema(3083, bmx::new);
      $$0.addFixer(new bbl($$165, "Added Allay", biw.D));
      Schema $$166 = $$0.addSchema(3084, c);
      $$0.addFixer(
         new bht(
            $$166,
            "game_event_renames_3084",
            biw.G,
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
      $$0.addFixer(new bfh($$167, "Change cat variant type", biw.D, "minecraft:cat", "CatType", af.a(new Int2ObjectOpenHashMap(), $$0x -> {
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
      $$0.addFixer(new bdo($$167, "Migrate cat variant advancement", "minecraft:husbandry/complete_catalogue", $$1x -> (String)$$168.getOrDefault($$1x, $$1x)));
      Schema $$169 = $$0.addSchema(3087, c);
      $$0.addFixer(new bfh($$169, "Change frog variant type", biw.D, "minecraft:frog", "Variant", af.a(new Int2ObjectOpenHashMap(), $$0x -> {
         $$0x.put(0, "minecraft:temperate");
         $$0x.put(1, "minecraft:warm");
         $$0x.put(2, "minecraft:cold");
      })::get));
      Schema $$170 = $$0.addSchema(3090, c);
      $$0.addFixer(new bei($$170, "EntityPaintingFieldsRenameFix", "minecraft:painting", Map.of("Motive", "variant", "Facing", "facing")));
      Schema $$171 = $$0.addSchema(3093, c);
      $$0.addFixer(new bej($$171));
      Schema $$172 = $$0.addSchema(3094, c);
      $$0.addFixer(new bfy($$172));
      Schema $$173 = $$0.addSchema(3097, c);
      $$0.addFixer(new bfp($$173));
      $$0.addFixer(new bfq($$173));
      Map<String, String> $$174 = Map.of("minecraft:british", "minecraft:british_shorthair");
      $$0.addFixer(new bkc($$173, "Rename british shorthair", biw.D, "minecraft:cat", $$174));
      $$0.addFixer(
         new bdo(
            $$173, "Migrate cat variant advancement for british shorthair", "minecraft:husbandry/complete_catalogue", $$1x -> $$174.getOrDefault($$1x, $$1x)
         )
      );
      $$0.addFixer(new bin($$173, "Remove unpopulated villager PoI types", Set.of("minecraft:unemployed", "minecraft:nitwit")::contains));
      Schema $$175 = $$0.addSchema(3108, c);
      $$0.addFixer(new bcb($$175));
      Schema $$176 = $$0.addSchema(3201, c);
      $$0.addFixer(new bih($$176));
      Schema $$177 = $$0.addSchema(3202, bmy::new);
      $$0.addFixer(new bbl($$177, "Added Hanging Sign", biw.s));
      Schema $$178 = $$0.addSchema(3203, bmz::new);
      $$0.addFixer(new bbl($$178, "Added Camel", biw.D));
      Schema $$179 = $$0.addSchema(3204, bna::new);
      $$0.addFixer(new bbl($$179, "Added Chiseled Bookshelf", biw.s));
      Schema $$180 = $$0.addSchema(3209, c);
      $$0.addFixer(new bgs($$180, false, "minecraft:pig_spawn_egg"));
      Schema $$181 = $$0.addSchema(3214, c);
      $$0.addFixer(new bib($$181));
      Schema $$182 = $$0.addSchema(3319, c);
      $$0.addFixer(new bhz($$182));
      Schema $$183 = $$0.addSchema(3322, c);
      $$0.addFixer(new bdv($$183));
      Schema $$184 = $$0.addSchema(3325, bnb::new);
      $$0.addFixer(new bbl($$184, "Added displays", biw.D));
      Schema $$185 = $$0.addSchema(3326, bnc::new);
      $$0.addFixer(new bbl($$185, "Added Sniffer", biw.D));
      Schema $$186 = $$0.addSchema(3327, bnd::new);
      $$0.addFixer(new bbl($$186, "Archaeology", biw.s));
      Schema $$187 = $$0.addSchema(3328, bne::new);
      $$0.addFixer(new bbl($$187, "Added interaction", biw.D));
      Schema $$188 = $$0.addSchema(3438, bnf::new);
      $$0.addFixer(bcj.a($$188, "Rename Suspicious Sand to Brushable Block", a("minecraft:suspicious_sand", "minecraft:brushable_block")));
      $$0.addFixer(new beb($$188));
      $$0.addFixer(
         bgl.a(
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
      $$0.addFixer(new bbl($$188, "Added calibrated sculk sensor", biw.s));
      Schema $$189 = $$0.addSchema(3439, bng::new);
      $$0.addFixer(new bcl($$189, "Updated sign text format for Signs", "minecraft:sign"));
      $$0.addFixer(new bcl($$189, "Updated sign text format for Hanging Signs", "minecraft:hanging_sign"));
      Schema $$190 = $$0.addSchema(3440, c);
      $$0.addFixer(new bht($$190, "Replace experimental 1.20 overworld", biw.N, a("minecraft:overworld_update_1_20", "minecraft:overworld")));
      $$0.addFixer(new bfo($$190, "Remove 1.20 feature toggle", Set.of("minecraft:update_1_20")));
      Schema $$191 = $$0.addSchema(3447, c);
      $$0.addFixer(
         bgl.a(
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
      Schema $$192 = $$0.addSchema(3448, bnh::new);
      $$0.addFixer(new bdr($$192));
      Schema $$193 = $$0.addSchema(3450, c);
      $$0.addFixer(
         new bix(
            $$193,
            "Remove liquid_carvers and heightmap chunk statuses",
            b(Map.of("minecraft:liquid_carvers", "minecraft:carvers", "minecraft:heightmaps", "minecraft:spawn"))
         )
      );
      Schema $$194 = $$0.addSchema(3451, c);
      $$0.addFixer(new bdc($$194));
      Schema $$195 = $$0.addSchema(3459, c);
      $$0.addFixer(new bhc($$195));
      Schema $$196 = $$0.addSchema(3564, c);
      $$0.addFixer(new bdt($$196, "minecraft:sign"));
      $$0.addFixer(new bdt($$196, "minecraft:hanging_sign"));
      Schema $$197 = $$0.addSchema(3565, c);
      $$0.addFixer(new bis($$197));
      Schema $$198 = $$0.addSchema(3566, c);
      $$0.addFixer(new bji($$198));
      Schema $$199 = $$0.addSchema(3568, c);
      $$0.addFixer(new bho($$199));
      Schema $$200 = $$0.addSchema(3682, bni::new);
      $$0.addFixer(new bbl($$200, "Added Crafter", biw.s));
      Schema $$201 = $$0.addSchema(3683, bnj::new);
      $$0.addFixer(new bip($$201));
      Schema $$202 = $$0.addSchema(3685, bnk::new);
      $$0.addFixer(new bfs($$202));
      Schema $$203 = $$0.addSchema(3689, bnl::new);
      $$0.addFixer(new bbl($$203, "Added Breeze", biw.D));
      $$0.addFixer(new bbl($$203, "Added Trial Spawner", biw.s));
      Schema $$204 = $$0.addSchema(3692, c);
      UnaryOperator<String> $$205 = b(Map.of("minecraft:grass", "minecraft:short_grass"));
      $$0.addFixer(bcq.a($$204, "Rename grass block to short_grass", $$205));
      $$0.addFixer(bgl.a($$204, "Rename grass item to short_grass", $$205));
      Schema $$206 = $$0.addSchema(3799, bnm::new);
      $$0.addFixer(new bbl($$206, "Added Armadillo", biw.D));
      Schema $$207 = $$0.addSchema(3800, c);
      UnaryOperator<String> $$208 = b(Map.of("minecraft:scute", "minecraft:turtle_scute"));
      $$0.addFixer(bgl.a($$207, "Rename scute item to turtle_scute", $$208));
      Schema $$209 = $$0.addSchema(3803, c);
      $$0.addFixer(new bja($$209, "Rename sweeping enchant to sweeping_edge", Map.of("minecraft:sweeping", "minecraft:sweeping_edge")));
      Schema $$210 = $$0.addSchema(3807, bnn::new);
      $$0.addFixer(new bbl($$210, "Added Vault", biw.s));
      Schema $$211 = $$0.addSchema(3807, 1, c);
      $$0.addFixer(new bhk($$211));
      Schema $$212 = $$0.addSchema(3808, bno::new);
      $$0.addFixer(new bgb($$212, "minecraft:horse", "ArmorItem", true));
      Schema $$213 = $$0.addSchema(3808, 1, bnp::new);
      $$0.addFixer(new bgb($$213, "minecraft:llama", "DecorItem", false));
      Schema $$214 = $$0.addSchema(3808, 2, bnq::new);
      $$0.addFixer(new bgb($$214, "minecraft:trader_llama", "DecorItem", false));
      Schema $$215 = $$0.addSchema(3809, c);
      $$0.addFixer(new bcy($$215));
      Schema $$216 = $$0.addSchema(3812, c);
      $$0.addFixer(new bft($$216));
      Schema $$217 = $$0.addSchema(3813, bnr::new);
      $$0.addFixer(new bco($$217));
      Schema $$218 = $$0.addSchema(3814, c);
      $$0.addFixer(new bbt($$218, "Rename jump strength attribute", a("minecraft:horse.jump_strength", "minecraft:generic.jump_strength")));
      Schema $$219 = $$0.addSchema(3816, bns::new);
      $$0.addFixer(new bbl($$219, "Added Bogged", biw.D));
      Schema $$220 = $$0.addSchema(3818, bnt::new);
      $$0.addFixer(new bbx($$220));
      $$0.addFixer(new bdw($$220));
      Schema $$221 = $$0.addSchema(3818, 1, c);
      $$0.addFixer(new bbv($$221));
      Schema $$222 = $$0.addSchema(3818, 2, c);
      $$0.addFixer(new bjw($$222));
      Schema $$223 = $$0.addSchema(3818, 3, bnu::new);
      $$0.addFixer(new bkn($$223, "Inject data component types", biw.w));
      Schema $$224 = $$0.addSchema(3818, 4, bnv::new);
      $$0.addFixer(new bik($$224));
      Schema $$225 = $$0.addSchema(3818, 5, bnw::new);
      $$0.addFixer(new bgo($$225));
      Schema $$226 = $$0.addSchema(3818, 6, c);
      $$0.addFixer(new bbp($$226));
      Schema $$227 = $$0.addSchema(3820, c);
      $$0.addFixer(new bil($$227));
      $$0.addFixer(new bhj($$227));
      Schema $$228 = $$0.addSchema(3825, bnx::new);
      $$0.addFixer(new bgp($$228));
      $$0.addFixer(new bbu($$228));
      $$0.addFixer(new bjz($$228));
      $$0.addFixer(new bbl($$228, "Added Ominous Item Spawner", biw.D));
      Schema $$229 = $$0.addSchema(3828, c);
      $$0.addFixer(new bdx($$229));
      Schema $$230 = $$0.addSchema(3833, c);
      $$0.addFixer(new biy($$230));
      Schema $$231 = $$0.addSchema(3938, bny::new);
      $$0.addFixer(new biq($$231));
      Schema $$232 = $$0.addSchema(3939, c);
      $$0.addFixer(new bfo($$232, "Remove 1.21 feature toggle", Set.of("minecraft:update_1_21")));
      Schema $$233 = $$0.addSchema(3943, c);
      $$0.addFixer(new big($$233));
      Schema $$234 = $$0.addSchema(3945, c);
      $$0.addFixer(new bbr($$234));
      $$0.addFixer(new bha($$234));
      Schema $$235 = $$0.addSchema(4054, c);
      $$0.addFixer(new bhx($$235));
      Schema $$236 = $$0.addSchema(4055, c);
      $$0.addFixer(new bbq($$236));
      Schema $$237 = $$0.addSchema(4057, c);
      $$0.addFixer(new bcu($$237));
      Schema $$238 = $$0.addSchema(4059, bnz::new);
      $$0.addFixer(new bfu($$238));
      Schema $$239 = $$0.addSchema(4061, c);
      $$0.addFixer(new bka($$239));
      Schema $$240 = $$0.addSchema(4064, c);
      $$0.addFixer(new bfr($$240));
      Schema $$241 = $$0.addSchema(4067, boa::new);
      $$0.addFixer(new bct($$241));
      $$0.addFixer(new bfo($$241, "Remove Bundle experimental feature flag", Set.of("minecraft:bundle")));
      Schema $$242 = $$0.addSchema(4068, c);
      $$0.addFixer(new bhi($$242));
      $$0.addFixer(new bdn($$242));
      Schema $$243 = $$0.addSchema(4070, bob::new);
      $$0.addFixer(new bbl($$243, "Added Pale Oak Boat and Pale Oak Chest Boat", biw.D));
      Schema $$244 = $$0.addSchema(4071, boc::new);
      $$0.addFixer(new bbl($$244, "Added Creaking", biw.D));
      $$0.addFixer(new bbl($$244, "Added Creaking Heart", biw.s));
      Schema $$245 = $$0.addSchema(4081, c);
      $$0.addFixer(new bey($$245));
      Schema $$246 = $$0.addSchema(4173, c);
      $$0.addFixer(new bei($$246, "Rename TNT Minecart fuse", "minecraft:tnt_minecart", Map.of("TNTFuse", "fuse")));
      Schema $$247 = $$0.addSchema(4175, c);
      $$0.addFixer(new bfn($$247));
      $$0.addFixer(new bdp($$247));
      Schema $$248 = $$0.addSchema(4176, c);
      $$0.addFixer(new bgd($$248));
      $$0.addFixer(new bge($$248));
      Schema $$249 = $$0.addSchema(4180, c);
      $$0.addFixer(new bfo($$249, "Remove Winter Drop toggle", Set.of("minecraft:winter_drop")));
      Schema $$250 = $$0.addSchema(4181, c);
      $$0.addFixer(new bcf($$250, "minecraft:furnace"));
      $$0.addFixer(new bcf($$250, "minecraft:smoker"));
      $$0.addFixer(new bcf($$250, "minecraft:blast_furnace"));
      Schema $$251 = $$0.addSchema(4187, c);
      $$0.addFixer(new bdz($$251, "Villager follow range fix undo", "minecraft:villager", "minecraft:follow_range", $$0x -> $$0x == 48.0 ? 16.0 : $$0x));
      $$0.addFixer(new bdz($$251, "Bee follow range fix", "minecraft:bee", "minecraft:follow_range", $$0x -> $$0x == 48.0 ? 16.0 : $$0x));
      $$0.addFixer(new bdz($$251, "Allay follow range fix", "minecraft:allay", "minecraft:follow_range", $$0x -> $$0x == 48.0 ? 16.0 : $$0x));
      $$0.addFixer(new bdz($$251, "Llama follow range fix", "minecraft:llama", "minecraft:follow_range", $$0x -> $$0x == 40.0 ? 16.0 : $$0x));
      $$0.addFixer(new bdz($$251, "Piglin Brute follow range fix", "minecraft:piglin_brute", "minecraft:follow_range", $$0x -> $$0x == 16.0 ? 12.0 : $$0x));
      $$0.addFixer(new bdz($$251, "Warden follow range fix", "minecraft:warden", "minecraft:follow_range", $$0x -> $$0x == 16.0 ? 24.0 : $$0x));
      Schema $$252 = $$0.addSchema(4290, bod::new);
      $$0.addFixer(new bkb($$252));
      Schema $$253 = $$0.addSchema(4291, c);
      $$0.addFixer(new bhd($$253));
      $$0.addFixer(new bju($$253));
      Schema $$254 = $$0.addSchema(4292, boe::new);
      $$0.addFixer(new bjs($$254));
      Schema $$255 = $$0.addSchema(4293, c);
      $$0.addFixer(new bds($$255));
      Schema $$256 = $$0.addSchema(4294, c);
      $$0.addFixer(
         new bcp(
            $$256,
            "CreakingHeartBlockStateFix",
            "minecraft:creaking_heart",
            "active",
            "creaking_heart_state",
            $$0x -> $$0x.equals("true") ? "awake" : "uprooted"
         )
      );
      Schema $$257 = $$0.addSchema(4295, c);
      $$0.addFixer(new bca($$257));
      Schema $$258 = $$0.addSchema(4296, c);
      $$0.addFixer(new bbo($$258));
      Schema $$259 = $$0.addSchema(4297, c);
      $$0.addFixer(new bfw($$259));
      Schema $$260 = $$0.addSchema(4299, c);
      $$0.addFixer(new bfc($$260));
      Schema $$261 = $$0.addSchema(4300, bof::new);
      $$0.addFixer(new bje($$261));
      Schema $$262 = $$0.addSchema(4301, bog::new);
      $$0.addFixer(new bfm($$262));
      Schema $$263 = $$0.addSchema(4302, boh::new);
      $$0.addFixer(new bbl($$263, "Added Test and Test Instance Block Entities", biw.s));
      Schema $$264 = $$0.addSchema(4303, c);
      $$0.addFixer(new beh($$264, biw.D));
      $$0.addFixer(new beh($$264, biw.b));
      Schema $$265 = $$0.addSchema(4305, c);
      $$0.addFixer(new bcp($$265, "rename test block mode", "minecraft:test_block", "test_block_mode", "mode", $$0x -> $$0x));
      Schema $$266 = $$0.addSchema(4306, boi::new);
      $$0.addFixer(new bjv($$266));
      Schema $$267 = $$0.addSchema(4307, boj::new);
      $$0.addFixer(new bjx($$267));
      Schema $$268 = $$0.addSchema(4309, c);
      $$0.addFixer(new bir($$268));
   }

   private static UnaryOperator<String> a(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault($$1, $$1);
   }

   private static UnaryOperator<String> b(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault(bkr.a($$1), $$1);
   }

   private static UnaryOperator<String> a(String $$0, String $$1) {
      return $$2 -> Objects.equals(bkr.a($$2), $$0) ? $$1 : $$2;
   }
}
