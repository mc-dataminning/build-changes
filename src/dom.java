import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dom extends drf implements dnh {
   public static final MapCodec<dom> a = b(dom::new);
   public static final int b = 2;
   public static final ecg c = ebw.au;
   private static final List<Map<jc, fgm>> d = IntStream.rangeClosed(0, 2)
      .mapToObj($$0 -> fgj.c(dne.b((double)(4 + $$0 * 2), (double)(7 - $$0 * 2), 12.0).a(0.0, 0.0, (double)($$0 - 5) / 16.0).d()))
      .toList();

   @Override
   public MapCodec<dom> a() {
      return a;
   }

   public dom(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jc.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(ebg $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      ebg $$3 = $$1.a_($$2.a($$0.c(e)));
      return $$3.a(axg.B);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return d.get($$0.c(c)).get($$0.c(e));
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = this.m();
      dkc $$2 = $$0.q();
      iw $$3 = $$0.a();

      for (jc $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.b(e, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4 == $$0.c(e) && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
