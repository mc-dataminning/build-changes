import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dpx extends BiPredicate<cuk, hx> {
   Codec<dpx> b = kd.O.q().dispatch(dpx::a, dpy::codec);
   dpx c = a(cws.a);
   dpx d = a(cws.a, cws.G);

   dpy<?> a();

   static dpx a(List<dpx> $$0) {
      return new dpv($$0);
   }

   static dpx a(dpx... $$0) {
      return a(List.of($$0));
   }

   static dpx a(dpx $$0, dpx $$1) {
      return a(List.of($$0, $$1));
   }

   static dpx b(List<dpx> $$0) {
      return new dpw($$0);
   }

   static dpx b(dpx... $$0) {
      return b(List.of($$0));
   }

   static dpx b(dpx $$0, dpx $$1) {
      return b(List.of($$0, $$1));
   }

   static dpx a(jb $$0, List<cwq> $$1) {
      return new dqd($$0, il.a(cwq::r, $$1));
   }

   static dpx c(List<cwq> $$0) {
      return a(jb.g, $$0);
   }

   static dpx a(jb $$0, cwq... $$1) {
      return a($$0, List.of($$1));
   }

   static dpx a(cwq... $$0) {
      return a(jb.g, $$0);
   }

   static dpx a(jb $$0, asw<cwq> $$1) {
      return new dqc($$0, $$1);
   }

   static dpx a(asw<cwq> $$0) {
      return a(jb.g, $$0);
   }

   static dpx b(jb $$0, List<eeq> $$1) {
      return new dqe($$0, il.a(eeq::k, $$1));
   }

   static dpx a(jb $$0, eeq... $$1) {
      return b($$0, List.of($$1));
   }

   static dpx a(eeq... $$0) {
      return a(jb.g, $$0);
   }

   static dpx a(dpx $$0) {
      return new dqf($$0);
   }

   static dpx a(jb $$0) {
      return new dqg($$0);
   }

   static dpx b() {
      return a(jb.g);
   }

   static dpx a(djh $$0, jb $$1) {
      return new dqk($$1, $$0);
   }

   static dpx a(jb $$0, ic $$1) {
      return new dqa($$0, $$1);
   }

   static dpx a(ic $$0) {
      return a(jb.g, $$0);
   }

   static dpx b(jb $$0) {
      return new dqh($$0);
   }

   static dpx c() {
      return b(jb.g);
   }

   static dpx d() {
      return c(jb.g);
   }

   static dpx c(jb $$0) {
      return a($$0, ees.a);
   }

   static dpx d(jb $$0) {
      return new dqb($$0);
   }

   static dpx e() {
      return dqj.a;
   }
}
