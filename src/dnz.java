import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dnz extends dqs implements dmu {
   public static final MapCodec<dnz> a = b(dnz::new);
   public static final int b = 2;
   public static final ebt c = ebj.au;
   private static final List<Map<jb, ffw>> d = IntStream.rangeClosed(0, 2)
      .mapToObj($$0 -> fft.c(dmr.b((double)(4 + $$0 * 2), (double)(7 - $$0 * 2), 12.0).a(0.0, 0.0, (double)($$0 - 5) / 16.0).d()))
      .toList();

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   public dnz(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jb.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(eat $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      eat $$3 = $$1.a_($$2.a($$0.c(e)));
      return $$3.a(axc.B);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return d.get($$0.c(c)).get($$0.c(e));
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      eat $$1 = this.m();
      djp $$2 = $$0.q();
      iv $$3 = $$0.a();

      for (jb $$4 : $$0.f()) {
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
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4 == $$0.c(e) && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
