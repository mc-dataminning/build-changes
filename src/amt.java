public class amt implements aey {
   private static final ui a = ui.c("multiplayer.status.request_handled");
   private final aex b;
   private final tj c;
   private boolean d;

   public amt(aex $$0, tj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ui $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   @Override
   public void a(afa $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new aew(this.b));
      }
   }

   @Override
   public void a(aez $$0) {
      this.c.a(new aev($$0.a()));
      this.c.a(a);
   }
}
