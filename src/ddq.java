import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class ddq implements crh.a<je<cyz>>, Predicate<czd> {
   public static final yw<wj, ddq> a = yu.c(mg.K).a(ddq::new, $$0 -> $$0.e);
   public static final yw<wj, Optional<ddq>> b = yu.c(mg.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new ddq((ji<cyz>)$$0)), $$0 -> $$0.<ji.a<cyz>>map($$0x -> $$0x.e).orElse(ji.a()));
   public static final Codec<ji<cyz>> c = ala.a(mg.K, cyz.e, false);
   public static final Codec<ddq> d = ayu.c(c).xmap(ddq::new, $$0 -> $$0.e);
   private final ji<cyz> e;

   private ddq(ji<cyz> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(czh.a.e())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<ddq> $$0, czd $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   @Deprecated
   public Stream<je<cyz>> a() {
      return this.e.a();
   }

   public boolean b() {
      return this.e.b() == 0;
   }

   public boolean a(czd $$0) {
      return $$0.a(this.e);
   }

   public boolean a(je<cyz> $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof ddq $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static ddq a(diz $$0) {
      return new ddq(ji.a($$0.h().e()));
   }

   public static ddq a(diz... $$0) {
      return a(Arrays.stream($$0));
   }

   public static ddq a(Stream<? extends diz> $$0) {
      return new ddq(ji.a($$0.map($$0x -> $$0x.h().e()).toList()));
   }

   public static ddq a(ji<cyz> $$0) {
      return new ddq($$0);
   }

   public dfg c() {
      return (dfg)this.e.d().map(dfg.h::new, $$0 -> new dfg.b($$0.stream().map(ddq::b).toList()));
   }

   public static dfg a(Optional<ddq> $$0) {
      return $$0.<dfg>map(ddq::c).orElse(dfg.c.c);
   }

   private static dfg b(je<cyz> $$0) {
      dfg $$1 = new dfg.d($$0);
      czd $$2 = $$0.a().i();
      if (!$$2.f()) {
         dfg $$3 = new dfg.f($$2);
         return new dfg.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
