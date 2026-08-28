import java.util.Optional;

public record agh(xc b, Optional<kb> c) implements zj<aby> {
   public static final za<wn, agh> a = za.a(xe.b, agh::b, yy.a(kb.h), agh::e, agh::new);

   @Override
   public zl<agh> a() {
      return agr.be;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public Optional<kb> e() {
      return this.c;
   }
}
