import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dsx extends BiPredicate<cwz, ib> {
   Codec<dsx> b = kh.O.q().dispatch(dsx::a, dsy::codec);
   dsx c = a(czh.a);
   dsx d = a(czh.a, czh.G);

   dsy<?> a();

   static dsx a(List<dsx> $$0) {
      return new dsv($$0);
   }

   static dsx a(dsx... $$0) {
      return a(List.of($$0));
   }

   static dsx a(dsx $$0, dsx $$1) {
      return a(List.of($$0, $$1));
   }

   static dsx b(List<dsx> $$0) {
      return new dsw($$0);
   }

   static dsx b(dsx... $$0) {
      return b(List.of($$0));
   }

   static dsx b(dsx $$0, dsx $$1) {
      return b(List.of($$0, $$1));
   }

   static dsx a(jf $$0, List<czf> $$1) {
      return new dtd($$0, ip.a(czf::r, $$1));
   }

   static dsx c(List<czf> $$0) {
      return a(jf.g, $$0);
   }

   static dsx a(jf $$0, czf... $$1) {
      return a($$0, List.of($$1));
   }

   static dsx a(czf... $$0) {
      return a(jf.g, $$0);
   }

   static dsx a(jf $$0, aut<czf> $$1) {
      return new dtc($$0, $$1);
   }

   static dsx a(aut<czf> $$0) {
      return a(jf.g, $$0);
   }

   static dsx b(jf $$0, List<ehq> $$1) {
      return new dte($$0, ip.a(ehq::k, $$1));
   }

   static dsx a(jf $$0, ehq... $$1) {
      return b($$0, List.of($$1));
   }

   static dsx a(ehq... $$0) {
      return a(jf.g, $$0);
   }

   static dsx a(dsx $$0) {
      return new dtf($$0);
   }

   static dsx a(jf $$0) {
      return new dtg($$0);
   }

   static dsx b() {
      return a(jf.g);
   }

   static dsx a(dme $$0, jf $$1) {
      return new dtk($$1, $$0);
   }

   static dsx a(jf $$0, ih $$1) {
      return new dta($$0, $$1);
   }

   static dsx a(ih $$0) {
      return a(jf.g, $$0);
   }

   static dsx b(jf $$0) {
      return new dth($$0);
   }

   static dsx c() {
      return b(jf.g);
   }

   static dsx d() {
      return c(jf.g);
   }

   static dsx c(jf $$0) {
      return a($$0, ehs.a);
   }

   static dsx d(jf $$0) {
      return new dtb($$0);
   }

   static dsx e() {
      return dtj.a;
   }
}
