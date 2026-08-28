import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dbd {
   public static final dbd a = new dbd(List.of(), List.of(), List.of());
   private final List<dba> b;
   private final List<cpb.a<jr<cwl>>> c;
   private final List<Optional<dbd.a>> d;

   private dbd(List<dba> $$0, List<cpb.a<jr<cwl>>> $$1, List<Optional<dbd.a>> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static cpb.a<jr<cwl>> a(dba $$0) {
      return cpc.a($$0.a().stream());
   }

   public static dbd b(dba $$0) {
      if ($$0.a().isEmpty()) {
         return a;
      } else {
         cpb.a<jr<cwl>> $$1 = a($$0);
         dbd.a $$2 = new dbd.a(0);
         return new dbd(List.of($$0), List.of($$1), List.of(Optional.of($$2)));
      }
   }

   public static dbd a(List<Optional<dba>> $$0) {
      int $$1 = $$0.size();
      List<dba> $$2 = new ArrayList<>($$1);
      List<cpb.a<jr<cwl>>> $$3 = new ArrayList<>($$1);
      List<Optional<dbd.a>> $$4 = new ArrayList<>($$1);
      int $$5 = 0;

      for (Optional<dba> $$6 : $$0) {
         if ($$6.isPresent()) {
            dba $$7 = $$6.get();
            if ($$7.a().isEmpty()) {
               return a;
            }

            $$2.add($$7);
            $$3.add(a($$7));
            $$4.add(Optional.of(new dbd.a($$5++)));
         } else {
            $$4.add(Optional.empty());
         }
      }

      return new dbd($$2, $$3, $$4);
   }

   public static dbd b(List<dba> $$0) {
      int $$1 = $$0.size();
      List<cpb.a<jr<cwl>>> $$2 = new ArrayList<>($$1);
      List<Optional<dbd.a>> $$3 = new ArrayList<>($$1);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         dba $$5 = $$0.get($$4);
         if ($$5.a().isEmpty()) {
            return a;
         }

         $$2.add(a($$5));
         $$3.add(Optional.of(new dbd.a($$4)));
      }

      return new dbd($$0, $$2, $$3);
   }

   public List<Optional<dbd.a>> a() {
      return this.d;
   }

   public List<dba> b() {
      return this.b;
   }

   public List<cpb.a<jr<cwl>>> c() {
      return this.c;
   }

   public boolean d() {
      return this.d.isEmpty();
   }

   public static record a(int a) {
   }
}
