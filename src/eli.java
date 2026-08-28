import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eli extends eln {
   public static final MapCodec<eli> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eli::new, $$0 -> $$0.d);
   private static final jm b = jm.d;
   private static final jm[] c = jm.c.a.a().filter($$0 -> $$0 != b.g()).toArray(jm[]::new);
   private final float d;

   public eli(float $$0) {
      this.d = $$0;
   }

   @Override
   protected elo<?> a() {
      return elo.f;
   }

   @Override
   public void a(eln.a $$0) {
      bac $$1 = $$0.b();
      if (!($$1.i() >= this.d)) {
         List<jh> $$2 = $$0.d();
         List<jh> $$3 = $$0.c();
         int $$4 = !$$2.isEmpty() ? Math.max($$2.get(0).v() - 1, $$3.get(0).v() + 1) : Math.min($$3.get(0).v() + 1 + $$1.a(3), $$3.get($$3.size() - 1).v());
         List<jh> $$5 = $$3.stream().filter($$1x -> $$1x.v() == $$4).flatMap($$0x -> Stream.of(c).map($$0x::a)).collect(Collectors.toList());
         if (!$$5.isEmpty()) {
            ae.c($$5, $$1);
            Optional<jh> $$6 = $$5.stream().filter($$1x -> $$0.a($$1x) && $$0.a($$1x.a(b))).findFirst();
            if (!$$6.isEmpty()) {
               $$0.a($$6.get(), dkf.pG.m().b(djx.b, b));
               $$0.a().a($$6.get(), dus.I).ifPresent($$1x -> {
                  int $$2x = 2 + $$1.a(2);

                  for (int $$3x = 0; $$3x < $$2x; $$3x++) {
                     $$1x.a(dun.c.a($$1.a(599)));
                  }
               });
            }
         }
      }
   }
}
