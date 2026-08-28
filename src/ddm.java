import com.mojang.serialization.MapCodec;

public interface ddm {
   static MapCodec<? extends ddl> a(kd<MapCodec<? extends ddl>> $$0) {
      kd.a($$0, "by_cost", ddn.b);
      kd.a($$0, "by_cost_with_difficulty", ddo.c);
      return kd.a($$0, "single", ddp.b);
   }
}
