import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class dbz implements Predicate<cxo> {
   public static final zt<xg, dbz> a = zr.c(mb.K).a(dbz::new, $$0 -> $$0.e);
   public static final zt<xg, Optional<dbz>> b = zr.c(mb.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dbz((ju<cxk>)$$0)), $$0 -> $$0.<ju.a<cxk>>map($$0x -> $$0x.e).orElse(ju.a()));
   public static final Codec<ju<cxk>> c = alt.a(mb.K, cxo.a, false);
   public static final Codec<dbz> d = azn.b(c).xmap(dbz::new, $$0 -> $$0.e);
   private final ju<cxk> e;
   @Nullable
   private List<jq<cxk>> f;

   private dbz(ju<cxk> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cxs.a.f())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<dbz> $$0, cxo $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   public List<jq<cxk>> a() {
      if (this.f == null) {
         this.f = ImmutableList.copyOf(this.e);
      }

      return this.f;
   }

   public boolean a(cxo $$0) {
      List<jq<cxk>> $$1 = this.a();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$0.a($$1.get($$2))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof dbz $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static dbz a(dhg $$0) {
      return new dbz(ju.a($$0.j().f()));
   }

   public static dbz a(dhg... $$0) {
      return a(Arrays.stream($$0));
   }

   public static dbz a(Stream<? extends dhg> $$0) {
      return new dbz(ju.a($$0.map($$0x -> $$0x.j().f()).toList()));
   }

   public static dbz a(ju<cxk> $$0) {
      return new dbz($$0);
   }

   public ddo b() {
      return (ddo)this.e.d().map(ddo.h::new, $$0 -> new ddo.b($$0.stream().map(dbz::a).toList()));
   }

   public static ddo a(Optional<dbz> $$0) {
      return $$0.<ddo>map(dbz::b).orElse(ddo.c.c);
   }

   private static ddo a(jq<cxk> $$0) {
      ddo $$1 = new ddo.d($$0);
      cxo $$2 = $$0.a().k();
      if (!$$2.f()) {
         ddo $$3 = new ddo.f($$2);
         return new ddo.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
