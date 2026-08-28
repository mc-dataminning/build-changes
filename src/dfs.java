import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfs extends dez {
   public static final MapCodec<dfs> a = b(dfs::new);
   private static final xp b = xp.c("container.cartography_table");

   @Override
   public MapCodec<dfs> a() {
      return a;
   }

   protected dfs(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.aw);
         return bqu.c;
      }
   }

   @Nullable
   @Override
   protected bqy b(dsc $$0, dby $$1, iz $$2) {
      return new bre(($$2x, $$3, $$4) -> new cqa($$2x, $$3, cqf.a($$1, $$2)), b);
   }
}
