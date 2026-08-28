import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class biw extends DataFix {
   public biw(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "RaidRenamesDataFix", this.getInputSchema().getType(bjb.l), $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> $$0x.update("data", biw::a))
      );
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.renameAndFixField("Raids", "raids", $$0x -> $$0x.createList($$0x.asStream().map(biw::b)))
         .renameField("Tick", "tick")
         .renameField("NextAvailableID", "next_id");
   }

   private static Dynamic<?> b(Dynamic<?> $$0) {
      return bbf.a($$0, "CX", "CY", "CZ", "center")
         .renameField("Id", "id")
         .renameField("Started", "started")
         .renameField("Active", "active")
         .renameField("TicksActive", "ticks_active")
         .renameField("BadOmenLevel", "raid_omen_level")
         .renameField("GroupsSpawned", "groups_spawned")
         .renameField("PreRaidTicks", "cooldown_ticks")
         .renameField("PostRaidTicks", "post_raid_ticks")
         .renameField("TotalHealth", "total_health")
         .renameField("NumGroups", "group_count")
         .renameField("Status", "status");
   }
}
