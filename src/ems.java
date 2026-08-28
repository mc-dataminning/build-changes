import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ems {
   Codec<ems> b = lv.ah.q().dispatch(ems::b, Function.identity());

   void a(azn var1, BiConsumer<ald<emq>, ald<emq>> var2);

   Stream<ald<emq>> a();

   static emr a(String $$0, String $$1) {
      return a(rb.a($$0), rb.a($$1));
   }

   static emr a(ald<emq> $$0, ald<emq> $$1) {
      return new emr($$0, $$1);
   }

   static emv a(String $$0, bqc<String> $$1) {
      bqc.a<ald<emq>> $$2 = bqc.a();
      $$1.e().forEach($$1x -> $$2.a(rb.a((String)$$1x.b()), $$1x.a().a()));
      return a(rb.a($$0), $$2.a());
   }

   static emv a(ald<emq> $$0, bqc<ald<emq>> $$1) {
      return new emv($$0, $$1);
   }

   static emw a(bqc<List<ems>> $$0) {
      return new emw($$0);
   }

   MapCodec<? extends ems> b();
}
