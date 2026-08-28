import java.util.Optional;

public interface ddg extends dcl<ddh> {
   @Override
   default dcw<ddg> b() {
      return dcw.g;
   }

   @Override
   dcv<? extends ddg> a();

   default boolean a(ddh $$0, dhp $$1) {
      return dch.a(this.c(), $$0.c()) && dch.a(this.f(), $$0.d()) && dch.a(this.k(), $$0.e());
   }

   Optional<dch> c();

   Optional<dch> f();

   Optional<dch> k();

   @Override
   default dco h() {
      return dcn.l;
   }
}
