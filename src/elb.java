import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface elb {
   Codec<elb> b = lt.ah.r().dispatch(elb::b, Function.identity());

   void a(ayw var1, BiConsumer<akq<ekz>, akq<ekz>> var2);

   Stream<akq<ekz>> a();

   static ela a(String $$0, String $$1) {
      return a(qx.a($$0), qx.a($$1));
   }

   static ela a(akq<ekz> $$0, akq<ekz> $$1) {
      return new ela($$0, $$1);
   }

   static ele a(String $$0, bpb<String> $$1) {
      bpb.a<akq<ekz>> $$2 = bpb.a();
      $$1.e().forEach($$1x -> $$2.a(qx.a((String)$$1x.b()), $$1x.a().a()));
      return a(qx.a($$0), $$2.a());
   }

   static ele a(akq<ekz> $$0, bpb<akq<ekz>> $$1) {
      return new ele($$0, $$1);
   }

   static elf a(bpb<List<elb>> $$0) {
      return new elf($$0);
   }

   MapCodec<? extends elb> b();
}
