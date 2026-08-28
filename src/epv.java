import javax.annotation.Nullable;

public class epv {
   private final dcg a;
   @Nullable
   private final epu b;
   private final jd c;
   private final jd.a d = new jd.a();

   public epv(dcg $$0, btp $$1) {
      this.a = $$0;
      if ($$1.dP() instanceof aqu $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dp();
   }

   public ept a(int $$0, int $$1, int $$2) {
      jd $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? epy.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dtc a(jd $$0) {
      return this.a.a_($$0);
   }

   public dcg a() {
      return this.a;
   }

   public jd b() {
      return this.c;
   }
}
