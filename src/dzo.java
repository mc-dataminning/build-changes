import com.google.common.annotations.VisibleForTesting;

public class dzo extends dye implements egi.b<dzo.a> {
   private final dzo.a a;

   public dzo(iw $$0, ebg $$1) {
      super(dyg.L, $$0, $$1);
      this.a = new dzo.a($$1, new egc($$0));
   }

   public static void a(djz $$0, iw $$1, ebg $$2, dzo $$3) {
      $$3.a.d().a($$0, $$1, $$0.G_(), true);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dzo.a a() {
      return this.a;
   }

   public static class a implements egi {
      public static final int a = 8;
      final duh b;
      private final ebg c;
      private final egk d;

      public a(ebg $$0, egk $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = duh.a();
      }

      @Override
      public egk a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public egi.a c() {
         return egi.a.b;
      }

      @Override
      public boolean a(aru $$0, jg<egg> $$1, egg.a $$2, ffs $$3) {
         if ($$1.a(egg.p) && $$2.a() instanceof bxw $$4) {
            if (!$$4.eL()) {
               bvk $$5 = $$4.eI();
               int $$6 = $$4.a($$0, y.a($$5, bvk::d));
               if ($$4.eo() && $$6 > 0) {
                  this.b.a(iw.a((jq)$$3.a(jc.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eK();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, iw.a((jq)$$1x), this.c, $$0.G_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public duh d() {
         return this.b;
      }

      private void a(aru $$0, iw $$1, ebg $$2, azz $$3) {
         $$0.a($$1, $$2.b(due.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lz.K, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awr.wQ, aws.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(djz $$0, bxw $$1) {
         if ($$1.er() instanceof arv $$3) {
            bvk $$4 = $$1.eI() == null ? $$0.al().a((crz)$$3) : $$1.eI();
            aq.Z.a($$3, $$1, $$4);
         }
      }
   }
}
