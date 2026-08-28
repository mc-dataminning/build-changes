import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface der {
   Codec<der> c = ma.av.q().dispatch(der::a, Function.identity());

   static MapCodec<? extends der> b(kd<MapCodec<? extends der>> $$0) {
      kd.a($$0, "all_of", dek.b.a);
      kd.a($$0, "apply_mob_effect", del.a);
      kd.a($$0, "attribute", dep.a);
      kd.a($$0, "change_item_damage", dem.a);
      kd.a($$0, "damage_entity", den.a);
      kd.a($$0, "explode", det.a);
      kd.a($$0, "ignite", deu.a);
      kd.a($$0, "play_sound", dew.a);
      kd.a($$0, "replace_block", dey.a);
      kd.a($$0, "replace_disk", dez.a);
      kd.a($$0, "run_function", dfa.a);
      kd.a($$0, "set_block_properties", dfb.a);
      kd.a($$0, "spawn_particles", dfd.a);
      return kd.a($$0, "summon_entity", dfe.a);
   }

   void a(ash var1, int var2, ddy var3, bvk var4, fby var5, boolean var6);

   default void a(ddy $$0, bvk $$1, fby $$2, int $$3) {
   }

   MapCodec<? extends der> a();
}
