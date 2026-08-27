import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfr extends dfa implements ddp {
   public static final MapCodec<dfr> a = b(dfr::new);
   public static final djx c = djw.C;

   @Override
   protected MapCodec<? extends dfr> a() {
      return a;
   }

   protected dfr(djf.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(eer.c)));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(c) ? eer.c.a(true) : super.c_($$0);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c);
   }
}
