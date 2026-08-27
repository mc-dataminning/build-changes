import java.util.function.Predicate;

public class cuw {
   private final ens a;
   private final ens b;
   private final cuw.a c;
   private final cuw.b d;
   private final enx e;

   public cuw(ens $$0, ens $$1, cuw.a $$2, cuw.b $$3, bno $$4) {
      this($$0, $$1, $$2, $$3, enx.a($$4));
   }

   public cuw(ens $$0, ens $$1, cuw.a $$2, cuw.b $$3, enx $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public ens a() {
      return this.b;
   }

   public ens b() {
      return this.a;
   }

   public eol a(dlf $$0, cut $$1, hz $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public eol a(egp $$0, cut $$1, hz $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : eoi.a();
   }

   public static enum a implements cuw.c {
      a(dle.a::b),
      b(dle.a::a),
      c(dle.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(atz.aP) ? eoi.b() : eoi.a());

      private final cuw.c e;

      private a(cuw.c $$0) {
         this.e = $$0;
      }

      @Override
      public eol get(dlf $$0, cut $$1, hz $$2, enx $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(egp::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(aue.a));

      private final Predicate<egp> e;

      private b(Predicate<egp> $$0) {
         this.e = $$0;
      }

      public boolean a(egp $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      eol get(dlf var1, cut var2, hz var3, enx var4);
   }
}
