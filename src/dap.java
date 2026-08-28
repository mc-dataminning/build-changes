import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class dap implements Predicate<cwf> {
   public static final zj<ww, dap> a = zh.c(ma.K).a(dap::new, $$0 -> $$0.e);
   public static final zj<ww, Optional<dap>> b = zh.c(ma.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dap((ju<cwb>)$$0)), $$0 -> $$0.<ju.a<cwb>>map($$0x -> $$0x.e).orElse(ju.a()));
   public static final Codec<ju<cwb>> c = alf.a(ma.K, cwf.a, false);
   public static final Codec<dap> d = ayw.b(c).xmap(dap::new, $$0 -> $$0.e);
   private final ju<cwb> e;
   @Nullable
   private List<jq<cwb>> f;

   private dap(ju<cwb> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cwj.a.f())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<dap> $$0, cwf $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   public List<jq<cwb>> a() {
      if (this.f == null) {
         this.f = ImmutableList.copyOf(this.e);
      }

      return this.f;
   }

   public boolean a(cwf $$0) {
      List<jq<cwb>> $$1 = this.a();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$0.a($$1.get($$2))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof dap $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static dap a(dfe $$0) {
      return new dap(ju.a($$0.j().f()));
   }

   public static dap a(dfe... $$0) {
      return a(Arrays.stream($$0));
   }

   public static dap a(Stream<? extends dfe> $$0) {
      return new dap(ju.a($$0.map($$0x -> $$0x.j().f()).toList()));
   }

   public static dap a(ju<cwb> $$0) {
      return new dap($$0);
   }
}
