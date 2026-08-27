import java.util.function.Predicate;

public class cyp {
   private final esj a;
   private final esj b;
   private final cyp.a c;
   private final cyp.b d;
   private final eso e;

   public cyp(esj $$0, esj $$1, cyp.a $$2, cyp.b $$3, bqa $$4) {
      this($$0, $$1, $$2, $$3, eso.a($$4));
   }

   public cyp(esj $$0, esj $$1, cyp.a $$2, cyp.b $$3, eso $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public esj a() {
      return this.b;
   }

   public esj b() {
      return this.a;
   }

   public etc a(dpi $$0, cym $$1, id $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public etc a(elb $$0, cym $$1, id $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : esz.a();
   }

   public static enum a implements cyp.c {
      a(dph.a::b),
      b(dph.a::a),
      c(dph.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(ave.aQ) ? esz.b() : esz.a());

      private final cyp.c e;

      private a(cyp.c $$0) {
         this.e = $$0;
      }

      @Override
      public etc get(dpi $$0, cym $$1, id $$2, eso $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(elb::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(avj.a));

      private final Predicate<elb> e;

      private b(Predicate<elb> $$0) {
         this.e = $$0;
      }

      public boolean a(elb $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      etc get(dpi var1, cym var2, id var3, eso var4);
   }
}
