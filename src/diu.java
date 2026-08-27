import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diu extends ddy implements dkz {
   public static final MapCodec<diu> a = b(diu::new);
   public static final drs b = drr.C;

   @Override
   public MapCodec<diu> a() {
      return a;
   }

   protected diu(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(drb $$0, drb $$1, it $$2) {
      return $$1.a(dea.ac) && $$2.o() == it.a.b;
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emv.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(b) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }
}
