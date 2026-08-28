import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class dgd {
   private static final Logger c = LogUtils.getLogger();
   public static final dgd a = new dgd(ju.a(), List.of());
   public static final MapCodec<dgd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               edj.c.promotePartial(ae.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               elb.d.promotePartial(ae.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dgd::new)
   );
   private final ju<edj<?>> d;
   private final List<ju<elb>> e;
   private final Supplier<List<edx<?, ?>>> f;
   private final Supplier<Set<elb>> g;

   dgd(ju<edj<?>> $$0, List<ju<elb>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ju::a).map(jq::a).flatMap(elb::a).filter($$0xx -> $$0xx.b() == eel.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ju::a).map(jq::a).collect(Collectors.toSet()));
   }

   public Iterable<jq<edj<?>>> a() {
      return this.d;
   }

   public List<edx<?, ?>> b() {
      return this.f.get();
   }

   public List<ju<elb>> c() {
      return this.e;
   }

   public boolean a(elb $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dgd.b {
      private final jr<elb> a;
      private final jr<edj<?>> b;

      public a(jr<elb> $$0, jr<edj<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dgd.a a(ebb.a $$0, alh<elb> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dgd.a a(alh<edj<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jq<edj<?>>> a = new ArrayList<>();
      private final List<List<jq<elb>>> b = new ArrayList<>();

      public dgd.b a(ebb.a $$0, jq<elb> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dgd.b a(int $$0, jq<elb> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dgd.b a(jq<edj<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dgd a() {
         return new dgd(ju.a(this.a), this.b.stream().map(ju::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
