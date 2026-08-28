import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface deh extends dei {
   Codec<deh> b = ma.au.q().dispatch(deh::a, Function.identity());

   static MapCodec<? extends deh> a(kd<MapCodec<? extends deh>> $$0) {
      kd.a($$0, "all_of", deb.a.a);
      kd.a($$0, "apply_mob_effect", dec.a);
      kd.a($$0, "change_item_damage", ded.a);
      kd.a($$0, "damage_entity", dee.a);
      kd.a($$0, "explode", dek.a);
      kd.a($$0, "ignite", del.a);
      kd.a($$0, "play_sound", den.a);
      kd.a($$0, "replace_block", dep.a);
      kd.a($$0, "replace_disk", deq.a);
      kd.a($$0, "run_function", der.a);
      kd.a($$0, "set_block_properties", des.a);
      kd.a($$0, "spawn_particles", deu.a);
      return kd.a($$0, "summon_entity", dev.a);
   }

   void a(arx var1, int var2, ddp var3, bvb var4, fbr var5);

   @Override
   default void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends deh> a();
}
