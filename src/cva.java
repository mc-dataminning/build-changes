import java.util.function.Predicate;

public class cva {
   private final enz a;
   private final enz b;
   private final cva.a c;
   private final cva.b d;
   private final eoe e;

   public cva(enz $$0, enz $$1, cva.a $$2, cva.b $$3, bnq $$4) {
      this($$0, $$1, $$2, $$3, eoe.a($$4));
   }

   public cva(enz $$0, enz $$1, cva.a $$2, cva.b $$3, eoe $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public enz a() {
      return this.b;
   }

   public enz b() {
      return this.a;
   }

   public eos a(dlj $$0, cux $$1, hz $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public eos a(egw $$0, cux $$1, hz $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : eop.a();
   }

   public static enum a implements cva.c {
      a(dli.a::b),
      b(dli.a::a),
      c(dli.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(aua.aP) ? eop.b() : eop.a());

      private final cva.c e;

      private a(cva.c $$0) {
         this.e = $$0;
      }

      @Override
      public eos get(dlj $$0, cux $$1, hz $$2, eoe $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(egw::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(auf.a));

      private final Predicate<egw> e;

      private b(Predicate<egw> $$0) {
         this.e = $$0;
      }

      public boolean a(egw $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      eos get(dlj var1, cux var2, hz var3, eoe var4);
   }
}
