import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dut extends duw {
   public static final Codec<dut> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dut::new, $$0 -> $$0.d).codec();
   private static final ib b = ib.d;
   private static final ib[] c = ib.c.a.a().filter($$0 -> $$0 != b.g()).toArray(ib[]::new);
   private final float d;

   public dut(float $$0) {
      this.d = $$0;
   }

   @Override
   protected dux<?> a() {
      return dux.d;
   }

   @Override
   public void a(duw.a $$0) {
      atw $$1 = $$0.b();
      if (!($$1.i() >= this.d)) {
         List<hx> $$2 = $$0.d();
         List<hx> $$3 = $$0.c();
         int $$4 = !$$2.isEmpty() ? Math.max($$2.get(0).v() - 1, $$3.get(0).v() + 1) : Math.min($$3.get(0).v() + 1 + $$1.a(3), $$3.get($$3.size() - 1).v());
         List<hx> $$5 = $$3.stream().filter($$1x -> $$1x.v() == $$4).flatMap($$0x -> Stream.of(c).map($$0x::a)).collect(Collectors.toList());
         if (!$$5.isEmpty()) {
            Collections.shuffle($$5);
            Optional<hx> $$6 = $$5.stream().filter($$1x -> $$0.a($$1x) && $$0.a($$1x.a(b))).findFirst();
            if (!$$6.isEmpty()) {
               $$0.a($$6.get(), cvh.pe.o().a(cuz.b, b));
               $$0.a().a($$6.get(), dfk.H).ifPresent($$1x -> {
                  int $$2x = 2 + $$1.a(2);

                  for (int $$3x = 0; $$3x < $$2x; $$3x++) {
                     sd $$4x = new sd();
                     $$4x.a("id", kc.h.b(bkz.h).toString());
                     $$1x.a($$4x, $$1.a(599), false);
                  }
               });
            }
         }
      }
   }
}
