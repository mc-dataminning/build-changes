import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dpq extends BiPredicate<cud, hx> {
   Codec<dpq> b = kd.O.q().dispatch(dpq::a, dpr::codec);
   dpq c = a(cwl.a);
   dpq d = a(cwl.a, cwl.G);

   dpr<?> a();

   static dpq a(List<dpq> $$0) {
      return new dpo($$0);
   }

   static dpq a(dpq... $$0) {
      return a(List.of($$0));
   }

   static dpq a(dpq $$0, dpq $$1) {
      return a(List.of($$0, $$1));
   }

   static dpq b(List<dpq> $$0) {
      return new dpp($$0);
   }

   static dpq b(dpq... $$0) {
      return b(List.of($$0));
   }

   static dpq b(dpq $$0, dpq $$1) {
      return b(List.of($$0, $$1));
   }

   static dpq a(jb $$0, List<cwj> $$1) {
      return new dpw($$0, il.a(cwj::r, $$1));
   }

   static dpq c(List<cwj> $$0) {
      return a(jb.g, $$0);
   }

   static dpq a(jb $$0, cwj... $$1) {
      return a($$0, List.of($$1));
   }

   static dpq a(cwj... $$0) {
      return a(jb.g, $$0);
   }

   static dpq a(jb $$0, asq<cwj> $$1) {
      return new dpv($$0, $$1);
   }

   static dpq a(asq<cwj> $$0) {
      return a(jb.g, $$0);
   }

   static dpq b(jb $$0, List<eej> $$1) {
      return new dpx($$0, il.a(eej::k, $$1));
   }

   static dpq a(jb $$0, eej... $$1) {
      return b($$0, List.of($$1));
   }

   static dpq a(eej... $$0) {
      return a(jb.g, $$0);
   }

   static dpq a(dpq $$0) {
      return new dpy($$0);
   }

   static dpq a(jb $$0) {
      return new dpz($$0);
   }

   static dpq b() {
      return a(jb.g);
   }

   static dpq a(dja $$0, jb $$1) {
      return new dqd($$1, $$0);
   }

   static dpq a(jb $$0, ic $$1) {
      return new dpt($$0, $$1);
   }

   static dpq a(ic $$0) {
      return a(jb.g, $$0);
   }

   static dpq b(jb $$0) {
      return new dqa($$0);
   }

   static dpq c() {
      return b(jb.g);
   }

   static dpq d() {
      return c(jb.g);
   }

   static dpq c(jb $$0) {
      return a($$0, eel.a);
   }

   static dpq d(jb $$0) {
      return new dpu($$0);
   }

   static dpq e() {
      return dqc.a;
   }
}
