import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface das extends dat {
   Codec<das> b = lt.aw.r().dispatch(das::a, Function.identity());

   static MapCodec<? extends das> a(jz<MapCodec<? extends das>> $$0) {
      jz.a($$0, "all_of", dam.a.a);
      jz.a($$0, "apply_mob_effect", dan.a);
      jz.a($$0, "damage_entity", dao.a);
      jz.a($$0, "damage_item", daq.a);
      jz.a($$0, "explode", dav.a);
      jz.a($$0, "ignite", daw.a);
      jz.a($$0, "play_sound", day.a);
      jz.a($$0, "replace_block", dba.a);
      jz.a($$0, "replace_disc", dbb.a);
      jz.a($$0, "run_function", dbc.a);
      jz.a($$0, "set_block_properties", dbd.a);
      jz.a($$0, "spawn_particles", dbf.a);
      return jz.a($$0, "summon_entity", dbg.a);
   }

   void a(aqu var1, int var2, dab var3, bsr var4, exc var5);

   @Override
   default void a(aqu $$0, int $$1, dab $$2, bsr $$3, exc $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends das> a();
}
