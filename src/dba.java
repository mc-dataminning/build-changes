import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class dba implements Predicate<cwp> {
   public static final ym<vz, dba> a = yk.c(mc.K).a(dba::new, $$0 -> $$0.e);
   public static final ym<vz, Optional<dba>> b = yk.c(mc.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dba((jv<cwl>)$$0)), $$0 -> $$0.<jv.a<cwl>>map($$0x -> $$0x.e).orElse(jv.a()));
   public static final Codec<jv<cwl>> c = ako.a(mc.K, cwl.e, false);
   public static final Codec<dba> d = ayi.c(c).xmap(dba::new, $$0 -> $$0.e);
   private final jv<cwl> e;
   @Nullable
   private List<jr<cwl>> f;

   private dba(jv<cwl> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cwt.a.f())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<dba> $$0, cwp $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   public List<jr<cwl>> a() {
      if (this.f == null) {
         this.f = ImmutableList.copyOf(this.e);
      }

      return this.f;
   }

   public boolean a(cwp $$0) {
      List<jr<cwl>> $$1 = this.a();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$0.a($$1.get($$2))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof dba $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static dba a(dgh $$0) {
      return new dba(jv.a($$0.j().f()));
   }

   public static dba a(dgh... $$0) {
      return a(Arrays.stream($$0));
   }

   public static dba a(Stream<? extends dgh> $$0) {
      return new dba(jv.a($$0.map($$0x -> $$0x.j().f()).toList()));
   }

   public static dba a(jv<cwl> $$0) {
      return new dba($$0);
   }

   public dcp b() {
      return (dcp)this.e.d().map(dcp.h::new, $$0 -> new dcp.b($$0.stream().map(dba::a).toList()));
   }

   public static dcp a(Optional<dba> $$0) {
      return $$0.<dcp>map(dba::b).orElse(dcp.c.c);
   }

   private static dcp a(jr<cwl> $$0) {
      dcp $$1 = new dcp.d($$0);
      cwp $$2 = $$0.a().k();
      if (!$$2.f()) {
         dcp $$3 = new dcp.f($$2);
         return new dcp.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
