import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dyl extends dyo {
   public static final Codec<dyl> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dyl::new, $$0 -> $$0.d).codec();
   private static final ie b = ie.d;
   private static final ie[] c = ie.c.a.a().filter($$0 -> $$0 != b.g()).toArray(ie[]::new);
   private final float d;

   public dyl(float $$0) {
      this.d = $$0;
   }

   @Override
   protected dyp<?> a() {
      return dyp.d;
   }

   @Override
   public void a(dyo.a $$0) {
      awo $$1 = $$0.b();
      if (!($$1.i() >= this.d)) {
         List<hz> $$2 = $$0.d();
         List<hz> $$3 = $$0.c();
         int $$4 = !$$2.isEmpty() ? Math.max($$2.get(0).v() - 1, $$3.get(0).v() + 1) : Math.min($$3.get(0).v() + 1 + $$1.a(3), $$3.get($$3.size() - 1).v());
         List<hz> $$5 = $$3.stream().filter($$1x -> $$1x.v() == $$4).flatMap($$0x -> Stream.of(c).map($$0x::a)).collect(Collectors.toList());
         if (!$$5.isEmpty()) {
            Collections.shuffle($$5);
            Optional<hz> $$6 = $$5.stream().filter($$1x -> $$0.a($$1x) && $$0.a($$1x.a(b))).findFirst();
            if (!$$6.isEmpty()) {
               $$0.a($$6.get(), cyq.pe.o().a(cyi.b, b));
               $$0.a().a($$6.get(), div.H).ifPresent($$1x -> {
                  int $$2x = 2 + $$1.a(2);

                  for (int $$3x = 0; $$3x < $$2x; $$3x++) {
                     sw $$4x = new sw();
                     $$4x.a("id", kf.g.b(bnu.i).toString());
                     $$1x.a($$4x, $$1.a(599), false);
                  }
               });
            }
         }
      }
   }
}
