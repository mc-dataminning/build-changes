import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class dbb implements cpc.a<jr<cwm>>, Predicate<cwq> {
   public static final yn<wa, dbb> a = yl.c(mc.K).a(dbb::new, $$0 -> $$0.e);
   public static final yn<wa, Optional<dbb>> b = yl.c(mc.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dbb((jv<cwm>)$$0)), $$0 -> $$0.<jv.a<cwm>>map($$0x -> $$0x.e).orElse(jv.a()));
   public static final Codec<jv<cwm>> c = akp.a(mc.K, cwm.e, false);
   public static final Codec<dbb> d = ayi.c(c).xmap(dbb::new, $$0 -> $$0.e);
   private final jv<cwm> e;

   private dbb(jv<cwm> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cwu.a.f())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<dbb> $$0, cwq $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   @Deprecated
   public Stream<jr<cwm>> a() {
      return this.e.a();
   }

   public boolean b() {
      return this.e.b() == 0;
   }

   public boolean a(cwq $$0) {
      return $$0.a(this.e);
   }

   public boolean a(jr<cwm> $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof dbb $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static dbb a(dgi $$0) {
      return new dbb(jv.a($$0.j().f()));
   }

   public static dbb a(dgi... $$0) {
      return a(Arrays.stream($$0));
   }

   public static dbb a(Stream<? extends dgi> $$0) {
      return new dbb(jv.a($$0.map($$0x -> $$0x.j().f()).toList()));
   }

   public static dbb a(jv<cwm> $$0) {
      return new dbb($$0);
   }

   public dcq c() {
      return (dcq)this.e.d().map(dcq.h::new, $$0 -> new dcq.b($$0.stream().map(dbb::b).toList()));
   }

   public static dcq a(Optional<dbb> $$0) {
      return $$0.<dcq>map(dbb::c).orElse(dcq.c.c);
   }

   private static dcq b(jr<cwm> $$0) {
      dcq $$1 = new dcq.d($$0);
      cwq $$2 = $$0.a().k();
      if (!$$2.f()) {
         dcq $$3 = new dcq.f($$2);
         return new dcq.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
