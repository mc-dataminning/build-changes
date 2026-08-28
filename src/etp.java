import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface etp {
   etp a = $$0 -> $$0;

   alh<etl> lookup(alh<etl> var1);

   static etp create(List<etn> $$0, iv $$1, long $$2) {
      if ($$0.isEmpty()) {
         return a;
      } else {
         azx $$3 = azx.a($$2).e().a($$1);
         Builder<alh<etl>, alh<etl>> $$4 = ImmutableMap.builder();
         $$0.forEach($$2x -> $$2x.a($$3, $$4::put));
         Map<alh<etl>, alh<etl>> $$5 = $$4.build();
         return $$1x -> Objects.requireNonNull($$5.getOrDefault($$1x, $$1x), () -> "alias " + $$1x.a() + " was mapped to null value");
      }
   }
}
