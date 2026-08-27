import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dev extends daa implements dha {
   public static final MapCodec<dev> a = b(dev::new);
   public static final dnq b = dnp.C;

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   protected dev(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dmz $$0, dmz $$1, ih $$2) {
      return $$1.a(dac.ac) && $$2.o() == ih.a.b;
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eio.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(b) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }
}
