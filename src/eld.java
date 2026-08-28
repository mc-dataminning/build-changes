import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eld {
   Codec<eld> b = lt.ah.r().dispatch(eld::b, Function.identity());

   void a(ayw var1, BiConsumer<akq<elb>, akq<elb>> var2);

   Stream<akq<elb>> a();

   static elc a(String $$0, String $$1) {
      return a(qx.a($$0), qx.a($$1));
   }

   static elc a(akq<elb> $$0, akq<elb> $$1) {
      return new elc($$0, $$1);
   }

   static elg a(String $$0, bpb<String> $$1) {
      bpb.a<akq<elb>> $$2 = bpb.a();
      $$1.e().forEach($$1x -> $$2.a(qx.a((String)$$1x.b()), $$1x.a().a()));
      return a(qx.a($$0), $$2.a());
   }

   static elg a(akq<elb> $$0, bpb<akq<elb>> $$1) {
      return new elg($$0, $$1);
   }

   static elh a(bpb<List<eld>> $$0) {
      return new elh($$0);
   }

   MapCodec<? extends eld> b();
}
