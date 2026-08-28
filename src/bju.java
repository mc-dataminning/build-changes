import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;

public class bju extends bhr {
   private static final Logger a = LogUtils.getLogger();

   public bju(Schema $$0) {
      super($$0, false, "TrialSpawnerConfigInRegistryFix", biw.s, "minecraft:trial_spawner");
   }

   public Dynamic<?> a(Dynamic<vu> $$0) {
      Optional<Dynamic<vu>> $$1 = $$0.get("normal_config").result();
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         Optional<Dynamic<vu>> $$2 = $$0.get("ominous_config").result();
         if ($$2.isEmpty()) {
            return $$0;
         } else {
            alz $$3 = bju.a.a.get(Pair.of($$1.get(), $$2.get()));
            return $$3 == null
               ? $$0
               : $$0.set("normal_config", $$0.createString($$3.g("/normal").toString())).set("ominous_config", $$0.createString($$3.g("/ominous").toString()));
         }
      }
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> {
         DynamicOps<?> $$1 = $$0x.getOps();
         Dynamic<?> $$2 = this.a($$0x.convert(vl.a));
         return $$2.convert($$1);
      });
   }

   static final class a {
      public static final Map<Pair<Dynamic<vu>, Dynamic<vu>>, alz> a = new HashMap<>();

      private a() {
      }

      private static void a(alz $$0, String $$1, String $$2) {
         try {
            ux $$3 = a($$1);
            ux $$4 = a($$2);
            ux $$5 = $$3.i().a($$4);
            ux $$6 = b($$5.i());
            Dynamic<vu> $$7 = a($$3);
            a.put(Pair.of($$7, a($$4)), $$0);
            a.put(Pair.of($$7, a($$5)), $$0);
            a.put(Pair.of($$7, a($$6)), $$0);
         } catch (RuntimeException var8) {
            throw new IllegalStateException("Failed to parse NBT for " + $$0, var8);
         }
      }

      private static Dynamic<vu> a(ux $$0) {
         return new Dynamic(vl.a, $$0);
      }

      private static ux a(String $$0) {
         try {
            return vv.a($$0);
         } catch (CommandSyntaxException var2) {
            throw new IllegalArgumentException("Failed to parse Trial Spawner NBT config: " + $$0, var2);
         }
      }

      private static ux b(ux $$0) {
         if ($$0.h("spawn_range") == 4) {
            $$0.r("spawn_range");
         }

         if ($$0.j("total_mobs") == 6.0F) {
            $$0.r("total_mobs");
         }

         if ($$0.j("simultaneous_mobs") == 2.0F) {
            $$0.r("simultaneous_mobs");
         }

         if ($$0.j("total_mobs_added_per_player") == 2.0F) {
            $$0.r("total_mobs_added_per_player");
         }

         if ($$0.j("simultaneous_mobs_added_per_player") == 1.0F) {
            $$0.r("simultaneous_mobs_added_per_player");
         }

         if ($$0.h("ticks_between_spawn") == 40) {
            $$0.r("ticks_between_spawn");
         }

         return $$0;
      }

      static {
         a(
            alz.b("trial_chamber/breeze"),
            "{simultaneous_mobs: 1.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:breeze\"}}, weight: 1}], ticks_between_spawn: 20, total_mobs: 2.0f, total_mobs_added_per_player: 1.0f}",
            "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], simultaneous_mobs: 2.0f, total_mobs: 4.0f}"
         );
         a(
            alz.b("trial_chamber/melee/husk"),
            "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:husk\"}}, weight: 1}], ticks_between_spawn: 20}",
            "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], spawn_potentials: [{data: {entity: {id: \"minecraft:husk\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_melee\", slot_drop_chances: 0.0f}}, weight: 1}]}"
         );
         a(
            alz.b("trial_chamber/melee/spider"),
            "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:spider\"}}, weight: 1}], ticks_between_spawn: 20}",
            "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}],simultaneous_mobs: 4.0f, total_mobs: 12.0f}"
         );
         a(
            alz.b("trial_chamber/melee/zombie"),
            "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:zombie\"}}, weight: 1}], ticks_between_spawn: 20}",
            "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}],spawn_potentials: [{data: {entity: {id: \"minecraft:zombie\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_melee\", slot_drop_chances: 0.0f}}, weight: 1}]}"
         );
         a(
            alz.b("trial_chamber/ranged/poison_skeleton"),
            "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:bogged\"}}, weight: 1}], ticks_between_spawn: 20}",
            "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}],spawn_potentials: [{data: {entity: {id: \"minecraft:bogged\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_ranged\", slot_drop_chances: 0.0f}}, weight: 1}]}"
         );
         a(
            alz.b("trial_chamber/ranged/skeleton"),
            "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:skeleton\"}}, weight: 1}], ticks_between_spawn: 20}",
            "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], spawn_potentials: [{data: {entity: {id: \"minecraft:skeleton\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_ranged\", slot_drop_chances: 0.0f}}, weight: 1}]}"
         );
         a(
            alz.b("trial_chamber/ranged/stray"),
            "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:stray\"}}, weight: 1}], ticks_between_spawn: 20}",
            "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], spawn_potentials: [{data: {entity: {id: \"minecraft:stray\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_ranged\", slot_drop_chances: 0.0f}}, weight: 1}]}"
         );
         a(
            alz.b("trial_chamber/slow_ranged/poison_skeleton"),
            "{simultaneous_mobs: 4.0f, simultaneous_mobs_added_per_player: 2.0f, spawn_potentials: [{data: {entity: {id: \"minecraft:bogged\"}}, weight: 1}], ticks_between_spawn: 160}",
            "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], spawn_potentials: [{data: {entity: {id: \"minecraft:bogged\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_ranged\", slot_drop_chances: 0.0f}}, weight: 1}]}"
         );
         a(
            alz.b("trial_chamber/slow_ranged/skeleton"),
            "{simultaneous_mobs: 4.0f, simultaneous_mobs_added_per_player: 2.0f, spawn_potentials: [{data: {entity: {id: \"minecraft:skeleton\"}}, weight: 1}], ticks_between_spawn: 160}",
            "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], spawn_potentials: [{data: {entity: {id: \"minecraft:skeleton\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_ranged\", slot_drop_chances: 0.0f}}, weight: 1}]}"
         );
         a(
            alz.b("trial_chamber/slow_ranged/stray"),
            "{simultaneous_mobs: 4.0f, simultaneous_mobs_added_per_player: 2.0f, spawn_potentials: [{data: {entity: {id: \"minecraft:stray\"}}, weight: 1}], ticks_between_spawn: 160}",
            "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}],spawn_potentials: [{data: {entity: {id: \"minecraft:stray\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_ranged\", slot_drop_chances: 0.0f}}, weight: 1}]}"
         );
         a(
            alz.b("trial_chamber/small_melee/baby_zombie"),
            "{simultaneous_mobs: 2.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {IsBaby: 1b, id: \"minecraft:zombie\"}}, weight: 1}], ticks_between_spawn: 20}",
            "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], spawn_potentials: [{data: {entity: {IsBaby: 1b, id: \"minecraft:zombie\"}, equipment: {loot_table: \"minecraft:equipment/trial_chamber_melee\", slot_drop_chances: 0.0f}}, weight: 1}]}"
         );
         a(
            alz.b("trial_chamber/small_melee/cave_spider"),
            "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:cave_spider\"}}, weight: 1}], ticks_between_spawn: 20}",
            "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], simultaneous_mobs: 4.0f, total_mobs: 12.0f}"
         );
         a(
            alz.b("trial_chamber/small_melee/silverfish"),
            "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {id: \"minecraft:silverfish\"}}, weight: 1}], ticks_between_spawn: 20}",
            "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], simultaneous_mobs: 4.0f, total_mobs: 12.0f}"
         );
         a(
            alz.b("trial_chamber/small_melee/slime"),
            "{simultaneous_mobs: 3.0f, simultaneous_mobs_added_per_player: 0.5f, spawn_potentials: [{data: {entity: {Size: 1, id: \"minecraft:slime\"}}, weight: 3}, {data: {entity: {Size: 2, id: \"minecraft:slime\"}}, weight: 1}], ticks_between_spawn: 20}",
            "{loot_tables_to_eject: [{data: \"minecraft:spawners/ominous/trial_chamber/key\", weight: 3}, {data: \"minecraft:spawners/ominous/trial_chamber/consumables\", weight: 7}], simultaneous_mobs: 4.0f, total_mobs: 12.0f}"
         );
      }
   }
}
