import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class efs extends efv {
   public static final MapCodec<efs> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(efs::new, $$0 -> $$0.d);
   private static final je b = je.d;
   private static final je[] c = je.c.a.a().filter($$0 -> $$0 != b.g()).toArray(je[]::new);
   private final float d;

   public efs(float $$0) {
      this.d = $$0;
   }

   @Override
   protected efw<?> a() {
      return efw.d;
   }

   @Override
   public void a(efv.a $$0) {
      azh $$1 = $$0.b();
      if (!($$1.i() >= this.d)) {
         List<iz> $$2 = $$0.d();
         List<iz> $$3 = $$0.c();
         int $$4 = !$$2.isEmpty() ? Math.max($$2.get(0).v() - 1, $$3.get(0).v() + 1) : Math.min($$3.get(0).v() + 1 + $$1.a(3), $$3.get($$3.size() - 1).v());
         List<iz> $$5 = $$3.stream().filter($$1x -> $$1x.v() == $$4).flatMap($$0x -> Stream.of(c).map($$0x::a)).collect(Collectors.toList());
         if (!$$5.isEmpty()) {
            Collections.shuffle($$5);
            Optional<iz> $$6 = $$5.stream().filter($$1x -> $$0.a($$1x) && $$0.a($$1x.a(b))).findFirst();
            if (!$$6.isEmpty()) {
               $$0.a($$6.get(), dfc.pe.o().a(deu.b, b));
               $$0.a().a($$6.get(), dpk.H).ifPresent($$1x -> {
                  int $$2x = 2 + $$1.a(2);

                  for (int $$3x = 0; $$3x < $$2x; $$3x++) {
                     $$1x.a(dpf.c.a($$1.a(599)));
                  }
               });
            }
         }
      }
   }
}
