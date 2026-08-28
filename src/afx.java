public class afx implements zo<acd> {
   public static final zf<we, afx> a = zo.a(afx::a, afx::new);
   private final long b;
   private final long c;

   public afx(long $$0, long $$1, boolean $$2) {
      this.b = $$0;
      long $$3 = $$1;
      if (!$$2) {
         $$3 = -$$1;
         if ($$3 == 0L) {
            $$3 = -1L;
         }
      }

      this.c = $$3;
   }

   private afx(we $$0) {
      this.b = $$0.readLong();
      this.c = $$0.readLong();
   }

   private void a(we $$0) {
      $$0.b(this.b);
      $$0.b(this.c);
   }

   @Override
   public zq<afx> a() {
      return ags.aP;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
