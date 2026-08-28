import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface deq extends der {
   Codec<deq> b = ma.au.q().dispatch(deq::a, Function.identity());

   static MapCodec<? extends deq> a(kd<MapCodec<? extends deq>> $$0) {
      kd.a($$0, "all_of", dek.a.a);
      kd.a($$0, "apply_mob_effect", del.a);
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

   void a(ash var1, int var2, ddy var3, bvk var4, fby var5);

   @Override
   default void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends deq> a();
}
