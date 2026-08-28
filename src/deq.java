import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface deq {
   Codec<deq> c = ma.av.q().dispatch(deq::a, Function.identity());

   static MapCodec<? extends deq> b(kd<MapCodec<? extends deq>> $$0) {
      kd.a($$0, "all_of", dej.b.a);
      kd.a($$0, "apply_mob_effect", dek.a);
      kd.a($$0, "attribute", deo.a);
      kd.a($$0, "change_item_damage", del.a);
      kd.a($$0, "damage_entity", dem.a);
      kd.a($$0, "explode", des.a);
      kd.a($$0, "ignite", det.a);
      kd.a($$0, "play_sound", dev.a);
      kd.a($$0, "replace_block", dex.a);
      kd.a($$0, "replace_disk", dey.a);
      kd.a($$0, "run_function", dez.a);
      kd.a($$0, "set_block_properties", dfa.a);
      kd.a($$0, "spawn_particles", dfc.a);
      return kd.a($$0, "summon_entity", dfd.a);
   }

   void a(ash var1, int var2, ddx var3, bvj var4, fbx var5, boolean var6);

   default void a(ddx $$0, bvj $$1, fbx $$2, int $$3) {
   }

   MapCodec<? extends deq> a();
}
