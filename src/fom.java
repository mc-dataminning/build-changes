import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class fom {
   public static hck.b a(aku $$0) {
      return new hce.a($$0, List.of());
   }

   public static hck.b a(aku $$0, fnq... $$1) {
      return new hce.a($$0, List.of($$1));
   }

   public static fnq a(int $$0) {
      return new fnl($$0);
   }

   public static hck.b a(hck.b... $$0) {
      return new hch.a(List.of($$0));
   }

   public static hck.b a(aku $$0, hev.a $$1) {
      return new hcr.a($$0, $$1);
   }

   public static hcp.a a(hck.b $$0, float $$1) {
      return new hcp.a($$1, $$0);
   }

   public static hck.b a(hds $$0, hck.b $$1, hcp.a... $$2) {
      return new hcp.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hck.b a(hds $$0, float $$1, hck.b $$2, hcp.a... $$3) {
      return new hcp.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hck.b a(hds $$0, hck.b $$1, List<hcp.a> $$2) {
      return new hcp.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hck.b a(hds $$0, List<hcp.a> $$1) {
      return new hcp.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hck.b a(hds $$0, float $$1, List<hcp.a> $$2) {
      return new hcp.b($$0, $$1, $$2, Optional.empty());
   }

   public static hck.b a(hcw $$0, hck.b $$1, hck.b $$2) {
      return new hci.a($$0, $$1, $$2);
   }

   public static <T> hcq.a<T> a(T $$0, hck.b $$1) {
      return new hcq.a<>(List.of($$0), $$1);
   }

   public static <T> hcq.a<T> a(List<T> $$0, hck.b $$1) {
      return new hcq.a<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hck.b a(heh<T> $$0, hck.b $$1, hcq.a<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hck.b a(heh<T> $$0, hck.b $$1, List<hcq.a<T>> $$2) {
      return new hcq.b(new hcq.c<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hck.b a(heh<T> $$0, hcq.a<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hck.b a(heh<T> $$0, List<hcq.a<T>> $$1) {
      return new hcq.b(new hcq.c<>($$0, $$1), Optional.empty());
   }

   public static hcw a() {
      return new hdf();
   }

   public static hcw a(ku<?> $$0) {
      return new hdb($$0, false);
   }

   public static hck.b a(hck.b $$0, hck.b $$1) {
      return a(new hdz(), $$1, a(dgz.i, $$0));
   }

   public static <T extends Comparable<T>> hck.b a(dyt<T> $$0, hck.b $$1, Map<T, hck.b> $$2) {
      List<hcq.a<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hcq.a<>(List.of($$2x), (hck.b)$$1x.getValue());
      }).toList();
      return a(new hed($$0.f()), $$1, $$3);
   }

   public static hck.b b(hck.b $$0, hck.b $$1) {
      return a(hee.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
