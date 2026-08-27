import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ecx extends eda {
   public static final Codec<ecx> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ecx::new, $$0 -> $$0.d).codec();
   private static final ij b = ij.d;
   private static final ij[] c = ij.c.a.a().filter($$0 -> $$0 != b.g()).toArray(ij[]::new);
   private final float d;

   public ecx(float $$0) {
      this.d = $$0;
   }

   @Override
   protected edb<?> a() {
      return edb.d;
   }

   @Override
   public void a(eda.a $$0) {
      axt $$1 = $$0.b();
      if (!($$1.i() >= this.d)) {
         List<id> $$2 = $$0.d();
         List<id> $$3 = $$0.c();
         int $$4 = !$$2.isEmpty() ? Math.max($$2.get(0).v() - 1, $$3.get(0).v() + 1) : Math.min($$3.get(0).v() + 1 + $$1.a(3), $$3.get($$3.size() - 1).v());
         List<id> $$5 = $$3.stream().filter($$1x -> $$1x.v() == $$4).flatMap($$0x -> Stream.of(c).map($$0x::a)).collect(Collectors.toList());
         if (!$$5.isEmpty()) {
            Collections.shuffle($$5);
            Optional<id> $$6 = $$5.stream().filter($$1x -> $$0.a($$1x) && $$0.a($$1x.a(b))).findFirst();
            if (!$$6.isEmpty()) {
               $$0.a($$6.get(), dcj.pe.n().a(dcb.b, b));
               $$0.a().a($$6.get(), dmq.H).ifPresent($$1x -> {
                  int $$2x = 2 + $$1.a(2);

                  for (int $$3x = 0; $$3x < $$2x; $$3x++) {
                     $$1x.a(dml.c.a($$1.a(599)));
                  }
               });
            }
         }
      }
   }
}
