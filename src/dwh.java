import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dwh extends BiPredicate<dab, id> {
   Codec<dwh> b = kt.O.q().dispatch(dwh::a, dwi::codec);
   dwh c = a(dcj.a);
   dwh d = a(dcj.a, dcj.G);

   dwi<?> a();

   static dwh a(List<dwh> $$0) {
      return new dwf($$0);
   }

   static dwh a(dwh... $$0) {
      return a(List.of($$0));
   }

   static dwh a(dwh $$0, dwh $$1) {
      return a(List.of($$0, $$1));
   }

   static dwh b(List<dwh> $$0) {
      return new dwg($$0);
   }

   static dwh b(dwh... $$0) {
      return b(List.of($$0));
   }

   static dwh b(dwh $$0, dwh $$1) {
      return b(List.of($$0, $$1));
   }

   static dwh a(ji $$0, List<dch> $$1) {
      return new dwn($$0, ir.a(dch::r, $$1));
   }

   static dwh c(List<dch> $$0) {
      return a(ji.g, $$0);
   }

   static dwh a(ji $$0, dch... $$1) {
      return a($$0, List.of($$1));
   }

   static dwh a(dch... $$0) {
      return a(ji.g, $$0);
   }

   static dwh a(ji $$0, avt<dch> $$1) {
      return new dwm($$0, $$1);
   }

   static dwh a(avt<dch> $$0) {
      return a(ji.g, $$0);
   }

   static dwh b(ji $$0, List<ela> $$1) {
      return new dwo($$0, ir.a(ela::k, $$1));
   }

   static dwh a(ji $$0, ela... $$1) {
      return b($$0, List.of($$1));
   }

   static dwh a(ela... $$0) {
      return a(ji.g, $$0);
   }

   static dwh a(dwh $$0) {
      return new dwp($$0);
   }

   static dwh a(ji $$0) {
      return new dwq($$0);
   }

   static dwh b() {
      return a(ji.g);
   }

   static dwh a(dpi $$0, ji $$1) {
      return new dwu($$1, $$0);
   }

   static dwh a(ji $$0, ij $$1) {
      return new dwk($$0, $$1);
   }

   static dwh a(ij $$0) {
      return a(ji.g, $$0);
   }

   static dwh b(ji $$0) {
      return new dwr($$0);
   }

   static dwh c() {
      return b(ji.g);
   }

   static dwh d() {
      return c(ji.g);
   }

   static dwh c(ji $$0) {
      return a($$0, elc.a);
   }

   static dwh d(ji $$0) {
      return new dwl($$0);
   }

   static dwh e() {
      return dwt.a;
   }
}
