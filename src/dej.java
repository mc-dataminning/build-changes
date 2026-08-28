import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dej {
   Codec<dej> c = ma.av.q().dispatch(dej::a, Function.identity());

   static MapCodec<? extends dej> b(kd<MapCodec<? extends dej>> $$0) {
      kd.a($$0, "all_of", dec.b.a);
      kd.a($$0, "apply_mob_effect", ded.a);
      kd.a($$0, "attribute", deh.a);
      kd.a($$0, "change_item_damage", dee.a);
      kd.a($$0, "damage_entity", def.a);
      kd.a($$0, "explode", del.a);
      kd.a($$0, "ignite", dem.a);
      kd.a($$0, "play_sound", deo.a);
      kd.a($$0, "replace_block", deq.a);
      kd.a($$0, "replace_disk", der.a);
      kd.a($$0, "run_function", des.a);
      kd.a($$0, "set_block_properties", det.a);
      kd.a($$0, "spawn_particles", dev.a);
      return kd.a($$0, "summon_entity", dew.a);
   }

   void a(ash var1, int var2, ddq var3, bvf var4, fbs var5, boolean var6);

   default void a(ddq $$0, bvf $$1, fbs $$2, int $$3) {
   }

   MapCodec<? extends dej> a();
}
