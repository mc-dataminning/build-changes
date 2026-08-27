import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfl extends deu implements ddj {
   public static final MapCodec<dfl> a = b(dfl::new);
   public static final djr c = djq.C;

   @Override
   protected MapCodec<? extends dfl> a() {
      return a;
   }

   protected dfl(diz.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      eek $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(eel.c)));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(c) ? eel.c.a(true) : super.c_($$0);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c);
   }
}
