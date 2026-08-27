import java.util.function.Predicate;

public class csh {
   private final elb a;
   private final elb b;
   private final csh.a c;
   private final csh.b d;
   private final elg e;

   public csh(elb $$0, elb $$1, csh.a $$2, csh.b $$3, blf $$4) {
      this($$0, $$1, $$2, $$3, elg.a($$4));
   }

   public csh(elb $$0, elb $$1, csh.a $$2, csh.b $$3, elg $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public elb a() {
      return this.b;
   }

   public elb b() {
      return this.a;
   }

   public elu a(dip $$0, cse $$1, hv $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public elu a(edz $$0, cse $$1, hv $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : elr.a();
   }

   public static enum a implements csh.c {
      a(dio.a::b),
      b(dio.a::a),
      c(dio.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(arr.aP) ? elr.b() : elr.a());

      private final csh.c e;

      private a(csh.c $$0) {
         this.e = $$0;
      }

      @Override
      public elu get(dip $$0, cse $$1, hv $$2, elg $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(edz::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(arw.a));

      private final Predicate<edz> e;

      private b(Predicate<edz> $$0) {
         this.e = $$0;
      }

      public boolean a(edz $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      elu get(dip var1, cse var2, hv var3, elg var4);
   }
}
