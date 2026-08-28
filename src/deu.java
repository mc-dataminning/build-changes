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

public class deu {
   private static final Logger c = LogUtils.getLogger();
   public static final deu a = new deu(jr.a(), List.of());
   public static final MapCodec<deu> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eca.c.promotePartial(ad.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               ejs.d.promotePartial(ad.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, deu::new)
   );
   private final jr<eca<?>> d;
   private final List<jr<ejs>> e;
   private final Supplier<List<eco<?, ?>>> f;
   private final Supplier<Set<ejs>> g;

   deu(jr<eca<?>> $$0, List<jr<ejs>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jr::a).map(jn::a).flatMap(ejs::a).filter($$0xx -> $$0xx.b() == edc.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jr::a).map(jn::a).collect(Collectors.toSet()));
   }

   public Iterable<jn<eca<?>>> a() {
      return this.d;
   }

   public List<eco<?, ?>> b() {
      return this.f.get();
   }

   public List<jr<ejs>> c() {
      return this.e;
   }

   public boolean a(ejs $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends deu.b {
      private final jo<ejs> a;
      private final jo<eca<?>> b;

      public a(jo<ejs> $$0, jo<eca<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public deu.a a(dzs.a $$0, ala<ejs> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public deu.a a(ala<eca<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jn<eca<?>>> a = new ArrayList<>();
      private final List<List<jn<ejs>>> b = new ArrayList<>();

      public deu.b a(dzs.a $$0, jn<ejs> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public deu.b a(int $$0, jn<ejs> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public deu.b a(jn<eca<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public deu a() {
         return new deu(jr.a(this.a), this.b.stream().map(jr::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
