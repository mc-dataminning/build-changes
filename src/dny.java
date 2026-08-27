import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dny extends BiPredicate<csu, ht> {
   Codec<dny> b = jy.P.q().dispatch(dny::a, dnz::codec);
   dny c = a(cvc.a);
   dny d = a(cvc.a, cvc.G);

   dnz<?> a();

   static dny a(List<dny> $$0) {
      return new dnw($$0);
   }

   static dny a(dny... $$0) {
      return a(List.of($$0));
   }

   static dny a(dny $$0, dny $$1) {
      return a(List.of($$0, $$1));
   }

   static dny b(List<dny> $$0) {
      return new dnx($$0);
   }

   static dny b(dny... $$0) {
      return b(List.of($$0));
   }

   static dny b(dny $$0, dny $$1) {
      return b(List.of($$0, $$1));
   }

   static dny a(iw $$0, List<cva> $$1) {
      return new doe($$0, ig.a(cva::r, $$1));
   }

   static dny c(List<cva> $$0) {
      return a(iw.g, $$0);
   }

   static dny a(iw $$0, cva... $$1) {
      return a($$0, List.of($$1));
   }

   static dny a(cva... $$0) {
      return a(iw.g, $$0);
   }

   static dny a(iw $$0, arv<cva> $$1) {
      return new dod($$0, $$1);
   }

   static dny a(arv<cva> $$0) {
      return a(iw.g, $$0);
   }

   static dny b(iw $$0, List<ecr> $$1) {
      return new dof($$0, ig.a(ecr::k, $$1));
   }

   static dny a(iw $$0, ecr... $$1) {
      return b($$0, List.of($$1));
   }

   static dny a(ecr... $$0) {
      return a(iw.g, $$0);
   }

   static dny a(dny $$0) {
      return new dog($$0);
   }

   static dny a(iw $$0) {
      return new doh($$0);
   }

   static dny b() {
      return a(iw.g);
   }

   static dny a(dhi $$0, iw $$1) {
      return new dol($$1, $$0);
   }

   static dny a(iw $$0, hx $$1) {
      return new dob($$0, $$1);
   }

   static dny a(hx $$0) {
      return a(iw.g, $$0);
   }

   static dny b(iw $$0) {
      return new doi($$0);
   }

   static dny c() {
      return b(iw.g);
   }

   static dny d() {
      return c(iw.g);
   }

   static dny c(iw $$0) {
      return a($$0, ect.a);
   }

   static dny d(iw $$0) {
      return new doc($$0);
   }

   static dny e() {
      return dok.a;
   }
}
