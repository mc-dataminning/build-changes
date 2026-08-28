import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dll extends dli {
   public static final MapCodec<dll> c = b(dll::new);
   public static final eax<ja> d = dqa.e;
   private static final Map<ja, ffc> e = fez.c(dma.b(16.0, 8.0, 5.0, 16.0));

   @Override
   public MapCodec<? extends dll> a() {
      return c;
   }

   protected dll(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(d, ja.c).b(b, Boolean.valueOf(true)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return e.get($$0.c(d));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(d, b);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return $$4.g() == $$0.c(d) && !$$0.a($$1, $$3) ? dmc.a.m() : $$0;
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      ja $$3 = $$0.c(d);
      iu $$4 = $$2.a($$3.g());
      dzz $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = super.a($$0);
      diy $$2 = $$0.q();
      iu $$3 = $$0.a();
      ja[] $$4 = $$0.f();

      for (ja $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.b(d, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
