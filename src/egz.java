import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class egz extends ehc {
   public static final Codec<egz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.d),
               Codec.BOOL.fieldOf("fixed_height").orElse(true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, egz::new)
   );
   private static final iw b = iw.d;
   private static final iw[] c = iw.c.a.a().filter($$0 -> $$0 != b.g()).toArray(iw[]::new);
   private final float d;
   private final boolean e;

   public egz(float $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   protected ehd<?> a() {
      return ehd.d;
   }

   @Override
   public void a(ehc.a $$0) {
      ayt $$1 = $$0.b();
      if (!($$1.i() >= this.d)) {
         List<ir> $$2 = $$0.d();
         List<ir> $$3 = $$0.c();
         if (!$$3.isEmpty()) {
            int $$4;
            if (this.e) {
               $$4 = !$$2.isEmpty() ? Math.max($$2.get(0).v() - 1, $$3.get(0).v() + 1) : Math.min($$3.get(0).v() + 1 + $$1.a(3), $$3.get($$3.size() - 1).v());
            } else {
               $$4 = $$1.a($$3.get(0).v() + 1, $$3.get($$3.size() - 1).v() - 1);
            }

            List<ir> $$6 = $$3.stream().filter($$1x -> $$1x.v() == $$4).flatMap($$0x -> Stream.of(c).map($$0x::a)).collect(Collectors.toList());
            if (!$$6.isEmpty()) {
               Collections.shuffle($$6);
               Optional<ir> $$7 = $$6.stream().filter($$1x -> $$0.a($$1x) && $$0.a($$1x.a(b))).findFirst();
               if (!$$7.isEmpty()) {
                  $$0.a($$7.get(), dfe.qp.n().a(dev.b, b));
                  $$0.a().a($$7.get(), dqe.I).ifPresent($$1x -> {
                     int $$2x = 2 + $$1.a(2);

                     for (int $$3x = 0; $$3x < $$2x; $$3x++) {
                        $$1x.a(dpy.c.a($$1.a(599)));
                     }
                  });
               }
            }
         }
      }
   }
}
