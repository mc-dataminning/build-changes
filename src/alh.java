import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class alh extends aut<ah> {
   private static final Logger a = LogUtils.getLogger();
   private Map<aku, ai> b = Map.of();
   private an c = new an();
   private final jt.a d;

   public alh(jt.a $$0) {
      super($$0, ah.a, mc.bl);
      this.d = $$0;
   }

   protected void a(Map<aku, ah> $$0, aup $$1, bpj $$2) {
      Builder<aku, ai> $$3 = ImmutableMap.builder();
      $$0.forEach(($$1x, $$2x) -> {
         this.a($$1x, $$2x);
         $$3.put($$1x, new ai($$1x, $$2x));
      });
      this.b = $$3.buildOrThrow();
      an $$4 = new an();
      $$4.a(this.b.values());

      for (aj $$5 : $$4.b()) {
         if ($$5.b().b().c().isPresent()) {
            av.a($$5);
         }
      }

      this.c = $$4;
   }

   private void a(aku $$0, ah $$1) {
      azf.a $$2 = new azf.a();
      $$1.a($$2, this.d);
      $$2.b().ifPresent($$1x -> a.warn("Found validation problems in advancement {}: \n{}", $$0, $$1x));
   }

   @Nullable
   public ai a(aku $$0) {
      return this.b.get($$0);
   }

   public an a() {
      return this.c;
   }

   public Collection<ai> b() {
      return this.b.values();
   }
}
