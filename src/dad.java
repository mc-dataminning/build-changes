import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class dad implements Predicate<cvp> {
   public static final zb<wo, dad> a = yz.c(lv.K).a(dad::new, $$0 -> $$0.e);
   public static final zb<wo, Optional<dad>> b = yz.c(lv.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dad((jr<cvk>)$$0)), $$0 -> $$0.<jr.a<cvk>>map($$0x -> $$0x.e).orElse(jr.a()));
   public static final Codec<jr<cvk>> c = akw.a(lv.K, cvp.a, false);
   public static final Codec<dad> d = aym.b(c).xmap(dad::new, $$0 -> $$0.e);
   private final jr<cvk> e;
   @Nullable
   private List<jn<cvk>> f;

   private dad(jr<cvk> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cvt.a.n())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<dad> $$0, cvp $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   public List<jn<cvk>> a() {
      if (this.f == null) {
         this.f = ImmutableList.copyOf(this.e);
      }

      return this.f;
   }

   public boolean a(cvp $$0) {
      List<jn<cvk>> $$1 = this.a();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$0.a($$1.get($$2))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof dad $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static dad a(def $$0) {
      return new dad(jr.a($$0.q().n()));
   }

   public static dad a(def... $$0) {
      return a(Arrays.stream($$0));
   }

   public static dad a(Stream<? extends def> $$0) {
      return new dad(jr.a($$0.map($$0x -> $$0x.q().n()).toList()));
   }

   public static dad a(jr<cvk> $$0) {
      return new dad($$0);
   }
}
