public class emq extends ems {
   private final emi c;

   public emq(emi $$0, long $$1, sw $$2, Runnable $$3) {
      super($$1, $$2, $$3);
      this.c = $$0;
   }

   @Override
   protected void a(eiz $$0, long $$1) throws ekm {
      $$0.a($$1, this.c);
   }
}
