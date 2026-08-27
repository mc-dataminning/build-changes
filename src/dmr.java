import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dmr extends BiPredicate<crt, ht> {
   Codec<dmr> b = jy.P.q().dispatch(dmr::a, dms::codec);
   dmr c = a(cuc.a);
   dmr d = a(cuc.a, cuc.G);

   dms<?> a();

   static dmr a(List<dmr> $$0) {
      return new dmp($$0);
   }

   static dmr a(dmr... $$0) {
      return a(List.of($$0));
   }

   static dmr a(dmr $$0, dmr $$1) {
      return a(List.of($$0, $$1));
   }

   static dmr b(List<dmr> $$0) {
      return new dmq($$0);
   }

   static dmr b(dmr... $$0) {
      return b(List.of($$0));
   }

   static dmr b(dmr $$0, dmr $$1) {
      return b(List.of($$0, $$1));
   }

   static dmr a(iw $$0, List<cua> $$1) {
      return new dmx($$0, ig.a(cua::r, $$1));
   }

   static dmr c(List<cua> $$0) {
      return a(iw.g, $$0);
   }

   static dmr a(iw $$0, cua... $$1) {
      return a($$0, List.of($$1));
   }

   static dmr a(cua... $$0) {
      return a(iw.g, $$0);
   }

   static dmr a(iw $$0, arh<cua> $$1) {
      return new dmw($$0, $$1);
   }

   static dmr a(arh<cua> $$0) {
      return a(iw.g, $$0);
   }

   static dmr b(iw $$0, List<ebd> $$1) {
      return new dmy($$0, ig.a(ebd::k, $$1));
   }

   static dmr a(iw $$0, ebd... $$1) {
      return b($$0, List.of($$1));
   }

   static dmr a(ebd... $$0) {
      return a(iw.g, $$0);
   }

   static dmr a(dmr $$0) {
      return new dmz($$0);
   }

   static dmr a(iw $$0) {
      return new dna($$0);
   }

   static dmr b() {
      return a(iw.g);
   }

   static dmr a(dgb $$0, iw $$1) {
      return new dne($$1, $$0);
   }

   static dmr a(iw $$0, hx $$1) {
      return new dmu($$0, $$1);
   }

   static dmr a(hx $$0) {
      return a(iw.g, $$0);
   }

   static dmr b(iw $$0) {
      return new dnb($$0);
   }

   static dmr c() {
      return b(iw.g);
   }

   static dmr d() {
      return c(iw.g);
   }

   static dmr c(iw $$0) {
      return a($$0, ebf.a);
   }

   static dmr d(iw $$0) {
      return new dmv($$0);
   }

   static dmr e() {
      return dnd.a;
   }
}
