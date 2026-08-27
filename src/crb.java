import java.util.function.Predicate;

public class crb {
   private final eji a;
   private final eji b;
   private final crb.a c;
   private final crb.b d;
   private final ejn e;

   public crb(eji $$0, eji $$1, crb.a $$2, crb.b $$3, bki $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = ejn.a($$4);
   }

   public eji a() {
      return this.b;
   }

   public eji b() {
      return this.a;
   }

   public ekb a(dgw $$0, cqy $$1, ht $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ekb a(ecg $$0, cqy $$1, ht $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : ejy.a();
   }

   public static enum a implements crb.c {
      a(dgv.a::b),
      b(dgv.a::a),
      c(dgv.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(arc.aP) ? ejy.b() : ejy.a());

      private final crb.c e;

      private a(crb.c $$0) {
         this.e = $$0;
      }

      @Override
      public ekb get(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(ecg::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(arh.a));

      private final Predicate<ecg> e;

      private b(Predicate<ecg> $$0) {
         this.e = $$0;
      }

      public boolean a(ecg $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ekb get(dgw var1, cqy var2, ht var3, ejn var4);
   }
}
