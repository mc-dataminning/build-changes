import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dwm extends dwp {
   public static final Codec<dwm> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dwm::new, $$0 -> $$0.d).codec();
   private static final ic b = ic.d;
   private static final ic[] c = ic.c.a.a().filter($$0 -> $$0 != b.g()).toArray(ic[]::new);
   private final float d;

   public dwm(float $$0) {
      this.d = $$0;
   }

   @Override
   protected dwq<?> a() {
      return dwq.d;
   }

   @Override
   public void a(dwp.a $$0) {
      auu $$1 = $$0.b();
      if (!($$1.i() >= this.d)) {
         List<hx> $$2 = $$0.d();
         List<hx> $$3 = $$0.c();
         int $$4 = !$$2.isEmpty() ? Math.max($$2.get(0).v() - 1, $$3.get(0).v() + 1) : Math.min($$3.get(0).v() + 1 + $$1.a(3), $$3.get($$3.size() - 1).v());
         List<hx> $$5 = $$3.stream().filter($$1x -> $$1x.v() == $$4).flatMap($$0x -> Stream.of(c).map($$0x::a)).collect(Collectors.toList());
         if (!$$5.isEmpty()) {
            Collections.shuffle($$5);
            Optional<hx> $$6 = $$5.stream().filter($$1x -> $$0.a($$1x) && $$0.a($$1x.a(b))).findFirst();
            if (!$$6.isEmpty()) {
               $$0.a($$6.get(), cwr.pe.o().a(cwj.b, b));
               $$0.a().a($$6.get(), dgw.H).ifPresent($$1x -> {
                  int $$2x = 2 + $$1.a(2);

                  for (int $$3x = 0; $$3x < $$2x; $$3x++) {
                     sn $$4x = new sn();
                     $$4x.a("id", kd.g.b(bly.h).toString());
                     $$1x.a($$4x, $$1.a(599), false);
                  }
               });
            }
         }
      }
   }
}
