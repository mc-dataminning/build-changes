import java.util.function.Predicate;

public class dgy {
   private final fcu a;
   private final fcu b;
   private final dgy.a c;
   private final dgy.b d;
   private final fcz e;

   public dgy(fcu $$0, fcu $$1, dgy.a $$2, dgy.b $$3, bvs $$4) {
      this($$0, $$1, $$2, $$3, fcz.a($$4));
   }

   public dgy(fcu $$0, fcu $$1, dgy.a $$2, dgy.b $$3, fcz $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public fcu a() {
      return this.b;
   }

   public fcu b() {
      return this.a;
   }

   public fdo a(dym $$0, dgv $$1, jj $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fdo a(eut $$0, dgv $$1, jj $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fdl.a();
   }

   public static enum a implements dgy.c {
      a(dyl.a::b),
      b(dyl.a::a),
      c(dyl.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awz.aT) ? fdl.b() : fdl.a());

      private final dgy.c e;

      private a(final dgy.c $$0) {
         this.e = $$0;
      }

      @Override
      public fdo get(dym $$0, dgv $$1, jj $$2, fcz $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(eut::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(axf.a));

      private final Predicate<eut> e;

      private b(final Predicate<eut> $$0) {
         this.e = $$0;
      }

      public boolean a(eut $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fdo get(dym var1, dgv var2, jj var3, fcz var4);
   }
}
