import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dei {
   Codec<dei> c = ma.av.q().dispatch(dei::a, Function.identity());

   static MapCodec<? extends dei> b(kd<MapCodec<? extends dei>> $$0) {
      kd.a($$0, "all_of", deb.b.a);
      kd.a($$0, "apply_mob_effect", dec.a);
      kd.a($$0, "attribute", deg.a);
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

   void a(arx var1, int var2, ddp var3, bvb var4, fbr var5, boolean var6);

   default void a(ddp $$0, bvb $$1, fbr $$2, int $$3) {
   }

   MapCodec<? extends dei> a();
}
