import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dey extends dez {
   Codec<dey> b = md.au.q().dispatch(dey::a, Function.identity());

   static MapCodec<? extends dey> a(kf<MapCodec<? extends dey>> $$0) {
      kf.a($$0, "all_of", des.a.a);
      kf.a($$0, "apply_mob_effect", det.a);
      kf.a($$0, "change_item_damage", deu.a);
      kf.a($$0, "damage_entity", dev.a);
      kf.a($$0, "explode", dfb.a);
      kf.a($$0, "ignite", dfc.a);
      kf.a($$0, "play_sound", dfe.a);
      kf.a($$0, "replace_block", dfg.a);
      kf.a($$0, "replace_disk", dfh.a);
      kf.a($$0, "run_function", dfi.a);
      kf.a($$0, "set_block_properties", dfj.a);
      kf.a($$0, "spawn_particles", dfl.a);
      return kf.a($$0, "summon_entity", dfm.a);
   }

   void a(arn var1, int var2, deg var3, bvs var4, fcu var5);

   @Override
   default void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dey> a();
}
