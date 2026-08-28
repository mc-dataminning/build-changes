import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eky {
   Codec<eky> b = lt.ah.r().dispatch(eky::b, Function.identity());

   void a(ayv var1, BiConsumer<akp<ekw>, akp<ekw>> var2);

   Stream<akp<ekw>> a();

   static ekx a(String $$0, String $$1) {
      return a(qw.a($$0), qw.a($$1));
   }

   static ekx a(akp<ekw> $$0, akp<ekw> $$1) {
      return new ekx($$0, $$1);
   }

   static elb a(String $$0, bpa<String> $$1) {
      bpa.a<akp<ekw>> $$2 = bpa.a();
      $$1.e().forEach($$1x -> $$2.a(qw.a((String)$$1x.b()), $$1x.a().a()));
      return a(qw.a($$0), $$2.a());
   }

   static elb a(akp<ekw> $$0, bpa<akp<ekw>> $$1) {
      return new elb($$0, $$1);
   }

   static elc a(bpa<List<eky>> $$0) {
      return new elc($$0);
   }

   MapCodec<? extends eky> b();
}
