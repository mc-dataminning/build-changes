import com.mojang.serialization.MapCodec;

public class dfl extends cyb {
   public static final MapCodec<dfl> n = b(dfl::new);

   @Override
   public MapCodec<dfl> a() {
      return n;
   }

   public dfl(djo.d $$0) {
      super($$0, () -> dhf.c);
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new div($$0, $$1);
   }

   @Override
   protected asa<ahh> c() {
      return asd.i.b(asd.ai);
   }

   @Override
   public boolean f_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return aup.a(dhk.a($$1, $$2), 0, 15);
   }

   @Override
   public int b(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$3 == ic.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
