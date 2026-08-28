import com.mojang.datafixers.DSL.TypeReference;

public class bgq {
   public static final TypeReference a = a("level");
   public static final TypeReference b = a("player");
   public static final TypeReference c = a("chunk");
   public static final TypeReference d = a("hotbar");
   public static final TypeReference e = a("options");
   public static final TypeReference f = a("structure");
   public static final TypeReference g = a("stats");
   public static final TypeReference h = a("saved_data/command_storage");
   public static final TypeReference i = a("saved_data/chunks");
   public static final TypeReference j = a("saved_data/map_data");
   public static final TypeReference k = a("saved_data/idcounts");
   public static final TypeReference l = a("saved_data/raids");
   public static final TypeReference m = a("saved_data/random_sequences");
   public static final TypeReference n = a("saved_data/structure_feature_indices");
   public static final TypeReference o = a("saved_data/scoreboard");
   public static final TypeReference p = a("advancements");
   public static final TypeReference q = a("poi_chunk");
   public static final TypeReference r = a("entity_chunk");
   public static final TypeReference s = a("block_entity");
   public static final TypeReference t = a("item_stack");
   public static final TypeReference u = a("block_state");
   public static final TypeReference v = a("flat_block_state");
   public static final TypeReference w = a("data_components");
   public static final TypeReference x = a("villager_trade");
   public static final TypeReference y = a("particle");
   public static final TypeReference z = a("entity_name");
   public static final TypeReference A = a("entity_tree");
   public static final TypeReference B = a("entity");
   public static final TypeReference C = a("block_name");
   public static final TypeReference D = a("item_name");
   public static final TypeReference E = a("game_event_name");
   public static final TypeReference F = a("untagged_spawner");
   public static final TypeReference G = a("structure_feature");
   public static final TypeReference H = a("objective");
   public static final TypeReference I = a("team");
   public static final TypeReference J = a("recipe");
   public static final TypeReference K = a("biome");
   public static final TypeReference L = a("multi_noise_biome_source_parameter_list");
   public static final TypeReference M = a("world_gen_settings");

   public static TypeReference a(final String $$0) {
      return new TypeReference() {
         public String typeName() {
            return $$0;
         }

         @Override
         public String toString() {
            return "@" + $$0;
         }
      };
   }
}
