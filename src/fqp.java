import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class fqp {
   @Nullable
   private fqp.a a;
   @Nullable
   private fqp.b b;

   public void a(aix<? extends iv<?>> $$0, List<iz.a> $$1) {
      if (this.a == null) {
         this.a = new fqp.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<aix<? extends iv<?>>, aus.a> $$0) {
      if (this.b == null) {
         this.b = new fqp.b();
      }

      $$0.forEach(this.b::a);
   }

   public iw.b a(iw $$0, boolean $$1) {
      iq<fqg> $$2 = fqg.a();
      iw $$4;
      if (this.a != null) {
         iw.b $$3 = this.a.a($$2.b(fqg.b)).d();
         $$4 = $$2.a(fqg.b, $$3).a();
      } else {
         $$4 = $$0;
      }

      if (this.b != null && !$$1) {
         $$2.a(fqg.a).c().forEach($$0x -> $$0x.b().m());
         this.b.a($$4);
      }

      return $$4.d();
   }

   static class a {
      private final Map<aix<? extends iv<?>>, List<iz.a>> a = new HashMap<>();

      public void a(aix<? extends iv<?>> $$0, List<iz.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }

      public iw a(iw $$0) {
         return ait.a(this.a, $$0, ait.c);
      }
   }

   static class b {
      private final Map<aix<? extends iv<?>>, aus.a> a = new HashMap<>();

      public void a(aix<? extends iv<?>> $$0, aus.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(iw $$0) {
         this.a.forEach(($$1, $$2) -> $$2.a($$0.d((aix<? extends iv<?>>)$$1)));
      }
   }
}
