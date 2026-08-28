import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class ddl implements crc.a<je<cyu>>, Predicate<cyy> {
   public static final yw<wj, ddl> a = yu.c(mg.K).a(ddl::new, $$0 -> $$0.e);
   public static final yw<wj, Optional<ddl>> b = yu.c(mg.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new ddl((ji<cyu>)$$0)), $$0 -> $$0.<ji.a<cyu>>map($$0x -> $$0x.e).orElse(ji.a()));
   public static final Codec<ji<cyu>> c = ala.a(mg.K, cyu.e, false);
   public static final Codec<ddl> d = ayu.c(c).xmap(ddl::new, $$0 -> $$0.e);
   private final ji<cyu> e;

   private ddl(ji<cyu> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(czc.a.e())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<ddl> $$0, cyy $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   @Deprecated
   public Stream<je<cyu>> a() {
      return this.e.a();
   }

   public boolean b() {
      return this.e.b() == 0;
   }

   public boolean a(cyy $$0) {
      return $$0.a(this.e);
   }

   public boolean a(je<cyu> $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof ddl $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static ddl a(diu $$0) {
      return new ddl(ji.a($$0.h().e()));
   }

   public static ddl a(diu... $$0) {
      return a(Arrays.stream($$0));
   }

   public static ddl a(Stream<? extends diu> $$0) {
      return new ddl(ji.a($$0.map($$0x -> $$0x.h().e()).toList()));
   }

   public static ddl a(ji<cyu> $$0) {
      return new ddl($$0);
   }

   public dfb c() {
      return (dfb)this.e.d().map(dfb.h::new, $$0 -> new dfb.b($$0.stream().map(ddl::b).toList()));
   }

   public static dfb a(Optional<ddl> $$0) {
      return $$0.<dfb>map(ddl::c).orElse(dfb.c.c);
   }

   private static dfb b(je<cyu> $$0) {
      dfb $$1 = new dfb.d($$0);
      cyy $$2 = $$0.a().i();
      if (!$$2.f()) {
         dfb $$3 = new dfb.f($$2);
         return new dfb.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
