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

public class dhj {
   private static final Logger c = LogUtils.getLogger();
   public static final dhj a = new dhj(jv.a(), List.of());
   public static final MapCodec<dhj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eeu.c.promotePartial(af.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               emo.d.promotePartial(af.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dhj::new)
   );
   private final jv<eeu<?>> d;
   private final List<jv<emo>> e;
   private final Supplier<List<efi<?, ?>>> f;
   private final Supplier<Set<emo>> g;

   dhj(jv<eeu<?>> $$0, List<jv<emo>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jv::a).map(jr::a).flatMap(emo::a).filter($$0xx -> $$0xx.b() == efw.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jv::a).map(jr::a).collect(Collectors.toSet()));
   }

   public Iterable<jr<eeu<?>>> a() {
      return this.d;
   }

   public List<efi<?, ?>> b() {
      return this.f.get();
   }

   public List<jv<emo>> c() {
      return this.e;
   }

   public boolean a(emo $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dhj.b {
      private final js<emo> a;
      private final js<eeu<?>> b;

      public a(js<emo> $$0, js<eeu<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dhj.a a(ecm.a $$0, akt<emo> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dhj.a a(akt<eeu<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jr<eeu<?>>> a = new ArrayList<>();
      private final List<List<jr<emo>>> b = new ArrayList<>();

      public dhj.b a(ecm.a $$0, jr<emo> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dhj.b a(int $$0, jr<emo> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dhj.b a(jr<eeu<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dhj a() {
         return new dhj(jv.a(this.a), this.b.stream().map(jv::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
