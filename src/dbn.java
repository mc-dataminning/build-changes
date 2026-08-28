import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dbn extends dbo {
   Codec<dbn> b = lu.av.q().dispatch(dbn::a, Function.identity());

   static MapCodec<? extends dbn> a(ka<MapCodec<? extends dbn>> $$0) {
      ka.a($$0, "all_of", dbh.a.a);
      ka.a($$0, "apply_mob_effect", dbi.a);
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

   void a(arg var1, int var2, dav var3, btj var4, eye var5);

   @Override
   default void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dbn> a();
}
