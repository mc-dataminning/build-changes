import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dsp extends dss {
   public static final Codec<dsp> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dsp::new, $$0 -> $$0.d).codec();
   private static final ha b = ha.d;
   private static final ha[] c = ha.c.a.a().filter($$0 -> $$0 != b.g()).toArray(ha[]::new);
   private final float d;

   public dsp(float $$0) {
      this.d = $$0;
   }

   @Override
   protected dst<?> a() {
      return dst.d;
   }

   @Override
   public void a(dss.a $$0) {
      asc $$1 = $$0.b();
      if (!($$1.i() >= this.d)) {
         List<gw> $$2 = $$0.d();
         List<gw> $$3 = $$0.c();
         int $$4 = !$$2.isEmpty() ? Math.max($$2.get(0).v() - 1, $$3.get(0).v() + 1) : Math.min($$3.get(0).v() + 1 + $$1.a(3), $$3.get($$3.size() - 1).v());
         List<gw> $$5 = $$3.stream().filter($$1x -> $$1x.v() == $$4).flatMap($$0x -> Stream.of(c).map($$0x::a)).collect(Collectors.toList());
         if (!$$5.isEmpty()) {
            Collections.shuffle($$5);
            Optional<gw> $$6 = $$5.stream().filter($$1x -> $$0.a($$1x) && $$0.a($$1x.a(b))).findFirst();
            if (!$$6.isEmpty()) {
               $$0.a($$6.get(), csw.pe.n().a(csp.a, b));
               $$0.a().a($$6.get(), dcx.H).ifPresent($$1x -> {
                  int $$2x = 2 + $$1.a(2);

                  for (int $$3x = 0; $$3x < $$2x; $$3x++) {
                     qw $$4x = new qw();
                     $$4x.a("id", jb.h.b(biu.h).toString());
                     $$1x.a($$4x, $$1.a(599), false);
                  }
               });
            }
         }
      }
   }
}
