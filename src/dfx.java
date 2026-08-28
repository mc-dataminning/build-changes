import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dfx {
   Codec<dfx> c = mf.at.q().dispatch(dfx::a, Function.identity());

   static MapCodec<? extends dfx> b(jr<MapCodec<? extends dfx>> $$0) {
      jr.a($$0, "all_of", dfq.b.a);
      jr.a($$0, "apply_mob_effect", dfr.a);
      jr.a($$0, "attribute", dfv.a);
      jr.a($$0, "change_item_damage", dfs.a);
      jr.a($$0, "damage_entity", dft.a);
      jr.a($$0, "explode", dfz.a);
      jr.a($$0, "ignite", dga.a);
      jr.a($$0, "play_sound", dgc.a);
      jr.a($$0, "replace_block", dge.a);
      jr.a($$0, "replace_disk", dgf.a);
      jr.a($$0, "run_function", dgg.a);
      jr.a($$0, "set_block_properties", dgh.a);
      jr.a($$0, "spawn_particles", dgj.a);
      return jr.a($$0, "summon_entity", dgk.a);
   }

   void a(aro var1, int var2, dfe var3, bwa var4, fdw var5, boolean var6);

   default void a(dfe $$0, bwa $$1, fdw $$2, int $$3) {
   }

   MapCodec<? extends dfx> a();
}
