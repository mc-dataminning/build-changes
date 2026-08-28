import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class alu extends ave<af> {
   private static final Logger a = LogUtils.getLogger();
   private Map<alh, ag> b = Map.of();
   private al c = new al();
   private final jr.a d;

   public alu(jr.a $$0) {
      super($$0, af.a, ly.c(ly.bg));
      this.d = $$0;
   }

   protected void a(Map<alh, af> $$0, ava $$1, bok $$2) {
      Builder<alh, ag> $$3 = ImmutableMap.builder();
      $$0.forEach(($$1x, $$2x) -> {
         this.a($$1x, $$2x);
         $$3.put($$1x, new ag($$1x, $$2x));
      });
      this.b = $$3.buildOrThrow();
      al $$4 = new al();
      $$4.a(this.b.values());

      for (ah $$5 : $$4.b()) {
         if ($$5.b().b().c().isPresent()) {
            at.a($$5);
         }
      }

      this.c = $$4;
   }

   private void a(alh $$0, af $$1) {
      azp.a $$2 = new azp.a();
      $$1.a($$2, this.d);
      $$2.b().ifPresent($$1x -> a.warn("Found validation problems in advancement {}: \n{}", $$0, $$1x));
   }

   @Nullable
   public ag a(alh $$0) {
      return this.b.get($$0);
   }

   public al a() {
      return this.c;
   }

   public Collection<ag> b() {
      return this.b.values();
   }
}
