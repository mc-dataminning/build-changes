import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dat {
   Codec<dat> c = lt.ax.r().dispatch(dat::a, Function.identity());

   static MapCodec<? extends dat> b(jz<MapCodec<? extends dat>> $$0) {
      jz.a($$0, "all_of", dam.b.a);
      jz.a($$0, "apply_mob_effect", dan.a);
      jz.a($$0, "attribute", dar.a);
      jz.a($$0, "damage_entity", dao.a);
      jz.a($$0, "damage_item", daq.a);
      jz.a($$0, "explode", dav.a);
      jz.a($$0, "ignite", daw.a);
      jz.a($$0, "play_sound", day.a);
      jz.a($$0, "replace_block", dba.a);
      jz.a($$0, "replace_disk", dbb.a);
      jz.a($$0, "run_function", dbc.a);
      jz.a($$0, "set_block_properties", dbd.a);
      jz.a($$0, "spawn_particles", dbf.a);
      return jz.a($$0, "summon_entity", dbg.a);
   }

   void a(aqu var1, int var2, dab var3, bsr var4, exc var5, boolean var6);

   default void a(dab $$0, bsr $$1, exc $$2, int $$3) {
   }

   MapCodec<? extends dat> a();
}
