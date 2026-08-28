import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dei extends dej {
   Codec<dei> b = mb.au.q().dispatch(dei::a, Function.identity());

   static MapCodec<? extends dei> a(ke<MapCodec<? extends dei>> $$0) {
      ke.a($$0, "all_of", dec.a.a);
      ke.a($$0, "apply_mob_effect", ded.a);
      ke.a($$0, "change_item_damage", dee.a);
      ke.a($$0, "damage_entity", def.a);
      ke.a($$0, "explode", del.a);
      ke.a($$0, "ignite", dem.a);
      ke.a($$0, "play_sound", deo.a);
      ke.a($$0, "replace_block", deq.a);
      ke.a($$0, "replace_disk", der.a);
      ke.a($$0, "run_function", des.a);
      ke.a($$0, "set_block_properties", det.a);
      ke.a($$0, "spawn_particles", dev.a);
      return ke.a($$0, "summon_entity", dew.a);
   }

   void a(ard var1, int var2, ddq var3, bva var4, fbx var5);

   @Override
   default void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dei> a();
}
