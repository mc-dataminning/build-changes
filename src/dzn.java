import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dzn extends dzq {
   public static final Codec<dzn> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dzn::new, $$0 -> $$0.d).codec();
   private static final ih b = ih.d;
   private static final ih[] c = ih.c.a.a().filter($$0 -> $$0 != b.g()).toArray(ih[]::new);
   private final float d;

   public dzn(float $$0) {
      this.d = $$0;
   }

   @Override
   protected dzr<?> a() {
      return dzr.d;
   }

   @Override
   public void a(dzq.a $$0) {
      awt $$1 = $$0.b();
      if (!($$1.i() >= this.d)) {
         List<ib> $$2 = $$0.d();
         List<ib> $$3 = $$0.c();
         int $$4 = !$$2.isEmpty() ? Math.max($$2.get(0).v() - 1, $$3.get(0).v() + 1) : Math.min($$3.get(0).v() + 1 + $$1.a(3), $$3.get($$3.size() - 1).v());
         List<ib> $$5 = $$3.stream().filter($$1x -> $$1x.v() == $$4).flatMap($$0x -> Stream.of(c).map($$0x::a)).collect(Collectors.toList());
         if (!$$5.isEmpty()) {
            Collections.shuffle($$5);
            Optional<ib> $$6 = $$5.stream().filter($$1x -> $$0.a($$1x) && $$0.a($$1x.a(b))).findFirst();
            if (!$$6.isEmpty()) {
               $$0.a($$6.get(), czh.pe.o().a(cyz.b, b));
               $$0.a().a($$6.get(), djn.H).ifPresent($$1x -> {
                  int $$2x = 2 + $$1.a(2);

                  for (int $$3x = 0; $$3x < $$2x; $$3x++) {
                     sy $$4x = new sy();
                     $$4x.a("id", kh.g.b(bol.i).toString());
                     $$1x.a($$4x, $$1.a(599), false);
                  }
               });
            }
         }
      }
   }
}
