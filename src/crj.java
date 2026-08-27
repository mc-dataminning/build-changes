import java.util.function.Predicate;

public class crj {
   private final eju a;
   private final eju b;
   private final crj.a c;
   private final crj.b d;
   private final ejz e;

   public crj(eju $$0, eju $$1, crj.a $$2, crj.b $$3, bkq $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = ejz.a($$4);
   }

   public eju a() {
      return this.b;
   }

   public eju b() {
      return this.a;
   }

   public ekn a(dhi $$0, crg $$1, ht $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ekn a(ecs $$0, crg $$1, ht $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ekk.a();
   }

   public static enum a implements crj.c {
      a(dhh.a::b),
      b(dhh.a::a),
      c(dhh.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(arg.aP) ? ekk.b() : ekk.a());

      private final crj.c e;

      private a(crj.c $$0) {
         this.e = $$0;
      }

      @Override
      public ekn get(dhi $$0, crg $$1, ht $$2, ejz $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(ecs::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(arl.a));

      private final Predicate<ecs> e;

      private b(Predicate<ecs> $$0) {
         this.e = $$0;
      }

      public boolean a(ecs $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ekn get(dhi var1, crg var2, ht var3, ejz var4);
   }
}
