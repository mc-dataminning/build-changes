import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class amc extends avp<ag> {
   private static final Logger a = LogUtils.getLogger();
   private Map<alp, ah> b = Map.of();
   private am c = new am();
   private final js.a d;

   public amc(js.a $$0) {
      super($$0, ag.a, mb.c(mb.bj));
      this.d = $$0;
   }

   protected void a(Map<alp, ag> $$0, avl $$1, bpj $$2) {
      Builder<alp, ah> $$3 = ImmutableMap.builder();
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

   private void a(alp $$0, ag $$1) {
      baa.a $$2 = new baa.a();
      $$1.a($$2, this.d);
      $$2.b().ifPresent($$1x -> a.warn("Found validation problems in advancement {}: \n{}", $$0, $$1x));
   }

   @Nullable
   public ah a(alp $$0) {
      return this.b.get($$0);
   }

   public am a() {
      return this.c;
   }

   public Collection<ah> b() {
      return this.b.values();
   }
}
