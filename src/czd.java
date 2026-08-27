import java.util.function.Predicate;

public class czd {
   private final etf a;
   private final etf b;
   private final czd.a c;
   private final czd.b d;
   private final etk e;

   public czd(etf $$0, etf $$1, czd.a $$2, czd.b $$3, bql $$4) {
      this($$0, $$1, $$2, $$3, etk.a($$4));
   }

   public czd(etf $$0, etf $$1, czd.a $$2, czd.b $$3, etk $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public etf a() {
      return this.b;
   }

   public etf b() {
      return this.a;
   }

   public ety a(dpy $$0, cza $$1, im $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public ety a(elr $$0, cza $$1, im $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : etv.a();
   }

   public static enum a implements czd.c {
      a(dpx.a::b),
      b(dpx.a::a),
      c(dpx.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(avo.aQ) ? etv.b() : etv.a());

      private final czd.c e;

      private a(czd.c $$0) {
         this.e = $$0;
      }

      @Override
      public ety get(dpy $$0, cza $$1, im $$2, etk $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(elr::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(avt.a));

      private final Predicate<elr> e;

      private b(Predicate<elr> $$0) {
         this.e = $$0;
      }

      public boolean a(elr $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      ety get(dpy var1, cza var2, im var3, etk var4);
   }
}
