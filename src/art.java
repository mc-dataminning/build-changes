import javax.annotation.Nullable;

public class art {
   private final aru a;
   private final int b;
   private long c;

   @Nullable
   public static art a(tw $$0) {
      aru $$1 = md.aC.a(ald.c($$0.l("type")));
      if ($$1 == null) {
         return null;
      } else {
         int $$2 = $$0.h("level");
         if ($$1.c()) {
            long $$3 = $$0.i("ticks_left");
            return new art($$1, $$2, $$3);
         } else {
            return new art($$1, $$2, 0L);
         }
      }
   }

   public void b(tw $$0) {
      ald $$1 = md.aC.b(this.a);
      if ($$1 == null) {
         throw new IllegalStateException("Unrecognised ticket type: " + this.a);
      } else {
         $$0.a("type", $$1.toString());
         $$0.a("level", this.b);
         if (this.a.c()) {
            $$0.a("ticks_left", this.c);
         }
      }
   }

   public art(aru $$0, int $$1) {
      this($$0, $$1, $$0.d());
   }

   private art(aru $$0, int $$1, long $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public String toString() {
      return this.a.c()
         ? "Ticket[" + af.a(md.aC, this.a) + " " + this.b + "] with " + this.c + " ticks left ( out of" + this.a.d() + ")"
         : "Ticket[" + af.a(md.aC, this.a) + " " + this.b + "] with no timeout";
   }

   public aru a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public void c() {
      this.c = this.a.d();
   }

   public void d() {
      if (this.a.c()) {
         this.c--;
      }
   }

   public boolean e() {
      return this.a.c() && this.c <= 0L;
   }
}
