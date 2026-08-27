import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dpw extends BiPredicate<cuj, hx> {
   Codec<dpw> b = kd.O.q().dispatch(dpw::a, dpx::codec);
   dpw c = a(cwr.a);
   dpw d = a(cwr.a, cwr.G);

   dpx<?> a();

   static dpw a(List<dpw> $$0) {
      return new dpu($$0);
   }

   static dpw a(dpw... $$0) {
      return a(List.of($$0));
   }

   static dpw a(dpw $$0, dpw $$1) {
      return a(List.of($$0, $$1));
   }

   static dpw b(List<dpw> $$0) {
      return new dpv($$0);
   }

   static dpw b(dpw... $$0) {
      return b(List.of($$0));
   }

   static dpw b(dpw $$0, dpw $$1) {
      return b(List.of($$0, $$1));
   }

   static dpw a(jb $$0, List<cwp> $$1) {
      return new dqc($$0, il.a(cwp::r, $$1));
   }

   static dpw c(List<cwp> $$0) {
      return a(jb.g, $$0);
   }

   static dpw a(jb $$0, cwp... $$1) {
      return a($$0, List.of($$1));
   }

   static dpw a(cwp... $$0) {
      return a(jb.g, $$0);
   }

   static dpw a(jb $$0, asv<cwp> $$1) {
      return new dqb($$0, $$1);
   }

   static dpw a(asv<cwp> $$0) {
      return a(jb.g, $$0);
   }

   static dpw b(jb $$0, List<eep> $$1) {
      return new dqd($$0, il.a(eep::k, $$1));
   }

   static dpw a(jb $$0, eep... $$1) {
      return b($$0, List.of($$1));
   }

   static dpw a(eep... $$0) {
      return a(jb.g, $$0);
   }

   static dpw a(dpw $$0) {
      return new dqe($$0);
   }

   static dpw a(jb $$0) {
      return new dqf($$0);
   }

   static dpw b() {
      return a(jb.g);
   }

   static dpw a(djg $$0, jb $$1) {
      return new dqj($$1, $$0);
   }

   static dpw a(jb $$0, ic $$1) {
      return new dpz($$0, $$1);
   }

   static dpw a(ic $$0) {
      return a(jb.g, $$0);
   }

   static dpw b(jb $$0) {
      return new dqg($$0);
   }

   static dpw c() {
      return b(jb.g);
   }

   static dpw d() {
      return c(jb.g);
   }

   static dpw c(jb $$0) {
      return a($$0, eer.a);
   }

   static dpw d(jb $$0) {
      return new dqa($$0);
   }

   static dpw e() {
      return dqi.a;
   }
}
