import java.util.function.Predicate;

public class dag {
   private final euk a;
   private final euk b;
   private final dag.a c;
   private final dag.b d;
   private final eup e;

   public dag(euk $$0, euk $$1, dag.a $$2, dag.b $$3, bru $$4) {
      this($$0, $$1, $$2, $$3, eup.a($$4));
   }

   public dag(euk $$0, euk $$1, dag.a $$2, dag.b $$3, eup $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public euk a() {
      return this.b;
   }

   public euk b() {
      return this.a;
   }

   public evd a(drb $$0, dad $$1, io $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public evd a(emu $$0, dad $$1, io $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : eva.a();
   }

   public static enum a implements dag.c {
      a(dra.a::b),
      b(dra.a::a),
      c(dra.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(avw.aQ) ? eva.b() : eva.a());

      private final dag.c e;

      private a(dag.c $$0) {
         this.e = $$0;
      }

      @Override
      public evd get(drb $$0, dad $$1, io $$2, eup $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(emu::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awb.a));

      private final Predicate<emu> e;

      private b(Predicate<emu> $$0) {
         this.e = $$0;
      }

      public boolean a(emu $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      evd get(drb var1, dad var2, io var3, eup var4);
   }
}
