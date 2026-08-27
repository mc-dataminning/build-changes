import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dqf extends BiPredicate<cus, hx> {
   Codec<dqf> b = kd.O.q().dispatch(dqf::a, dqg::codec);
   dqf c = a(cxa.a);
   dqf d = a(cxa.a, cxa.G);

   dqg<?> a();

   static dqf a(List<dqf> $$0) {
      return new dqd($$0);
   }

   static dqf a(dqf... $$0) {
      return a(List.of($$0));
   }

   static dqf a(dqf $$0, dqf $$1) {
      return a(List.of($$0, $$1));
   }

   static dqf b(List<dqf> $$0) {
      return new dqe($$0);
   }

   static dqf b(dqf... $$0) {
      return b(List.of($$0));
   }

   static dqf b(dqf $$0, dqf $$1) {
      return b(List.of($$0, $$1));
   }

   static dqf a(jb $$0, List<cwy> $$1) {
      return new dql($$0, il.a(cwy::r, $$1));
   }

   static dqf c(List<cwy> $$0) {
      return a(jb.g, $$0);
   }

   static dqf a(jb $$0, cwy... $$1) {
      return a($$0, List.of($$1));
   }

   static dqf a(cwy... $$0) {
      return a(jb.g, $$0);
   }

   static dqf a(jb $$0, asx<cwy> $$1) {
      return new dqk($$0, $$1);
   }

   static dqf a(asx<cwy> $$0) {
      return a(jb.g, $$0);
   }

   static dqf b(jb $$0, List<eey> $$1) {
      return new dqm($$0, il.a(eey::k, $$1));
   }

   static dqf a(jb $$0, eey... $$1) {
      return b($$0, List.of($$1));
   }

   static dqf a(eey... $$0) {
      return a(jb.g, $$0);
   }

   static dqf a(dqf $$0) {
      return new dqn($$0);
   }

   static dqf a(jb $$0) {
      return new dqo($$0);
   }

   static dqf b() {
      return a(jb.g);
   }

   static dqf a(djp $$0, jb $$1) {
      return new dqs($$1, $$0);
   }

   static dqf a(jb $$0, ic $$1) {
      return new dqi($$0, $$1);
   }

   static dqf a(ic $$0) {
      return a(jb.g, $$0);
   }

   static dqf b(jb $$0) {
      return new dqp($$0);
   }

   static dqf c() {
      return b(jb.g);
   }

   static dqf d() {
      return c(jb.g);
   }

   static dqf c(jb $$0) {
      return a($$0, efa.a);
   }

   static dqf d(jb $$0) {
      return new dqj($$0);
   }

   static dqf e() {
      return dqr.a;
   }
}
