import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbe extends cwj implements ddj {
   public static final MapCodec<dbe> a = b(dbe::new);
   public static final djr b = djq.C;

   @Override
   public MapCodec<dbe> a() {
      return a;
   }

   protected dbe(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dja $$0, dja $$1, ic $$2) {
      return $$1.a(cwl.ac) && $$2.o() == ic.a.b;
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      eek $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eel.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(b) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }
}
