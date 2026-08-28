import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class enm extends ens {
   public static final MapCodec<enm> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(enm::new, $$0 -> $$0.d);
   private static final ja b = ja.d;
   private static final ja[] c = ja.c.a.a().filter($$0 -> $$0 != b.g()).toArray(ja[]::new);
   private final float d;

   public enm(float $$0) {
      this.d = $$0;
   }

   @Override
   protected ent<?> a() {
      return ent.f;
   }

   @Override
   public void a(ens.a $$0) {
      List<iu> $$1 = $$0.d();
      List<iu> $$2 = $$0.c();
      if (!$$2.isEmpty()) {
         azt $$3 = $$0.b();
         if (!($$3.i() >= this.d)) {
            int $$4 = !$$1.isEmpty()
               ? Math.max($$1.getFirst().v() - 1, $$2.getFirst().v() + 1)
               : Math.min($$2.getFirst().v() + 1 + $$3.a(3), $$2.getLast().v());
            List<iu> $$5 = $$2.stream().filter($$1x -> $$1x.v() == $$4).flatMap($$0x -> Stream.of(c).map($$0x::a)).collect(Collectors.toList());
            if (!$$5.isEmpty()) {
               af.c($$5, $$3);
               Optional<iu> $$6 = $$5.stream().filter($$1x -> $$0.a($$1x) && $$0.a($$1x.a(b))).findFirst();
               if (!$$6.isEmpty()) {
                  $$0.a($$6.get(), dlw.pI.m().b(dlo.b, b));
                  $$0.a().a($$6.get(), dwp.I).ifPresent($$1x -> {
                     int $$2x = 2 + $$3.a(2);

                     for (int $$3x = 0; $$3x < $$2x; $$3x++) {
                        $$1x.a(dwk.c.a($$3.a(599)));
                     }
                  });
               }
            }
         }
      }
   }
}
