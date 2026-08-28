import java.util.function.Predicate;

public class dbc {
   private final evm a;
   private final evm b;
   private final dbc.a c;
   private final dbc.b d;
   private final evr e;

   public dbc(evm $$0, evm $$1, dbc.a $$2, dbc.b $$3, bsp $$4) {
      this($$0, $$1, $$2, $$3, evr.a($$4));
   }

   public dbc(evm $$0, evm $$1, dbc.a $$2, dbc.b $$3, evr $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public evm a() {
      return this.b;
   }

   public evm b() {
      return this.a;
   }

   public ewf a(drx $$0, daz $$1, iz $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ewf a(enq $$0, daz $$1, iz $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ewc.a();
   }

   public static enum a implements dbc.c {
      a(drw.a::b),
      b(drw.a::a),
      c(drw.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awl.aQ) ? ewc.b() : ewc.a());

      private final dbc.c e;

      private a(final dbc.c $$0) {
         this.e = $$0;
      }

      @Override
      public ewf get(drx $$0, daz $$1, iz $$2, evr $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(enq::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awr.a));

      private final Predicate<enq> e;

      private b(final Predicate<enq> $$0) {
         this.e = $$0;
      }

      public boolean a(enq $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ewf get(drx var1, daz var2, iz var3, evr var4);
   }
}
