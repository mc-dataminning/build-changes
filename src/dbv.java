import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class dbv implements Predicate<cxk> {
   public static final zt<xg, dbv> a = zr.c(mb.K).a(dbv::new, $$0 -> $$0.e);
   public static final zt<xg, Optional<dbv>> b = zr.c(mb.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dbv((ju<cxg>)$$0)), $$0 -> $$0.<ju.a<cxg>>map($$0x -> $$0x.e).orElse(ju.a()));
   public static final Codec<ju<cxg>> c = alt.a(mb.K, cxk.a, false);
   public static final Codec<dbv> d = azn.b(c).xmap(dbv::new, $$0 -> $$0.e);
   private final ju<cxg> e;
   @Nullable
   private List<jq<cxg>> f;

   private dbv(ju<cxg> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cxo.a.f())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<dbv> $$0, cxk $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   public List<jq<cxg>> a() {
      if (this.f == null) {
         this.f = ImmutableList.copyOf(this.e);
      }

      return this.f;
   }

   public boolean a(cxk $$0) {
      List<jq<cxg>> $$1 = this.a();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$0.a($$1.get($$2))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof dbv $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static dbv a(dgz $$0) {
      return new dbv(ju.a($$0.j().f()));
   }

   public static dbv a(dgz... $$0) {
      return a(Arrays.stream($$0));
   }

   public static dbv a(Stream<? extends dgz> $$0) {
      return new dbv(ju.a($$0.map($$0x -> $$0x.j().f()).toList()));
   }

   public static dbv a(ju<cxg> $$0) {
      return new dbv($$0);
   }

   public ddi b() {
      return (ddi)this.e.d().map(ddi.i::new, $$0 -> new ddi.b($$0.stream().map(ddi.d::new).collect(Collectors.toUnmodifiableList())));
   }
}
