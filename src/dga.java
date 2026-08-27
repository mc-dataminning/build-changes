import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dga extends dfj implements ddy {
   public static final MapCodec<dga> a = b(dga::new);
   public static final dkg c = dkf.C;

   @Override
   protected MapCodec<? extends dga> a() {
      return a;
   }

   protected dga(djo.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(efa.c)));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(c) ? efa.c.a(true) : super.c_($$0);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c);
   }
}
