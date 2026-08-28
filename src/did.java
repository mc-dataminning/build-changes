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

public class did {
   private static final Logger c = LogUtils.getLogger();
   public static final did a = new did(jv.a(), List.of());
   public static final MapCodec<did> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               efs.c.promotePartial(af.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               enn.d.promotePartial(af.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, did::new)
   );
   private final jv<efs<?>> d;
   private final List<jv<enn>> e;
   private final Supplier<List<egg<?, ?>>> f;
   private final Supplier<Set<enn>> g;

   did(jv<efs<?>> $$0, List<jv<enn>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jv::a).map(jr::a).flatMap(enn::a).filter($$0xx -> $$0xx.b() == egu.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jv::a).map(jr::a).collect(Collectors.toSet()));
   }

   public Iterable<jr<efs<?>>> a() {
      return this.d;
   }

   public List<egg<?, ?>> b() {
      return this.f.get();
   }

   public List<jv<enn>> c() {
      return this.e;
   }

   public boolean a(enn $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends did.b {
      private final js<enn> a;
      private final js<efs<?>> b;

      public a(js<enn> $$0, js<efs<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public did.a a(edk.a $$0, akt<enn> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public did.a a(akt<efs<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jr<efs<?>>> a = new ArrayList<>();
      private final List<List<jr<enn>>> b = new ArrayList<>();

      public did.b a(edk.a $$0, jr<enn> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public did.b a(int $$0, jr<enn> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public did.b a(jr<efs<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public did a() {
         return new did(jv.a(this.a), this.b.stream().map(jv::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
