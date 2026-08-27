import com.google.common.collect.ImmutableMap;

public class bkk extends bhr<bgb> {
   private final float c;

   public bkk(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   protected boolean a(aif $$0, bgb $$1) {
      return $$1.aV() && $$1.b(anb.a) > $$1.dc() || $$1.bi();
   }

   protected boolean a(aif $$0, bgb $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aif $$0, bgb $$1, long $$2) {
      if ($$1.ec().i() < this.c) {
         $$1.I().a();
      }
   }
}
