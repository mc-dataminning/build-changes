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

public class dhm {
   private static final Logger c = LogUtils.getLogger();
   public static final dhm a = new dhm(jv.a(), List.of());
   public static final MapCodec<dhm> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eex.c.promotePartial(af.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               emr.d.promotePartial(af.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dhm::new)
   );
   private final jv<eex<?>> d;
   private final List<jv<emr>> e;
   private final Supplier<List<efl<?, ?>>> f;
   private final Supplier<Set<emr>> g;

   dhm(jv<eex<?>> $$0, List<jv<emr>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jv::a).map(jr::a).flatMap(emr::a).filter($$0xx -> $$0xx.b() == efz.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jv::a).map(jr::a).collect(Collectors.toSet()));
   }

   public Iterable<jr<eex<?>>> a() {
      return this.d;
   }

   public List<efl<?, ?>> b() {
      return this.f.get();
   }

   public List<jv<emr>> c() {
      return this.e;
   }

   public boolean a(emr $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dhm.b {
      private final js<emr> a;
      private final js<eex<?>> b;

      public a(js<emr> $$0, js<eex<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dhm.a a(ecp.a $$0, aku<emr> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dhm.a a(aku<eex<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jr<eex<?>>> a = new ArrayList<>();
      private final List<List<jr<emr>>> b = new ArrayList<>();

      public dhm.b a(ecp.a $$0, jr<emr> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dhm.b a(int $$0, jr<emr> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dhm.b a(jr<eex<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dhm a() {
         return new dhm(jv.a(this.a), this.b.stream().map(jv::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
