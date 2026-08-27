import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dyv extends dzq {
   public static final Codec<dyv> a = dgb.b.xmap(dga.a::b, cua::o).listOf().fieldOf("blocks").xmap(dyv::new, $$0 -> $$0.e).codec();
   public static final dyv b = new dyv(ImmutableList.of(cuc.pa));
   public static final dyv c = new dyv(ImmutableList.of(cuc.a));
   public static final dyv d = new dyv(ImmutableList.of(cuc.a, cuc.pa));
   private final ImmutableList<cua> e;

   public dyv(List<cua> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dzt.c a(crc $$0, ht $$1, ht $$2, dzt.c $$3, dzt.c $$4, dzp $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected dzs<?> a() {
      return dzs.e;
   }
}
