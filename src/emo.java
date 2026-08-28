import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface emo {
   Codec<emo> b = lu.ah.q().dispatch(emo::b, Function.identity());

   void a(azl var1, BiConsumer<alb<emm>, alb<emm>> var2);

   Stream<alb<emm>> a();

   static emn a(String $$0, String $$1) {
      return a(ra.a($$0), ra.a($$1));
   }

   static emn a(alb<emm> $$0, alb<emm> $$1) {
      return new emn($$0, $$1);
   }

   static emr a(String $$0, bpz<String> $$1) {
      bpz.a<alb<emm>> $$2 = bpz.a();
      $$1.e().forEach($$1x -> $$2.a(ra.a((String)$$1x.b()), $$1x.a().a()));
      return a(ra.a($$0), $$2.a());
   }

   static emr a(alb<emm> $$0, bpz<alb<emm>> $$1) {
      return new emr($$0, $$1);
   }

   static ems a(bpz<List<emo>> $$0) {
      return new ems($$0);
   }

   MapCodec<? extends emo> b();
}
