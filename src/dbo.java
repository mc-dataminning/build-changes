import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dbo {
   Codec<dbo> c = lu.aw.q().dispatch(dbo::a, Function.identity());

   static MapCodec<? extends dbo> b(ka<MapCodec<? extends dbo>> $$0) {
      ka.a($$0, "all_of", dbh.b.a);
      ka.a($$0, "apply_mob_effect", dbi.a);
      ka.a($$0, "attribute", dbm.a);
      ka.a($$0, "damage_entity", dbj.a);
      ka.a($$0, "damage_item", dbl.a);
      ka.a($$0, "explode", dbq.a);
      ka.a($$0, "ignite", dbr.a);
      ka.a($$0, "play_sound", dbt.a);
      ka.a($$0, "replace_block", dbv.a);
      ka.a($$0, "replace_disk", dbw.a);
      ka.a($$0, "run_function", dbx.a);
      ka.a($$0, "set_block_properties", dby.a);
      ka.a($$0, "spawn_particles", dca.a);
      return ka.a($$0, "summon_entity", dcb.a);
   }

   void a(arg var1, int var2, dav var3, btj var4, eye var5, boolean var6);

   default void a(dav $$0, btj $$1, eye $$2, int $$3) {
   }

   MapCodec<? extends dbo> a();
}
