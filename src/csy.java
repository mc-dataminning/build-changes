import java.util.function.Predicate;

public class csy {
   private final elt a;
   private final elt b;
   private final csy.a c;
   private final csy.b d;
   private final ely e;

   public csy(elt $$0, elt $$1, csy.a $$2, csy.b $$3, blv $$4) {
      this($$0, $$1, $$2, $$3, ely.a($$4));
   }

   public csy(elt $$0, elt $$1, csy.a $$2, csy.b $$3, ely $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public elt a() {
      return this.b;
   }

   public elt b() {
      return this.a;
   }

   public emm a(djh $$0, csv $$1, hx $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public emm a(eer $$0, csv $$1, hx $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : emj.a();
   }

   public static enum a implements csy.c {
      a(djg.a::b),
      b(djg.a::a),
      c(djg.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(ash.aP) ? emj.b() : emj.a());

      private final csy.c e;

      private a(csy.c $$0) {
         this.e = $$0;
      }

      @Override
      public emm get(djh $$0, csv $$1, hx $$2, ely $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eer::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(asm.a));

      private final Predicate<eer> e;

      private b(Predicate<eer> $$0) {
         this.e = $$0;
      }

      public boolean a(eer $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      emm get(djh var1, csv var2, hx var3, ely var4);
   }
}
