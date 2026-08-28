import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dej {
   Codec<dej> c = mb.av.q().dispatch(dej::a, Function.identity());

   static MapCodec<? extends dej> b(ke<MapCodec<? extends dej>> $$0) {
      ke.a($$0, "all_of", dec.b.a);
      ke.a($$0, "apply_mob_effect", ded.a);
      ke.a($$0, "attribute", deh.a);
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

   void a(ard var1, int var2, ddq var3, bva var4, fbx var5, boolean var6);

   default void a(ddq $$0, bva $$1, fbx $$2, int $$3) {
   }

   MapCodec<? extends dej> a();
}
