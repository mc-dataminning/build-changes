import java.util.function.Predicate;

public class dfo {
   private final fay a;
   private final fay b;
   private final dfo.a c;
   private final dfo.b d;
   private final fbd e;

   public dfo(fay $$0, fay $$1, dfo.a $$2, dfo.b $$3, buj $$4) {
      this($$0, $$1, $$2, $$3, fbd.a($$4));
   }

   public dfo(fay $$0, fay $$1, dfo.a $$2, dfo.b $$3, fbd $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public fay a() {
      return this.b;
   }

   public fay b() {
      return this.a;
   }

   public fbs a(dwv $$0, dfl $$1, ji $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public fbs a(esx $$0, dfl $$1, ji $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : fbp.a();
   }

   public static enum a implements dfo.c {
      a(dwu.a::b),
      b(dwu.a::a),
      c(dwu.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(awo.aT) ? fbp.b() : fbp.a());

      private final dfo.c e;

      private a(final dfo.c $$0) {
         this.e = $$0;
      }

      @Override
      public fbs get(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(esx::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(awu.a));

      private final Predicate<esx> e;

      private b(final Predicate<esx> $$0) {
         this.e = $$0;
      }

      public boolean a(esx $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      fbs get(dwv var1, dfl var2, ji var3, fbd var4);
   }
}
