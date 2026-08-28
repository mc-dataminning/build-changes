import java.util.Set;

public record aen(int b, ezn c, ezn d, float e, float f, Set<bvo> g) implements zp<ace> {
   public static final zg<wf, aen> a = zg.a(ze.h, aen::b, ezn.b, aen::e, ezn.b, aen::f, ze.j, aen::g, ze.j, aen::h, bvo.m, aen::i, aen::new);

   public static aen a(int $$0, bvn $$1, Set<bvo> $$2) {
      return new aen($$0, $$1.a(), $$1.b(), $$1.c(), $$1.d(), $$2);
   }

   @Override
   public zr<aen> a() {
      return agt.ai;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public ezn e() {
      return this.c;
   }

   public ezn f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }

   public Set<bvo> i() {
      return this.g;
   }
}
