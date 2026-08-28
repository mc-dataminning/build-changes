import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class alv extends avf<ag> {
   private static final Logger a = LogUtils.getLogger();
   private Map<ali, ah> b = Map.of();
   private am c = new am();
   private final js.a d;

   public alv(js.a $$0) {
      super($$0, ag.a, lz.c(lz.bg));
      this.d = $$0;
   }

   protected void a(Map<ali, ag> $$0, avb $$1, bon $$2) {
      Builder<ali, ah> $$3 = ImmutableMap.builder();
      $$0.forEach(($$1x, $$2x) -> {
         this.a($$1x, $$2x);
         $$3.put($$1x, new ah($$1x, $$2x));
      });
      this.b = $$3.buildOrThrow();
      am $$4 = new am();
      $$4.a(this.b.values());

      for (ai $$5 : $$4.b()) {
         if ($$5.b().b().c().isPresent()) {
            au.a($$5);
         }
      }

      this.c = $$4;
   }

   private void a(ali $$0, ag $$1) {
      azq.a $$2 = new azq.a();
      $$1.a($$2, this.d);
      $$2.b().ifPresent($$1x -> a.warn("Found validation problems in advancement {}: \n{}", $$0, $$1x));
   }

   @Nullable
   public ah a(ali $$0) {
      return this.b.get($$0);
   }

   public am a() {
      return this.c;
   }

   public Collection<ah> b() {
      return this.b.values();
   }
}
