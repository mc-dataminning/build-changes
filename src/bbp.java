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

public class bbp {
   private static final BiFunction<Integer, Schema, Schema> b = Schema::new;
   private static final BiFunction<Integer, Schema, Schema> c = blh::new;
   private static final Result d = b();
   public static final int a = 4295;

   private bbp() {
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
      $$0.addSchema(99, bpj::new);
      Schema $$1 = $$0.addSchema(100, bli::new);
      $$0.addFixer(new beu($$1));
      Schema $$2 = $$0.addSchema(101, b);
      $$0.addFixer(new bkw($$2));
      Schema $$3 = $$0.addSchema(102, blj::new);
      $$0.addFixer(new bgw($$3, true));
      $$0.addFixer(new bgy($$3, false));
      Schema $$4 = $$0.addSchema(105, b);
      $$0.addFixer(new bhc($$4, true));
      Schema $$5 = $$0.addSchema(106, bll::new);
      $$0.addFixer(new bie($$5, true));
      Schema $$6 = $$0.addSchema(107, blm::new);
      $$0.addFixer(new bfd($$6));
      Schema $$7 = $$0.addSchema(108, b);
      $$0.addFixer(new bfr($$7, true));
      Schema $$8 = $$0.addSchema(109, b);
      $$0.addFixer(new bey($$8, true));
      Schema $$9 = $$0.addSchema(110, b);
      $$0.addFixer(new bez($$9, true));
      Schema $$10 = $$0.addSchema(111, b);
      $$0.addFixer(new bfe($$10, true));
      Schema $$11 = $$0.addSchema(113, b);
      $$0.addFixer(new bfj($$11, true));
      Schema $$12 = $$0.addSchema(135, blo::new);
      $$0.addFixer(new bfl($$12, true));
      Schema $$13 = $$0.addSchema(143, blp::new);
      $$0.addFixer(new bft($$13, true));
      Schema $$14 = $$0.addSchema(147, b);
      $$0.addFixer(new bem($$14, true));
      Schema $$15 = $$0.addSchema(165, b);
      $$0.addFixer(new bkj($$15));
      Schema $$16 = $$0.addSchema(501, bpb::new);
      $$0.addFixer(new bby($$16, "Add 1.10 entities fix", bjm.D));
      Schema $$17 = $$0.addSchema(502, b);
      $$0.addFixer(bha.a($$17, "cooked_fished item renamer", $$0x -> Objects.equals(blh.a($$0x), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : $$0x));
      $$0.addFixer(new bfy($$17, false));
      Schema $$18 = $$0.addSchema(505, b);
      $$0.addFixer(new bir($$18, false));
      Schema $$19 = $$0.addSchema(700, bpc::new);
      $$0.addFixer(new bet($$19, true));
      Schema $$20 = $$0.addSchema(701, bpd::new);
      $$0.addFixer(new bfp($$20, true));
      Schema $$21 = $$0.addSchema(702, bpe::new);
      $$0.addFixer(new bfx($$21));
      Schema $$22 = $$0.addSchema(703, bpf::new);
      $$0.addFixer(new bfa($$22, true));
      Schema $$23 = $$0.addSchema(704, bpg::new);
      $$0.addFixer(new bct($$23, true));
      Schema $$24 = $$0.addSchema(705, bph::new);
      $$0.addFixer(new bfb($$24, true));
      Schema $$25 = $$0.addSchema(804, c);
      $$0.addFixer(new bgu($$25, true));
      Schema $$26 = $$0.addSchema(806, c);
      $$0.addFixer(new bhm($$26, false));
      Schema $$27 = $$0.addSchema(808, bpi::new);
      $$0.addFixer(new bby($$27, "added shulker box", bjm.s));
      Schema $$28 = $$0.addSchema(808, 1, c);
      $$0.addFixer(new bfn($$28, false));
      Schema $$29 = $$0.addSchema(813, c);
      $$0.addFixer(new bhb($$29, false));
      $$0.addFixer(new bcx($$29, false));
      Schema $$30 = $$0.addSchema(816, c);
      $$0.addFixer(new biu($$30, false));
      Schema $$31 = $$0.addSchema(820, c);
      $$0.addFixer(bha.a($$31, "totem item renamer", a("minecraft:totem", "minecraft:totem_of_undying")));
      Schema $$32 = $$0.addSchema(1022, blk::new);
      $$0.addFixer(new bld($$32, "added shoulder entities to players", bjm.b));
      Schema $$33 = $$0.addSchema(1125, bln::new);
      $$0.addFixer(new bdm($$33, true));
      $$0.addFixer(new bcj($$33, false));
      Schema $$34 = $$0.addSchema(1344, c);
      $$0.addFixer(new bis($$34, false));
      Schema $$35 = $$0.addSchema(1446, c);
      $$0.addFixer(new bit($$35, false));
      Schema $$36 = $$0.addSchema(1450, c);
      $$0.addFixer(new bdf($$36, false));
      Schema $$37 = $$0.addSchema(1451, blq::new);
      $$0.addFixer(new bby($$37, "AddTrappedChestFix", bjm.s));
      Schema $$38 = $$0.addSchema(1451, 1, blr::new);
      $$0.addFixer(new bds($$38, true));
      Schema $$39 = $$0.addSchema(1451, 2, bls::new);
      $$0.addFixer(new bcq($$39, true));
      Schema $$40 = $$0.addSchema(1451, 3, blt::new);
      $$0.addFixer(new beo($$40, true));
      $$0.addFixer(new bhg($$40, false));
      Schema $$41 = $$0.addSchema(1451, 4, blu::new);
      $$0.addFixer(new bda($$41, true));
      $$0.addFixer(new bhk($$41, false));
      Schema $$42 = $$0.addSchema(1451, 5, blv::new);
      $$0.addFixer(
         new bgz(
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
      $$0.addFixer(new bby($$42, "RemoveNoteBlockFlowerPotFix", bjm.s));
      $$0.addFixer(new bhh($$42, false, "minecraft:spawn_egg"));
      $$0.addFixer(new bfw($$42, false));
      $$0.addFixer(new bcp($$42, false));
      $$0.addFixer(new bhu($$42, false));
      Schema $$43 = $$0.addSchema(1451, 6, blw::new);
      $$0.addFixer(new bkc($$43, true));
      $$0.addFixer(new bcu($$43, false));
      Schema $$44 = $$0.addSchema(1451, 7, c);
      $$0.addFixer(new bkx($$44));
      Schema $$45 = $$0.addSchema(1456, c);
      $$0.addFixer(new bfc($$45, false));
      Schema $$46 = $$0.addSchema(1458, blx::new);
      $$0.addFixer(new bes($$46));
      $$0.addFixer(new bgv($$46));
      $$0.addFixer(new bcr($$46));
      Schema $$47 = $$0.addSchema(1460, bly::new);
      $$0.addFixer(new bff($$47, false));
      Schema $$48 = $$0.addSchema(1466, blz::new);
      $$0.addFixer(new bby($$48, "Add DUMMY block entity", bjm.s));
      $$0.addFixer(new bdz($$48, true));
      Schema $$49 = $$0.addSchema(1470, bma::new);
      $$0.addFixer(new bby($$49, "Add 1.13 entities fix", bjm.D));
      Schema $$50 = $$0.addSchema(1474, c);
      $$0.addFixer(new bea($$50, false));
      $$0.addFixer(
         bdd.a($$50, "Colorless shulker block fixer", $$0x -> Objects.equals(blh.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      $$0.addFixer(
         bha.a($$50, "Colorless shulker item fixer", $$0x -> Objects.equals(blh.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      Schema $$51 = $$0.addSchema(1475, c);
      $$0.addFixer(bdd.a($$51, "Flowing fixer", b(ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava"))));
      Schema $$52 = $$0.addSchema(1480, c);
      $$0.addFixer(bdd.a($$52, "Rename coral blocks", b(bjs.a)));
      $$0.addFixer(bha.a($$52, "Rename coral items", b(bjs.a)));
      Schema $$53 = $$0.addSchema(1481, bmb::new);
      $$0.addFixer(new bby($$53, "Add conduit", bjm.s));
      Schema $$54 = $$0.addSchema(1483, bmc::new);
      $$0.addFixer(new bfh($$54, true));
      $$0.addFixer(bha.a($$54, "Rename pufferfish egg item", b(bfh.a)));
      Schema $$55 = $$0.addSchema(1484, c);
      $$0.addFixer(
         bha.a(
            $$55,
            "Rename seagrass items",
            b(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(
         bdd.a(
            $$55,
            "Rename seagrass blocks",
            b(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(new bgo($$55, false));
      Schema $$56 = $$0.addSchema(1486, bmd::new);
      $$0.addFixer(new ber($$56, true));
      $$0.addFixer(bha.a($$56, "Rename cod/salmon egg items", b(ber.b)));
      Schema $$57 = $$0.addSchema(1487, c);
      $$0.addFixer(
         bha.a(
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
         bdd.a(
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
      Schema $$58 = $$0.addSchema(1488, bme::new);
      $$0.addFixer(bdd.a($$58, "Rename kelp/kelptop", b(ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant"))));
      $$0.addFixer(bha.a($$58, "Rename kelptop", a("minecraft:kelp_top", "minecraft:kelp")));
      $$0.addFixer(new bih($$58, true, "Command block block entity custom name fix", bjm.s, "minecraft:command_block") {
         @Override
         protected <T> Dynamic<T> a(Dynamic<T> $$0) {
            return bcr.a($$0);
         }
      });
      $$0.addFixer(
         new DataFix($$58, false) {
            protected TypeRewriteRule makeRule() {
               Type<?> $$0 = this.getInputSchema().getType(bjm.D);
               OpticFinder<String> $$1 = DSL.fieldFinder("id", blh.a());
               OpticFinder<?> $$2 = $$0.findField("CustomName");
               OpticFinder<Pair<String, String>> $$3 = DSL.typeFinder(this.getInputSchema().getType(bjm.z));
               return this.fixTypeEverywhereTyped(
                  "Command block minecart custom name fix",
                  $$0,
                  $$3x -> {
                     String $$4 = $$3x.getOptional($$1).orElse("");
                     return !"minecraft:commandblock_minecart".equals($$4)
                        ? $$3x
                        : $$3x.updateTyped($$2, $$1xx -> $$1xx.update($$3, $$0xxx -> $$0xxx.mapSecond(bbr::a)));
                  }
               );
            }
         }
      );
      $$0.addFixer(new bgq($$58, false));
      Schema $$59 = $$0.addSchema(1490, c);
      $$0.addFixer(bdd.a($$59, "Rename melon_block", a("minecraft:melon_block", "minecraft:melon")));
      $$0.addFixer(
         bha.a(
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
      $$0.addFixer(new bdx($$60, false));
      Schema $$61 = $$0.addSchema(1494, c);
      $$0.addFixer(new bhf($$61, false));
      Schema $$62 = $$0.addSchema(1496, c);
      $$0.addFixer(new bhq($$62, false));
      Schema $$63 = $$0.addSchema(1500, c);
      $$0.addFixer(new bcv($$63, false));
      Schema $$64 = $$0.addSchema(1501, c);
      $$0.addFixer(new bbz($$64, false));
      Schema $$65 = $$0.addSchema(1502, c);
      $$0.addFixer(new bii($$65, "Recipes fix", bjm.L, b(bjj.a)));
      Schema $$66 = $$0.addSchema(1506, c);
      $$0.addFixer(new bht($$66, false));
      Schema $$67 = $$0.addSchema(1510, bmf::new);
      $$0.addFixer(bdd.a($$67, "Block renamening fix", b(bfs.b)));
      $$0.addFixer(bha.a($$67, "Item renamening fix", b(bfs.c)));
      $$0.addFixer(new bii($$67, "Recipes renamening fix", bjm.L, b(bjk.a)));
      $$0.addFixer(new bfs($$67, true));
      $$0.addFixer(
         new bkd(
            $$67,
            "SwimStatsRenameFix",
            ImmutableMap.of("minecraft:swim_one_cm", "minecraft:walk_on_water_one_cm", "minecraft:dive_one_cm", "minecraft:walk_under_water_one_cm")
         )
      );
      Schema $$68 = $$0.addSchema(1514, c);
      $$0.addFixer(new bjx($$68, "ObjectiveDisplayNameFix", bjm.J));
      $$0.addFixer(new bjx($$68, "TeamDisplayNameFix", bjm.K));
      $$0.addFixer(new bik($$68));
      Schema $$69 = $$0.addSchema(1515, c);
      $$0.addFixer(bdd.a($$69, "Rename coral fan blocks", b(bjr.a)));
      Schema $$70 = $$0.addSchema(1624, c);
      $$0.addFixer(new bko($$70, false));
      Schema $$71 = $$0.addSchema(1800, bmg::new);
      $$0.addFixer(new bby($$71, "Added 1.14 mobs fix", bjm.D));
      $$0.addFixer(bha.a($$71, "Rename dye items", b(bei.a)));
      Schema $$72 = $$0.addSchema(1801, bmh::new);
      $$0.addFixer(new bby($$72, "Added Illager Beast", bjm.D));
      Schema $$73 = $$0.addSchema(1802, c);
      $$0.addFixer(
         bdd.a(
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
         bha.a(
            $$73,
            "Rename sign item & stone slabs",
            b(ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))
         )
      );
      Schema $$74 = $$0.addSchema(1803, c);
      $$0.addFixer(new bgx($$74));
      Schema $$75 = $$0.addSchema(1904, bmi::new);
      $$0.addFixer(new bby($$75, "Added Cats", bjm.D));
      $$0.addFixer(new beq($$75, false));
      Schema $$76 = $$0.addSchema(1905, c);
      $$0.addFixer(new bdv($$76, false));
      Schema $$77 = $$0.addSchema(1906, bmj::new);
      $$0.addFixer(new bby($$77, "Add POI Blocks", bjm.s));
      Schema $$78 = $$0.addSchema(1909, bmk::new);
      $$0.addFixer(new bby($$78, "Add jigsaw", bjm.s));
      Schema $$79 = $$0.addSchema(1911, c);
      $$0.addFixer(new bdw($$79, false));
      Schema $$80 = $$0.addSchema(1914, c);
      $$0.addFixer(new bkz($$80, false));
      Schema $$81 = $$0.addSchema(1917, c);
      $$0.addFixer(new bdi($$81, false));
      Schema $$82 = $$0.addSchema(1918, c);
      $$0.addFixer(new bkt($$82, "minecraft:villager"));
      $$0.addFixer(new bkt($$82, "minecraft:zombie_villager"));
      Schema $$83 = $$0.addSchema(1920, bml::new);
      $$0.addFixer(new bij($$83, false));
      $$0.addFixer(new bby($$83, "Add campfire", bjm.s));
      Schema $$84 = $$0.addSchema(1925, bmm::new);
      $$0.addFixer(new bia($$84));
      Schema $$85 = $$0.addSchema(1928, bmn::new);
      $$0.addFixer(new bfi($$85, true));
      $$0.addFixer(bha.a($$85, "Rename ravager egg item", b(bfi.a)));
      Schema $$86 = $$0.addSchema(1929, bmo::new);
      $$0.addFixer(new bby($$86, "Add Wandering Trader and Trader Llama", bjm.D));
      Schema $$87 = $$0.addSchema(1931, bmp::new);
      $$0.addFixer(new bby($$87, "Added Fox", bjm.D));
      Schema $$88 = $$0.addSchema(1936, c);
      $$0.addFixer(new bip($$88, false));
      Schema $$89 = $$0.addSchema(1946, c);
      $$0.addFixer(new bjt($$89, false));
      Schema $$90 = $$0.addSchema(1948, c);
      $$0.addFixer(new bin($$90));
      Schema $$91 = $$0.addSchema(1953, c);
      $$0.addFixer(new bil($$91, false));
      Schema $$92 = $$0.addSchema(1955, c);
      $$0.addFixer(new bkv($$92, false));
      $$0.addFixer(new ble($$92, false));
      Schema $$93 = $$0.addSchema(1961, c);
      $$0.addFixer(new bdr($$93, false));
      Schema $$94 = $$0.addSchema(1963, c);
      $$0.addFixer(new bjp($$94, false));
      Schema $$95 = $$0.addSchema(2100, bmq::new);
      $$0.addFixer(new bby($$95, "Added Bee and Bee Stinger", bjm.D));
      $$0.addFixer(new bby($$95, "Add beehive", bjm.s));
      $$0.addFixer(new bii($$95, "Rename sugar recipe", bjm.L, a("minecraft:sugar", "minecraft:sugar_from_sugar_cane")));
      $$0.addFixer(new bca($$95, false, "Rename sugar recipe advancement", a("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane")));
      Schema $$96 = $$0.addSchema(2202, c);
      $$0.addFixer(new bdn($$96, false));
      Schema $$97 = $$0.addSchema(2209, c);
      UnaryOperator<String> $$98 = a("minecraft:bee_hive", "minecraft:beehive");
      $$0.addFixer(bha.a($$97, "Rename bee_hive item to beehive", $$98));
      $$0.addFixer(new bje($$97, "Rename bee_hive poi to beehive", $$98));
      $$0.addFixer(bdd.a($$97, "Rename bee_hive block to beehive", $$98));
      Schema $$99 = $$0.addSchema(2211, c);
      $$0.addFixer(new bkf($$99, false));
      Schema $$100 = $$0.addSchema(2218, c);
      $$0.addFixer(new bgj($$100, false));
      Schema $$101 = $$0.addSchema(2501, bmr::new);
      $$0.addFixer(new bgl($$101, true));
      Schema $$102 = $$0.addSchema(2502, bms::new);
      $$0.addFixer(new bby($$102, "Added Hoglin", bjm.D));
      Schema $$103 = $$0.addSchema(2503, c);
      $$0.addFixer(new bky($$103, false));
      $$0.addFixer(new bca($$103, false, "Composter category change", a("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter")));
      Schema $$104 = $$0.addSchema(2505, bmt::new);
      $$0.addFixer(new bby($$104, "Added Piglin", bjm.D));
      $$0.addFixer(new bib($$104, "minecraft:villager"));
      Schema $$105 = $$0.addSchema(2508, c);
      $$0.addFixer(
         bha.a(
            $$105,
            "Renamed fungi items to fungus",
            b(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      $$0.addFixer(
         bdd.a(
            $$105,
            "Renamed fungi blocks to fungus",
            b(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      Schema $$106 = $$0.addSchema(2509, bmu::new);
      $$0.addFixer(new bfz($$106));
      $$0.addFixer(bha.a($$106, "Rename zombie pigman egg item", b(bfz.a)));
      Schema $$107 = $$0.addSchema(2511, c);
      $$0.addFixer(new bfg($$107));
      Schema $$108 = $$0.addSchema(2511, 1, bmv::new);
      $$0.addFixer(new bif($$108, "SplashPotionItemFieldRenameFix", bjm.D, "minecraft:potion"));
      Schema $$109 = $$0.addSchema(2514, c);
      $$0.addFixer(new bfu($$109));
      $$0.addFixer(new bcz($$109));
      $$0.addFixer(new bjc($$109));
      $$0.addFixer(new bhw($$109));
      $$0.addFixer(new bjw($$109));
      $$0.addFixer(new bhl($$109));
      Schema $$110 = $$0.addSchema(2516, c);
      $$0.addFixer(new bgn($$110, "minecraft:villager"));
      $$0.addFixer(new bgn($$110, "minecraft:zombie_villager"));
      Schema $$111 = $$0.addSchema(2518, c);
      $$0.addFixer(new bhn($$111, false));
      $$0.addFixer(new bho($$111));
      Schema $$112 = $$0.addSchema(2519, bmw::new);
      $$0.addFixer(new bby($$112, "Added Strider", bjm.D));
      Schema $$113 = $$0.addSchema(2522, bmx::new);
      $$0.addFixer(new bby($$113, "Added Zoglin", bjm.D));
      Schema $$114 = $$0.addSchema(2523, c);
      $$0.addFixer(
         new bcg(
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
      $$0.addFixer(new bcm($$115));
      Schema $$116 = $$0.addSchema(2528, c);
      $$0.addFixer(
         bha.a(
            $$116,
            "Rename soul fire torch and soul fire lantern",
            b(ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))
         )
      );
      $$0.addFixer(
         bdd.a(
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
      $$0.addFixer(new bke($$117, false));
      Schema $$118 = $$0.addSchema(2531, c);
      $$0.addFixer(new bjl($$118));
      Schema $$119 = $$0.addSchema(2533, c);
      $$0.addFixer(new bku($$119));
      Schema $$120 = $$0.addSchema(2535, c);
      $$0.addFixer(new bfo($$120));
      Schema $$121 = $$0.addSchema(2538, c);
      $$0.addFixer(new bhv($$121));
      Schema $$122 = $$0.addSchema(2550, c);
      $$0.addFixer(new blb($$122));
      Schema $$123 = $$0.addSchema(2551, bmy::new);
      $$0.addFixer(new bld($$123, "add types to WorldGenData", bjm.O));
      Schema $$124 = $$0.addSchema(2552, c);
      $$0.addFixer(new bii($$124, "Nether biome rename", bjm.M, a("minecraft:nether", "minecraft:nether_wastes")));
      Schema $$125 = $$0.addSchema(2553, c);
      $$0.addFixer(new bii($$125, "Biomes fix", bjm.M, b(bcl.a)));
      Schema $$126 = $$0.addSchema(2558, c);
      $$0.addFixer(new bic($$126, false));
      $$0.addFixer(new bix($$126, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
      Schema $$127 = $$0.addSchema(2568, bmz::new);
      $$0.addFixer(new bby($$127, "Added Piglin Brute", bjm.D));
      Schema $$128 = $$0.addSchema(2571, bna::new);
      $$0.addFixer(new bby($$128, "Added Goat", bjm.D));
      Schema $$129 = $$0.addSchema(2679, c);
      $$0.addFixer(new bdj($$129, false));
      Schema $$130 = $$0.addSchema(2680, c);
      $$0.addFixer(bha.a($$130, "Renamed grass path item to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      $$0.addFixer(bdd.a($$130, "Renamed grass path block to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      Schema $$131 = $$0.addSchema(2684, bnb::new);
      $$0.addFixer(new bby($$131, "Added Sculk Sensor", bjm.s));
      Schema $$132 = $$0.addSchema(2686, bnc::new);
      $$0.addFixer(new bby($$132, "Added Axolotl", bjm.D));
      Schema $$133 = $$0.addSchema(2688, bnd::new);
      $$0.addFixer(new bby($$133, "Added Glow Squid", bjm.D));
      $$0.addFixer(new bby($$133, "Added Glow Item Frame", bjm.D));
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
      $$0.addFixer(bha.a($$134, "Renamed copper block items to new oxidized terms", b($$135)));
      $$0.addFixer(bdd.a($$134, "Renamed copper blocks to new oxidized terms", b($$135)));
      Schema $$136 = $$0.addSchema(2691, c);
      ImmutableMap<String, String> $$137 = ImmutableMap.builder()
         .put("minecraft:waxed_copper", "minecraft:waxed_copper_block")
         .put("minecraft:oxidized_copper_block", "minecraft:oxidized_copper")
         .put("minecraft:weathered_copper_block", "minecraft:weathered_copper")
         .put("minecraft:exposed_copper_block", "minecraft:exposed_copper")
         .build();
      $$0.addFixer(bha.a($$136, "Rename copper item suffixes", b($$137)));
      $$0.addFixer(bdd.a($$136, "Rename copper blocks suffixes", b($$137)));
      Schema $$138 = $$0.addSchema(2693, c);
      $$0.addFixer(new bbx($$138, bjm.O, "has_increased_height_already", false));
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
      $$0.addFixer(bha.a($$139, "Renamed grimstone block items to deepslate", b($$140)));
      $$0.addFixer(bdd.a($$139, "Renamed grimstone blocks to deepslate", b($$140)));
      Schema $$141 = $$0.addSchema(2700, c);
      $$0.addFixer(
         bdd.a(
            $$141,
            "Renamed cave vines blocks",
            b(ImmutableMap.of("minecraft:cave_vines_head", "minecraft:cave_vines", "minecraft:cave_vines_body", "minecraft:cave_vines_plant"))
         )
      );
      Schema $$142 = $$0.addSchema(2701, c);
      $$0.addFixer(new bjv($$142));
      Schema $$143 = $$0.addSchema(2702, c);
      $$0.addFixer(new bbt($$143));
      Schema $$144 = $$0.addSchema(2704, bne::new);
      $$0.addFixer(new bby($$144, "Added Goat", bjm.D));
      Schema $$145 = $$0.addSchema(2707, bnf::new);
      $$0.addFixer(new bby($$145, "Added Marker", bjm.D));
      $$0.addFixer(new bbx($$145, bjm.O, "has_increased_height_already", true));
      Schema $$146 = $$0.addSchema(2710, c);
      $$0.addFixer(new bkd($$146, "Renamed play_one_minute stat to play_time", ImmutableMap.of("minecraft:play_one_minute", "minecraft:play_time")));
      Schema $$147 = $$0.addSchema(2717, c);
      $$0.addFixer(bha.a($$147, "Rename azalea_leaves_flowers", b(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves"))));
      $$0.addFixer(
         bdd.a($$147, "Rename azalea_leaves_flowers items", b(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves")))
      );
      Schema $$148 = $$0.addSchema(2825, c);
      $$0.addFixer(new bbx($$148, bjm.O, "has_increased_height_already", false));
      Schema $$149 = $$0.addSchema(2831, bng::new);
      $$0.addFixer(new bkb($$149));
      Schema $$150 = $$0.addSchema(2832, bnh::new);
      $$0.addFixer(new blc($$150));
      $$0.addFixer(new bdq($$150));
      Schema $$151 = $$0.addSchema(2833, c);
      $$0.addFixer(new bla($$151));
      Schema $$152 = $$0.addSchema(2838, c);
      $$0.addFixer(new bii($$152, "Caves and Cliffs biome renames", bjm.M, b(bdk.a)));
      Schema $$153 = $$0.addSchema(2841, c);
      $$0.addFixer(new bdt($$153));
      Schema $$154 = $$0.addSchema(2842, bni::new);
      $$0.addFixer(new bdu($$154));
      Schema $$155 = $$0.addSchema(2843, c);
      $$0.addFixer(new biy($$155));
      $$0.addFixer(new bii($$155, "Remove Deep Warm Ocean", bjm.M, a("minecraft:deep_warm_ocean", "minecraft:warm_ocean")));
      Schema $$156 = $$0.addSchema(2846, c);
      $$0.addFixer(
         new bca(
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
      $$0.addFixer(new bla($$157));
      Schema $$158 = $$0.addSchema(2967, c);
      $$0.addFixer(new bkg($$158));
      Schema $$159 = $$0.addSchema(2970, c);
      $$0.addFixer(new bkh($$159));
      Schema $$160 = $$0.addSchema(3076, bnj::new);
      $$0.addFixer(new bby($$160, "Added Sculk Catalyst", bjm.s));
      Schema $$161 = $$0.addSchema(3077, c);
      $$0.addFixer(new bdo($$161));
      Schema $$162 = $$0.addSchema(3078, bnk::new);
      $$0.addFixer(new bby($$162, "Added Frog", bjm.D));
      $$0.addFixer(new bby($$162, "Added Tadpole", bjm.D));
      $$0.addFixer(new bby($$162, "Added Sculk Shrieker", bjm.s));
      Schema $$163 = $$0.addSchema(3081, bnl::new);
      $$0.addFixer(new bby($$163, "Added Warden", bjm.D));
      Schema $$164 = $$0.addSchema(3082, bnm::new);
      $$0.addFixer(new bby($$164, "Added Chest Boat", bjm.D));
      Schema $$165 = $$0.addSchema(3083, bnn::new);
      $$0.addFixer(new bby($$165, "Added Allay", bjm.D));
      Schema $$166 = $$0.addSchema(3084, c);
      $$0.addFixer(
         new bii(
            $$166,
            "game_event_renames_3084",
            bjm.G,
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
      $$0.addFixer(new bfv($$167, "Change cat variant type", bjm.D, "minecraft:cat", "CatType", ag.a(new Int2ObjectOpenHashMap(), $$0x -> {
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
      $$0.addFixer(new bec($$167, "Migrate cat variant advancement", "minecraft:husbandry/complete_catalogue", $$1x -> (String)$$168.getOrDefault($$1x, $$1x)));
      Schema $$169 = $$0.addSchema(3087, c);
      $$0.addFixer(new bfv($$169, "Change frog variant type", bjm.D, "minecraft:frog", "Variant", ag.a(new Int2ObjectOpenHashMap(), $$0x -> {
         $$0x.put(0, "minecraft:temperate");
         $$0x.put(1, "minecraft:warm");
         $$0x.put(2, "minecraft:cold");
      })::get));
      Schema $$170 = $$0.addSchema(3090, c);
      $$0.addFixer(new bew($$170, "EntityPaintingFieldsRenameFix", "minecraft:painting", Map.of("Motive", "variant", "Facing", "facing")));
      Schema $$171 = $$0.addSchema(3093, c);
      $$0.addFixer(new bex($$171));
      Schema $$172 = $$0.addSchema(3094, c);
      $$0.addFixer(new bgm($$172));
      Schema $$173 = $$0.addSchema(3097, c);
      $$0.addFixer(new bgd($$173));
      $$0.addFixer(new bge($$173));
      Map<String, String> $$174 = Map.of("minecraft:british", "minecraft:british_shorthair");
      $$0.addFixer(new bks($$173, "Rename british shorthair", bjm.D, "minecraft:cat", $$174));
      $$0.addFixer(
         new bec(
            $$173, "Migrate cat variant advancement for british shorthair", "minecraft:husbandry/complete_catalogue", $$1x -> $$174.getOrDefault($$1x, $$1x)
         )
      );
      $$0.addFixer(new bjd($$173, "Remove unpopulated villager PoI types", Set.of("minecraft:unemployed", "minecraft:nitwit")::contains));
      Schema $$175 = $$0.addSchema(3108, c);
      $$0.addFixer(new bco($$175));
      Schema $$176 = $$0.addSchema(3201, c);
      $$0.addFixer(new biw($$176));
      Schema $$177 = $$0.addSchema(3202, bno::new);
      $$0.addFixer(new bby($$177, "Added Hanging Sign", bjm.s));
      Schema $$178 = $$0.addSchema(3203, bnp::new);
      $$0.addFixer(new bby($$178, "Added Camel", bjm.D));
      Schema $$179 = $$0.addSchema(3204, bnq::new);
      $$0.addFixer(new bby($$179, "Added Chiseled Bookshelf", bjm.s));
      Schema $$180 = $$0.addSchema(3209, c);
      $$0.addFixer(new bhh($$180, false, "minecraft:pig_spawn_egg"));
      Schema $$181 = $$0.addSchema(3214, c);
      $$0.addFixer(new biq($$181));
      Schema $$182 = $$0.addSchema(3319, c);
      $$0.addFixer(new bio($$182));
      Schema $$183 = $$0.addSchema(3322, c);
      $$0.addFixer(new bej($$183));
      Schema $$184 = $$0.addSchema(3325, bnr::new);
      $$0.addFixer(new bby($$184, "Added displays", bjm.D));
      Schema $$185 = $$0.addSchema(3326, bns::new);
      $$0.addFixer(new bby($$185, "Added Sniffer", bjm.D));
      Schema $$186 = $$0.addSchema(3327, bnt::new);
      $$0.addFixer(new bby($$186, "Archaeology", bjm.s));
      Schema $$187 = $$0.addSchema(3328, bnu::new);
      $$0.addFixer(new bby($$187, "Added interaction", bjm.D));
      Schema $$188 = $$0.addSchema(3438, bnv::new);
      $$0.addFixer(bcw.a($$188, "Rename Suspicious Sand to Brushable Block", a("minecraft:suspicious_sand", "minecraft:brushable_block")));
      $$0.addFixer(new bep($$188));
      $$0.addFixer(
         bha.a(
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
      $$0.addFixer(new bby($$188, "Added calibrated sculk sensor", bjm.s));
      Schema $$189 = $$0.addSchema(3439, bnw::new);
      $$0.addFixer(new bcy($$189, "Updated sign text format for Signs", "minecraft:sign"));
      $$0.addFixer(new bcy($$189, "Updated sign text format for Hanging Signs", "minecraft:hanging_sign"));
      Schema $$190 = $$0.addSchema(3440, c);
      $$0.addFixer(new bii($$190, "Replace experimental 1.20 overworld", bjm.N, a("minecraft:overworld_update_1_20", "minecraft:overworld")));
      $$0.addFixer(new bgc($$190, "Remove 1.20 feature toggle", Set.of("minecraft:update_1_20")));
      Schema $$191 = $$0.addSchema(3447, c);
      $$0.addFixer(
         bha.a(
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
      Schema $$192 = $$0.addSchema(3448, bnx::new);
      $$0.addFixer(new bef($$192));
      Schema $$193 = $$0.addSchema(3450, c);
      $$0.addFixer(
         new bjn(
            $$193,
            "Remove liquid_carvers and heightmap chunk statuses",
            b(Map.of("minecraft:liquid_carvers", "minecraft:carvers", "minecraft:heightmaps", "minecraft:spawn"))
         )
      );
      Schema $$194 = $$0.addSchema(3451, c);
      $$0.addFixer(new bdp($$194));
      Schema $$195 = $$0.addSchema(3459, c);
      $$0.addFixer(new bhr($$195));
      Schema $$196 = $$0.addSchema(3564, c);
      $$0.addFixer(new beh($$196, "minecraft:sign"));
      $$0.addFixer(new beh($$196, "minecraft:hanging_sign"));
      Schema $$197 = $$0.addSchema(3565, c);
      $$0.addFixer(new bji($$197));
      Schema $$198 = $$0.addSchema(3566, c);
      $$0.addFixer(new bjy($$198));
      Schema $$199 = $$0.addSchema(3568, c);
      $$0.addFixer(new bid($$199));
      Schema $$200 = $$0.addSchema(3682, bny::new);
      $$0.addFixer(new bby($$200, "Added Crafter", bjm.s));
      Schema $$201 = $$0.addSchema(3683, bnz::new);
      $$0.addFixer(new bjf($$201));
      Schema $$202 = $$0.addSchema(3685, boa::new);
      $$0.addFixer(new bgg($$202));
      Schema $$203 = $$0.addSchema(3689, bob::new);
      $$0.addFixer(new bby($$203, "Added Breeze", bjm.D));
      $$0.addFixer(new bby($$203, "Added Trial Spawner", bjm.s));
      Schema $$204 = $$0.addSchema(3692, c);
      UnaryOperator<String> $$205 = b(Map.of("minecraft:grass", "minecraft:short_grass"));
      $$0.addFixer(bdd.a($$204, "Rename grass block to short_grass", $$205));
      $$0.addFixer(bha.a($$204, "Rename grass item to short_grass", $$205));
      Schema $$206 = $$0.addSchema(3799, boc::new);
      $$0.addFixer(new bby($$206, "Added Armadillo", bjm.D));
      Schema $$207 = $$0.addSchema(3800, c);
      UnaryOperator<String> $$208 = b(Map.of("minecraft:scute", "minecraft:turtle_scute"));
      $$0.addFixer(bha.a($$207, "Rename scute item to turtle_scute", $$208));
      Schema $$209 = $$0.addSchema(3803, c);
      $$0.addFixer(new bjq($$209, "Rename sweeping enchant to sweeping_edge", Map.of("minecraft:sweeping", "minecraft:sweeping_edge")));
      Schema $$210 = $$0.addSchema(3807, bod::new);
      $$0.addFixer(new bby($$210, "Added Vault", bjm.s));
      Schema $$211 = $$0.addSchema(3807, 1, c);
      $$0.addFixer(new bhz($$211));
      Schema $$212 = $$0.addSchema(3808, boe::new);
      $$0.addFixer(new bgp($$212, "minecraft:horse", "ArmorItem", true));
      Schema $$213 = $$0.addSchema(3808, 1, bof::new);
      $$0.addFixer(new bgp($$213, "minecraft:llama", "DecorItem", false));
      Schema $$214 = $$0.addSchema(3808, 2, bog::new);
      $$0.addFixer(new bgp($$214, "minecraft:trader_llama", "DecorItem", false));
      Schema $$215 = $$0.addSchema(3809, c);
      $$0.addFixer(new bdl($$215));
      Schema $$216 = $$0.addSchema(3812, c);
      $$0.addFixer(new bgh($$216));
      Schema $$217 = $$0.addSchema(3813, boh::new);
      $$0.addFixer(new bdb($$217));
      Schema $$218 = $$0.addSchema(3814, c);
      $$0.addFixer(new bcg($$218, "Rename jump strength attribute", a("minecraft:horse.jump_strength", "minecraft:generic.jump_strength")));
      Schema $$219 = $$0.addSchema(3816, boi::new);
      $$0.addFixer(new bby($$219, "Added Bogged", bjm.D));
      Schema $$220 = $$0.addSchema(3818, boj::new);
      $$0.addFixer(new bck($$220));
      $$0.addFixer(new bek($$220));
      Schema $$221 = $$0.addSchema(3818, 1, c);
      $$0.addFixer(new bci($$221));
      Schema $$222 = $$0.addSchema(3818, 2, c);
      $$0.addFixer(new bkm($$222));
      Schema $$223 = $$0.addSchema(3818, 3, bok::new);
      $$0.addFixer(new bld($$223, "Inject data component types", bjm.w));
      Schema $$224 = $$0.addSchema(3818, 4, bol::new);
      $$0.addFixer(new biz($$224));
      Schema $$225 = $$0.addSchema(3818, 5, bom::new);
      $$0.addFixer(new bhd($$225));
      Schema $$226 = $$0.addSchema(3818, 6, c);
      $$0.addFixer(new bcc($$226));
      Schema $$227 = $$0.addSchema(3820, c);
      $$0.addFixer(new bjb($$227));
      $$0.addFixer(new bhy($$227));
      Schema $$228 = $$0.addSchema(3825, bon::new);
      $$0.addFixer(new bhe($$228));
      $$0.addFixer(new bch($$228));
      $$0.addFixer(new bkp($$228));
      $$0.addFixer(new bby($$228, "Added Ominous Item Spawner", bjm.D));
      Schema $$229 = $$0.addSchema(3828, c);
      $$0.addFixer(new bel($$229));
      Schema $$230 = $$0.addSchema(3833, c);
      $$0.addFixer(new bjo($$230));
      Schema $$231 = $$0.addSchema(3938, boo::new);
      $$0.addFixer(new bjg($$231));
      Schema $$232 = $$0.addSchema(3939, c);
      $$0.addFixer(new bgc($$232, "Remove 1.21 feature toggle", Set.of("minecraft:update_1_21")));
      Schema $$233 = $$0.addSchema(3943, c);
      $$0.addFixer(new biv($$233));
      Schema $$234 = $$0.addSchema(3945, c);
      $$0.addFixer(new bce($$234));
      $$0.addFixer(new bhp($$234));
      Schema $$235 = $$0.addSchema(4054, c);
      $$0.addFixer(new bim($$235));
      Schema $$236 = $$0.addSchema(4055, c);
      $$0.addFixer(new bcd($$236));
      Schema $$237 = $$0.addSchema(4057, c);
      $$0.addFixer(new bdh($$237));
      Schema $$238 = $$0.addSchema(4059, bop::new);
      $$0.addFixer(new bgi($$238));
      Schema $$239 = $$0.addSchema(4061, c);
      $$0.addFixer(new bkq($$239));
      Schema $$240 = $$0.addSchema(4064, c);
      $$0.addFixer(new bgf($$240));
      Schema $$241 = $$0.addSchema(4067, boq::new);
      $$0.addFixer(new bdg($$241));
      $$0.addFixer(new bgc($$241, "Remove Bundle experimental feature flag", Set.of("minecraft:bundle")));
      Schema $$242 = $$0.addSchema(4068, c);
      $$0.addFixer(new bhx($$242));
      $$0.addFixer(new beb($$242));
      Schema $$243 = $$0.addSchema(4070, bor::new);
      $$0.addFixer(new bby($$243, "Added Pale Oak Boat and Pale Oak Chest Boat", bjm.D));
      Schema $$244 = $$0.addSchema(4071, bos::new);
      $$0.addFixer(new bby($$244, "Added Creaking", bjm.D));
      $$0.addFixer(new bby($$244, "Added Creaking Heart", bjm.s));
      Schema $$245 = $$0.addSchema(4081, c);
      $$0.addFixer(new bfm($$245));
      Schema $$246 = $$0.addSchema(4173, c);
      $$0.addFixer(new bew($$246, "Rename TNT Minecart fuse", "minecraft:tnt_minecart", Map.of("TNTFuse", "fuse")));
      Schema $$247 = $$0.addSchema(4175, c);
      $$0.addFixer(new bgb($$247));
      $$0.addFixer(new bed($$247));
      Schema $$248 = $$0.addSchema(4176, c);
      $$0.addFixer(new bgs($$248));
      $$0.addFixer(new bgt($$248));
      Schema $$249 = $$0.addSchema(4180, c);
      $$0.addFixer(new bgc($$249, "Remove Winter Drop toggle", Set.of("minecraft:winter_drop")));
      Schema $$250 = $$0.addSchema(4181, c);
      $$0.addFixer(new bcs($$250, "minecraft:furnace"));
      $$0.addFixer(new bcs($$250, "minecraft:smoker"));
      $$0.addFixer(new bcs($$250, "minecraft:blast_furnace"));
      Schema $$251 = $$0.addSchema(4187, c);
      $$0.addFixer(new ben($$251, "Villager follow range fix undo", "minecraft:villager", "minecraft:follow_range", $$0x -> $$0x == 48.0 ? 16.0 : $$0x));
      $$0.addFixer(new ben($$251, "Bee follow range fix", "minecraft:bee", "minecraft:follow_range", $$0x -> $$0x == 48.0 ? 16.0 : $$0x));
      $$0.addFixer(new ben($$251, "Allay follow range fix", "minecraft:allay", "minecraft:follow_range", $$0x -> $$0x == 48.0 ? 16.0 : $$0x));
      $$0.addFixer(new ben($$251, "Llama follow range fix", "minecraft:llama", "minecraft:follow_range", $$0x -> $$0x == 40.0 ? 16.0 : $$0x));
      $$0.addFixer(new ben($$251, "Piglin Brute follow range fix", "minecraft:piglin_brute", "minecraft:follow_range", $$0x -> $$0x == 16.0 ? 12.0 : $$0x));
      $$0.addFixer(new ben($$251, "Warden follow range fix", "minecraft:warden", "minecraft:follow_range", $$0x -> $$0x == 16.0 ? 24.0 : $$0x));
      Schema $$252 = $$0.addSchema(4290, bot::new);
      $$0.addFixer(new bkr($$252));
      Schema $$253 = $$0.addSchema(4291, c);
      $$0.addFixer(new bhs($$253));
      $$0.addFixer(new bkk($$253));
      Schema $$254 = $$0.addSchema(4292, bou::new);
      $$0.addFixer(new bki($$254));
      Schema $$255 = $$0.addSchema(4293, c);
      $$0.addFixer(new beg($$255));
      Schema $$256 = $$0.addSchema(4294, c);
      $$0.addFixer(
         new bdc(
            $$256,
            "CreakingHeartBlockStateFix",
            "minecraft:creaking_heart",
            "active",
            "creaking_heart_state",
            $$0x -> $$0x.equals("true") ? "awake" : "uprooted"
         )
      );
      Schema $$257 = $$0.addSchema(4295, c);
      $$0.addFixer(new bcn($$257));
      Schema $$258 = $$0.addSchema(4296, c);
      $$0.addFixer(new bcb($$258));
      Schema $$259 = $$0.addSchema(4297, c);
      $$0.addFixer(new bgk($$259));
      Schema $$260 = $$0.addSchema(4299, c);
      $$0.addFixer(new bfq($$260));
      Schema $$261 = $$0.addSchema(4300, bov::new);
      $$0.addFixer(new bju($$261));
      Schema $$262 = $$0.addSchema(4301, bow::new);
      $$0.addFixer(new bga($$262));
      Schema $$263 = $$0.addSchema(4302, box::new);
      $$0.addFixer(new bby($$263, "Added Test and Test Instance Block Entities", bjm.s));
      Schema $$264 = $$0.addSchema(4303, c);
      $$0.addFixer(new bev($$264, bjm.D));
      $$0.addFixer(new bev($$264, bjm.b));
      Schema $$265 = $$0.addSchema(4305, c);
      $$0.addFixer(new bdc($$265, "rename test block mode", "minecraft:test_block", "test_block_mode", "mode", $$0x -> $$0x));
      Schema $$266 = $$0.addSchema(4306, boy::new);
      $$0.addFixer(new bkl($$266));
      Schema $$267 = $$0.addSchema(4307, boz::new);
      $$0.addFixer(new bkn($$267));
      Schema $$268 = $$0.addSchema(4309, c);
      $$0.addFixer(new bjh($$268));
      $$0.addFixer(new bdy($$268));
      Schema $$269 = $$0.addSchema(4311, c);
      $$0.addFixer(new bca($$269, false, "Use lodestone category change", a("minecraft:nether/use_lodestone", "minecraft:adventure/use_lodestone")));
      Schema $$270 = $$0.addSchema(4312, bpa::new);
      $$0.addFixer(new bja($$270));
      Schema $$271 = $$0.addSchema(4314, c);
      $$0.addFixer(new bgr($$271));
   }

   private static UnaryOperator<String> a(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault($$1, $$1);
   }

   private static UnaryOperator<String> b(Map<String, String> $$0) {
      return $$1 -> $$0.getOrDefault(blh.a($$1), $$1);
   }

   private static UnaryOperator<String> a(String $$0, String $$1) {
      return $$2 -> Objects.equals(blh.a($$2), $$0) ? $$1 : $$2;
   }
}
