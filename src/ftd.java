import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class ftd implements fta {
   private final dnc a;
   private final List<ftd.b> b;
   private final Set<ech<?>> c;

   ftd(dnc $$0, List<ftd.b> $$1, Set<ech<?>> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   static Set<ech<?>> a(Set<ech<?>> $$0, dnc $$1, fte<?> $$2) {
      List<ech<?>> $$3 = $$2.b();
      $$3.forEach($$2x -> {
         if ($$1.l().a($$2x.f()) != $$2x) {
            throw new IllegalStateException("Property " + $$2x + " is not defined for block " + $$1);
         } else if ($$0.contains($$2x)) {
            throw new IllegalStateException("Values of property " + $$2x + " already defined for block " + $$1);
         }
      });
      Set<ech<?>> $$4 = new HashSet<>($$0);
      $$4.addAll($$3);
      return $$4;
   }

   public ftd a(fte<gtx> $$0) {
      Set<ech<?>> $$1 = a(this.c, this.a, $$0);
      List<ftd.b> $$2 = this.b.stream().flatMap($$1x -> $$1x.a($$0)).toList();
      return new ftd(this.a, $$2, $$1);
   }

   public ftd a(gtx $$0) {
      List<ftd.b> $$1 = this.b.stream().flatMap($$1x -> $$1x.a($$0)).toList();
      return new ftd(this.a, $$1, this.c);
   }

   @Override
   public gtl b() {
      Map<String, gtn.b> $$0 = new HashMap<>();

      for (ftd.b $$1 : this.b) {
         $$0.put($$1.a.a(), $$1.b.a());
      }

      return new gtl(Optional.of(new gtl.b($$0)), Optional.empty());
   }

   @Override
   public dnc a() {
      return this.a;
   }

   public static ftd.a a(dnc $$0) {
      return new ftd.a($$0);
   }

   public static ftd a(dnc $$0, fsz $$1) {
      return new ftd($$0, List.of(new ftd.b(ftf.a, $$1)), Set.of());
   }

   public static class a {
      private final dnc a;

      public a(dnc $$0) {
         this.a = $$0;
      }

      public ftd a(fte<fsz> $$0) {
         Set<ech<?>> $$1 = ftd.a(Set.of(), this.a, $$0);
         List<ftd.b> $$2 = $$0.a().entrySet().stream().map($$0x -> new ftd.b((ftf)$$0x.getKey(), (fsz)$$0x.getValue())).toList();
         return new ftd(this.a, $$2, $$1);
      }
   }

   static record b(ftf a, fsz b) {

      public Stream<ftd.b> a(fte<gtx> $$0) {
         return $$0.a().entrySet().stream().map($$0x -> {
            ftf $$1 = this.a.a((ftf)$$0x.getKey());
            fsz $$2 = this.b.a((gtx)$$0x.getValue());
            return new ftd.b($$1, $$2);
         });
      }

      public Stream<ftd.b> a(gtx $$0) {
         return Stream.of(new ftd.b(this.a, this.b.a($$0)));
      }
   }
}
