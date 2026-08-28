import java.util.Optional;

public interface dfk extends dep<dfl> {
   @Override
   default dfa<dfk> b() {
      return dfa.g;
   }

   @Override
   dez<? extends dfk> a();

   default boolean a(dfl $$0, djx $$1) {
      return del.a(this.c(), $$0.c()) && this.f().a($$0.d()) && del.a(this.k(), $$0.e());
   }

   Optional<del> c();

   del f();

   Optional<del> k();

   @Override
   default des h() {
      return der.l;
   }
}
