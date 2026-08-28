import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class alt extends avh<ai> {
   private static final Logger a = LogUtils.getLogger();
   private Map<alg, aj> b = Map.of();
   private ao c = new ao();
   private final jh.a d;

   public alt(jh.a $$0) {
      super($$0, ai.a, mh.bt);
      this.d = $$0;
   }

   protected void a(Map<alg, ai> $$0, avd $$1, bqq $$2) {
      Builder<alg, aj> $$3 = ImmutableMap.builder();
      $$0.forEach(($$1x, $$2x) -> {
         this.a($$1x, $$2x);
         $$3.put($$1x, new aj($$1x, $$2x));
      });
      this.b = $$3.buildOrThrow();
      ao $$4 = new ao();
      $$4.a(this.b.values());

      for (ak $$5 : $$4.b()) {
         if ($$5.b().b().c().isPresent()) {
            aw.a($$5);
         }
      }

      this.c = $$4;
   }

   private void a(alg $$0, ai $$1) {
      azt.a $$2 = new azt.a();
      $$1.a($$2, this.d);
      $$2.b().ifPresent($$1x -> a.warn("Found validation problems in advancement {}: \n{}", $$0, $$1x));
   }

   @Nullable
   public aj a(alg $$0) {
      return this.b.get($$0);
   }

   public ao a() {
      return this.c;
   }

   public Collection<aj> b() {
      return this.b.values();
   }
}
