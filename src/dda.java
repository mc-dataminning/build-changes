import java.util.function.Predicate;

public class dda {
   private final eye a;
   private final eye b;
   private final dda.a c;
   private final dda.b d;
   private final eyj e;

   public dda(eye $$0, eye $$1, dda.a $$2, dda.b $$3, btj $$4) {
      this($$0, $$1, $$2, $$3, eyj.a($$4));
   }

   public dda(eye $$0, eye $$1, dda.a $$2, dda.b $$3, eyj $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public eye a() {
      return this.b;
   }

   public eye b() {
      return this.a;
   }

   public eyx a(dua $$0, dcx $$1, je $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public eyx a(eqb $$0, dcx $$1, je $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : eyu.a();
   }

   public static enum a implements dda.c {
      a(dtz.a::b),
      b(dtz.a::a),
      c(dtz.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(aws.aR) ? eyu.b() : eyu.a());

      private final dda.c e;

      private a(final dda.c $$0) {
         this.e = $$0;
      }

      @Override
      public eyx get(dua $$0, dcx $$1, je $$2, eyj $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eqb::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awy.a));

      private final Predicate<eqb> e;

      private b(final Predicate<eqb> $$0) {
         this.e = $$0;
      }

      public boolean a(eqb $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      eyx get(dua var1, dcx var2, je var3, eyj var4);
   }
}
