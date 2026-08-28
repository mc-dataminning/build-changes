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

public class dfl {
   private static final Logger c = LogUtils.getLogger();
   public static final dfl a = new dfl(js.a(), List.of());
   public static final MapCodec<dfl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ecs.c.promotePartial(ad.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               ekk.d.promotePartial(ad.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dfl::new)
   );
   private final js<ecs<?>> d;
   private final List<js<ekk>> e;
   private final Supplier<List<edg<?, ?>>> f;
   private final Supplier<Set<ekk>> g;

   dfl(js<ecs<?>> $$0, List<js<ekk>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(js::a).map(jo::a).flatMap(ekk::a).filter($$0xx -> $$0xx.b() == edu.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(js::a).map(jo::a).collect(Collectors.toSet()));
   }

   public Iterable<jo<ecs<?>>> a() {
      return this.d;
   }

   public List<edg<?, ?>> b() {
      return this.f.get();
   }

   public List<js<ekk>> c() {
      return this.e;
   }

   public boolean a(ekk $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dfl.b {
      private final jp<ekk> a;
      private final jp<ecs<?>> b;

      public a(jp<ekk> $$0, jp<ecs<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dfl.a a(eak.a $$0, ald<ekk> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dfl.a a(ald<ecs<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jo<ecs<?>>> a = new ArrayList<>();
      private final List<List<jo<ekk>>> b = new ArrayList<>();

      public dfl.b a(eak.a $$0, jo<ekk> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dfl.b a(int $$0, jo<ekk> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dfl.b a(jo<ecs<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dfl a() {
         return new dfl(js.a(this.a), this.b.stream().map(js::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
