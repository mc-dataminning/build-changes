import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ere extends epg {
   public static final MapCodec<ere> d = a(ere::new);

   public ere(epg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<epg.b> a(epg.a $$0) {
      drm $$1 = drm.a($$0.f());
      jj $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new epg.b($$2, (Consumer<epy>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(epy $$0, jj $$1, drm $$2, epg.a $$3) {
      List<epk> $$4 = Lists.newArrayList();
      erd.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public epp<?> e() {
      return epp.c;
   }
}
