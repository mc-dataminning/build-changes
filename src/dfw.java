import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dfw extends dfx {
   Codec<dfw> b = mf.as.q().dispatch(dfw::a, Function.identity());

   static MapCodec<? extends dfw> a(jr<MapCodec<? extends dfw>> $$0) {
      jr.a($$0, "all_of", dfq.a.a);
      jr.a($$0, "apply_mob_effect", dfr.a);
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

   void a(aro var1, int var2, dfe var3, bwa var4, fdw var5);

   @Override
   default void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dfw> a();
}
