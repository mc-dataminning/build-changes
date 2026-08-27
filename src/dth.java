import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dth extends dtk {
   public static final Codec<dth> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dth::new, $$0 -> $$0.d).codec();
   private static final hx b = hx.d;
   private static final hx[] c = hx.c.a.a().filter($$0 -> $$0 != b.g()).toArray(hx[]::new);
   private final float d;

   public dth(float $$0) {
      this.d = $$0;
   }

   @Override
   protected dtl<?> a() {
      return dtl.d;
   }

   @Override
   public void a(dtk.a $$0) {
      ate $$1 = $$0.b();
      if (!($$1.i() >= this.d)) {
         List<ht> $$2 = $$0.d();
         List<ht> $$3 = $$0.c();
         int $$4 = !$$2.isEmpty() ? Math.max($$2.get(0).v() - 1, $$3.get(0).v() + 1) : Math.min($$3.get(0).v() + 1 + $$1.a(3), $$3.get($$3.size() - 1).v());
         List<ht> $$5 = $$3.stream().filter($$1x -> $$1x.v() == $$4).flatMap($$0x -> Stream.of(c).map($$0x::a)).collect(Collectors.toList());
         if (!$$5.isEmpty()) {
            Collections.shuffle($$5);
            Optional<ht> $$6 = $$5.stream().filter($$1x -> $$0.a($$1x) && $$0.a($$1x.a(b))).findFirst();
            if (!$$6.isEmpty()) {
               $$0.a($$6.get(), cuc.pe.o().a(ctu.b, b));
               $$0.a().a($$6.get(), ddz.H).ifPresent($$1x -> {
                  int $$2x = 2 + $$1.a(2);

                  for (int $$3x = 0; $$3x < $$2x; $$3x++) {
                     rt $$4x = new rt();
                     $$4x.a("id", jy.h.b(bjx.h).toString());
                     $$1x.a($$4x, $$1.a(599), false);
                  }
               });
            }
         }
      }
   }
}
