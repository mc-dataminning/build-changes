import com.mojang.serialization.MapCodec;

public class epj extends epc {
   public static final MapCodec<epj> b = ebq.a.fieldOf("state").xmap(ebp.a::b, dno::m).xmap(epj::new, $$0 -> $$0.c);
   private final dno c;

   public epj(dno $$0) {
      this.c = $$0;
   }

   @Override
   protected epd<?> a() {
      return epd.f;
   }

   @Override
   public ebq a(bai $$0, iw $$1) {
      jc.a $$2 = jc.a.a($$0);
      return this.c.m().c(duh.d, $$2);
   }
}
